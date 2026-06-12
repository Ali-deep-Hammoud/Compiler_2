package CodeGen;

import AST2.Expr;
import AST2.Program;
import AST2.SimpleStatement;
import AST2.SmallStatement;
import AST2.Statement;
import AST2.compound_statement.*;
import AST2.small_statement.*;
import AST2.Expressions.*;
import AST2.Expressions.Atoms.*;
import IR.IRInstruction;
import IR.IRProgram;
import IR.OpCode;
import Symbol_Table.SymbolTable;

/**
 * Generates three-address intermediate code from the Python AST.
 */
public class PythonIRGenerator {
    private IRProgram ir;
    private SymbolTable symbols;

    public IRProgram generate(Program program, SymbolTable symbolTable) {
        this.ir = new IRProgram("python");
        this.symbols = symbolTable;
        if (program == null) {
            return ir;
        }
        for (Statement stmt : program.getStatements()) {
            emitStatement(stmt);
        }
        return ir;
    }

    private void emitStatement(Statement statement) {
        if (statement == null) {
            return;
        }
        if (statement instanceof SimpleStatement) {
            for (SmallStatement small : ((SimpleStatement) statement).getStatements()) {
                emitSmallStatement(small);
            }
        } else if (statement instanceof FunctionStatement) {
            emitFunction((FunctionStatement) statement);
        } else if (statement instanceof DecoratedStatement) {
            DecoratedStatement dec = (DecoratedStatement) statement;
            if (dec.getFunction() != null) {
                emitFunction(dec.getFunction());
            }
        } else if (statement instanceof IfStatement) {
            emitIf((IfStatement) statement);
        } else if (statement instanceof WhileStatement) {
            emitWhile((WhileStatement) statement);
        } else if (statement instanceof ForStatement) {
            emitFor((ForStatement) statement);
        } else if (statement instanceof ClassStatement) {
            ir.emit(IRInstruction.of(OpCode.COMMENT, "class " + ((ClassStatement) statement).getName(), statement.getLine()));
            emitBody(((ClassStatement) statement).getBody());
        }
    }

    private void emitSmallStatement(SmallStatement statement) {
        if (statement instanceof Assign) {
            Assign assign = (Assign) statement;
            String value = emitExpr(assign.getValue());
            if (assign.getTargets() != null) {
                for (Expr target : assign.getTargets()) {
                    String name = extractName(target);
                    if (name != null) {
                        ir.emit(IRInstruction.of(OpCode.STORE_VAR, name, value, "", assign.getLine()));
                    }
                }
            }
        } else if (statement instanceof ExprStatement) {
            emitExpr(((ExprStatement) statement).getExpr());
        } else if (statement instanceof ReturnStatement) {
            String val = emitExpr(((ReturnStatement) statement).getValue());
            ir.emit(IRInstruction.of(OpCode.RETURN, val, statement.getLine()));
        } else if (statement instanceof ImportStatement) {
            for (var alias : ((ImportStatement) statement).getNames()) {
                String n = alias.getAlias() == null ? alias.getName() : alias.getAlias();
                ir.emit(IRInstruction.of(OpCode.COMMENT, "import " + n, statement.getLine()));
            }
        } else if (statement instanceof ImportFromStatement) {
            ImportFromStatement imp = (ImportFromStatement) statement;
            ir.emit(IRInstruction.of(OpCode.COMMENT, "from " + imp.getModule() + " import ...", statement.getLine()));
        }
    }

    private void emitFunction(FunctionStatement fn) {
        ir.emit(IRInstruction.of(OpCode.FUNC_BEGIN, fn.getName(), fn.getLine()));
        ir.emit(IRInstruction.of(OpCode.LABEL, "func_" + fn.getName(), fn.getLine()));
        emitBody(fn.getBody());
        ir.emit(IRInstruction.of(OpCode.FUNC_END, fn.getName(), fn.getLine()));
    }

    private void emitIf(IfStatement stmt) {
        String cond = emitExpr(stmt.getCondition());
        String elseLabel = ir.freshTemp() + "_else";
        String endLabel = ir.freshTemp() + "_endif";
        ir.emit(IRInstruction.of(OpCode.IF_FALSE_GOTO, cond, elseLabel, "", stmt.getLine()));
        emitBody(stmt.getIfBody());
        ir.emit(IRInstruction.of(OpCode.GOTO, endLabel, stmt.getLine()));
        ir.emit(IRInstruction.of(OpCode.LABEL, elseLabel, stmt.getLine()));
        if (stmt.getElseBody() != null) {
            emitBody(stmt.getElseBody());
        }
        ir.emit(IRInstruction.of(OpCode.LABEL, endLabel, stmt.getLine()));
    }

    private void emitWhile(WhileStatement stmt) {
        String start = ir.freshTemp() + "_while";
        String end = ir.freshTemp() + "_wend";
        ir.emit(IRInstruction.of(OpCode.LABEL, start, stmt.getLine()));
        String cond = emitExpr(stmt.getCondition());
        ir.emit(IRInstruction.of(OpCode.IF_FALSE_GOTO, cond, end, "", stmt.getLine()));
        emitBody(stmt.getWhileBody());
        ir.emit(IRInstruction.of(OpCode.GOTO, start, stmt.getLine()));
        ir.emit(IRInstruction.of(OpCode.LABEL, end, stmt.getLine()));
    }

