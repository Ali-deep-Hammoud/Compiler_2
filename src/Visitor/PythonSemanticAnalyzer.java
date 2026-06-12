package Visitor;

import AST2.Program;
import AST2.SimpleStatement;
import AST2.SmallStatement;
import AST2.Expr;
import AST2.Statement;
import AST2.Alias;
import AST2.small_statement.*;
import AST2.compound_statement.*;
import AST2.Expressions.*;
import AST2.Expressions.Atoms.*;
import Symbol_Table.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PythonSemanticAnalyzer {
    private static final Set<String> BUILTINS = Set.of(
            "print", "len", "range", "list", "dict", "set", "tuple",
            "int", "float", "str", "bool", "open", "max", "min", "sum",
            "next", "enumerate", "zip", "map", "filter", "sorted", "abs",
            "any", "all", "isinstance", "hasattr", "getattr", "setattr",
            "super", "type", "id", "input", "format", "repr", "round",
            "None", "True", "False", "__name__", "__file__", "__doc__"
    );

    private final SymbolTable symbolTable;
    private final List<SemanticError> errors;
    private final String sourceFile;
    private final Deque<Set<String>> globalNamesStack;
    private final Deque<Set<String>> nonLocalNamesStack;
    private final Deque<List<DataType>> returnTypesStack;
    private int loopDepth;

    public PythonSemanticAnalyzer(List<SemanticError> errors) {
        this(errors, "<unknown>");
    }

    public PythonSemanticAnalyzer(List<SemanticError> errors, String sourceFile) {
        this.symbolTable = new SymbolTable();
        this.errors = errors;
        this.sourceFile = sourceFile == null ? "<unknown>" : sourceFile;
        this.globalNamesStack = new ArrayDeque<>();
        this.nonLocalNamesStack = new ArrayDeque<>();
        this.returnTypesStack = new ArrayDeque<>();
        this.loopDepth = 0;
        this.globalNamesStack.push(new HashSet<>());
        this.nonLocalNamesStack.push(new HashSet<>());
    }

    public SymbolTable analyze(Program program) {
        for (Statement statement : program.getStatements()) {
            visitStatement(statement);
        }
        return symbolTable;
    }

    public List<SemanticError> getErrors() {
        return errors;
    }

    private void report(int line, String message) {
        errors.add(new SemanticError(sourceFile, line, 0, message));
    }

    private void visitStatement(Statement statement) {
        if (statement == null) {
            return;
        }

        if (statement instanceof SimpleStatement) {
            visitSimpleStatement((SimpleStatement) statement);
        } else if (statement instanceof DecoratedStatement) {
            visitDecoratedStatement((DecoratedStatement) statement);
        } else if (statement instanceof FunctionStatement) {
            visitFunctionStatement((FunctionStatement) statement);
        } else if (statement instanceof ClassStatement) {
            visitClassStatement((ClassStatement) statement);
        } else if (statement instanceof IfStatement) {
            visitIfStatement((IfStatement) statement);
        } else if (statement instanceof WhileStatement) {
            visitWhileStatement((WhileStatement) statement);
        } else if (statement instanceof ForStatement) {
            visitForStatement((ForStatement) statement);
        } else if (statement instanceof WithStatement) {
            visitWithStatement((WithStatement) statement);
        } else if (statement instanceof TryStatement) {
            visitTryStatement((TryStatement) statement);
        }
    }

    private void visitSimpleStatement(SimpleStatement statement) {
        if (statement == null) {
            return;
        }
        for (SmallStatement small : statement.getStatements()) {
            visitSmallStatement(small);
        }
    }

    private void visitDecoratedStatement(DecoratedStatement statement) {
        if (statement == null) {
            return;
        }
        for (Decorator decorator : statement.getDecorators()) {
            for (Expr arg : decorator.getArgs()) {
                visitExpr(arg);
            }
        }
        if (statement.getFunction() != null) {
            visitFunctionStatement(statement.getFunction());
        } else if (statement.getaClass() != null) {
            visitClassStatement(statement.getaClass());
        }
    }

    private void visitSmallStatement(SmallStatement statement) {
        if (statement == null) {
            return;
        }

        if (statement instanceof Assign) {
            visitAssign((Assign) statement);
        } else if (statement instanceof AugmentedAssign) {
            visitAugmentedAssign((AugmentedAssign) statement);
        } else if (statement instanceof ExprStatement) {
            visitExpr(((ExprStatement) statement).getExpr());
        } else if (statement instanceof GlobalStatement) {
            visitGlobalStatement((GlobalStatement) statement);
        } else if (statement instanceof NonLocalStatement) {
            visitNonLocalStatement((NonLocalStatement) statement);
        } else if (statement instanceof ImportStatement) {
            visitImportStatement((ImportStatement) statement);
        } else if (statement instanceof ImportFromStatement) {
            visitImportFromStatement((ImportFromStatement) statement);
        } else if (statement instanceof DelStatement) {
            visitDelStatement((DelStatement) statement);
        } else if (statement instanceof ReturnStatement) {
            visitReturnStatement((ReturnStatement) statement);
        } else if (statement instanceof AssertStatement) {
            visitExpr(((AssertStatement) statement).getCondition());
        } else if (statement instanceof RaiseStatement) {
            visitExpr(((RaiseStatement) statement).getException());
            visitExpr(((RaiseStatement) statement).getCause());
        } else if (statement instanceof YieldStatement) {
            visitYieldStatement((YieldStatement) statement);
        } else if (statement instanceof BreakStatement) {
            validateLoopContext(statement.getLine(), "'break' outside loop.");
        } else if (statement instanceof ContinueStatement) {
            validateLoopContext(statement.getLine(), "'continue' outside loop.");
        } else if (statement instanceof PassStatement) {
            // no action required
        }
    }

    private void visitReturnStatement(ReturnStatement statement) {
        if (returnTypesStack.isEmpty()) {
            report(statement.getLine(), "'return' outside function.");
            return;
        }
        Expr val = statement.getValue();
        visitExpr(val);
        if (val != null) {
            DataType dt = inferDataType(val);
            returnTypesStack.peek().add(dt == null ? DataType.UNKNOWN : dt);
        }
    }

    private void validateLoopContext(int line, String message) {
        if (loopDepth == 0) {
            report(line, message);
        }
    }

    private void visitAugmentedAssign(AugmentedAssign statement) {
        if (statement == null) {
            return;
        }
        declareAssignmentTarget(statement.getTarget(), statement.getLine(), DataType.ANY);
        visitExpr(statement.getValue());
    }

    private void visitYieldStatement(YieldStatement statement) {
        if (statement == null) {
            return;
        }
        visitExpr(statement.getValue());
    }

    private void visitGlobalStatement(GlobalStatement statement) {
        for (String name : statement.getNames()) {
            globalNamesStack.peek().add(name);
            if (symbolTable.lookupAllScopes(name) == null) {
                SymbolEntry globalEntry = new SymbolEntry(
                        name,
                        DataType.ANY,
                        SymbolKind.VARIABLE,
                        0,
                        0,
                        8,
                        false,
                        AccessModifier.NONE,
                        statement.getLine());
                symbolTable.getGlobalScope().define(globalEntry);
            }
        }
    }

    private void visitNonLocalStatement(NonLocalStatement statement) {
        for (String name : statement.getNames()) {
            nonLocalNamesStack.peek().add(name);
            if (symbolTable.lookupAllScopes(name) == null) {
                report(statement.getLine(), "Nonlocal name '" + name + "' is not defined in an enclosing scope.");
            }
        }
    }

    private void visitImportStatement(ImportStatement statement) {
        for (Alias alias : statement.getNames()) {
            String importedName = alias.getAlias() == null ? alias.getName() : alias.getAlias();
            defineSymbol(importedName, DataType.ANY, SymbolKind.MODULE, statement.getLine(), 8, true, AccessModifier.NONE);
        }
    }

    private void visitImportFromStatement(ImportFromStatement statement) {
        for (Alias alias : statement.getAlias()) {
            String importedName = alias.getAlias() == null ? alias.getName() : alias.getAlias();
            defineSymbol(importedName, DataType.ANY, SymbolKind.MODULE, statement.getLine(), 8, true, AccessModifier.NONE);
        }
    }

    private void visitDelStatement(DelStatement statement) {
        if (statement.getTargets() != null) {
            for (Expr target : statement.getTargets()) {
                String name = extractIdentifierName(target);
                if (name != null) {
                    if (!symbolTable.deleteSymbol(name)) {
                        report(statement.getLine(), "Cannot delete undeclared identifier '" + name + "'.");
                    }
                } else {
                    visitExpr(target);
                }
            }
        }
    }

    private void visitAssign(Assign assign) {
        if (assign == null) {
            return;
        }
        DataType inferred = inferDataType(assign.getValue());
        if (assign.getTargets() != null) {
            for (Expr target : assign.getTargets()) {
                declareAssignmentTarget(target, assign.getLine(), inferred);
            }
        }
        visitExpr(assign.getValue());
    }

    private void declareAssignmentTarget(Expr target, int line, DataType inferredType) {
        String name = extractIdentifierName(target);
        if (name != null) {
            assignToName(name, line, inferredType);
        } else if (target instanceof TupleExpr) {
            for (Expr element : ((TupleExpr) target).getElements()) {
                declareAssignmentTarget(element, line, inferredType);
            }
        } else {
            visitExpr(target);
        }
    }

    private void assignToName(String name, int line, DataType inferredType) {
        DataType type = inferredType == null ? DataType.ANY : inferredType;
        if (globalNamesStack.peek().contains(name)) {
            defineSymbol(name, type, SymbolKind.VARIABLE, line, 8, true, AccessModifier.NONE, symbolTable.getGlobalScope());
        } else if (nonLocalNamesStack.peek().contains(name)) {
            SymbolEntry symbol = symbolTable.lookupAllScopes(name);
            if (symbol == null) {
                report(line, "Nonlocal identifier '" + name + "' is not bound in an enclosing scope.");
            } else {
                symbol.setInitialized(true);
            }
        } else {
            SymbolEntry existing = symbolTable.lookupCurrentScope(name);
            if (existing != null) {
                existing.setInitialized(true);
                if (inferredType != null && existing.getDataType() == DataType.UNKNOWN) {
                    existing.setDataType(inferredType);
                }
            } else {
                defineSymbol(name, type, SymbolKind.VARIABLE, line, 8, true, AccessModifier.NONE);
            }
        }
    }

    private void visitFunctionStatement(FunctionStatement statement) {
        defineSymbol(statement.getName(), DataType.ANY, SymbolKind.FUNCTION, statement.getLine(), 0, true, AccessModifier.PUBLIC);
        SymbolEntry funcEntry = symbolTable.lookupCurrentScope(statement.getName());
        int paramCount = statement.getParameters() == null ? 0 : statement.getParameters().size();
        if (funcEntry != null) {
            funcEntry.setParamCount(paramCount);
        }

        enterAnalyzerScope("function(" + statement.getName() + ")");
        returnTypesStack.push(new ArrayList<>());
        for (Parameter parameter : statement.getParameters()) {
            if (parameter instanceof NormalParameter) {
                String name = ((NormalParameter) parameter).getName();
                defineSymbol(name, DataType.ANY, SymbolKind.PARAMETER, parameter.getLine(), 8, true, AccessModifier.NONE);
                visitExpr(((NormalParameter) parameter).getDefaultValue());
            } else if (parameter instanceof StarParameter) {
                String name = ((StarParameter) parameter).getName();
                defineSymbol(name, DataType.ANY, SymbolKind.PARAMETER, parameter.getLine(), 8, true, AccessModifier.NONE);
            } else if (parameter instanceof DoubleStarParameter) {
                String name = ((DoubleStarParameter) parameter).getName();
                defineSymbol(name, DataType.ANY, SymbolKind.PARAMETER, parameter.getLine(), 8, true, AccessModifier.NONE);
            }
        }
        visitBody(statement.getBody());

        List<DataType> returns = returnTypesStack.pop();
        DataType inferredReturn = mergeReturnTypes(returns);
        if (funcEntry != null && inferredReturn != DataType.UNKNOWN) {
            funcEntry.setDataType(inferredReturn);
        }
        if (hasConflictingReturnTypes(returns)) {
            report(statement.getLine(), "Conflicting return types in function '" + statement.getName() + "'.");
        }
        exitAnalyzerScope();
    }

    private DataType mergeReturnTypes(List<DataType> returns) {
        DataType inferredReturn = DataType.UNKNOWN;
        for (DataType dt : returns) {
            if (dt == null || dt == DataType.UNKNOWN || dt == DataType.ANY) {
                continue;
            }
            if (inferredReturn == DataType.UNKNOWN) {
                inferredReturn = dt;
            }
        }
        return inferredReturn;
    }

    private boolean hasConflictingReturnTypes(List<DataType> returns) {
        DataType known = DataType.UNKNOWN;
        for (DataType dt : returns) {
            if (dt == null || dt == DataType.UNKNOWN || dt == DataType.ANY) {
                continue;
            }
            if (known == DataType.UNKNOWN) {
                known = dt;
            } else if (!dt.equals(known)) {
                return true;
            }
        }
        return false;
    }

    private void visitClassStatement(ClassStatement statement) {
        defineSymbol(statement.getName(), DataType.ANY, SymbolKind.CLASS, statement.getLine(), 0, true, AccessModifier.PUBLIC);
        enterAnalyzerScope("class(" + statement.getName() + ")");
        for (Expr base : statement.getBase()) {
            visitExpr(base);
        }
        visitBody(statement.getBody());
        exitAnalyzerScope();
    }

    private void visitIfStatement(IfStatement statement) {
        visitExpr(statement.getCondition());
        enterAnalyzerScope("if-block");
        visitBody(statement.getIfBody());
        exitAnalyzerScope();
        for (ElifStatement elif : statement.getElifStatements()) {
            visitExpr(elif.getCondition());
            enterAnalyzerScope("elif-block");
            visitBody(elif.getBody());
            exitAnalyzerScope();
        }
        if (statement.getElseBody() != null) {
            enterAnalyzerScope("else-block");
            visitBody(statement.getElseBody());
            exitAnalyzerScope();
        }
    }

    private void visitWhileStatement(WhileStatement statement) {
        visitExpr(statement.getCondition());
        loopDepth++;
        enterAnalyzerScope("while-block");
        visitBody(statement.getWhileBody());
        exitAnalyzerScope();
        loopDepth--;
        if (statement.getElseBody() != null) {
            enterAnalyzerScope("while-else-block");
            visitBody(statement.getElseBody());
            exitAnalyzerScope();
        }
    }

    private void visitForStatement(ForStatement statement) {
        visitExpr(statement.getIterator());
        loopDepth++;
        enterAnalyzerScope("for-block");
        declareAssignmentTarget(statement.getTarget(), statement.getLine(), DataType.ANY);
        visitBody(statement.getForBody());
        exitAnalyzerScope();
        loopDepth--;
        if (statement.getElseBody() != null) {
            enterAnalyzerScope("for-else-block");
            visitBody(statement.getElseBody());
            exitAnalyzerScope();
        }
    }

    private void visitWithStatement(WithStatement statement) {
        for (WithItem item : statement.getItems()) {
            visitExpr(item.getContext());
            if (item.getTarget() != null) {
                declareAssignmentTarget(item.getTarget(), item.getLine(), DataType.ANY);
            }
        }
        enterAnalyzerScope("with-block");
        visitBody(statement.getBody());
        exitAnalyzerScope();
    }

    private void visitTryStatement(TryStatement statement) {
        visitBody(statement.getForBody());
        for (ExceptStatement except : statement.getExcepts()) {
            enterAnalyzerScope("except-block");
            if (except.getName() != null) {
                defineSymbol(except.getName(), DataType.ANY, SymbolKind.VARIABLE, except.getLine(), 8, true, AccessModifier.NONE);
            }
            if (except.getType() != null) {
                visitExpr(except.getType());
            }
            visitBody(except.getBody());
            exitAnalyzerScope();
        }
        if (statement.getElseBody() != null) {
            enterAnalyzerScope("try-else-block");
            visitBody(statement.getElseBody());
            exitAnalyzerScope();
        }
        if (statement.getFinallyBody() != null) {
            enterAnalyzerScope("finally-block");
            visitBody(statement.getFinallyBody());
            exitAnalyzerScope();
        }
    }

    private void visitBody(Body body) {
        if (body == null) {
            return;
        }
        for (Statement statement : body.getStatements()) {
            visitStatement(statement);
        }
    }

    private void visitExpr(Expr expr) {
        if (expr == null) {
            return;
        }
        if (expr instanceof NameExpr) {
            ensureSymbolExists(((NameExpr) expr).getName(), expr.getLine());
        } else if (expr instanceof NameAtom) {
            ensureSymbolExists(((NameAtom) expr).getName(), expr.getLine());
        } else if (expr instanceof CallExpr) {
            visitCallExpr((CallExpr) expr);
        } else if (expr instanceof AttributeExpr) {
            visitExpr(((AttributeExpr) expr).getTarget());
        } else if (expr instanceof TupleExpr) {
            for (Expr element : ((TupleExpr) expr).getElements()) {
                visitExpr(element);
            }
        } else if (expr instanceof CompForExpr) {
            visitCompForExpr((CompForExpr) expr);
        } else if (expr instanceof CompIfExpr) {
            visitCompIfExpr((CompIfExpr) expr);
        } else if (expr instanceof ArgumentEqual) {
            visitExpr(((ArgumentEqual) expr).getValue());
        } else if (expr instanceof ArgumentComp) {
            ArgumentComp arg = (ArgumentComp) expr;
            visitExpr(arg.getExpr());
            if (arg.getComp() != null) {
                visitCompForExpr(arg.getComp());
            }
        } else if (expr instanceof LambdaExpr) {
            enterAnalyzerScope("lambda");
            for (Variable variable : ((LambdaExpr) expr).getVariables()) {
                if (variable instanceof AST2.Expressions.NormalVariable) {
                    defineSymbol(((AST2.Expressions.NormalVariable) variable).getName(), DataType.ANY, SymbolKind.PARAMETER, variable.getLine(), 8, true, AccessModifier.NONE);
                }
            }
            visitExpr(((LambdaExpr) expr).getBody());
            exitAnalyzerScope();
        } else {
            tryReflectiveTraversal(expr);
        }
    }

    private void visitCallExpr(CallExpr call) {
        visitExpr(call.getCallee());
        for (Expr arg : call.getArgs()) {
            visitExpr(arg);
        }

        String calleeName = extractIdentifierName(call.getCallee());
        if (calleeName == null) {
            return;
        }

        SymbolEntry entry = symbolTable.lookupAllScopes(calleeName);
        if (entry == null && !isBuiltinName(calleeName)) {
            report(call.getLine(), "Call to undefined function '" + calleeName + "'.");
            return;
        }
        if (entry != null && entry.getKind() == SymbolKind.FUNCTION) {
            int expected = entry.getParamCount();
            int provided = countPositionalArguments(call.getArgs());
            if (expected >= 0 && provided > expected) {
                report(call.getLine(),
                        "Function '" + calleeName + "' called with wrong arity: expected at most " + expected + " got " + provided + ".");
            }
        }
    }

    private int countPositionalArguments(List<Expr> args) {
        if (args == null) {
            return 0;
        }
        int count = 0;
        for (Expr arg : args) {
            if (arg instanceof ArgumentEqual || arg instanceof ArgumentStar) {
                break;
            }
            count++;
        }
        return count;
    }

    private void visitCompForExpr(CompForExpr comp) {
        enterAnalyzerScope("comprehension");
        declareAssignmentTarget(comp.getTargets(), comp.getLine(), DataType.ANY);
        visitExpr(comp.getIterable());
        visitCompIter(comp.getLoop());
        exitAnalyzerScope();
    }

    private void visitCompIfExpr(CompIfExpr comp) {
        visitExpr(comp.getExpr());
        visitCompIter(comp.getLoop());
    }

    private void visitCompIter(Expr loop) {
        if (loop == null) {
            return;
        }
        if (loop instanceof CompForExpr) {
            visitCompForExpr((CompForExpr) loop);
        } else if (loop instanceof CompIfExpr) {
            visitCompIfExpr((CompIfExpr) loop);
        } else {
            visitExpr(loop);
        }
    }

    private void ensureSymbolExists(String name, int line) {
        if (name == null) {
            return;
        }
        SymbolEntry existing = symbolTable.lookupAllScopes(name);
        if (existing == null && !isBuiltinName(name)) {
            report(line, "Undeclared identifier '" + name + "'.");
        }
    }

    private String extractIdentifierName(Expr expr) {
        if (expr instanceof NameExpr) {
            return ((NameExpr) expr).getName();
        }
        if (expr instanceof NameAtom) {
            return ((NameAtom) expr).getName();
        }
        return null;
    }

    private void enterAnalyzerScope(String scopeName) {
        symbolTable.enterScope(scopeName);
        globalNamesStack.push(new HashSet<>());
        nonLocalNamesStack.push(new HashSet<>());
    }

    private void exitAnalyzerScope() {
        symbolTable.exitScope();
        if (!globalNamesStack.isEmpty()) {
            globalNamesStack.pop();
        }
        if (!nonLocalNamesStack.isEmpty()) {
            nonLocalNamesStack.pop();
        }
    }

    private DataType inferDataType(Expr expr) {
        if (expr == null) {
            return DataType.UNKNOWN;
        }
        if (expr instanceof NumberAtom) {
            String s = ((NumberAtom) expr).getName();
            if (s.contains(".") || s.toLowerCase().contains("e")) {
                return DataType.FLOAT;
            }
            return DataType.INT;
        }
        if (expr instanceof StringAtom) {
            return DataType.STRING;
        }
        if (expr instanceof BooleanAtom) {
            return DataType.BOOL;
        }
        if (expr instanceof ListAtom) {
            return DataType.LIST;
        }
        if (expr instanceof DictAtom) {
            return DataType.DICT;
        }
        if (expr instanceof NameExpr || expr instanceof NameAtom) {
            String name = extractIdentifierName(expr);
            SymbolEntry e = symbolTable.lookupAllScopes(name);
            return e == null ? DataType.UNKNOWN : e.getDataType();
        }
        if (expr instanceof CallExpr) {
            String calleeName = extractIdentifierName(((CallExpr) expr).getCallee());
            if (calleeName != null) {
                SymbolEntry e = symbolTable.lookupAllScopes(calleeName);
                return e == null ? DataType.UNKNOWN : e.getDataType();
            }
        }
        return DataType.UNKNOWN;
    }

    private boolean isBuiltinName(String name) {
        return BUILTINS.contains(name);
    }

    private void defineSymbol(String identifier,
                              DataType type,
                              SymbolKind kind,
                              int line,
                              int size,
                              boolean initialized,
                              AccessModifier accessModifier) {
        if (symbolTable.lookupCurrentScope(identifier) != null) {
            report(line, "Duplicate declaration of '" + identifier + "' in the same scope.");
            return;
        }
        SymbolEntry entry = new SymbolEntry(
                identifier,
                type,
                kind,
                symbolTable.getCurrentScopeLevel(),
                0,
                size,
                initialized,
                accessModifier,
                line);
        boolean inserted = symbolTable.insertSymbol(entry);
        if (!inserted) {
            report(line, "Failed to insert symbol '" + identifier + "'.");
        }
    }

    private void defineSymbol(String identifier,
                              DataType type,
                              SymbolKind kind,
                              int line,
                              int size,
                              boolean initialized,
                              AccessModifier accessModifier,
                              Scope targetScope) {
        if (targetScope == null) {
            defineSymbol(identifier, type, kind, line, size, initialized, accessModifier);
            return;
        }
        if (targetScope.contains(identifier)) {
            report(line, "Duplicate declaration of '" + identifier + "' in target scope.");
            return;
        }
        SymbolEntry entry = new SymbolEntry(
                identifier,
                type,
                kind,
                targetScope.getLevel(),
                targetScope.allocateOffset(size),
                size,
                initialized,
                accessModifier,
                line);
        targetScope.define(entry);
    }

    private void tryReflectiveTraversal(Expr expr) {
        try {
            var fields = expr.getClass().getDeclaredFields();
            for (var field : fields) {
                field.setAccessible(true);
                Object value = field.get(expr);
                if (value instanceof Expr) {
                    visitExpr((Expr) value);
                } else if (value instanceof List<?> list) {
                    for (Object element : list) {
                        if (element instanceof Expr childExpr) {
                            visitExpr(childExpr);
                        }
                    }
                }
            }
        } catch (IllegalAccessException ignored) {
            // ignore reflective traversal failures for unsupported nodes
        }
    }
}
