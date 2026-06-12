package Visitor;

import AST.*;
import Symbol_Table.SemanticError;
import Symbol_Table.SymbolEntry;
import Symbol_Table.SymbolTable;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Cross-language semantic pass: validates Jinja variable references against the Python symbol table.
 */
public class JinjaPythonResolver {
    private final SymbolTable pythonSymbols;
    private final List<SemanticError> errors;
    private final String sourceFile;
    private final Set<String> reported = new HashSet<>();

    public JinjaPythonResolver(SymbolTable pythonSymbols, List<SemanticError> errors) {
        this(pythonSymbols, errors, "<unknown>");
    }

    public JinjaPythonResolver(SymbolTable pythonSymbols, List<SemanticError> errors, String sourceFile) {
        this.pythonSymbols = pythonSymbols;
        this.errors = errors;
        this.sourceFile = sourceFile == null ? "<unknown>" : sourceFile;
    }

    public void resolve(Program htmlProgram) {
        if (htmlProgram == null) {
            return;
        }
        for (BodyNode node : htmlProgram.getBodyNodes()) {
            visit(node);
        }
    }

    private void visit(BodyNode node) {
        if (node == null) {
            return;
        }
        if (node instanceof JinjaExpression) {
            visitJinjaExpr((JinjaExpression) node);
        } else if (node instanceof HTMLElement) {
            HTMLElement el = (HTMLElement) node;
            for (Attribute a : el.getAttributes()) {
                if (a.getValue() instanceof AttributeJinja) {
                    visitJinjaExpr(((AttributeJinja) a.getValue()).getText());
                }
            }
            for (BodyNode c : el.getChildren()) {
                visit(c);
            }
        } else if (node instanceof HTMLSingleElement) {
            HTMLSingleElement sel = (HTMLSingleElement) node;
            for (Attribute a : sel.getAttributes()) {
                if (a.getValue() instanceof AttributeJinja) {
                    visitJinjaExpr(((AttributeJinja) a.getValue()).getText());
                }
            }
        } else if (node instanceof JinjaBlock) {
            for (BodyNode b : ((JinjaBlock) node).getBodys()) {
                visit(b);
            }
        } else if (node instanceof JinjaIf) {
            JinjaIf jf = (JinjaIf) node;
            collectConditionRefs(jf.getCondition());
            if (jf.getIfBody() != null) {
                visit(jf.getIfBody());
            }
            for (JinjaElif elif : jf.getElifs()) {
                collectConditionRefs(elif.getCondition());
                if (elif.getBody() != null) {
                    visit(elif.getBody());
                }
            }
            if (jf.getElseBody() != null) {
                visit(jf.getElseBody());
            }
        } else if (node instanceof JinjaFor) {
            JinjaFor jf = (JinjaFor) node;
            if (jf.getCollectionName() != null) {
                checkName(jf.getCollectionName().getText(), jf.line);
            }
            collectConditionRefs(jf.getFilterCondition());
            if (jf.getBody() != null) {
                visit(jf.getBody());
            }
            if (jf.getElseBody() != null) {
                visit(jf.getElseBody());
            }
        } else if (node instanceof JinjaInheritance) {
            for (JinjaBlock b : ((JinjaInheritance) node).getBlocks()) {
                for (BodyNode n : b.getBodys()) {
                    visit(n);
                }
            }
            for (BodyNode b : ((JinjaInheritance) node).getBodys()) {
                visit(b);
            }
        } else if (node instanceof CSSBody) {
            for (CSSRule rule : ((CSSBody) node).getCssRules()) {
                // CSS has no Python refs
            }
        }
    }

    private void collectConditionRefs(Condition condition) {
        if (condition == null) {
            return;
        }
        if (condition instanceof VariableCondition) {
            checkName(((VariableCondition) condition).getVariable(), condition.line);
        } else if (condition instanceof CompareCondition) {
            CompareCondition cmp = (CompareCondition) condition;
            checkNameIfIdentifier(cmp.getLeftValue(), cmp.line);
            checkNameIfIdentifier(cmp.getRightValue(), cmp.line);
        } else if (condition instanceof LogicCondition) {
            LogicCondition logic = (LogicCondition) condition;
            collectConditionRefs(logic.getLeft());
            collectConditionRefs(logic.getRight());
        } else if (condition instanceof NotCondition) {
            collectConditionRefs(((NotCondition) condition).getCondition());
        }
    }

    private void visitJinjaExpr(JinjaExpression expr) {
        if (expr == null) {
            return;
        }
        for (JinjaExpr je : expr.getText()) {
            collectJinjaRefs(je);
        }
    }

    private void collectJinjaRefs(JinjaExpr je) {
        if (je instanceof JinjaText) {
            checkName(((JinjaText) je).getText(), je.line);
        } else if (je instanceof JinjaFunction) {
            for (JinjaExpr arg : ((JinjaFunction) je).getArguments()) {
                collectJinjaRefs(arg);
            }
        } else if (je instanceof JinjaAssign) {
            collectJinjaRefs(((JinjaAssign) je).getValue());
        }
    }

    private void checkNameIfIdentifier(String name, int line) {
        if (name != null && name.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
            checkName(name, line);
        }
    }

    private void checkName(String name, int line) {
        if (name == null || name.isBlank()) {
            return;
        }
        String key = name + "@" + line;
        if (reported.contains(key)) {
            return;
        }
        SymbolEntry se = pythonSymbols.lookupAllScopes(name);
        if (se == null && !isBuiltin(name)) {
            reported.add(key);
            errors.add(new SemanticError(sourceFile, line, 0,
                    "Jinja variable '" + name + "' not found in Python symbol table."));
        }
    }

    private boolean isBuiltin(String name) {
        return switch (name) {
            case "true", "false", "none", "loop", "super", "self" -> true;
            default -> false;
        };
    }
}
