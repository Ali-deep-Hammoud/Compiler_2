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
	 * Enter a parse tree produced by {@link JinjaHtmlParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(JinjaHtmlParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(JinjaHtmlParser.DocumentContext ctx);
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
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void enterString(JinjaHtmlParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 */
	void exitString(JinjaHtmlParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaDoc}.
	 * @param ctx the parse tree
	 */
	void enterJinjaDoc(JinjaHtmlParser.JinjaDocContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaDoc}.
	 * @param ctx the parse tree
	 */
	void exitJinjaDoc(JinjaHtmlParser.JinjaDocContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjastart}.
	 * @param ctx the parse tree
	 */
	void enterJinjastart(JinjaHtmlParser.JinjastartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjastart}.
	 * @param ctx the parse tree
	 */
	void exitJinjastart(JinjaHtmlParser.JinjastartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#jinjaend}.
	 * @param ctx the parse tree
	 */
	void enterJinjaend(JinjaHtmlParser.JinjaendContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#jinjaend}.
	 * @param ctx the parse tree
	 */
	void exitJinjaend(JinjaHtmlParser.JinjaendContext ctx);
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
	 * Enter a parse tree produced by the {@code Link}
	 * labeled alternative in {@link JinjaHtmlParser#oneElement}.
	 * @param ctx the parse tree
	 */
	void enterLink(JinjaHtmlParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Link}
	 * labeled alternative in {@link JinjaHtmlParser#oneElement}.
	 * @param ctx the parse tree
	 */
	void exitLink(JinjaHtmlParser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Image}
	 * labeled alternative in {@link JinjaHtmlParser#oneElement}.
	 * @param ctx the parse tree
	 */
	void enterImage(JinjaHtmlParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Image}
	 * labeled alternative in {@link JinjaHtmlParser#oneElement}.
	 * @param ctx the parse tree
	 */
	void exitImage(JinjaHtmlParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Input}
	 * labeled alternative in {@link JinjaHtmlParser#oneElement}.
	 * @param ctx the parse tree
	 */
	void enterInput(JinjaHtmlParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Input}
	 * labeled alternative in {@link JinjaHtmlParser#oneElement}.
	 * @param ctx the parse tree
	 */
	void exitInput(JinjaHtmlParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Html}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterHtml(JinjaHtmlParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Html}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitHtml(JinjaHtmlParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Body}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterBody(JinjaHtmlParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Body}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitBody(JinjaHtmlParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Head}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterHead(JinjaHtmlParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Head}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitHead(JinjaHtmlParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code H1}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterH1(JinjaHtmlParser.H1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code H1}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitH1(JinjaHtmlParser.H1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code H2}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterH2(JinjaHtmlParser.H2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code H2}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitH2(JinjaHtmlParser.H2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code H3}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterH3(JinjaHtmlParser.H3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code H3}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitH3(JinjaHtmlParser.H3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code H4}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterH4(JinjaHtmlParser.H4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code H4}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitH4(JinjaHtmlParser.H4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code H5}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterH5(JinjaHtmlParser.H5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code H5}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitH5(JinjaHtmlParser.H5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Nav}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterNav(JinjaHtmlParser.NavContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Nav}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitNav(JinjaHtmlParser.NavContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterDiv(JinjaHtmlParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitDiv(JinjaHtmlParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Span}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterSpan(JinjaHtmlParser.SpanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Span}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitSpan(JinjaHtmlParser.SpanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code A}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterA(JinjaHtmlParser.AContext ctx);
	/**
	 * Exit a parse tree produced by the {@code A}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitA(JinjaHtmlParser.AContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Title}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterTitle(JinjaHtmlParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Title}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitTitle(JinjaHtmlParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code P}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterP(JinjaHtmlParser.PContext ctx);
	/**
	 * Exit a parse tree produced by the {@code P}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitP(JinjaHtmlParser.PContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Form}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterForm(JinjaHtmlParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Form}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitForm(JinjaHtmlParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Label}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterLabel(JinjaHtmlParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Label}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitLabel(JinjaHtmlParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaHtmlParser#attripute}.
	 * @param ctx the parse tree
	 */
	void enterAttripute(JinjaHtmlParser.AttriputeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#attripute}.
	 * @param ctx the parse tree
	 */
	void exitAttripute(JinjaHtmlParser.AttriputeContext ctx);
}