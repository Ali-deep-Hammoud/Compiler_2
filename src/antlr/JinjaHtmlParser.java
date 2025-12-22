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
		DOCTYPE=1, JINJA_EXPR_START=2, JINJA_STMT_START=3, OST=4, OET=5, JINJA_COMMENT=6, 
		HTML_COMMENT=7, WS=8, TEXT=9, JINJA_EXPR_END=10, JINJA_LP_EXPR=11, JINJA_RP_EXPR=12, 
		JINJA_COMMA=13, JINJA_DOT_EXPR=14, JINJA_EQUAL=15, JINJA_COMBINE=16, JINJA_ID_EXPR=17, 
		JINJA_STRING_EXPR=18, JINJA_EXPR_WS=19, JINJA_TEXT=20, JINJA_STMT_END=21, 
		JINJA_LP=22, JINJA_RP=23, JINJA_DOT_STMT=24, JINJA_BLOCK=25, JINJA_ENDBLOCK=26, 
		JINJA_SUPER=27, JINJA_EXTENDS=28, JINJA_INCLUDE=29, JINJA_FOR=30, JINJA_ENDFOR=31, 
		JINJA_IF=32, JINJA_ELIF=33, JINJA_ELSE=34, JINJA_ENDIF=35, JINJA_INS=36, 
		JINJA_COMPARE=37, JINJA_LOGIC=38, JINJA_NOT=39, JINJA_NUM=40, JINJA_ID_STMT=41, 
		JINJA_STRING=42, JINJA_STMT_WS=43, JINJA_TEXT_STMT=44, CT=45, JINJA_EXPR_START_TAG=46, 
		STYLE_TAG=47, EM=48, EQUALS=49, COLON=50, LKB=51, RKB=52, PAIRED_TAG=53, 
		VOID_TAG=54, STRING=55, ID=56, JINJA_DQ=57, JINJA_SQ=58, TAG_WS=59, CSS_END_STYLE=60, 
		CSS_LBRACE=61, CSS_RBRACE=62, CSS_COLON=63, CSS_SEMI=64, CSS_COMMA=65, 
		CSS_DOT=66, CSS_HASH=67, CSS_ALL=68, CSS_LP=69, CSS_RP=70, CSS_HSL=71, 
		CSS_TRANSLATEX=72, CSS_TRANSLATEY=73, CSS_TRANSLATE=74, CSS_ROTATE=75, 
		CSS_SCALEX=76, CSS_SCALEY=77, CSS_SCALE=78, CSS_CALC=79, CSS_NUMBER=80, 
		CSS_MATH=81, CSS_UNIT=82, CSS_STRING=83, CSS_HEX=84, CSS_NAME=85, CSS_COMMENT=86, 
		CSS_WS=87;
	public static final int
		RULE_prog = 0, RULE_document = 1, RULE_body = 2, RULE_startElement = 3, 
		RULE_endElement = 4, RULE_singleElement = 5, RULE_attribute = 6, RULE_attributeValue = 7, 
		RULE_jinjaInheritance = 8, RULE_inheritanceStart = 9, RULE_styleStartElement = 10, 
		RULE_styleEndElement = 11, RULE_styleBody = 12, RULE_cssRule = 13, RULE_selectorList = 14, 
		RULE_selector = 15, RULE_declarationList = 16, RULE_declaration = 17, 
		RULE_property = 18, RULE_value = 19, RULE_cssTerm = 20, RULE_functions = 21, 
		RULE_translate = 22, RULE_scale = 23, RULE_hexNum = 24, RULE_jinjaBlock = 25, 
		RULE_jinjaBlockStart = 26, RULE_jinjaBlockeEnd = 27, RULE_jinjaSuperBlock = 28, 
		RULE_jinjaConditionStmt = 29, RULE_jinjaIf = 30, RULE_jinjaElseIf = 31, 
		RULE_jinjaElse = 32, RULE_jinjaEndIf = 33, RULE_jinjaConditions = 34, 
		RULE_jinjaForLoop = 35, RULE_jinjaFor = 36, RULE_jinjaEndFor = 37, RULE_jinjaVariable = 38, 
		RULE_jinjaId = 39, RULE_jinjaExpr = 40, RULE_expr = 41, RULE_functionCall = 42, 
		RULE_jinjaStmt = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "document", "body", "startElement", "endElement", "singleElement", 
			"attribute", "attributeValue", "jinjaInheritance", "inheritanceStart", 
			"styleStartElement", "styleEndElement", "styleBody", "cssRule", "selectorList", 
			"selector", "declarationList", "declaration", "property", "value", "cssTerm", 
			"functions", "translate", "scale", "hexNum", "jinjaBlock", "jinjaBlockStart", 
			"jinjaBlockeEnd", "jinjaSuperBlock", "jinjaConditionStmt", "jinjaIf", 
			"jinjaElseIf", "jinjaElse", "jinjaEndIf", "jinjaConditions", "jinjaForLoop", 
			"jinjaFor", "jinjaEndFor", "jinjaVariable", "jinjaId", "jinjaExpr", "expr", 
			"functionCall", "jinjaStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'{%'", "'<'", "'</'", null, null, null, null, "'}}'", 
			null, null, null, null, null, "'~'", null, null, null, null, "'%}'", 
			null, null, null, "'block'", "'endblock'", "'super'", "'extends'", "'include'", 
			"'for'", "'endfor'", "'if'", "'elif'", "'else'", "'endif'", null, null, 
			null, "'not'", null, null, null, null, null, "'>'", null, "'style>'", 
			"'!'", null, null, null, null, null, null, null, null, "'\"'", "'''", 
			null, "'</style'", null, null, null, "';'", null, null, "'#'", "'*'", 
			null, null, "'hsl'", "'translateX'", "'translateY'", "'translate'", "'rotate'", 
			"'scaleX'", "'scaleY'", "'scale'", "'calc'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOCTYPE", "JINJA_EXPR_START", "JINJA_STMT_START", "OST", "OET", 
			"JINJA_COMMENT", "HTML_COMMENT", "WS", "TEXT", "JINJA_EXPR_END", "JINJA_LP_EXPR", 
			"JINJA_RP_EXPR", "JINJA_COMMA", "JINJA_DOT_EXPR", "JINJA_EQUAL", "JINJA_COMBINE", 
			"JINJA_ID_EXPR", "JINJA_STRING_EXPR", "JINJA_EXPR_WS", "JINJA_TEXT", 
			"JINJA_STMT_END", "JINJA_LP", "JINJA_RP", "JINJA_DOT_STMT", "JINJA_BLOCK", 
			"JINJA_ENDBLOCK", "JINJA_SUPER", "JINJA_EXTENDS", "JINJA_INCLUDE", "JINJA_FOR", 
			"JINJA_ENDFOR", "JINJA_IF", "JINJA_ELIF", "JINJA_ELSE", "JINJA_ENDIF", 
			"JINJA_INS", "JINJA_COMPARE", "JINJA_LOGIC", "JINJA_NOT", "JINJA_NUM", 
			"JINJA_ID_STMT", "JINJA_STRING", "JINJA_STMT_WS", "JINJA_TEXT_STMT", 
			"CT", "JINJA_EXPR_START_TAG", "STYLE_TAG", "EM", "EQUALS", "COLON", "LKB", 
			"RKB", "PAIRED_TAG", "VOID_TAG", "STRING", "ID", "JINJA_DQ", "JINJA_SQ", 
			"TAG_WS", "CSS_END_STYLE", "CSS_LBRACE", "CSS_RBRACE", "CSS_COLON", "CSS_SEMI", 
			"CSS_COMMA", "CSS_DOT", "CSS_HASH", "CSS_ALL", "CSS_LP", "CSS_RP", "CSS_HSL", 
			"CSS_TRANSLATEX", "CSS_TRANSLATEY", "CSS_TRANSLATE", "CSS_ROTATE", "CSS_SCALEX", 
			"CSS_SCALEY", "CSS_SCALE", "CSS_CALC", "CSS_NUMBER", "CSS_MATH", "CSS_UNIT", 
			"CSS_STRING", "CSS_HEX", "CSS_NAME", "CSS_COMMENT", "CSS_WS"
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
		public List<DocumentContext> document() {
			return getRuleContexts(DocumentContext.class);
		}
		public DocumentContext document(int i) {
			return getRuleContext(DocumentContext.class,i);
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
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72127962782106142L) != 0)) {
				{
				{
				setState(88);
				document();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
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
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
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
		enterRule(_localctx, 2, RULE_document);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new HtmlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOCTYPE) {
					{
					setState(96);
					match(DOCTYPE);
					}
				}

				setState(99);
				body();
				}
				break;
			case 2:
				_localctx = new JinjaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
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
	public static class BodyContext extends ParserRuleContext {
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	 
		public BodyContext() { }
		public void copyFrom(BodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockPlaceContext extends BodyContext {
		public JinjaBlockContext jinjaBlock() {
			return getRuleContext(JinjaBlockContext.class,0);
		}
		public JinjaBlockPlaceContext(BodyContext ctx) { copyFrom(ctx); }
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
	public static class SingleHtmlContext extends BodyContext {
		public SingleElementContext singleElement() {
			return getRuleContext(SingleElementContext.class,0);
		}
		public SingleHtmlContext(BodyContext ctx) { copyFrom(ctx); }
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
	public static class JinjaConditionStatementContext extends BodyContext {
		public JinjaConditionStmtContext jinjaConditionStmt() {
			return getRuleContext(JinjaConditionStmtContext.class,0);
		}
		public JinjaConditionStatementContext(BodyContext ctx) { copyFrom(ctx); }
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
	public static class IdentifierContext extends BodyContext {
		public TerminalNode ID() { return getToken(JinjaHtmlParser.ID, 0); }
		public IdentifierContext(BodyContext ctx) { copyFrom(ctx); }
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
	public static class HtmlElementContext extends BodyContext {
		public StartElementContext startElement() {
			return getRuleContext(StartElementContext.class,0);
		}
		public EndElementContext endElement() {
			return getRuleContext(EndElementContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public HtmlElementContext(BodyContext ctx) { copyFrom(ctx); }
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
	public static class JinjaLoopContext extends BodyContext {
		public JinjaForLoopContext jinjaForLoop() {
			return getRuleContext(JinjaForLoopContext.class,0);
		}
		public JinjaLoopContext(BodyContext ctx) { copyFrom(ctx); }
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
	public static class JinjaStatementContext extends BodyContext {
		public JinjaStmtContext jinjaStmt() {
			return getRuleContext(JinjaStmtContext.class,0);
		}
		public JinjaStatementContext(BodyContext ctx) { copyFrom(ctx); }
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
	public static class StyleElementContext extends BodyContext {
		public StyleStartElementContext styleStartElement() {
			return getRuleContext(StyleStartElementContext.class,0);
		}
		public StyleEndElementContext styleEndElement() {
			return getRuleContext(StyleEndElementContext.class,0);
		}
		public List<StyleBodyContext> styleBody() {
			return getRuleContexts(StyleBodyContext.class);
		}
		public StyleBodyContext styleBody(int i) {
			return getRuleContext(StyleBodyContext.class,i);
		}
		public StyleElementContext(BodyContext ctx) { copyFrom(ctx); }
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
	public static class JinjaExpressionContext extends BodyContext {
		public JinjaExprContext jinjaExpr() {
			return getRuleContext(JinjaExprContext.class,0);
		}
		public JinjaExpressionContext(BodyContext ctx) { copyFrom(ctx); }
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
	public static class TextContext extends BodyContext {
		public TerminalNode TEXT() { return getToken(JinjaHtmlParser.TEXT, 0); }
		public TextContext(BodyContext ctx) { copyFrom(ctx); }
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
	public static class JinjaInheritanceBodyContext extends BodyContext {
		public JinjaInheritanceContext jinjaInheritance() {
			return getRuleContext(JinjaInheritanceContext.class,0);
		}
		public JinjaInheritanceBodyContext(BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaInheritanceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaInheritanceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaInheritanceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new HtmlElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				startElement();
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72127962782106140L) != 0)) {
					{
					{
					setState(104);
					body();
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110);
				endElement();
				}
				break;
			case 2:
				_localctx = new StyleElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				styleStartElement();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 524295L) != 0)) {
					{
					{
					setState(113);
					styleBody();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				styleEndElement();
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
				_localctx = new JinjaConditionStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				jinjaConditionStmt();
				}
				break;
			case 6:
				_localctx = new JinjaBlockPlaceContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				jinjaBlock();
				}
				break;
			case 7:
				_localctx = new JinjaLoopContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				jinjaForLoop();
				}
				break;
			case 8:
				_localctx = new JinjaStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(126);
				jinjaStmt();
				}
				break;
			case 9:
				_localctx = new JinjaInheritanceBodyContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(127);
				jinjaInheritance();
				}
				break;
			case 10:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(128);
				match(ID);
				}
				break;
			case 11:
				_localctx = new TextContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(129);
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
		enterRule(_localctx, 6, RULE_startElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(OST);
			setState(133);
			match(PAIRED_TAG);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(134);
				attribute();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
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
		enterRule(_localctx, 8, RULE_endElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(OET);
			setState(143);
			match(PAIRED_TAG);
			setState(144);
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
		enterRule(_localctx, 10, RULE_singleElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(OST);
			setState(147);
			match(VOID_TAG);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(148);
				attribute();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
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
		public TerminalNode ID() { return getToken(JinjaHtmlParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(JinjaHtmlParser.EQUALS, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ID);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(157);
				match(EQUALS);
				setState(158);
				attributeValue();
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
	public static class AttributeValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JinjaHtmlParser.STRING, 0); }
		public List<TerminalNode> JINJA_SQ() { return getTokens(JinjaHtmlParser.JINJA_SQ); }
		public TerminalNode JINJA_SQ(int i) {
			return getToken(JinjaHtmlParser.JINJA_SQ, i);
		}
		public JinjaExprContext jinjaExpr() {
			return getRuleContext(JinjaExprContext.class,0);
		}
		public List<TerminalNode> JINJA_DQ() { return getTokens(JinjaHtmlParser.JINJA_DQ); }
		public TerminalNode JINJA_DQ(int i) {
			return getToken(JinjaHtmlParser.JINJA_DQ, i);
		}
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attributeValue);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(STRING);
				}
				break;
			case JINJA_SQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(JINJA_SQ);
				setState(163);
				jinjaExpr();
				setState(164);
				match(JINJA_SQ);
				}
				break;
			case JINJA_DQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(JINJA_DQ);
				setState(167);
				jinjaExpr();
				setState(168);
				match(JINJA_DQ);
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
	public static class JinjaInheritanceContext extends ParserRuleContext {
		public InheritanceStartContext inheritanceStart() {
			return getRuleContext(InheritanceStartContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
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
			setState(172);
			inheritanceStart();
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					body();
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(180); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(179);
					jinjaBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(182); 
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
			setState(184);
			match(JINJA_STMT_START);
			setState(185);
			match(JINJA_EXTENDS);
			setState(186);
			match(JINJA_STRING);
			setState(187);
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
			setState(189);
			match(OST);
			setState(190);
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
	public static class StyleEndElementContext extends ParserRuleContext {
		public TerminalNode CSS_END_STYLE() { return getToken(JinjaHtmlParser.CSS_END_STYLE, 0); }
		public TerminalNode CT() { return getToken(JinjaHtmlParser.CT, 0); }
		public StyleEndElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleEndElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterStyleEndElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitStyleEndElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitStyleEndElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleEndElementContext styleEndElement() throws RecognitionException {
		StyleEndElementContext _localctx = new StyleEndElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_styleEndElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(CSS_END_STYLE);
			setState(193);
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
		enterRule(_localctx, 24, RULE_styleBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(195);
					cssRule();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(198); 
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
		enterRule(_localctx, 26, RULE_cssRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			selectorList();
			setState(201);
			match(CSS_LBRACE);
			setState(202);
			declarationList();
			setState(203);
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
		enterRule(_localctx, 28, RULE_selectorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			selector();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1048591L) != 0)) {
				{
				{
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_COMMA) {
					{
					setState(206);
					match(CSS_COMMA);
					}
				}

				setState(209);
				selector();
				}
				}
				setState(214);
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
		enterRule(_localctx, 30, RULE_selector);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_NAME:
				_localctx = new NormalSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(CSS_NAME);
				}
				break;
			case CSS_DOT:
				_localctx = new ClassSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(CSS_DOT);
				setState(217);
				match(CSS_NAME);
				}
				break;
			case CSS_HASH:
				_localctx = new IdSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(CSS_HASH);
				setState(219);
				match(CSS_NAME);
				}
				break;
			case CSS_ALL:
				_localctx = new AllSelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
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
		enterRule(_localctx, 32, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_NAME) {
				{
				{
				setState(223);
				declaration();
				}
				}
				setState(228);
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
		enterRule(_localctx, 34, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			property();
			setState(230);
			match(CSS_COLON);
			setState(231);
			value();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMI) {
				{
				setState(232);
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
		enterRule(_localctx, 36, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
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
		enterRule(_localctx, 38, RULE_value);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(237);
					cssTerm();
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==CSS_COMMA) {
						{
						{
						setState(238);
						match(CSS_COMMA);
						setState(239);
						cssTerm();
						}
						}
						setState(244);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(247); 
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
		enterRule(_localctx, 40, RULE_cssTerm);
		int _la;
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_NUMBER:
				_localctx = new NumberTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(CSS_NUMBER);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(250);
					match(CSS_UNIT);
					}
				}

				}
				break;
			case CSS_STRING:
				_localctx = new StringTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(CSS_STRING);
				}
				break;
			case CSS_NAME:
				_localctx = new NameTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(CSS_NAME);
				}
				break;
			case CSS_HASH:
				_localctx = new HexTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
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
				setState(256);
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
		enterRule(_localctx, 42, RULE_functions);
		int _la;
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_HSL:
				_localctx = new HSLFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(CSS_HSL);
				setState(260);
				match(CSS_LP);
				setState(261);
				match(CSS_NUMBER);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(262);
					match(CSS_UNIT);
					}
				}

				setState(265);
				match(CSS_COMMA);
				setState(266);
				match(CSS_NUMBER);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(267);
					match(CSS_UNIT);
					}
				}

				setState(270);
				match(CSS_COMMA);
				setState(271);
				match(CSS_NUMBER);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(272);
					match(CSS_UNIT);
					}
				}

				setState(275);
				match(CSS_RP);
				}
				break;
			case CSS_TRANSLATEX:
			case CSS_TRANSLATEY:
			case CSS_TRANSLATE:
				_localctx = new TranslateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				translate();
				}
				break;
			case CSS_SCALEX:
			case CSS_SCALEY:
			case CSS_SCALE:
				_localctx = new ScaleFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				scale();
				}
				break;
			case CSS_ROTATE:
				_localctx = new RotateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				match(CSS_ROTATE);
				setState(279);
				match(CSS_LP);
				setState(280);
				match(CSS_NUMBER);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(281);
					match(CSS_UNIT);
					}
				}

				setState(284);
				match(CSS_RP);
				}
				break;
			case CSS_CALC:
				_localctx = new CalcFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
				match(CSS_CALC);
				setState(286);
				match(CSS_LP);
				setState(287);
				match(CSS_NUMBER);
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(288);
					match(CSS_UNIT);
					}
				}

				setState(291);
				_la = _input.LA(1);
				if ( !(_la==CSS_ALL || _la==CSS_MATH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(292);
				match(CSS_NUMBER);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(293);
					match(CSS_UNIT);
					}
				}

				setState(296);
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
		enterRule(_localctx, 44, RULE_translate);
		int _la;
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_TRANSLATEX:
				_localctx = new TranslateXContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(CSS_TRANSLATEX);
				setState(300);
				match(CSS_LP);
				setState(301);
				match(CSS_NUMBER);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(302);
					match(CSS_UNIT);
					}
				}

				setState(305);
				match(CSS_RP);
				}
				break;
			case CSS_TRANSLATEY:
				_localctx = new TranslateYContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(CSS_TRANSLATEY);
				setState(307);
				match(CSS_LP);
				setState(308);
				match(CSS_NUMBER);
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(309);
					match(CSS_UNIT);
					}
				}

				setState(312);
				match(CSS_RP);
				}
				break;
			case CSS_TRANSLATE:
				_localctx = new TranslateFullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				match(CSS_TRANSLATE);
				setState(314);
				match(CSS_LP);
				setState(315);
				match(CSS_NUMBER);
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(316);
					match(CSS_UNIT);
					}
				}

				setState(319);
				match(CSS_COMMA);
				setState(320);
				match(CSS_NUMBER);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(321);
					match(CSS_UNIT);
					}
				}

				setState(324);
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
		enterRule(_localctx, 46, RULE_scale);
		int _la;
		try {
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_SCALEX:
				_localctx = new ScaleXContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(CSS_SCALEX);
				setState(328);
				match(CSS_LP);
				setState(329);
				match(CSS_NUMBER);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(330);
					match(CSS_UNIT);
					}
				}

				setState(333);
				match(CSS_RP);
				}
				break;
			case CSS_SCALEY:
				_localctx = new ScaleYContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(CSS_SCALEY);
				setState(335);
				match(CSS_LP);
				setState(336);
				match(CSS_NUMBER);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(337);
					match(CSS_UNIT);
					}
				}

				setState(340);
				match(CSS_RP);
				}
				break;
			case CSS_SCALE:
				_localctx = new ScaleFullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				match(CSS_SCALE);
				setState(342);
				match(CSS_LP);
				setState(343);
				match(CSS_NUMBER);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(344);
					match(CSS_UNIT);
					}
				}

				setState(347);
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
		enterRule(_localctx, 48, RULE_hexNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(CSS_HASH);
			setState(351);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 49L) != 0)) ) {
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
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
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
		enterRule(_localctx, 50, RULE_jinjaBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_EXPR_START) {
				{
				setState(353);
				jinjaSuperBlock();
				}
			}

			setState(356);
			jinjaBlockStart();
			setState(360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(357);
					body();
					}
					} 
				}
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(363);
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
		public JinjaIdContext jinjaId() {
			return getRuleContext(JinjaIdContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_jinjaBlockStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(JINJA_STMT_START);
			setState(366);
			match(JINJA_BLOCK);
			setState(367);
			jinjaId();
			setState(368);
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
		enterRule(_localctx, 54, RULE_jinjaBlockeEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(JINJA_STMT_START);
			setState(371);
			match(JINJA_ENDBLOCK);
			setState(372);
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
		enterRule(_localctx, 56, RULE_jinjaSuperBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(JINJA_EXPR_START);
			setState(375);
			match(JINJA_SUPER);
			setState(376);
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
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
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
		enterRule(_localctx, 58, RULE_jinjaConditionStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			jinjaIf();
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(379);
				body();
				}
				break;
			}
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(382);
					jinjaElseIf();
					setState(384);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(383);
						body();
						}
						break;
					}
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(391);
				jinjaElse();
				setState(393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(392);
					body();
					}
					break;
				}
				}
				break;
			}
			setState(397);
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
		enterRule(_localctx, 60, RULE_jinjaIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(JINJA_STMT_START);
			setState(400);
			match(JINJA_IF);
			setState(401);
			jinjaConditions(0);
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
		enterRule(_localctx, 62, RULE_jinjaElseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(JINJA_STMT_START);
			setState(405);
			match(JINJA_ELIF);
			setState(406);
			jinjaConditions(0);
			setState(407);
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
		enterRule(_localctx, 64, RULE_jinjaElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(JINJA_STMT_START);
			setState(410);
			match(JINJA_ELSE);
			setState(411);
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
		enterRule(_localctx, 66, RULE_jinjaEndIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(JINJA_STMT_START);
			setState(414);
			match(JINJA_ENDIF);
			setState(415);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_jinjaConditions, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				_localctx = new JinjaParentecesConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(418);
				match(JINJA_LP);
				setState(419);
				jinjaConditions(0);
				setState(420);
				match(JINJA_RP);
				}
				break;
			case 2:
				{
				_localctx = new JinjaVaraiableConditonContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==JINJA_NOT) {
					{
					setState(422);
					match(JINJA_NOT);
					}
				}

				setState(425);
				jinjaVariable();
				}
				break;
			case 3:
				{
				_localctx = new JinjaConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(426);
				match(JINJA_NOT);
				setState(427);
				jinjaConditions(2);
				}
				break;
			case 4:
				{
				_localctx = new JinjaCompareConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(428);
				jinjaVariable();
				setState(429);
				_la = _input.LA(1);
				if ( !(_la==JINJA_INS || _la==JINJA_COMPARE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(430);
				jinjaVariable();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(439);
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
					setState(434);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(435);
					match(JINJA_LOGIC);
					setState(436);
					jinjaConditions(6);
					}
					} 
				}
				setState(441);
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
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
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
		enterRule(_localctx, 70, RULE_jinjaForLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			jinjaFor();
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(443);
				body();
				}
				break;
			}
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(446);
				jinjaElse();
				setState(448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(447);
					body();
					}
					break;
				}
				}
				break;
			}
			setState(452);
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
		public List<JinjaIdContext> jinjaId() {
			return getRuleContexts(JinjaIdContext.class);
		}
		public JinjaIdContext jinjaId(int i) {
			return getRuleContext(JinjaIdContext.class,i);
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
		enterRule(_localctx, 72, RULE_jinjaFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(JINJA_STMT_START);
			setState(455);
			match(JINJA_FOR);
			setState(456);
			jinjaId();
			setState(457);
			match(JINJA_INS);
			setState(458);
			jinjaId();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_IF) {
				{
				setState(459);
				match(JINJA_IF);
				setState(460);
				jinjaConditions(0);
				}
			}

			setState(463);
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
		enterRule(_localctx, 74, RULE_jinjaEndFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(JINJA_STMT_START);
			setState(466);
			match(JINJA_ENDFOR);
			setState(467);
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
		public JinjaIdContext jinjaId() {
			return getRuleContext(JinjaIdContext.class,0);
		}
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
		enterRule(_localctx, 76, RULE_jinjaVariable);
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				match(JINJA_NUM);
				}
				break;
			case JINJA_ID_EXPR:
			case JINJA_ID_STMT:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				jinjaId();
				}
				break;
			case JINJA_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				match(JINJA_STRING);
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
	public static class JinjaIdContext extends ParserRuleContext {
		public JinjaIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaId; }
	 
		public JinjaIdContext() { }
		public void copyFrom(JinjaIdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExpressionIDContext extends JinjaIdContext {
		public List<TerminalNode> JINJA_ID_EXPR() { return getTokens(JinjaHtmlParser.JINJA_ID_EXPR); }
		public TerminalNode JINJA_ID_EXPR(int i) {
			return getToken(JinjaHtmlParser.JINJA_ID_EXPR, i);
		}
		public TerminalNode JINJA_DOT_EXPR() { return getToken(JinjaHtmlParser.JINJA_DOT_EXPR, 0); }
		public JinjaExpressionIDContext(JinjaIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaExpressionID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaExpressionID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaExpressionID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStatementIDContext extends JinjaIdContext {
		public List<TerminalNode> JINJA_ID_STMT() { return getTokens(JinjaHtmlParser.JINJA_ID_STMT); }
		public TerminalNode JINJA_ID_STMT(int i) {
			return getToken(JinjaHtmlParser.JINJA_ID_STMT, i);
		}
		public TerminalNode JINJA_DOT_STMT() { return getToken(JinjaHtmlParser.JINJA_DOT_STMT, 0); }
		public JinjaStatementIDContext(JinjaIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaStatementID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaStatementID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaStatementID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaIdContext jinjaId() throws RecognitionException {
		JinjaIdContext _localctx = new JinjaIdContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_jinjaId);
		try {
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_ID_EXPR:
				_localctx = new JinjaExpressionIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				match(JINJA_ID_EXPR);
				setState(477);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(475);
					match(JINJA_DOT_EXPR);
					setState(476);
					match(JINJA_ID_EXPR);
					}
					break;
				}
				}
				break;
			case JINJA_ID_STMT:
				_localctx = new JinjaStatementIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				match(JINJA_ID_STMT);
				setState(482);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(480);
					match(JINJA_DOT_STMT);
					setState(481);
					match(JINJA_ID_STMT);
					}
					break;
				}
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
	public static class JinjaExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode JINJA_EXPR_END() { return getToken(JinjaHtmlParser.JINJA_EXPR_END, 0); }
		public TerminalNode JINJA_EXPR_START() { return getToken(JinjaHtmlParser.JINJA_EXPR_START, 0); }
		public TerminalNode JINJA_EXPR_START_TAG() { return getToken(JinjaHtmlParser.JINJA_EXPR_START_TAG, 0); }
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
		enterRule(_localctx, 80, RULE_jinjaExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_la = _input.LA(1);
			if ( !(_la==JINJA_EXPR_START || _la==JINJA_EXPR_START_TAG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(487);
			expr();
			setState(488);
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExpressionTextContext extends ExprContext {
		public TerminalNode JINJA_TEXT() { return getToken(JinjaHtmlParser.JINJA_TEXT, 0); }
		public JinjaExpressionTextContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaExpressionText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaExpressionText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaExpressionText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExpressionFunctionContext extends ExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public JinjaExpressionFunctionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaExpressionFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaExpressionFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaExpressionFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExpressionIDBodyContext extends ExprContext {
		public JinjaIdContext jinjaId() {
			return getRuleContext(JinjaIdContext.class,0);
		}
		public JinjaExpressionIDBodyContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaExpressionIDBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaExpressionIDBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaExpressionIDBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExpressionAssignContext extends ExprContext {
		public JinjaIdContext jinjaId() {
			return getRuleContext(JinjaIdContext.class,0);
		}
		public TerminalNode JINJA_EQUAL() { return getToken(JinjaHtmlParser.JINJA_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public JinjaExpressionAssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaExpressionAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaExpressionAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaExpressionAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExpressionCombineContext extends ExprContext {
		public List<TerminalNode> JINJA_STRING_EXPR() { return getTokens(JinjaHtmlParser.JINJA_STRING_EXPR); }
		public TerminalNode JINJA_STRING_EXPR(int i) {
			return getToken(JinjaHtmlParser.JINJA_STRING_EXPR, i);
		}
		public List<JinjaIdContext> jinjaId() {
			return getRuleContexts(JinjaIdContext.class);
		}
		public JinjaIdContext jinjaId(int i) {
			return getRuleContext(JinjaIdContext.class,i);
		}
		public List<TerminalNode> JINJA_COMBINE() { return getTokens(JinjaHtmlParser.JINJA_COMBINE); }
		public TerminalNode JINJA_COMBINE(int i) {
			return getToken(JinjaHtmlParser.JINJA_COMBINE, i);
		}
		public JinjaExpressionCombineContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterJinjaExpressionCombine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitJinjaExpressionCombine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitJinjaExpressionCombine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expr);
		int _la;
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				_localctx = new JinjaExpressionIDBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				jinjaId();
				}
				break;
			case 2:
				_localctx = new JinjaExpressionFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				functionCall();
				}
				break;
			case 3:
				_localctx = new JinjaExpressionTextContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				match(JINJA_TEXT);
				}
				break;
			case 4:
				_localctx = new JinjaExpressionCombineContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(495);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JINJA_STRING_EXPR:
					{
					setState(493);
					match(JINJA_STRING_EXPR);
					}
					break;
				case JINJA_ID_EXPR:
				case JINJA_ID_STMT:
					{
					setState(494);
					jinjaId();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==JINJA_COMBINE) {
					{
					{
					setState(497);
					match(JINJA_COMBINE);
					setState(500);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case JINJA_STRING_EXPR:
						{
						setState(498);
						match(JINJA_STRING_EXPR);
						}
						break;
					case JINJA_ID_EXPR:
					case JINJA_ID_STMT:
						{
						setState(499);
						jinjaId();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(506);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				_localctx = new JinjaExpressionAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(507);
				jinjaId();
				setState(508);
				match(JINJA_EQUAL);
				setState(509);
				expr();
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
	public static class FunctionCallContext extends ParserRuleContext {
		public JinjaIdContext jinjaId() {
			return getRuleContext(JinjaIdContext.class,0);
		}
		public TerminalNode JINJA_LP_EXPR() { return getToken(JinjaHtmlParser.JINJA_LP_EXPR, 0); }
		public TerminalNode JINJA_RP_EXPR() { return getToken(JinjaHtmlParser.JINJA_RP_EXPR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> JINJA_COMMA() { return getTokens(JinjaHtmlParser.JINJA_COMMA); }
		public TerminalNode JINJA_COMMA(int i) {
			return getToken(JinjaHtmlParser.JINJA_COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			jinjaId();
			setState(514);
			match(JINJA_LP_EXPR);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199024697344L) != 0)) {
				{
				setState(515);
				expr();
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==JINJA_COMMA) {
					{
					{
					setState(516);
					match(JINJA_COMMA);
					setState(517);
					expr();
					}
					}
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(525);
			match(JINJA_RP_EXPR);
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
		public List<TerminalNode> JINJA_TEXT_STMT() { return getTokens(JinjaHtmlParser.JINJA_TEXT_STMT); }
		public TerminalNode JINJA_TEXT_STMT(int i) {
			return getToken(JinjaHtmlParser.JINJA_TEXT_STMT, i);
		}
		public List<JinjaIdContext> jinjaId() {
			return getRuleContexts(JinjaIdContext.class);
		}
		public JinjaIdContext jinjaId(int i) {
			return getRuleContext(JinjaIdContext.class,i);
		}
		public List<TerminalNode> JINJA_STRING() { return getTokens(JinjaHtmlParser.JINJA_STRING); }
		public TerminalNode JINJA_STRING(int i) {
			return getToken(JinjaHtmlParser.JINJA_STRING, i);
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
		enterRule(_localctx, 86, RULE_jinjaStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(JINJA_STMT_START);
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 24189255942144L) != 0)) {
				{
				setState(531);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JINJA_TEXT_STMT:
					{
					setState(528);
					match(JINJA_TEXT_STMT);
					}
					break;
				case JINJA_ID_EXPR:
				case JINJA_ID_STMT:
					{
					setState(529);
					jinjaId();
					}
					break;
				case JINJA_STRING:
					{
					setState(530);
					match(JINJA_STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(536);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
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
		"\u0004\u0001W\u021b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0005\u0000"+
		"Z\b\u0000\n\u0000\f\u0000]\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0003\u0001b\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001f\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0005\u0002j\b\u0002\n\u0002\f\u0002m\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002s\b\u0002\n\u0002"+
		"\f\u0002v\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0083\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u0088\b\u0003\n\u0003\f\u0003\u008b\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u0096\b\u0005\n\u0005\f\u0005\u0099\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a0"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ab\b\u0007\u0001"+
		"\b\u0001\b\u0005\b\u00af\b\b\n\b\f\b\u00b2\t\b\u0001\b\u0004\b\u00b5\b"+
		"\b\u000b\b\f\b\u00b6\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0004\f\u00c5\b"+
		"\f\u000b\f\f\f\u00c6\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00d0\b\u000e\u0001\u000e\u0005\u000e\u00d3\b"+
		"\u000e\n\u000e\f\u000e\u00d6\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00de\b\u000f\u0001\u0010"+
		"\u0005\u0010\u00e1\b\u0010\n\u0010\f\u0010\u00e4\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00ea\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00f1\b\u0013\n"+
		"\u0013\f\u0013\u00f4\t\u0013\u0004\u0013\u00f6\b\u0013\u000b\u0013\f\u0013"+
		"\u00f7\u0001\u0014\u0001\u0014\u0003\u0014\u00fc\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0102\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0108\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u010d\b\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0112\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u011b\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0122"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0127\b\u0015"+
		"\u0001\u0015\u0003\u0015\u012a\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0130\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0137\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u013e\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0143\b\u0016\u0001\u0016\u0003\u0016"+
		"\u0146\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u014c\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u0153\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u015a\b\u0017\u0001\u0017\u0003\u0017\u015d\b"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0003\u0019\u0163"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0167\b\u0019\n\u0019\f\u0019"+
		"\u016a\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u017d\b\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0181\b"+
		"\u001d\u0005\u001d\u0183\b\u001d\n\u001d\f\u001d\u0186\t\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u018a\b\u001d\u0003\u001d\u018c\b\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0003\"\u01a8\b\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0003\"\u01b1\b\"\u0001\"\u0001\"\u0001\"\u0005"+
		"\"\u01b6\b\"\n\"\f\"\u01b9\t\"\u0001#\u0001#\u0003#\u01bd\b#\u0001#\u0001"+
		"#\u0003#\u01c1\b#\u0003#\u01c3\b#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u01ce\b$\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0003&\u01d9\b&\u0001\'\u0001\'\u0001\'"+
		"\u0003\'\u01de\b\'\u0001\'\u0001\'\u0001\'\u0003\'\u01e3\b\'\u0003\'\u01e5"+
		"\b\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0003"+
		")\u01f0\b)\u0001)\u0001)\u0001)\u0003)\u01f5\b)\u0005)\u01f7\b)\n)\f)"+
		"\u01fa\t)\u0001)\u0001)\u0001)\u0001)\u0003)\u0200\b)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0005*\u0207\b*\n*\f*\u020a\t*\u0003*\u020c\b*\u0001*"+
		"\u0001*\u0001+\u0001+\u0001+\u0001+\u0005+\u0214\b+\n+\f+\u0217\t+\u0001"+
		"+\u0001+\u0001+\u0000\u0001D,\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TV\u0000\u0004\u0002\u0000DDQQ\u0002\u0000PPTU\u0001\u0000$%\u0002\u0000"+
		"\u0002\u0002..\u0249\u0000[\u0001\u0000\u0000\u0000\u0002e\u0001\u0000"+
		"\u0000\u0000\u0004\u0082\u0001\u0000\u0000\u0000\u0006\u0084\u0001\u0000"+
		"\u0000\u0000\b\u008e\u0001\u0000\u0000\u0000\n\u0092\u0001\u0000\u0000"+
		"\u0000\f\u009c\u0001\u0000\u0000\u0000\u000e\u00aa\u0001\u0000\u0000\u0000"+
		"\u0010\u00ac\u0001\u0000\u0000\u0000\u0012\u00b8\u0001\u0000\u0000\u0000"+
		"\u0014\u00bd\u0001\u0000\u0000\u0000\u0016\u00c0\u0001\u0000\u0000\u0000"+
		"\u0018\u00c4\u0001\u0000\u0000\u0000\u001a\u00c8\u0001\u0000\u0000\u0000"+
		"\u001c\u00cd\u0001\u0000\u0000\u0000\u001e\u00dd\u0001\u0000\u0000\u0000"+
		" \u00e2\u0001\u0000\u0000\u0000\"\u00e5\u0001\u0000\u0000\u0000$\u00eb"+
		"\u0001\u0000\u0000\u0000&\u00f5\u0001\u0000\u0000\u0000(\u0101\u0001\u0000"+
		"\u0000\u0000*\u0129\u0001\u0000\u0000\u0000,\u0145\u0001\u0000\u0000\u0000"+
		".\u015c\u0001\u0000\u0000\u00000\u015e\u0001\u0000\u0000\u00002\u0162"+
		"\u0001\u0000\u0000\u00004\u016d\u0001\u0000\u0000\u00006\u0172\u0001\u0000"+
		"\u0000\u00008\u0176\u0001\u0000\u0000\u0000:\u017a\u0001\u0000\u0000\u0000"+
		"<\u018f\u0001\u0000\u0000\u0000>\u0194\u0001\u0000\u0000\u0000@\u0199"+
		"\u0001\u0000\u0000\u0000B\u019d\u0001\u0000\u0000\u0000D\u01b0\u0001\u0000"+
		"\u0000\u0000F\u01ba\u0001\u0000\u0000\u0000H\u01c6\u0001\u0000\u0000\u0000"+
		"J\u01d1\u0001\u0000\u0000\u0000L\u01d8\u0001\u0000\u0000\u0000N\u01e4"+
		"\u0001\u0000\u0000\u0000P\u01e6\u0001\u0000\u0000\u0000R\u01ff\u0001\u0000"+
		"\u0000\u0000T\u0201\u0001\u0000\u0000\u0000V\u020f\u0001\u0000\u0000\u0000"+
		"XZ\u0003\u0002\u0001\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0005\u0000\u0000\u0001_\u0001"+
		"\u0001\u0000\u0000\u0000`b\u0005\u0001\u0000\u0000a`\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cf\u0003\u0004"+
		"\u0002\u0000df\u0003\u0010\b\u0000ea\u0001\u0000\u0000\u0000ed\u0001\u0000"+
		"\u0000\u0000f\u0003\u0001\u0000\u0000\u0000gk\u0003\u0006\u0003\u0000"+
		"hj\u0003\u0004\u0002\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0003\b\u0004\u0000o\u0083\u0001"+
		"\u0000\u0000\u0000pt\u0003\u0014\n\u0000qs\u0003\u0018\f\u0000rq\u0001"+
		"\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000wx\u0003\u0016\u000b\u0000x\u0083\u0001\u0000\u0000\u0000y\u0083"+
		"\u0003\n\u0005\u0000z\u0083\u0003P(\u0000{\u0083\u0003:\u001d\u0000|\u0083"+
		"\u00032\u0019\u0000}\u0083\u0003F#\u0000~\u0083\u0003V+\u0000\u007f\u0083"+
		"\u0003\u0010\b\u0000\u0080\u0083\u00058\u0000\u0000\u0081\u0083\u0005"+
		"\t\u0000\u0000\u0082g\u0001\u0000\u0000\u0000\u0082p\u0001\u0000\u0000"+
		"\u0000\u0082y\u0001\u0000\u0000\u0000\u0082z\u0001\u0000\u0000\u0000\u0082"+
		"{\u0001\u0000\u0000\u0000\u0082|\u0001\u0000\u0000\u0000\u0082}\u0001"+
		"\u0000\u0000\u0000\u0082~\u0001\u0000\u0000\u0000\u0082\u007f\u0001\u0000"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0005\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0004"+
		"\u0000\u0000\u0085\u0089\u00055\u0000\u0000\u0086\u0088\u0003\f\u0006"+
		"\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005-\u0000\u0000\u008d\u0007\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0005\u0005\u0000\u0000\u008f\u0090\u00055\u0000\u0000\u0090"+
		"\u0091\u0005-\u0000\u0000\u0091\t\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0005\u0004\u0000\u0000\u0093\u0097\u00056\u0000\u0000\u0094\u0096\u0003"+
		"\f\u0006\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000"+
		"\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000"+
		"\u0000\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005-\u0000\u0000\u009b\u000b\u0001\u0000\u0000"+
		"\u0000\u009c\u009f\u00058\u0000\u0000\u009d\u009e\u00051\u0000\u0000\u009e"+
		"\u00a0\u0003\u000e\u0007\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\r\u0001\u0000\u0000\u0000\u00a1\u00ab"+
		"\u00057\u0000\u0000\u00a2\u00a3\u0005:\u0000\u0000\u00a3\u00a4\u0003P"+
		"(\u0000\u00a4\u00a5\u0005:\u0000\u0000\u00a5\u00ab\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u00059\u0000\u0000\u00a7\u00a8\u0003P(\u0000\u00a8\u00a9"+
		"\u00059\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a1\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a2\u0001\u0000\u0000\u0000\u00aa\u00a6\u0001"+
		"\u0000\u0000\u0000\u00ab\u000f\u0001\u0000\u0000\u0000\u00ac\u00b0\u0003"+
		"\u0012\t\u0000\u00ad\u00af\u0003\u0004\u0002\u0000\u00ae\u00ad\u0001\u0000"+
		"\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b5\u00032\u0019"+
		"\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b7\u0011\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u0003\u0000"+
		"\u0000\u00b9\u00ba\u0005\u001c\u0000\u0000\u00ba\u00bb\u0005*\u0000\u0000"+
		"\u00bb\u00bc\u0005\u0015\u0000\u0000\u00bc\u0013\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0005\u0004\u0000\u0000\u00be\u00bf\u0005/\u0000\u0000\u00bf"+
		"\u0015\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005<\u0000\u0000\u00c1\u00c2"+
		"\u0005-\u0000\u0000\u00c2\u0017\u0001\u0000\u0000\u0000\u00c3\u00c5\u0003"+
		"\u001a\r\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c7\u0019\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003\u001c"+
		"\u000e\u0000\u00c9\u00ca\u0005=\u0000\u0000\u00ca\u00cb\u0003 \u0010\u0000"+
		"\u00cb\u00cc\u0005>\u0000\u0000\u00cc\u001b\u0001\u0000\u0000\u0000\u00cd"+
		"\u00d4\u0003\u001e\u000f\u0000\u00ce\u00d0\u0005A\u0000\u0000\u00cf\u00ce"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d3\u0003\u001e\u000f\u0000\u00d2\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u001d"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00de"+
		"\u0005U\u0000\u0000\u00d8\u00d9\u0005B\u0000\u0000\u00d9\u00de\u0005U"+
		"\u0000\u0000\u00da\u00db\u0005C\u0000\u0000\u00db\u00de\u0005U\u0000\u0000"+
		"\u00dc\u00de\u0005D\u0000\u0000\u00dd\u00d7\u0001\u0000\u0000\u0000\u00dd"+
		"\u00d8\u0001\u0000\u0000\u0000\u00dd\u00da\u0001\u0000\u0000\u0000\u00dd"+
		"\u00dc\u0001\u0000\u0000\u0000\u00de\u001f\u0001\u0000\u0000\u0000\u00df"+
		"\u00e1\u0003\"\u0011\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e3!\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0003$\u0012\u0000\u00e6\u00e7\u0005?\u0000"+
		"\u0000\u00e7\u00e9\u0003&\u0013\u0000\u00e8\u00ea\u0005@\u0000\u0000\u00e9"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea"+
		"#\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005U\u0000\u0000\u00ec%\u0001"+
		"\u0000\u0000\u0000\u00ed\u00f2\u0003(\u0014\u0000\u00ee\u00ef\u0005A\u0000"+
		"\u0000\u00ef\u00f1\u0003(\u0014\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00ed\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\'\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fb\u0005P\u0000\u0000\u00fa\u00fc\u0005R\u0000\u0000\u00fb\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u0102\u0001"+
		"\u0000\u0000\u0000\u00fd\u0102\u0005S\u0000\u0000\u00fe\u0102\u0005U\u0000"+
		"\u0000\u00ff\u0102\u00030\u0018\u0000\u0100\u0102\u0003*\u0015\u0000\u0101"+
		"\u00f9\u0001\u0000\u0000\u0000\u0101\u00fd\u0001\u0000\u0000\u0000\u0101"+
		"\u00fe\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101"+
		"\u0100\u0001\u0000\u0000\u0000\u0102)\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0005G\u0000\u0000\u0104\u0105\u0005E\u0000\u0000\u0105\u0107\u0005P"+
		"\u0000\u0000\u0106\u0108\u0005R\u0000\u0000\u0107\u0106\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0005A\u0000\u0000\u010a\u010c\u0005P\u0000\u0000\u010b"+
		"\u010d\u0005R\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f"+
		"\u0005A\u0000\u0000\u010f\u0111\u0005P\u0000\u0000\u0110\u0112\u0005R"+
		"\u0000\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u012a\u0005F\u0000"+
		"\u0000\u0114\u012a\u0003,\u0016\u0000\u0115\u012a\u0003.\u0017\u0000\u0116"+
		"\u0117\u0005K\u0000\u0000\u0117\u0118\u0005E\u0000\u0000\u0118\u011a\u0005"+
		"P\u0000\u0000\u0119\u011b\u0005R\u0000\u0000\u011a\u0119\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000"+
		"\u0000\u011c\u012a\u0005F\u0000\u0000\u011d\u011e\u0005O\u0000\u0000\u011e"+
		"\u011f\u0005E\u0000\u0000\u011f\u0121\u0005P\u0000\u0000\u0120\u0122\u0005"+
		"R\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0007\u0000"+
		"\u0000\u0000\u0124\u0126\u0005P\u0000\u0000\u0125\u0127\u0005R\u0000\u0000"+
		"\u0126\u0125\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012a\u0005F\u0000\u0000\u0129"+
		"\u0103\u0001\u0000\u0000\u0000\u0129\u0114\u0001\u0000\u0000\u0000\u0129"+
		"\u0115\u0001\u0000\u0000\u0000\u0129\u0116\u0001\u0000\u0000\u0000\u0129"+
		"\u011d\u0001\u0000\u0000\u0000\u012a+\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0005H\u0000\u0000\u012c\u012d\u0005E\u0000\u0000\u012d\u012f\u0005P"+
		"\u0000\u0000\u012e\u0130\u0005R\u0000\u0000\u012f\u012e\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000"+
		"\u0000\u0131\u0146\u0005F\u0000\u0000\u0132\u0133\u0005I\u0000\u0000\u0133"+
		"\u0134\u0005E\u0000\u0000\u0134\u0136\u0005P\u0000\u0000\u0135\u0137\u0005"+
		"R\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0146\u0005F\u0000"+
		"\u0000\u0139\u013a\u0005J\u0000\u0000\u013a\u013b\u0005E\u0000\u0000\u013b"+
		"\u013d\u0005P\u0000\u0000\u013c\u013e\u0005R\u0000\u0000\u013d\u013c\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0005A\u0000\u0000\u0140\u0142\u0005P\u0000"+
		"\u0000\u0141\u0143\u0005R\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000"+
		"\u0144\u0146\u0005F\u0000\u0000\u0145\u012b\u0001\u0000\u0000\u0000\u0145"+
		"\u0132\u0001\u0000\u0000\u0000\u0145\u0139\u0001\u0000\u0000\u0000\u0146"+
		"-\u0001\u0000\u0000\u0000\u0147\u0148\u0005L\u0000\u0000\u0148\u0149\u0005"+
		"E\u0000\u0000\u0149\u014b\u0005P\u0000\u0000\u014a\u014c\u0005R\u0000"+
		"\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000"+
		"\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u015d\u0005F\u0000\u0000"+
		"\u014e\u014f\u0005M\u0000\u0000\u014f\u0150\u0005E\u0000\u0000\u0150\u0152"+
		"\u0005P\u0000\u0000\u0151\u0153\u0005R\u0000\u0000\u0152\u0151\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000"+
		"\u0000\u0000\u0154\u015d\u0005F\u0000\u0000\u0155\u0156\u0005N\u0000\u0000"+
		"\u0156\u0157\u0005E\u0000\u0000\u0157\u0159\u0005P\u0000\u0000\u0158\u015a"+
		"\u0005R\u0000\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u0159\u015a\u0001"+
		"\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015d\u0005"+
		"F\u0000\u0000\u015c\u0147\u0001\u0000\u0000\u0000\u015c\u014e\u0001\u0000"+
		"\u0000\u0000\u015c\u0155\u0001\u0000\u0000\u0000\u015d/\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u0005C\u0000\u0000\u015f\u0160\u0007\u0001\u0000\u0000"+
		"\u01601\u0001\u0000\u0000\u0000\u0161\u0163\u00038\u001c\u0000\u0162\u0161"+
		"\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\u0001\u0000\u0000\u0000\u0164\u0168\u00034\u001a\u0000\u0165\u0167\u0003"+
		"\u0004\u0002\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0167\u016a\u0001"+
		"\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001"+
		"\u0000\u0000\u0000\u0169\u016b\u0001\u0000\u0000\u0000\u016a\u0168\u0001"+
		"\u0000\u0000\u0000\u016b\u016c\u00036\u001b\u0000\u016c3\u0001\u0000\u0000"+
		"\u0000\u016d\u016e\u0005\u0003\u0000\u0000\u016e\u016f\u0005\u0019\u0000"+
		"\u0000\u016f\u0170\u0003N\'\u0000\u0170\u0171\u0005\u0015\u0000\u0000"+
		"\u01715\u0001\u0000\u0000\u0000\u0172\u0173\u0005\u0003\u0000\u0000\u0173"+
		"\u0174\u0005\u001a\u0000\u0000\u0174\u0175\u0005\u0015\u0000\u0000\u0175"+
		"7\u0001\u0000\u0000\u0000\u0176\u0177\u0005\u0002\u0000\u0000\u0177\u0178"+
		"\u0005\u001b\u0000\u0000\u0178\u0179\u0005\n\u0000\u0000\u01799\u0001"+
		"\u0000\u0000\u0000\u017a\u017c\u0003<\u001e\u0000\u017b\u017d\u0003\u0004"+
		"\u0002\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000"+
		"\u0000\u0000\u017d\u0184\u0001\u0000\u0000\u0000\u017e\u0180\u0003>\u001f"+
		"\u0000\u017f\u0181\u0003\u0004\u0002\u0000\u0180\u017f\u0001\u0000\u0000"+
		"\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0183\u0001\u0000\u0000"+
		"\u0000\u0182\u017e\u0001\u0000\u0000\u0000\u0183\u0186\u0001\u0000\u0000"+
		"\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000"+
		"\u0000\u0185\u018b\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000"+
		"\u0000\u0187\u0189\u0003@ \u0000\u0188\u018a\u0003\u0004\u0002\u0000\u0189"+
		"\u0188\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a"+
		"\u018c\u0001\u0000\u0000\u0000\u018b\u0187\u0001\u0000\u0000\u0000\u018b"+
		"\u018c\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d"+
		"\u018e\u0003B!\u0000\u018e;\u0001\u0000\u0000\u0000\u018f\u0190\u0005"+
		"\u0003\u0000\u0000\u0190\u0191\u0005 \u0000\u0000\u0191\u0192\u0003D\""+
		"\u0000\u0192\u0193\u0005\u0015\u0000\u0000\u0193=\u0001\u0000\u0000\u0000"+
		"\u0194\u0195\u0005\u0003\u0000\u0000\u0195\u0196\u0005!\u0000\u0000\u0196"+
		"\u0197\u0003D\"\u0000\u0197\u0198\u0005\u0015\u0000\u0000\u0198?\u0001"+
		"\u0000\u0000\u0000\u0199\u019a\u0005\u0003\u0000\u0000\u019a\u019b\u0005"+
		"\"\u0000\u0000\u019b\u019c\u0005\u0015\u0000\u0000\u019cA\u0001\u0000"+
		"\u0000\u0000\u019d\u019e\u0005\u0003\u0000\u0000\u019e\u019f\u0005#\u0000"+
		"\u0000\u019f\u01a0\u0005\u0015\u0000\u0000\u01a0C\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a2\u0006\"\uffff\uffff\u0000\u01a2\u01a3\u0005\u0016\u0000\u0000"+
		"\u01a3\u01a4\u0003D\"\u0000\u01a4\u01a5\u0005\u0017\u0000\u0000\u01a5"+
		"\u01b1\u0001\u0000\u0000\u0000\u01a6\u01a8\u0005\'\u0000\u0000\u01a7\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0001\u0000\u0000\u0000\u01a9\u01b1\u0003L&\u0000\u01aa\u01ab\u0005\'"+
		"\u0000\u0000\u01ab\u01b1\u0003D\"\u0002\u01ac\u01ad\u0003L&\u0000\u01ad"+
		"\u01ae\u0007\u0002\u0000\u0000\u01ae\u01af\u0003L&\u0000\u01af\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b0\u01a1\u0001\u0000\u0000\u0000\u01b0\u01a7\u0001"+
		"\u0000\u0000\u0000\u01b0\u01aa\u0001\u0000\u0000\u0000\u01b0\u01ac\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b7\u0001\u0000\u0000\u0000\u01b2\u01b3\n\u0005"+
		"\u0000\u0000\u01b3\u01b4\u0005&\u0000\u0000\u01b4\u01b6\u0003D\"\u0006"+
		"\u01b5\u01b2\u0001\u0000\u0000\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000"+
		"\u01b8E\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bc\u0003H$\u0000\u01bb\u01bd\u0003\u0004\u0002\u0000\u01bc\u01bb\u0001"+
		"\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01c2\u0001"+
		"\u0000\u0000\u0000\u01be\u01c0\u0003@ \u0000\u01bf\u01c1\u0003\u0004\u0002"+
		"\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c3\u0001\u0000\u0000\u0000\u01c2\u01be\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c5\u0003J%\u0000\u01c5G\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c7\u0005\u0003\u0000\u0000\u01c7\u01c8\u0005\u001e\u0000\u0000\u01c8"+
		"\u01c9\u0003N\'\u0000\u01c9\u01ca\u0005$\u0000\u0000\u01ca\u01cd\u0003"+
		"N\'\u0000\u01cb\u01cc\u0005 \u0000\u0000\u01cc\u01ce\u0003D\"\u0000\u01cd"+
		"\u01cb\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005\u0015\u0000\u0000\u01d0"+
		"I\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005\u0003\u0000\u0000\u01d2\u01d3"+
		"\u0005\u001f\u0000\u0000\u01d3\u01d4\u0005\u0015\u0000\u0000\u01d4K\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d9\u0005(\u0000\u0000\u01d6\u01d9\u0003N\'"+
		"\u0000\u01d7\u01d9\u0005*\u0000\u0000\u01d8\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000"+
		"\u01d9M\u0001\u0000\u0000\u0000\u01da\u01dd\u0005\u0011\u0000\u0000\u01db"+
		"\u01dc\u0005\u000e\u0000\u0000\u01dc\u01de\u0005\u0011\u0000\u0000\u01dd"+
		"\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de"+
		"\u01e5\u0001\u0000\u0000\u0000\u01df\u01e2\u0005)\u0000\u0000\u01e0\u01e1"+
		"\u0005\u0018\u0000\u0000\u01e1\u01e3\u0005)\u0000\u0000\u01e2\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e4\u01da\u0001\u0000\u0000\u0000\u01e4\u01df\u0001"+
		"\u0000\u0000\u0000\u01e5O\u0001\u0000\u0000\u0000\u01e6\u01e7\u0007\u0003"+
		"\u0000\u0000\u01e7\u01e8\u0003R)\u0000\u01e8\u01e9\u0005\n\u0000\u0000"+
		"\u01e9Q\u0001\u0000\u0000\u0000\u01ea\u0200\u0003N\'\u0000\u01eb\u0200"+
		"\u0003T*\u0000\u01ec\u0200\u0005\u0014\u0000\u0000\u01ed\u01f0\u0005\u0012"+
		"\u0000\u0000\u01ee\u01f0\u0003N\'\u0000\u01ef\u01ed\u0001\u0000\u0000"+
		"\u0000\u01ef\u01ee\u0001\u0000\u0000\u0000\u01f0\u01f8\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f4\u0005\u0010\u0000\u0000\u01f2\u01f5\u0005\u0012\u0000"+
		"\u0000\u01f3\u01f5\u0003N\'\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f7\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f1\u0001\u0000\u0000\u0000\u01f7\u01fa\u0001\u0000\u0000\u0000"+
		"\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000"+
		"\u01f9\u0200\u0001\u0000\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000"+
		"\u01fb\u01fc\u0003N\'\u0000\u01fc\u01fd\u0005\u000f\u0000\u0000\u01fd"+
		"\u01fe\u0003R)\u0000\u01fe\u0200\u0001\u0000\u0000\u0000\u01ff\u01ea\u0001"+
		"\u0000\u0000\u0000\u01ff\u01eb\u0001\u0000\u0000\u0000\u01ff\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ff\u01ef\u0001\u0000\u0000\u0000\u01ff\u01fb\u0001"+
		"\u0000\u0000\u0000\u0200S\u0001\u0000\u0000\u0000\u0201\u0202\u0003N\'"+
		"\u0000\u0202\u020b\u0005\u000b\u0000\u0000\u0203\u0208\u0003R)\u0000\u0204"+
		"\u0205\u0005\r\u0000\u0000\u0205\u0207\u0003R)\u0000\u0206\u0204\u0001"+
		"\u0000\u0000\u0000\u0207\u020a\u0001\u0000\u0000\u0000\u0208\u0206\u0001"+
		"\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020c\u0001"+
		"\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020b\u0203\u0001"+
		"\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u020d\u0001"+
		"\u0000\u0000\u0000\u020d\u020e\u0005\f\u0000\u0000\u020eU\u0001\u0000"+
		"\u0000\u0000\u020f\u0215\u0005\u0003\u0000\u0000\u0210\u0214\u0005,\u0000"+
		"\u0000\u0211\u0214\u0003N\'\u0000\u0212\u0214\u0005*\u0000\u0000\u0213"+
		"\u0210\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0213"+
		"\u0212\u0001\u0000\u0000\u0000\u0214\u0217\u0001\u0000\u0000\u0000\u0215"+
		"\u0213\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216"+
		"\u0218\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0218"+
		"\u0219\u0005\u0015\u0000\u0000\u0219W\u0001\u0000\u0000\u0000@[aekt\u0082"+
		"\u0089\u0097\u009f\u00aa\u00b0\u00b6\u00c6\u00cf\u00d4\u00dd\u00e2\u00e9"+
		"\u00f2\u00f7\u00fb\u0101\u0107\u010c\u0111\u011a\u0121\u0126\u0129\u012f"+
		"\u0136\u013d\u0142\u0145\u014b\u0152\u0159\u015c\u0162\u0168\u017c\u0180"+
		"\u0184\u0189\u018b\u01a7\u01b0\u01b7\u01bc\u01c0\u01c2\u01cd\u01d8\u01dd"+
		"\u01e2\u01e4\u01ef\u01f4\u01f8\u01ff\u0208\u020b\u0213\u0215";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}