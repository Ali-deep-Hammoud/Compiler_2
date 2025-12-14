// Generated from C:/Users/HP/Desktop/UniProjects/Compiler Project/Grammars/JinjaHtmlParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JinjaHtmlParser}.
 */
public interface JinjaHtmlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(JinjaHtmlParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(JinjaHtmlParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BaseDocument}
	 * labeled alternative in {@link JinjaHtmlParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void enterBaseDocument(JinjaHtmlParser.BaseDocumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BaseDocument}
	 * labeled alternative in {@link JinjaHtmlParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void exitBaseDocument(JinjaHtmlParser.BaseDocumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TopLevelComment}
	 * labeled alternative in {@link JinjaHtmlParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelComment(JinjaHtmlParser.TopLevelCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TopLevelComment}
	 * labeled alternative in {@link JinjaHtmlParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelComment(JinjaHtmlParser.TopLevelCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TopLevelText}
	 * labeled alternative in {@link JinjaHtmlParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelText(JinjaHtmlParser.TopLevelTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TopLevelText}
	 * labeled alternative in {@link JinjaHtmlParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelText(JinjaHtmlParser.TopLevelTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Html}
	 * labeled alternative in {@link JinjaHtmlParser#document}.
	 * @param ctx the parse tree
	 */
	void enterHtml(JinjaHtmlParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Html}
	 * labeled alternative in {@link JinjaHtmlParser#document}.
	 * @param ctx the parse tree
	 */
	void exitHtml(JinjaHtmlParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jinja}
	 * labeled alternative in {@link JinjaHtmlParser#document}.
	 * @param ctx the parse tree
	 */
	void enterJinja(JinjaHtmlParser.JinjaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jinja}
	 * labeled alternative in {@link JinjaHtmlParser#document}.
	 * @param ctx the parse tree
	 */
	void exitJinja(JinjaHtmlParser.JinjaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlElement}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(JinjaHtmlParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlElement}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(JinjaHtmlParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleHtml}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void enterSingleHtml(JinjaHtmlParser.SingleHtmlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleHtml}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void exitSingleHtml(JinjaHtmlParser.SingleHtmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaExpression}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpression(JinjaHtmlParser.JinjaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaExpression}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpression(JinjaHtmlParser.JinjaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaStatement}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void enterJinjaStatement(JinjaHtmlParser.JinjaStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaStatement}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void exitJinjaStatement(JinjaHtmlParser.JinjaStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaComment}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void enterJinjaComment(JinjaHtmlParser.JinjaCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaComment}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void exitJinjaComment(JinjaHtmlParser.JinjaCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaConditionStatement}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void enterJinjaConditionStatement(JinjaHtmlParser.JinjaConditionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaConditionStatement}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void exitJinjaConditionStatement(JinjaHtmlParser.JinjaConditionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaBlockPlace}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlockPlace(JinjaHtmlParser.JinjaBlockPlaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaBlockPlace}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlockPlace(JinjaHtmlParser.JinjaBlockPlaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaLoop}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void enterJinjaLoop(JinjaHtmlParser.JinjaLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaLoop}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void exitJinjaLoop(JinjaHtmlParser.JinjaLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlComment}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(JinjaHtmlParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlComment}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(JinjaHtmlParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(JinjaHtmlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(JinjaHtmlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Text}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void enterText(JinjaHtmlParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void exitText(JinjaHtmlParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#startElement}.
	 * @param ctx the parse tree
	 */
	void enterStartElement(JinjaHtmlParser.StartElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#startElement}.
	 * @param ctx the parse tree
	 */
	void exitStartElement(JinjaHtmlParser.StartElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#endElement}.
	 * @param ctx the parse tree
	 */
	void enterEndElement(JinjaHtmlParser.EndElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#endElement}.
	 * @param ctx the parse tree
	 */
	void exitEndElement(JinjaHtmlParser.EndElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#singleElement}.
	 * @param ctx the parse tree
	 */
	void enterSingleElement(JinjaHtmlParser.SingleElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#singleElement}.
	 * @param ctx the parse tree
	 */
	void exitSingleElement(JinjaHtmlParser.SingleElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(JinjaHtmlParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(JinjaHtmlParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaInheritance}.
	 * @param ctx the parse tree
	 */
	void enterJinjaInheritance(JinjaHtmlParser.JinjaInheritanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaInheritance}.
	 * @param ctx the parse tree
	 */
	void exitJinjaInheritance(JinjaHtmlParser.JinjaInheritanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#inheritanceStart}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceStart(JinjaHtmlParser.InheritanceStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#inheritanceStart}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceStart(JinjaHtmlParser.InheritanceStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlock(JinjaHtmlParser.JinjaBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlock(JinjaHtmlParser.JinjaBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaBlockStart}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlockStart(JinjaHtmlParser.JinjaBlockStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaBlockStart}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlockStart(JinjaHtmlParser.JinjaBlockStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaBlockeEnd}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlockeEnd(JinjaHtmlParser.JinjaBlockeEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaBlockeEnd}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlockeEnd(JinjaHtmlParser.JinjaBlockeEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaSuperBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaSuperBlock(JinjaHtmlParser.JinjaSuperBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaSuperBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaSuperBlock(JinjaHtmlParser.JinjaSuperBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaConditionStmt}.
	 * @param ctx the parse tree
	 */
	void enterJinjaConditionStmt(JinjaHtmlParser.JinjaConditionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaConditionStmt}.
	 * @param ctx the parse tree
	 */
	void exitJinjaConditionStmt(JinjaHtmlParser.JinjaConditionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaIf}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIf(JinjaHtmlParser.JinjaIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaIf}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIf(JinjaHtmlParser.JinjaIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaElseIf}.
	 * @param ctx the parse tree
	 */
	void enterJinjaElseIf(JinjaHtmlParser.JinjaElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaElseIf}.
	 * @param ctx the parse tree
	 */
	void exitJinjaElseIf(JinjaHtmlParser.JinjaElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaElse}.
	 * @param ctx the parse tree
	 */
	void enterJinjaElse(JinjaHtmlParser.JinjaElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaElse}.
	 * @param ctx the parse tree
	 */
	void exitJinjaElse(JinjaHtmlParser.JinjaElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaEndIf}.
	 * @param ctx the parse tree
	 */
	void enterJinjaEndIf(JinjaHtmlParser.JinjaEndIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaEndIf}.
	 * @param ctx the parse tree
	 */
	void exitJinjaEndIf(JinjaHtmlParser.JinjaEndIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaParentecesCondition}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 */
	void enterJinjaParentecesCondition(JinjaHtmlParser.JinjaParentecesConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaParentecesCondition}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 */
	void exitJinjaParentecesCondition(JinjaHtmlParser.JinjaParentecesConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaConditionsRoot}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 */
	void enterJinjaConditionsRoot(JinjaHtmlParser.JinjaConditionsRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaConditionsRoot}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 */
	void exitJinjaConditionsRoot(JinjaHtmlParser.JinjaConditionsRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaCondition}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 */
	void enterJinjaCondition(JinjaHtmlParser.JinjaConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaCondition}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 */
	void exitJinjaCondition(JinjaHtmlParser.JinjaConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaVaraiableConditon}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 */
	void enterJinjaVaraiableConditon(JinjaHtmlParser.JinjaVaraiableConditonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaVaraiableConditon}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 */
	void exitJinjaVaraiableConditon(JinjaHtmlParser.JinjaVaraiableConditonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaCompareCondition}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 */
	void enterJinjaCompareCondition(JinjaHtmlParser.JinjaCompareConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaCompareCondition}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 */
	void exitJinjaCompareCondition(JinjaHtmlParser.JinjaCompareConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaForLoop}.
	 * @param ctx the parse tree
	 */
	void enterJinjaForLoop(JinjaHtmlParser.JinjaForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaForLoop}.
	 * @param ctx the parse tree
	 */
	void exitJinjaForLoop(JinjaHtmlParser.JinjaForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaFor}.
	 * @param ctx the parse tree
	 */
	void enterJinjaFor(JinjaHtmlParser.JinjaForContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaFor}.
	 * @param ctx the parse tree
	 */
	void exitJinjaFor(JinjaHtmlParser.JinjaForContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaEndFor}.
	 * @param ctx the parse tree
	 */
	void enterJinjaEndFor(JinjaHtmlParser.JinjaEndForContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaEndFor}.
	 * @param ctx the parse tree
	 */
	void exitJinjaEndFor(JinjaHtmlParser.JinjaEndForContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaVariable}.
	 * @param ctx the parse tree
	 */
	void enterJinjaVariable(JinjaHtmlParser.JinjaVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaVariable}.
	 * @param ctx the parse tree
	 */
	void exitJinjaVariable(JinjaHtmlParser.JinjaVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaExpr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpr(JinjaHtmlParser.JinjaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaExpr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpr(JinjaHtmlParser.JinjaExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaStmt}.
	 * @param ctx the parse tree
	 */
	void enterJinjaStmt(JinjaHtmlParser.JinjaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaStmt}.
	 * @param ctx the parse tree
	 */
	void exitJinjaStmt(JinjaHtmlParser.JinjaStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaComnt}.
	 * @param ctx the parse tree
	 */
	void enterJinjaComnt(JinjaHtmlParser.JinjaComntContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaComnt}.
	 * @param ctx the parse tree
	 */
	void exitJinjaComnt(JinjaHtmlParser.JinjaComntContext ctx);
}