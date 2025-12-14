// Generated from C:/Users/HP/Desktop/UniProjects/Compiler Project/Grammars/JinjaHtmlParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JinjaHtmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOCTYPE=1, JINJA_EXPR_START=2, JINJA_STMT_START=3, JINJA_COMMENT_START=4, 
		OST=5, OET=6, TEXT=7, HTML_COMMENT=8, WS=9, JINJA_EXPR_END=10, JINJA_COMMA=11, 
		JINJA_TEXT=12, JINJA_EXPR_WS=13, JINJA_STMT_END=14, JINJA_LP=15, JINJA_RP=16, 
		JINJA_BLOCK=17, JINJA_ENDBLOCK=18, JINJA_SUPER=19, JINJA_EXTENDS=20, JINJA_INCLUDE=21, 
		JINJA_FOR=22, JINJA_ENDFOR=23, JINJA_IF=24, JINJA_ELIF=25, JINJA_ELSE=26, 
		JINJA_ENDIF=27, JINJA_SET=28, JINJA_IMPORT=29, JINJA_FROM=30, JINJA_INS=31, 
		JINJA_COMPARE=32, JINJA_LOGIC=33, JINJA_NOT=34, JINJA_NUM=35, JINJA_ID=36, 
		JINJA_STRING=37, JINJA_STMT_WS=38, JINJA_STMT_NL=39, JINJA_COMMENT_END=40, 
		JINJA_COMMENT_TEXT=41, JINJA_COMMENT_WS=42, CT=43, JINJA_EXPR_START_TAG=44, 
		JINJA_DQ=45, EM=46, EQUALS=47, COLON=48, LKB=49, RKB=50, PAIRED_TAG=51, 
		VOID_TAG=52, ATTRIBUTE_NAME=53, STRING=54, ID=55, TAG_WS=56;
	public static final int
		RULE_prog = 0, RULE_topLevel = 1, RULE_document = 2, RULE_html_Body = 3, 
		RULE_startElement = 4, RULE_endElement = 5, RULE_singleElement = 6, RULE_attribute = 7, 
		RULE_jinjaInheritance = 8, RULE_inheritanceStart = 9, RULE_jinjaBlock = 10, 
		RULE_jinjaBlockStart = 11, RULE_jinjaBlockeEnd = 12, RULE_jinjaSuperBlock = 13, 
		RULE_jinjaConditionStmt = 14, RULE_jinjaIf = 15, RULE_jinjaElseIf = 16, 
		RULE_jinjaElse = 17, RULE_jinjaEndIf = 18, RULE_jinjaConditions = 19, 
		RULE_jinjaForLoop = 20, RULE_jinjaFor = 21, RULE_jinjaEndFor = 22, RULE_jinjaVariable = 23, 
		RULE_jinjaExpr = 24, RULE_jinjaStmt = 25, RULE_jinjaComnt = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "topLevel", "document", "html_Body", "startElement", "endElement", 
			"singleElement", "attribute", "jinjaInheritance", "inheritanceStart", 
			"jinjaBlock", "jinjaBlockStart", "jinjaBlockeEnd", "jinjaSuperBlock", 
			"jinjaConditionStmt", "jinjaIf", "jinjaElseIf", "jinjaElse", "jinjaEndIf", 
			"jinjaConditions", "jinjaForLoop", "jinjaFor", "jinjaEndFor", "jinjaVariable", 
			"jinjaExpr", "jinjaStmt", "jinjaComnt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'{%'", "'{#'", "'<'", "'</'", null, null, null, "'}}'", 
			"','", null, null, "'%}'", "'('", "')'", "'block'", "'endblock'", "'super'", 
			"'extends'", "'include'", "'for'", "'endfor'", "'if'", "'elif'", "'else'", 
			"'endif'", "'set'", "'import'", "'from'", null, null, null, "'not'", 
			null, null, null, null, null, "'#}'", null, null, "'>'", null, "'\"'", 
			"'!'", "'='", "':'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOCTYPE", "JINJA_EXPR_START", "JINJA_STMT_START", "JINJA_COMMENT_START", 
			"OST", "OET", "TEXT", "HTML_COMMENT", "WS", "JINJA_EXPR_END", "JINJA_COMMA", 
			"JINJA_TEXT", "JINJA_EXPR_WS", "JINJA_STMT_END", "JINJA_LP", "JINJA_RP", 
			"JINJA_BLOCK", "JINJA_ENDBLOCK", "JINJA_SUPER", "JINJA_EXTENDS", "JINJA_INCLUDE", 
			"JINJA_FOR", "JINJA_ENDFOR", "JINJA_IF", "JINJA_ELIF", "JINJA_ELSE", 
			"JINJA_ENDIF", "JINJA_SET", "JINJA_IMPORT", "JINJA_FROM", "JINJA_INS", 
			"JINJA_COMPARE", "JINJA_LOGIC", "JINJA_NOT", "JINJA_NUM", "JINJA_ID", 
			"JINJA_STRING", "JINJA_STMT_WS", "JINJA_STMT_NL", "JINJA_COMMENT_END", 
			"JINJA_COMMENT_TEXT", "JINJA_COMMENT_WS", "CT", "JINJA_EXPR_START_TAG", 
			"JINJA_DQ", "EM", "EQUALS", "COLON", "LKB", "RKB", "PAIRED_TAG", "VOID_TAG", 
			"ATTRIBUTE_NAME", "STRING", "ID", "TAG_WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JinjaHtmlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JinjaHtmlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JinjaHtmlParser.EOF, 0); }
		public List<TopLevelContext> topLevel() {
			return getRuleContexts(TopLevelContext.class);
		}
		public TopLevelContext topLevel(int i) {
			return getRuleContext(TopLevelContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36046389205008830L) != 0)) {
				{
				{
				setState(54);
				topLevel();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TopLevelContext extends ParserRuleContext {
		public TopLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevel; }
	 
		public TopLevelContext() { }
		public void copyFrom(TopLevelContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TopLevelTextContext extends TopLevelContext {
		public TerminalNode TEXT() { return getToken(JinjaHtmlParser.TEXT, 0); }
		public TopLevelTextContext(TopLevelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterTopLevelText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitTopLevelText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitTopLevelText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BaseDocumentContext extends TopLevelContext {
		public DocumentContext document() {
			return getRuleContext(DocumentContext.class,0);
		}
		public BaseDocumentContext(TopLevelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterBaseDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitBaseDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitBaseDocument(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TopLevelCommentContext extends TopLevelContext {
		public TerminalNode HTML_COMMENT() { return getToken(JinjaHtmlParser.HTML_COMMENT, 0); }
		public TopLevelCommentContext(TopLevelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterTopLevelComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitTopLevelComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitTopLevelComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelContext topLevel() throws RecognitionException {
		TopLevelContext _localctx = new TopLevelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topLevel);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new BaseDocumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				document();
				}
				break;
			case 2:
				_localctx = new TopLevelCommentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(HTML_COMMENT);
				}
				break;
			case 3:
				_localctx = new TopLevelTextContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(TEXT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DocumentContext extends ParserRuleContext {
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
	 
		public DocumentContext() { }
		public void copyFrom(DocumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaContext extends DocumentContext {
		public JinjaInheritanceContext jinjaInheritance() {
			return getRuleContext(JinjaInheritanceContext.class,0);
		}
		public JinjaContext(DocumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinja(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContext extends DocumentContext {
		public Html_BodyContext html_Body() {
			return getRuleContext(Html_BodyContext.class,0);
		}
		public TerminalNode DOCTYPE() { return getToken(JinjaHtmlParser.DOCTYPE, 0); }
		public HtmlContext(DocumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_document);
		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new HtmlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOCTYPE) {
					{
					setState(67);
					match(DOCTYPE);
					}
				}

				setState(70);
				html_Body();
				}
				break;
			case 2:
				_localctx = new JinjaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				jinjaInheritance();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Html_BodyContext extends ParserRuleContext {
		public Html_BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_Body; }
	 
		public Html_BodyContext() { }
		public void copyFrom(Html_BodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockPlaceContext extends Html_BodyContext {
		public JinjaBlockContext jinjaBlock() {
			return getRuleContext(JinjaBlockContext.class,0);
		}
		public JinjaBlockPlaceContext(Html_BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaBlockPlace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaBlockPlace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaBlockPlace(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleHtmlContext extends Html_BodyContext {
		public SingleElementContext singleElement() {
			return getRuleContext(SingleElementContext.class,0);
		}
		public SingleHtmlContext(Html_BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterSingleHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitSingleHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitSingleHtml(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaConditionStatementContext extends Html_BodyContext {
		public JinjaConditionStmtContext jinjaConditionStmt() {
			return getRuleContext(JinjaConditionStmtContext.class,0);
		}
		public JinjaConditionStatementContext(Html_BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaConditionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaConditionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaConditionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends Html_BodyContext {
		public TerminalNode ID() { return getToken(JinjaHtmlParser.ID, 0); }
		public IdentifierContext(Html_BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaCommentContext extends Html_BodyContext {
		public JinjaComntContext jinjaComnt() {
			return getRuleContext(JinjaComntContext.class,0);
		}
		public JinjaCommentContext(Html_BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaComment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends Html_BodyContext {
		public StartElementContext startElement() {
			return getRuleContext(StartElementContext.class,0);
		}
		public EndElementContext endElement() {
			return getRuleContext(EndElementContext.class,0);
		}
		public List<Html_BodyContext> html_Body() {
			return getRuleContexts(Html_BodyContext.class);
		}
		public Html_BodyContext html_Body(int i) {
			return getRuleContext(Html_BodyContext.class,i);
		}
		public HtmlElementContext(Html_BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStatementContext extends Html_BodyContext {
		public JinjaStmtContext jinjaStmt() {
			return getRuleContext(JinjaStmtContext.class,0);
		}
		public JinjaStatementContext(Html_BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaLoopContext extends Html_BodyContext {
		public JinjaForLoopContext jinjaForLoop() {
			return getRuleContext(JinjaForLoopContext.class,0);
		}
		public JinjaLoopContext(Html_BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExpressionContext extends Html_BodyContext {
		public JinjaExprContext jinjaExpr() {
			return getRuleContext(JinjaExprContext.class,0);
		}
		public JinjaExpressionContext(Html_BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends Html_BodyContext {
		public TerminalNode TEXT() { return getToken(JinjaHtmlParser.TEXT, 0); }
		public TextContext(Html_BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCommentContext extends Html_BodyContext {
		public TerminalNode HTML_COMMENT() { return getToken(JinjaHtmlParser.HTML_COMMENT, 0); }
		public HtmlCommentContext(Html_BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_BodyContext html_Body() throws RecognitionException {
		Html_BodyContext _localctx = new Html_BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_html_Body);
		int _la;
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new HtmlElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				startElement();
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36046389205008828L) != 0)) {
					{
					{
					setState(75);
					html_Body();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(81);
				endElement();
				}
				break;
			case 2:
				_localctx = new SingleHtmlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				singleElement();
				}
				break;
			case 3:
				_localctx = new JinjaExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				jinjaExpr();
				}
				break;
			case 4:
				_localctx = new JinjaStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				jinjaStmt();
				}
				break;
			case 5:
				_localctx = new JinjaCommentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				jinjaComnt();
				}
				break;
			case 6:
				_localctx = new JinjaConditionStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				jinjaConditionStmt();
				}
				break;
			case 7:
				_localctx = new JinjaBlockPlaceContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				jinjaBlock();
				}
				break;
			case 8:
				_localctx = new JinjaLoopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(89);
				jinjaForLoop();
				}
				break;
			case 9:
				_localctx = new HtmlCommentContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(90);
				match(HTML_COMMENT);
				}
				break;
			case 10:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(91);
				match(ID);
				}
				break;
			case 11:
				_localctx = new TextContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(92);
				match(TEXT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartElementContext extends ParserRuleContext {
		public TerminalNode OST() { return getToken(JinjaHtmlParser.OST, 0); }
		public TerminalNode PAIRED_TAG() { return getToken(JinjaHtmlParser.PAIRED_TAG, 0); }
		public TerminalNode CT() { return getToken(JinjaHtmlParser.CT, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public StartElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterStartElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitStartElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitStartElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartElementContext startElement() throws RecognitionException {
		StartElementContext _localctx = new StartElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_startElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(OST);
			setState(96);
			match(PAIRED_TAG);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(97);
					attribute();
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(103);
			match(CT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EndElementContext extends ParserRuleContext {
		public TerminalNode OET() { return getToken(JinjaHtmlParser.OET, 0); }
		public TerminalNode PAIRED_TAG() { return getToken(JinjaHtmlParser.PAIRED_TAG, 0); }
		public TerminalNode CT() { return getToken(JinjaHtmlParser.CT, 0); }
		public EndElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterEndElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitEndElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitEndElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndElementContext endElement() throws RecognitionException {
		EndElementContext _localctx = new EndElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_endElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(OET);
			setState(106);
			match(PAIRED_TAG);
			setState(107);
			match(CT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleElementContext extends ParserRuleContext {
		public TerminalNode OST() { return getToken(JinjaHtmlParser.OST, 0); }
		public TerminalNode VOID_TAG() { return getToken(JinjaHtmlParser.VOID_TAG, 0); }
		public TerminalNode CT() { return getToken(JinjaHtmlParser.CT, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public SingleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterSingleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitSingleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitSingleElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleElementContext singleElement() throws RecognitionException {
		SingleElementContext _localctx = new SingleElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(OST);
			setState(110);
			match(VOID_TAG);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(111);
					attribute();
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(117);
			match(CT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE_NAME() { return getToken(JinjaHtmlParser.ATTRIBUTE_NAME, 0); }
		public TerminalNode EQUALS() { return getToken(JinjaHtmlParser.EQUALS, 0); }
		public List<TerminalNode> JINJA_DQ() { return getTokens(JinjaHtmlParser.JINJA_DQ); }
		public TerminalNode JINJA_DQ(int i) {
			return getToken(JinjaHtmlParser.JINJA_DQ, i);
		}
		public JinjaExprContext jinjaExpr() {
			return getRuleContext(JinjaExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JinjaHtmlParser.STRING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ATTRIBUTE_NAME);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(120);
				match(EQUALS);
				setState(126);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JINJA_DQ:
					{
					setState(121);
					match(JINJA_DQ);
					setState(122);
					jinjaExpr();
					setState(123);
					match(JINJA_DQ);
					}
					break;
				case STRING:
					{
					setState(125);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaInheritanceContext extends ParserRuleContext {
		public InheritanceStartContext inheritanceStart() {
			return getRuleContext(InheritanceStartContext.class,0);
		}
		public List<JinjaBlockContext> jinjaBlock() {
			return getRuleContexts(JinjaBlockContext.class);
		}
		public JinjaBlockContext jinjaBlock(int i) {
			return getRuleContext(JinjaBlockContext.class,i);
		}
		public JinjaInheritanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaInheritance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaInheritance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaInheritance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaInheritance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaInheritanceContext jinjaInheritance() throws RecognitionException {
		JinjaInheritanceContext _localctx = new JinjaInheritanceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_jinjaInheritance);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			inheritanceStart();
			setState(132); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(131);
					jinjaBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(134); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InheritanceStartContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_START() { return getToken(JinjaHtmlParser.JINJA_STMT_START, 0); }
		public TerminalNode JINJA_EXTENDS() { return getToken(JinjaHtmlParser.JINJA_EXTENDS, 0); }
		public TerminalNode JINJA_STRING() { return getToken(JinjaHtmlParser.JINJA_STRING, 0); }
		public TerminalNode JINJA_STMT_END() { return getToken(JinjaHtmlParser.JINJA_STMT_END, 0); }
		public InheritanceStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterInheritanceStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitInheritanceStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitInheritanceStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritanceStartContext inheritanceStart() throws RecognitionException {
		InheritanceStartContext _localctx = new InheritanceStartContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inheritanceStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(JINJA_STMT_START);
			setState(137);
			match(JINJA_EXTENDS);
			setState(138);
			match(JINJA_STRING);
			setState(139);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockContext extends ParserRuleContext {
		public JinjaBlockStartContext jinjaBlockStart() {
			return getRuleContext(JinjaBlockStartContext.class,0);
		}
		public JinjaBlockeEndContext jinjaBlockeEnd() {
			return getRuleContext(JinjaBlockeEndContext.class,0);
		}
		public JinjaSuperBlockContext jinjaSuperBlock() {
			return getRuleContext(JinjaSuperBlockContext.class,0);
		}
		public List<Html_BodyContext> html_Body() {
			return getRuleContexts(Html_BodyContext.class);
		}
		public Html_BodyContext html_Body(int i) {
			return getRuleContext(Html_BodyContext.class,i);
		}
		public JinjaBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaBlockContext jinjaBlock() throws RecognitionException {
		JinjaBlockContext _localctx = new JinjaBlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_jinjaBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_EXPR_START) {
				{
				setState(141);
				jinjaSuperBlock();
				}
			}

			setState(144);
			jinjaBlockStart();
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					html_Body();
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(151);
			jinjaBlockeEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockStartContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_START() { return getToken(JinjaHtmlParser.JINJA_STMT_START, 0); }
		public TerminalNode JINJA_BLOCK() { return getToken(JinjaHtmlParser.JINJA_BLOCK, 0); }
		public TerminalNode JINJA_ID() { return getToken(JinjaHtmlParser.JINJA_ID, 0); }
		public TerminalNode JINJA_STMT_END() { return getToken(JinjaHtmlParser.JINJA_STMT_END, 0); }
		public JinjaBlockStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaBlockStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaBlockStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaBlockStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaBlockStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaBlockStartContext jinjaBlockStart() throws RecognitionException {
		JinjaBlockStartContext _localctx = new JinjaBlockStartContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jinjaBlockStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(JINJA_STMT_START);
			setState(154);
			match(JINJA_BLOCK);
			setState(155);
			match(JINJA_ID);
			setState(156);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockeEndContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_START() { return getToken(JinjaHtmlParser.JINJA_STMT_START, 0); }
		public TerminalNode JINJA_ENDBLOCK() { return getToken(JinjaHtmlParser.JINJA_ENDBLOCK, 0); }
		public TerminalNode JINJA_STMT_END() { return getToken(JinjaHtmlParser.JINJA_STMT_END, 0); }
		public JinjaBlockeEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaBlockeEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaBlockeEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaBlockeEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaBlockeEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaBlockeEndContext jinjaBlockeEnd() throws RecognitionException {
		JinjaBlockeEndContext _localctx = new JinjaBlockeEndContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jinjaBlockeEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(JINJA_STMT_START);
			setState(159);
			match(JINJA_ENDBLOCK);
			setState(160);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaSuperBlockContext extends ParserRuleContext {
		public TerminalNode JINJA_EXPR_START() { return getToken(JinjaHtmlParser.JINJA_EXPR_START, 0); }
		public TerminalNode JINJA_SUPER() { return getToken(JinjaHtmlParser.JINJA_SUPER, 0); }
		public TerminalNode JINJA_EXPR_END() { return getToken(JinjaHtmlParser.JINJA_EXPR_END, 0); }
		public JinjaSuperBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaSuperBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaSuperBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaSuperBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaSuperBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaSuperBlockContext jinjaSuperBlock() throws RecognitionException {
		JinjaSuperBlockContext _localctx = new JinjaSuperBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_jinjaSuperBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(JINJA_EXPR_START);
			setState(163);
			match(JINJA_SUPER);
			setState(164);
			match(JINJA_EXPR_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaConditionStmtContext extends ParserRuleContext {
		public JinjaIfContext jinjaIf() {
			return getRuleContext(JinjaIfContext.class,0);
		}
		public JinjaEndIfContext jinjaEndIf() {
			return getRuleContext(JinjaEndIfContext.class,0);
		}
		public List<Html_BodyContext> html_Body() {
			return getRuleContexts(Html_BodyContext.class);
		}
		public Html_BodyContext html_Body(int i) {
			return getRuleContext(Html_BodyContext.class,i);
		}
		public List<JinjaElseIfContext> jinjaElseIf() {
			return getRuleContexts(JinjaElseIfContext.class);
		}
		public JinjaElseIfContext jinjaElseIf(int i) {
			return getRuleContext(JinjaElseIfContext.class,i);
		}
		public JinjaElseContext jinjaElse() {
			return getRuleContext(JinjaElseContext.class,0);
		}
		public JinjaConditionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaConditionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaConditionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaConditionStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaConditionStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaConditionStmtContext jinjaConditionStmt() throws RecognitionException {
		JinjaConditionStmtContext _localctx = new JinjaConditionStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jinjaConditionStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			jinjaIf();
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(167);
				html_Body();
				}
				break;
			}
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(170);
					jinjaElseIf();
					setState(172);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(171);
						html_Body();
						}
						break;
					}
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(179);
				jinjaElse();
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(180);
					html_Body();
					}
					break;
				}
				}
				break;
			}
			setState(185);
			jinjaEndIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_START() { return getToken(JinjaHtmlParser.JINJA_STMT_START, 0); }
		public TerminalNode JINJA_IF() { return getToken(JinjaHtmlParser.JINJA_IF, 0); }
		public JinjaConditionsContext jinjaConditions() {
			return getRuleContext(JinjaConditionsContext.class,0);
		}
		public TerminalNode JINJA_STMT_END() { return getToken(JinjaHtmlParser.JINJA_STMT_END, 0); }
		public JinjaIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaIfContext jinjaIf() throws RecognitionException {
		JinjaIfContext _localctx = new JinjaIfContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_jinjaIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(JINJA_STMT_START);
			setState(188);
			match(JINJA_IF);
			setState(189);
			jinjaConditions(0);
			setState(190);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaElseIfContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_START() { return getToken(JinjaHtmlParser.JINJA_STMT_START, 0); }
		public TerminalNode JINJA_ELIF() { return getToken(JinjaHtmlParser.JINJA_ELIF, 0); }
		public JinjaConditionsContext jinjaConditions() {
			return getRuleContext(JinjaConditionsContext.class,0);
		}
		public TerminalNode JINJA_STMT_END() { return getToken(JinjaHtmlParser.JINJA_STMT_END, 0); }
		public JinjaElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaElseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaElseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaElseIfContext jinjaElseIf() throws RecognitionException {
		JinjaElseIfContext _localctx = new JinjaElseIfContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jinjaElseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(JINJA_STMT_START);
			setState(193);
			match(JINJA_ELIF);
			setState(194);
			jinjaConditions(0);
			setState(195);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaElseContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_START() { return getToken(JinjaHtmlParser.JINJA_STMT_START, 0); }
		public TerminalNode JINJA_ELSE() { return getToken(JinjaHtmlParser.JINJA_ELSE, 0); }
		public TerminalNode JINJA_STMT_END() { return getToken(JinjaHtmlParser.JINJA_STMT_END, 0); }
		public JinjaElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaElseContext jinjaElse() throws RecognitionException {
		JinjaElseContext _localctx = new JinjaElseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jinjaElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(JINJA_STMT_START);
			setState(198);
			match(JINJA_ELSE);
			setState(199);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaEndIfContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_START() { return getToken(JinjaHtmlParser.JINJA_STMT_START, 0); }
		public TerminalNode JINJA_ENDIF() { return getToken(JinjaHtmlParser.JINJA_ENDIF, 0); }
		public TerminalNode JINJA_STMT_END() { return getToken(JinjaHtmlParser.JINJA_STMT_END, 0); }
		public JinjaEndIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaEndIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaEndIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaEndIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaEndIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaEndIfContext jinjaEndIf() throws RecognitionException {
		JinjaEndIfContext _localctx = new JinjaEndIfContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jinjaEndIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(JINJA_STMT_START);
			setState(202);
			match(JINJA_ENDIF);
			setState(203);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaConditionsContext extends ParserRuleContext {
		public JinjaConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaConditions; }
	 
		public JinjaConditionsContext() { }
		public void copyFrom(JinjaConditionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaParentecesConditionContext extends JinjaConditionsContext {
		public TerminalNode JINJA_LP() { return getToken(JinjaHtmlParser.JINJA_LP, 0); }
		public JinjaConditionsContext jinjaConditions() {
			return getRuleContext(JinjaConditionsContext.class,0);
		}
		public TerminalNode JINJA_RP() { return getToken(JinjaHtmlParser.JINJA_RP, 0); }
		public JinjaParentecesConditionContext(JinjaConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaParentecesCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaParentecesCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaParentecesCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaConditionsRootContext extends JinjaConditionsContext {
		public List<JinjaConditionsContext> jinjaConditions() {
			return getRuleContexts(JinjaConditionsContext.class);
		}
		public JinjaConditionsContext jinjaConditions(int i) {
			return getRuleContext(JinjaConditionsContext.class,i);
		}
		public TerminalNode JINJA_LOGIC() { return getToken(JinjaHtmlParser.JINJA_LOGIC, 0); }
		public JinjaConditionsRootContext(JinjaConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaConditionsRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaConditionsRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaConditionsRoot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaConditionContext extends JinjaConditionsContext {
		public TerminalNode JINJA_NOT() { return getToken(JinjaHtmlParser.JINJA_NOT, 0); }
		public JinjaConditionsContext jinjaConditions() {
			return getRuleContext(JinjaConditionsContext.class,0);
		}
		public JinjaConditionContext(JinjaConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaVaraiableConditonContext extends JinjaConditionsContext {
		public JinjaVariableContext jinjaVariable() {
			return getRuleContext(JinjaVariableContext.class,0);
		}
		public TerminalNode JINJA_NOT() { return getToken(JinjaHtmlParser.JINJA_NOT, 0); }
		public JinjaVaraiableConditonContext(JinjaConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaVaraiableConditon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaVaraiableConditon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaVaraiableConditon(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaCompareConditionContext extends JinjaConditionsContext {
		public List<JinjaVariableContext> jinjaVariable() {
			return getRuleContexts(JinjaVariableContext.class);
		}
		public JinjaVariableContext jinjaVariable(int i) {
			return getRuleContext(JinjaVariableContext.class,i);
		}
		public TerminalNode JINJA_COMPARE() { return getToken(JinjaHtmlParser.JINJA_COMPARE, 0); }
		public TerminalNode JINJA_INS() { return getToken(JinjaHtmlParser.JINJA_INS, 0); }
		public JinjaCompareConditionContext(JinjaConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaCompareCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaCompareCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaCompareCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaConditionsContext jinjaConditions() throws RecognitionException {
		return jinjaConditions(0);
	}

	private JinjaConditionsContext jinjaConditions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JinjaConditionsContext _localctx = new JinjaConditionsContext(_ctx, _parentState);
		JinjaConditionsContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_jinjaConditions, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new JinjaParentecesConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(206);
				match(JINJA_LP);
				setState(207);
				jinjaConditions(0);
				setState(208);
				match(JINJA_RP);
				}
				break;
			case 2:
				{
				_localctx = new JinjaVaraiableConditonContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==JINJA_NOT) {
					{
					setState(210);
					match(JINJA_NOT);
					}
				}

				setState(213);
				jinjaVariable();
				}
				break;
			case 3:
				{
				_localctx = new JinjaConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(JINJA_NOT);
				setState(215);
				jinjaConditions(2);
				}
				break;
			case 4:
				{
				_localctx = new JinjaCompareConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				jinjaVariable();
				setState(217);
				_la = _input.LA(1);
				if ( !(_la==JINJA_INS || _la==JINJA_COMPARE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(218);
				jinjaVariable();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JinjaConditionsRootContext(new JinjaConditionsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_jinjaConditions);
					setState(222);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(223);
					match(JINJA_LOGIC);
					setState(224);
					jinjaConditions(6);
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForLoopContext extends ParserRuleContext {
		public JinjaForContext jinjaFor() {
			return getRuleContext(JinjaForContext.class,0);
		}
		public JinjaEndForContext jinjaEndFor() {
			return getRuleContext(JinjaEndForContext.class,0);
		}
		public List<Html_BodyContext> html_Body() {
			return getRuleContexts(Html_BodyContext.class);
		}
		public Html_BodyContext html_Body(int i) {
			return getRuleContext(Html_BodyContext.class,i);
		}
		public JinjaElseContext jinjaElse() {
			return getRuleContext(JinjaElseContext.class,0);
		}
		public JinjaForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaForLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaForLoopContext jinjaForLoop() throws RecognitionException {
		JinjaForLoopContext _localctx = new JinjaForLoopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_jinjaForLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			jinjaFor();
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(231);
				html_Body();
				}
				break;
			}
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(234);
				jinjaElse();
				setState(236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(235);
					html_Body();
					}
					break;
				}
				}
				break;
			}
			setState(240);
			jinjaEndFor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_START() { return getToken(JinjaHtmlParser.JINJA_STMT_START, 0); }
		public TerminalNode JINJA_FOR() { return getToken(JinjaHtmlParser.JINJA_FOR, 0); }
		public List<TerminalNode> JINJA_ID() { return getTokens(JinjaHtmlParser.JINJA_ID); }
		public TerminalNode JINJA_ID(int i) {
			return getToken(JinjaHtmlParser.JINJA_ID, i);
		}
		public TerminalNode JINJA_INS() { return getToken(JinjaHtmlParser.JINJA_INS, 0); }
		public TerminalNode JINJA_STMT_END() { return getToken(JinjaHtmlParser.JINJA_STMT_END, 0); }
		public TerminalNode JINJA_IF() { return getToken(JinjaHtmlParser.JINJA_IF, 0); }
		public JinjaConditionsContext jinjaConditions() {
			return getRuleContext(JinjaConditionsContext.class,0);
		}
		public JinjaForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaForContext jinjaFor() throws RecognitionException {
		JinjaForContext _localctx = new JinjaForContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_jinjaFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(JINJA_STMT_START);
			setState(243);
			match(JINJA_FOR);
			setState(244);
			match(JINJA_ID);
			setState(245);
			match(JINJA_INS);
			setState(246);
			match(JINJA_ID);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_IF) {
				{
				setState(247);
				match(JINJA_IF);
				setState(248);
				jinjaConditions(0);
				}
			}

			setState(251);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaEndForContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_START() { return getToken(JinjaHtmlParser.JINJA_STMT_START, 0); }
		public TerminalNode JINJA_ENDFOR() { return getToken(JinjaHtmlParser.JINJA_ENDFOR, 0); }
		public TerminalNode JINJA_STMT_END() { return getToken(JinjaHtmlParser.JINJA_STMT_END, 0); }
		public JinjaEndForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaEndFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaEndFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaEndFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaEndFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaEndForContext jinjaEndFor() throws RecognitionException {
		JinjaEndForContext _localctx = new JinjaEndForContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_jinjaEndFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(JINJA_STMT_START);
			setState(254);
			match(JINJA_ENDFOR);
			setState(255);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaVariableContext extends ParserRuleContext {
		public TerminalNode JINJA_NUM() { return getToken(JinjaHtmlParser.JINJA_NUM, 0); }
		public TerminalNode JINJA_ID() { return getToken(JinjaHtmlParser.JINJA_ID, 0); }
		public TerminalNode JINJA_STRING() { return getToken(JinjaHtmlParser.JINJA_STRING, 0); }
		public JinjaVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaVariableContext jinjaVariable() throws RecognitionException {
		JinjaVariableContext _localctx = new JinjaVariableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_jinjaVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExprContext extends ParserRuleContext {
		public TerminalNode JINJA_EXPR_END() { return getToken(JinjaHtmlParser.JINJA_EXPR_END, 0); }
		public TerminalNode JINJA_EXPR_START() { return getToken(JinjaHtmlParser.JINJA_EXPR_START, 0); }
		public TerminalNode JINJA_EXPR_START_TAG() { return getToken(JinjaHtmlParser.JINJA_EXPR_START_TAG, 0); }
		public List<TerminalNode> JINJA_TEXT() { return getTokens(JinjaHtmlParser.JINJA_TEXT); }
		public TerminalNode JINJA_TEXT(int i) {
			return getToken(JinjaHtmlParser.JINJA_TEXT, i);
		}
		public List<TerminalNode> JINJA_COMMA() { return getTokens(JinjaHtmlParser.JINJA_COMMA); }
		public TerminalNode JINJA_COMMA(int i) {
			return getToken(JinjaHtmlParser.JINJA_COMMA, i);
		}
		public JinjaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExprContext jinjaExpr() throws RecognitionException {
		JinjaExprContext _localctx = new JinjaExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_jinjaExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !(_la==JINJA_EXPR_START || _la==JINJA_EXPR_START_TAG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_TEXT) {
				{
				{
				setState(260);
				match(JINJA_TEXT);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==JINJA_COMMA) {
					{
					{
					setState(261);
					match(JINJA_COMMA);
					setState(262);
					match(JINJA_TEXT);
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(JINJA_EXPR_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStmtContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_START() { return getToken(JinjaHtmlParser.JINJA_STMT_START, 0); }
		public TerminalNode JINJA_STMT_END() { return getToken(JinjaHtmlParser.JINJA_STMT_END, 0); }
		public List<TerminalNode> JINJA_TEXT() { return getTokens(JinjaHtmlParser.JINJA_TEXT); }
		public TerminalNode JINJA_TEXT(int i) {
			return getToken(JinjaHtmlParser.JINJA_TEXT, i);
		}
		public JinjaStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaStmtContext jinjaStmt() throws RecognitionException {
		JinjaStmtContext _localctx = new JinjaStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_jinjaStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(JINJA_STMT_START);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_TEXT) {
				{
				{
				setState(276);
				match(JINJA_TEXT);
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaComntContext extends ParserRuleContext {
		public TerminalNode JINJA_COMMENT_START() { return getToken(JinjaHtmlParser.JINJA_COMMENT_START, 0); }
		public TerminalNode JINJA_COMMENT_END() { return getToken(JinjaHtmlParser.JINJA_COMMENT_END, 0); }
		public List<TerminalNode> JINJA_COMMENT_TEXT() { return getTokens(JinjaHtmlParser.JINJA_COMMENT_TEXT); }
		public TerminalNode JINJA_COMMENT_TEXT(int i) {
			return getToken(JinjaHtmlParser.JINJA_COMMENT_TEXT, i);
		}
		public JinjaComntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaComnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaComnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaComnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaComnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaComntContext jinjaComnt() throws RecognitionException {
		JinjaComntContext _localctx = new JinjaComntContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_jinjaComnt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(JINJA_COMMENT_START);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_COMMENT_TEXT) {
				{
				{
				setState(285);
				match(JINJA_COMMENT_TEXT);
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
			match(JINJA_COMMENT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return jinjaConditions_sempred((JinjaConditionsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean jinjaConditions_sempred(JinjaConditionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00018\u0126\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0005\u0000"+
		"8\b\u0000\n\u0000\f\u0000;\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0002\u0003\u0002"+
		"E\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0005\u0003M\b\u0003\n\u0003\f\u0003P\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003^\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004c\b\u0004\n\u0004"+
		"\f\u0004f\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006q\b"+
		"\u0006\n\u0006\f\u0006t\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u007f\b\u0007\u0003\u0007\u0081\b\u0007\u0001\b\u0001\b\u0004\b"+
		"\u0085\b\b\u000b\b\f\b\u0086\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0003\n\u008f\b\n\u0001\n\u0001\n\u0005\n\u0093\b\n\n\n\f\n\u0096\t"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00a9\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00ad\b\u000e\u0005\u000e\u00af\b\u000e\n\u000e\f\u000e\u00b2"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b6\b\u000e\u0003\u000e"+
		"\u00b8\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00d4\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00dd\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00e2\b\u0013\n\u0013\f\u0013\u00e5\t\u0013\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00e9\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00ed\b\u0014"+
		"\u0003\u0014\u00ef\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u00fa\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u0108\b\u0018\n\u0018\f\u0018\u010b\t\u0018\u0005"+
		"\u0018\u010d\b\u0018\n\u0018\f\u0018\u0110\t\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u0116\b\u0019\n\u0019\f\u0019\u0119"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0005\u001a\u011f"+
		"\b\u001a\n\u001a\f\u001a\u0122\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0002dr\u0001&\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0003\u0001\u0000"+
		"\u001f \u0001\u0000#%\u0002\u0000\u0002\u0002,,\u0133\u00009\u0001\u0000"+
		"\u0000\u0000\u0002A\u0001\u0000\u0000\u0000\u0004H\u0001\u0000\u0000\u0000"+
		"\u0006]\u0001\u0000\u0000\u0000\b_\u0001\u0000\u0000\u0000\ni\u0001\u0000"+
		"\u0000\u0000\fm\u0001\u0000\u0000\u0000\u000ew\u0001\u0000\u0000\u0000"+
		"\u0010\u0082\u0001\u0000\u0000\u0000\u0012\u0088\u0001\u0000\u0000\u0000"+
		"\u0014\u008e\u0001\u0000\u0000\u0000\u0016\u0099\u0001\u0000\u0000\u0000"+
		"\u0018\u009e\u0001\u0000\u0000\u0000\u001a\u00a2\u0001\u0000\u0000\u0000"+
		"\u001c\u00a6\u0001\u0000\u0000\u0000\u001e\u00bb\u0001\u0000\u0000\u0000"+
		" \u00c0\u0001\u0000\u0000\u0000\"\u00c5\u0001\u0000\u0000\u0000$\u00c9"+
		"\u0001\u0000\u0000\u0000&\u00dc\u0001\u0000\u0000\u0000(\u00e6\u0001\u0000"+
		"\u0000\u0000*\u00f2\u0001\u0000\u0000\u0000,\u00fd\u0001\u0000\u0000\u0000"+
		".\u0101\u0001\u0000\u0000\u00000\u0103\u0001\u0000\u0000\u00002\u0113"+
		"\u0001\u0000\u0000\u00004\u011c\u0001\u0000\u0000\u000068\u0003\u0002"+
		"\u0001\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000<=\u0005\u0000\u0000\u0001=\u0001\u0001\u0000"+
		"\u0000\u0000>B\u0003\u0004\u0002\u0000?B\u0005\b\u0000\u0000@B\u0005\u0007"+
		"\u0000\u0000A>\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000A@\u0001"+
		"\u0000\u0000\u0000B\u0003\u0001\u0000\u0000\u0000CE\u0005\u0001\u0000"+
		"\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FI\u0003\u0006\u0003\u0000GI\u0003\u0010\b\u0000HD\u0001\u0000"+
		"\u0000\u0000HG\u0001\u0000\u0000\u0000I\u0005\u0001\u0000\u0000\u0000"+
		"JN\u0003\b\u0004\u0000KM\u0003\u0006\u0003\u0000LK\u0001\u0000\u0000\u0000"+
		"MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0003\n\u0005"+
		"\u0000R^\u0001\u0000\u0000\u0000S^\u0003\f\u0006\u0000T^\u00030\u0018"+
		"\u0000U^\u00032\u0019\u0000V^\u00034\u001a\u0000W^\u0003\u001c\u000e\u0000"+
		"X^\u0003\u0014\n\u0000Y^\u0003(\u0014\u0000Z^\u0005\b\u0000\u0000[^\u0005"+
		"7\u0000\u0000\\^\u0005\u0007\u0000\u0000]J\u0001\u0000\u0000\u0000]S\u0001"+
		"\u0000\u0000\u0000]T\u0001\u0000\u0000\u0000]U\u0001\u0000\u0000\u0000"+
		"]V\u0001\u0000\u0000\u0000]W\u0001\u0000\u0000\u0000]X\u0001\u0000\u0000"+
		"\u0000]Y\u0001\u0000\u0000\u0000]Z\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000]\\\u0001\u0000\u0000\u0000^\u0007\u0001\u0000\u0000\u0000"+
		"_`\u0005\u0005\u0000\u0000`d\u00053\u0000\u0000ac\u0003\u000e\u0007\u0000"+
		"ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000gh\u0005+\u0000\u0000h\t\u0001\u0000\u0000\u0000ij\u0005\u0006"+
		"\u0000\u0000jk\u00053\u0000\u0000kl\u0005+\u0000\u0000l\u000b\u0001\u0000"+
		"\u0000\u0000mn\u0005\u0005\u0000\u0000nr\u00054\u0000\u0000oq\u0003\u000e"+
		"\u0007\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000uv\u0005+\u0000\u0000v\r\u0001\u0000\u0000\u0000"+
		"w\u0080\u00055\u0000\u0000x~\u0005/\u0000\u0000yz\u0005-\u0000\u0000z"+
		"{\u00030\u0018\u0000{|\u0005-\u0000\u0000|\u007f\u0001\u0000\u0000\u0000"+
		"}\u007f\u00056\u0000\u0000~y\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000"+
		"\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080x\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u000f\u0001\u0000\u0000\u0000"+
		"\u0082\u0084\u0003\u0012\t\u0000\u0083\u0085\u0003\u0014\n\u0000\u0084"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u0011\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0003\u0000\u0000\u0089"+
		"\u008a\u0005\u0014\u0000\u0000\u008a\u008b\u0005%\u0000\u0000\u008b\u008c"+
		"\u0005\u000e\u0000\u0000\u008c\u0013\u0001\u0000\u0000\u0000\u008d\u008f"+
		"\u0003\u001a\r\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0094\u0003"+
		"\u0016\u000b\u0000\u0091\u0093\u0003\u0006\u0003\u0000\u0092\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001"+
		"\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0003"+
		"\u0018\f\u0000\u0098\u0015\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0003"+
		"\u0000\u0000\u009a\u009b\u0005\u0011\u0000\u0000\u009b\u009c\u0005$\u0000"+
		"\u0000\u009c\u009d\u0005\u000e\u0000\u0000\u009d\u0017\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005\u0003\u0000\u0000\u009f\u00a0\u0005\u0012\u0000"+
		"\u0000\u00a0\u00a1\u0005\u000e\u0000\u0000\u00a1\u0019\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0005\u0002\u0000\u0000\u00a3\u00a4\u0005\u0013\u0000"+
		"\u0000\u00a4\u00a5\u0005\n\u0000\u0000\u00a5\u001b\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a8\u0003\u001e\u000f\u0000\u00a7\u00a9\u0003\u0006\u0003\u0000"+
		"\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9\u00b0\u0001\u0000\u0000\u0000\u00aa\u00ac\u0003 \u0010\u0000\u00ab"+
		"\u00ad\u0003\u0006\u0003\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae"+
		"\u00aa\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b5\u0003\"\u0011\u0000\u00b4\u00b6\u0003\u0006\u0003\u0000\u00b5\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b3\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0003$\u0012\u0000\u00ba\u001d\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005"+
		"\u0003\u0000\u0000\u00bc\u00bd\u0005\u0018\u0000\u0000\u00bd\u00be\u0003"+
		"&\u0013\u0000\u00be\u00bf\u0005\u000e\u0000\u0000\u00bf\u001f\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0005\u0003\u0000\u0000\u00c1\u00c2\u0005\u0019"+
		"\u0000\u0000\u00c2\u00c3\u0003&\u0013\u0000\u00c3\u00c4\u0005\u000e\u0000"+
		"\u0000\u00c4!\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0003\u0000\u0000"+
		"\u00c6\u00c7\u0005\u001a\u0000\u0000\u00c7\u00c8\u0005\u000e\u0000\u0000"+
		"\u00c8#\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0003\u0000\u0000\u00ca"+
		"\u00cb\u0005\u001b\u0000\u0000\u00cb\u00cc\u0005\u000e\u0000\u0000\u00cc"+
		"%\u0001\u0000\u0000\u0000\u00cd\u00ce\u0006\u0013\uffff\uffff\u0000\u00ce"+
		"\u00cf\u0005\u000f\u0000\u0000\u00cf\u00d0\u0003&\u0013\u0000\u00d0\u00d1"+
		"\u0005\u0010\u0000\u0000\u00d1\u00dd\u0001\u0000\u0000\u0000\u00d2\u00d4"+
		"\u0005\"\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00dd\u0003"+
		".\u0017\u0000\u00d6\u00d7\u0005\"\u0000\u0000\u00d7\u00dd\u0003&\u0013"+
		"\u0002\u00d8\u00d9\u0003.\u0017\u0000\u00d9\u00da\u0007\u0000\u0000\u0000"+
		"\u00da\u00db\u0003.\u0017\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00dc\u00d3\u0001\u0000\u0000\u0000\u00dc"+
		"\u00d6\u0001\u0000\u0000\u0000\u00dc\u00d8\u0001\u0000\u0000\u0000\u00dd"+
		"\u00e3\u0001\u0000\u0000\u0000\u00de\u00df\n\u0005\u0000\u0000\u00df\u00e0"+
		"\u0005!\u0000\u0000\u00e0\u00e2\u0003&\u0013\u0006\u00e1\u00de\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\'\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e8\u0003*\u0015\u0000"+
		"\u00e7\u00e9\u0003\u0006\u0003\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ec\u0003\"\u0011\u0000\u00eb\u00ed\u0003\u0006\u0003\u0000\u00ec"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ee\u00ea\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0003,\u0016\u0000\u00f1)\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005"+
		"\u0003\u0000\u0000\u00f3\u00f4\u0005\u0016\u0000\u0000\u00f4\u00f5\u0005"+
		"$\u0000\u0000\u00f5\u00f6\u0005\u001f\u0000\u0000\u00f6\u00f9\u0005$\u0000"+
		"\u0000\u00f7\u00f8\u0005\u0018\u0000\u0000\u00f8\u00fa\u0003&\u0013\u0000"+
		"\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\u000e\u0000\u0000"+
		"\u00fc+\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u0003\u0000\u0000\u00fe"+
		"\u00ff\u0005\u0017\u0000\u0000\u00ff\u0100\u0005\u000e\u0000\u0000\u0100"+
		"-\u0001\u0000\u0000\u0000\u0101\u0102\u0007\u0001\u0000\u0000\u0102/\u0001"+
		"\u0000\u0000\u0000\u0103\u010e\u0007\u0002\u0000\u0000\u0104\u0109\u0005"+
		"\f\u0000\u0000\u0105\u0106\u0005\u000b\u0000\u0000\u0106\u0108\u0005\f"+
		"\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000"+
		"\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000"+
		"\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000"+
		"\u0000\u0000\u010c\u0104\u0001\u0000\u0000\u0000\u010d\u0110\u0001\u0000"+
		"\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000"+
		"\u0000\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0005\n\u0000\u0000\u01121\u0001\u0000\u0000"+
		"\u0000\u0113\u0117\u0005\u0003\u0000\u0000\u0114\u0116\u0005\f\u0000\u0000"+
		"\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000"+
		"\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000"+
		"\u0118\u011a\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0005\u000e\u0000\u0000\u011b3\u0001\u0000\u0000\u0000\u011c"+
		"\u0120\u0005\u0004\u0000\u0000\u011d\u011f\u0005)\u0000\u0000\u011e\u011d"+
		"\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u011e"+
		"\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0123"+
		"\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0005(\u0000\u0000\u01245\u0001\u0000\u0000\u0000\u001d9ADHN]dr~\u0080"+
		"\u0086\u008e\u0094\u00a8\u00ac\u00b0\u00b5\u00b7\u00d3\u00dc\u00e3\u00e8"+
		"\u00ec\u00ee\u00f9\u0109\u010e\u0117\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}