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
	 * Visit a parse tree produced by {@link JinjaHtmlParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(JinjaHtmlParser.HtmlContext ctx);
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
	 * Visit a parse tree produced by {@link JinjaHtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(JinjaHtmlParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaHtmlParser#attripute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttripute(JinjaHtmlParser.AttriputeContext ctx);
}