// Generated from C:/Users/HP/Desktop/UniProjects/Compiler Project/Grammars/PythonParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonParser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(PythonParser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtSimple}
	 * labeled alternative in {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtSimple(PythonParser.StmtSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtCompound}
	 * labeled alternative in {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtCompound(PythonParser.StmtCompoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(PythonParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SmallStmtExpr}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallStmtExpr(PythonParser.SmallStmtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SmallStmtDel}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallStmtDel(PythonParser.SmallStmtDelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SmallStmtPass}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallStmtPass(PythonParser.SmallStmtPassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SmallStmtFlow}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallStmtFlow(PythonParser.SmallStmtFlowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SmallStmtImport}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallStmtImport(PythonParser.SmallStmtImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SmallStmtGlobal}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallStmtGlobal(PythonParser.SmallStmtGlobalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SmallStmtNonlocal}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallStmtNonlocal(PythonParser.SmallStmtNonlocalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SmallStmtAssert}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallStmtAssert(PythonParser.SmallStmtAssertContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(PythonParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugAssignPlus}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugAssignPlus(PythonParser.AugAssignPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugAssignMinus}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugAssignMinus(PythonParser.AugAssignMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugAssignStar}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugAssignStar(PythonParser.AugAssignStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugAssignSlash}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugAssignSlash(PythonParser.AugAssignSlashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugAssignPercent}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugAssignPercent(PythonParser.AugAssignPercentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugAssignAt}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugAssignAt(PythonParser.AugAssignAtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugAssignDoubleStar}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugAssignDoubleStar(PythonParser.AugAssignDoubleStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#del_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDel_stmt(PythonParser.Del_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#pass_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_stmt(PythonParser.Pass_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlowStmtBreak}
	 * labeled alternative in {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlowStmtBreak(PythonParser.FlowStmtBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlowStmtContinue}
	 * labeled alternative in {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlowStmtContinue(PythonParser.FlowStmtContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlowStmtReturn}
	 * labeled alternative in {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlowStmtReturn(PythonParser.FlowStmtReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlowStmtRaise}
	 * labeled alternative in {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlowStmtRaise(PythonParser.FlowStmtRaiseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlowStmtYield}
	 * labeled alternative in {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlowStmtYield(PythonParser.FlowStmtYieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(PythonParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(PythonParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(PythonParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#yield_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_stmt(PythonParser.Yield_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#raise_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_stmt(PythonParser.Raise_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStmtName}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmtName(PythonParser.ImportStmtNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStmtFrom}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmtFrom(PythonParser.ImportStmtFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(PythonParser.Import_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#import_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from(PythonParser.Import_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#import_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_name(PythonParser.Import_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dotted_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_name(PythonParser.Dotted_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#import_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_names(PythonParser.Import_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dotted_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_names(PythonParser.Dotted_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(PythonParser.Dotted_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#global_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_stmt(PythonParser.Global_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocal_stmt(PythonParser.Nonlocal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#assert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssert_stmt(PythonParser.Assert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundStmtIf}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStmtIf(PythonParser.CompoundStmtIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundStmtWhile}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStmtWhile(PythonParser.CompoundStmtWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundStmtFor}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStmtFor(PythonParser.CompoundStmtForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundStmtTry}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStmtTry(PythonParser.CompoundStmtTryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundStmtWith}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStmtWith(PythonParser.CompoundStmtWithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundStmtFunc}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStmtFunc(PythonParser.CompoundStmtFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundStmtClass}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStmtClass(PythonParser.CompoundStmtClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundStmtDecorated}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStmtDecorated(PythonParser.CompoundStmtDecoratedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(PythonParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(PythonParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(PythonParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#try_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_stmt(PythonParser.Try_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#with_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_stmt(PythonParser.With_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#with_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_item(PythonParser.With_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#except_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_clause(PythonParser.Except_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SuiteSimple}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuiteSimple(PythonParser.SuiteSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SuiteCompound}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuiteCompound(PythonParser.SuiteCompoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(PythonParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(PythonParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalParameter}
	 * labeled alternative in {@link PythonParser#typedargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalParameter(PythonParser.NormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarParaneter}
	 * labeled alternative in {@link PythonParser#typedargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarParaneter(PythonParser.StarParaneterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleStarParameter}
	 * labeled alternative in {@link PythonParser#typedargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleStarParameter(PythonParser.DoubleStarParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#normalPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalPar(PythonParser.NormalParContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#doubleStarPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleStarPar(PythonParser.DoubleStarParContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#tfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTfpdef(PythonParser.TfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#classdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(PythonParser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#decorated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorated(PythonParser.DecoratedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(PythonParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TestCond}
	 * labeled alternative in {@link PythonParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestCond(PythonParser.TestCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TestLambda}
	 * labeled alternative in {@link PythonParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestLambda(PythonParser.TestLambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TestNoCondOr}
	 * labeled alternative in {@link PythonParser#test_nocond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestNoCondOr(PythonParser.TestNoCondOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TestNoCondLambda}
	 * labeled alternative in {@link PythonParser#test_nocond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestNoCondLambda(PythonParser.TestNoCondLambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#lambdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef(PythonParser.LambdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef_nocond(PythonParser.Lambdef_nocondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#or_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_test(PythonParser.Or_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#and_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_test(PythonParser.And_testContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotTestNot}
	 * labeled alternative in {@link PythonParser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotTestNot(PythonParser.NotTestNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotTestComp}
	 * labeled alternative in {@link PythonParser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotTestComp(PythonParser.NotTestCompContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(PythonParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompOpLess}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOpLess(PythonParser.CompOpLessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompOpGreater}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOpGreater(PythonParser.CompOpGreaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompOpEq}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOpEq(PythonParser.CompOpEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompOpGe}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOpGe(PythonParser.CompOpGeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompOpLe}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOpLe(PythonParser.CompOpLeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompOpNe}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOpNe(PythonParser.CompOpNeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompOpIn}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOpIn(PythonParser.CompOpInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompOpNotIn}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOpNotIn(PythonParser.CompOpNotInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompOpIs}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOpIs(PythonParser.CompOpIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompOpIsNot}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOpIsNot(PythonParser.CompOpIsNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar_expr(PythonParser.Star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PythonParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#xor_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_expr(PythonParser.Xor_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(PythonParser.And_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#shift_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expr(PythonParser.Shift_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#shift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift(PythonParser.ShiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#arith_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_expr(PythonParser.Arith_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath(PythonParser.MathContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(PythonParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#terms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerms(PythonParser.TermsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactorUnary}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorUnary(PythonParser.FactorUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactorPower}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorPower(PythonParser.FactorPowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(PythonParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#atom_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_expr(PythonParser.Atom_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomParen}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomParen(PythonParser.AtomParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomList}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomList(PythonParser.AtomListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomDict}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomDict(PythonParser.AtomDictContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomName}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomName(PythonParser.AtomNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomNumber(PythonParser.AtomNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomString}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomString(PythonParser.AtomStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomEllipsis}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomEllipsis(PythonParser.AtomEllipsisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomNone}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomNone(PythonParser.AtomNoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomTrue}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomTrue(PythonParser.AtomTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomFalse}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomFalse(PythonParser.AtomFalseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#testlist_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_comp(PythonParser.Testlist_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#testlistElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlistElement(PythonParser.TestlistElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrailerCall}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailerCall(PythonParser.TrailerCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrailerIndex}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailerIndex(PythonParser.TrailerIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrailerDot}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailerDot(PythonParser.TrailerDotContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#subscriptlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptlist(PythonParser.SubscriptlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubscriptTest}
	 * labeled alternative in {@link PythonParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptTest(PythonParser.SubscriptTestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubscriptSlice}
	 * labeled alternative in {@link PythonParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptSlice(PythonParser.SubscriptSliceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#sliceEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceEnd(PythonParser.SliceEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#sliceop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceop(PythonParser.SliceopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(PythonParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#testlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist(PythonParser.TestlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictMaker}
	 * labeled alternative in {@link PythonParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictMaker(PythonParser.DictMakerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetMaker}
	 * labeled alternative in {@link PythonParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetMaker(PythonParser.SetMakerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dict_maker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict_maker(PythonParser.Dict_makerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#set_maker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_maker(PythonParser.Set_makerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictEntry}
	 * labeled alternative in {@link PythonParser#dict_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictEntry(PythonParser.DictEntryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictUnpack}
	 * labeled alternative in {@link PythonParser#dict_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictUnpack(PythonParser.DictUnpackContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetValue}
	 * labeled alternative in {@link PythonParser#set_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetValue(PythonParser.SetValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetUnpack}
	 * labeled alternative in {@link PythonParser#set_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetUnpack(PythonParser.SetUnpackContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(PythonParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentComp}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentComp(PythonParser.ArgumentCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentEqual}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentEqual(PythonParser.ArgumentEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentDoubleStar}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentDoubleStar(PythonParser.ArgumentDoubleStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentStar}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentStar(PythonParser.ArgumentStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompIterFor}
	 * labeled alternative in {@link PythonParser#comp_iter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompIterFor(PythonParser.CompIterForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompIterIf}
	 * labeled alternative in {@link PythonParser#comp_iter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompIterIf(PythonParser.CompIterIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#comp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_for(PythonParser.Comp_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#comp_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_if(PythonParser.Comp_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#yield_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_expr(PythonParser.Yield_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code YieldArgFrom}
	 * labeled alternative in {@link PythonParser#yield_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldArgFrom(PythonParser.YieldArgFromContext ctx);
	/**
	 * Visit a parse tree produced by the {@code YieldArgList}
	 * labeled alternative in {@link PythonParser#yield_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldArgList(PythonParser.YieldArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_star_expr(PythonParser.Testlist_star_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalVariable}
	 * labeled alternative in {@link PythonParser#varargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalVariable(PythonParser.NormalVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarVariable}
	 * labeled alternative in {@link PythonParser#varargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarVariable(PythonParser.StarVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleStarVariable}
	 * labeled alternative in {@link PythonParser#varargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleStarVariable(PythonParser.DoubleStarVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#normalVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalVar(PythonParser.NormalVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#doubleStarVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleStarVar(PythonParser.DoubleStarVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#vfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVfpdef(PythonParser.VfpdefContext ctx);
}