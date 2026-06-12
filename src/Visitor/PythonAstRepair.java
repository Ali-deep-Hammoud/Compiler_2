package Visitor;

import AST2.Program;
import AST2.SimpleStatement;
import AST2.Statement;

import java.util.ArrayList;
import AST2.compound_statement.Body;
import AST2.compound_statement.ClassStatement;
import AST2.compound_statement.DecoratedStatement;
import AST2.compound_statement.FunctionStatement;
import AST2.compound_statement.ForStatement;
import AST2.compound_statement.IfStatement;
import AST2.compound_statement.WhileStatement;
import AST2.Expressions.Atoms.NameAtom;
import AST2.Expressions.Atoms.StringAtom;

/**
 * Repairs common AST defects caused by indentation parsing without modifying the grammar.
 * Re-attaches simple statements that were incorrectly emitted at module level
 * after a function/decoration definition.
 */
public final class PythonAstRepair {
    private PythonAstRepair() {}

    public static void repair(Program program) {
        if (program == null) {
            return;
        }
        var stmts = program.getStatements();
        int i = 0;
        while (i < stmts.size()) {
            Statement current = stmts.get(i);
            // Only decorated defs (e.g. @app.route) tend to lose indented tail statements.
            if (current instanceof DecoratedStatement dec && dec.getFunction() != null) {
                Body body = dec.getFunction().getBody();
                i++;
                i = absorbOrphanStatements(stmts, i, body);
            } else {
                i++;
            }
        }
    }

    private static int absorbOrphanStatements(java.util.List<Statement> stmts, int index, Body targetBody) {
        java.util.List<Statement> toMove = new ArrayList<>();
        int scan = index;
        while (scan < stmts.size()) {
            Statement next = stmts.get(scan);
            if (isModuleBoundary(next)) {
                break;
            }
            if (isOrphanCandidate(next)) {
                toMove.add(next);
                scan++;
            } else {
                break;
            }
        }
        for (Statement orphan : toMove) {
            targetBody.addStatement(orphan);
            stmts.remove(orphan);
        }
        return scan;
    }

    private static boolean isOrphanCandidate(Statement statement) {
        return statement instanceof SimpleStatement
                || statement instanceof IfStatement
                || statement instanceof WhileStatement
                || statement instanceof ForStatement;
    }

    private static boolean isModuleBoundary(Statement statement) {
        if (statement instanceof FunctionStatement
                || statement instanceof DecoratedStatement
                || statement instanceof ClassStatement) {
            return true;
        }
        if (statement instanceof IfStatement ifs) {
            return isMainGuard(ifs);
        }
        return false;
    }

    private static boolean isMainGuard(IfStatement ifs) {
        if (ifs.getCondition() instanceof AST2.Expressions.ComparisonExpr cmp) {
            String left = extractNameFromExpr(cmp.getLeft());
            String right = extractNameFromExpr(cmp.getRight());
            return "__name__".equals(left) && "\"__main__\"".equals(right)
                    || "__name__".equals(left) && "'__main__'".equals(right);
        }
        return false;
    }

    private static String extractNameFromExpr(AST2.Expr expr) {
        if (expr instanceof NameAtom) {
            return ((NameAtom) expr).getName();
        }
        if (expr instanceof StringAtom sa && !sa.getStrings().isEmpty()) {
            return "\"" + sa.getStrings().get(0) + "\"";
        }
        return null;
    }
}
