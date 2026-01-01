// Generated from C:/Users/HP/Desktop/UniProjects/Compiler Project/Grammars/PythonParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(PythonParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(PythonParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtSimple}
	 * labeled alternative in {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtSimple(PythonParser.StmtSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtSimple}
	 * labeled alternative in {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtSimple(PythonParser.StmtSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtCompound}
	 * labeled alternative in {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtCompound(PythonParser.StmtCompoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtCompound}
	 * labeled alternative in {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtCompound(PythonParser.StmtCompoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(PythonParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(PythonParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SmallStmtExpr}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmallStmtExpr(PythonParser.SmallStmtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SmallStmtExpr}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmallStmtExpr(PythonParser.SmallStmtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SmallStmtDel}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmallStmtDel(PythonParser.SmallStmtDelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SmallStmtDel}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmallStmtDel(PythonParser.SmallStmtDelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SmallStmtPass}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmallStmtPass(PythonParser.SmallStmtPassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SmallStmtPass}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmallStmtPass(PythonParser.SmallStmtPassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SmallStmtFlow}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmallStmtFlow(PythonParser.SmallStmtFlowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SmallStmtFlow}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmallStmtFlow(PythonParser.SmallStmtFlowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SmallStmtImport}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmallStmtImport(PythonParser.SmallStmtImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SmallStmtImport}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmallStmtImport(PythonParser.SmallStmtImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SmallStmtGlobal}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmallStmtGlobal(PythonParser.SmallStmtGlobalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SmallStmtGlobal}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmallStmtGlobal(PythonParser.SmallStmtGlobalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SmallStmtNonlocal}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmallStmtNonlocal(PythonParser.SmallStmtNonlocalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SmallStmtNonlocal}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmallStmtNonlocal(PythonParser.SmallStmtNonlocalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SmallStmtAssert}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmallStmtAssert(PythonParser.SmallStmtAssertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SmallStmtAssert}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmallStmtAssert(PythonParser.SmallStmtAssertContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(PythonParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(PythonParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugAssignPlus}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugAssignPlus(PythonParser.AugAssignPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugAssignPlus}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugAssignPlus(PythonParser.AugAssignPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugAssignMinus}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugAssignMinus(PythonParser.AugAssignMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugAssignMinus}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugAssignMinus(PythonParser.AugAssignMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugAssignStar}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugAssignStar(PythonParser.AugAssignStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugAssignStar}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugAssignStar(PythonParser.AugAssignStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugAssignSlash}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugAssignSlash(PythonParser.AugAssignSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugAssignSlash}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugAssignSlash(PythonParser.AugAssignSlashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugAssignPercent}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugAssignPercent(PythonParser.AugAssignPercentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugAssignPercent}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugAssignPercent(PythonParser.AugAssignPercentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugAssignAt}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugAssignAt(PythonParser.AugAssignAtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugAssignAt}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugAssignAt(PythonParser.AugAssignAtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugAssignDoubleStar}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugAssignDoubleStar(PythonParser.AugAssignDoubleStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugAssignDoubleStar}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugAssignDoubleStar(PythonParser.AugAssignDoubleStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDel_stmt(PythonParser.Del_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDel_stmt(PythonParser.Del_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPass_stmt(PythonParser.Pass_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPass_stmt(PythonParser.Pass_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlowStmtBreak}
	 * labeled alternative in {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlowStmtBreak(PythonParser.FlowStmtBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlowStmtBreak}
	 * labeled alternative in {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlowStmtBreak(PythonParser.FlowStmtBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlowStmtContinue}
	 * labeled alternative in {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlowStmtContinue(PythonParser.FlowStmtContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlowStmtContinue}
	 * labeled alternative in {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlowStmtContinue(PythonParser.FlowStmtContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlowStmtReturn}
	 * labeled alternative in {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlowStmtReturn(PythonParser.FlowStmtReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlowStmtReturn}
	 * labeled alternative in {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlowStmtReturn(PythonParser.FlowStmtReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlowStmtRaise}
	 * labeled alternative in {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlowStmtRaise(PythonParser.FlowStmtRaiseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlowStmtRaise}
	 * labeled alternative in {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlowStmtRaise(PythonParser.FlowStmtRaiseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlowStmtYield}
	 * labeled alternative in {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlowStmtYield(PythonParser.FlowStmtYieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlowStmtYield}
	 * labeled alternative in {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlowStmtYield(PythonParser.FlowStmtYieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(PythonParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(PythonParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(PythonParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(PythonParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(PythonParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(PythonParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void enterYield_stmt(PythonParser.Yield_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void exitYield_stmt(PythonParser.Yield_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(PythonParser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(PythonParser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStmtName}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmtName(PythonParser.ImportStmtNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStmtName}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmtName(PythonParser.ImportStmtNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStmtFrom}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmtFrom(PythonParser.ImportStmtFromContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStmtFrom}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmtFrom(PythonParser.ImportStmtFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(PythonParser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(PythonParser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#import_from}.
	 * @param ctx the parse tree
	 */
	void enterImport_from(PythonParser.Import_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#import_from}.
	 * @param ctx the parse tree
	 */
	void exitImport_from(PythonParser.Import_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_name(PythonParser.Import_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_name(PythonParser.Import_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_name(PythonParser.Dotted_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_name(PythonParser.Dotted_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(PythonParser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(PythonParser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_names(PythonParser.Dotted_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_names(PythonParser.Dotted_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(PythonParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(PythonParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(PythonParser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(PythonParser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_stmt(PythonParser.Nonlocal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_stmt(PythonParser.Nonlocal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssert_stmt(PythonParser.Assert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssert_stmt(PythonParser.Assert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundStmtIf}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStmtIf(PythonParser.CompoundStmtIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundStmtIf}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStmtIf(PythonParser.CompoundStmtIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundStmtWhile}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStmtWhile(PythonParser.CompoundStmtWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundStmtWhile}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStmtWhile(PythonParser.CompoundStmtWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundStmtFor}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStmtFor(PythonParser.CompoundStmtForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundStmtFor}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStmtFor(PythonParser.CompoundStmtForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundStmtTry}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStmtTry(PythonParser.CompoundStmtTryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundStmtTry}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStmtTry(PythonParser.CompoundStmtTryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundStmtWith}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStmtWith(PythonParser.CompoundStmtWithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundStmtWith}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStmtWith(PythonParser.CompoundStmtWithContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundStmtFunc}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStmtFunc(PythonParser.CompoundStmtFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundStmtFunc}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStmtFunc(PythonParser.CompoundStmtFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundStmtClass}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStmtClass(PythonParser.CompoundStmtClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundStmtClass}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStmtClass(PythonParser.CompoundStmtClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundStmtDecorated}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStmtDecorated(PythonParser.CompoundStmtDecoratedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundStmtDecorated}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStmtDecorated(PythonParser.CompoundStmtDecoratedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(PythonParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(PythonParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(PythonParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(PythonParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(PythonParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(PythonParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmt(PythonParser.Try_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmt(PythonParser.Try_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWith_stmt(PythonParser.With_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWith_stmt(PythonParser.With_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#with_item}.
	 * @param ctx the parse tree
	 */
	void enterWith_item(PythonParser.With_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#with_item}.
	 * @param ctx the parse tree
	 */
	void exitWith_item(PythonParser.With_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clause(PythonParser.Except_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clause(PythonParser.Except_clauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuiteSimple}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuiteSimple(PythonParser.SuiteSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuiteSimple}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuiteSimple(PythonParser.SuiteSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuiteCompound}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuiteCompound(PythonParser.SuiteCompoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuiteCompound}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuiteCompound(PythonParser.SuiteCompoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(PythonParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(PythonParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(PythonParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(PythonParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalParameter}
	 * labeled alternative in {@link PythonParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterNormalParameter(PythonParser.NormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalParameter}
	 * labeled alternative in {@link PythonParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitNormalParameter(PythonParser.NormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarParaneter}
	 * labeled alternative in {@link PythonParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterStarParaneter(PythonParser.StarParaneterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarParaneter}
	 * labeled alternative in {@link PythonParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitStarParaneter(PythonParser.StarParaneterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleStarParameter}
	 * labeled alternative in {@link PythonParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterDoubleStarParameter(PythonParser.DoubleStarParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleStarParameter}
	 * labeled alternative in {@link PythonParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitDoubleStarParameter(PythonParser.DoubleStarParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#normalPar}.
	 * @param ctx the parse tree
	 */
	void enterNormalPar(PythonParser.NormalParContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#normalPar}.
	 * @param ctx the parse tree
	 */
	void exitNormalPar(PythonParser.NormalParContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#doubleStarPar}.
	 * @param ctx the parse tree
	 */
	void enterDoubleStarPar(PythonParser.DoubleStarParContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#doubleStarPar}.
	 * @param ctx the parse tree
	 */
	void exitDoubleStarPar(PythonParser.DoubleStarParContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void enterTfpdef(PythonParser.TfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void exitTfpdef(PythonParser.TfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(PythonParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(PythonParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#decorated}.
	 * @param ctx the parse tree
	 */
	void enterDecorated(PythonParser.DecoratedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#decorated}.
	 * @param ctx the parse tree
	 */
	void exitDecorated(PythonParser.DecoratedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(PythonParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(PythonParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TestCond}
	 * labeled alternative in {@link PythonParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTestCond(PythonParser.TestCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TestCond}
	 * labeled alternative in {@link PythonParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTestCond(PythonParser.TestCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TestLambda}
	 * labeled alternative in {@link PythonParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTestLambda(PythonParser.TestLambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TestLambda}
	 * labeled alternative in {@link PythonParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTestLambda(PythonParser.TestLambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TestNoCondOr}
	 * labeled alternative in {@link PythonParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void enterTestNoCondOr(PythonParser.TestNoCondOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TestNoCondOr}
	 * labeled alternative in {@link PythonParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void exitTestNoCondOr(PythonParser.TestNoCondOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TestNoCondLambda}
	 * labeled alternative in {@link PythonParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void enterTestNoCondLambda(PythonParser.TestNoCondLambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TestNoCondLambda}
	 * labeled alternative in {@link PythonParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void exitTestNoCondLambda(PythonParser.TestNoCondLambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void enterLambdef(PythonParser.LambdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void exitLambdef(PythonParser.LambdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void enterLambdef_nocond(PythonParser.Lambdef_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void exitLambdef_nocond(PythonParser.Lambdef_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(PythonParser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(PythonParser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(PythonParser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(PythonParser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotTestNot}
	 * labeled alternative in {@link PythonParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNotTestNot(PythonParser.NotTestNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotTestNot}
	 * labeled alternative in {@link PythonParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNotTestNot(PythonParser.NotTestNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotTestComp}
	 * labeled alternative in {@link PythonParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNotTestComp(PythonParser.NotTestCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotTestComp}
	 * labeled alternative in {@link PythonParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNotTestComp(PythonParser.NotTestCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(PythonParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(PythonParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompOpLess}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterCompOpLess(PythonParser.CompOpLessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompOpLess}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitCompOpLess(PythonParser.CompOpLessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompOpGreater}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterCompOpGreater(PythonParser.CompOpGreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompOpGreater}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitCompOpGreater(PythonParser.CompOpGreaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompOpEq}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterCompOpEq(PythonParser.CompOpEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompOpEq}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitCompOpEq(PythonParser.CompOpEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompOpGe}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterCompOpGe(PythonParser.CompOpGeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompOpGe}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitCompOpGe(PythonParser.CompOpGeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompOpLe}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterCompOpLe(PythonParser.CompOpLeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompOpLe}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitCompOpLe(PythonParser.CompOpLeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompOpNe}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterCompOpNe(PythonParser.CompOpNeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompOpNe}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitCompOpNe(PythonParser.CompOpNeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompOpIn}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterCompOpIn(PythonParser.CompOpInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompOpIn}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitCompOpIn(PythonParser.CompOpInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompOpNotIn}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterCompOpNotIn(PythonParser.CompOpNotInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompOpNotIn}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitCompOpNotIn(PythonParser.CompOpNotInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompOpIs}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterCompOpIs(PythonParser.CompOpIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompOpIs}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitCompOpIs(PythonParser.CompOpIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompOpIsNot}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterCompOpIsNot(PythonParser.CompOpIsNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompOpIsNot}
	 * labeled alternative in {@link PythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitCompOpIsNot(PythonParser.CompOpIsNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void enterStar_expr(PythonParser.Star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void exitStar_expr(PythonParser.Star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PythonParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PythonParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void enterXor_expr(PythonParser.Xor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void exitXor_expr(PythonParser.Xor_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(PythonParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(PythonParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr(PythonParser.Shift_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr(PythonParser.Shift_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#shift}.
	 * @param ctx the parse tree
	 */
	void enterShift(PythonParser.ShiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#shift}.
	 * @param ctx the parse tree
	 */
	void exitShift(PythonParser.ShiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(PythonParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(PythonParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMath(PythonParser.MathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMath(PythonParser.MathContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PythonParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PythonParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(PythonParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(PythonParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorUnary}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorUnary(PythonParser.FactorUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorUnary}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorUnary(PythonParser.FactorUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorPower}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorPower(PythonParser.FactorPowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorPower}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorPower(PythonParser.FactorPowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(PythonParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(PythonParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom_expr(PythonParser.Atom_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom_expr(PythonParser.Atom_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomParen}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomParen(PythonParser.AtomParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomParen}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomParen(PythonParser.AtomParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomList}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomList(PythonParser.AtomListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomList}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomList(PythonParser.AtomListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomDict}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomDict(PythonParser.AtomDictContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomDict}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomDict(PythonParser.AtomDictContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomName}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomName(PythonParser.AtomNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomName}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomName(PythonParser.AtomNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomNumber(PythonParser.AtomNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomNumber(PythonParser.AtomNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomString}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomString(PythonParser.AtomStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomString}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomString(PythonParser.AtomStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomEllipsis}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomEllipsis(PythonParser.AtomEllipsisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomEllipsis}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomEllipsis(PythonParser.AtomEllipsisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomNone}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomNone(PythonParser.AtomNoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomNone}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomNone(PythonParser.AtomNoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomTrue}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomTrue(PythonParser.AtomTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomTrue}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomTrue(PythonParser.AtomTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomFalse}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomFalse(PythonParser.AtomFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomFalse}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomFalse(PythonParser.AtomFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_comp(PythonParser.Testlist_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_comp(PythonParser.Testlist_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#testlistElement}.
	 * @param ctx the parse tree
	 */
	void enterTestlistElement(PythonParser.TestlistElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#testlistElement}.
	 * @param ctx the parse tree
	 */
	void exitTestlistElement(PythonParser.TestlistElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrailerCall}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailerCall(PythonParser.TrailerCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrailerCall}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailerCall(PythonParser.TrailerCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrailerIndex}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailerIndex(PythonParser.TrailerIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrailerIndex}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailerIndex(PythonParser.TrailerIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrailerDot}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailerDot(PythonParser.TrailerDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrailerDot}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailerDot(PythonParser.TrailerDotContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptlist(PythonParser.SubscriptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptlist(PythonParser.SubscriptlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubscriptTest}
	 * labeled alternative in {@link PythonParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptTest(PythonParser.SubscriptTestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubscriptTest}
	 * labeled alternative in {@link PythonParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptTest(PythonParser.SubscriptTestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubscriptSlice}
	 * labeled alternative in {@link PythonParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptSlice(PythonParser.SubscriptSliceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubscriptSlice}
	 * labeled alternative in {@link PythonParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptSlice(PythonParser.SubscriptSliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#sliceEnd}.
	 * @param ctx the parse tree
	 */
	void enterSliceEnd(PythonParser.SliceEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#sliceEnd}.
	 * @param ctx the parse tree
	 */
	void exitSliceEnd(PythonParser.SliceEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void enterSliceop(PythonParser.SliceopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void exitSliceop(PythonParser.SliceopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(PythonParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(PythonParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#testlist}.
	 * @param ctx the parse tree
	 */
	void enterTestlist(PythonParser.TestlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#testlist}.
	 * @param ctx the parse tree
	 */
	void exitTestlist(PythonParser.TestlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictMaker}
	 * labeled alternative in {@link PythonParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void enterDictMaker(PythonParser.DictMakerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictMaker}
	 * labeled alternative in {@link PythonParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void exitDictMaker(PythonParser.DictMakerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetMaker}
	 * labeled alternative in {@link PythonParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void enterSetMaker(PythonParser.SetMakerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetMaker}
	 * labeled alternative in {@link PythonParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void exitSetMaker(PythonParser.SetMakerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dict_maker}.
	 * @param ctx the parse tree
	 */
	void enterDict_maker(PythonParser.Dict_makerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dict_maker}.
	 * @param ctx the parse tree
	 */
	void exitDict_maker(PythonParser.Dict_makerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#set_maker}.
	 * @param ctx the parse tree
	 */
	void enterSet_maker(PythonParser.Set_makerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#set_maker}.
	 * @param ctx the parse tree
	 */
	void exitSet_maker(PythonParser.Set_makerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictEntry}
	 * labeled alternative in {@link PythonParser#dict_element}.
	 * @param ctx the parse tree
	 */
	void enterDictEntry(PythonParser.DictEntryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictEntry}
	 * labeled alternative in {@link PythonParser#dict_element}.
	 * @param ctx the parse tree
	 */
	void exitDictEntry(PythonParser.DictEntryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictUnpack}
	 * labeled alternative in {@link PythonParser#dict_element}.
	 * @param ctx the parse tree
	 */
	void enterDictUnpack(PythonParser.DictUnpackContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictUnpack}
	 * labeled alternative in {@link PythonParser#dict_element}.
	 * @param ctx the parse tree
	 */
	void exitDictUnpack(PythonParser.DictUnpackContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetValue}
	 * labeled alternative in {@link PythonParser#set_element}.
	 * @param ctx the parse tree
	 */
	void enterSetValue(PythonParser.SetValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetValue}
	 * labeled alternative in {@link PythonParser#set_element}.
	 * @param ctx the parse tree
	 */
	void exitSetValue(PythonParser.SetValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetUnpack}
	 * labeled alternative in {@link PythonParser#set_element}.
	 * @param ctx the parse tree
	 */
	void enterSetUnpack(PythonParser.SetUnpackContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetUnpack}
	 * labeled alternative in {@link PythonParser#set_element}.
	 * @param ctx the parse tree
	 */
	void exitSetUnpack(PythonParser.SetUnpackContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(PythonParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(PythonParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentComp}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgumentComp(PythonParser.ArgumentCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentComp}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgumentComp(PythonParser.ArgumentCompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentEqual}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgumentEqual(PythonParser.ArgumentEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentEqual}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgumentEqual(PythonParser.ArgumentEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentDoubleStar}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgumentDoubleStar(PythonParser.ArgumentDoubleStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentDoubleStar}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgumentDoubleStar(PythonParser.ArgumentDoubleStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentStar}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgumentStar(PythonParser.ArgumentStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentStar}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgumentStar(PythonParser.ArgumentStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompIterFor}
	 * labeled alternative in {@link PythonParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void enterCompIterFor(PythonParser.CompIterForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompIterFor}
	 * labeled alternative in {@link PythonParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void exitCompIterFor(PythonParser.CompIterForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompIterIf}
	 * labeled alternative in {@link PythonParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void enterCompIterIf(PythonParser.CompIterIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompIterIf}
	 * labeled alternative in {@link PythonParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void exitCompIterIf(PythonParser.CompIterIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(PythonParser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(PythonParser.Comp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void enterComp_if(PythonParser.Comp_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void exitComp_if(PythonParser.Comp_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void enterYield_expr(PythonParser.Yield_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void exitYield_expr(PythonParser.Yield_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code YieldArgFrom}
	 * labeled alternative in {@link PythonParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void enterYieldArgFrom(PythonParser.YieldArgFromContext ctx);
	/**
	 * Exit a parse tree produced by the {@code YieldArgFrom}
	 * labeled alternative in {@link PythonParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void exitYieldArgFrom(PythonParser.YieldArgFromContext ctx);
	/**
	 * Enter a parse tree produced by the {@code YieldArgList}
	 * labeled alternative in {@link PythonParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void enterYieldArgList(PythonParser.YieldArgListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code YieldArgList}
	 * labeled alternative in {@link PythonParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void exitYieldArgList(PythonParser.YieldArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_star_expr(PythonParser.Testlist_star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_star_expr(PythonParser.Testlist_star_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalVariable}
	 * labeled alternative in {@link PythonParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void enterNormalVariable(PythonParser.NormalVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalVariable}
	 * labeled alternative in {@link PythonParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void exitNormalVariable(PythonParser.NormalVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarVariable}
	 * labeled alternative in {@link PythonParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void enterStarVariable(PythonParser.StarVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarVariable}
	 * labeled alternative in {@link PythonParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void exitStarVariable(PythonParser.StarVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleStarVariable}
	 * labeled alternative in {@link PythonParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void enterDoubleStarVariable(PythonParser.DoubleStarVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleStarVariable}
	 * labeled alternative in {@link PythonParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void exitDoubleStarVariable(PythonParser.DoubleStarVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#normalVar}.
	 * @param ctx the parse tree
	 */
	void enterNormalVar(PythonParser.NormalVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#normalVar}.
	 * @param ctx the parse tree
	 */
	void exitNormalVar(PythonParser.NormalVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#doubleStarVar}.
	 * @param ctx the parse tree
	 */
	void enterDoubleStarVar(PythonParser.DoubleStarVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#doubleStarVar}.
	 * @param ctx the parse tree
	 */
	void exitDoubleStarVar(PythonParser.DoubleStarVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void enterVfpdef(PythonParser.VfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void exitVfpdef(PythonParser.VfpdefContext ctx);
}