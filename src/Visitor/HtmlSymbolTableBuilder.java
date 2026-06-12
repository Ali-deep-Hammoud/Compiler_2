package Visitor;

import AST.*;
import Symbol_Table.AttributeSymbol;
import Symbol_Table.HtmlSymbolTable;
import Symbol_Table.IdSymbol;
import Symbol_Table.SemanticError;
import Symbol_Table.TagSymbol;

import java.util.ArrayList;
import java.util.List;

public class HtmlSymbolTableBuilder {
    private final HtmlSymbolTable table = new HtmlSymbolTable();
    private final List<SemanticError> errors = new ArrayList<>();
    private String sourceFile = "<unknown>";

    public HtmlSymbolTable build(Program program) {
        return build(program, "<unknown>");
    }

    public HtmlSymbolTable build(Program program, String sourceFile) {
        this.sourceFile = sourceFile == null ? "<unknown>" : sourceFile;
        for (BodyNode node : program.getBodyNodes()) {
            visit(node);
        }
        return table;
    }

    public List<SemanticError> getErrors() {
        return errors;
    }

    public void visit(BodyNode node) {
        if (node instanceof HTMLElement) {
            visitElement((HTMLElement) node);
        } else if (node instanceof HTMLSingleElement) {
            visitSingle((HTMLSingleElement) node);
        } else if (node instanceof Text) {
            // plain text — no symbols
        } else if (node instanceof JinjaExpression) {
            visitJinja((JinjaExpression) node);
        } else if (node instanceof JinjaIf) {
            visitJinjaIf((JinjaIf) node);
        } else if (node instanceof JinjaFor) {
            visitJinjaFor((JinjaFor) node);
        } else if (node instanceof JinjaBlock) {
            visitJinjaBlock((JinjaBlock) node);
        } else if (node instanceof JinjaInheritance) {
            visitJinjaInheritance((JinjaInheritance) node);
        } else if (node instanceof CSSBody) {
            visitStyleBody((CSSBody) node);
        } else if (node instanceof JinjaStatement) {
            // statement blocks handled via parent traversal
        }
    }

    private void visitElement(HTMLElement element) {
        TagSymbol tag = new TagSymbol(element.getTag(), element.line);
        table.addTag(tag);

        for (Attribute attr : element.getAttributes()) {
            handleAttribute(tag, attr);
        }

        for (BodyNode child : element.getChildren()) {
            visit(child);
        }
    }

    private void visitSingle(HTMLSingleElement element) {
        TagSymbol tag = new TagSymbol(element.getTag(), element.line);
        table.addTag(tag);

        for (Attribute attr : element.getAttributes()) {
            handleAttribute(tag, attr);
        }
    }

    private void handleAttribute(TagSymbol tag, Attribute attr) {
        String name = attr.getName();
        AttributeValue av = attr.getValue();
        String value = "";
        if (av != null) {
            if (av instanceof AttributeString) {
                value = ((AttributeString) av).getValue();
            } else if (av instanceof AttributeJinja) {
                visitJinja(((AttributeJinja) av).getText());
                value = "{{...}}";
            } else {
                value = av.toString();
            }
        }

        table.addAttribute(new AttributeSymbol(name, value, attr.line));
        tag.attributes.put(name, value);

        if (name.equals("id") && !value.isBlank()) {
            reportId(new IdSymbol(value, tag.tagName, attr.line));
        }

        if (name.equals("class") && !value.isBlank()) {
            for (String cls : value.split("\\s+")) {
                if (!cls.isBlank()) {
                    table.addClass(cls.trim(), tag);
                }
            }
        }
    }

    private void reportId(IdSymbol id) {
        if (table.ids.containsKey(id.name)) {
            errors.add(new SemanticError(sourceFile, id.line, 0,
                    "Duplicate HTML id '" + id.name + "'."));
        }
        table.addId(id);
    }

    private void visitJinja(JinjaExpression expr) {
        if (expr == null) {
            return;
        }
        for (JinjaExpr je : expr.getText()) {
            collectJinjaReferences(je);
        }
    }