    private void emitFor(ForStatement stmt) {
        String iter = emitExpr(stmt.getIterator());
        String loopVar = extractName(stmt.getTarget());
        ir.emit(IRInstruction.of(OpCode.COMMENT, "for " + loopVar + " in " + iter, stmt.getLine()));
        emitBody(stmt.getForBody());
    }

    private void emitBody(Body body) {
        if (body == null) {
            return;
        }
        for (Statement stmt : body.getStatements()) {
            emitStatement(stmt);
        }
    }

    private String emitExpr(Expr expr) {
        if (expr == null) {
            return "";
        }
        if (expr instanceof NameAtom) {
            String name = ((NameAtom) expr).getName();
            String temp = ir.freshTemp();
            ir.emit(IRInstruction.of(OpCode.LOAD_VAR, name, "", temp, expr.getLine()));
            return temp;
        }
        if (expr instanceof NumberAtom) {
            String temp = ir.freshTemp();
            ir.emit(IRInstruction.of(OpCode.LOAD_CONST, ((NumberAtom) expr).getName(), "", temp, expr.getLine()));
            return temp;
        }
        if (expr instanceof StringAtom) {
            String temp = ir.freshTemp();
            String text = String.join("", ((StringAtom) expr).getStrings());
            ir.emit(IRInstruction.of(OpCode.LOAD_CONST, "\"" + text + "\"", "", temp, expr.getLine()));
            return temp;
        }
        if (expr instanceof BooleanAtom) {
            String temp = ir.freshTemp();
            ir.emit(IRInstruction.of(OpCode.LOAD_CONST, String.valueOf(((BooleanAtom) expr).getValue()), "", temp, expr.getLine()));
            return temp;
        }
        if (expr instanceof CallExpr) {
            CallExpr call = (CallExpr) expr;
            String callee = extractName(call.getCallee());
            if (callee == null) {
                callee = "<?>";
            }
            StringBuilder args = new StringBuilder();
            if (call.getArgs() != null) {
                for (int i = 0; i < call.getArgs().size(); i++) {
                    if (i > 0) {
                        args.append(", ");
                    }
                    args.append(emitExpr(call.getArgs().get(i)));
                }
            }
            String temp = ir.freshTemp();
            ir.emit(IRInstruction.of(OpCode.CALL, callee, args.toString(), temp, expr.getLine()));
            return temp;
        }
        if (expr instanceof AdditionExpr) {
            return emitBinary((AdditionExpr) expr, "+");
        }
        if (expr instanceof SubtractionExpr) {
            return emitBinary((SubtractionExpr) expr, "-");
        }
        if (expr instanceof MultiplyExpr) {
            return emitBinary((MultiplyExpr) expr, "*");
        }
        if (expr instanceof DivideExpr) {
            return emitBinary((DivideExpr) expr, "/");
        }
        if (expr instanceof ComparisonExpr) {
            ComparisonExpr cmp = (ComparisonExpr) expr;
            String left = emitExpr(cmp.getLeft());
            String right = emitExpr(cmp.getRight());
            String temp = ir.freshTemp();
            ir.emit(IRInstruction.of(OpCode.BINOP, left, cmp.getOp() + ":" + right, temp, expr.getLine()));
            return temp;
        }
        if (expr instanceof AttributeExpr) {
            String base = emitExpr(((AttributeExpr) expr).getTarget());
            String temp = ir.freshTemp();
            ir.emit(IRInstruction.of(OpCode.BINOP, base, "." + ":" + ((AttributeExpr) expr).getName(), temp, expr.getLine()));
            return temp;
        }
        String temp = ir.freshTemp();
        ir.emit(IRInstruction.of(OpCode.LOAD_CONST, "<expr>", "", temp, expr.getLine()));
        return temp;
    }

    private String emitBinary(Expr expr, String op) {
        Expr left = null;
        Expr right = null;
        int line = expr.getLine();
        if (expr instanceof AdditionExpr) {
            left = ((AdditionExpr) expr).getLeft();
            right = ((AdditionExpr) expr).getRight();
        } else if (expr instanceof SubtractionExpr) {
            left = ((SubtractionExpr) expr).getLeft();
            right = ((SubtractionExpr) expr).getRight();
        } else if (expr instanceof MultiplyExpr) {
            left = ((MultiplyExpr) expr).getLeft();
            right = ((MultiplyExpr) expr).getRight();
        } else if (expr instanceof DivideExpr) {
            left = ((DivideExpr) expr).getLeft();
            right = ((DivideExpr) expr).getRight();
        }
        String l = emitExpr(left);
        String r = emitExpr(right);
        String temp = ir.freshTemp();
        ir.emit(IRInstruction.of(OpCode.BINOP, l, op + ":" + r, temp, line));
        return temp;
    }

    private String extractName(Expr expr) {
        if (expr instanceof NameAtom) {
            return ((NameAtom) expr).getName();
        }
        if (expr instanceof NameExpr) {
            return ((NameExpr) expr).getName();
        }
        return null;
    }
}
