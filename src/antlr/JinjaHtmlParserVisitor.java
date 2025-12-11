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
	 * Visit a parse tree produced by {@link JinjaHtmlParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(JinjaHtmlParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlElement}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(JinjaHtmlParser.HtmlElementContext ctx);
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
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(JinjaHtmlParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link JinjaHtmlParser#html_Body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JinjaHtmlParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#jinjaDoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaDoc(JinjaHtmlParser.JinjaDocContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#jinjastart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjastart(JinjaHtmlParser.JinjastartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#jinjaend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaend(JinjaHtmlParser.JinjaendContext ctx);
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
	 * Visit a parse tree produced by the {@code Link}
	 * labeled alternative in {@link JinjaHtmlParser#oneElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink(JinjaHtmlParser.LinkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Image}
	 * labeled alternative in {@link JinjaHtmlParser#oneElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(JinjaHtmlParser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Input}
	 * labeled alternative in {@link JinjaHtmlParser#oneElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(JinjaHtmlParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Html}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(JinjaHtmlParser.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Body}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(JinjaHtmlParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Head}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(JinjaHtmlParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code H1}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH1(JinjaHtmlParser.H1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code H2}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH2(JinjaHtmlParser.H2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code H3}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH3(JinjaHtmlParser.H3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code H4}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH4(JinjaHtmlParser.H4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code H5}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH5(JinjaHtmlParser.H5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Nav}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNav(JinjaHtmlParser.NavContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(JinjaHtmlParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Span}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpan(JinjaHtmlParser.SpanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code A}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(JinjaHtmlParser.AContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Title}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(JinjaHtmlParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code P}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP(JinjaHtmlParser.PContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Form}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm(JinjaHtmlParser.FormContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Label}
	 * labeled alternative in {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(JinjaHtmlParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#attripute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttripute(JinjaHtmlParser.AttriputeContext ctx);
}