    private void collectJinjaReferences(JinjaExpr je) {
        if (je instanceof JinjaText) {
            table.addJinjaVariable(((JinjaText) je).getText(), je.line);
        } else if (je instanceof JinjaFunction) {
            JinjaFunction fn = (JinjaFunction) je;
            for (JinjaExpr arg : fn.getArguments()) {
                collectJinjaReferences(arg);
            }
        } else if (je instanceof JinjaAssign) {
            collectJinjaReferences(((JinjaAssign) je).getValue());
        }
    }

    private void visitJinjaIf(JinjaIf jinjaIf) {
        if (jinjaIf == null) {
            return;
        }
        collectConditionVariables(jinjaIf.getCondition());
        if (jinjaIf.getIfBody() != null) {
            visit(jinjaIf.getIfBody());
        }
        for (JinjaElif elif : jinjaIf.getElifs()) {
            collectConditionVariables(elif.getCondition());
            if (elif.getBody() != null) {
                visit(elif.getBody());
            }
        }
        if (jinjaIf.getElseBody() != null) {
            visit(jinjaIf.getElseBody());
        }
    }

    private void collectConditionVariables(Condition condition) {
        if (condition == null) {
            return;
        }
        if (condition instanceof VariableCondition) {
            table.addJinjaVariable(((VariableCondition) condition).getVariable(), condition.line);
        } else if (condition instanceof CompareCondition) {
            CompareCondition cmp = (CompareCondition) condition;
            addJinjaVarIfIdentifier(cmp.getLeftValue(), cmp.line);
            addJinjaVarIfIdentifier(cmp.getRightValue(), cmp.line);
        } else if (condition instanceof LogicCondition) {
            LogicCondition logic = (LogicCondition) condition;
            collectConditionVariables(logic.getLeft());
            collectConditionVariables(logic.getRight());
        } else if (condition instanceof NotCondition) {
            collectConditionVariables(((NotCondition) condition).getCondition());
        }
    }

    private void visitJinjaFor(JinjaFor jinjaFor) {
        if (jinjaFor == null) {
            return;
        }
        if (jinjaFor.getCollectionName() != null) {
            table.addJinjaVariable(jinjaFor.getCollectionName().getText(), jinjaFor.line);
        }
        if (jinjaFor.getFilterCondition() != null) {
            collectConditionVariables(jinjaFor.getFilterCondition());
        }
        if (jinjaFor.getBody() != null) {
            visit(jinjaFor.getBody());
        }
        if (jinjaFor.getElseBody() != null) {
            visit(jinjaFor.getElseBody());
        }
    }

    private void visitStyleBody(CSSBody cssBody) {
        if (cssBody == null) {
            return;
        }
        for (CSSRule rule : cssBody.getCssRules()) {
            TagSymbol ruleTag = new TagSymbol("css-rule:" + rule.line, rule.line);
            table.addTag(ruleTag);
            for (CSSSelector selector : rule.getSelectors()) {
                if (selector instanceof CSSClassSelector) {
                    table.addClass(((CSSClassSelector) selector).getName(), ruleTag);
                } else if (selector instanceof CSSIDSelector) {
                    reportId(new IdSymbol(((CSSIDSelector) selector).getName(), ruleTag.tagName, selector.line));
                } else if (selector instanceof CSSNormalSelector) {
                    TagSymbol nt = new TagSymbol(((CSSNormalSelector) selector).getName(), selector.line);
                    table.addTag(nt);
                } else if (selector instanceof CSSAllSelector) {
                    table.addClass("*", ruleTag);
                }
            }
        }
    }

    private void visitJinjaBlock(JinjaBlock block) {
        for (BodyNode body : block.getBodys()) {
            visit(body);
        }
    }

    private void addJinjaVarIfIdentifier(String value, int line) {
        if (value != null && value.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
            table.addJinjaVariable(value, line);
        }
    }

    private void visitJinjaInheritance(JinjaInheritance inheritance) {
        for (JinjaBlock block : inheritance.getBlocks()) {
            visitJinjaBlock(block);
        }
        for (BodyNode body : inheritance.getBodys()) {
            visit(body);
        }
    }
}
