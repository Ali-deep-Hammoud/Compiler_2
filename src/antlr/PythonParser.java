// Generated from C:/Users/HP/Desktop/UniProjects/Compiler Project/Grammars/PythonParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, CLASS=2, IF=3, ELIF=4, ELSE=5, FOR=6, WHILE=7, RETURN=8, IMPORT=9, 
		FROM=10, AS=11, IN=12, IS=13, AND=14, OR=15, NOT=16, PASS=17, BREAK=18, 
		CONTINUE=19, WITH=20, TRY=21, EXCEPT=22, FINALLY=23, RAISE=24, LAMBDA=25, 
		TRUE=26, FALSE=27, NONE=28, YIELD=29, ASSERT=30, DEL=31, GLOBAL=32, NONLOCAL=33, 
		DOUBLESTAR_EQUAL=34, DOUBLESLASH=35, DOUBLESTAR=36, LEFTSHIFT=37, RIGHTSHIFT=38, 
		PLUSEQUAL=39, MINUSEQUAL=40, STAREQUAL=41, SLASHEQUAL=42, PERCENTEQUAL=43, 
		ATEQUAL=44, EQEQUAL=45, NOTEQUAL=46, LESSEQUAL=47, GREATEREQUAL=48, ARROW=49, 
		PLUS=50, MINUS=51, STAR=52, SLASH=53, PERCENT=54, AT=55, EQUAL=56, AMPER=57, 
		VBAR=58, CIRCUMFLEX=59, TILDE=60, LESS=61, GREATER=62, LPAREN=63, RPAREN=64, 
		LSQB=65, RSQB=66, LBRACE=67, RBRACE=68, COMMA=69, COLON=70, DOT=71, SEMI=72, 
		ELLIPSIS=73, STRING=74, NUMBER=75, NAME=76, NEWLINE=77, SKIP_=78, COMMENT=79, 
		LINE_CONTINUATION=80;
	public static final int
		RULE_file_input = 0, RULE_stmt = 1, RULE_simple_stmt = 2, RULE_small_stmt = 3, 
		RULE_expr_stmt = 4, RULE_augassign = 5, RULE_del_stmt = 6, RULE_pass_stmt = 7, 
		RULE_flow_stmt = 8, RULE_break_stmt = 9, RULE_continue_stmt = 10, RULE_return_stmt = 11, 
		RULE_yield_stmt = 12, RULE_raise_stmt = 13, RULE_import_stmt = 14, RULE_import_name = 15, 
		RULE_import_from = 16, RULE_import_as_name = 17, RULE_dotted_as_name = 18, 
		RULE_import_as_names = 19, RULE_dotted_as_names = 20, RULE_dotted_name = 21, 
		RULE_global_stmt = 22, RULE_nonlocal_stmt = 23, RULE_assert_stmt = 24, 
		RULE_compound_stmt = 25, RULE_if_stmt = 26, RULE_while_stmt = 27, RULE_for_stmt = 28, 
		RULE_try_stmt = 29, RULE_with_stmt = 30, RULE_with_item = 31, RULE_except_clause = 32, 
		RULE_suite = 33, RULE_funcdef = 34, RULE_parameters = 35, RULE_typedargslist = 36, 
		RULE_normalPar = 37, RULE_doubleStarPar = 38, RULE_tfpdef = 39, RULE_classdef = 40, 
		RULE_decorated = 41, RULE_decorator = 42, RULE_test = 43, RULE_test_nocond = 44, 
		RULE_lambdef = 45, RULE_lambdef_nocond = 46, RULE_or_test = 47, RULE_and_test = 48, 
		RULE_not_test = 49, RULE_comparison = 50, RULE_comp_op = 51, RULE_star_expr = 52, 
		RULE_expr = 53, RULE_xor_expr = 54, RULE_and_expr = 55, RULE_shift_expr = 56, 
		RULE_shift = 57, RULE_arith_expr = 58, RULE_math = 59, RULE_term = 60, 
		RULE_terms = 61, RULE_factor = 62, RULE_power = 63, RULE_atom_expr = 64, 
		RULE_atom = 65, RULE_testlist_comp = 66, RULE_testlistElement = 67, RULE_trailer = 68, 
		RULE_subscriptlist = 69, RULE_subscript = 70, RULE_sliceop = 71, RULE_exprlist = 72, 
		RULE_testlist = 73, RULE_dictorsetmaker = 74, RULE_classdef_or_funcdef = 75, 
		RULE_arglist = 76, RULE_argument = 77, RULE_comp_iter = 78, RULE_comp_for = 79, 
		RULE_comp_if = 80, RULE_yield_expr = 81, RULE_yield_arg = 82, RULE_testlist_star_expr = 83, 
		RULE_varargslist = 84, RULE_normalVar = 85, RULE_doubleStarVar = 86, RULE_vfpdef = 87;
	private static String[] makeRuleNames() {
		return new String[] {
			"file_input", "stmt", "simple_stmt", "small_stmt", "expr_stmt", "augassign", 
			"del_stmt", "pass_stmt", "flow_stmt", "break_stmt", "continue_stmt", 
			"return_stmt", "yield_stmt", "raise_stmt", "import_stmt", "import_name", 
			"import_from", "import_as_name", "dotted_as_name", "import_as_names", 
			"dotted_as_names", "dotted_name", "global_stmt", "nonlocal_stmt", "assert_stmt", 
			"compound_stmt", "if_stmt", "while_stmt", "for_stmt", "try_stmt", "with_stmt", 
			"with_item", "except_clause", "suite", "funcdef", "parameters", "typedargslist", 
			"normalPar", "doubleStarPar", "tfpdef", "classdef", "decorated", "decorator", 
			"test", "test_nocond", "lambdef", "lambdef_nocond", "or_test", "and_test", 
			"not_test", "comparison", "comp_op", "star_expr", "expr", "xor_expr", 
			"and_expr", "shift_expr", "shift", "arith_expr", "math", "term", "terms", 
			"factor", "power", "atom_expr", "atom", "testlist_comp", "testlistElement", 
			"trailer", "subscriptlist", "subscript", "sliceop", "exprlist", "testlist", 
			"dictorsetmaker", "classdef_or_funcdef", "arglist", "argument", "comp_iter", 
			"comp_for", "comp_if", "yield_expr", "yield_arg", "testlist_star_expr", 
			"varargslist", "normalVar", "doubleStarVar", "vfpdef"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'class'", "'if'", "'elif'", "'else'", "'for'", "'while'", 
			"'return'", "'import'", "'from'", "'as'", "'in'", "'is'", "'and'", "'or'", 
			"'not'", "'pass'", "'break'", "'continue'", "'with'", "'try'", "'except'", 
			"'finally'", "'raise'", "'lambda'", "'True'", "'False'", "'None'", "'yield'", 
			"'assert'", "'del'", "'global'", "'nonlocal'", "'**='", "'//'", "'**'", 
			"'<<'", "'>>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'@='", "'=='", 
			"'!='", "'<='", "'>='", "'->'", "'+'", "'-'", "'*'", "'/'", "'%'", "'@'", 
			"'='", "'&'", "'|'", "'^'", "'~'", "'<'", "'>'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "','", "':'", "'.'", "';'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "CLASS", "IF", "ELIF", "ELSE", "FOR", "WHILE", "RETURN", 
			"IMPORT", "FROM", "AS", "IN", "IS", "AND", "OR", "NOT", "PASS", "BREAK", 
			"CONTINUE", "WITH", "TRY", "EXCEPT", "FINALLY", "RAISE", "LAMBDA", "TRUE", 
			"FALSE", "NONE", "YIELD", "ASSERT", "DEL", "GLOBAL", "NONLOCAL", "DOUBLESTAR_EQUAL", 
			"DOUBLESLASH", "DOUBLESTAR", "LEFTSHIFT", "RIGHTSHIFT", "PLUSEQUAL", 
			"MINUSEQUAL", "STAREQUAL", "SLASHEQUAL", "PERCENTEQUAL", "ATEQUAL", "EQEQUAL", 
			"NOTEQUAL", "LESSEQUAL", "GREATEREQUAL", "ARROW", "PLUS", "MINUS", "STAR", 
			"SLASH", "PERCENT", "AT", "EQUAL", "AMPER", "VBAR", "CIRCUMFLEX", "TILDE", 
			"LESS", "GREATER", "LPAREN", "RPAREN", "LSQB", "RSQB", "LBRACE", "RBRACE", 
			"COMMA", "COLON", "DOT", "SEMI", "ELLIPSIS", "STRING", "NUMBER", "NAME", 
			"NEWLINE", "SKIP_", "COMMENT", "LINE_CONTINUATION"
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
	public String getGrammarFileName() { return "PythonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_inputContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public File_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFile_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFile_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFile_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_inputContext file_input() throws RecognitionException {
		File_inputContext _localctx = new File_inputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -8026540418713843762L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 7941L) != 0)) {
				{
				setState(178);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(176);
					match(NEWLINE);
					}
					break;
				case DEF:
				case CLASS:
				case IF:
				case FOR:
				case WHILE:
				case RETURN:
				case IMPORT:
				case FROM:
				case NOT:
				case PASS:
				case BREAK:
				case CONTINUE:
				case WITH:
				case TRY:
				case RAISE:
				case LAMBDA:
				case TRUE:
				case FALSE:
				case NONE:
				case YIELD:
				case ASSERT:
				case DEL:
				case GLOBAL:
				case NONLOCAL:
				case PLUS:
				case MINUS:
				case STAR:
				case AT:
				case TILDE:
				case LPAREN:
				case LSQB:
				case LBRACE:
				case ELLIPSIS:
				case STRING:
				case NUMBER:
				case NAME:
					{
					setState(177);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
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
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtCompoundContext extends StmtContext {
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public StmtCompoundContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStmtCompound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStmtCompound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStmtCompound(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtSimpleContext extends StmtContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public StmtSimpleContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStmtSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStmtSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStmtSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case IMPORT:
			case FROM:
			case NOT:
			case PASS:
			case BREAK:
			case CONTINUE:
			case RAISE:
			case LAMBDA:
			case TRUE:
			case FALSE:
			case NONE:
			case YIELD:
			case ASSERT:
			case DEL:
			case GLOBAL:
			case NONLOCAL:
			case PLUS:
			case MINUS:
			case STAR:
			case TILDE:
			case LPAREN:
			case LSQB:
			case LBRACE:
			case ELLIPSIS:
			case STRING:
			case NUMBER:
			case NAME:
				_localctx = new StmtSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				simple_stmt();
				}
				break;
			case DEF:
			case CLASS:
			case IF:
			case FOR:
			case WHILE:
			case WITH:
			case TRY:
			case AT:
				_localctx = new StmtCompoundContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				compound_stmt();
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
	public static class Simple_stmtContext extends ParserRuleContext {
		public List<Small_stmtContext> small_stmt() {
			return getRuleContexts(Small_stmtContext.class);
		}
		public Small_stmtContext small_stmt(int i) {
			return getRuleContext(Small_stmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PythonParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PythonParser.SEMI, i);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSimple_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			small_stmt();
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190);
					match(SEMI);
					setState(191);
					small_stmt();
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(197);
				match(SEMI);
				}
			}

			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(200);
				match(NEWLINE);
				}
				break;
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
	public static class Small_stmtContext extends ParserRuleContext {
		public Small_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_small_stmt; }
	 
		public Small_stmtContext() { }
		public void copyFrom(Small_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SmallStmtFlowContext extends Small_stmtContext {
		public Flow_stmtContext flow_stmt() {
			return getRuleContext(Flow_stmtContext.class,0);
		}
		public SmallStmtFlowContext(Small_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSmallStmtFlow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSmallStmtFlow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSmallStmtFlow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SmallStmtImportContext extends Small_stmtContext {
		public Import_stmtContext import_stmt() {
			return getRuleContext(Import_stmtContext.class,0);
		}
		public SmallStmtImportContext(Small_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSmallStmtImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSmallStmtImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSmallStmtImport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SmallStmtGlobalContext extends Small_stmtContext {
		public Global_stmtContext global_stmt() {
			return getRuleContext(Global_stmtContext.class,0);
		}
		public SmallStmtGlobalContext(Small_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSmallStmtGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSmallStmtGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSmallStmtGlobal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SmallStmtNonlocalContext extends Small_stmtContext {
		public Nonlocal_stmtContext nonlocal_stmt() {
			return getRuleContext(Nonlocal_stmtContext.class,0);
		}
		public SmallStmtNonlocalContext(Small_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSmallStmtNonlocal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSmallStmtNonlocal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSmallStmtNonlocal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SmallStmtAssertContext extends Small_stmtContext {
		public Assert_stmtContext assert_stmt() {
			return getRuleContext(Assert_stmtContext.class,0);
		}
		public SmallStmtAssertContext(Small_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSmallStmtAssert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSmallStmtAssert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSmallStmtAssert(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SmallStmtDelContext extends Small_stmtContext {
		public Del_stmtContext del_stmt() {
			return getRuleContext(Del_stmtContext.class,0);
		}
		public SmallStmtDelContext(Small_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSmallStmtDel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSmallStmtDel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSmallStmtDel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SmallStmtExprContext extends Small_stmtContext {
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public SmallStmtExprContext(Small_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSmallStmtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSmallStmtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSmallStmtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SmallStmtPassContext extends Small_stmtContext {
		public Pass_stmtContext pass_stmt() {
			return getRuleContext(Pass_stmtContext.class,0);
		}
		public SmallStmtPassContext(Small_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSmallStmtPass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSmallStmtPass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSmallStmtPass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Small_stmtContext small_stmt() throws RecognitionException {
		Small_stmtContext _localctx = new Small_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_small_stmt);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case LAMBDA:
			case TRUE:
			case FALSE:
			case NONE:
			case PLUS:
			case MINUS:
			case STAR:
			case TILDE:
			case LPAREN:
			case LSQB:
			case LBRACE:
			case ELLIPSIS:
			case STRING:
			case NUMBER:
			case NAME:
				_localctx = new SmallStmtExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				expr_stmt();
				}
				break;
			case DEL:
				_localctx = new SmallStmtDelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				del_stmt();
				}
				break;
			case PASS:
				_localctx = new SmallStmtPassContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				pass_stmt();
				}
				break;
			case RETURN:
			case BREAK:
			case CONTINUE:
			case RAISE:
			case YIELD:
				_localctx = new SmallStmtFlowContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				flow_stmt();
				}
				break;
			case IMPORT:
			case FROM:
				_localctx = new SmallStmtImportContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(207);
				import_stmt();
				}
				break;
			case GLOBAL:
				_localctx = new SmallStmtGlobalContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(208);
				global_stmt();
				}
				break;
			case NONLOCAL:
				_localctx = new SmallStmtNonlocalContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(209);
				nonlocal_stmt();
				}
				break;
			case ASSERT:
				_localctx = new SmallStmtAssertContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(210);
				assert_stmt();
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
	public static class Expr_stmtContext extends ParserRuleContext {
		public List<Testlist_star_exprContext> testlist_star_expr() {
			return getRuleContexts(Testlist_star_exprContext.class);
		}
		public Testlist_star_exprContext testlist_star_expr(int i) {
			return getRuleContext(Testlist_star_exprContext.class,i);
		}
		public AugassignContext augassign() {
			return getRuleContext(AugassignContext.class,0);
		}
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public List<TerminalNode> EQUAL() { return getTokens(PythonParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(PythonParser.EQUAL, i);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitExpr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			testlist_star_expr();
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(214);
				augassign();
				setState(215);
				testlist();
				}
				break;
			case 2:
				{
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EQUAL) {
					{
					{
					setState(217);
					match(EQUAL);
					setState(218);
					testlist_star_expr();
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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
	public static class AugassignContext extends ParserRuleContext {
		public AugassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_augassign; }
	 
		public AugassignContext() { }
		public void copyFrom(AugassignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugAssignSlashContext extends AugassignContext {
		public TerminalNode SLASHEQUAL() { return getToken(PythonParser.SLASHEQUAL, 0); }
		public AugAssignSlashContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugAssignSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugAssignSlash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugAssignSlash(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugAssignPlusContext extends AugassignContext {
		public TerminalNode PLUSEQUAL() { return getToken(PythonParser.PLUSEQUAL, 0); }
		public AugAssignPlusContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugAssignPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugAssignPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugAssignPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugAssignPercentContext extends AugassignContext {
		public TerminalNode PERCENTEQUAL() { return getToken(PythonParser.PERCENTEQUAL, 0); }
		public AugAssignPercentContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugAssignPercent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugAssignPercent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugAssignPercent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugAssignMinusContext extends AugassignContext {
		public TerminalNode MINUSEQUAL() { return getToken(PythonParser.MINUSEQUAL, 0); }
		public AugAssignMinusContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugAssignMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugAssignMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugAssignMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugAssignAtContext extends AugassignContext {
		public TerminalNode ATEQUAL() { return getToken(PythonParser.ATEQUAL, 0); }
		public AugAssignAtContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugAssignAt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugAssignAt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugAssignAt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugAssignStarContext extends AugassignContext {
		public TerminalNode STAREQUAL() { return getToken(PythonParser.STAREQUAL, 0); }
		public AugAssignStarContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugAssignStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugAssignStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugAssignStar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugAssignDoubleStarContext extends AugassignContext {
		public TerminalNode DOUBLESTAR_EQUAL() { return getToken(PythonParser.DOUBLESTAR_EQUAL, 0); }
		public AugAssignDoubleStarContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugAssignDoubleStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugAssignDoubleStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugAssignDoubleStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AugassignContext augassign() throws RecognitionException {
		AugassignContext _localctx = new AugassignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_augassign);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUSEQUAL:
				_localctx = new AugAssignPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(PLUSEQUAL);
				}
				break;
			case MINUSEQUAL:
				_localctx = new AugAssignMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(MINUSEQUAL);
				}
				break;
			case STAREQUAL:
				_localctx = new AugAssignStarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(STAREQUAL);
				}
				break;
			case SLASHEQUAL:
				_localctx = new AugAssignSlashContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(SLASHEQUAL);
				}
				break;
			case PERCENTEQUAL:
				_localctx = new AugAssignPercentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				match(PERCENTEQUAL);
				}
				break;
			case ATEQUAL:
				_localctx = new AugAssignAtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(231);
				match(ATEQUAL);
				}
				break;
			case DOUBLESTAR_EQUAL:
				_localctx = new AugAssignDoubleStarContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(232);
				match(DOUBLESTAR_EQUAL);
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
	public static class Del_stmtContext extends ParserRuleContext {
		public TerminalNode DEL() { return getToken(PythonParser.DEL, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public Del_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_del_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDel_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDel_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDel_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Del_stmtContext del_stmt() throws RecognitionException {
		Del_stmtContext _localctx = new Del_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_del_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(DEL);
			setState(236);
			exprlist();
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
	public static class Pass_stmtContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(PythonParser.PASS, 0); }
		public Pass_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pass_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPass_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPass_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPass_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pass_stmtContext pass_stmt() throws RecognitionException {
		Pass_stmtContext _localctx = new Pass_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pass_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(PASS);
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
	public static class Flow_stmtContext extends ParserRuleContext {
		public Flow_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_stmt; }
	 
		public Flow_stmtContext() { }
		public void copyFrom(Flow_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlowStmtBreakContext extends Flow_stmtContext {
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public FlowStmtBreakContext(Flow_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFlowStmtBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFlowStmtBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFlowStmtBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlowStmtRaiseContext extends Flow_stmtContext {
		public Raise_stmtContext raise_stmt() {
			return getRuleContext(Raise_stmtContext.class,0);
		}
		public FlowStmtRaiseContext(Flow_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFlowStmtRaise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFlowStmtRaise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFlowStmtRaise(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlowStmtYieldContext extends Flow_stmtContext {
		public Yield_stmtContext yield_stmt() {
			return getRuleContext(Yield_stmtContext.class,0);
		}
		public FlowStmtYieldContext(Flow_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFlowStmtYield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFlowStmtYield(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFlowStmtYield(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlowStmtContinueContext extends Flow_stmtContext {
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public FlowStmtContinueContext(Flow_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFlowStmtContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFlowStmtContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFlowStmtContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlowStmtReturnContext extends Flow_stmtContext {
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public FlowStmtReturnContext(Flow_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFlowStmtReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFlowStmtReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFlowStmtReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_stmtContext flow_stmt() throws RecognitionException {
		Flow_stmtContext _localctx = new Flow_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_flow_stmt);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				_localctx = new FlowStmtBreakContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				break_stmt();
				}
				break;
			case CONTINUE:
				_localctx = new FlowStmtContinueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				continue_stmt();
				}
				break;
			case RETURN:
				_localctx = new FlowStmtReturnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				return_stmt();
				}
				break;
			case RAISE:
				_localctx = new FlowStmtRaiseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				raise_stmt();
				}
				break;
			case YIELD:
				_localctx = new FlowStmtYieldContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				yield_stmt();
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
	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(PythonParser.BREAK, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBreak_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(BREAK);
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
	public static class Continue_stmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(PythonParser.CONTINUE, 0); }
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterContinue_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitContinue_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitContinue_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(CONTINUE);
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
	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(RETURN);
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(252);
				testlist();
				}
				break;
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
	public static class Yield_stmtContext extends ParserRuleContext {
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public Yield_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterYield_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitYield_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitYield_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Yield_stmtContext yield_stmt() throws RecognitionException {
		Yield_stmtContext _localctx = new Yield_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_yield_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			yield_expr();
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
	public static class Raise_stmtContext extends ParserRuleContext {
		public TerminalNode RAISE() { return getToken(PythonParser.RAISE, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public Raise_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRaise_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRaise_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRaise_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_stmtContext raise_stmt() throws RecognitionException {
		Raise_stmtContext _localctx = new Raise_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_raise_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(RAISE);
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(258);
				test();
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(259);
					match(FROM);
					setState(260);
					test();
					}
					break;
				}
				}
				break;
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
	public static class Import_stmtContext extends ParserRuleContext {
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
	 
		public Import_stmtContext() { }
		public void copyFrom(Import_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStmtNameContext extends Import_stmtContext {
		public Import_nameContext import_name() {
			return getRuleContext(Import_nameContext.class,0);
		}
		public ImportStmtNameContext(Import_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportStmtName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportStmtName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportStmtName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStmtFromContext extends Import_stmtContext {
		public Import_fromContext import_from() {
			return getRuleContext(Import_fromContext.class,0);
		}
		public ImportStmtFromContext(Import_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportStmtFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportStmtFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportStmtFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_import_stmt);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				_localctx = new ImportStmtNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				import_name();
				}
				break;
			case FROM:
				_localctx = new ImportStmtFromContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				import_from();
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
	public static class Import_nameContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public Dotted_as_namesContext dotted_as_names() {
			return getRuleContext(Dotted_as_namesContext.class,0);
		}
		public Import_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImport_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImport_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImport_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_nameContext import_name() throws RecognitionException {
		Import_nameContext _localctx = new Import_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_import_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(IMPORT);
			setState(270);
			dotted_as_names();
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
	public static class Import_fromContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public Import_as_namesContext import_as_names() {
			return getRuleContext(Import_as_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public Import_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImport_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImport_from(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImport_from(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_fromContext import_from() throws RecognitionException {
		Import_fromContext _localctx = new Import_fromContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_import_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(FROM);
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(273);
					match(DOT);
					}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(279);
				dotted_name();
				}
				break;
			case 2:
				{
				setState(281); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(280);
					match(DOT);
					}
					}
					setState(283); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT );
				}
				break;
			}
			setState(287);
			match(IMPORT);
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(288);
				match(STAR);
				}
				break;
			case LPAREN:
				{
				setState(289);
				match(LPAREN);
				setState(290);
				import_as_names();
				setState(291);
				match(RPAREN);
				}
				break;
			case NAME:
				{
				setState(293);
				import_as_names();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Import_as_nameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public Import_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_as_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImport_as_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImport_as_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImport_as_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_as_nameContext import_as_name() throws RecognitionException {
		Import_as_nameContext _localctx = new Import_as_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_import_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(NAME);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(297);
				match(AS);
				setState(298);
				match(NAME);
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
	public static class Dotted_as_nameContext extends ParserRuleContext {
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Dotted_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_as_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDotted_as_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDotted_as_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDotted_as_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_as_nameContext dotted_as_name() throws RecognitionException {
		Dotted_as_nameContext _localctx = new Dotted_as_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dotted_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			dotted_name();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(302);
				match(AS);
				setState(303);
				match(NAME);
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
	public static class Import_as_namesContext extends ParserRuleContext {
		public List<Import_as_nameContext> import_as_name() {
			return getRuleContexts(Import_as_nameContext.class);
		}
		public Import_as_nameContext import_as_name(int i) {
			return getRuleContext(Import_as_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Import_as_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_as_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImport_as_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImport_as_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImport_as_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_as_namesContext import_as_names() throws RecognitionException {
		Import_as_namesContext _localctx = new Import_as_namesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_import_as_names);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			import_as_name();
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307);
					match(COMMA);
					setState(308);
					import_as_name();
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(314);
				match(COMMA);
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
	public static class Dotted_as_namesContext extends ParserRuleContext {
		public List<Dotted_as_nameContext> dotted_as_name() {
			return getRuleContexts(Dotted_as_nameContext.class);
		}
		public Dotted_as_nameContext dotted_as_name(int i) {
			return getRuleContext(Dotted_as_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Dotted_as_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_as_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDotted_as_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDotted_as_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDotted_as_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_as_namesContext dotted_as_names() throws RecognitionException {
		Dotted_as_namesContext _localctx = new Dotted_as_namesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dotted_as_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			dotted_as_name();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(318);
				match(COMMA);
				setState(319);
				dotted_as_name();
				}
				}
				setState(324);
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
	public static class Dotted_nameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public Dotted_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDotted_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDotted_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDotted_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_nameContext dotted_name() throws RecognitionException {
		Dotted_nameContext _localctx = new Dotted_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dotted_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(NAME);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(326);
				match(DOT);
				setState(327);
				match(NAME);
				}
				}
				setState(332);
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
	public static class Global_stmtContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(PythonParser.GLOBAL, 0); }
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Global_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGlobal_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGlobal_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGlobal_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_stmtContext global_stmt() throws RecognitionException {
		Global_stmtContext _localctx = new Global_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_global_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(GLOBAL);
			setState(334);
			match(NAME);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(335);
				match(COMMA);
				setState(336);
				match(NAME);
				}
				}
				setState(341);
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
	public static class Nonlocal_stmtContext extends ParserRuleContext {
		public TerminalNode NONLOCAL() { return getToken(PythonParser.NONLOCAL, 0); }
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Nonlocal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonlocal_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNonlocal_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNonlocal_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNonlocal_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nonlocal_stmtContext nonlocal_stmt() throws RecognitionException {
		Nonlocal_stmtContext _localctx = new Nonlocal_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_nonlocal_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(NONLOCAL);
			setState(343);
			match(NAME);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(344);
				match(COMMA);
				setState(345);
				match(NAME);
				}
				}
				setState(350);
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
	public static class Assert_stmtContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(PythonParser.ASSERT, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public Assert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAssert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAssert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAssert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assert_stmtContext assert_stmt() throws RecognitionException {
		Assert_stmtContext _localctx = new Assert_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(ASSERT);
			setState(352);
			test();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(353);
				match(COMMA);
				setState(354);
				test();
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
	public static class Compound_stmtContext extends ParserRuleContext {
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
	 
		public Compound_stmtContext() { }
		public void copyFrom(Compound_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStmtWithContext extends Compound_stmtContext {
		public With_stmtContext with_stmt() {
			return getRuleContext(With_stmtContext.class,0);
		}
		public CompoundStmtWithContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompoundStmtWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompoundStmtWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompoundStmtWith(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStmtIfContext extends Compound_stmtContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public CompoundStmtIfContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompoundStmtIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompoundStmtIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompoundStmtIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStmtWhileContext extends Compound_stmtContext {
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public CompoundStmtWhileContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompoundStmtWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompoundStmtWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompoundStmtWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStmtTryContext extends Compound_stmtContext {
		public Try_stmtContext try_stmt() {
			return getRuleContext(Try_stmtContext.class,0);
		}
		public CompoundStmtTryContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompoundStmtTry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompoundStmtTry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompoundStmtTry(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStmtFuncContext extends Compound_stmtContext {
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public CompoundStmtFuncContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompoundStmtFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompoundStmtFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompoundStmtFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStmtClassContext extends Compound_stmtContext {
		public ClassdefContext classdef() {
			return getRuleContext(ClassdefContext.class,0);
		}
		public CompoundStmtClassContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompoundStmtClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompoundStmtClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompoundStmtClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStmtForContext extends Compound_stmtContext {
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public CompoundStmtForContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompoundStmtFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompoundStmtFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompoundStmtFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStmtDecoratedContext extends Compound_stmtContext {
		public DecoratedContext decorated() {
			return getRuleContext(DecoratedContext.class,0);
		}
		public CompoundStmtDecoratedContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompoundStmtDecorated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompoundStmtDecorated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompoundStmtDecorated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_compound_stmt);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new CompoundStmtIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				if_stmt();
				}
				break;
			case WHILE:
				_localctx = new CompoundStmtWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				while_stmt();
				}
				break;
			case FOR:
				_localctx = new CompoundStmtForContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				for_stmt();
				}
				break;
			case TRY:
				_localctx = new CompoundStmtTryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				try_stmt();
				}
				break;
			case WITH:
				_localctx = new CompoundStmtWithContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(361);
				with_stmt();
				}
				break;
			case DEF:
				_localctx = new CompoundStmtFuncContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(362);
				funcdef();
				}
				break;
			case CLASS:
				_localctx = new CompoundStmtClassContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(363);
				classdef();
				}
				break;
			case AT:
				_localctx = new CompoundStmtDecoratedContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(364);
				decorated();
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
	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(PythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonParser.COLON, i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(PythonParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(PythonParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_if_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(IF);
			setState(368);
			test();
			setState(369);
			match(COLON);
			setState(370);
			suite();
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(371);
					match(ELIF);
					setState(372);
					test();
					setState(373);
					match(COLON);
					setState(374);
					suite();
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(381);
				match(ELSE);
				setState(382);
				match(COLON);
				setState(383);
				suite();
				}
				break;
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
	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PythonParser.WHILE, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(PythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonParser.COLON, i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(WHILE);
			setState(387);
			test();
			setState(388);
			match(COLON);
			setState(389);
			suite();
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(390);
				match(ELSE);
				setState(391);
				match(COLON);
				setState(392);
				suite();
				}
				break;
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
	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(PythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonParser.COLON, i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(FOR);
			setState(396);
			exprlist();
			setState(397);
			match(IN);
			setState(398);
			testlist();
			setState(399);
			match(COLON);
			setState(400);
			suite();
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(401);
				match(ELSE);
				setState(402);
				match(COLON);
				setState(403);
				suite();
				}
				break;
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
	public static class Try_stmtContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(PythonParser.TRY, 0); }
		public List<TerminalNode> COLON() { return getTokens(PythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonParser.COLON, i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public TerminalNode FINALLY() { return getToken(PythonParser.FINALLY, 0); }
		public List<Except_clauseContext> except_clause() {
			return getRuleContexts(Except_clauseContext.class);
		}
		public Except_clauseContext except_clause(int i) {
			return getRuleContext(Except_clauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public Try_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTry_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTry_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTry_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_stmtContext try_stmt() throws RecognitionException {
		Try_stmtContext _localctx = new Try_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_try_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(TRY);
			setState(407);
			match(COLON);
			setState(408);
			suite();
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCEPT:
				{
				setState(413); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(409);
						except_clause();
						setState(410);
						match(COLON);
						setState(411);
						suite();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(415); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(417);
					match(ELSE);
					setState(418);
					match(COLON);
					setState(419);
					suite();
					}
					break;
				}
				setState(425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(422);
					match(FINALLY);
					setState(423);
					match(COLON);
					setState(424);
					suite();
					}
					break;
				}
				}
				break;
			case FINALLY:
				{
				setState(427);
				match(FINALLY);
				setState(428);
				match(COLON);
				setState(429);
				suite();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class With_stmtContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(PythonParser.WITH, 0); }
		public List<With_itemContext> with_item() {
			return getRuleContexts(With_itemContext.class);
		}
		public With_itemContext with_item(int i) {
			return getRuleContext(With_itemContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public With_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWith_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWith_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWith_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_stmtContext with_stmt() throws RecognitionException {
		With_stmtContext _localctx = new With_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_with_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(WITH);
			setState(433);
			with_item();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(434);
				match(COMMA);
				setState(435);
				with_item();
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
			match(COLON);
			setState(442);
			suite();
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
	public static class With_itemContext extends ParserRuleContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public With_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWith_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWith_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWith_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_itemContext with_item() throws RecognitionException {
		With_itemContext _localctx = new With_itemContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_with_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			test();
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(445);
				match(AS);
				setState(446);
				expr();
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
	public static class Except_clauseContext extends ParserRuleContext {
		public TerminalNode EXCEPT() { return getToken(PythonParser.EXCEPT, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Except_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_except_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterExcept_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitExcept_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitExcept_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Except_clauseContext except_clause() throws RecognitionException {
		Except_clauseContext _localctx = new Except_clauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_except_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(EXCEPT);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 2164700952118959617L) != 0)) {
				{
				setState(450);
				test();
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(451);
					match(AS);
					setState(452);
					match(NAME);
					}
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
	public static class SuiteContext extends ParserRuleContext {
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
	 
		public SuiteContext() { }
		public void copyFrom(SuiteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SuiteCompoundContext extends SuiteContext {
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SuiteCompoundContext(SuiteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSuiteCompound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSuiteCompound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSuiteCompound(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SuiteSimpleContext extends SuiteContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public SuiteSimpleContext(SuiteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSuiteSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSuiteSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSuiteSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_suite);
		int _la;
		try {
			int _alt;
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new SuiteSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				simple_stmt();
				}
				break;
			case 2:
				_localctx = new SuiteCompoundContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(458);
					match(NEWLINE);
					}
					}
					setState(463);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(465); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(464);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(467); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PythonParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(PythonParser.ARROW, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFuncdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(DEF);
			setState(472);
			match(NAME);
			setState(473);
			parameters();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(474);
				match(ARROW);
				setState(475);
				test();
				}
			}

			setState(478);
			match(COLON);
			setState(479);
			suite();
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
	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public TypedargslistContext typedargslist() {
			return getRuleContext(TypedargslistContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(LPAREN);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & 1099511693313L) != 0)) {
				{
				setState(482);
				typedargslist();
				}
			}

			setState(485);
			match(RPAREN);
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
	public static class TypedargslistContext extends ParserRuleContext {
		public TypedargslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedargslist; }
	 
		public TypedargslistContext() { }
		public void copyFrom(TypedargslistContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleStarParameterContext extends TypedargslistContext {
		public DoubleStarParContext doubleStarPar() {
			return getRuleContext(DoubleStarParContext.class,0);
		}
		public DoubleStarParameterContext(TypedargslistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDoubleStarParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDoubleStarParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDoubleStarParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalParameterContext extends TypedargslistContext {
		public List<NormalParContext> normalPar() {
			return getRuleContexts(NormalParContext.class);
		}
		public NormalParContext normalPar(int i) {
			return getRuleContext(NormalParContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public NormalParameterContext(TypedargslistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarParaneterContext extends TypedargslistContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public TfpdefContext tfpdef() {
			return getRuleContext(TfpdefContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public List<NormalParContext> normalPar() {
			return getRuleContexts(NormalParContext.class);
		}
		public NormalParContext normalPar(int i) {
			return getRuleContext(NormalParContext.class,i);
		}
		public DoubleStarParContext doubleStarPar() {
			return getRuleContext(DoubleStarParContext.class,0);
		}
		public StarParaneterContext(TypedargslistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarParaneter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarParaneter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarParaneter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedargslistContext typedargslist() throws RecognitionException {
		TypedargslistContext _localctx = new TypedargslistContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typedargslist);
		int _la;
		try {
			int _alt;
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				_localctx = new NormalParameterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				normalPar();
				setState(492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(488);
						match(COMMA);
						setState(489);
						normalPar();
						}
						} 
					}
					setState(494);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(495);
					match(COMMA);
					}
				}

				}
				break;
			case STAR:
				_localctx = new StarParaneterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				match(STAR);
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(499);
					tfpdef();
					}
				}

				setState(506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(502);
						match(COMMA);
						setState(503);
						normalPar();
						}
						} 
					}
					setState(508);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(509);
					match(COMMA);
					setState(510);
					doubleStarPar();
					}
				}

				}
				break;
			case DOUBLESTAR:
				_localctx = new DoubleStarParameterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(513);
				doubleStarPar();
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
	public static class NormalParContext extends ParserRuleContext {
		public TfpdefContext tfpdef() {
			return getRuleContext(TfpdefContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public NormalParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNormalPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNormalPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNormalPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalParContext normalPar() throws RecognitionException {
		NormalParContext _localctx = new NormalParContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_normalPar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			tfpdef();
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(517);
				match(EQUAL);
				setState(518);
				test();
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
	public static class DoubleStarParContext extends ParserRuleContext {
		public TerminalNode DOUBLESTAR() { return getToken(PythonParser.DOUBLESTAR, 0); }
		public TfpdefContext tfpdef() {
			return getRuleContext(TfpdefContext.class,0);
		}
		public DoubleStarParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleStarPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDoubleStarPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDoubleStarPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDoubleStarPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleStarParContext doubleStarPar() throws RecognitionException {
		DoubleStarParContext _localctx = new DoubleStarParContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_doubleStarPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(DOUBLESTAR);
			setState(522);
			tfpdef();
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
	public static class TfpdefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TfpdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tfpdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTfpdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTfpdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTfpdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TfpdefContext tfpdef() throws RecognitionException {
		TfpdefContext _localctx = new TfpdefContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tfpdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(NAME);
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(525);
				match(COLON);
				setState(526);
				test();
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
	public static class ClassdefContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PythonParser.CLASS, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public ClassdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterClassdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitClassdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitClassdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdefContext classdef() throws RecognitionException {
		ClassdefContext _localctx = new ClassdefContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_classdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(CLASS);
			setState(530);
			match(NAME);
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(531);
				match(LPAREN);
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 2164701020839484929L) != 0)) {
					{
					setState(532);
					arglist();
					}
				}

				setState(535);
				match(RPAREN);
				}
			}

			setState(538);
			match(COLON);
			setState(539);
			suite();
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
	public static class DecoratedContext extends ParserRuleContext {
		public ClassdefContext classdef() {
			return getRuleContext(ClassdefContext.class,0);
		}
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public DecoratedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDecorated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDecorated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDecorated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratedContext decorated() throws RecognitionException {
		DecoratedContext _localctx = new DecoratedContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_decorated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(541);
				decorator();
				}
				}
				setState(544); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AT );
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(546);
				classdef();
				}
				break;
			case DEF:
				{
				setState(547);
				funcdef();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(PythonParser.AT, 0); }
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(AT);
			setState(551);
			dotted_name();
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(552);
				match(LPAREN);
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 2164701020839484929L) != 0)) {
					{
					setState(553);
					arglist();
					}
				}

				setState(556);
				match(RPAREN);
				}
			}

			setState(559);
			match(NEWLINE);
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
	public static class TestContext extends ParserRuleContext {
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
	 
		public TestContext() { }
		public void copyFrom(TestContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TestLambdaContext extends TestContext {
		public LambdefContext lambdef() {
			return getRuleContext(LambdefContext.class,0);
		}
		public TestLambdaContext(TestContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTestLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTestLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTestLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TestCondContext extends TestContext {
		public List<Or_testContext> or_test() {
			return getRuleContexts(Or_testContext.class);
		}
		public Or_testContext or_test(int i) {
			return getRuleContext(Or_testContext.class,i);
		}
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TestCondContext(TestContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTestCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTestCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTestCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_test);
		try {
			setState(570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case TRUE:
			case FALSE:
			case NONE:
			case PLUS:
			case MINUS:
			case TILDE:
			case LPAREN:
			case LSQB:
			case LBRACE:
			case ELLIPSIS:
			case STRING:
			case NUMBER:
			case NAME:
				_localctx = new TestCondContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				or_test();
				setState(567);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(562);
					match(IF);
					setState(563);
					or_test();
					setState(564);
					match(ELSE);
					setState(565);
					test();
					}
					break;
				}
				}
				break;
			case LAMBDA:
				_localctx = new TestLambdaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				lambdef();
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
	public static class Test_nocondContext extends ParserRuleContext {
		public Test_nocondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_nocond; }
	 
		public Test_nocondContext() { }
		public void copyFrom(Test_nocondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TestNoCondOrContext extends Test_nocondContext {
		public Or_testContext or_test() {
			return getRuleContext(Or_testContext.class,0);
		}
		public TestNoCondOrContext(Test_nocondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTestNoCondOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTestNoCondOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTestNoCondOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TestNoCondLambdaContext extends Test_nocondContext {
		public Lambdef_nocondContext lambdef_nocond() {
			return getRuleContext(Lambdef_nocondContext.class,0);
		}
		public TestNoCondLambdaContext(Test_nocondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTestNoCondLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTestNoCondLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTestNoCondLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Test_nocondContext test_nocond() throws RecognitionException {
		Test_nocondContext _localctx = new Test_nocondContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_test_nocond);
		try {
			setState(574);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case TRUE:
			case FALSE:
			case NONE:
			case PLUS:
			case MINUS:
			case TILDE:
			case LPAREN:
			case LSQB:
			case LBRACE:
			case ELLIPSIS:
			case STRING:
			case NUMBER:
			case NAME:
				_localctx = new TestNoCondOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				or_test();
				}
				break;
			case LAMBDA:
				_localctx = new TestNoCondLambdaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				lambdef_nocond();
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
	public static class LambdefContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(PythonParser.LAMBDA, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public VarargslistContext varargslist() {
			return getRuleContext(VarargslistContext.class,0);
		}
		public LambdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLambdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdefContext lambdef() throws RecognitionException {
		LambdefContext _localctx = new LambdefContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_lambdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(LAMBDA);
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & 1099511693313L) != 0)) {
				{
				setState(577);
				varargslist();
				}
			}

			setState(580);
			match(COLON);
			setState(581);
			test();
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
	public static class Lambdef_nocondContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(PythonParser.LAMBDA, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public Test_nocondContext test_nocond() {
			return getRuleContext(Test_nocondContext.class,0);
		}
		public VarargslistContext varargslist() {
			return getRuleContext(VarargslistContext.class,0);
		}
		public Lambdef_nocondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdef_nocond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambdef_nocond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambdef_nocond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLambdef_nocond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambdef_nocondContext lambdef_nocond() throws RecognitionException {
		Lambdef_nocondContext _localctx = new Lambdef_nocondContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_lambdef_nocond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(LAMBDA);
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & 1099511693313L) != 0)) {
				{
				setState(584);
				varargslist();
				}
			}

			setState(587);
			match(COLON);
			setState(588);
			test_nocond();
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
	public static class Or_testContext extends ParserRuleContext {
		public List<And_testContext> and_test() {
			return getRuleContexts(And_testContext.class);
		}
		public And_testContext and_test(int i) {
			return getRuleContext(And_testContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(PythonParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(PythonParser.OR, i);
		}
		public Or_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterOr_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitOr_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitOr_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_testContext or_test() throws RecognitionException {
		Or_testContext _localctx = new Or_testContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_or_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			and_test();
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(591);
				match(OR);
				setState(592);
				and_test();
				}
				}
				setState(597);
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
	public static class And_testContext extends ParserRuleContext {
		public List<Not_testContext> not_test() {
			return getRuleContexts(Not_testContext.class);
		}
		public Not_testContext not_test(int i) {
			return getRuleContext(Not_testContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(PythonParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(PythonParser.AND, i);
		}
		public And_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAnd_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAnd_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAnd_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_testContext and_test() throws RecognitionException {
		And_testContext _localctx = new And_testContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_and_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			not_test();
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(599);
				match(AND);
				setState(600);
				not_test();
				}
				}
				setState(605);
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
	public static class Not_testContext extends ParserRuleContext {
		public Not_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_test; }
	 
		public Not_testContext() { }
		public void copyFrom(Not_testContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotTestCompContext extends Not_testContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public NotTestCompContext(Not_testContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNotTestComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNotTestComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNotTestComp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotTestNotContext extends Not_testContext {
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public Not_testContext not_test() {
			return getRuleContext(Not_testContext.class,0);
		}
		public NotTestNotContext(Not_testContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNotTestNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNotTestNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNotTestNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_testContext not_test() throws RecognitionException {
		Not_testContext _localctx = new Not_testContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_not_test);
		try {
			setState(609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotTestNotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				match(NOT);
				setState(607);
				not_test();
				}
				break;
			case TRUE:
			case FALSE:
			case NONE:
			case PLUS:
			case MINUS:
			case TILDE:
			case LPAREN:
			case LSQB:
			case LBRACE:
			case ELLIPSIS:
			case STRING:
			case NUMBER:
			case NAME:
				_localctx = new NotTestCompContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				comparison();
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
	public static class ComparisonContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Comp_opContext> comp_op() {
			return getRuleContexts(Comp_opContext.class);
		}
		public Comp_opContext comp_op(int i) {
			return getRuleContext(Comp_opContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			expr();
			setState(617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(612);
					comp_op();
					setState(613);
					expr();
					}
					} 
				}
				setState(619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
	public static class Comp_opContext extends ParserRuleContext {
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
	 
		public Comp_opContext() { }
		public void copyFrom(Comp_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompOpLessContext extends Comp_opContext {
		public TerminalNode LESS() { return getToken(PythonParser.LESS, 0); }
		public CompOpLessContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompOpLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompOpLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompOpLess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompOpNeContext extends Comp_opContext {
		public TerminalNode NOTEQUAL() { return getToken(PythonParser.NOTEQUAL, 0); }
		public CompOpNeContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompOpNe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompOpNe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompOpNe(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompOpInContext extends Comp_opContext {
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public CompOpInContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompOpIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompOpIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompOpIn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompOpIsNotContext extends Comp_opContext {
		public TerminalNode IS() { return getToken(PythonParser.IS, 0); }
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public CompOpIsNotContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompOpIsNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompOpIsNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompOpIsNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompOpIsContext extends Comp_opContext {
		public TerminalNode IS() { return getToken(PythonParser.IS, 0); }
		public CompOpIsContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompOpIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompOpIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompOpIs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompOpLeContext extends Comp_opContext {
		public TerminalNode LESSEQUAL() { return getToken(PythonParser.LESSEQUAL, 0); }
		public CompOpLeContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompOpLe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompOpLe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompOpLe(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompOpGeContext extends Comp_opContext {
		public TerminalNode GREATEREQUAL() { return getToken(PythonParser.GREATEREQUAL, 0); }
		public CompOpGeContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompOpGe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompOpGe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompOpGe(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompOpNotInContext extends Comp_opContext {
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public CompOpNotInContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompOpNotIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompOpNotIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompOpNotIn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompOpGreaterContext extends Comp_opContext {
		public TerminalNode GREATER() { return getToken(PythonParser.GREATER, 0); }
		public CompOpGreaterContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompOpGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompOpGreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompOpGreater(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompOpEqContext extends Comp_opContext {
		public TerminalNode EQEQUAL() { return getToken(PythonParser.EQEQUAL, 0); }
		public CompOpEqContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompOpEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompOpEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompOpEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_comp_op);
		try {
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				_localctx = new CompOpLessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				match(LESS);
				}
				break;
			case 2:
				_localctx = new CompOpGreaterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				match(GREATER);
				}
				break;
			case 3:
				_localctx = new CompOpEqContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(622);
				match(EQEQUAL);
				}
				break;
			case 4:
				_localctx = new CompOpGeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(623);
				match(GREATEREQUAL);
				}
				break;
			case 5:
				_localctx = new CompOpLeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(624);
				match(LESSEQUAL);
				}
				break;
			case 6:
				_localctx = new CompOpNeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(625);
				match(NOTEQUAL);
				}
				break;
			case 7:
				_localctx = new CompOpInContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(626);
				match(IN);
				}
				break;
			case 8:
				_localctx = new CompOpNotInContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(627);
				match(NOT);
				setState(628);
				match(IN);
				}
				break;
			case 9:
				_localctx = new CompOpIsContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(629);
				match(IS);
				}
				break;
			case 10:
				_localctx = new CompOpIsNotContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(630);
				match(IS);
				setState(631);
				match(NOT);
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
	public static class Star_exprContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Star_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStar_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStar_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStar_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Star_exprContext star_expr() throws RecognitionException {
		Star_exprContext _localctx = new Star_exprContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_star_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(STAR);
			setState(635);
			expr();
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
		public List<Xor_exprContext> xor_expr() {
			return getRuleContexts(Xor_exprContext.class);
		}
		public Xor_exprContext xor_expr(int i) {
			return getRuleContext(Xor_exprContext.class,i);
		}
		public List<TerminalNode> VBAR() { return getTokens(PythonParser.VBAR); }
		public TerminalNode VBAR(int i) {
			return getToken(PythonParser.VBAR, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			xor_expr();
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VBAR) {
				{
				{
				setState(638);
				match(VBAR);
				setState(639);
				xor_expr();
				}
				}
				setState(644);
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
	public static class Xor_exprContext extends ParserRuleContext {
		public List<And_exprContext> and_expr() {
			return getRuleContexts(And_exprContext.class);
		}
		public And_exprContext and_expr(int i) {
			return getRuleContext(And_exprContext.class,i);
		}
		public List<TerminalNode> CIRCUMFLEX() { return getTokens(PythonParser.CIRCUMFLEX); }
		public TerminalNode CIRCUMFLEX(int i) {
			return getToken(PythonParser.CIRCUMFLEX, i);
		}
		public Xor_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterXor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitXor_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitXor_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xor_exprContext xor_expr() throws RecognitionException {
		Xor_exprContext _localctx = new Xor_exprContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_xor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			and_expr();
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CIRCUMFLEX) {
				{
				{
				setState(646);
				match(CIRCUMFLEX);
				setState(647);
				and_expr();
				}
				}
				setState(652);
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
	public static class And_exprContext extends ParserRuleContext {
		public List<Shift_exprContext> shift_expr() {
			return getRuleContexts(Shift_exprContext.class);
		}
		public Shift_exprContext shift_expr(int i) {
			return getRuleContext(Shift_exprContext.class,i);
		}
		public List<TerminalNode> AMPER() { return getTokens(PythonParser.AMPER); }
		public TerminalNode AMPER(int i) {
			return getToken(PythonParser.AMPER, i);
		}
		public And_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAnd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAnd_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAnd_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_and_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			shift_expr();
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMPER) {
				{
				{
				setState(654);
				match(AMPER);
				setState(655);
				shift_expr();
				}
				}
				setState(660);
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
	public static class Shift_exprContext extends ParserRuleContext {
		public Arith_exprContext arith_expr() {
			return getRuleContext(Arith_exprContext.class,0);
		}
		public List<ShiftContext> shift() {
			return getRuleContexts(ShiftContext.class);
		}
		public ShiftContext shift(int i) {
			return getRuleContext(ShiftContext.class,i);
		}
		public Shift_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterShift_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitShift_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitShift_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_exprContext shift_expr() throws RecognitionException {
		Shift_exprContext _localctx = new Shift_exprContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_shift_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			arith_expr();
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTSHIFT || _la==RIGHTSHIFT) {
				{
				{
				setState(662);
				shift();
				}
				}
				setState(667);
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
	public static class ShiftContext extends ParserRuleContext {
		public Arith_exprContext arith_expr() {
			return getRuleContext(Arith_exprContext.class,0);
		}
		public TerminalNode LEFTSHIFT() { return getToken(PythonParser.LEFTSHIFT, 0); }
		public TerminalNode RIGHTSHIFT() { return getToken(PythonParser.RIGHTSHIFT, 0); }
		public ShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitShift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitShift(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftContext shift() throws RecognitionException {
		ShiftContext _localctx = new ShiftContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_shift);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			_la = _input.LA(1);
			if ( !(_la==LEFTSHIFT || _la==RIGHTSHIFT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(669);
			arith_expr();
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
	public static class Arith_exprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public Arith_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterArith_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitArith_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitArith_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_arith_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			term();
			setState(675);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(672);
					math();
					}
					} 
				}
				setState(677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
	public static class MathContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PythonParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathContext math() throws RecognitionException {
		MathContext _localctx = new MathContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(679);
			term();
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
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<TermsContext> terms() {
			return getRuleContexts(TermsContext.class);
		}
		public TermsContext terms(int i) {
			return getRuleContext(TermsContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			factor();
			setState(685);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(682);
					terms();
					}
					} 
				}
				setState(687);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
	public static class TermsContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public TerminalNode AT() { return getToken(PythonParser.AT, 0); }
		public TerminalNode SLASH() { return getToken(PythonParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(PythonParser.PERCENT, 0); }
		public TerminalNode DOUBLESLASH() { return getToken(PythonParser.DOUBLESLASH, 0); }
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTerms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTerms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67554028770295808L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(689);
			factor();
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
	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorPowerContext extends FactorContext {
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public FactorPowerContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFactorPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFactorPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFactorPower(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorUnaryContext extends FactorContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PythonParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public TerminalNode TILDE() { return getToken(PythonParser.TILDE, 0); }
		public FactorUnaryContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFactorUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFactorUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFactorUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_factor);
		int _la;
		try {
			setState(694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case TILDE:
				_localctx = new FactorUnaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1156299204327374848L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(692);
				factor();
				}
				break;
			case TRUE:
			case FALSE:
			case NONE:
			case LPAREN:
			case LSQB:
			case LBRACE:
			case ELLIPSIS:
			case STRING:
			case NUMBER:
			case NAME:
				_localctx = new FactorPowerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(693);
				power();
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
	public static class PowerContext extends ParserRuleContext {
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public TerminalNode DOUBLESTAR() { return getToken(PythonParser.DOUBLESTAR, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			atom_expr();
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOUBLESTAR) {
				{
				setState(697);
				match(DOUBLESTAR);
				setState(698);
				factor();
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
	public static class Atom_exprContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<TrailerContext> trailer() {
			return getRuleContexts(TrailerContext.class);
		}
		public TrailerContext trailer(int i) {
			return getRuleContext(TrailerContext.class,i);
		}
		public Atom_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAtom_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAtom_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtom_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atom_exprContext atom_expr() throws RecognitionException {
		Atom_exprContext _localctx = new Atom_exprContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_atom_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			atom();
			setState(705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(702);
					trailer();
					}
					} 
				}
				setState(707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomListContext extends AtomContext {
		public TerminalNode LSQB() { return getToken(PythonParser.LSQB, 0); }
		public TerminalNode RSQB() { return getToken(PythonParser.RSQB, 0); }
		public Testlist_compContext testlist_comp() {
			return getRuleContext(Testlist_compContext.class,0);
		}
		public AtomListContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAtomList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAtomList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomNameContext extends AtomContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public AtomNameContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAtomName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAtomName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomEllipsisContext extends AtomContext {
		public TerminalNode ELLIPSIS() { return getToken(PythonParser.ELLIPSIS, 0); }
		public AtomEllipsisContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAtomEllipsis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAtomEllipsis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomEllipsis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomNumberContext extends AtomContext {
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public AtomNumberContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAtomNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAtomNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomFalseContext extends AtomContext {
		public TerminalNode FALSE() { return getToken(PythonParser.FALSE, 0); }
		public AtomFalseContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAtomFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAtomFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomNoneContext extends AtomContext {
		public TerminalNode NONE() { return getToken(PythonParser.NONE, 0); }
		public AtomNoneContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAtomNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAtomNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomNone(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomParenContext extends AtomContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public Testlist_compContext testlist_comp() {
			return getRuleContext(Testlist_compContext.class,0);
		}
		public AtomParenContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAtomParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAtomParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomDictContext extends AtomContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public DictorsetmakerContext dictorsetmaker() {
			return getRuleContext(DictorsetmakerContext.class,0);
		}
		public AtomDictContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAtomDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAtomDict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomDict(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomStringContext extends AtomContext {
		public List<TerminalNode> STRING() { return getTokens(PythonParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PythonParser.STRING, i);
		}
		public AtomStringContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAtomString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAtomString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomTrueContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(PythonParser.TRUE, 0); }
		public AtomTrueContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAtomTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAtomTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_atom);
		int _la;
		try {
			int _alt;
			setState(735);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new AtomParenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				match(LPAREN);
				setState(711);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case YIELD:
					{
					setState(709);
					yield_expr();
					}
					break;
				case NOT:
				case LAMBDA:
				case TRUE:
				case FALSE:
				case NONE:
				case PLUS:
				case MINUS:
				case STAR:
				case TILDE:
				case LPAREN:
				case LSQB:
				case LBRACE:
				case ELLIPSIS:
				case STRING:
				case NUMBER:
				case NAME:
					{
					setState(710);
					testlist_comp();
					}
					break;
				case RPAREN:
					break;
				default:
					break;
				}
				setState(713);
				match(RPAREN);
				}
				break;
			case LSQB:
				_localctx = new AtomListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(714);
				match(LSQB);
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 2164701020838436353L) != 0)) {
					{
					setState(715);
					testlist_comp();
					}
				}

				setState(718);
				match(RSQB);
				}
				break;
			case LBRACE:
				_localctx = new AtomDictContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(719);
				match(LBRACE);
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 4470544030053178881L) != 0)) {
					{
					setState(720);
					dictorsetmaker();
					}
				}

				setState(723);
				match(RBRACE);
				}
				break;
			case NAME:
				_localctx = new AtomNameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(724);
				match(NAME);
				}
				break;
			case NUMBER:
				_localctx = new AtomNumberContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(725);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new AtomStringContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(727); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(726);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(729); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case ELLIPSIS:
				_localctx = new AtomEllipsisContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(731);
				match(ELLIPSIS);
				}
				break;
			case NONE:
				_localctx = new AtomNoneContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(732);
				match(NONE);
				}
				break;
			case TRUE:
				_localctx = new AtomTrueContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(733);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new AtomFalseContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(734);
				match(FALSE);
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
	public static class Testlist_compContext extends ParserRuleContext {
		public List<TestlistElementContext> testlistElement() {
			return getRuleContexts(TestlistElementContext.class);
		}
		public TestlistElementContext testlistElement(int i) {
			return getRuleContext(TestlistElementContext.class,i);
		}
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Testlist_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTestlist_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTestlist_comp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTestlist_comp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Testlist_compContext testlist_comp() throws RecognitionException {
		Testlist_compContext _localctx = new Testlist_compContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_testlist_comp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			testlistElement();
			setState(749);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				{
				setState(738);
				comp_for();
				}
				break;
			case RPAREN:
			case RSQB:
			case COMMA:
				{
				setState(743);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(739);
						match(COMMA);
						setState(740);
						testlistElement();
						}
						} 
					}
					setState(745);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(746);
					match(COMMA);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class TestlistElementContext extends ParserRuleContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public Star_exprContext star_expr() {
			return getRuleContext(Star_exprContext.class,0);
		}
		public TestlistElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlistElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTestlistElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTestlistElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTestlistElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestlistElementContext testlistElement() throws RecognitionException {
		TestlistElementContext _localctx = new TestlistElementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_testlistElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case LAMBDA:
			case TRUE:
			case FALSE:
			case NONE:
			case PLUS:
			case MINUS:
			case TILDE:
			case LPAREN:
			case LSQB:
			case LBRACE:
			case ELLIPSIS:
			case STRING:
			case NUMBER:
			case NAME:
				{
				setState(751);
				test();
				}
				break;
			case STAR:
				{
				setState(752);
				star_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class TrailerContext extends ParserRuleContext {
		public TrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailer; }
	 
		public TrailerContext() { }
		public void copyFrom(TrailerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrailerIndexContext extends TrailerContext {
		public TerminalNode LSQB() { return getToken(PythonParser.LSQB, 0); }
		public SubscriptlistContext subscriptlist() {
			return getRuleContext(SubscriptlistContext.class,0);
		}
		public TerminalNode RSQB() { return getToken(PythonParser.RSQB, 0); }
		public TrailerIndexContext(TrailerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTrailerIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTrailerIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTrailerIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrailerDotContext extends TrailerContext {
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TrailerDotContext(TrailerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTrailerDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTrailerDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTrailerDot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrailerCallContext extends TrailerContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public TrailerCallContext(TrailerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTrailerCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTrailerCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTrailerCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_trailer);
		int _la;
		try {
			setState(766);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new TrailerCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				match(LPAREN);
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 2164701020839484929L) != 0)) {
					{
					setState(756);
					arglist();
					}
				}

				setState(759);
				match(RPAREN);
				}
				break;
			case LSQB:
				_localctx = new TrailerIndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(760);
				match(LSQB);
				setState(761);
				subscriptlist();
				setState(762);
				match(RSQB);
				}
				break;
			case DOT:
				_localctx = new TrailerDotContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(764);
				match(DOT);
				setState(765);
				match(NAME);
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
	public static class SubscriptlistContext extends ParserRuleContext {
		public List<SubscriptContext> subscript() {
			return getRuleContexts(SubscriptContext.class);
		}
		public SubscriptContext subscript(int i) {
			return getRuleContext(SubscriptContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public SubscriptlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSubscriptlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSubscriptlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSubscriptlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptlistContext subscriptlist() throws RecognitionException {
		SubscriptlistContext _localctx = new SubscriptlistContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_subscriptlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			subscript();
			setState(773);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(769);
					match(COMMA);
					setState(770);
					subscript();
					}
					} 
				}
				setState(775);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(776);
				match(COMMA);
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
	public static class SubscriptContext extends ParserRuleContext {
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
	 
		public SubscriptContext() { }
		public void copyFrom(SubscriptContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptSliceContext extends SubscriptContext {
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public SliceopContext sliceop() {
			return getRuleContext(SliceopContext.class,0);
		}
		public SubscriptSliceContext(SubscriptContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSubscriptSlice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSubscriptSlice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSubscriptSlice(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptTestContext extends SubscriptContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public SubscriptTestContext(SubscriptContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSubscriptTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSubscriptTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSubscriptTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_subscript);
		int _la;
		try {
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				_localctx = new SubscriptTestContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				test();
				}
				break;
			case 2:
				_localctx = new SubscriptSliceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 2164700952118959617L) != 0)) {
					{
					setState(780);
					test();
					}
				}

				setState(783);
				match(COLON);
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 2164700952118959617L) != 0)) {
					{
					setState(784);
					test();
					}
				}

				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(787);
					sliceop();
					}
				}

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
	public static class SliceopContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public SliceopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSliceop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSliceop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSliceop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceopContext sliceop() throws RecognitionException {
		SliceopContext _localctx = new SliceopContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_sliceop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(COLON);
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 2164700952118959617L) != 0)) {
				{
				setState(793);
				test();
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
	public static class ExprlistContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitExprlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitExprlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_exprlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NONE:
			case PLUS:
			case MINUS:
			case TILDE:
			case LPAREN:
			case LSQB:
			case LBRACE:
			case ELLIPSIS:
			case STRING:
			case NUMBER:
			case NAME:
				{
				setState(796);
				expr();
				}
				break;
			case STAR:
				{
				setState(797);
				star_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(807);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(800);
					match(COMMA);
					setState(803);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TRUE:
					case FALSE:
					case NONE:
					case PLUS:
					case MINUS:
					case TILDE:
					case LPAREN:
					case LSQB:
					case LBRACE:
					case ELLIPSIS:
					case STRING:
					case NUMBER:
					case NAME:
						{
						setState(801);
						expr();
						}
						break;
					case STAR:
						{
						setState(802);
						star_expr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(809);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			}
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(810);
				match(COMMA);
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
	public static class TestlistContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public TestlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTestlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTestlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTestlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestlistContext testlist() throws RecognitionException {
		TestlistContext _localctx = new TestlistContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_testlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			test();
			setState(818);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(814);
					match(COMMA);
					setState(815);
					test();
					}
					} 
				}
				setState(820);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			}
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(821);
				match(COMMA);
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
	public static class DictorsetmakerContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(PythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonParser.COLON, i);
		}
		public List<TerminalNode> DOUBLESTAR() { return getTokens(PythonParser.DOUBLESTAR); }
		public TerminalNode DOUBLESTAR(int i) {
			return getToken(PythonParser.DOUBLESTAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public DictorsetmakerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictorsetmaker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDictorsetmaker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDictorsetmaker(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDictorsetmaker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictorsetmakerContext dictorsetmaker() throws RecognitionException {
		DictorsetmakerContext _localctx = new DictorsetmakerContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_dictorsetmaker);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(824);
				match(NEWLINE);
				}
				}
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(836);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
				case LAMBDA:
				case TRUE:
				case FALSE:
				case NONE:
				case PLUS:
				case MINUS:
				case TILDE:
				case LPAREN:
				case LSQB:
				case LBRACE:
				case ELLIPSIS:
				case STRING:
				case NUMBER:
				case NAME:
					{
					setState(830);
					test();
					setState(831);
					match(COLON);
					setState(832);
					test();
					}
					break;
				case DOUBLESTAR:
					{
					setState(834);
					match(DOUBLESTAR);
					setState(835);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(841);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(838);
						match(NEWLINE);
						}
						} 
					}
					setState(843);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				setState(880);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOR:
					{
					setState(844);
					comp_for();
					}
					break;
				case RBRACE:
				case COMMA:
				case NEWLINE:
					{
					setState(868);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(845);
							match(COMMA);
							setState(849);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==NEWLINE) {
								{
								{
								setState(846);
								match(NEWLINE);
								}
								}
								setState(851);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(858);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case NOT:
							case LAMBDA:
							case TRUE:
							case FALSE:
							case NONE:
							case PLUS:
							case MINUS:
							case TILDE:
							case LPAREN:
							case LSQB:
							case LBRACE:
							case ELLIPSIS:
							case STRING:
							case NUMBER:
							case NAME:
								{
								setState(852);
								test();
								setState(853);
								match(COLON);
								setState(854);
								test();
								}
								break;
							case DOUBLESTAR:
								{
								setState(856);
								match(DOUBLESTAR);
								setState(857);
								expr();
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(863);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(860);
									match(NEWLINE);
									}
									} 
								}
								setState(865);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
							}
							}
							} 
						}
						setState(870);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
					}
					setState(872);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(871);
						match(COMMA);
						}
					}

					setState(877);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(874);
						match(NEWLINE);
						}
						}
						setState(879);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(884);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
				case LAMBDA:
				case TRUE:
				case FALSE:
				case NONE:
				case PLUS:
				case MINUS:
				case TILDE:
				case LPAREN:
				case LSQB:
				case LBRACE:
				case ELLIPSIS:
				case STRING:
				case NUMBER:
				case NAME:
					{
					setState(882);
					test();
					}
					break;
				case STAR:
					{
					setState(883);
					star_expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(889);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(886);
						match(NEWLINE);
						}
						} 
					}
					setState(891);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
				}
				setState(924);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOR:
					{
					setState(892);
					comp_for();
					}
					break;
				case RBRACE:
				case COMMA:
				case NEWLINE:
					{
					setState(912);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(893);
							match(COMMA);
							setState(897);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==NEWLINE) {
								{
								{
								setState(894);
								match(NEWLINE);
								}
								}
								setState(899);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(902);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case NOT:
							case LAMBDA:
							case TRUE:
							case FALSE:
							case NONE:
							case PLUS:
							case MINUS:
							case TILDE:
							case LPAREN:
							case LSQB:
							case LBRACE:
							case ELLIPSIS:
							case STRING:
							case NUMBER:
							case NAME:
								{
								setState(900);
								test();
								}
								break;
							case STAR:
								{
								setState(901);
								star_expr();
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(907);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(904);
									match(NEWLINE);
									}
									} 
								}
								setState(909);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
							}
							}
							} 
						}
						setState(914);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
					}
					setState(916);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(915);
						match(COMMA);
						}
					}

					setState(921);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(918);
						match(NEWLINE);
						}
						}
						setState(923);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
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
	public static class Classdef_or_funcdefContext extends ParserRuleContext {
		public Classdef_or_funcdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdef_or_funcdef; }
	 
		public Classdef_or_funcdefContext() { }
		public void copyFrom(Classdef_or_funcdefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefOrFuncDefClassContext extends Classdef_or_funcdefContext {
		public ClassdefContext classdef() {
			return getRuleContext(ClassdefContext.class,0);
		}
		public ClassDefOrFuncDefClassContext(Classdef_or_funcdefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterClassDefOrFuncDefClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitClassDefOrFuncDefClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitClassDefOrFuncDefClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefOrFuncDefFuncContext extends Classdef_or_funcdefContext {
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public ClassDefOrFuncDefFuncContext(Classdef_or_funcdefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterClassDefOrFuncDefFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitClassDefOrFuncDefFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitClassDefOrFuncDefFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Classdef_or_funcdefContext classdef_or_funcdef() throws RecognitionException {
		Classdef_or_funcdefContext _localctx = new Classdef_or_funcdefContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_classdef_or_funcdef);
		try {
			setState(930);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				_localctx = new ClassDefOrFuncDefClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(928);
				classdef();
				}
				break;
			case DEF:
				_localctx = new ClassDefOrFuncDefFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(929);
				funcdef();
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
	public static class ArglistContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitArglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_arglist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			argument();
			setState(937);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(933);
					match(COMMA);
					setState(934);
					argument();
					}
					} 
				}
				setState(939);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			}
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(940);
				match(COMMA);
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
	public static class ArgumentContext extends ParserRuleContext {
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	 
		public ArgumentContext() { }
		public void copyFrom(ArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentStarContext extends ArgumentContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public ArgumentStarContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterArgumentStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitArgumentStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitArgumentStar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentEqualContext extends ArgumentContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public ArgumentEqualContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterArgumentEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitArgumentEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitArgumentEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentDoubleStarContext extends ArgumentContext {
		public TerminalNode DOUBLESTAR() { return getToken(PythonParser.DOUBLESTAR, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public ArgumentDoubleStarContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterArgumentDoubleStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitArgumentDoubleStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitArgumentDoubleStar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentCompContext extends ArgumentContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public ArgumentCompContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterArgumentComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitArgumentComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitArgumentComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_argument);
		int _la;
		try {
			setState(955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				_localctx = new ArgumentCompContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(943);
				test();
				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(944);
					comp_for();
					}
				}

				}
				break;
			case 2:
				_localctx = new ArgumentEqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(947);
				test();
				setState(948);
				match(EQUAL);
				setState(949);
				test();
				}
				break;
			case 3:
				_localctx = new ArgumentDoubleStarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(951);
				match(DOUBLESTAR);
				setState(952);
				test();
				}
				break;
			case 4:
				_localctx = new ArgumentStarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(953);
				match(STAR);
				setState(954);
				test();
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
	public static class Comp_iterContext extends ParserRuleContext {
		public Comp_iterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_iter; }
	 
		public Comp_iterContext() { }
		public void copyFrom(Comp_iterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompIterForContext extends Comp_iterContext {
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public CompIterForContext(Comp_iterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompIterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompIterFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompIterFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompIterIfContext extends Comp_iterContext {
		public Comp_ifContext comp_if() {
			return getRuleContext(Comp_ifContext.class,0);
		}
		public CompIterIfContext(Comp_iterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompIterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompIterIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompIterIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_iterContext comp_iter() throws RecognitionException {
		Comp_iterContext _localctx = new Comp_iterContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_comp_iter);
		try {
			setState(959);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				_localctx = new CompIterForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(957);
				comp_for();
				}
				break;
			case IF:
				_localctx = new CompIterIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(958);
				comp_if();
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
	public static class Comp_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public Or_testContext or_test() {
			return getRuleContext(Or_testContext.class,0);
		}
		public Comp_iterContext comp_iter() {
			return getRuleContext(Comp_iterContext.class,0);
		}
		public Comp_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterComp_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitComp_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComp_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_forContext comp_for() throws RecognitionException {
		Comp_forContext _localctx = new Comp_forContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_comp_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(FOR);
			setState(962);
			exprlist();
			setState(963);
			match(IN);
			setState(964);
			or_test();
			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF || _la==FOR) {
				{
				setState(965);
				comp_iter();
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
	public static class Comp_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public Test_nocondContext test_nocond() {
			return getRuleContext(Test_nocondContext.class,0);
		}
		public Comp_iterContext comp_iter() {
			return getRuleContext(Comp_iterContext.class,0);
		}
		public Comp_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterComp_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitComp_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComp_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_ifContext comp_if() throws RecognitionException {
		Comp_ifContext _localctx = new Comp_ifContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_comp_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(IF);
			setState(969);
			test_nocond();
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF || _la==FOR) {
				{
				setState(970);
				comp_iter();
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
	public static class Yield_exprContext extends ParserRuleContext {
		public TerminalNode YIELD() { return getToken(PythonParser.YIELD, 0); }
		public Yield_argContext yield_arg() {
			return getRuleContext(Yield_argContext.class,0);
		}
		public Yield_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterYield_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitYield_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitYield_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Yield_exprContext yield_expr() throws RecognitionException {
		Yield_exprContext _localctx = new Yield_exprContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_yield_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			match(YIELD);
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(974);
				yield_arg();
				}
				break;
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
	public static class Yield_argContext extends ParserRuleContext {
		public Yield_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_arg; }
	 
		public Yield_argContext() { }
		public void copyFrom(Yield_argContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class YieldArgFromContext extends Yield_argContext {
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public YieldArgFromContext(Yield_argContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterYieldArgFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitYieldArgFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitYieldArgFrom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class YieldArgListContext extends Yield_argContext {
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public YieldArgListContext(Yield_argContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterYieldArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitYieldArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitYieldArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Yield_argContext yield_arg() throws RecognitionException {
		Yield_argContext _localctx = new Yield_argContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_yield_arg);
		try {
			setState(980);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				_localctx = new YieldArgFromContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(977);
				match(FROM);
				setState(978);
				test();
				}
				break;
			case NOT:
			case LAMBDA:
			case TRUE:
			case FALSE:
			case NONE:
			case PLUS:
			case MINUS:
			case TILDE:
			case LPAREN:
			case LSQB:
			case LBRACE:
			case ELLIPSIS:
			case STRING:
			case NUMBER:
			case NAME:
				_localctx = new YieldArgListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(979);
				testlist();
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
	public static class Testlist_star_exprContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Testlist_star_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist_star_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTestlist_star_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTestlist_star_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTestlist_star_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Testlist_star_exprContext testlist_star_expr() throws RecognitionException {
		Testlist_star_exprContext _localctx = new Testlist_star_exprContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_testlist_star_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case LAMBDA:
			case TRUE:
			case FALSE:
			case NONE:
			case PLUS:
			case MINUS:
			case TILDE:
			case LPAREN:
			case LSQB:
			case LBRACE:
			case ELLIPSIS:
			case STRING:
			case NUMBER:
			case NAME:
				{
				setState(982);
				test();
				}
				break;
			case STAR:
				{
				setState(983);
				star_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(993);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(986);
					match(COMMA);
					setState(989);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NOT:
					case LAMBDA:
					case TRUE:
					case FALSE:
					case NONE:
					case PLUS:
					case MINUS:
					case TILDE:
					case LPAREN:
					case LSQB:
					case LBRACE:
					case ELLIPSIS:
					case STRING:
					case NUMBER:
					case NAME:
						{
						setState(987);
						test();
						}
						break;
					case STAR:
						{
						setState(988);
						star_expr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(995);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			}
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(996);
				match(COMMA);
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
	public static class VarargslistContext extends ParserRuleContext {
		public VarargslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varargslist; }
	 
		public VarargslistContext() { }
		public void copyFrom(VarargslistContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalVariableContext extends VarargslistContext {
		public List<NormalVarContext> normalVar() {
			return getRuleContexts(NormalVarContext.class);
		}
		public NormalVarContext normalVar(int i) {
			return getRuleContext(NormalVarContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public NormalVariableContext(VarargslistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNormalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNormalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNormalVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleStarVariableContext extends VarargslistContext {
		public DoubleStarVarContext doubleStarVar() {
			return getRuleContext(DoubleStarVarContext.class,0);
		}
		public DoubleStarVariableContext(VarargslistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDoubleStarVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDoubleStarVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDoubleStarVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarVariableContext extends VarargslistContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public VfpdefContext vfpdef() {
			return getRuleContext(VfpdefContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public List<NormalVarContext> normalVar() {
			return getRuleContexts(NormalVarContext.class);
		}
		public NormalVarContext normalVar(int i) {
			return getRuleContext(NormalVarContext.class,i);
		}
		public DoubleStarVarContext doubleStarVar() {
			return getRuleContext(DoubleStarVarContext.class,0);
		}
		public StarVariableContext(VarargslistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarargslistContext varargslist() throws RecognitionException {
		VarargslistContext _localctx = new VarargslistContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_varargslist);
		int _la;
		try {
			int _alt;
			setState(1026);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				_localctx = new NormalVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(999);
				normalVar();
				setState(1004);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1000);
						match(COMMA);
						setState(1001);
						normalVar();
						}
						} 
					}
					setState(1006);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				}
				setState(1008);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1007);
					match(COMMA);
					}
				}

				}
				break;
			case STAR:
				_localctx = new StarVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1010);
				match(STAR);
				setState(1012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(1011);
					vfpdef();
					}
				}

				setState(1018);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1014);
						match(COMMA);
						setState(1015);
						normalVar();
						}
						} 
					}
					setState(1020);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				}
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1021);
					match(COMMA);
					setState(1022);
					doubleStarVar();
					}
				}

				}
				break;
			case DOUBLESTAR:
				_localctx = new DoubleStarVariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1025);
				doubleStarVar();
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
	public static class NormalVarContext extends ParserRuleContext {
		public VfpdefContext vfpdef() {
			return getRuleContext(VfpdefContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public NormalVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNormalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNormalVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNormalVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalVarContext normalVar() throws RecognitionException {
		NormalVarContext _localctx = new NormalVarContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_normalVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			vfpdef();
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(1029);
				match(EQUAL);
				setState(1030);
				test();
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
	public static class DoubleStarVarContext extends ParserRuleContext {
		public TerminalNode DOUBLESTAR() { return getToken(PythonParser.DOUBLESTAR, 0); }
		public VfpdefContext vfpdef() {
			return getRuleContext(VfpdefContext.class,0);
		}
		public DoubleStarVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleStarVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDoubleStarVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDoubleStarVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDoubleStarVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleStarVarContext doubleStarVar() throws RecognitionException {
		DoubleStarVarContext _localctx = new DoubleStarVarContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_doubleStarVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			match(DOUBLESTAR);
			setState(1034);
			vfpdef();
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
	public static class VfpdefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public VfpdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfpdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterVfpdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitVfpdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitVfpdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VfpdefContext vfpdef() throws RecognitionException {
		VfpdefContext _localctx = new VfpdefContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_vfpdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			match(NAME);
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
		"\u0004\u0001P\u040f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u00b3\b\u0000\n\u0000\f\u0000\u00b6\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u00bc\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u00c1\b\u0002\n\u0002\f\u0002\u00c4\t\u0002\u0001\u0002"+
		"\u0003\u0002\u00c7\b\u0002\u0001\u0002\u0003\u0002\u00ca\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00d4\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00dc\b\u0004\n"+
		"\u0004\f\u0004\u00df\t\u0004\u0003\u0004\u00e1\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00ea\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00f6\b\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u00fe\b"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0106\b"+
		"\r\u0003\r\u0108\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u010c\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u0113\b\u0010\n\u0010\f\u0010\u0116\t\u0010\u0001\u0010\u0001\u0010\u0004"+
		"\u0010\u011a\b\u0010\u000b\u0010\f\u0010\u011b\u0003\u0010\u011e\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0127\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u012c\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0131\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0136\b"+
		"\u0013\n\u0013\f\u0013\u0139\t\u0013\u0001\u0013\u0003\u0013\u013c\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0141\b\u0014\n\u0014"+
		"\f\u0014\u0144\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u0149\b\u0015\n\u0015\f\u0015\u014c\t\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u0152\b\u0016\n\u0016\f\u0016\u0155\t\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u015b\b\u0017"+
		"\n\u0017\f\u0017\u015e\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0164\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u016e"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0179\b\u001a\n"+
		"\u001a\f\u001a\u017c\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u0181\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u018a\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0195\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0004\u001d\u019e"+
		"\b\u001d\u000b\u001d\f\u001d\u019f\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u01a5\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u01aa\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01af\b"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u01b5"+
		"\b\u001e\n\u001e\f\u001e\u01b8\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01c0\b\u001f\u0001 "+
		"\u0001 \u0001 \u0001 \u0003 \u01c6\b \u0003 \u01c8\b \u0001!\u0001!\u0005"+
		"!\u01cc\b!\n!\f!\u01cf\t!\u0001!\u0004!\u01d2\b!\u000b!\f!\u01d3\u0003"+
		"!\u01d6\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01dd\b\"\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0003#\u01e4\b#\u0001#\u0001#\u0001$"+
		"\u0001$\u0001$\u0005$\u01eb\b$\n$\f$\u01ee\t$\u0001$\u0003$\u01f1\b$\u0001"+
		"$\u0001$\u0003$\u01f5\b$\u0001$\u0001$\u0005$\u01f9\b$\n$\f$\u01fc\t$"+
		"\u0001$\u0001$\u0003$\u0200\b$\u0001$\u0003$\u0203\b$\u0001%\u0001%\u0001"+
		"%\u0003%\u0208\b%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0003\'"+
		"\u0210\b\'\u0001(\u0001(\u0001(\u0001(\u0003(\u0216\b(\u0001(\u0003(\u0219"+
		"\b(\u0001(\u0001(\u0001(\u0001)\u0004)\u021f\b)\u000b)\f)\u0220\u0001"+
		")\u0001)\u0003)\u0225\b)\u0001*\u0001*\u0001*\u0001*\u0003*\u022b\b*\u0001"+
		"*\u0003*\u022e\b*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0003+\u0238\b+\u0001+\u0003+\u023b\b+\u0001,\u0001,\u0003,\u023f\b"+
		",\u0001-\u0001-\u0003-\u0243\b-\u0001-\u0001-\u0001-\u0001.\u0001.\u0003"+
		".\u024a\b.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0005/\u0252\b/\n"+
		"/\f/\u0255\t/\u00010\u00010\u00010\u00050\u025a\b0\n0\f0\u025d\t0\u0001"+
		"1\u00011\u00011\u00031\u0262\b1\u00012\u00012\u00012\u00012\u00052\u0268"+
		"\b2\n2\f2\u026b\t2\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00033\u0279\b3\u00014\u00014\u00014\u0001"+
		"5\u00015\u00015\u00055\u0281\b5\n5\f5\u0284\t5\u00016\u00016\u00016\u0005"+
		"6\u0289\b6\n6\f6\u028c\t6\u00017\u00017\u00017\u00057\u0291\b7\n7\f7\u0294"+
		"\t7\u00018\u00018\u00058\u0298\b8\n8\f8\u029b\t8\u00019\u00019\u00019"+
		"\u0001:\u0001:\u0005:\u02a2\b:\n:\f:\u02a5\t:\u0001;\u0001;\u0001;\u0001"+
		"<\u0001<\u0005<\u02ac\b<\n<\f<\u02af\t<\u0001=\u0001=\u0001=\u0001>\u0001"+
		">\u0001>\u0003>\u02b7\b>\u0001?\u0001?\u0001?\u0003?\u02bc\b?\u0001@\u0001"+
		"@\u0005@\u02c0\b@\n@\f@\u02c3\t@\u0001A\u0001A\u0001A\u0003A\u02c8\bA"+
		"\u0001A\u0001A\u0001A\u0003A\u02cd\bA\u0001A\u0001A\u0001A\u0003A\u02d2"+
		"\bA\u0001A\u0001A\u0001A\u0001A\u0004A\u02d8\bA\u000bA\fA\u02d9\u0001"+
		"A\u0001A\u0001A\u0001A\u0003A\u02e0\bA\u0001B\u0001B\u0001B\u0001B\u0005"+
		"B\u02e6\bB\nB\fB\u02e9\tB\u0001B\u0003B\u02ec\bB\u0003B\u02ee\bB\u0001"+
		"C\u0001C\u0003C\u02f2\bC\u0001D\u0001D\u0003D\u02f6\bD\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0003D\u02ff\bD\u0001E\u0001E\u0001E\u0005"+
		"E\u0304\bE\nE\fE\u0307\tE\u0001E\u0003E\u030a\bE\u0001F\u0001F\u0003F"+
		"\u030e\bF\u0001F\u0001F\u0003F\u0312\bF\u0001F\u0003F\u0315\bF\u0003F"+
		"\u0317\bF\u0001G\u0001G\u0003G\u031b\bG\u0001H\u0001H\u0003H\u031f\bH"+
		"\u0001H\u0001H\u0001H\u0003H\u0324\bH\u0005H\u0326\bH\nH\fH\u0329\tH\u0001"+
		"H\u0003H\u032c\bH\u0001I\u0001I\u0001I\u0005I\u0331\bI\nI\fI\u0334\tI"+
		"\u0001I\u0003I\u0337\bI\u0001J\u0005J\u033a\bJ\nJ\fJ\u033d\tJ\u0001J\u0001"+
		"J\u0001J\u0001J\u0001J\u0001J\u0003J\u0345\bJ\u0001J\u0005J\u0348\bJ\n"+
		"J\fJ\u034b\tJ\u0001J\u0001J\u0001J\u0005J\u0350\bJ\nJ\fJ\u0353\tJ\u0001"+
		"J\u0001J\u0001J\u0001J\u0001J\u0001J\u0003J\u035b\bJ\u0001J\u0005J\u035e"+
		"\bJ\nJ\fJ\u0361\tJ\u0005J\u0363\bJ\nJ\fJ\u0366\tJ\u0001J\u0003J\u0369"+
		"\bJ\u0001J\u0005J\u036c\bJ\nJ\fJ\u036f\tJ\u0003J\u0371\bJ\u0001J\u0001"+
		"J\u0003J\u0375\bJ\u0001J\u0005J\u0378\bJ\nJ\fJ\u037b\tJ\u0001J\u0001J"+
		"\u0001J\u0005J\u0380\bJ\nJ\fJ\u0383\tJ\u0001J\u0001J\u0003J\u0387\bJ\u0001"+
		"J\u0005J\u038a\bJ\nJ\fJ\u038d\tJ\u0005J\u038f\bJ\nJ\fJ\u0392\tJ\u0001"+
		"J\u0003J\u0395\bJ\u0001J\u0005J\u0398\bJ\nJ\fJ\u039b\tJ\u0003J\u039d\b"+
		"J\u0003J\u039f\bJ\u0001K\u0001K\u0003K\u03a3\bK\u0001L\u0001L\u0001L\u0005"+
		"L\u03a8\bL\nL\fL\u03ab\tL\u0001L\u0003L\u03ae\bL\u0001M\u0001M\u0003M"+
		"\u03b2\bM\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0003"+
		"M\u03bc\bM\u0001N\u0001N\u0003N\u03c0\bN\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0003O\u03c7\bO\u0001P\u0001P\u0001P\u0003P\u03cc\bP\u0001Q\u0001Q\u0003"+
		"Q\u03d0\bQ\u0001R\u0001R\u0001R\u0003R\u03d5\bR\u0001S\u0001S\u0003S\u03d9"+
		"\bS\u0001S\u0001S\u0001S\u0003S\u03de\bS\u0005S\u03e0\bS\nS\fS\u03e3\t"+
		"S\u0001S\u0003S\u03e6\bS\u0001T\u0001T\u0001T\u0005T\u03eb\bT\nT\fT\u03ee"+
		"\tT\u0001T\u0003T\u03f1\bT\u0001T\u0001T\u0003T\u03f5\bT\u0001T\u0001"+
		"T\u0005T\u03f9\bT\nT\fT\u03fc\tT\u0001T\u0001T\u0003T\u0400\bT\u0001T"+
		"\u0003T\u0403\bT\u0001U\u0001U\u0001U\u0003U\u0408\bU\u0001V\u0001V\u0001"+
		"V\u0001W\u0001W\u0001W\u0000\u0000X\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u0000\u0004\u0001\u0000%&\u0001\u00002"+
		"3\u0002\u0000##47\u0002\u000023<<\u0472\u0000\u00b4\u0001\u0000\u0000"+
		"\u0000\u0002\u00bb\u0001\u0000\u0000\u0000\u0004\u00bd\u0001\u0000\u0000"+
		"\u0000\u0006\u00d3\u0001\u0000\u0000\u0000\b\u00d5\u0001\u0000\u0000\u0000"+
		"\n\u00e9\u0001\u0000\u0000\u0000\f\u00eb\u0001\u0000\u0000\u0000\u000e"+
		"\u00ee\u0001\u0000\u0000\u0000\u0010\u00f5\u0001\u0000\u0000\u0000\u0012"+
		"\u00f7\u0001\u0000\u0000\u0000\u0014\u00f9\u0001\u0000\u0000\u0000\u0016"+
		"\u00fb\u0001\u0000\u0000\u0000\u0018\u00ff\u0001\u0000\u0000\u0000\u001a"+
		"\u0101\u0001\u0000\u0000\u0000\u001c\u010b\u0001\u0000\u0000\u0000\u001e"+
		"\u010d\u0001\u0000\u0000\u0000 \u0110\u0001\u0000\u0000\u0000\"\u0128"+
		"\u0001\u0000\u0000\u0000$\u012d\u0001\u0000\u0000\u0000&\u0132\u0001\u0000"+
		"\u0000\u0000(\u013d\u0001\u0000\u0000\u0000*\u0145\u0001\u0000\u0000\u0000"+
		",\u014d\u0001\u0000\u0000\u0000.\u0156\u0001\u0000\u0000\u00000\u015f"+
		"\u0001\u0000\u0000\u00002\u016d\u0001\u0000\u0000\u00004\u016f\u0001\u0000"+
		"\u0000\u00006\u0182\u0001\u0000\u0000\u00008\u018b\u0001\u0000\u0000\u0000"+
		":\u0196\u0001\u0000\u0000\u0000<\u01b0\u0001\u0000\u0000\u0000>\u01bc"+
		"\u0001\u0000\u0000\u0000@\u01c1\u0001\u0000\u0000\u0000B\u01d5\u0001\u0000"+
		"\u0000\u0000D\u01d7\u0001\u0000\u0000\u0000F\u01e1\u0001\u0000\u0000\u0000"+
		"H\u0202\u0001\u0000\u0000\u0000J\u0204\u0001\u0000\u0000\u0000L\u0209"+
		"\u0001\u0000\u0000\u0000N\u020c\u0001\u0000\u0000\u0000P\u0211\u0001\u0000"+
		"\u0000\u0000R\u021e\u0001\u0000\u0000\u0000T\u0226\u0001\u0000\u0000\u0000"+
		"V\u023a\u0001\u0000\u0000\u0000X\u023e\u0001\u0000\u0000\u0000Z\u0240"+
		"\u0001\u0000\u0000\u0000\\\u0247\u0001\u0000\u0000\u0000^\u024e\u0001"+
		"\u0000\u0000\u0000`\u0256\u0001\u0000\u0000\u0000b\u0261\u0001\u0000\u0000"+
		"\u0000d\u0263\u0001\u0000\u0000\u0000f\u0278\u0001\u0000\u0000\u0000h"+
		"\u027a\u0001\u0000\u0000\u0000j\u027d\u0001\u0000\u0000\u0000l\u0285\u0001"+
		"\u0000\u0000\u0000n\u028d\u0001\u0000\u0000\u0000p\u0295\u0001\u0000\u0000"+
		"\u0000r\u029c\u0001\u0000\u0000\u0000t\u029f\u0001\u0000\u0000\u0000v"+
		"\u02a6\u0001\u0000\u0000\u0000x\u02a9\u0001\u0000\u0000\u0000z\u02b0\u0001"+
		"\u0000\u0000\u0000|\u02b6\u0001\u0000\u0000\u0000~\u02b8\u0001\u0000\u0000"+
		"\u0000\u0080\u02bd\u0001\u0000\u0000\u0000\u0082\u02df\u0001\u0000\u0000"+
		"\u0000\u0084\u02e1\u0001\u0000\u0000\u0000\u0086\u02f1\u0001\u0000\u0000"+
		"\u0000\u0088\u02fe\u0001\u0000\u0000\u0000\u008a\u0300\u0001\u0000\u0000"+
		"\u0000\u008c\u0316\u0001\u0000\u0000\u0000\u008e\u0318\u0001\u0000\u0000"+
		"\u0000\u0090\u031e\u0001\u0000\u0000\u0000\u0092\u032d\u0001\u0000\u0000"+
		"\u0000\u0094\u033b\u0001\u0000\u0000\u0000\u0096\u03a2\u0001\u0000\u0000"+
		"\u0000\u0098\u03a4\u0001\u0000\u0000\u0000\u009a\u03bb\u0001\u0000\u0000"+
		"\u0000\u009c\u03bf\u0001\u0000\u0000\u0000\u009e\u03c1\u0001\u0000\u0000"+
		"\u0000\u00a0\u03c8\u0001\u0000\u0000\u0000\u00a2\u03cd\u0001\u0000\u0000"+
		"\u0000\u00a4\u03d4\u0001\u0000\u0000\u0000\u00a6\u03d8\u0001\u0000\u0000"+
		"\u0000\u00a8\u0402\u0001\u0000\u0000\u0000\u00aa\u0404\u0001\u0000\u0000"+
		"\u0000\u00ac\u0409\u0001\u0000\u0000\u0000\u00ae\u040c\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b3\u0005M\u0000\u0000\u00b1\u00b3\u0003\u0002\u0001\u0000"+
		"\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0000\u0000\u0001"+
		"\u00b8\u0001\u0001\u0000\u0000\u0000\u00b9\u00bc\u0003\u0004\u0002\u0000"+
		"\u00ba\u00bc\u00032\u0019\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bc\u0003\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c2\u0003\u0006\u0003\u0000\u00be\u00bf\u0005H\u0000\u0000\u00bf\u00c1"+
		"\u0003\u0006\u0003\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c7\u0005H\u0000\u0000\u00c6\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c8\u00ca\u0005M\u0000\u0000\u00c9\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u0005\u0001\u0000"+
		"\u0000\u0000\u00cb\u00d4\u0003\b\u0004\u0000\u00cc\u00d4\u0003\f\u0006"+
		"\u0000\u00cd\u00d4\u0003\u000e\u0007\u0000\u00ce\u00d4\u0003\u0010\b\u0000"+
		"\u00cf\u00d4\u0003\u001c\u000e\u0000\u00d0\u00d4\u0003,\u0016\u0000\u00d1"+
		"\u00d4\u0003.\u0017\u0000\u00d2\u00d4\u00030\u0018\u0000\u00d3\u00cb\u0001"+
		"\u0000\u0000\u0000\u00d3\u00cc\u0001\u0000\u0000\u0000\u00d3\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d3\u00ce\u0001\u0000\u0000\u0000\u00d3\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u0007\u0001"+
		"\u0000\u0000\u0000\u00d5\u00e0\u0003\u00a6S\u0000\u00d6\u00d7\u0003\n"+
		"\u0005\u0000\u00d7\u00d8\u0003\u0092I\u0000\u00d8\u00e1\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u00058\u0000\u0000\u00da\u00dc\u0003\u00a6S\u0000\u00db"+
		"\u00d9\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd"+
		"\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0"+
		"\u00d6\u0001\u0000\u0000\u0000\u00e0\u00dd\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e1\t\u0001\u0000\u0000\u0000\u00e2\u00ea"+
		"\u0005\'\u0000\u0000\u00e3\u00ea\u0005(\u0000\u0000\u00e4\u00ea\u0005"+
		")\u0000\u0000\u00e5\u00ea\u0005*\u0000\u0000\u00e6\u00ea\u0005+\u0000"+
		"\u0000\u00e7\u00ea\u0005,\u0000\u0000\u00e8\u00ea\u0005\"\u0000\u0000"+
		"\u00e9\u00e2\u0001\u0000\u0000\u0000\u00e9\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e4\u0001\u0000\u0000\u0000\u00e9\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e6\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea\u000b\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0005\u001f\u0000\u0000\u00ec\u00ed\u0003\u0090H\u0000\u00ed"+
		"\r\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u0011\u0000\u0000\u00ef\u000f"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f6\u0003\u0012\t\u0000\u00f1\u00f6\u0003"+
		"\u0014\n\u0000\u00f2\u00f6\u0003\u0016\u000b\u0000\u00f3\u00f6\u0003\u001a"+
		"\r\u0000\u00f4\u00f6\u0003\u0018\f\u0000\u00f5\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f1\u0001\u0000\u0000\u0000\u00f5\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u0011\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\u0012\u0000"+
		"\u0000\u00f8\u0013\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u0013\u0000"+
		"\u0000\u00fa\u0015\u0001\u0000\u0000\u0000\u00fb\u00fd\u0005\b\u0000\u0000"+
		"\u00fc\u00fe\u0003\u0092I\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fe\u0017\u0001\u0000\u0000\u0000\u00ff"+
		"\u0100\u0003\u00a2Q\u0000\u0100\u0019\u0001\u0000\u0000\u0000\u0101\u0107"+
		"\u0005\u0018\u0000\u0000\u0102\u0105\u0003V+\u0000\u0103\u0104\u0005\n"+
		"\u0000\u0000\u0104\u0106\u0003V+\u0000\u0105\u0103\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0108\u0001\u0000\u0000\u0000"+
		"\u0107\u0102\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000"+
		"\u0108\u001b\u0001\u0000\u0000\u0000\u0109\u010c\u0003\u001e\u000f\u0000"+
		"\u010a\u010c\u0003 \u0010\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b"+
		"\u010a\u0001\u0000\u0000\u0000\u010c\u001d\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0005\t\u0000\u0000\u010e\u010f\u0003(\u0014\u0000\u010f\u001f"+
		"\u0001\u0000\u0000\u0000\u0110\u011d\u0005\n\u0000\u0000\u0111\u0113\u0005"+
		"G\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000"+
		"\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000"+
		"\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000"+
		"\u0000\u0000\u0117\u011e\u0003*\u0015\u0000\u0118\u011a\u0005G\u0000\u0000"+
		"\u0119\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000"+
		"\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u0114\u0001\u0000\u0000\u0000"+
		"\u011d\u0119\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000"+
		"\u011f\u0126\u0005\t\u0000\u0000\u0120\u0127\u00054\u0000\u0000\u0121"+
		"\u0122\u0005?\u0000\u0000\u0122\u0123\u0003&\u0013\u0000\u0123\u0124\u0005"+
		"@\u0000\u0000\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0127\u0003&\u0013"+
		"\u0000\u0126\u0120\u0001\u0000\u0000\u0000\u0126\u0121\u0001\u0000\u0000"+
		"\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127!\u0001\u0000\u0000\u0000"+
		"\u0128\u012b\u0005L\u0000\u0000\u0129\u012a\u0005\u000b\u0000\u0000\u012a"+
		"\u012c\u0005L\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0001\u0000\u0000\u0000\u012c#\u0001\u0000\u0000\u0000\u012d\u0130\u0003"+
		"*\u0015\u0000\u012e\u012f\u0005\u000b\u0000\u0000\u012f\u0131\u0005L\u0000"+
		"\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000"+
		"\u0000\u0131%\u0001\u0000\u0000\u0000\u0132\u0137\u0003\"\u0011\u0000"+
		"\u0133\u0134\u0005E\u0000\u0000\u0134\u0136\u0003\"\u0011\u0000\u0135"+
		"\u0133\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137"+
		"\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138"+
		"\u013b\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a"+
		"\u013c\u0005E\u0000\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0001\u0000\u0000\u0000\u013c\'\u0001\u0000\u0000\u0000\u013d\u0142\u0003"+
		"$\u0012\u0000\u013e\u013f\u0005E\u0000\u0000\u013f\u0141\u0003$\u0012"+
		"\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000"+
		"\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000"+
		"\u0000\u0143)\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000"+
		"\u0145\u014a\u0005L\u0000\u0000\u0146\u0147\u0005G\u0000\u0000\u0147\u0149"+
		"\u0005L\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0149\u014c\u0001"+
		"\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001"+
		"\u0000\u0000\u0000\u014b+\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0005 \u0000\u0000\u014e\u0153\u0005L\u0000\u0000"+
		"\u014f\u0150\u0005E\u0000\u0000\u0150\u0152\u0005L\u0000\u0000\u0151\u014f"+
		"\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0151"+
		"\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154-\u0001"+
		"\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u0157\u0005"+
		"!\u0000\u0000\u0157\u015c\u0005L\u0000\u0000\u0158\u0159\u0005E\u0000"+
		"\u0000\u0159\u015b\u0005L\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000"+
		"\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000"+
		"\u015c\u015d\u0001\u0000\u0000\u0000\u015d/\u0001\u0000\u0000\u0000\u015e"+
		"\u015c\u0001\u0000\u0000\u0000\u015f\u0160\u0005\u001e\u0000\u0000\u0160"+
		"\u0163\u0003V+\u0000\u0161\u0162\u0005E\u0000\u0000\u0162\u0164\u0003"+
		"V+\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000"+
		"\u0000\u01641\u0001\u0000\u0000\u0000\u0165\u016e\u00034\u001a\u0000\u0166"+
		"\u016e\u00036\u001b\u0000\u0167\u016e\u00038\u001c\u0000\u0168\u016e\u0003"+
		":\u001d\u0000\u0169\u016e\u0003<\u001e\u0000\u016a\u016e\u0003D\"\u0000"+
		"\u016b\u016e\u0003P(\u0000\u016c\u016e\u0003R)\u0000\u016d\u0165\u0001"+
		"\u0000\u0000\u0000\u016d\u0166\u0001\u0000\u0000\u0000\u016d\u0167\u0001"+
		"\u0000\u0000\u0000\u016d\u0168\u0001\u0000\u0000\u0000\u016d\u0169\u0001"+
		"\u0000\u0000\u0000\u016d\u016a\u0001\u0000\u0000\u0000\u016d\u016b\u0001"+
		"\u0000\u0000\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016e3\u0001\u0000"+
		"\u0000\u0000\u016f\u0170\u0005\u0003\u0000\u0000\u0170\u0171\u0003V+\u0000"+
		"\u0171\u0172\u0005F\u0000\u0000\u0172\u017a\u0003B!\u0000\u0173\u0174"+
		"\u0005\u0004\u0000\u0000\u0174\u0175\u0003V+\u0000\u0175\u0176\u0005F"+
		"\u0000\u0000\u0176\u0177\u0003B!\u0000\u0177\u0179\u0001\u0000\u0000\u0000"+
		"\u0178\u0173\u0001\u0000\u0000\u0000\u0179\u017c\u0001\u0000\u0000\u0000"+
		"\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000"+
		"\u017b\u0180\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000"+
		"\u017d\u017e\u0005\u0005\u0000\u0000\u017e\u017f\u0005F\u0000\u0000\u017f"+
		"\u0181\u0003B!\u0000\u0180\u017d\u0001\u0000\u0000\u0000\u0180\u0181\u0001"+
		"\u0000\u0000\u0000\u01815\u0001\u0000\u0000\u0000\u0182\u0183\u0005\u0007"+
		"\u0000\u0000\u0183\u0184\u0003V+\u0000\u0184\u0185\u0005F\u0000\u0000"+
		"\u0185\u0189\u0003B!\u0000\u0186\u0187\u0005\u0005\u0000\u0000\u0187\u0188"+
		"\u0005F\u0000\u0000\u0188\u018a\u0003B!\u0000\u0189\u0186\u0001\u0000"+
		"\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a7\u0001\u0000\u0000"+
		"\u0000\u018b\u018c\u0005\u0006\u0000\u0000\u018c\u018d\u0003\u0090H\u0000"+
		"\u018d\u018e\u0005\f\u0000\u0000\u018e\u018f\u0003\u0092I\u0000\u018f"+
		"\u0190\u0005F\u0000\u0000\u0190\u0194\u0003B!\u0000\u0191\u0192\u0005"+
		"\u0005\u0000\u0000\u0192\u0193\u0005F\u0000\u0000\u0193\u0195\u0003B!"+
		"\u0000\u0194\u0191\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000"+
		"\u0000\u01959\u0001\u0000\u0000\u0000\u0196\u0197\u0005\u0015\u0000\u0000"+
		"\u0197\u0198\u0005F\u0000\u0000\u0198\u01ae\u0003B!\u0000\u0199\u019a"+
		"\u0003@ \u0000\u019a\u019b\u0005F\u0000\u0000\u019b\u019c\u0003B!\u0000"+
		"\u019c\u019e\u0001\u0000\u0000\u0000\u019d\u0199\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000"+
		"\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a2\u0005\u0005\u0000\u0000\u01a2\u01a3\u0005F\u0000\u0000\u01a3"+
		"\u01a5\u0003B!\u0000\u01a4\u01a1\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a9\u0001\u0000\u0000\u0000\u01a6\u01a7\u0005"+
		"\u0017\u0000\u0000\u01a7\u01a8\u0005F\u0000\u0000\u01a8\u01aa\u0003B!"+
		"\u0000\u01a9\u01a6\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000"+
		"\u0000\u01aa\u01af\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005\u0017\u0000"+
		"\u0000\u01ac\u01ad\u0005F\u0000\u0000\u01ad\u01af\u0003B!\u0000\u01ae"+
		"\u019d\u0001\u0000\u0000\u0000\u01ae\u01ab\u0001\u0000\u0000\u0000\u01af"+
		";\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005\u0014\u0000\u0000\u01b1\u01b6"+
		"\u0003>\u001f\u0000\u01b2\u01b3\u0005E\u0000\u0000\u01b3\u01b5\u0003>"+
		"\u001f\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b9\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b9\u01ba\u0005F\u0000\u0000\u01ba\u01bb\u0003B!\u0000"+
		"\u01bb=\u0001\u0000\u0000\u0000\u01bc\u01bf\u0003V+\u0000\u01bd\u01be"+
		"\u0005\u000b\u0000\u0000\u01be\u01c0\u0003j5\u0000\u01bf\u01bd\u0001\u0000"+
		"\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0?\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c7\u0005\u0016\u0000\u0000\u01c2\u01c5\u0003V+\u0000\u01c3"+
		"\u01c4\u0005\u000b\u0000\u0000\u01c4\u01c6\u0005L\u0000\u0000\u01c5\u01c3"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c2\u0001\u0000\u0000\u0000\u01c7\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c8A\u0001\u0000\u0000\u0000\u01c9\u01d6\u0003"+
		"\u0004\u0002\u0000\u01ca\u01cc\u0005M\u0000\u0000\u01cb\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000"+
		"\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d1\u0001\u0000"+
		"\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0\u01d2\u0003\u0002"+
		"\u0001\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000\u01d5\u01c9\u0001\u0000"+
		"\u0000\u0000\u01d5\u01cd\u0001\u0000\u0000\u0000\u01d6C\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d8\u0005\u0001\u0000\u0000\u01d8\u01d9\u0005L\u0000\u0000"+
		"\u01d9\u01dc\u0003F#\u0000\u01da\u01db\u00051\u0000\u0000\u01db\u01dd"+
		"\u0003V+\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000"+
		"\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01df\u0005F\u0000"+
		"\u0000\u01df\u01e0\u0003B!\u0000\u01e0E\u0001\u0000\u0000\u0000\u01e1"+
		"\u01e3\u0005?\u0000\u0000\u01e2\u01e4\u0003H$\u0000\u01e3\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e6\u0005@\u0000\u0000\u01e6G\u0001\u0000\u0000"+
		"\u0000\u01e7\u01ec\u0003J%\u0000\u01e8\u01e9\u0005E\u0000\u0000\u01e9"+
		"\u01eb\u0003J%\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb\u01ee\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001"+
		"\u0000\u0000\u0000\u01ed\u01f0\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ef\u01f1\u0005E\u0000\u0000\u01f0\u01ef\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u0203\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f4\u00054\u0000\u0000\u01f3\u01f5\u0003N\'\u0000"+
		"\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f5\u01fa\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005E\u0000\u0000\u01f7"+
		"\u01f9\u0003J%\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f9\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fb\u01ff\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fe\u0005E\u0000\u0000\u01fe\u0200\u0003L&"+
		"\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000"+
		"\u0000\u0200\u0203\u0001\u0000\u0000\u0000\u0201\u0203\u0003L&\u0000\u0202"+
		"\u01e7\u0001\u0000\u0000\u0000\u0202\u01f2\u0001\u0000\u0000\u0000\u0202"+
		"\u0201\u0001\u0000\u0000\u0000\u0203I\u0001\u0000\u0000\u0000\u0204\u0207"+
		"\u0003N\'\u0000\u0205\u0206\u00058\u0000\u0000\u0206\u0208\u0003V+\u0000"+
		"\u0207\u0205\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000"+
		"\u0208K\u0001\u0000\u0000\u0000\u0209\u020a\u0005$\u0000\u0000\u020a\u020b"+
		"\u0003N\'\u0000\u020bM\u0001\u0000\u0000\u0000\u020c\u020f\u0005L\u0000"+
		"\u0000\u020d\u020e\u0005F\u0000\u0000\u020e\u0210\u0003V+\u0000\u020f"+
		"\u020d\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210"+
		"O\u0001\u0000\u0000\u0000\u0211\u0212\u0005\u0002\u0000\u0000\u0212\u0218"+
		"\u0005L\u0000\u0000\u0213\u0215\u0005?\u0000\u0000\u0214\u0216\u0003\u0098"+
		"L\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000"+
		"\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0219\u0005@\u0000\u0000"+
		"\u0218\u0213\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000"+
		"\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021b\u0005F\u0000\u0000\u021b"+
		"\u021c\u0003B!\u0000\u021cQ\u0001\u0000\u0000\u0000\u021d\u021f\u0003"+
		"T*\u0000\u021e\u021d\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000"+
		"\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000"+
		"\u0000\u0221\u0224\u0001\u0000\u0000\u0000\u0222\u0225\u0003P(\u0000\u0223"+
		"\u0225\u0003D\"\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0224\u0223"+
		"\u0001\u0000\u0000\u0000\u0225S\u0001\u0000\u0000\u0000\u0226\u0227\u0005"+
		"7\u0000\u0000\u0227\u022d\u0003*\u0015\u0000\u0228\u022a\u0005?\u0000"+
		"\u0000\u0229\u022b\u0003\u0098L\u0000\u022a\u0229\u0001\u0000\u0000\u0000"+
		"\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000"+
		"\u022c\u022e\u0005@\u0000\u0000\u022d\u0228\u0001\u0000\u0000\u0000\u022d"+
		"\u022e\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f"+
		"\u0230\u0005M\u0000\u0000\u0230U\u0001\u0000\u0000\u0000\u0231\u0237\u0003"+
		"^/\u0000\u0232\u0233\u0005\u0003\u0000\u0000\u0233\u0234\u0003^/\u0000"+
		"\u0234\u0235\u0005\u0005\u0000\u0000\u0235\u0236\u0003V+\u0000\u0236\u0238"+
		"\u0001\u0000\u0000\u0000\u0237\u0232\u0001\u0000\u0000\u0000\u0237\u0238"+
		"\u0001\u0000\u0000\u0000\u0238\u023b\u0001\u0000\u0000\u0000\u0239\u023b"+
		"\u0003Z-\u0000\u023a\u0231\u0001\u0000\u0000\u0000\u023a\u0239\u0001\u0000"+
		"\u0000\u0000\u023bW\u0001\u0000\u0000\u0000\u023c\u023f\u0003^/\u0000"+
		"\u023d\u023f\u0003\\.\u0000\u023e\u023c\u0001\u0000\u0000\u0000\u023e"+
		"\u023d\u0001\u0000\u0000\u0000\u023fY\u0001\u0000\u0000\u0000\u0240\u0242"+
		"\u0005\u0019\u0000\u0000\u0241\u0243\u0003\u00a8T\u0000\u0242\u0241\u0001"+
		"\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0244\u0001"+
		"\u0000\u0000\u0000\u0244\u0245\u0005F\u0000\u0000\u0245\u0246\u0003V+"+
		"\u0000\u0246[\u0001\u0000\u0000\u0000\u0247\u0249\u0005\u0019\u0000\u0000"+
		"\u0248\u024a\u0003\u00a8T\u0000\u0249\u0248\u0001\u0000\u0000\u0000\u0249"+
		"\u024a\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b"+
		"\u024c\u0005F\u0000\u0000\u024c\u024d\u0003X,\u0000\u024d]\u0001\u0000"+
		"\u0000\u0000\u024e\u0253\u0003`0\u0000\u024f\u0250\u0005\u000f\u0000\u0000"+
		"\u0250\u0252\u0003`0\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0252\u0255"+
		"\u0001\u0000\u0000\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0253\u0254"+
		"\u0001\u0000\u0000\u0000\u0254_\u0001\u0000\u0000\u0000\u0255\u0253\u0001"+
		"\u0000\u0000\u0000\u0256\u025b\u0003b1\u0000\u0257\u0258\u0005\u000e\u0000"+
		"\u0000\u0258\u025a\u0003b1\u0000\u0259\u0257\u0001\u0000\u0000\u0000\u025a"+
		"\u025d\u0001\u0000\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025b"+
		"\u025c\u0001\u0000\u0000\u0000\u025ca\u0001\u0000\u0000\u0000\u025d\u025b"+
		"\u0001\u0000\u0000\u0000\u025e\u025f\u0005\u0010\u0000\u0000\u025f\u0262"+
		"\u0003b1\u0000\u0260\u0262\u0003d2\u0000\u0261\u025e\u0001\u0000\u0000"+
		"\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0262c\u0001\u0000\u0000\u0000"+
		"\u0263\u0269\u0003j5\u0000\u0264\u0265\u0003f3\u0000\u0265\u0266\u0003"+
		"j5\u0000\u0266\u0268\u0001\u0000\u0000\u0000\u0267\u0264\u0001\u0000\u0000"+
		"\u0000\u0268\u026b\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000\u0000"+
		"\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026ae\u0001\u0000\u0000\u0000"+
		"\u026b\u0269\u0001\u0000\u0000\u0000\u026c\u0279\u0005=\u0000\u0000\u026d"+
		"\u0279\u0005>\u0000\u0000\u026e\u0279\u0005-\u0000\u0000\u026f\u0279\u0005"+
		"0\u0000\u0000\u0270\u0279\u0005/\u0000\u0000\u0271\u0279\u0005.\u0000"+
		"\u0000\u0272\u0279\u0005\f\u0000\u0000\u0273\u0274\u0005\u0010\u0000\u0000"+
		"\u0274\u0279\u0005\f\u0000\u0000\u0275\u0279\u0005\r\u0000\u0000\u0276"+
		"\u0277\u0005\r\u0000\u0000\u0277\u0279\u0005\u0010\u0000\u0000\u0278\u026c"+
		"\u0001\u0000\u0000\u0000\u0278\u026d\u0001\u0000\u0000\u0000\u0278\u026e"+
		"\u0001\u0000\u0000\u0000\u0278\u026f\u0001\u0000\u0000\u0000\u0278\u0270"+
		"\u0001\u0000\u0000\u0000\u0278\u0271\u0001\u0000\u0000\u0000\u0278\u0272"+
		"\u0001\u0000\u0000\u0000\u0278\u0273\u0001\u0000\u0000\u0000\u0278\u0275"+
		"\u0001\u0000\u0000\u0000\u0278\u0276\u0001\u0000\u0000\u0000\u0279g\u0001"+
		"\u0000\u0000\u0000\u027a\u027b\u00054\u0000\u0000\u027b\u027c\u0003j5"+
		"\u0000\u027ci\u0001\u0000\u0000\u0000\u027d\u0282\u0003l6\u0000\u027e"+
		"\u027f\u0005:\u0000\u0000\u027f\u0281\u0003l6\u0000\u0280\u027e\u0001"+
		"\u0000\u0000\u0000\u0281\u0284\u0001\u0000\u0000\u0000\u0282\u0280\u0001"+
		"\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283k\u0001\u0000"+
		"\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0285\u028a\u0003n7\u0000"+
		"\u0286\u0287\u0005;\u0000\u0000\u0287\u0289\u0003n7\u0000\u0288\u0286"+
		"\u0001\u0000\u0000\u0000\u0289\u028c\u0001\u0000\u0000\u0000\u028a\u0288"+
		"\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028bm\u0001"+
		"\u0000\u0000\u0000\u028c\u028a\u0001\u0000\u0000\u0000\u028d\u0292\u0003"+
		"p8\u0000\u028e\u028f\u00059\u0000\u0000\u028f\u0291\u0003p8\u0000\u0290"+
		"\u028e\u0001\u0000\u0000\u0000\u0291\u0294\u0001\u0000\u0000\u0000\u0292"+
		"\u0290\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293"+
		"o\u0001\u0000\u0000\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0295\u0299"+
		"\u0003t:\u0000\u0296\u0298\u0003r9\u0000\u0297\u0296\u0001\u0000\u0000"+
		"\u0000\u0298\u029b\u0001\u0000\u0000\u0000\u0299\u0297\u0001\u0000\u0000"+
		"\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029aq\u0001\u0000\u0000\u0000"+
		"\u029b\u0299\u0001\u0000\u0000\u0000\u029c\u029d\u0007\u0000\u0000\u0000"+
		"\u029d\u029e\u0003t:\u0000\u029es\u0001\u0000\u0000\u0000\u029f\u02a3"+
		"\u0003x<\u0000\u02a0\u02a2\u0003v;\u0000\u02a1\u02a0\u0001\u0000\u0000"+
		"\u0000\u02a2\u02a5\u0001\u0000\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000"+
		"\u0000\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4u\u0001\u0000\u0000\u0000"+
		"\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a6\u02a7\u0007\u0001\u0000\u0000"+
		"\u02a7\u02a8\u0003x<\u0000\u02a8w\u0001\u0000\u0000\u0000\u02a9\u02ad"+
		"\u0003|>\u0000\u02aa\u02ac\u0003z=\u0000\u02ab\u02aa\u0001\u0000\u0000"+
		"\u0000\u02ac\u02af\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000"+
		"\u0000\u02ad\u02ae\u0001\u0000\u0000\u0000\u02aey\u0001\u0000\u0000\u0000"+
		"\u02af\u02ad\u0001\u0000\u0000\u0000\u02b0\u02b1\u0007\u0002\u0000\u0000"+
		"\u02b1\u02b2\u0003|>\u0000\u02b2{\u0001\u0000\u0000\u0000\u02b3\u02b4"+
		"\u0007\u0003\u0000\u0000\u02b4\u02b7\u0003|>\u0000\u02b5\u02b7\u0003~"+
		"?\u0000\u02b6\u02b3\u0001\u0000\u0000\u0000\u02b6\u02b5\u0001\u0000\u0000"+
		"\u0000\u02b7}\u0001\u0000\u0000\u0000\u02b8\u02bb\u0003\u0080@\u0000\u02b9"+
		"\u02ba\u0005$\u0000\u0000\u02ba\u02bc\u0003|>\u0000\u02bb\u02b9\u0001"+
		"\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc\u007f\u0001"+
		"\u0000\u0000\u0000\u02bd\u02c1\u0003\u0082A\u0000\u02be\u02c0\u0003\u0088"+
		"D\u0000\u02bf\u02be\u0001\u0000\u0000\u0000\u02c0\u02c3\u0001\u0000\u0000"+
		"\u0000\u02c1\u02bf\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000"+
		"\u0000\u02c2\u0081\u0001\u0000\u0000\u0000\u02c3\u02c1\u0001\u0000\u0000"+
		"\u0000\u02c4\u02c7\u0005?\u0000\u0000\u02c5\u02c8\u0003\u00a2Q\u0000\u02c6"+
		"\u02c8\u0003\u0084B\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c7\u02c6"+
		"\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8\u02c9"+
		"\u0001\u0000\u0000\u0000\u02c9\u02e0\u0005@\u0000\u0000\u02ca\u02cc\u0005"+
		"A\u0000\u0000\u02cb\u02cd\u0003\u0084B\u0000\u02cc\u02cb\u0001\u0000\u0000"+
		"\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000"+
		"\u0000\u02ce\u02e0\u0005B\u0000\u0000\u02cf\u02d1\u0005C\u0000\u0000\u02d0"+
		"\u02d2\u0003\u0094J\u0000\u02d1\u02d0\u0001\u0000\u0000\u0000\u02d1\u02d2"+
		"\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3\u02e0"+
		"\u0005D\u0000\u0000\u02d4\u02e0\u0005L\u0000\u0000\u02d5\u02e0\u0005K"+
		"\u0000\u0000\u02d6\u02d8\u0005J\u0000\u0000\u02d7\u02d6\u0001\u0000\u0000"+
		"\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d9\u02d7\u0001\u0000\u0000"+
		"\u0000\u02d9\u02da\u0001\u0000\u0000\u0000\u02da\u02e0\u0001\u0000\u0000"+
		"\u0000\u02db\u02e0\u0005I\u0000\u0000\u02dc\u02e0\u0005\u001c\u0000\u0000"+
		"\u02dd\u02e0\u0005\u001a\u0000\u0000\u02de\u02e0\u0005\u001b\u0000\u0000"+
		"\u02df\u02c4\u0001\u0000\u0000\u0000\u02df\u02ca\u0001\u0000\u0000\u0000"+
		"\u02df\u02cf\u0001\u0000\u0000\u0000\u02df\u02d4\u0001\u0000\u0000\u0000"+
		"\u02df\u02d5\u0001\u0000\u0000\u0000\u02df\u02d7\u0001\u0000\u0000\u0000"+
		"\u02df\u02db\u0001\u0000\u0000\u0000\u02df\u02dc\u0001\u0000\u0000\u0000"+
		"\u02df\u02dd\u0001\u0000\u0000\u0000\u02df\u02de\u0001\u0000\u0000\u0000"+
		"\u02e0\u0083\u0001\u0000\u0000\u0000\u02e1\u02ed\u0003\u0086C\u0000\u02e2"+
		"\u02ee\u0003\u009eO\u0000\u02e3\u02e4\u0005E\u0000\u0000\u02e4\u02e6\u0003"+
		"\u0086C\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e6\u02e9\u0001\u0000"+
		"\u0000\u0000\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000"+
		"\u0000\u0000\u02e8\u02eb\u0001\u0000\u0000\u0000\u02e9\u02e7\u0001\u0000"+
		"\u0000\u0000\u02ea\u02ec\u0005E\u0000\u0000\u02eb\u02ea\u0001\u0000\u0000"+
		"\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec\u02ee\u0001\u0000\u0000"+
		"\u0000\u02ed\u02e2\u0001\u0000\u0000\u0000\u02ed\u02e7\u0001\u0000\u0000"+
		"\u0000\u02ee\u0085\u0001\u0000\u0000\u0000\u02ef\u02f2\u0003V+\u0000\u02f0"+
		"\u02f2\u0003h4\u0000\u02f1\u02ef\u0001\u0000\u0000\u0000\u02f1\u02f0\u0001"+
		"\u0000\u0000\u0000\u02f2\u0087\u0001\u0000\u0000\u0000\u02f3\u02f5\u0005"+
		"?\u0000\u0000\u02f4\u02f6\u0003\u0098L\u0000\u02f5\u02f4\u0001\u0000\u0000"+
		"\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000"+
		"\u0000\u02f7\u02ff\u0005@\u0000\u0000\u02f8\u02f9\u0005A\u0000\u0000\u02f9"+
		"\u02fa\u0003\u008aE\u0000\u02fa\u02fb\u0005B\u0000\u0000\u02fb\u02ff\u0001"+
		"\u0000\u0000\u0000\u02fc\u02fd\u0005G\u0000\u0000\u02fd\u02ff\u0005L\u0000"+
		"\u0000\u02fe\u02f3\u0001\u0000\u0000\u0000\u02fe\u02f8\u0001\u0000\u0000"+
		"\u0000\u02fe\u02fc\u0001\u0000\u0000\u0000\u02ff\u0089\u0001\u0000\u0000"+
		"\u0000\u0300\u0305\u0003\u008cF\u0000\u0301\u0302\u0005E\u0000\u0000\u0302"+
		"\u0304\u0003\u008cF\u0000\u0303\u0301\u0001\u0000\u0000\u0000\u0304\u0307"+
		"\u0001\u0000\u0000\u0000\u0305\u0303\u0001\u0000\u0000\u0000\u0305\u0306"+
		"\u0001\u0000\u0000\u0000\u0306\u0309\u0001\u0000\u0000\u0000\u0307\u0305"+
		"\u0001\u0000\u0000\u0000\u0308\u030a\u0005E\u0000\u0000\u0309\u0308\u0001"+
		"\u0000\u0000\u0000\u0309\u030a\u0001\u0000\u0000\u0000\u030a\u008b\u0001"+
		"\u0000\u0000\u0000\u030b\u0317\u0003V+\u0000\u030c\u030e\u0003V+\u0000"+
		"\u030d\u030c\u0001\u0000\u0000\u0000\u030d\u030e\u0001\u0000\u0000\u0000"+
		"\u030e\u030f\u0001\u0000\u0000\u0000\u030f\u0311\u0005F\u0000\u0000\u0310"+
		"\u0312\u0003V+\u0000\u0311\u0310\u0001\u0000\u0000\u0000\u0311\u0312\u0001"+
		"\u0000\u0000\u0000\u0312\u0314\u0001\u0000\u0000\u0000\u0313\u0315\u0003"+
		"\u008eG\u0000\u0314\u0313\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000"+
		"\u0000\u0000\u0315\u0317\u0001\u0000\u0000\u0000\u0316\u030b\u0001\u0000"+
		"\u0000\u0000\u0316\u030d\u0001\u0000\u0000\u0000\u0317\u008d\u0001\u0000"+
		"\u0000\u0000\u0318\u031a\u0005F\u0000\u0000\u0319\u031b\u0003V+\u0000"+
		"\u031a\u0319\u0001\u0000\u0000\u0000\u031a\u031b\u0001\u0000\u0000\u0000"+
		"\u031b\u008f\u0001\u0000\u0000\u0000\u031c\u031f\u0003j5\u0000\u031d\u031f"+
		"\u0003h4\u0000\u031e\u031c\u0001\u0000\u0000\u0000\u031e\u031d\u0001\u0000"+
		"\u0000\u0000\u031f\u0327\u0001\u0000\u0000\u0000\u0320\u0323\u0005E\u0000"+
		"\u0000\u0321\u0324\u0003j5\u0000\u0322\u0324\u0003h4\u0000\u0323\u0321"+
		"\u0001\u0000\u0000\u0000\u0323\u0322\u0001\u0000\u0000\u0000\u0324\u0326"+
		"\u0001\u0000\u0000\u0000\u0325\u0320\u0001\u0000\u0000\u0000\u0326\u0329"+
		"\u0001\u0000\u0000\u0000\u0327\u0325\u0001\u0000\u0000\u0000\u0327\u0328"+
		"\u0001\u0000\u0000\u0000\u0328\u032b\u0001\u0000\u0000\u0000\u0329\u0327"+
		"\u0001\u0000\u0000\u0000\u032a\u032c\u0005E\u0000\u0000\u032b\u032a\u0001"+
		"\u0000\u0000\u0000\u032b\u032c\u0001\u0000\u0000\u0000\u032c\u0091\u0001"+
		"\u0000\u0000\u0000\u032d\u0332\u0003V+\u0000\u032e\u032f\u0005E\u0000"+
		"\u0000\u032f\u0331\u0003V+\u0000\u0330\u032e\u0001\u0000\u0000\u0000\u0331"+
		"\u0334\u0001\u0000\u0000\u0000\u0332\u0330\u0001\u0000\u0000\u0000\u0332"+
		"\u0333\u0001\u0000\u0000\u0000\u0333\u0336\u0001\u0000\u0000\u0000\u0334"+
		"\u0332\u0001\u0000\u0000\u0000\u0335\u0337\u0005E\u0000\u0000\u0336\u0335"+
		"\u0001\u0000\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337\u0093"+
		"\u0001\u0000\u0000\u0000\u0338\u033a\u0005M\u0000\u0000\u0339\u0338\u0001"+
		"\u0000\u0000\u0000\u033a\u033d\u0001\u0000\u0000\u0000\u033b\u0339\u0001"+
		"\u0000\u0000\u0000\u033b\u033c\u0001\u0000\u0000\u0000\u033c\u039e\u0001"+
		"\u0000\u0000\u0000\u033d\u033b\u0001\u0000\u0000\u0000\u033e\u033f\u0003"+
		"V+\u0000\u033f\u0340\u0005F\u0000\u0000\u0340\u0341\u0003V+\u0000\u0341"+
		"\u0345\u0001\u0000\u0000\u0000\u0342\u0343\u0005$\u0000\u0000\u0343\u0345"+
		"\u0003j5\u0000\u0344\u033e\u0001\u0000\u0000\u0000\u0344\u0342\u0001\u0000"+
		"\u0000\u0000\u0345\u0349\u0001\u0000\u0000\u0000\u0346\u0348\u0005M\u0000"+
		"\u0000\u0347\u0346\u0001\u0000\u0000\u0000\u0348\u034b\u0001\u0000\u0000"+
		"\u0000\u0349\u0347\u0001\u0000\u0000\u0000\u0349\u034a\u0001\u0000\u0000"+
		"\u0000\u034a\u0370\u0001\u0000\u0000\u0000\u034b\u0349\u0001\u0000\u0000"+
		"\u0000\u034c\u0371\u0003\u009eO\u0000\u034d\u0351\u0005E\u0000\u0000\u034e"+
		"\u0350\u0005M\u0000\u0000\u034f\u034e\u0001\u0000\u0000\u0000\u0350\u0353"+
		"\u0001\u0000\u0000\u0000\u0351\u034f\u0001\u0000\u0000\u0000\u0351\u0352"+
		"\u0001\u0000\u0000\u0000\u0352\u035a\u0001\u0000\u0000\u0000\u0353\u0351"+
		"\u0001\u0000\u0000\u0000\u0354\u0355\u0003V+\u0000\u0355\u0356\u0005F"+
		"\u0000\u0000\u0356\u0357\u0003V+\u0000\u0357\u035b\u0001\u0000\u0000\u0000"+
		"\u0358\u0359\u0005$\u0000\u0000\u0359\u035b\u0003j5\u0000\u035a\u0354"+
		"\u0001\u0000\u0000\u0000\u035a\u0358\u0001\u0000\u0000\u0000\u035b\u035f"+
		"\u0001\u0000\u0000\u0000\u035c\u035e\u0005M\u0000\u0000\u035d\u035c\u0001"+
		"\u0000\u0000\u0000\u035e\u0361\u0001\u0000\u0000\u0000\u035f\u035d\u0001"+
		"\u0000\u0000\u0000\u035f\u0360\u0001\u0000\u0000\u0000\u0360\u0363\u0001"+
		"\u0000\u0000\u0000\u0361\u035f\u0001\u0000\u0000\u0000\u0362\u034d\u0001"+
		"\u0000\u0000\u0000\u0363\u0366\u0001\u0000\u0000\u0000\u0364\u0362\u0001"+
		"\u0000\u0000\u0000\u0364\u0365\u0001\u0000\u0000\u0000\u0365\u0368\u0001"+
		"\u0000\u0000\u0000\u0366\u0364\u0001\u0000\u0000\u0000\u0367\u0369\u0005"+
		"E\u0000\u0000\u0368\u0367\u0001\u0000\u0000\u0000\u0368\u0369\u0001\u0000"+
		"\u0000\u0000\u0369\u036d\u0001\u0000\u0000\u0000\u036a\u036c\u0005M\u0000"+
		"\u0000\u036b\u036a\u0001\u0000\u0000\u0000\u036c\u036f\u0001\u0000\u0000"+
		"\u0000\u036d\u036b\u0001\u0000\u0000\u0000\u036d\u036e\u0001\u0000\u0000"+
		"\u0000\u036e\u0371\u0001\u0000\u0000\u0000\u036f\u036d\u0001\u0000\u0000"+
		"\u0000\u0370\u034c\u0001\u0000\u0000\u0000\u0370\u0364\u0001\u0000\u0000"+
		"\u0000\u0371\u039f\u0001\u0000\u0000\u0000\u0372\u0375\u0003V+\u0000\u0373"+
		"\u0375\u0003h4\u0000\u0374\u0372\u0001\u0000\u0000\u0000\u0374\u0373\u0001"+
		"\u0000\u0000\u0000\u0375\u0379\u0001\u0000\u0000\u0000\u0376\u0378\u0005"+
		"M\u0000\u0000\u0377\u0376\u0001\u0000\u0000\u0000\u0378\u037b\u0001\u0000"+
		"\u0000\u0000\u0379\u0377\u0001\u0000\u0000\u0000\u0379\u037a\u0001\u0000"+
		"\u0000\u0000\u037a\u039c\u0001\u0000\u0000\u0000\u037b\u0379\u0001\u0000"+
		"\u0000\u0000\u037c\u039d\u0003\u009eO\u0000\u037d\u0381\u0005E\u0000\u0000"+
		"\u037e\u0380\u0005M\u0000\u0000\u037f\u037e\u0001\u0000\u0000\u0000\u0380"+
		"\u0383\u0001\u0000\u0000\u0000\u0381\u037f\u0001\u0000\u0000\u0000\u0381"+
		"\u0382\u0001\u0000\u0000\u0000\u0382\u0386\u0001\u0000\u0000\u0000\u0383"+
		"\u0381\u0001\u0000\u0000\u0000\u0384\u0387\u0003V+\u0000\u0385\u0387\u0003"+
		"h4\u0000\u0386\u0384\u0001\u0000\u0000\u0000\u0386\u0385\u0001\u0000\u0000"+
		"\u0000\u0387\u038b\u0001\u0000\u0000\u0000\u0388\u038a\u0005M\u0000\u0000"+
		"\u0389\u0388\u0001\u0000\u0000\u0000\u038a\u038d\u0001\u0000\u0000\u0000"+
		"\u038b\u0389\u0001\u0000\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000"+
		"\u038c\u038f\u0001\u0000\u0000\u0000\u038d\u038b\u0001\u0000\u0000\u0000"+
		"\u038e\u037d\u0001\u0000\u0000\u0000\u038f\u0392\u0001\u0000\u0000\u0000"+
		"\u0390\u038e\u0001\u0000\u0000\u0000\u0390\u0391\u0001\u0000\u0000\u0000"+
		"\u0391\u0394\u0001\u0000\u0000\u0000\u0392\u0390\u0001\u0000\u0000\u0000"+
		"\u0393\u0395\u0005E\u0000\u0000\u0394\u0393\u0001\u0000\u0000\u0000\u0394"+
		"\u0395\u0001\u0000\u0000\u0000\u0395\u0399\u0001\u0000\u0000\u0000\u0396"+
		"\u0398\u0005M\u0000\u0000\u0397\u0396\u0001\u0000\u0000\u0000\u0398\u039b"+
		"\u0001\u0000\u0000\u0000\u0399\u0397\u0001\u0000\u0000\u0000\u0399\u039a"+
		"\u0001\u0000\u0000\u0000\u039a\u039d\u0001\u0000\u0000\u0000\u039b\u0399"+
		"\u0001\u0000\u0000\u0000\u039c\u037c\u0001\u0000\u0000\u0000\u039c\u0390"+
		"\u0001\u0000\u0000\u0000\u039d\u039f\u0001\u0000\u0000\u0000\u039e\u0344"+
		"\u0001\u0000\u0000\u0000\u039e\u0374\u0001\u0000\u0000\u0000\u039f\u0095"+
		"\u0001\u0000\u0000\u0000\u03a0\u03a3\u0003P(\u0000\u03a1\u03a3\u0003D"+
		"\"\u0000\u03a2\u03a0\u0001\u0000\u0000\u0000\u03a2\u03a1\u0001\u0000\u0000"+
		"\u0000\u03a3\u0097\u0001\u0000\u0000\u0000\u03a4\u03a9\u0003\u009aM\u0000"+
		"\u03a5\u03a6\u0005E\u0000\u0000\u03a6\u03a8\u0003\u009aM\u0000\u03a7\u03a5"+
		"\u0001\u0000\u0000\u0000\u03a8\u03ab\u0001\u0000\u0000\u0000\u03a9\u03a7"+
		"\u0001\u0000\u0000\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000\u03aa\u03ad"+
		"\u0001\u0000\u0000\u0000\u03ab\u03a9\u0001\u0000\u0000\u0000\u03ac\u03ae"+
		"\u0005E\u0000\u0000\u03ad\u03ac\u0001\u0000\u0000\u0000\u03ad\u03ae\u0001"+
		"\u0000\u0000\u0000\u03ae\u0099\u0001\u0000\u0000\u0000\u03af\u03b1\u0003"+
		"V+\u0000\u03b0\u03b2\u0003\u009eO\u0000\u03b1\u03b0\u0001\u0000\u0000"+
		"\u0000\u03b1\u03b2\u0001\u0000\u0000\u0000\u03b2\u03bc\u0001\u0000\u0000"+
		"\u0000\u03b3\u03b4\u0003V+\u0000\u03b4\u03b5\u00058\u0000\u0000\u03b5"+
		"\u03b6\u0003V+\u0000\u03b6\u03bc\u0001\u0000\u0000\u0000\u03b7\u03b8\u0005"+
		"$\u0000\u0000\u03b8\u03bc\u0003V+\u0000\u03b9\u03ba\u00054\u0000\u0000"+
		"\u03ba\u03bc\u0003V+\u0000\u03bb\u03af\u0001\u0000\u0000\u0000\u03bb\u03b3"+
		"\u0001\u0000\u0000\u0000\u03bb\u03b7\u0001\u0000\u0000\u0000\u03bb\u03b9"+
		"\u0001\u0000\u0000\u0000\u03bc\u009b\u0001\u0000\u0000\u0000\u03bd\u03c0"+
		"\u0003\u009eO\u0000\u03be\u03c0\u0003\u00a0P\u0000\u03bf\u03bd\u0001\u0000"+
		"\u0000\u0000\u03bf\u03be\u0001\u0000\u0000\u0000\u03c0\u009d\u0001\u0000"+
		"\u0000\u0000\u03c1\u03c2\u0005\u0006\u0000\u0000\u03c2\u03c3\u0003\u0090"+
		"H\u0000\u03c3\u03c4\u0005\f\u0000\u0000\u03c4\u03c6\u0003^/\u0000\u03c5"+
		"\u03c7\u0003\u009cN\u0000\u03c6\u03c5\u0001\u0000\u0000\u0000\u03c6\u03c7"+
		"\u0001\u0000\u0000\u0000\u03c7\u009f\u0001\u0000\u0000\u0000\u03c8\u03c9"+
		"\u0005\u0003\u0000\u0000\u03c9\u03cb\u0003X,\u0000\u03ca\u03cc\u0003\u009c"+
		"N\u0000\u03cb\u03ca\u0001\u0000\u0000\u0000\u03cb\u03cc\u0001\u0000\u0000"+
		"\u0000\u03cc\u00a1\u0001\u0000\u0000\u0000\u03cd\u03cf\u0005\u001d\u0000"+
		"\u0000\u03ce\u03d0\u0003\u00a4R\u0000\u03cf\u03ce\u0001\u0000\u0000\u0000"+
		"\u03cf\u03d0\u0001\u0000\u0000\u0000\u03d0\u00a3\u0001\u0000\u0000\u0000"+
		"\u03d1\u03d2\u0005\n\u0000\u0000\u03d2\u03d5\u0003V+\u0000\u03d3\u03d5"+
		"\u0003\u0092I\u0000\u03d4\u03d1\u0001\u0000\u0000\u0000\u03d4\u03d3\u0001"+
		"\u0000\u0000\u0000\u03d5\u00a5\u0001\u0000\u0000\u0000\u03d6\u03d9\u0003"+
		"V+\u0000\u03d7\u03d9\u0003h4\u0000\u03d8\u03d6\u0001\u0000\u0000\u0000"+
		"\u03d8\u03d7\u0001\u0000\u0000\u0000\u03d9\u03e1\u0001\u0000\u0000\u0000"+
		"\u03da\u03dd\u0005E\u0000\u0000\u03db\u03de\u0003V+\u0000\u03dc\u03de"+
		"\u0003h4\u0000\u03dd\u03db\u0001\u0000\u0000\u0000\u03dd\u03dc\u0001\u0000"+
		"\u0000\u0000\u03de\u03e0\u0001\u0000\u0000\u0000\u03df\u03da\u0001\u0000"+
		"\u0000\u0000\u03e0\u03e3\u0001\u0000\u0000\u0000\u03e1\u03df\u0001\u0000"+
		"\u0000\u0000\u03e1\u03e2\u0001\u0000\u0000\u0000\u03e2\u03e5\u0001\u0000"+
		"\u0000\u0000\u03e3\u03e1\u0001\u0000\u0000\u0000\u03e4\u03e6\u0005E\u0000"+
		"\u0000\u03e5\u03e4\u0001\u0000\u0000\u0000\u03e5\u03e6\u0001\u0000\u0000"+
		"\u0000\u03e6\u00a7\u0001\u0000\u0000\u0000\u03e7\u03ec\u0003\u00aaU\u0000"+
		"\u03e8\u03e9\u0005E\u0000\u0000\u03e9\u03eb\u0003\u00aaU\u0000\u03ea\u03e8"+
		"\u0001\u0000\u0000\u0000\u03eb\u03ee\u0001\u0000\u0000\u0000\u03ec\u03ea"+
		"\u0001\u0000\u0000\u0000\u03ec\u03ed\u0001\u0000\u0000\u0000\u03ed\u03f0"+
		"\u0001\u0000\u0000\u0000\u03ee\u03ec\u0001\u0000\u0000\u0000\u03ef\u03f1"+
		"\u0005E\u0000\u0000\u03f0\u03ef\u0001\u0000\u0000\u0000\u03f0\u03f1\u0001"+
		"\u0000\u0000\u0000\u03f1\u0403\u0001\u0000\u0000\u0000\u03f2\u03f4\u0005"+
		"4\u0000\u0000\u03f3\u03f5\u0003\u00aeW\u0000\u03f4\u03f3\u0001\u0000\u0000"+
		"\u0000\u03f4\u03f5\u0001\u0000\u0000\u0000\u03f5\u03fa\u0001\u0000\u0000"+
		"\u0000\u03f6\u03f7\u0005E\u0000\u0000\u03f7\u03f9\u0003\u00aaU\u0000\u03f8"+
		"\u03f6\u0001\u0000\u0000\u0000\u03f9\u03fc\u0001\u0000\u0000\u0000\u03fa"+
		"\u03f8\u0001\u0000\u0000\u0000\u03fa\u03fb\u0001\u0000\u0000\u0000\u03fb"+
		"\u03ff\u0001\u0000\u0000\u0000\u03fc\u03fa\u0001\u0000\u0000\u0000\u03fd"+
		"\u03fe\u0005E\u0000\u0000\u03fe\u0400\u0003\u00acV\u0000\u03ff\u03fd\u0001"+
		"\u0000\u0000\u0000\u03ff\u0400\u0001\u0000\u0000\u0000\u0400\u0403\u0001"+
		"\u0000\u0000\u0000\u0401\u0403\u0003\u00acV\u0000\u0402\u03e7\u0001\u0000"+
		"\u0000\u0000\u0402\u03f2\u0001\u0000\u0000\u0000\u0402\u0401\u0001\u0000"+
		"\u0000\u0000\u0403\u00a9\u0001\u0000\u0000\u0000\u0404\u0407\u0003\u00ae"+
		"W\u0000\u0405\u0406\u00058\u0000\u0000\u0406\u0408\u0003V+\u0000\u0407"+
		"\u0405\u0001\u0000\u0000\u0000\u0407\u0408\u0001\u0000\u0000\u0000\u0408"+
		"\u00ab\u0001\u0000\u0000\u0000\u0409\u040a\u0005$\u0000\u0000\u040a\u040b"+
		"\u0003\u00aeW\u0000\u040b\u00ad\u0001\u0000\u0000\u0000\u040c\u040d\u0005"+
		"L\u0000\u0000\u040d\u00af\u0001\u0000\u0000\u0000\u0090\u00b2\u00b4\u00bb"+
		"\u00c2\u00c6\u00c9\u00d3\u00dd\u00e0\u00e9\u00f5\u00fd\u0105\u0107\u010b"+
		"\u0114\u011b\u011d\u0126\u012b\u0130\u0137\u013b\u0142\u014a\u0153\u015c"+
		"\u0163\u016d\u017a\u0180\u0189\u0194\u019f\u01a4\u01a9\u01ae\u01b6\u01bf"+
		"\u01c5\u01c7\u01cd\u01d3\u01d5\u01dc\u01e3\u01ec\u01f0\u01f4\u01fa\u01ff"+
		"\u0202\u0207\u020f\u0215\u0218\u0220\u0224\u022a\u022d\u0237\u023a\u023e"+
		"\u0242\u0249\u0253\u025b\u0261\u0269\u0278\u0282\u028a\u0292\u0299\u02a3"+
		"\u02ad\u02b6\u02bb\u02c1\u02c7\u02cc\u02d1\u02d9\u02df\u02e7\u02eb\u02ed"+
		"\u02f1\u02f5\u02fe\u0305\u0309\u030d\u0311\u0314\u0316\u031a\u031e\u0323"+
		"\u0327\u032b\u0332\u0336\u033b\u0344\u0349\u0351\u035a\u035f\u0364\u0368"+
		"\u036d\u0370\u0374\u0379\u0381\u0386\u038b\u0390\u0394\u0399\u039c\u039e"+
		"\u03a2\u03a9\u03ad\u03b1\u03bb\u03bf\u03c6\u03cb\u03cf\u03d4\u03d8\u03dd"+
		"\u03e1\u03e5\u03ec\u03f0\u03f4\u03fa\u03ff\u0402\u0407";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}