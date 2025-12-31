package Visitor;

import AST2.*;
import AST2.compound_statement.Body;
import AST2.compound_statement.ElifStatement;
import AST2.compound_statement.IfStatement;
import AST2.compound_statement.WhileStatement;
import AST2.small_statement.*;
import antlr.PythonParser;
import antlr.PythonParserBaseVisitor;


public class PythonVisitor extends PythonParserBaseVisitor {

    @Override
    public Object visitFile_input(PythonParser.File_inputContext ctx) {
        int line =  ctx.start.getLine();
        Program program = new Program(line);
        if (ctx.stmt() != null) {
            for (int i = 0; i < ctx.stmt().size(); i++) {
                Statement statement = (Statement) visit(ctx.stmt().get(i));
                program.addStatement(statement);
            }
        }
        return program;
    }

    public SimpleStatement visitStmtSimple(PythonParser.StmtSimpleContext ctx) {
        return (SimpleStatement) visit(ctx.simple_stmt());
    }


    @Override
    public CompoundStatement visitStmtCompound(PythonParser.StmtCompoundContext ctx) {
        return (CompoundStatement) visit(ctx.compound_stmt());
    }


    @Override
    public Object visitSimple_stmt(PythonParser.Simple_stmtContext ctx) {
        int line  =  ctx.start.getLine();
        SimpleStatement statement = new SimpleStatement(line);
        for (int i = 0; i< ctx.small_stmt().size(); i++) {
            SmallStatement smallStatement = (SmallStatement) visit(ctx.small_stmt().get(i));
            statement.addStatement(smallStatement);
        }
        return statement;    }

    @Override
    public SmallStatement visitSmallStmtExpr(PythonParser.SmallStmtExprContext ctx) {

        return (SmallStatement) visit(ctx.expr_stmt());
    }
    //TODO
    @Override
    public DelStatement visitSmallStmtDel(PythonParser.SmallStmtDelContext ctx) {
        int line  =  ctx.start.getLine();
        PythonParser.ExprlistContext context = ctx.del_stmt().exprlist();
        DelStatement statement = new DelStatement(line);
        for (int i = 0;i < context.expr().size(); i++) {
            Expr expr = (Expr) visit(context.expr().get(i));
            statement.addTarget(expr);
        }
        return statement;
    }

    @Override
    public PassStatement visitSmallStmtPass(PythonParser.SmallStmtPassContext ctx) {
        int line  =  ctx.start.getLine();
        PassStatement statement = new PassStatement(line);
        return statement;
    }

    @Override
    public FlowStatement visitSmallStmtFlow(PythonParser.SmallStmtFlowContext ctx) {
        return (FlowStatement) visit(ctx.flow_stmt());
    }

    @Override
    public SmallStatement visitSmallStmtImport(PythonParser.SmallStmtImportContext ctx) {
        return (SmallStatement) visit(ctx.import_stmt());
    }

    @Override
    public GlobalStatement visitSmallStmtGlobal(PythonParser.SmallStmtGlobalContext ctx) {
        int line   =  ctx.start.getLine();
        GlobalStatement statement = new GlobalStatement(line);
        for (int i = 0;i< ctx.global_stmt().NAME().size(); i++) {
            statement.addName(ctx.global_stmt().NAME().get(i).getText());
        }
        return statement;
    }

    @Override
    public Object visitSmallStmtNonlocal(PythonParser.SmallStmtNonlocalContext ctx) {
        int line  =  ctx.start.getLine();
        NonLocalStatement statement = new NonLocalStatement(line);
        for (int i = 0;i< ctx.nonlocal_stmt().NAME().size(); i++) {
            statement.addName(ctx.nonlocal_stmt().NAME().get(i).getText());
        }
        return statement;
    }

    @Override
    public Object visitSmallStmtAssert(PythonParser.SmallStmtAssertContext ctx) {
        int line  =  ctx.start.getLine();
        Expr condition = (Expr) visit(ctx.assert_stmt().test().getFirst());
        Expr message = null;
        if (ctx.assert_stmt().test().size() == 2){
            message = (Expr) visit(ctx.assert_stmt().test().get(1));
        }
        AssertStatement statement = new AssertStatement(line,condition,message);
        return statement;
    }

