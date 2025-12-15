// Generated from C:/Users/HP/Desktop/UniProjects/Compiler Project/Grammars/JinjaHtmlParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JinjaHtmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JinjaHtmlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(JinjaHtmlParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BaseDocument}
	 * labeled alternative in {@link JinjaHtmlParser#topLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseDocument(JinjaHtmlParser.BaseDocumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TopLevelComment}
	 * labeled alternative in {@link JinjaHtmlParser#topLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelComment(JinjaHtmlParser.TopLevelCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TopLevelText}
	 * labeled alternative in {@link JinjaHtmlParser#topLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelText(JinjaHtmlParser.TopLevelTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Html}
	 * labeled alternative in {@link JinjaHtmlParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(JinjaHtmlParser.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Jinja}
	 * labeled alternative in {@link JinjaHtmlParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja(JinjaHtmlParser.JinjaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlElement}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(JinjaHtmlParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StyleElement}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElement(JinjaHtmlParser.StyleElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleHtml}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleHtml(JinjaHtmlParser.SingleHtmlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaExpression}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpression(JinjaHtmlParser.JinjaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaStatement}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaStatement(JinjaHtmlParser.JinjaStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaComment}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaComment(JinjaHtmlParser.JinjaCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaConditionStatement}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaConditionStatement(JinjaHtmlParser.JinjaConditionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaBlockPlace}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlockPlace(JinjaHtmlParser.JinjaBlockPlaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaLoop}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaLoop(JinjaHtmlParser.JinjaLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlComment}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(JinjaHtmlParser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(JinjaHtmlParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(JinjaHtmlParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#startElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartElement(JinjaHtmlParser.StartElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#endElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndElement(JinjaHtmlParser.EndElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#singleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElement(JinjaHtmlParser.SingleElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(JinjaHtmlParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#jinjaInheritance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaInheritance(JinjaHtmlParser.JinjaInheritanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#inheritanceStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritanceStart(JinjaHtmlParser.InheritanceStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#styleStartElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleStartElement(JinjaHtmlParser.StyleStartElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#styleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleBody(JinjaHtmlParser.StyleBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRule(JinjaHtmlParser.CssRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#selectorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorList(JinjaHtmlParser.SelectorListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalSelector}
	 * labeled alternative in {@link JinjaHtmlParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalSelector(JinjaHtmlParser.NormalSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassSelector}
	 * labeled alternative in {@link JinjaHtmlParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSelector(JinjaHtmlParser.ClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdSelector}
	 * labeled alternative in {@link JinjaHtmlParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSelector(JinjaHtmlParser.IdSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AllSelector}
	 * labeled alternative in {@link JinjaHtmlParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllSelector(JinjaHtmlParser.AllSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(JinjaHtmlParser.DeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(JinjaHtmlParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(JinjaHtmlParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(JinjaHtmlParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberTerm}
	 * labeled alternative in {@link JinjaHtmlParser#cssTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberTerm(JinjaHtmlParser.NumberTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringTerm}
	 * labeled alternative in {@link JinjaHtmlParser#cssTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringTerm(JinjaHtmlParser.StringTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NameTerm}
	 * labeled alternative in {@link JinjaHtmlParser#cssTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameTerm(JinjaHtmlParser.NameTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HexTerm}
	 * labeled alternative in {@link JinjaHtmlParser#cssTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexTerm(JinjaHtmlParser.HexTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionTerm}
	 * labeled alternative in {@link JinjaHtmlParser#cssTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTerm(JinjaHtmlParser.FunctionTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HSLFunction}
	 * labeled alternative in {@link JinjaHtmlParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHSLFunction(JinjaHtmlParser.HSLFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TranslateFunction}
	 * labeled alternative in {@link JinjaHtmlParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslateFunction(JinjaHtmlParser.TranslateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScaleFunction}
	 * labeled alternative in {@link JinjaHtmlParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaleFunction(JinjaHtmlParser.ScaleFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RotateFunction}
	 * labeled alternative in {@link JinjaHtmlParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotateFunction(JinjaHtmlParser.RotateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CalcFunction}
	 * labeled alternative in {@link JinjaHtmlParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcFunction(JinjaHtmlParser.CalcFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TranslateX}
	 * labeled alternative in {@link JinjaHtmlParser#translate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslateX(JinjaHtmlParser.TranslateXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TranslateY}
	 * labeled alternative in {@link JinjaHtmlParser#translate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslateY(JinjaHtmlParser.TranslateYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TranslateFull}
	 * labeled alternative in {@link JinjaHtmlParser#translate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslateFull(JinjaHtmlParser.TranslateFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScaleX}
	 * labeled alternative in {@link JinjaHtmlParser#scale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaleX(JinjaHtmlParser.ScaleXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScaleY}
	 * labeled alternative in {@link JinjaHtmlParser#scale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaleY(JinjaHtmlParser.ScaleYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScaleFull}
	 * labeled alternative in {@link JinjaHtmlParser#scale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaleFull(JinjaHtmlParser.ScaleFullContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#hexNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexNum(JinjaHtmlParser.HexNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlock(JinjaHtmlParser.JinjaBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#jinjaBlockStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlockStart(JinjaHtmlParser.JinjaBlockStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#jinjaBlockeEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlockeEnd(JinjaHtmlParser.JinjaBlockeEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#jinjaSuperBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaSuperBlock(JinjaHtmlParser.JinjaSuperBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#jinjaConditionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaConditionStmt(JinjaHtmlParser.JinjaConditionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#jinjaIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIf(JinjaHtmlParser.JinjaIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#jinjaElseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaElseIf(JinjaHtmlParser.JinjaElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#jinjaElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaElse(JinjaHtmlParser.JinjaElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#jinjaEndIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaEndIf(JinjaHtmlParser.JinjaEndIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaParentecesCondition}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaParentecesCondition(JinjaHtmlParser.JinjaParentecesConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaConditionsRoot}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaConditionsRoot(JinjaHtmlParser.JinjaConditionsRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaCondition}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaCondition(JinjaHtmlParser.JinjaConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaVaraiableConditon}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaVaraiableConditon(JinjaHtmlParser.JinjaVaraiableConditonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaCompareCondition}
	 * labeled alternative in {@link JinjaHtmlParser#jinjaConditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaCompareCondition(JinjaHtmlParser.JinjaCompareConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#jinjaForLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaForLoop(JinjaHtmlParser.JinjaForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#jinjaFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaFor(JinjaHtmlParser.JinjaForContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#jinjaEndFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaEndFor(JinjaHtmlParser.JinjaEndForContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#jinjaVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaVariable(JinjaHtmlParser.JinjaVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#jinjaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpr(JinjaHtmlParser.JinjaExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#jinjaStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaStmt(JinjaHtmlParser.JinjaStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#jinjaComnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaComnt(JinjaHtmlParser.JinjaComntContext ctx);
}