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
	 * Enter a parse tree produced by {@link JinjaHtmlParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(JinjaHtmlParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(JinjaHtmlParser.HtmlContext ctx);
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
	 * Enter a parse tree produced by {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(JinjaHtmlParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(JinjaHtmlParser.ElementContext ctx);
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