    @Override
    public SmallStatement visitExpr_stmt(PythonParser.Expr_stmtContext ctx) {
        int line   =  ctx.start.getLine();
        Expr target = (Expr) visit(ctx.testlist_star_expr(0));

        if (ctx.augassign() != null) {
            Expr value = (Expr) visit(ctx.testlist());
            AugmentedAssign statement;
            if(ctx.augassign() instanceof PythonParser.AugAssignPlusContext){
                 statement = new AugmentedPlus(line,target,value);

            }else if(ctx.augassign() instanceof PythonParser.AugAssignMinusContext){
                 statement = new AugmentedMinus(line,target,value);
            }
            else if(ctx.augassign() instanceof PythonParser.AugAssignStarContext){
                 statement = new AugmentedMuliply(line,target,value);
            }
            else if(ctx.augassign() instanceof PythonParser.AugAssignSlashContext){
                 statement = new AugmentedDivide(line,target,value);
            }
            else if(ctx.augassign() instanceof PythonParser.AugAssignPercentContext){
                statement = new AugmentedRemain(line,target,value);
            }
            else if(ctx.augassign() instanceof PythonParser.AugAssignAtContext){
                statement = new AugmentedAT(line,target,value);
            }else{
                statement = new AugmentedDoubleStar(line,target,value);
            }
            return statement;
        }

        if (ctx.EQUAL() != null && !ctx.EQUAL().isEmpty()) {
            Expr value = (Expr) visit(ctx.testlist_star_expr(ctx.testlist_star_expr().size() - 1));
            Assign assign = new Assign(line, value);
            assign.addTarget(target);
            for (int i = 1; i < ctx.testlist_star_expr().size() - 1; i++) {
                assign.addTarget((Expr) visit(ctx.testlist_star_expr(i)));
            }

            return assign;
        }

        return new ExprStatement(line,target);
    }

    @Override
    public BreakStatement visitFlowStmtBreak(PythonParser.FlowStmtBreakContext ctx) {
        int line  =  ctx.start.getLine();
        BreakStatement statement = new BreakStatement(line);
        return statement;
    }

    @Override
    public ContinueStatement visitFlowStmtContinue(PythonParser.FlowStmtContinueContext ctx) {
        int line  =  ctx.start.getLine();
        ContinueStatement statement = new ContinueStatement(line);
        return statement;
    }

    @Override
    public ReturnStatement visitFlowStmtReturn(PythonParser.FlowStmtReturnContext ctx) {
        int line  =  ctx.start.getLine();
        Expr value = null;
        if (ctx.return_stmt().testlist() != null) {
            value = (Expr) visit(ctx.return_stmt().testlist());
        }
        ReturnStatement statement = new ReturnStatement(line,value);
        return statement;
    }

    @Override
    public RaiseStatement visitFlowStmtRaise(PythonParser.FlowStmtRaiseContext ctx) {
        int line  =  ctx.start.getLine();
        Expr exception = null;
        Expr cause = null;
        if(ctx.raise_stmt().test() != null && !ctx.raise_stmt().test().isEmpty() ) {
             exception =  (Expr) visit(ctx.raise_stmt().test().get(0));
            if(ctx.raise_stmt().test().size() >1){
                 cause = (Expr) visit(ctx.raise_stmt().test().get(1));
            }
        }
        RaiseStatement statement = new RaiseStatement(line,exception,cause);
        return statement;
    }

    @Override
    public YieldStatement visitFlowStmtYield(PythonParser.FlowStmtYieldContext ctx) {
        int  line  =  ctx.start.getLine();
        Expr value = null;
        if (ctx.yield_stmt().yield_expr() != null) {
            value = (Expr) visit(ctx.yield_stmt().yield_expr());
        }
        YieldStatement statement = new YieldStatement(line,value);
        return statement;
    }

    @Override
    public ImportStatement visitImportStmtName(PythonParser.ImportStmtNameContext ctx) {
        int line = ctx.start.getLine();

        PythonParser.Import_nameContext importNameCtx = ctx.import_name();

        PythonParser.Dotted_as_namesContext dottedNamesCtx = importNameCtx.dotted_as_names();


        ImportStatement statement = new ImportStatement(line);

        for (int i = 0; i < dottedNamesCtx.dotted_as_name().size(); i++) {
            PythonParser.Dotted_as_nameContext dottedCtx =  dottedNamesCtx.dotted_as_name(i);
            StringBuilder name = new StringBuilder();
            for (int j = 0;j< dottedCtx.dotted_name().NAME().size() - 1;j++){
                name.append(dottedCtx.dotted_name().NAME().get(j).getText()).append('.');
            }
            name.append(dottedCtx.dotted_name().NAME().get(dottedCtx.dotted_name().NAME().size() - 1).getText()).append('.');

            String alias = null;
            if (dottedCtx.NAME() != null) { // NAME AS NAME
                alias = dottedCtx.NAME().getText();
            }

            statement.addAlias(new Alias(line,name.toString(),alias));
        }

        return statement;
    }



