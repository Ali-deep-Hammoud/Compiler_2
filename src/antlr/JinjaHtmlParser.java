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
		STYLE_TAG=45, JINJA_DQ=46, EM=47, EQUALS=48, COLON=49, LKB=50, RKB=51, 
		PAIRED_TAG=52, VOID_TAG=53, ATTRIBUTE_NAME=54, STRING=55, ID=56, TAG_WS=57, 
		CSS_END_STYLE=58, CSS_LBRACE=59, CSS_RBRACE=60, CSS_COLON=61, CSS_SEMI=62, 
		CSS_COMMA=63, CSS_DOT=64, CSS_HASH=65, CSS_ALL=66, CSS_LP=67, CSS_RP=68, 
		CSS_HSL=69, CSS_TRANSLATEX=70, CSS_TRANSLATEY=71, CSS_TRANSLATE=72, CSS_ROTATE=73, 
		CSS_SCALEX=74, CSS_SCALEY=75, CSS_SCALE=76, CSS_CALC=77, CSS_NUMBER=78, 
		CSS_MATH=79, CSS_UNIT=80, CSS_STRING=81, CSS_NAME=82, CSS_HEX=83, CSS_COMMENT=84, 
		CSS_WS=85;
	public static final int
		RULE_prog = 0, RULE_topLevel = 1, RULE_document = 2, RULE_html_Body = 3, 
		RULE_startElement = 4, RULE_endElement = 5, RULE_singleElement = 6, RULE_attribute = 7, 
		RULE_jinjaInheritance = 8, RULE_inheritanceStart = 9, RULE_styleStartElement = 10, 
		RULE_styleBody = 11, RULE_cssRule = 12, RULE_selectorList = 13, RULE_selector = 14, 
		RULE_declarationList = 15, RULE_declaration = 16, RULE_property = 17, 
		RULE_value = 18, RULE_cssTerm = 19, RULE_functions = 20, RULE_translate = 21, 
		RULE_scale = 22, RULE_hexNum = 23, RULE_jinjaBlock = 24, RULE_jinjaBlockStart = 25, 
		RULE_jinjaBlockeEnd = 26, RULE_jinjaSuperBlock = 27, RULE_jinjaConditionStmt = 28, 
		RULE_jinjaIf = 29, RULE_jinjaElseIf = 30, RULE_jinjaElse = 31, RULE_jinjaEndIf = 32, 
		RULE_jinjaConditions = 33, RULE_jinjaForLoop = 34, RULE_jinjaFor = 35, 
		RULE_jinjaEndFor = 36, RULE_jinjaVariable = 37, RULE_jinjaExpr = 38, RULE_jinjaStmt = 39, 
		RULE_jinjaComnt = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "topLevel", "document", "html_Body", "startElement", "endElement", 
			"singleElement", "attribute", "jinjaInheritance", "inheritanceStart", 
			"styleStartElement", "styleBody", "cssRule", "selectorList", "selector", 
			"declarationList", "declaration", "property", "value", "cssTerm", "functions", 
			"translate", "scale", "hexNum", "jinjaBlock", "jinjaBlockStart", "jinjaBlockeEnd", 
			"jinjaSuperBlock", "jinjaConditionStmt", "jinjaIf", "jinjaElseIf", "jinjaElse", 
			"jinjaEndIf", "jinjaConditions", "jinjaForLoop", "jinjaFor", "jinjaEndFor", 
			"jinjaVariable", "jinjaExpr", "jinjaStmt", "jinjaComnt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'{%'", "'{#'", "'<'", "'</'", null, null, null, "'}}'", 
			null, null, null, "'%}'", null, null, "'block'", "'endblock'", "'super'", 
			"'extends'", "'include'", "'for'", "'endfor'", "'if'", "'elif'", "'else'", 
			"'endif'", "'set'", "'import'", "'from'", null, null, null, "'not'", 
			null, null, null, null, null, "'#}'", null, null, "'>'", null, "'style>'", 
			"'\"'", "'!'", "'='", null, null, null, null, null, null, null, null, 
			null, "'</style'", null, null, null, "';'", null, "'.'", "'#'", "'*'", 
			null, null, "'hsl'", "'translateX'", "'translateY'", "'translate'", "'rotate'", 
			"'scaleX'", "'scaleY'", "'scale'", "'calc'"
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
			"STYLE_TAG", "JINJA_DQ", "EM", "EQUALS", "COLON", "LKB", "RKB", "PAIRED_TAG", 
			"VOID_TAG", "ATTRIBUTE_NAME", "STRING", "ID", "TAG_WS", "CSS_END_STYLE", 
			"CSS_LBRACE", "CSS_RBRACE", "CSS_COLON", "CSS_SEMI", "CSS_COMMA", "CSS_DOT", 
			"CSS_HASH", "CSS_ALL", "CSS_LP", "CSS_RP", "CSS_HSL", "CSS_TRANSLATEX", 
			"CSS_TRANSLATEY", "CSS_TRANSLATE", "CSS_ROTATE", "CSS_SCALEX", "CSS_SCALEY", 
			"CSS_SCALE", "CSS_CALC", "CSS_NUMBER", "CSS_MATH", "CSS_UNIT", "CSS_STRING", 
			"CSS_NAME", "CSS_HEX", "CSS_COMMENT", "CSS_WS"
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
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72075186223972798L) != 0)) {
				{
				{
				setState(82);
				topLevel();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
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
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new BaseDocumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				document();
				}
				break;
			case 2:
				_localctx = new TopLevelCommentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(HTML_COMMENT);
				}
				break;
			case 3:
				_localctx = new TopLevelTextContext(_localctx);
				enterOuterAlt(_localctx, 3);
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
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new HtmlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOCTYPE) {
					{
					setState(95);
					match(DOCTYPE);
					}
				}

				setState(98);
				html_Body();
				}
				break;
			case 2:
				_localctx = new JinjaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
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
	public static class StyleElementContext extends Html_BodyContext {
		public StyleStartElementContext styleStartElement() {
			return getRuleContext(StyleStartElementContext.class,0);
		}
		public TerminalNode CSS_END_STYLE() { return getToken(JinjaHtmlParser.CSS_END_STYLE, 0); }
		public TerminalNode CT() { return getToken(JinjaHtmlParser.CT, 0); }
		public List<StyleBodyContext> styleBody() {
			return getRuleContexts(StyleBodyContext.class);
		}
		public StyleBodyContext styleBody(int i) {
			return getRuleContext(StyleBodyContext.class,i);
		}
		public StyleElementContext(Html_BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterStyleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitStyleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitStyleElement(this);
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new HtmlElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				startElement();
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72075186223972796L) != 0)) {
					{
					{
					setState(103);
					html_Body();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109);
				endElement();
				}
				break;
			case 2:
				_localctx = new StyleElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				styleStartElement();
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 262151L) != 0)) {
					{
					{
					setState(112);
					styleBody();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
				match(CSS_END_STYLE);
				setState(119);
				match(CT);
				}
				break;
			case 3:
				_localctx = new SingleHtmlContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				singleElement();
				}
				break;
			case 4:
				_localctx = new JinjaExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				jinjaExpr();
				}
				break;
			case 5:
				_localctx = new JinjaStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				jinjaStmt();
				}
				break;
			case 6:
				_localctx = new JinjaCommentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				jinjaComnt();
				}
				break;
			case 7:
				_localctx = new JinjaConditionStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				jinjaConditionStmt();
				}
				break;
			case 8:
				_localctx = new JinjaBlockPlaceContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(126);
				jinjaBlock();
				}
				break;
			case 9:
				_localctx = new JinjaLoopContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(127);
				jinjaForLoop();
				}
				break;
			case 10:
				_localctx = new HtmlCommentContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(128);
				match(HTML_COMMENT);
				}
				break;
			case 11:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(129);
				match(ID);
				}
				break;
			case 12:
				_localctx = new TextContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(130);
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
			setState(133);
			match(OST);
			setState(134);
			match(PAIRED_TAG);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(135);
					attribute();
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(141);
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
			setState(143);
			match(OET);
			setState(144);
			match(PAIRED_TAG);
			setState(145);
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
			setState(147);
			match(OST);
			setState(148);
			match(VOID_TAG);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(149);
					attribute();
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(155);
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
			setState(157);
			match(ATTRIBUTE_NAME);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(158);
				match(EQUALS);
				setState(164);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JINJA_DQ:
					{
					setState(159);
					match(JINJA_DQ);
					setState(160);
					jinjaExpr();
					setState(161);
					match(JINJA_DQ);
					}
					break;
				case STRING:
					{
					setState(163);
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
			setState(168);
			inheritanceStart();
			setState(170); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(169);
					jinjaBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(172); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
			setState(174);
			match(JINJA_STMT_START);
			setState(175);
			match(JINJA_EXTENDS);
			setState(176);
			match(JINJA_STRING);
			setState(177);
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
	public static class StyleStartElementContext extends ParserRuleContext {
		public TerminalNode OST() { return getToken(JinjaHtmlParser.OST, 0); }
		public TerminalNode STYLE_TAG() { return getToken(JinjaHtmlParser.STYLE_TAG, 0); }
		public StyleStartElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleStartElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterStyleStartElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitStyleStartElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitStyleStartElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleStartElementContext styleStartElement() throws RecognitionException {
		StyleStartElementContext _localctx = new StyleStartElementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_styleStartElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(OST);
			setState(180);
			match(STYLE_TAG);
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
	public static class StyleBodyContext extends ParserRuleContext {
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public StyleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterStyleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitStyleBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitStyleBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleBodyContext styleBody() throws RecognitionException {
		StyleBodyContext _localctx = new StyleBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_styleBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(182);
					cssRule();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(185); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	public static class CssRuleContext extends ParserRuleContext {
		public SelectorListContext selectorList() {
			return getRuleContext(SelectorListContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(JinjaHtmlParser.CSS_LBRACE, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public TerminalNode CSS_RBRACE() { return getToken(JinjaHtmlParser.CSS_RBRACE, 0); }
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterCssRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitCssRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cssRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			selectorList();
			setState(188);
			match(CSS_LBRACE);
			setState(189);
			declarationList();
			setState(190);
			match(CSS_RBRACE);
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
	public static class SelectorListContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(JinjaHtmlParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(JinjaHtmlParser.CSS_COMMA, i);
		}
		public SelectorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterSelectorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitSelectorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitSelectorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorListContext selectorList() throws RecognitionException {
		SelectorListContext _localctx = new SelectorListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selectorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			selector();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 524303L) != 0)) {
				{
				{
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_COMMA) {
					{
					setState(193);
					match(CSS_COMMA);
					}
				}

				setState(196);
				selector();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class SelectorContext extends ParserRuleContext {
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	 
		public SelectorContext() { }
		public void copyFrom(SelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalSelectorContext extends SelectorContext {
		public TerminalNode CSS_NAME() { return getToken(JinjaHtmlParser.CSS_NAME, 0); }
		public NormalSelectorContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterNormalSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitNormalSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitNormalSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdSelectorContext extends SelectorContext {
		public TerminalNode CSS_HASH() { return getToken(JinjaHtmlParser.CSS_HASH, 0); }
		public TerminalNode CSS_NAME() { return getToken(JinjaHtmlParser.CSS_NAME, 0); }
		public IdSelectorContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterIdSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitIdSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitIdSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassSelectorContext extends SelectorContext {
		public TerminalNode CSS_DOT() { return getToken(JinjaHtmlParser.CSS_DOT, 0); }
		public TerminalNode CSS_NAME() { return getToken(JinjaHtmlParser.CSS_NAME, 0); }
		public ClassSelectorContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AllSelectorContext extends SelectorContext {
		public TerminalNode CSS_ALL() { return getToken(JinjaHtmlParser.CSS_ALL, 0); }
		public AllSelectorContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterAllSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitAllSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitAllSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_selector);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_NAME:
				_localctx = new NormalSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(CSS_NAME);
				}
				break;
			case CSS_DOT:
				_localctx = new ClassSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(CSS_DOT);
				setState(204);
				match(CSS_NAME);
				}
				break;
			case CSS_HASH:
				_localctx = new IdSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				match(CSS_HASH);
				setState(206);
				match(CSS_NAME);
				}
				break;
			case CSS_ALL:
				_localctx = new AllSelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				match(CSS_ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_NAME) {
				{
				{
				setState(210);
				declaration();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class DeclarationContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode CSS_COLON() { return getToken(JinjaHtmlParser.CSS_COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CSS_SEMI() { return getToken(JinjaHtmlParser.CSS_SEMI, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			property();
			setState(217);
			match(CSS_COLON);
			setState(218);
			value();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMI) {
				{
				setState(219);
				match(CSS_SEMI);
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
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode CSS_NAME() { return getToken(JinjaHtmlParser.CSS_NAME, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(CSS_NAME);
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
	public static class ValueContext extends ParserRuleContext {
		public List<CssTermContext> cssTerm() {
			return getRuleContexts(CssTermContext.class);
		}
		public CssTermContext cssTerm(int i) {
			return getRuleContext(CssTermContext.class,i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(JinjaHtmlParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(JinjaHtmlParser.CSS_COMMA, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(224);
					cssTerm();
					setState(229);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(225);
							match(CSS_COMMA);
							setState(226);
							cssTerm();
							}
							} 
						}
						setState(231);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(234); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
	public static class CssTermContext extends ParserRuleContext {
		public CssTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssTerm; }
	 
		public CssTermContext() { }
		public void copyFrom(CssTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTermContext extends CssTermContext {
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public FunctionTermContext(CssTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterFunctionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitFunctionTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitFunctionTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringTermContext extends CssTermContext {
		public TerminalNode CSS_STRING() { return getToken(JinjaHtmlParser.CSS_STRING, 0); }
		public StringTermContext(CssTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterStringTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitStringTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitStringTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberTermContext extends CssTermContext {
		public TerminalNode CSS_NUMBER() { return getToken(JinjaHtmlParser.CSS_NUMBER, 0); }
		public TerminalNode CSS_UNIT() { return getToken(JinjaHtmlParser.CSS_UNIT, 0); }
		public NumberTermContext(CssTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterNumberTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitNumberTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitNumberTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NameTermContext extends CssTermContext {
		public TerminalNode CSS_NAME() { return getToken(JinjaHtmlParser.CSS_NAME, 0); }
		public NameTermContext(CssTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterNameTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitNameTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitNameTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HexTermContext extends CssTermContext {
		public HexNumContext hexNum() {
			return getRuleContext(HexNumContext.class,0);
		}
		public HexTermContext(CssTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterHexTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitHexTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitHexTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssTermContext cssTerm() throws RecognitionException {
		CssTermContext _localctx = new CssTermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cssTerm);
		int _la;
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_NUMBER:
				_localctx = new NumberTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(CSS_NUMBER);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(237);
					match(CSS_UNIT);
					}
				}

				}
				break;
			case CSS_STRING:
				_localctx = new StringTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(CSS_STRING);
				}
				break;
			case CSS_NAME:
				_localctx = new NameTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(CSS_NAME);
				}
				break;
			case CSS_HASH:
				_localctx = new HexTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				hexNum();
				}
				break;
			case CSS_HSL:
			case CSS_TRANSLATEX:
			case CSS_TRANSLATEY:
			case CSS_TRANSLATE:
			case CSS_ROTATE:
			case CSS_SCALEX:
			case CSS_SCALEY:
			case CSS_SCALE:
			case CSS_CALC:
				_localctx = new FunctionTermContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				functions();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class FunctionsContext extends ParserRuleContext {
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
	 
		public FunctionsContext() { }
		public void copyFrom(FunctionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TranslateFunctionContext extends FunctionsContext {
		public TranslateContext translate() {
			return getRuleContext(TranslateContext.class,0);
		}
		public TranslateFunctionContext(FunctionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterTranslateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitTranslateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitTranslateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RotateFunctionContext extends FunctionsContext {
		public TerminalNode CSS_ROTATE() { return getToken(JinjaHtmlParser.CSS_ROTATE, 0); }
		public TerminalNode CSS_LP() { return getToken(JinjaHtmlParser.CSS_LP, 0); }
		public TerminalNode CSS_NUMBER() { return getToken(JinjaHtmlParser.CSS_NUMBER, 0); }
		public TerminalNode CSS_RP() { return getToken(JinjaHtmlParser.CSS_RP, 0); }
		public TerminalNode CSS_UNIT() { return getToken(JinjaHtmlParser.CSS_UNIT, 0); }
		public RotateFunctionContext(FunctionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterRotateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitRotateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitRotateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HSLFunctionContext extends FunctionsContext {
		public TerminalNode CSS_HSL() { return getToken(JinjaHtmlParser.CSS_HSL, 0); }
		public TerminalNode CSS_LP() { return getToken(JinjaHtmlParser.CSS_LP, 0); }
		public List<TerminalNode> CSS_NUMBER() { return getTokens(JinjaHtmlParser.CSS_NUMBER); }
		public TerminalNode CSS_NUMBER(int i) {
			return getToken(JinjaHtmlParser.CSS_NUMBER, i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(JinjaHtmlParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(JinjaHtmlParser.CSS_COMMA, i);
		}
		public TerminalNode CSS_RP() { return getToken(JinjaHtmlParser.CSS_RP, 0); }
		public List<TerminalNode> CSS_UNIT() { return getTokens(JinjaHtmlParser.CSS_UNIT); }
		public TerminalNode CSS_UNIT(int i) {
			return getToken(JinjaHtmlParser.CSS_UNIT, i);
		}
		public HSLFunctionContext(FunctionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterHSLFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitHSLFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitHSLFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScaleFunctionContext extends FunctionsContext {
		public ScaleContext scale() {
			return getRuleContext(ScaleContext.class,0);
		}
		public ScaleFunctionContext(FunctionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterScaleFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitScaleFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitScaleFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalcFunctionContext extends FunctionsContext {
		public TerminalNode CSS_CALC() { return getToken(JinjaHtmlParser.CSS_CALC, 0); }
		public TerminalNode CSS_LP() { return getToken(JinjaHtmlParser.CSS_LP, 0); }
		public List<TerminalNode> CSS_NUMBER() { return getTokens(JinjaHtmlParser.CSS_NUMBER); }
		public TerminalNode CSS_NUMBER(int i) {
			return getToken(JinjaHtmlParser.CSS_NUMBER, i);
		}
		public TerminalNode CSS_RP() { return getToken(JinjaHtmlParser.CSS_RP, 0); }
		public TerminalNode CSS_MATH() { return getToken(JinjaHtmlParser.CSS_MATH, 0); }
		public TerminalNode CSS_ALL() { return getToken(JinjaHtmlParser.CSS_ALL, 0); }
		public List<TerminalNode> CSS_UNIT() { return getTokens(JinjaHtmlParser.CSS_UNIT); }
		public TerminalNode CSS_UNIT(int i) {
			return getToken(JinjaHtmlParser.CSS_UNIT, i);
		}
		public CalcFunctionContext(FunctionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterCalcFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitCalcFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitCalcFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functions);
		int _la;
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_HSL:
				_localctx = new HSLFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(CSS_HSL);
				setState(247);
				match(CSS_LP);
				setState(248);
				match(CSS_NUMBER);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(249);
					match(CSS_UNIT);
					}
				}

				setState(252);
				match(CSS_COMMA);
				setState(253);
				match(CSS_NUMBER);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(254);
					match(CSS_UNIT);
					}
				}

				setState(257);
				match(CSS_COMMA);
				setState(258);
				match(CSS_NUMBER);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(259);
					match(CSS_UNIT);
					}
				}

				setState(262);
				match(CSS_RP);
				}
				break;
			case CSS_TRANSLATEX:
			case CSS_TRANSLATEY:
			case CSS_TRANSLATE:
				_localctx = new TranslateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				translate();
				}
				break;
			case CSS_SCALEX:
			case CSS_SCALEY:
			case CSS_SCALE:
				_localctx = new ScaleFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				scale();
				}
				break;
			case CSS_ROTATE:
				_localctx = new RotateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				match(CSS_ROTATE);
				setState(266);
				match(CSS_LP);
				setState(267);
				match(CSS_NUMBER);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(268);
					match(CSS_UNIT);
					}
				}

				setState(271);
				match(CSS_RP);
				}
				break;
			case CSS_CALC:
				_localctx = new CalcFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				match(CSS_CALC);
				setState(273);
				match(CSS_LP);
				setState(274);
				match(CSS_NUMBER);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(275);
					match(CSS_UNIT);
					}
				}

				setState(278);
				_la = _input.LA(1);
				if ( !(_la==CSS_ALL || _la==CSS_MATH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(279);
				match(CSS_NUMBER);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(280);
					match(CSS_UNIT);
					}
				}

				setState(283);
				match(CSS_RP);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class TranslateContext extends ParserRuleContext {
		public TranslateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translate; }
	 
		public TranslateContext() { }
		public void copyFrom(TranslateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TranslateFullContext extends TranslateContext {
		public TerminalNode CSS_TRANSLATE() { return getToken(JinjaHtmlParser.CSS_TRANSLATE, 0); }
		public TerminalNode CSS_LP() { return getToken(JinjaHtmlParser.CSS_LP, 0); }
		public List<TerminalNode> CSS_NUMBER() { return getTokens(JinjaHtmlParser.CSS_NUMBER); }
		public TerminalNode CSS_NUMBER(int i) {
			return getToken(JinjaHtmlParser.CSS_NUMBER, i);
		}
		public TerminalNode CSS_COMMA() { return getToken(JinjaHtmlParser.CSS_COMMA, 0); }
		public TerminalNode CSS_RP() { return getToken(JinjaHtmlParser.CSS_RP, 0); }
		public List<TerminalNode> CSS_UNIT() { return getTokens(JinjaHtmlParser.CSS_UNIT); }
		public TerminalNode CSS_UNIT(int i) {
			return getToken(JinjaHtmlParser.CSS_UNIT, i);
		}
		public TranslateFullContext(TranslateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterTranslateFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitTranslateFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitTranslateFull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TranslateYContext extends TranslateContext {
		public TerminalNode CSS_TRANSLATEY() { return getToken(JinjaHtmlParser.CSS_TRANSLATEY, 0); }
		public TerminalNode CSS_LP() { return getToken(JinjaHtmlParser.CSS_LP, 0); }
		public TerminalNode CSS_NUMBER() { return getToken(JinjaHtmlParser.CSS_NUMBER, 0); }
		public TerminalNode CSS_RP() { return getToken(JinjaHtmlParser.CSS_RP, 0); }
		public TerminalNode CSS_UNIT() { return getToken(JinjaHtmlParser.CSS_UNIT, 0); }
		public TranslateYContext(TranslateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterTranslateY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitTranslateY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitTranslateY(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TranslateXContext extends TranslateContext {
		public TerminalNode CSS_TRANSLATEX() { return getToken(JinjaHtmlParser.CSS_TRANSLATEX, 0); }
		public TerminalNode CSS_LP() { return getToken(JinjaHtmlParser.CSS_LP, 0); }
		public TerminalNode CSS_NUMBER() { return getToken(JinjaHtmlParser.CSS_NUMBER, 0); }
		public TerminalNode CSS_RP() { return getToken(JinjaHtmlParser.CSS_RP, 0); }
		public TerminalNode CSS_UNIT() { return getToken(JinjaHtmlParser.CSS_UNIT, 0); }
		public TranslateXContext(TranslateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterTranslateX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitTranslateX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitTranslateX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslateContext translate() throws RecognitionException {
		TranslateContext _localctx = new TranslateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_translate);
		int _la;
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_TRANSLATEX:
				_localctx = new TranslateXContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(CSS_TRANSLATEX);
				setState(287);
				match(CSS_LP);
				setState(288);
				match(CSS_NUMBER);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(289);
					match(CSS_UNIT);
					}
				}

				setState(292);
				match(CSS_RP);
				}
				break;
			case CSS_TRANSLATEY:
				_localctx = new TranslateYContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(CSS_TRANSLATEY);
				setState(294);
				match(CSS_LP);
				setState(295);
				match(CSS_NUMBER);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(296);
					match(CSS_UNIT);
					}
				}

				setState(299);
				match(CSS_RP);
				}
				break;
			case CSS_TRANSLATE:
				_localctx = new TranslateFullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				match(CSS_TRANSLATE);
				setState(301);
				match(CSS_LP);
				setState(302);
				match(CSS_NUMBER);
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(303);
					match(CSS_UNIT);
					}
				}

				setState(306);
				match(CSS_COMMA);
				setState(307);
				match(CSS_NUMBER);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(308);
					match(CSS_UNIT);
					}
				}

				setState(311);
				match(CSS_RP);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ScaleContext extends ParserRuleContext {
		public ScaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale; }
	 
		public ScaleContext() { }
		public void copyFrom(ScaleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScaleFullContext extends ScaleContext {
		public TerminalNode CSS_SCALE() { return getToken(JinjaHtmlParser.CSS_SCALE, 0); }
		public TerminalNode CSS_LP() { return getToken(JinjaHtmlParser.CSS_LP, 0); }
		public TerminalNode CSS_NUMBER() { return getToken(JinjaHtmlParser.CSS_NUMBER, 0); }
		public TerminalNode CSS_RP() { return getToken(JinjaHtmlParser.CSS_RP, 0); }
		public TerminalNode CSS_UNIT() { return getToken(JinjaHtmlParser.CSS_UNIT, 0); }
		public ScaleFullContext(ScaleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterScaleFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitScaleFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitScaleFull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScaleYContext extends ScaleContext {
		public TerminalNode CSS_SCALEY() { return getToken(JinjaHtmlParser.CSS_SCALEY, 0); }
		public TerminalNode CSS_LP() { return getToken(JinjaHtmlParser.CSS_LP, 0); }
		public TerminalNode CSS_NUMBER() { return getToken(JinjaHtmlParser.CSS_NUMBER, 0); }
		public TerminalNode CSS_RP() { return getToken(JinjaHtmlParser.CSS_RP, 0); }
		public TerminalNode CSS_UNIT() { return getToken(JinjaHtmlParser.CSS_UNIT, 0); }
		public ScaleYContext(ScaleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterScaleY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitScaleY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitScaleY(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScaleXContext extends ScaleContext {
		public TerminalNode CSS_SCALEX() { return getToken(JinjaHtmlParser.CSS_SCALEX, 0); }
		public TerminalNode CSS_LP() { return getToken(JinjaHtmlParser.CSS_LP, 0); }
		public TerminalNode CSS_NUMBER() { return getToken(JinjaHtmlParser.CSS_NUMBER, 0); }
		public TerminalNode CSS_RP() { return getToken(JinjaHtmlParser.CSS_RP, 0); }
		public TerminalNode CSS_UNIT() { return getToken(JinjaHtmlParser.CSS_UNIT, 0); }
		public ScaleXContext(ScaleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterScaleX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitScaleX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitScaleX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaleContext scale() throws RecognitionException {
		ScaleContext _localctx = new ScaleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_scale);
		int _la;
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_SCALEX:
				_localctx = new ScaleXContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				match(CSS_SCALEX);
				setState(315);
				match(CSS_LP);
				setState(316);
				match(CSS_NUMBER);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(317);
					match(CSS_UNIT);
					}
				}

				setState(320);
				match(CSS_RP);
				}
				break;
			case CSS_SCALEY:
				_localctx = new ScaleYContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(CSS_SCALEY);
				setState(322);
				match(CSS_LP);
				setState(323);
				match(CSS_NUMBER);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(324);
					match(CSS_UNIT);
					}
				}

				setState(327);
				match(CSS_RP);
				}
				break;
			case CSS_SCALE:
				_localctx = new ScaleFullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				match(CSS_SCALE);
				setState(329);
				match(CSS_LP);
				setState(330);
				match(CSS_NUMBER);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(331);
					match(CSS_UNIT);
					}
				}

				setState(334);
				match(CSS_RP);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class HexNumContext extends ParserRuleContext {
		public TerminalNode CSS_HASH() { return getToken(JinjaHtmlParser.CSS_HASH, 0); }
		public TerminalNode CSS_HEX() { return getToken(JinjaHtmlParser.CSS_HEX, 0); }
		public TerminalNode CSS_NAME() { return getToken(JinjaHtmlParser.CSS_NAME, 0); }
		public TerminalNode CSS_NUMBER() { return getToken(JinjaHtmlParser.CSS_NUMBER, 0); }
		public HexNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexNum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterHexNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitHexNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitHexNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexNumContext hexNum() throws RecognitionException {
		HexNumContext _localctx = new HexNumContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_hexNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(CSS_HASH);
			setState(338);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 49L) != 0)) ) {
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
		enterRule(_localctx, 48, RULE_jinjaBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_EXPR_START) {
				{
				setState(340);
				jinjaSuperBlock();
				}
			}

			setState(343);
			jinjaBlockStart();
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(344);
					html_Body();
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(350);
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
		enterRule(_localctx, 50, RULE_jinjaBlockStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(JINJA_STMT_START);
			setState(353);
			match(JINJA_BLOCK);
			setState(354);
			match(JINJA_ID);
			setState(355);
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
		enterRule(_localctx, 52, RULE_jinjaBlockeEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(JINJA_STMT_START);
			setState(358);
			match(JINJA_ENDBLOCK);
			setState(359);
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
		enterRule(_localctx, 54, RULE_jinjaSuperBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(JINJA_EXPR_START);
			setState(362);
			match(JINJA_SUPER);
			setState(363);
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
		enterRule(_localctx, 56, RULE_jinjaConditionStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			jinjaIf();
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(366);
				html_Body();
				}
				break;
			}
			setState(375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(369);
					jinjaElseIf();
					setState(371);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(370);
						html_Body();
						}
						break;
					}
					}
					} 
				}
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(378);
				jinjaElse();
				setState(380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(379);
					html_Body();
					}
					break;
				}
				}
				break;
			}
			setState(384);
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
		enterRule(_localctx, 58, RULE_jinjaIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(JINJA_STMT_START);
			setState(387);
			match(JINJA_IF);
			setState(388);
			jinjaConditions(0);
			setState(389);
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
		enterRule(_localctx, 60, RULE_jinjaElseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(JINJA_STMT_START);
			setState(392);
			match(JINJA_ELIF);
			setState(393);
			jinjaConditions(0);
			setState(394);
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
		enterRule(_localctx, 62, RULE_jinjaElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(JINJA_STMT_START);
			setState(397);
			match(JINJA_ELSE);
			setState(398);
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
		enterRule(_localctx, 64, RULE_jinjaEndIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(JINJA_STMT_START);
			setState(401);
			match(JINJA_ENDIF);
			setState(402);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_jinjaConditions, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				_localctx = new JinjaParentecesConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(405);
				match(JINJA_LP);
				setState(406);
				jinjaConditions(0);
				setState(407);
				match(JINJA_RP);
				}
				break;
			case 2:
				{
				_localctx = new JinjaVaraiableConditonContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==JINJA_NOT) {
					{
					setState(409);
					match(JINJA_NOT);
					}
				}

				setState(412);
				jinjaVariable();
				}
				break;
			case 3:
				{
				_localctx = new JinjaConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(413);
				match(JINJA_NOT);
				setState(414);
				jinjaConditions(2);
				}
				break;
			case 4:
				{
				_localctx = new JinjaCompareConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(415);
				jinjaVariable();
				setState(416);
				_la = _input.LA(1);
				if ( !(_la==JINJA_INS || _la==JINJA_COMPARE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(417);
				jinjaVariable();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JinjaConditionsRootContext(new JinjaConditionsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_jinjaConditions);
					setState(421);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(422);
					match(JINJA_LOGIC);
					setState(423);
					jinjaConditions(6);
					}
					} 
				}
				setState(428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		enterRule(_localctx, 68, RULE_jinjaForLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			jinjaFor();
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(430);
				html_Body();
				}
				break;
			}
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(433);
				jinjaElse();
				setState(435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(434);
					html_Body();
					}
					break;
				}
				}
				break;
			}
			setState(439);
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
		enterRule(_localctx, 70, RULE_jinjaFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(JINJA_STMT_START);
			setState(442);
			match(JINJA_FOR);
			setState(443);
			match(JINJA_ID);
			setState(444);
			match(JINJA_INS);
			setState(445);
			match(JINJA_ID);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_IF) {
				{
				setState(446);
				match(JINJA_IF);
				setState(447);
				jinjaConditions(0);
				}
			}

			setState(450);
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
		enterRule(_localctx, 72, RULE_jinjaEndFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(JINJA_STMT_START);
			setState(453);
			match(JINJA_ENDFOR);
			setState(454);
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
		enterRule(_localctx, 74, RULE_jinjaVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
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
		enterRule(_localctx, 76, RULE_jinjaExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_la = _input.LA(1);
			if ( !(_la==JINJA_EXPR_START || _la==JINJA_EXPR_START_TAG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_TEXT) {
				{
				{
				setState(459);
				match(JINJA_TEXT);
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==JINJA_COMMA) {
					{
					{
					setState(460);
					match(JINJA_COMMA);
					setState(461);
					match(JINJA_TEXT);
					}
					}
					setState(466);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472);
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
		enterRule(_localctx, 78, RULE_jinjaStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(JINJA_STMT_START);
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_TEXT) {
				{
				{
				setState(475);
				match(JINJA_TEXT);
				}
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(481);
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
		enterRule(_localctx, 80, RULE_jinjaComnt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(JINJA_COMMENT_START);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_COMMENT_TEXT) {
				{
				{
				setState(484);
				match(JINJA_COMMENT_TEXT);
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
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
		case 33:
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
		"\u0004\u0001U\u01ed\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0001\u0000\u0005\u0000T\b\u0000\n\u0000\f\u0000W\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001^\b"+
		"\u0001\u0001\u0002\u0003\u0002a\b\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002e\b\u0002\u0001\u0003\u0001\u0003\u0005\u0003i\b\u0003\n\u0003\f"+
		"\u0003l\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003r\b\u0003\n\u0003\f\u0003u\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0084"+
		"\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0089\b\u0004"+
		"\n\u0004\f\u0004\u008c\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u0097\b\u0006\n\u0006\f\u0006\u009a\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00a5\b\u0007\u0003\u0007\u00a7\b\u0007\u0001"+
		"\b\u0001\b\u0004\b\u00ab\b\b\u000b\b\f\b\u00ac\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0004\u000b\u00b8"+
		"\b\u000b\u000b\u000b\f\u000b\u00b9\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0003\r\u00c3\b\r\u0001\r\u0005\r\u00c6\b\r\n\r\f\r"+
		"\u00c9\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00d1\b\u000e\u0001\u000f\u0005\u000f\u00d4\b"+
		"\u000f\n\u000f\f\u000f\u00d7\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00dd\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u00e4\b\u0012\n\u0012\f\u0012\u00e7"+
		"\t\u0012\u0004\u0012\u00e9\b\u0012\u000b\u0012\f\u0012\u00ea\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00ef\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00f5\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u00fb\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0100\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0105\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u010e\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0115\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u011a\b\u0014\u0001\u0014\u0003\u0014"+
		"\u011d\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0123\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u012a\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0131\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u0136\b\u0015\u0001\u0015\u0003\u0015\u0139\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u013f\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0146"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u014d\b\u0016\u0001\u0016\u0003\u0016\u0150\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0003\u0018\u0156\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u015a\b\u0018\n\u0018\f\u0018\u015d\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u0170"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0174\b\u001c\u0005\u001c"+
		"\u0176\b\u001c\n\u001c\f\u001c\u0179\t\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u017d\b\u001c\u0003\u001c\u017f\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u019b\b!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u01a4\b!\u0001!\u0001!\u0001!\u0005!\u01a9\b!\n"+
		"!\f!\u01ac\t!\u0001\"\u0001\"\u0003\"\u01b0\b\"\u0001\"\u0001\"\u0003"+
		"\"\u01b4\b\"\u0003\"\u01b6\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0003#\u01c1\b#\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0005&\u01cf\b&\n&"+
		"\f&\u01d2\t&\u0005&\u01d4\b&\n&\f&\u01d7\t&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0005\'\u01dd\b\'\n\'\f\'\u01e0\t\'\u0001\'\u0001\'\u0001(\u0001(\u0005"+
		"(\u01e6\b(\n(\f(\u01e9\t(\u0001(\u0001(\u0001(\u0003\u008a\u0098\u00e5"+
		"\u0001B)\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNP\u0000\u0005\u0002\u0000B"+
		"BOO\u0002\u0000NNRS\u0001\u0000\u001f \u0001\u0000#%\u0002\u0000\u0002"+
		"\u0002,,\u0212\u0000U\u0001\u0000\u0000\u0000\u0002]\u0001\u0000\u0000"+
		"\u0000\u0004d\u0001\u0000\u0000\u0000\u0006\u0083\u0001\u0000\u0000\u0000"+
		"\b\u0085\u0001\u0000\u0000\u0000\n\u008f\u0001\u0000\u0000\u0000\f\u0093"+
		"\u0001\u0000\u0000\u0000\u000e\u009d\u0001\u0000\u0000\u0000\u0010\u00a8"+
		"\u0001\u0000\u0000\u0000\u0012\u00ae\u0001\u0000\u0000\u0000\u0014\u00b3"+
		"\u0001\u0000\u0000\u0000\u0016\u00b7\u0001\u0000\u0000\u0000\u0018\u00bb"+
		"\u0001\u0000\u0000\u0000\u001a\u00c0\u0001\u0000\u0000\u0000\u001c\u00d0"+
		"\u0001\u0000\u0000\u0000\u001e\u00d5\u0001\u0000\u0000\u0000 \u00d8\u0001"+
		"\u0000\u0000\u0000\"\u00de\u0001\u0000\u0000\u0000$\u00e8\u0001\u0000"+
		"\u0000\u0000&\u00f4\u0001\u0000\u0000\u0000(\u011c\u0001\u0000\u0000\u0000"+
		"*\u0138\u0001\u0000\u0000\u0000,\u014f\u0001\u0000\u0000\u0000.\u0151"+
		"\u0001\u0000\u0000\u00000\u0155\u0001\u0000\u0000\u00002\u0160\u0001\u0000"+
		"\u0000\u00004\u0165\u0001\u0000\u0000\u00006\u0169\u0001\u0000\u0000\u0000"+
		"8\u016d\u0001\u0000\u0000\u0000:\u0182\u0001\u0000\u0000\u0000<\u0187"+
		"\u0001\u0000\u0000\u0000>\u018c\u0001\u0000\u0000\u0000@\u0190\u0001\u0000"+
		"\u0000\u0000B\u01a3\u0001\u0000\u0000\u0000D\u01ad\u0001\u0000\u0000\u0000"+
		"F\u01b9\u0001\u0000\u0000\u0000H\u01c4\u0001\u0000\u0000\u0000J\u01c8"+
		"\u0001\u0000\u0000\u0000L\u01ca\u0001\u0000\u0000\u0000N\u01da\u0001\u0000"+
		"\u0000\u0000P\u01e3\u0001\u0000\u0000\u0000RT\u0003\u0002\u0001\u0000"+
		"SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000XY\u0005\u0000\u0000\u0001Y\u0001\u0001\u0000\u0000\u0000"+
		"Z^\u0003\u0004\u0002\u0000[^\u0005\b\u0000\u0000\\^\u0005\u0007\u0000"+
		"\u0000]Z\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]\\\u0001\u0000"+
		"\u0000\u0000^\u0003\u0001\u0000\u0000\u0000_a\u0005\u0001\u0000\u0000"+
		"`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000be\u0003\u0006\u0003\u0000ce\u0003\u0010\b\u0000d`\u0001\u0000\u0000"+
		"\u0000dc\u0001\u0000\u0000\u0000e\u0005\u0001\u0000\u0000\u0000fj\u0003"+
		"\b\u0004\u0000gi\u0003\u0006\u0003\u0000hg\u0001\u0000\u0000\u0000il\u0001"+
		"\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"km\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u0003\n\u0005\u0000"+
		"n\u0084\u0001\u0000\u0000\u0000os\u0003\u0014\n\u0000pr\u0003\u0016\u000b"+
		"\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000vw\u0005:\u0000\u0000wx\u0005+\u0000\u0000x\u0084\u0001"+
		"\u0000\u0000\u0000y\u0084\u0003\f\u0006\u0000z\u0084\u0003L&\u0000{\u0084"+
		"\u0003N\'\u0000|\u0084\u0003P(\u0000}\u0084\u00038\u001c\u0000~\u0084"+
		"\u00030\u0018\u0000\u007f\u0084\u0003D\"\u0000\u0080\u0084\u0005\b\u0000"+
		"\u0000\u0081\u0084\u00058\u0000\u0000\u0082\u0084\u0005\u0007\u0000\u0000"+
		"\u0083f\u0001\u0000\u0000\u0000\u0083o\u0001\u0000\u0000\u0000\u0083y"+
		"\u0001\u0000\u0000\u0000\u0083z\u0001\u0000\u0000\u0000\u0083{\u0001\u0000"+
		"\u0000\u0000\u0083|\u0001\u0000\u0000\u0000\u0083}\u0001\u0000\u0000\u0000"+
		"\u0083~\u0001\u0000\u0000\u0000\u0083\u007f\u0001\u0000\u0000\u0000\u0083"+
		"\u0080\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0007\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0005\u0005\u0000\u0000\u0086\u008a\u00054\u0000\u0000\u0087\u0089"+
		"\u0003\u000e\u0007\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008a\u0088"+
		"\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0005+\u0000\u0000\u008e\t\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0005\u0006\u0000\u0000\u0090\u0091\u0005"+
		"4\u0000\u0000\u0091\u0092\u0005+\u0000\u0000\u0092\u000b\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0005\u0005\u0000\u0000\u0094\u0098\u00055\u0000\u0000"+
		"\u0095\u0097\u0003\u000e\u0007\u0000\u0096\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009c\u0005+\u0000\u0000\u009c"+
		"\r\u0001\u0000\u0000\u0000\u009d\u00a6\u00056\u0000\u0000\u009e\u00a4"+
		"\u00050\u0000\u0000\u009f\u00a0\u0005.\u0000\u0000\u00a0\u00a1\u0003L"+
		"&\u0000\u00a1\u00a2\u0005.\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a5\u00057\u0000\u0000\u00a4\u009f\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6"+
		"\u009e\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u000f\u0001\u0000\u0000\u0000\u00a8\u00aa\u0003\u0012\t\u0000\u00a9\u00ab"+
		"\u00030\u0018\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ad\u0011\u0001\u0000\u0000\u0000\u00ae\u00af\u0005"+
		"\u0003\u0000\u0000\u00af\u00b0\u0005\u0014\u0000\u0000\u00b0\u00b1\u0005"+
		"%\u0000\u0000\u00b1\u00b2\u0005\u000e\u0000\u0000\u00b2\u0013\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0005\u0005\u0000\u0000\u00b4\u00b5\u0005-\u0000"+
		"\u0000\u00b5\u0015\u0001\u0000\u0000\u0000\u00b6\u00b8\u0003\u0018\f\u0000"+
		"\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000"+
		"\u00ba\u0017\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003\u001a\r\u0000\u00bc"+
		"\u00bd\u0005;\u0000\u0000\u00bd\u00be\u0003\u001e\u000f\u0000\u00be\u00bf"+
		"\u0005<\u0000\u0000\u00bf\u0019\u0001\u0000\u0000\u0000\u00c0\u00c7\u0003"+
		"\u001c\u000e\u0000\u00c1\u00c3\u0005?\u0000\u0000\u00c2\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c6\u0003\u001c\u000e\u0000\u00c5\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u001b\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00d1\u0005R\u0000"+
		"\u0000\u00cb\u00cc\u0005@\u0000\u0000\u00cc\u00d1\u0005R\u0000\u0000\u00cd"+
		"\u00ce\u0005A\u0000\u0000\u00ce\u00d1\u0005R\u0000\u0000\u00cf\u00d1\u0005"+
		"B\u0000\u0000\u00d0\u00ca\u0001\u0000\u0000\u0000\u00d0\u00cb\u0001\u0000"+
		"\u0000\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d1\u001d\u0001\u0000\u0000\u0000\u00d2\u00d4\u0003 \u0010"+
		"\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d6\u001f\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0003\"\u0011\u0000\u00d9\u00da\u0005=\u0000\u0000"+
		"\u00da\u00dc\u0003$\u0012\u0000\u00db\u00dd\u0005>\u0000\u0000\u00dc\u00db"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd!\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0005R\u0000\u0000\u00df#\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e5\u0003&\u0013\u0000\u00e1\u00e2\u0005?\u0000\u0000\u00e2"+
		"\u00e4\u0003&\u0013\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e0\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0001\u0000\u0000\u0000\u00eb%\u0001\u0000\u0000\u0000\u00ec\u00ee\u0005"+
		"N\u0000\u0000\u00ed\u00ef\u0005P\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f5\u0005Q\u0000\u0000\u00f1\u00f5\u0005R\u0000\u0000\u00f2"+
		"\u00f5\u0003.\u0017\u0000\u00f3\u00f5\u0003(\u0014\u0000\u00f4\u00ec\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f0\u0001\u0000\u0000\u0000\u00f4\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f5\'\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005E"+
		"\u0000\u0000\u00f7\u00f8\u0005C\u0000\u0000\u00f8\u00fa\u0005N\u0000\u0000"+
		"\u00f9\u00fb\u0005P\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0005?\u0000\u0000\u00fd\u00ff\u0005N\u0000\u0000\u00fe\u0100\u0005"+
		"P\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102\u0005?\u0000"+
		"\u0000\u0102\u0104\u0005N\u0000\u0000\u0103\u0105\u0005P\u0000\u0000\u0104"+
		"\u0103\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105"+
		"\u0106\u0001\u0000\u0000\u0000\u0106\u011d\u0005D\u0000\u0000\u0107\u011d"+
		"\u0003*\u0015\u0000\u0108\u011d\u0003,\u0016\u0000\u0109\u010a\u0005I"+
		"\u0000\u0000\u010a\u010b\u0005C\u0000\u0000\u010b\u010d\u0005N\u0000\u0000"+
		"\u010c\u010e\u0005P\u0000\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f"+
		"\u011d\u0005D\u0000\u0000\u0110\u0111\u0005M\u0000\u0000\u0111\u0112\u0005"+
		"C\u0000\u0000\u0112\u0114\u0005N\u0000\u0000\u0113\u0115\u0005P\u0000"+
		"\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000"+
		"\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0007\u0000\u0000"+
		"\u0000\u0117\u0119\u0005N\u0000\u0000\u0118\u011a\u0005P\u0000\u0000\u0119"+
		"\u0118\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0001\u0000\u0000\u0000\u011b\u011d\u0005D\u0000\u0000\u011c\u00f6"+
		"\u0001\u0000\u0000\u0000\u011c\u0107\u0001\u0000\u0000\u0000\u011c\u0108"+
		"\u0001\u0000\u0000\u0000\u011c\u0109\u0001\u0000\u0000\u0000\u011c\u0110"+
		"\u0001\u0000\u0000\u0000\u011d)\u0001\u0000\u0000\u0000\u011e\u011f\u0005"+
		"F\u0000\u0000\u011f\u0120\u0005C\u0000\u0000\u0120\u0122\u0005N\u0000"+
		"\u0000\u0121\u0123\u0005P\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000"+
		"\u0124\u0139\u0005D\u0000\u0000\u0125\u0126\u0005G\u0000\u0000\u0126\u0127"+
		"\u0005C\u0000\u0000\u0127\u0129\u0005N\u0000\u0000\u0128\u012a\u0005P"+
		"\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u0139\u0005D\u0000"+
		"\u0000\u012c\u012d\u0005H\u0000\u0000\u012d\u012e\u0005C\u0000\u0000\u012e"+
		"\u0130\u0005N\u0000\u0000\u012f\u0131\u0005P\u0000\u0000\u0130\u012f\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0005?\u0000\u0000\u0133\u0135\u0005N\u0000"+
		"\u0000\u0134\u0136\u0005P\u0000\u0000\u0135\u0134\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000"+
		"\u0137\u0139\u0005D\u0000\u0000\u0138\u011e\u0001\u0000\u0000\u0000\u0138"+
		"\u0125\u0001\u0000\u0000\u0000\u0138\u012c\u0001\u0000\u0000\u0000\u0139"+
		"+\u0001\u0000\u0000\u0000\u013a\u013b\u0005J\u0000\u0000\u013b\u013c\u0005"+
		"C\u0000\u0000\u013c\u013e\u0005N\u0000\u0000\u013d\u013f\u0005P\u0000"+
		"\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0150\u0005D\u0000\u0000"+
		"\u0141\u0142\u0005K\u0000\u0000\u0142\u0143\u0005C\u0000\u0000\u0143\u0145"+
		"\u0005N\u0000\u0000\u0144\u0146\u0005P\u0000\u0000\u0145\u0144\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000"+
		"\u0000\u0000\u0147\u0150\u0005D\u0000\u0000\u0148\u0149\u0005L\u0000\u0000"+
		"\u0149\u014a\u0005C\u0000\u0000\u014a\u014c\u0005N\u0000\u0000\u014b\u014d"+
		"\u0005P\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014c\u014d\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0150\u0005"+
		"D\u0000\u0000\u014f\u013a\u0001\u0000\u0000\u0000\u014f\u0141\u0001\u0000"+
		"\u0000\u0000\u014f\u0148\u0001\u0000\u0000\u0000\u0150-\u0001\u0000\u0000"+
		"\u0000\u0151\u0152\u0005A\u0000\u0000\u0152\u0153\u0007\u0001\u0000\u0000"+
		"\u0153/\u0001\u0000\u0000\u0000\u0154\u0156\u00036\u001b\u0000\u0155\u0154"+
		"\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157"+
		"\u0001\u0000\u0000\u0000\u0157\u015b\u00032\u0019\u0000\u0158\u015a\u0003"+
		"\u0006\u0003\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u015a\u015d\u0001"+
		"\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001"+
		"\u0000\u0000\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u015b\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u00034\u001a\u0000\u015f1\u0001\u0000\u0000"+
		"\u0000\u0160\u0161\u0005\u0003\u0000\u0000\u0161\u0162\u0005\u0011\u0000"+
		"\u0000\u0162\u0163\u0005$\u0000\u0000\u0163\u0164\u0005\u000e\u0000\u0000"+
		"\u01643\u0001\u0000\u0000\u0000\u0165\u0166\u0005\u0003\u0000\u0000\u0166"+
		"\u0167\u0005\u0012\u0000\u0000\u0167\u0168\u0005\u000e\u0000\u0000\u0168"+
		"5\u0001\u0000\u0000\u0000\u0169\u016a\u0005\u0002\u0000\u0000\u016a\u016b"+
		"\u0005\u0013\u0000\u0000\u016b\u016c\u0005\n\u0000\u0000\u016c7\u0001"+
		"\u0000\u0000\u0000\u016d\u016f\u0003:\u001d\u0000\u016e\u0170\u0003\u0006"+
		"\u0003\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000"+
		"\u0000\u0000\u0170\u0177\u0001\u0000\u0000\u0000\u0171\u0173\u0003<\u001e"+
		"\u0000\u0172\u0174\u0003\u0006\u0003\u0000\u0173\u0172\u0001\u0000\u0000"+
		"\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0176\u0001\u0000\u0000"+
		"\u0000\u0175\u0171\u0001\u0000\u0000\u0000\u0176\u0179\u0001\u0000\u0000"+
		"\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000"+
		"\u0000\u0178\u017e\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000"+
		"\u0000\u017a\u017c\u0003>\u001f\u0000\u017b\u017d\u0003\u0006\u0003\u0000"+
		"\u017c\u017b\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000"+
		"\u017d\u017f\u0001\u0000\u0000\u0000\u017e\u017a\u0001\u0000\u0000\u0000"+
		"\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000"+
		"\u0180\u0181\u0003@ \u0000\u01819\u0001\u0000\u0000\u0000\u0182\u0183"+
		"\u0005\u0003\u0000\u0000\u0183\u0184\u0005\u0018\u0000\u0000\u0184\u0185"+
		"\u0003B!\u0000\u0185\u0186\u0005\u000e\u0000\u0000\u0186;\u0001\u0000"+
		"\u0000\u0000\u0187\u0188\u0005\u0003\u0000\u0000\u0188\u0189\u0005\u0019"+
		"\u0000\u0000\u0189\u018a\u0003B!\u0000\u018a\u018b\u0005\u000e\u0000\u0000"+
		"\u018b=\u0001\u0000\u0000\u0000\u018c\u018d\u0005\u0003\u0000\u0000\u018d"+
		"\u018e\u0005\u001a\u0000\u0000\u018e\u018f\u0005\u000e\u0000\u0000\u018f"+
		"?\u0001\u0000\u0000\u0000\u0190\u0191\u0005\u0003\u0000\u0000\u0191\u0192"+
		"\u0005\u001b\u0000\u0000\u0192\u0193\u0005\u000e\u0000\u0000\u0193A\u0001"+
		"\u0000\u0000\u0000\u0194\u0195\u0006!\uffff\uffff\u0000\u0195\u0196\u0005"+
		"\u000f\u0000\u0000\u0196\u0197\u0003B!\u0000\u0197\u0198\u0005\u0010\u0000"+
		"\u0000\u0198\u01a4\u0001\u0000\u0000\u0000\u0199\u019b\u0005\"\u0000\u0000"+
		"\u019a\u0199\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u01a4\u0003J%\u0000\u019d\u019e"+
		"\u0005\"\u0000\u0000\u019e\u01a4\u0003B!\u0002\u019f\u01a0\u0003J%\u0000"+
		"\u01a0\u01a1\u0007\u0002\u0000\u0000\u01a1\u01a2\u0003J%\u0000\u01a2\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a3\u0194\u0001\u0000\u0000\u0000\u01a3\u019a"+
		"\u0001\u0000\u0000\u0000\u01a3\u019d\u0001\u0000\u0000\u0000\u01a3\u019f"+
		"\u0001\u0000\u0000\u0000\u01a4\u01aa\u0001\u0000\u0000\u0000\u01a5\u01a6"+
		"\n\u0005\u0000\u0000\u01a6\u01a7\u0005!\u0000\u0000\u01a7\u01a9\u0003"+
		"B!\u0006\u01a8\u01a5\u0001\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000\u0000"+
		"\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000"+
		"\u0000\u01abC\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000"+
		"\u01ad\u01af\u0003F#\u0000\u01ae\u01b0\u0003\u0006\u0003\u0000\u01af\u01ae"+
		"\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b3\u0003>\u001f\u0000\u01b2\u01b4\u0003"+
		"\u0006\u0003\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b6\u0001\u0000\u0000\u0000\u01b5\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b8\u0003H$\u0000\u01b8E\u0001\u0000\u0000"+
		"\u0000\u01b9\u01ba\u0005\u0003\u0000\u0000\u01ba\u01bb\u0005\u0016\u0000"+
		"\u0000\u01bb\u01bc\u0005$\u0000\u0000\u01bc\u01bd\u0005\u001f\u0000\u0000"+
		"\u01bd\u01c0\u0005$\u0000\u0000\u01be\u01bf\u0005\u0018\u0000\u0000\u01bf"+
		"\u01c1\u0003B!\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001"+
		"\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005"+
		"\u000e\u0000\u0000\u01c3G\u0001\u0000\u0000\u0000\u01c4\u01c5\u0005\u0003"+
		"\u0000\u0000\u01c5\u01c6\u0005\u0017\u0000\u0000\u01c6\u01c7\u0005\u000e"+
		"\u0000\u0000\u01c7I\u0001\u0000\u0000\u0000\u01c8\u01c9\u0007\u0003\u0000"+
		"\u0000\u01c9K\u0001\u0000\u0000\u0000\u01ca\u01d5\u0007\u0004\u0000\u0000"+
		"\u01cb\u01d0\u0005\f\u0000\u0000\u01cc\u01cd\u0005\u000b\u0000\u0000\u01cd"+
		"\u01cf\u0005\f\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d0\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d4\u0001\u0000\u0000\u0000\u01d2\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d3\u01cb\u0001\u0000\u0000\u0000\u01d4\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d8\u0001\u0000\u0000\u0000\u01d7\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005\n\u0000\u0000\u01d9M\u0001"+
		"\u0000\u0000\u0000\u01da\u01de\u0005\u0003\u0000\u0000\u01db\u01dd\u0005"+
		"\f\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dd\u01e0\u0001\u0000"+
		"\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000"+
		"\u0000\u0000\u01df\u01e1\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e2\u0005\u000e\u0000\u0000\u01e2O\u0001\u0000\u0000"+
		"\u0000\u01e3\u01e7\u0005\u0004\u0000\u0000\u01e4\u01e6\u0005)\u0000\u0000"+
		"\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e9\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000"+
		"\u01e8\u01ea\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000"+
		"\u01ea\u01eb\u0005(\u0000\u0000\u01ebQ\u0001\u0000\u0000\u00008U]`djs"+
		"\u0083\u008a\u0098\u00a4\u00a6\u00ac\u00b9\u00c2\u00c7\u00d0\u00d5\u00dc"+
		"\u00e5\u00ea\u00ee\u00f4\u00fa\u00ff\u0104\u010d\u0114\u0119\u011c\u0122"+
		"\u0129\u0130\u0135\u0138\u013e\u0145\u014c\u014f\u0155\u015b\u016f\u0173"+
		"\u0177\u017c\u017e\u019a\u01a3\u01aa\u01af\u01b3\u01b5\u01c0\u01d0\u01d5"+
		"\u01de\u01e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}