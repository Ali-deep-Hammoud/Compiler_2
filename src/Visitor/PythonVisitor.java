package Visitor;

import AST2.*;
import AST2.Expressions.*;
import AST2.Expressions.Atoms.*;
import AST2.compound_statement.*;
import AST2.compound_statement.ClassStatement;
import AST2.small_statement.*;
import antlr.PythonParser;
import antlr.PythonParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


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
    public SimpleStatement visitSimple_stmt(PythonParser.Simple_stmtContext ctx) {
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
    @Override
    public DelStatement visitSmallStmtDel(PythonParser.SmallStmtDelContext ctx) {
        int line  =  ctx.start.getLine();
        PythonParser.ExprlistContext context = ctx.del_stmt().exprlist();
        DelStatement statement = new DelStatement(line);
        Expr expression = visitExprlist(context);
        if(expression instanceof TupleExpr){
            for(int i = 0; i < ((TupleExpr)expression).getElements().size(); i++){
                statement.addTarget(((TupleExpr)expression).getElements().get(i));
            }
        }
        else {
            statement.addTarget(expression);
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
            if (dottedCtx.NAME() != null) {
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
    public IfStatement visitCompoundStmtIf(PythonParser.CompoundStmtIfContext ctx) {
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
    public WhileStatement visitCompoundStmtWhile(PythonParser.CompoundStmtWhileContext ctx) {
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
    @Override
    public ForStatement visitCompoundStmtFor(PythonParser.CompoundStmtForContext ctx) {
        int line = ctx.start.getLine();
        Expr target = (Expr) visit(ctx.for_stmt().exprlist());
        Expr iterator = (Expr) visit(ctx.for_stmt().testlist());
        Body body = (Body) visit(ctx.for_stmt().suite().getFirst());
        Body elseBody = null;
        if(ctx.for_stmt().ELSE() != null) {
            elseBody = (Body) visit(ctx.for_stmt().suite().getLast());
        }
        ForStatement statement = new ForStatement(line,target,iterator,body,elseBody);
        return  statement;
    }

    @Override
    public TryStatement visitCompoundStmtTry(PythonParser.CompoundStmtTryContext ctx) {
        int line = ctx.start.getLine();

        Body tryBody = (Body) visit(ctx.try_stmt().suite(0));

        Body elseBody = null;
        Body finallyBody = null;

        int suiteIndex = 1;

        TryStatement tryStatement = new TryStatement(line, tryBody, elseBody, finallyBody);

        for (PythonParser.Except_clauseContext exceptCtx : ctx.try_stmt().except_clause()) {
            Body exceptBody = (Body) visit(ctx.try_stmt().suite(suiteIndex++));
            Expr exceptionType = null;
            String name = null;
            if (exceptCtx.test() != null) {
                exceptionType = (Expr) visit(exceptCtx.test());
                if (exceptCtx.NAME() != null) {
                    name = exceptCtx.NAME().getText();
                }
            }
            ExceptStatement exceptStatement = new ExceptStatement(line,exceptionType, name, exceptBody);
            tryStatement.addExceptStatement(exceptStatement);
        }

        if (ctx.try_stmt().ELSE() != null) {
            elseBody =  (Body) visit(ctx.try_stmt().suite(suiteIndex++));
            tryStatement.setElseBody(elseBody);
        }

        if (ctx.try_stmt().FINALLY() != null) {
            finallyBody = (Body) visit(ctx.try_stmt().suite(suiteIndex));
            tryStatement.setFinallyBody(finallyBody);
        }

        return tryStatement;
    }


    @Override
    public WithStatement visitCompoundStmtWith(PythonParser.CompoundStmtWithContext ctx) {
        int line = ctx.start.getLine();

        Body body = (Body) visit(ctx.with_stmt().suite());

        WithStatement withStmt = new WithStatement(line, body);

        List<PythonParser.With_itemContext> items = ctx.with_stmt().with_item();
        for (PythonParser.With_itemContext itemCtx : items) {
            Expr contextExpr = (Expr) visit(itemCtx.test());
            Expr target = null;
            if (itemCtx.expr() != null) {
                target = (Expr) visit(itemCtx.expr());
            }
            withStmt.addItem(new WithItem(line,contextExpr, target));
        }

        return withStmt;
    }

    public FunctionStatement visitCompoundStmtFunc(PythonParser.CompoundStmtFuncContext ctx) {
        return visitFuncdef(ctx.funcdef());
    }



    @Override
    public ClassStatement visitCompoundStmtClass(PythonParser.CompoundStmtClassContext ctx) {
        return visitClassdef(ctx.classdef());
    }

    @Override
    public DecoratedStatement visitCompoundStmtDecorated(PythonParser.CompoundStmtDecoratedContext ctx) {
       return visitDecorated(ctx.decorated());
    }

    @Override
    public Body visitSuiteSimple(PythonParser.SuiteSimpleContext ctx) {
        int line = ctx.start.getLine();
        Body body = new Body(line);
        SimpleStatement statement = visitSimple_stmt(ctx.simple_stmt());
        body.addStatement(statement);
        return  body;
    }

    @Override
    public Body visitSuiteCompound(PythonParser.SuiteCompoundContext ctx) {
        int line = ctx.start.getLine();
        Body body = new Body(line);
        for (int i = 0;i < ctx.stmt().size();i++) {
            Statement statement = (Statement) visit(ctx.stmt().get(i));
            body.addStatement(statement);
        }
        return body;
    }

    @Override
    public FunctionStatement visitFuncdef(PythonParser.FuncdefContext ctx) {
        int line = ctx.start.getLine();

        String name = ctx.NAME().getText();

        Expr returnType = null;
        if (ctx.ARROW() != null) {
            returnType = (Expr) visit(ctx.test());
        }
        Body body = (Body) visit(ctx.suite());

        List<Parameter> parameters =null;
        if (ctx.parameters().typedargslist() != null) {
            parameters = (List<Parameter>) visit(ctx.parameters().typedargslist());
        }
        FunctionStatement funcStmt = new FunctionStatement(line, name, returnType, body, parameters);


        return funcStmt;
    }



    @Override
    public List<Parameter> visitDoubleStarParameter(PythonParser.DoubleStarParameterContext ctx) {
        int line = ctx.start.getLine();
        String name = ctx.doubleStarPar().tfpdef().NAME().getText();
        Expr type= null;
        if(ctx.doubleStarPar().tfpdef().test() != null) {
            type = (Expr) visit(ctx.doubleStarPar().tfpdef().test());
        }
        DoubleStarParameter parameter = new DoubleStarParameter(line, name, type);
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(parameter);
        return parameters;
    }

    @Override
    public List<Parameter> visitStarParaneter(PythonParser.StarParaneterContext ctx) {
        int line = ctx.start.getLine();
        List<Parameter> params = new ArrayList<>();

        String name = null;
        Expr type = null;
        if (ctx.tfpdef() != null) {
            name = ctx.tfpdef().NAME().getText();
            if (ctx.tfpdef().test() != null) {
                type = (Expr) visit(ctx.tfpdef().test());
            }
        }
        params.add(new StarParameter(line, name, type));
        if(ctx.normalPar() != null) {
            for (int i = 0; i < ctx.normalPar().size(); i++) {
                String name2 = ctx.normalPar().get(i).tfpdef().NAME().getText();
                Expr type2 = null;
                if (ctx.normalPar().get(i).tfpdef().test() != null) {
                    type2 = (Expr) visit(ctx.normalPar().get(i).tfpdef().test());
                }
                Expr value = null;
                if (ctx.normalPar().get(i).EQUAL() != null) {
                    value = (Expr) visit(ctx.normalPar().get(i).test());
                }
                params.add(new NormalParameter(line, name2, type2, value));

            }
        }
        if (ctx.doubleStarPar() != null) {
            String name3 = ctx.doubleStarPar().tfpdef().NAME().getText();
            Expr type3 = null;
            if (ctx.doubleStarPar().tfpdef().test() != null) {
                type3 = (Expr) visit(ctx.doubleStarPar().tfpdef().test());
            }
            params.add(new DoubleStarParameter(line, name3, type3));
        }

        return params;
    }

    @Override
    public List<Parameter> visitNormalParameter(PythonParser.NormalParameterContext ctx) {
        int line = ctx.start.getLine();
        List<Parameter> params = new ArrayList<>();
        for (int i = 0;i < ctx.normalPar().size();i++) {
            String name = ctx.normalPar().get(i).tfpdef().NAME().getText();
            Expr type = null;
            if (ctx.normalPar().get(i).EQUAL() != null) {
                type = (Expr) visit(ctx.normalPar().get(i).test());
            }
            NormalParameter parameter = new NormalParameter(line, name, null, type);
            params.add(parameter);
        }
        return params;
    }



    @Override
    public ClassStatement visitClassdef(PythonParser.ClassdefContext ctx) {
        int line = ctx.start.getLine();
        String name = ctx.NAME().getText();
        Body body = (Body) visit(ctx.suite());
        ClassStatement clazz = new ClassStatement(line, name, body);
        if (ctx.arglist() != null) {
            for (int i = 0;i < ctx.arglist().argument().size();i++) {
                Expr base =  (Expr) visit(ctx.arglist().argument().get(i));
                clazz.addBase(base);

            }
        }
        return clazz;
    }

    @Override
    public DecoratedStatement visitDecorated(PythonParser.DecoratedContext ctx) {
        int line  = ctx.start.getLine();
        DecoratedStatement decorated = null;
        if (ctx.funcdef() != null) {
            FunctionStatement function = (FunctionStatement) visit(ctx.funcdef());
            decorated = new DecoratedStatement(line, function);
        }
        else {
            ClassStatement classStatement = (ClassStatement) visit(ctx.classdef());
            decorated = new DecoratedStatement(line, classStatement);
        }
        for (int i = 0;i < ctx.decorator().size();i++){
            String name = ctx.decorator().get(i).dotted_name().getText();
            Decorator decorator = new Decorator(line,name);
            if (ctx.decorator().get(i).arglist() != null) {
                for (int j = 0;j < ctx.decorator().get(i).arglist().argument().size();j++) {
                    Expr base =  (Expr) visit(ctx.decorator().get(i).arglist().argument().get(j));
                    decorator.addArg(base);
                }
            }
            decorated.addDecorator(decorator);
        }
        return decorated;
    }



    @Override
    public Expr visitTestCond(PythonParser.TestCondContext ctx) {
        int line = ctx.start.getLine();
        Expr first = (Expr) visit(ctx.or_test().getFirst());
        if (ctx.IF() != null) {
            Expr then = (Expr) visit(ctx.or_test().getLast());
            Expr els = (Expr) visit(ctx.test());
            Ifexpr ifexpr = new Ifexpr(line, first, then, els);
            return ifexpr;
        }
        return first;
    }

    @Override
    public LambdaExpr visitTestLambda(PythonParser.TestLambdaContext ctx) {
        return visitLambdef(ctx.lambdef());
    }

    @Override
    public Expr visitTestNoCondOr(PythonParser.TestNoCondOrContext ctx) {
        Expr expr = (Expr) visit(ctx.or_test());
        return expr;    }

    @Override
    public LambdaExpr visitTestNoCondLambda(PythonParser.TestNoCondLambdaContext ctx) {
        return visitLambdef_nocond(ctx.lambdef_nocond());
    }

    @Override
    public LambdaExpr visitLambdef(PythonParser.LambdefContext ctx) {
        int line = ctx.start.getLine();
        Expr body = (Expr) visit(ctx.test());
        List<Variable> variables = null;
        if (ctx.varargslist() != null) {
             variables = (List<Variable>) visit(ctx.varargslist());
        }
        LambdaExpr lambda = new LambdaExpr(line, body,variables);
        return lambda;
    }

    @Override
    public LambdaExpr visitLambdef_nocond(PythonParser.Lambdef_nocondContext ctx) {
        int line = ctx.start.getLine();
        Expr body = (Expr) visit(ctx.test_nocond());
        List<Variable> variables = null;
        if (ctx.varargslist() != null) {
            variables = (List<Variable>) visit(ctx.varargslist());
        }
        LambdaExpr lambda = new LambdaExpr(line, body,variables);
        return lambda;
    }

    @Override
    public Expr visitOr_test(PythonParser.Or_testContext ctx) {
        int line = ctx.start.getLine();
        Expr expr = visitAnd_test(ctx.and_test().getFirst());
        if(ctx.and_test().size()>1){
            for (int i = 1; i < ctx.and_test().size(); i++) {
                Expr right = visitAnd_test(ctx.and_test().get(i));
                expr = new OrExpr(line, expr, right);
            }
        }

        return expr;
    }

    @Override
    public Expr visitAnd_test(PythonParser.And_testContext ctx) {
        int line = ctx.start.getLine();
        Expr expr = (Expr) visit(ctx.not_test().getFirst());
        if(ctx.not_test().size()>1){
            for (int i = 1; i < ctx.not_test().size(); i++) {
                Expr right = (Expr) visit(ctx.not_test().get(i));
                expr = new AndExpr(line, expr, right);
            }
        }

        return expr;    }

    @Override
    public NotExpr visitNotTestNot(PythonParser.NotTestNotContext ctx) {
        int line = ctx.start.getLine();
        Expr expr = (Expr) visit(ctx.not_test());
        NotExpr notExpr = new NotExpr(line, expr);
        return notExpr;
    }

    @Override
    public Expr visitNotTestComp(PythonParser.NotTestCompContext ctx) {
        return visitComparison(ctx.comparison());
    }

    @Override
    public Expr visitComparison(PythonParser.ComparisonContext ctx) {
        int line =  ctx.start.getLine();
        Expr expr = (Expr) visit(ctx.expr().getFirst());
        if(ctx.expr().size()>1){
            for (int i = 1; i < ctx.expr().size(); i++) {
                String op = ctx.comp_op().get(i-1).getText();
                Expr right = (Expr) visit(ctx.expr().get(i));
                expr = new ComparisonExpr(line, expr,op, right);
            }
        }
        return expr;
    }

    @Override
    public StarExpr visitStar_expr(PythonParser.Star_exprContext ctx) {
        int line  = ctx.start.getLine();
        Expr expr = (Expr) visit(ctx.expr());
        StarExpr starExpr = new StarExpr(line, expr);
        return starExpr;
    }

    @Override
    public Expr visitExpr(PythonParser.ExprContext ctx) {
        int line =  ctx.start.getLine();
        Expr expr = (Expr) visit(ctx.xor_expr().getFirst());
        if(ctx.xor_expr().size()>1){
            for (int i = 1; i < ctx.xor_expr().size(); i++) {
                Expr right = (Expr) visit(ctx.xor_expr().get(i));
                expr = new BitOr(line, expr, right);
            }
        }
        return expr;
    }

    @Override
    public Expr visitXor_expr(PythonParser.Xor_exprContext ctx) {
        int line =  ctx.start.getLine();
        Expr expr = (Expr) visit(ctx.and_expr().getFirst());
        if(ctx.and_expr().size()>1){
            for (int i = 1; i < ctx.and_expr().size(); i++) {
                Expr right = (Expr) visit(ctx.and_expr().get(i));
                expr = new BitXor(line, expr, right);
            }
        }
        return expr;    }

    @Override
    public Expr visitAnd_expr(PythonParser.And_exprContext ctx) {
        int line =  ctx.start.getLine();
        Expr expr = (Expr) visit(ctx.shift_expr().getFirst());
        if(ctx.shift_expr().size()>1){
            for (int i = 1; i < ctx.shift_expr().size(); i++) {
                Expr right = (Expr) visit(ctx.shift_expr().get(i));
                expr = new BitAnd(line, expr, right);
            }
        }
        return expr;       }

    @Override
    public Expr visitShift_expr(PythonParser.Shift_exprContext ctx) {
        int line =  ctx.start.getLine();
        Expr expr = (Expr) visit(ctx.arith_expr());
        if(ctx.shift() != null){
            for (int i = 0; i < ctx.shift().size(); i++) {
                Expr right = (Expr) visit(ctx.shift().get(i).arith_expr());
                if(ctx.shift().get(i).LEFTSHIFT() != null) {
                    expr = new BitShift(line, expr, right,false);
                }else {
                    expr = new BitShift(line, expr, right,true);
                }
            }
        }
        return expr;     }

    @Override
    public Expr visitArith_expr(PythonParser.Arith_exprContext ctx) {
        int line =  ctx.start.getLine();
        Expr expr = (Expr) visit(ctx.term());
        if(ctx.math() != null){
            for (int i = 0; i < ctx.math().size(); i++) {
                Expr right = (Expr) visit(ctx.math().get(i).term());
                if(ctx.math().get(i).MINUS() != null) {
                    expr = new SubtractionExpr(line, expr, right);
                }else {
                    expr = new AdditionExpr(line, expr, right);
                }
            }
        }
        return expr;      }

    @Override
    public Expr visitTerm(PythonParser.TermContext ctx) {
        int line =  ctx.start.getLine();
        Expr expr = (Expr) visit(ctx.factor());
        if(ctx.terms() != null){
            for (int i = 0; i < ctx.terms().size(); i++) {
                Expr right = (Expr) visit(ctx.terms().get(i).factor());
                if(ctx.terms().get(i).DOUBLESLASH() != null) {
                    expr = new FloorDivideExpr(line, expr, right);
                }else if(ctx.terms().get(i).STAR() != null) {
                    expr = new MultiplyExpr(line, expr, right);
                }else if(ctx.terms().get(i).SLASH() != null) {
                    expr = new DivideExpr(line, expr, right);
                }else if(ctx.terms().get(i).AT() != null) {
                    expr = new ATExpr(line, expr, right);
                }else  {
                    expr = new RemainExpr(line, expr, right);
                }
            }
        }
        return expr;      }

    @Override
    public Expr visitFactorUnary(PythonParser.FactorUnaryContext ctx) {
        int line =  ctx.start.getLine();
        Expr expr = (Expr) visit(ctx.factor());
        Expr factor;
        if (ctx.MINUS() != null) {
            factor = new UnaryMinusExpr(line,expr);
        } else if (ctx.PLUS() != null) {
            factor = new UnaryPlusExpr(line,expr);
        }else {
            factor = new UnaryTildeExpr(line,expr);
        }
        return factor;
    }

    @Override
    public Expr visitFactorPower(PythonParser.FactorPowerContext ctx) {
        return visitPower(ctx.power());
    }

    @Override
    public Expr visitPower(PythonParser.PowerContext ctx) {
        int line = ctx.start.getLine();

        Expr base = (Expr) visit(ctx.atom_expr());

        if (ctx.DOUBLESTAR() != null) {
            Expr exponent = (Expr) visit(ctx.factor());
            return new PowerExpr(line, base, exponent);
        }

        return base;
    }

    @Override
    public Expr visitAtom_expr(PythonParser.Atom_exprContext ctx) {
        int line = ctx.start.getLine();

        Expr expr = (Atom) visit(ctx.atom());

        for (PythonParser.TrailerContext t : ctx.trailer()) {

            if (t instanceof PythonParser.TrailerCallContext callCtx) {
                List<Expr> args = new ArrayList<>();
                if (callCtx.arglist() != null) {
                    for (PythonParser.ArgumentContext a : callCtx.arglist().argument()) {
                        args.add((Expr) visit(a));
                    }
                }
                expr = new CallExpr(line, expr, args);

            } else if (t instanceof PythonParser.TrailerIndexContext indexCtx) {
                Expr index = (Expr) visit(indexCtx.subscriptlist());
                expr = new IndexExpr(line, expr, index);

            } else if (t instanceof PythonParser.TrailerDotContext dotCtx) {
                String name = dotCtx.NAME().getText();
                expr = new AttributeExpr(line, expr, name);

            }
        }

        return expr;
    }

    @Override
    public Expr visitTestlistElement(PythonParser.TestlistElementContext ctx) {
        if (ctx.test() != null) {
            return (Expr) visit(ctx.test());
        } else if (ctx.star_expr() != null) {
            return (Expr) visit(ctx.star_expr());
        } else {
            return null;
        }
    }
    @Override
    public ParenAtom visitAtomParen(PythonParser.AtomParenContext ctx) {
        int line = ctx.start.getLine();
        ParenAtom atom = new ParenAtom(line);
        if (ctx.yield_expr() != null) {
            Expr inner = (Expr) visit(ctx.yield_expr());
            atom.addExpr(inner);
        } else if (ctx.testlist_comp() != null) {
            if(ctx.testlist_comp().comp_for() != null) {

                CompForExpr compForExpr = visitComp_for(ctx.testlist_comp().comp_for());
                atom.addExpr(compForExpr);
            }else {
                for (int i = 0; i < ctx.testlist_comp().testlistElement().size(); i++) {
                    Expr expr = (Expr) visit(ctx.testlist_comp().testlistElement().get(i));
                    atom.addExpr(expr);

                }
            }
        }
        return atom;
    }

    @Override
    public ListAtom visitAtomList(PythonParser.AtomListContext ctx) {
        int line = ctx.start.getLine();
        ListAtom list = new ListAtom(line);
        if (ctx.testlist_comp() != null) {
            if(ctx.testlist_comp().comp_for() != null) {

                CompForExpr compForExpr = visitComp_for(ctx.testlist_comp().comp_for());
                list.addElement(compForExpr);
            }else {
                for (int i = 0; i < ctx.testlist_comp().testlistElement().size(); i++) {
                    Expr expr = (Expr) visit(ctx.testlist_comp().testlistElement().get(i));
                    list.addElement(expr);

                }
            }
            }
        return list;
    }
    @Override
    public Atom visitAtomDict(PythonParser.AtomDictContext ctx) {
        int line = ctx.start.getLine();
        if(ctx.dictorsetmaker() != null) {
            return (Atom) visit(ctx.dictorsetmaker());
        }
        return new DictAtom(line,null);
    }

    @Override
    public NameAtom visitAtomName(PythonParser.AtomNameContext ctx) {
        int line  = ctx.start.getLine();
        String name = ctx.NAME().getText();
        NameAtom nameAtom = new NameAtom(line, name);
        return nameAtom;
    }

    @Override
    public NumberAtom visitAtomNumber(PythonParser.AtomNumberContext ctx) {
        int line  = ctx.start.getLine();
        String number = ctx.NUMBER().getText();
        NumberAtom numberAtom = new NumberAtom(line, number);
        return numberAtom;    }

    @Override
    public StringAtom visitAtomString(PythonParser.AtomStringContext ctx) {
        int line  = ctx.start.getLine();
        StringAtom stringAtom = new StringAtom(line);
        for (int i = 0;i<ctx.STRING().size();i++) {
            stringAtom.addString(ctx.STRING().get(i).getText());
        }
        return stringAtom;
    }

    @Override
    public EllipsisAtom visitAtomEllipsis(PythonParser.AtomEllipsisContext ctx) {
        int line  = ctx.start.getLine();
        EllipsisAtom ellipsisAtom = new EllipsisAtom(line);
        return ellipsisAtom;
    }

    @Override
    public NoneAtom visitAtomNone(PythonParser.AtomNoneContext ctx) {
        int line  = ctx.start.getLine();
        NoneAtom noneAtom = new NoneAtom(line);
        return noneAtom;
    }

    @Override
    public BooleanAtom visitAtomTrue(PythonParser.AtomTrueContext ctx) {
        int line  = ctx.start.getLine();
        BooleanAtom atom = new BooleanAtom(line, true);
        return atom;
    }

    @Override
    public BooleanAtom visitAtomFalse(PythonParser.AtomFalseContext ctx) {
        int line  = ctx.start.getLine();
        BooleanAtom atom = new BooleanAtom(line, false);
        return atom;    }


    @Override
    public SubscriptList visitSubscriptlist(PythonParser.SubscriptlistContext ctx) {
        int line = ctx.start.getLine();
        SubscriptList subscriptList = new SubscriptList(line);
        for (int i = 0;i < ctx.subscript().size();i++) {
            Subscript subscript = (Subscript) visit(ctx.subscript().get(i));
            subscriptList.addSubscript(subscript);
        }
        return subscriptList;
    }

    @Override
    public SubscriptIndex visitSubscriptTest(PythonParser.SubscriptTestContext ctx) {
        int line = ctx.start.getLine();
        Expr expr = (Expr) visit(ctx.test());
        SubscriptIndex subscriptIndex = new SubscriptIndex(line, expr);
        return subscriptIndex;
    }

    @Override
    public SubscriptSlice visitSubscriptSlice(PythonParser.SubscriptSliceContext ctx) {
        int line = ctx.start.getLine();
        Expr start = null;
        Expr end = null;
        Expr steps = null;
        if(ctx.test() != null){
            start = (Expr) visit(ctx.test());
        }
        if (ctx.sliceEnd().test() != null) {
            end = (Expr) visit(ctx.sliceEnd().test());
        }
        if(ctx.sliceop() != null && ctx.sliceop().test() != null) {
            steps = (Expr) visit(ctx.sliceop().test());
        }
        SubscriptSlice subscriptSlice = new SubscriptSlice(line, start, end, steps);
        return subscriptSlice;
    }


    @Override
    public Expr visitExprlist(PythonParser.ExprlistContext ctx) {
        int line = ctx.start.getLine();
        boolean hasComma = !ctx.COMMA().isEmpty();
        List<Expr> elements = new ArrayList<>();
        TupleExpr expression = new TupleExpr(line);
        for (int i = 0;i< ctx.children.size();i++) {
            if (ctx.getChild(i) instanceof PythonParser.Star_exprContext ||
            ctx.getChild(i) instanceof PythonParser.ExprContext) {
                Expr expr = (Expr) visit(ctx.getChild(i));
                elements.add(expr);
                expression.addElement(expr);
            }
        }
        if(elements.size() == 1 && !hasComma) {
            return elements.get(0);
        }

        return expression;

    }

    @Override
    public Expr visitTestlist(PythonParser.TestlistContext ctx) {
        int line  = ctx.start.getLine();
        boolean hasComma = !ctx.COMMA().isEmpty();
        TupleExpr tupleExpr = new TupleExpr(line);
        for (int i = 0; i< ctx.test().size();i++) {
            Expr expr = (Expr) visit(ctx.test().get(i));
            tupleExpr.addElement(expr);
        }
        if(tupleExpr.getElements().size() == 1 && !hasComma) {
            return tupleExpr.getElements().get(0);
        }

        return tupleExpr;
    }

    @Override
    public SetUnpack visitSetUnpack(PythonParser.SetUnpackContext ctx) {
        int line  = ctx.start.getLine();
        StarExpr expr = visitStar_expr(ctx.star_expr());
        SetUnpack setUnpack = new SetUnpack(line, expr);
        return setUnpack;
    }

    @Override
    public SetValue visitSetValue(PythonParser.SetValueContext ctx) {
        int line   = ctx.start.getLine();
        Expr value = (Expr) visit(ctx.test());
        SetValue setValue = new SetValue(line, value);
        return setValue;
    }

    @Override
    public DictUnpack visitDictUnpack(PythonParser.DictUnpackContext ctx) {
        int line =  ctx.start.getLine();
        Expr expr = visitExpr(ctx.expr());
        DictUnpack dictUnpack = new DictUnpack(line, expr);
        return dictUnpack;
    }

    @Override
    public DictEntry visitDictEntry(PythonParser.DictEntryContext ctx) {
        int line = ctx.start.getLine();
        Expr key = (Expr) visit(ctx.test().getFirst());
        Expr value = (Expr) visit(ctx.test().getLast());
        DictEntry dictEntry = new DictEntry(line, key, value);
        return dictEntry;
    }

    @Override
    public SetAtom visitSet_maker(PythonParser.Set_makerContext ctx) {
        int line  = ctx.start.getLine();
        CompForExpr compForExpr = null;
        if(ctx.comp_for() != null){
            compForExpr = (CompForExpr) visit(ctx.comp_for());
        }
        SetAtom setAtom = new SetAtom(line, compForExpr);
        for(int i = 0;i < ctx.set_element().size();i++){
            SetElement setElement = (SetElement) visit(ctx.set_element().get(i));
            setAtom.addElement(setElement);
        }
        return setAtom;
    }

    @Override
    public DictAtom visitDict_maker(PythonParser.Dict_makerContext ctx) {
        int line  = ctx.start.getLine();
        CompForExpr compForExpr = null;
        if(ctx.comp_for() != null){
            compForExpr = (CompForExpr) visit(ctx.comp_for());
        }
        DictAtom dictAtom = new DictAtom(line, compForExpr);
        for(int i = 0;i < ctx.dict_element().size();i++){
            DictElement dictElement = (DictElement) visit(ctx.dict_element().get(i));
            dictAtom.addElement(dictElement);
        }
        return dictAtom;    }

    @Override
    public SetAtom visitSetMaker(PythonParser.SetMakerContext ctx) {
        return visitSet_maker(ctx.set_maker());
    }

    @Override
    public DictAtom visitDictMaker(PythonParser.DictMakerContext ctx) {
        return visitDict_maker(ctx.dict_maker());
    }


    @Override
    public ArgumentComp visitArgumentComp(PythonParser.ArgumentCompContext ctx) {
        int line = ctx.start.getLine();
        Expr expr = (Expr) visit(ctx.test());
        CompForExpr compForExpr = null;
        if(ctx.comp_for() != null){
            compForExpr = (CompForExpr) visit(ctx.comp_for());
        }
        ArgumentComp argumentComp = new ArgumentComp(line, expr, compForExpr);
        return argumentComp;
    }

    @Override
    public ArgumentEqual visitArgumentEqual(PythonParser.ArgumentEqualContext ctx) {
        int line = ctx.start.getLine();
        Expr name = (Expr) visit(ctx.test().getFirst());
        Expr value = (Expr) visit(ctx.test().getLast());
        ArgumentEqual argumentEqual = new ArgumentEqual(line, name, value);
        return argumentEqual;
    }

    @Override
    public ArgumentDoubleStar visitArgumentDoubleStar(PythonParser.ArgumentDoubleStarContext ctx) {
        int line = ctx.start.getLine();
        Expr expr = (Expr) visit(ctx.test());
        ArgumentDoubleStar argumentDoubleStar = new ArgumentDoubleStar(line, expr);
        return argumentDoubleStar;
    }

    @Override
    public ArgumentStar visitArgumentStar(PythonParser.ArgumentStarContext ctx) {
        int line = ctx.start.getLine();
        Expr expr = (Expr) visit(ctx.test());
        ArgumentStar argumentStar = new ArgumentStar(line, expr);
        return argumentStar;
    }

    @Override
    public CompForExpr visitCompIterFor(PythonParser.CompIterForContext ctx) {
        return visitComp_for(ctx.comp_for());
    }

    @Override
    public CompIfExpr visitCompIterIf(PythonParser.CompIterIfContext ctx) {
        return visitComp_if(ctx.comp_if());
    }

    @Override
    public CompForExpr visitComp_for(PythonParser.Comp_forContext ctx) {
        int line = ctx.start.getLine();
        Expr targets = visitExprlist(ctx.exprlist());
        Expr iterable = visitOr_test(ctx.or_test());
        Expr loop = null;
        if(ctx.comp_iter() != null) {
            loop = (Expr) visit(ctx.comp_iter());
        }
        CompForExpr compForExpr = new CompForExpr(line, targets, iterable, loop);
        return compForExpr;
    }

    @Override
    public CompIfExpr visitComp_if(PythonParser.Comp_ifContext ctx) {
        int line =  ctx.start.getLine();
        Expr expr = (Expr) visit(ctx.test_nocond());
        Expr loop = null;
        if(ctx.comp_iter() != null) {
            loop = (Expr) visit(ctx.comp_iter());
        }
        CompIfExpr compIfExpr = new CompIfExpr(line, expr, loop);
        return compIfExpr;
    }

    @Override
    public YieldExpr visitYield_expr(PythonParser.Yield_exprContext ctx) {
        int line =  ctx.start.getLine();
        Expr expr = (Expr) visit(ctx.yield_arg());
        YieldExpr yieldExpr = new YieldExpr(line, expr);
        return yieldExpr;
    }

    @Override
    public Expr visitYieldArgFrom(PythonParser.YieldArgFromContext ctx) {
        return (Expr) visit(ctx.test());
    }

    @Override
    public Expr visitYieldArgList(PythonParser.YieldArgListContext ctx) {
        return (Expr) visit(ctx.testlist());
    }

    @Override
    public Expr visitTestlist_star_expr(PythonParser.Testlist_star_exprContext ctx) {
        int line  = ctx.start.getLine();
        boolean hasComma = !ctx.COMMA().isEmpty();
        TupleExpr tupleExpr = new TupleExpr(line);
        for (int i = 0; i< ctx.testlistElement().size();i++) {
            if(ctx.testlistElement().get(i).test() != null) {
                Expr expr = (Expr) visit(ctx.testlistElement().get(i).test());
                tupleExpr.addElement(expr);
            }else {
                StarExpr starExpr = visitStar_expr(ctx.testlistElement().get(i).star_expr());
                tupleExpr.addElement(starExpr);
            }
        }
        if(tupleExpr.getElements().size() == 1 && !hasComma) {
            return tupleExpr.getElements().get(0);
        }

        return tupleExpr;
    }

    @Override
    public List<Variable> visitDoubleStarVariable(PythonParser.DoubleStarVariableContext ctx) {
        int line = ctx.start.getLine();
        List<Variable> variables = new ArrayList<>();
        String name = ctx.doubleStarVar().vfpdef().NAME().getText();
        DoubleStarVariable variable = new DoubleStarVariable(line, name);
        variables.add(variable);
        return variables;
    }

    @Override
    public List<Variable> visitStarVariable(PythonParser.StarVariableContext ctx) {
        int line = ctx.start.getLine();
        List<Variable> variables = new ArrayList<>();

        String name = null;
        if (ctx.vfpdef() != null) {
            name = ctx.vfpdef().NAME().getText();

        }
        variables.add(new StarVariable(line, name));
        if(ctx.normalVar() != null) {
            for (int i = 0; i < ctx.normalVar().size(); i++) {
                String name2 = ctx.normalVar().get(i).vfpdef().NAME().getText();

                Expr value = null;
                if (ctx.normalVar().get(i).EQUAL() != null) {
                    value = (Expr) visit(ctx.normalVar().get(i).test());
                }
                variables.add(new NormalVariable(line, name2, value));

            }
        }
        if (ctx.doubleStarVar() != null) {
            String name3 = ctx.doubleStarVar().vfpdef().NAME().getText();

            variables.add(new DoubleStarVariable(line, name3));
        }

        return variables;    }

    @Override
    public List<Variable> visitNormalVariable(PythonParser.NormalVariableContext ctx) {
        int line = ctx.start.getLine();
        List<Variable> variables = new ArrayList<>();
        for (int i = 0 ; i < ctx.normalVar().size(); i++) {
            String name = ctx.normalVar().get(i).vfpdef().NAME().getText();
            Expr value = null;
            if (ctx.normalVar().get(i).EQUAL() != null) {
                value = (Expr) visit(ctx.normalVar().get(i).test());
            }
            variables.add(new NormalVariable(line, name, value));
        }
        return variables;
    }

}