    @Override
    public ImportFromStatement visitImportStmtFrom(PythonParser.ImportStmtFromContext ctx) {
        int line = ctx.start.getLine();
        PythonParser.Import_fromContext importFromCtx = ctx.import_from();
        int level = 0;
        String module = null;

        if (!importFromCtx.DOT().isEmpty()) {
            level = importFromCtx.DOT().size();
        }

        if (importFromCtx.dotted_name() != null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0;i<importFromCtx.dotted_name().NAME().size()- 1;i++){
                stringBuilder.append(importFromCtx.dotted_name().NAME().get(i).getText()).append('.');
            }
            stringBuilder.append(importFromCtx.dotted_name().NAME().get(importFromCtx.dotted_name().NAME().size() - 1).getText());

            module = stringBuilder.toString();
        }
        boolean isImportAll = false;
        if(importFromCtx.STAR() != null) {
            isImportAll = true;
        }

        ImportFromStatement statement = new ImportFromStatement(line, module, level,isImportAll);

        if (importFromCtx.import_as_names() != null) {
            PythonParser.Import_as_namesContext namesCtx = importFromCtx.import_as_names();
            for (int i = 0; i < namesCtx.import_as_name().size(); i++) {
                String name = namesCtx.import_as_name().get(i).NAME().getFirst().getText();
                String alias = null;
                if(namesCtx.import_as_name().get(i).NAME().size() > 1){
                    alias = namesCtx.import_as_name().get(i).NAME().get(1).getText();
                }
                statement.addAlias(new Alias(line, name,alias));
            }
        }

