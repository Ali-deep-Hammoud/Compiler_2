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
		DOCTYPE=1, OST=2, CT=3, OET=4, EM=5, EQUALS=6, COLON=7, HTML=8, BODY=9, 
		HEAD=10, H1=11, H2=12, H3=13, H4=14, H5=15, NAV=16, DIV=17, SPAN=18, A=19, 
		TITLE=20, LINK=21, P=22, IMG=23, FORM=24, LABEL=25, INPUT=26, STRING=27, 
		ID=28, WS=29;
	public static final int
		RULE_prog = 0, RULE_document = 1, RULE_html = 2, RULE_startElement = 3, 
		RULE_endElement = 4, RULE_element = 5, RULE_attripute = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "document", "html", "startElement", "endElement", "element", 
			"attripute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'<'", "'>'", "'</'", "'!'", "'='", "':'", "'html'", "'body'", 
			"'head'", "'h1'", "'h2'", "'h3'", "'h4'", "'h5'", "'nav'", "'div'", "'span'", 
			"'a'", "'title'", "'link'", "'p'", "'img'", "'form'", "'label'", "'input'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOCTYPE", "OST", "CT", "OET", "EM", "EQUALS", "COLON", "HTML", 
			"BODY", "HEAD", "H1", "H2", "H3", "H4", "H5", "NAV", "DIV", "SPAN", "A", 
			"TITLE", "LINK", "P", "IMG", "FORM", "LABEL", "INPUT", "STRING", "ID", 
			"WS"
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
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOCTYPE) {
				{
				{
				setState(14);
				document();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
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
		public TerminalNode DOCTYPE() { return getToken(JinjaHtmlParser.DOCTYPE, 0); }
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(DOCTYPE);
			setState(23);
			html();
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
	public static class HtmlContext extends ParserRuleContext {
		public StartElementContext startElement() {
			return getRuleContext(StartElementContext.class,0);
		}
		public EndElementContext endElement() {
			return getRuleContext(EndElementContext.class,0);
		}
		public List<HtmlContext> html() {
			return getRuleContexts(HtmlContext.class);
		}
		public HtmlContext html(int i) {
			return getRuleContext(HtmlContext.class,i);
		}
		public TerminalNode ID() { return getToken(JinjaHtmlParser.ID, 0); }
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
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

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_html);
		int _la;
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OST:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				startElement();
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OST || _la==ID) {
					{
					{
					setState(26);
					html();
					}
					}
					setState(31);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(32);
				endElement();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(ID);
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
	public static class StartElementContext extends ParserRuleContext {
		public TerminalNode OST() { return getToken(JinjaHtmlParser.OST, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode CT() { return getToken(JinjaHtmlParser.CT, 0); }
		public List<AttriputeContext> attripute() {
			return getRuleContexts(AttriputeContext.class);
		}
		public AttriputeContext attripute(int i) {
			return getRuleContext(AttriputeContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(OST);
			setState(38);
			element();
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(39);
					attripute();
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(45);
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
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
			setState(47);
			match(OET);
			setState(48);
			element();
			setState(49);
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
	public static class ElementContext extends ParserRuleContext {
		public TerminalNode HTML() { return getToken(JinjaHtmlParser.HTML, 0); }
		public TerminalNode BODY() { return getToken(JinjaHtmlParser.BODY, 0); }
		public TerminalNode HEAD() { return getToken(JinjaHtmlParser.HEAD, 0); }
		public TerminalNode H1() { return getToken(JinjaHtmlParser.H1, 0); }
		public TerminalNode H2() { return getToken(JinjaHtmlParser.H2, 0); }
		public TerminalNode H3() { return getToken(JinjaHtmlParser.H3, 0); }
		public TerminalNode H4() { return getToken(JinjaHtmlParser.H4, 0); }
		public TerminalNode H5() { return getToken(JinjaHtmlParser.H5, 0); }
		public TerminalNode NAV() { return getToken(JinjaHtmlParser.NAV, 0); }
		public TerminalNode DIV() { return getToken(JinjaHtmlParser.DIV, 0); }
		public TerminalNode SPAN() { return getToken(JinjaHtmlParser.SPAN, 0); }
		public TerminalNode A() { return getToken(JinjaHtmlParser.A, 0); }
		public TerminalNode TITLE() { return getToken(JinjaHtmlParser.TITLE, 0); }
		public TerminalNode LINK() { return getToken(JinjaHtmlParser.LINK, 0); }
		public TerminalNode P() { return getToken(JinjaHtmlParser.P, 0); }
		public TerminalNode IMG() { return getToken(JinjaHtmlParser.IMG, 0); }
		public TerminalNode FORM() { return getToken(JinjaHtmlParser.FORM, 0); }
		public TerminalNode LABEL() { return getToken(JinjaHtmlParser.LABEL, 0); }
		public TerminalNode INPUT() { return getToken(JinjaHtmlParser.INPUT, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 134217472L) != 0)) ) {
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
	public static class AttriputeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JinjaHtmlParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(JinjaHtmlParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(JinjaHtmlParser.STRING, 0); }
		public AttriputeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attripute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).enterAttripute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaHtmlParserListener ) ((JinjaHtmlParserListener)listener).exitAttripute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaHtmlParserVisitor ) return ((JinjaHtmlParserVisitor<? extends T>)visitor).visitAttripute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttriputeContext attripute() throws RecognitionException {
		AttriputeContext _localctx = new AttriputeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attripute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(ID);
			setState(54);
			match(EQUALS);
			setState(55);
			match(STRING);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001d:\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0005\u0000\u0010"+
		"\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002\u001c\b\u0002"+
		"\n\u0002\f\u0002\u001f\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002$\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003)\b\u0003"+
		"\n\u0003\f\u0003,\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001*\u0000\u0007\u0000\u0002\u0004"+
		"\u0006\b\n\f\u0000\u0001\u0001\u0000\b\u001a6\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0002\u0016\u0001\u0000\u0000\u0000\u0004#\u0001\u0000\u0000"+
		"\u0000\u0006%\u0001\u0000\u0000\u0000\b/\u0001\u0000\u0000\u0000\n3\u0001"+
		"\u0000\u0000\u0000\f5\u0001\u0000\u0000\u0000\u000e\u0010\u0003\u0002"+
		"\u0001\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u0010\u0013\u0001\u0000"+
		"\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000"+
		"\u0000\u0000\u0012\u0014\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000"+
		"\u0000\u0000\u0014\u0015\u0005\u0000\u0000\u0001\u0015\u0001\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017\u0018\u0003\u0004"+
		"\u0002\u0000\u0018\u0003\u0001\u0000\u0000\u0000\u0019\u001d\u0003\u0006"+
		"\u0003\u0000\u001a\u001c\u0003\u0004\u0002\u0000\u001b\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000 !\u0003\b\u0004\u0000!$\u0001"+
		"\u0000\u0000\u0000\"$\u0005\u001c\u0000\u0000#\u0019\u0001\u0000\u0000"+
		"\u0000#\"\u0001\u0000\u0000\u0000$\u0005\u0001\u0000\u0000\u0000%&\u0005"+
		"\u0002\u0000\u0000&*\u0003\n\u0005\u0000\')\u0003\f\u0006\u0000(\'\u0001"+
		"\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000"+
		"*(\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000"+
		"\u0000-.\u0005\u0003\u0000\u0000.\u0007\u0001\u0000\u0000\u0000/0\u0005"+
		"\u0004\u0000\u000001\u0003\n\u0005\u000012\u0005\u0003\u0000\u00002\t"+
		"\u0001\u0000\u0000\u000034\u0007\u0000\u0000\u00004\u000b\u0001\u0000"+
		"\u0000\u000056\u0005\u001c\u0000\u000067\u0005\u0006\u0000\u000078\u0005"+
		"\u001b\u0000\u00008\r\u0001\u0000\u0000\u0000\u0004\u0011\u001d#*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}