        return statement;
    }

    @Override
    public Object visitCompoundStmtIf(PythonParser.CompoundStmtIfContext ctx) {
        int line  =  ctx.start.getLine();
        Expr condition = (Expr) visit(ctx.if_stmt().test().getFirst());
        Body body = (Body) visit(ctx.if_stmt().suite().getFirst());
        Body elseBody = null;
        if(ctx.if_stmt().ELSE() != null) {
             elseBody = (Body) visit(ctx.if_stmt().suite().getLast());
        }
        IfStatement statement = new IfStatement(line,condition,body,elseBody);

        for (int i = 0; i < ctx.if_stmt().ELIF().size(); i++) {
            int j = i + 1;

            int elifLine = ctx.if_stmt().ELIF(i).getSymbol().getLine();
            Expr elifCondition = (Expr) visit(ctx.if_stmt().test().get(j));
            Body elifBody = (Body) visit(ctx.if_stmt().suite().get(j));
            ElifStatement elifStatement = new ElifStatement(elifLine,elifCondition,elifBody);
            statement.addElifStatement(elifStatement);

        }
        return statement;
    }

    @Override
    public Object visitCompoundStmtWhile(PythonParser.CompoundStmtWhileContext ctx) {
        int line = ctx.start.getLine();
        Expr condition = (Expr) visit(ctx.while_stmt().test());
        Body body = (Body) visit(ctx.while_stmt().suite().getFirst());
        Body elseBody = null;
        if(ctx.while_stmt().ELSE() != null) {
            elseBody = (Body) visit(ctx.while_stmt().suite().getLast());
        }
        WhileStatement statement = new WhileStatement(line,condition,body,elseBody);
        return  statement;
    }
    //TODO
    @Override
    public Object visitCompoundStmtFor(PythonParser.CompoundStmtForContext ctx) {
        int line = ctx.start.getLine();
        for(int i = 0; i<ctx.for_stmt().exprlist().expr().size(); i++) {
            Expr expr = (Expr) visit(ctx.for_stmt().exprlist().expr().get(i));

        }
    }

    @Override
    public Object visitCompoundStmtTry(PythonParser.CompoundStmtTryContext ctx) {
        return super.visitCompoundStmtTry(ctx);
    }

    @Override
    public Object visitCompoundStmtWith(PythonParser.CompoundStmtWithContext ctx) {
        return super.visitCompoundStmtWith(ctx);
    }

    @Override
    public Object visitCompoundStmtFunc(PythonParser.CompoundStmtFuncContext ctx) {
        return super.visitCompoundStmtFunc(ctx);
    }

    @Override
    public Object visitCompoundStmtClass(PythonParser.CompoundStmtClassContext ctx) {
        return super.visitCompoundStmtClass(ctx);
    }

    @Override
    public Object visitCompoundStmtDecorated(PythonParser.CompoundStmtDecoratedContext ctx) {
        return super.visitCompoundStmtDecorated(ctx);
    }

    @Override
    public Object visitIf_stmt(PythonParser.If_stmtContext ctx) {
        return super.visitIf_stmt(ctx);
    }

    @Override
    public Object visitWhile_stmt(PythonParser.While_stmtContext ctx) {
        return super.visitWhile_stmt(ctx);
    }

    @Override
    public Object visitFor_stmt(PythonParser.For_stmtContext ctx) {
        return super.visitFor_stmt(ctx);
    }

    @Override
    public Object visitTry_stmt(PythonParser.Try_stmtContext ctx) {
        return super.visitTry_stmt(ctx);
    }

    @Override
    public Object visitWith_stmt(PythonParser.With_stmtContext ctx) {
        return super.visitWith_stmt(ctx);
    }

    @Override
    public Object visitWith_item(PythonParser.With_itemContext ctx) {
        return super.visitWith_item(ctx);
    }

    @Override
    public Object visitExcept_clause(PythonParser.Except_clauseContext ctx) {
        return super.visitExcept_clause(ctx);
    }

    @Override
    public Object visitSuiteSimple(PythonParser.SuiteSimpleContext ctx) {
        return super.visitSuiteSimple(ctx);
    }

    @Override
    public Object visitSuiteCompound(PythonParser.SuiteCompoundContext ctx) {
        return super.visitSuiteCompound(ctx);
    }

    @Override
    public Object visitFuncdef(PythonParser.FuncdefContext ctx) {
        return super.visitFuncdef(ctx);
    }

    @Override
    public Object visitParameters_(PythonParser.Parameters_Context ctx) {
        return super.visitParameters_(ctx);
    }

    @Override
    public Object visitTypedargslist(PythonParser.TypedargslistContext ctx) {
        return super.visitTypedargslist(ctx);
    }

    @Override
    public Object visitTfpdef(PythonParser.TfpdefContext ctx) {
        return super.visitTfpdef(ctx);
    }

    @Override
    public Object visitClassdef(PythonParser.ClassdefContext ctx) {
        return super.visitClassdef(ctx);
    }

    @Override
    public Object visitDecorated(PythonParser.DecoratedContext ctx) {
        return super.visitDecorated(ctx);
    }

    @Override
    public Object visitDecorator(PythonParser.DecoratorContext ctx) {
        return super.visitDecorator(ctx);
    }

    @Override
    public Object visitTestCond(PythonParser.TestCondContext ctx) {
        return super.visitTestCond(ctx);
    }

    @Override
    public Object visitTestLambda(PythonParser.TestLambdaContext ctx) {
        return super.visitTestLambda(ctx);
    }

    @Override
    public Object visitTestNoCondOr(PythonParser.TestNoCondOrContext ctx) {
        return super.visitTestNoCondOr(ctx);
    }

    @Override
    public Object visitTestNoCondLambda(PythonParser.TestNoCondLambdaContext ctx) {
        return super.visitTestNoCondLambda(ctx);
    }

    @Override
    public Object visitLambdef(PythonParser.LambdefContext ctx) {
        return super.visitLambdef(ctx);
    }

    @Override
    public Object visitLambdef_nocond(PythonParser.Lambdef_nocondContext ctx) {
        return super.visitLambdef_nocond(ctx);
    }

    @Override
    public Object visitOr_test(PythonParser.Or_testContext ctx) {
        return super.visitOr_test(ctx);
    }

    @Override
    public Object visitAnd_test(PythonParser.And_testContext ctx) {
        return super.visitAnd_test(ctx);
    }

    @Override
    public Object visitNotTestNot(PythonParser.NotTestNotContext ctx) {
        return super.visitNotTestNot(ctx);
    }

    @Override
    public Object visitNotTestComp(PythonParser.NotTestCompContext ctx) {
        return super.visitNotTestComp(ctx);
    }

    @Override
    public Object visitComparison(PythonParser.ComparisonContext ctx) {
        return super.visitComparison(ctx);
    }

    @Override
    public Object visitCompOpLess(PythonParser.CompOpLessContext ctx) {
        return super.visitCompOpLess(ctx);
    }

    @Override
    public Object visitCompOpGreater(PythonParser.CompOpGreaterContext ctx) {
        return super.visitCompOpGreater(ctx);
    }

    @Override
    public Object visitCompOpEq(PythonParser.CompOpEqContext ctx) {
        return super.visitCompOpEq(ctx);
    }

    @Override
    public Object visitCompOpGe(PythonParser.CompOpGeContext ctx) {
        return super.visitCompOpGe(ctx);
    }

    @Override
    public Object visitCompOpLe(PythonParser.CompOpLeContext ctx) {
        return super.visitCompOpLe(ctx);
    }

    @Override
    public Object visitCompOpNe(PythonParser.CompOpNeContext ctx) {
        return super.visitCompOpNe(ctx);
    }

    @Override
    public Object visitCompOpIn(PythonParser.CompOpInContext ctx) {
        return super.visitCompOpIn(ctx);
    }

    @Override
    public Object visitCompOpNotIn(PythonParser.CompOpNotInContext ctx) {
        return super.visitCompOpNotIn(ctx);
    }

    @Override
    public Object visitCompOpIs(PythonParser.CompOpIsContext ctx) {
        return super.visitCompOpIs(ctx);
    }

    @Override
    public Object visitCompOpIsNot(PythonParser.CompOpIsNotContext ctx) {
        return super.visitCompOpIsNot(ctx);
    }

    @Override
    public Object visitStar_expr(PythonParser.Star_exprContext ctx) {
        return super.visitStar_expr(ctx);
    }

    @Override
    public Object visitExpr(PythonParser.ExprContext ctx) {
        return super.visitExpr(ctx);
    }

    @Override
    public Object visitXor_expr(PythonParser.Xor_exprContext ctx) {
        return super.visitXor_expr(ctx);
    }

    @Override
    public Object visitAnd_expr(PythonParser.And_exprContext ctx) {
        return super.visitAnd_expr(ctx);
    }

    @Override
    public Object visitShift_expr(PythonParser.Shift_exprContext ctx) {
        return super.visitShift_expr(ctx);
    }

    @Override
    public Object visitArith_expr(PythonParser.Arith_exprContext ctx) {
        return super.visitArith_expr(ctx);
    }

    @Override
    public Object visitTerm(PythonParser.TermContext ctx) {
        return super.visitTerm(ctx);
    }

    @Override
    public Object visitFactorUnary(PythonParser.FactorUnaryContext ctx) {
        return super.visitFactorUnary(ctx);
    }

    @Override
    public Object visitFactorPower(PythonParser.FactorPowerContext ctx) {
        return super.visitFactorPower(ctx);
    }

    @Override
    public Object visitPower(PythonParser.PowerContext ctx) {
        return super.visitPower(ctx);
    }

    @Override
    public Object visitAtom_expr(PythonParser.Atom_exprContext ctx) {
        return super.visitAtom_expr(ctx);
    }

    @Override
    public Object visitAtomParen(PythonParser.AtomParenContext ctx) {
        return super.visitAtomParen(ctx);
    }

    @Override
    public Object visitAtomList(PythonParser.AtomListContext ctx) {
        return super.visitAtomList(ctx);
    }

    @Override
    public Object visitAtomDict(PythonParser.AtomDictContext ctx) {
        return super.visitAtomDict(ctx);
    }

    @Override
    public Object visitAtomName(PythonParser.AtomNameContext ctx) {
        return super.visitAtomName(ctx);
    }

    @Override
    public Object visitAtomNumber(PythonParser.AtomNumberContext ctx) {
        return super.visitAtomNumber(ctx);
    }

    @Override
    public Object visitAtomString(PythonParser.AtomStringContext ctx) {
        return super.visitAtomString(ctx);
    }

    @Override
    public Object visitAtomEllipsis(PythonParser.AtomEllipsisContext ctx) {
        return super.visitAtomEllipsis(ctx);
    }

    @Override
    public Object visitAtomNone(PythonParser.AtomNoneContext ctx) {
        return super.visitAtomNone(ctx);
    }

    @Override
    public Object visitAtomTrue(PythonParser.AtomTrueContext ctx) {
        return super.visitAtomTrue(ctx);
    }

    @Override
    public Object visitAtomFalse(PythonParser.AtomFalseContext ctx) {
        return super.visitAtomFalse(ctx);
    }

    @Override
    public Object visitTestlist_comp(PythonParser.Testlist_compContext ctx) {
        return super.visitTestlist_comp(ctx);
    }

    @Override
    public Object visitTrailerCall(PythonParser.TrailerCallContext ctx) {
        return super.visitTrailerCall(ctx);
    }

    @Override
    public Object visitTrailerIndex(PythonParser.TrailerIndexContext ctx) {
        return super.visitTrailerIndex(ctx);
    }

    @Override
    public Object visitTrailerDot(PythonParser.TrailerDotContext ctx) {
        return super.visitTrailerDot(ctx);
    }

    @Override
    public Object visitSubscriptlist(PythonParser.SubscriptlistContext ctx) {
        return super.visitSubscriptlist(ctx);
    }

    @Override
    public Object visitSubscriptTest(PythonParser.SubscriptTestContext ctx) {
        return super.visitSubscriptTest(ctx);
    }

    @Override
    public Object visitSubscriptSlice(PythonParser.SubscriptSliceContext ctx) {
        return super.visitSubscriptSlice(ctx);
    }

    @Override
    public Object visitSliceop(PythonParser.SliceopContext ctx) {
        return super.visitSliceop(ctx);
    }

    @Override
    public Object visitExprlist(PythonParser.ExprlistContext ctx) {
        return super.visitExprlist(ctx);
    }

    @Override
    public Object visitTestlist(PythonParser.TestlistContext ctx) {
        return super.visitTestlist(ctx);
    }

    @Override
    public Object visitDictorsetmaker(PythonParser.DictorsetmakerContext ctx) {
        return super.visitDictorsetmaker(ctx);
    }

    @Override
    public Object visitClassDefOrFuncDefClass(PythonParser.ClassDefOrFuncDefClassContext ctx) {
        return super.visitClassDefOrFuncDefClass(ctx);
    }

    @Override
    public Object visitClassDefOrFuncDefFunc(PythonParser.ClassDefOrFuncDefFuncContext ctx) {
        return super.visitClassDefOrFuncDefFunc(ctx);
    }

    @Override
    public Object visitArglist(PythonParser.ArglistContext ctx) {
        return super.visitArglist(ctx);
    }

    @Override
    public Object visitArgumentComp(PythonParser.ArgumentCompContext ctx) {
        return super.visitArgumentComp(ctx);
    }

    @Override
    public Object visitArgumentEqual(PythonParser.ArgumentEqualContext ctx) {
        return super.visitArgumentEqual(ctx);
    }

    @Override
    public Object visitArgumentDoubleStar(PythonParser.ArgumentDoubleStarContext ctx) {
        return super.visitArgumentDoubleStar(ctx);
    }

    @Override
    public Object visitArgumentStar(PythonParser.ArgumentStarContext ctx) {
        return super.visitArgumentStar(ctx);
    }

    @Override
    public Object visitCompIterFor(PythonParser.CompIterForContext ctx) {
        return super.visitCompIterFor(ctx);
    }

    @Override
    public Object visitCompIterIf(PythonParser.CompIterIfContext ctx) {
        return super.visitCompIterIf(ctx);
    }

    @Override
    public Object visitComp_for(PythonParser.Comp_forContext ctx) {
        return super.visitComp_for(ctx);
    }

    @Override
    public Object visitComp_if(PythonParser.Comp_ifContext ctx) {
        return super.visitComp_if(ctx);
    }

    @Override
    public Object visitYield_expr(PythonParser.Yield_exprContext ctx) {
        return super.visitYield_expr(ctx);
    }

    @Override
    public Object visitYieldArgFrom(PythonParser.YieldArgFromContext ctx) {
        return super.visitYieldArgFrom(ctx);
    }

    @Override
    public Object visitYieldArgList(PythonParser.YieldArgListContext ctx) {
        return super.visitYieldArgList(ctx);
    }

    @Override
    public Object visitTestlist_star_expr(PythonParser.Testlist_star_exprContext ctx) {
        return super.visitTestlist_star_expr(ctx);
    }

    @Override
    public Object visitVarargslist(PythonParser.VarargslistContext ctx) {
        return super.visitVarargslist(ctx);
    }

    @Override
    public Object visitVfpdef(PythonParser.VfpdefContext ctx) {
        return super.visitVfpdef(ctx);
    }
}
