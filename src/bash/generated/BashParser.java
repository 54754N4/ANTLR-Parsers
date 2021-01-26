// Generated from .\Bash.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BashParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, LCURLY=9, 
		RCURLY=10, GREATER_GREATER=11, GREATER_BAR=12, LESS_GREATER=13, LESS_LESS=14, 
		LESS_LESS_MINUS=15, LESS_LESS_LESS=16, LESS_AND=17, GREATER_AND=18, AND_GREATER=19, 
		AND_GREATER_GREATER=20, WHILE=21, UNTIL=22, DO=23, DONE=24, FOR=25, SELECT=26, 
		IN=27, CASE=28, ESAC=29, FUNCTION=30, COPROC=31, IF=32, THEN=33, FI=34, 
		ELSE=35, ELIF=36, ARITH_START=37, ARITH_END=38, COND_START=39, COND_END=40, 
		SEMI_SEMI=41, SEMI_AND=42, SEMI_SEMI_AND=43, AND_AND=44, OR_OR=45, BAR_AND=46, 
		BANG=47, TIME=48, ASSIGN=49, QUOTE=50, QUOTES=51, WS=52, NEWLINE=53, LINE_COMMENT=54, 
		MULTILINE_COMMENT=55, ARITH_CMD=56, ARITH_FOR_EXPRS=57, COND_CMD=58, NUMBER=59, 
		REDIR_WORD=60, ASSIGNMENT_WORD=61, WORD=62;
	public static final int
		RULE_inputunit = 0, RULE_word_list = 1, RULE_redirection = 2, RULE_simple_command_element = 3, 
		RULE_redirection_list = 4, RULE_simple_command = 5, RULE_command = 6, 
		RULE_shell_command = 7, RULE_for_command = 8, RULE_arith_for_command = 9, 
		RULE_select_command = 10, RULE_case_command = 11, RULE_function_def = 12, 
		RULE_function_body = 13, RULE_subshell = 14, RULE_coproc = 15, RULE_if_command = 16, 
		RULE_group_command = 17, RULE_arith_command = 18, RULE_cond_command = 19, 
		RULE_elif_clause = 20, RULE_case_clause = 21, RULE_pattern_list = 22, 
		RULE_case_clause_sequence = 23, RULE_pattern = 24, RULE_list = 25, RULE_compound_list = 26, 
		RULE_list0 = 27, RULE_list1 = 28, RULE_simple_list_terminator = 29, RULE_list_terminator = 30, 
		RULE_newline_list = 31, RULE_simple_list = 32, RULE_simple_list1 = 33, 
		RULE_pipeline_command = 34, RULE_pipeline = 35, RULE_timespec = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"inputunit", "word_list", "redirection", "simple_command_element", "redirection_list", 
			"simple_command", "command", "shell_command", "for_command", "arith_for_command", 
			"select_command", "case_command", "function_def", "function_body", "subshell", 
			"coproc", "if_command", "group_command", "arith_command", "cond_command", 
			"elif_clause", "case_clause", "pattern_list", "case_clause_sequence", 
			"pattern", "list", "compound_list", "list0", "list1", "simple_list_terminator", 
			"list_terminator", "newline_list", "simple_list", "simple_list1", "pipeline_command", 
			"pipeline", "timespec"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>'", "'<'", "'-'", "';'", "'('", "')'", "'|'", "'&'", "'{'", 
			"'}'", "'>>'", "'>|'", "'<>'", "'<<'", "'<<-'", "'<<<'", "'<&'", "'>&'", 
			"'&>'", "'&>>'", "'while'", "'until'", "'do'", "'done'", "'for'", "'select'", 
			"'in'", "'case'", "'esac'", "'function'", "'coproc'", "'if'", "'then'", 
			"'fi'", "'else'", "'elif'", "'(('", "'))'", "'['", "']'", "';;'", "';&'", 
			"';;&'", "'&&'", "'||'", "'|&'", "'!'", "'time'", "'='", "'''", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "LCURLY", "RCURLY", 
			"GREATER_GREATER", "GREATER_BAR", "LESS_GREATER", "LESS_LESS", "LESS_LESS_MINUS", 
			"LESS_LESS_LESS", "LESS_AND", "GREATER_AND", "AND_GREATER", "AND_GREATER_GREATER", 
			"WHILE", "UNTIL", "DO", "DONE", "FOR", "SELECT", "IN", "CASE", "ESAC", 
			"FUNCTION", "COPROC", "IF", "THEN", "FI", "ELSE", "ELIF", "ARITH_START", 
			"ARITH_END", "COND_START", "COND_END", "SEMI_SEMI", "SEMI_AND", "SEMI_SEMI_AND", 
			"AND_AND", "OR_OR", "BAR_AND", "BANG", "TIME", "ASSIGN", "QUOTE", "QUOTES", 
			"WS", "NEWLINE", "LINE_COMMENT", "MULTILINE_COMMENT", "ARITH_CMD", "ARITH_FOR_EXPRS", 
			"COND_CMD", "NUMBER", "REDIR_WORD", "ASSIGNMENT_WORD", "WORD"
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
	public String getGrammarFileName() { return "Bash.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BashParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InputunitContext extends ParserRuleContext {
		public List<Simple_listContext> simple_list() {
			return getRuleContexts(Simple_listContext.class);
		}
		public Simple_listContext simple_list(int i) {
			return getRuleContext(Simple_listContext.class,i);
		}
		public TerminalNode EOF() { return getToken(BashParser.EOF, 0); }
		public List<Simple_list_terminatorContext> simple_list_terminator() {
			return getRuleContexts(Simple_list_terminatorContext.class);
		}
		public Simple_list_terminatorContext simple_list_terminator(int i) {
			return getRuleContext(Simple_list_terminatorContext.class,i);
		}
		public InputunitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputunit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterInputunit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitInputunit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitInputunit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputunitContext inputunit() throws RecognitionException {
		InputunitContext _localctx = new InputunitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inputunit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			simple_list();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(75);
				simple_list_terminator();
				setState(76);
				simple_list();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
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

	public static class Word_listContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(BashParser.WORD, 0); }
		public TerminalNode NUMBER() { return getToken(BashParser.NUMBER, 0); }
		public Word_listContext word_list() {
			return getRuleContext(Word_listContext.class,0);
		}
		public Word_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterWord_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitWord_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitWord_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Word_listContext word_list() throws RecognitionException {
		return word_list(0);
	}

	private Word_listContext word_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Word_listContext _localctx = new Word_listContext(_ctx, _parentState);
		Word_listContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_word_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				{
				setState(86);
				match(WORD);
				}
				break;
			case NUMBER:
				{
				setState(87);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(94);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new Word_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_word_list);
						setState(90);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(91);
						match(WORD);
						}
						break;
					case 2:
						{
						_localctx = new Word_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_word_list);
						setState(92);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(93);
						match(NUMBER);
						}
						break;
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class RedirectionContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(BashParser.WORD, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(BashParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(BashParser.NUMBER, i);
		}
		public TerminalNode REDIR_WORD() { return getToken(BashParser.REDIR_WORD, 0); }
		public TerminalNode GREATER_GREATER() { return getToken(BashParser.GREATER_GREATER, 0); }
		public TerminalNode GREATER_BAR() { return getToken(BashParser.GREATER_BAR, 0); }
		public TerminalNode LESS_GREATER() { return getToken(BashParser.LESS_GREATER, 0); }
		public TerminalNode LESS_LESS() { return getToken(BashParser.LESS_LESS, 0); }
		public TerminalNode LESS_LESS_MINUS() { return getToken(BashParser.LESS_LESS_MINUS, 0); }
		public TerminalNode LESS_LESS_LESS() { return getToken(BashParser.LESS_LESS_LESS, 0); }
		public TerminalNode LESS_AND() { return getToken(BashParser.LESS_AND, 0); }
		public TerminalNode GREATER_AND() { return getToken(BashParser.GREATER_AND, 0); }
		public TerminalNode AND_GREATER() { return getToken(BashParser.AND_GREATER, 0); }
		public TerminalNode AND_GREATER_GREATER() { return getToken(BashParser.AND_GREATER_GREATER, 0); }
		public RedirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redirection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterRedirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitRedirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitRedirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RedirectionContext redirection() throws RecognitionException {
		RedirectionContext _localctx = new RedirectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_redirection);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__0);
				setState(100);
				match(WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(T__1);
				setState(102);
				match(WORD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				match(NUMBER);
				setState(104);
				match(T__0);
				setState(105);
				match(WORD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				match(NUMBER);
				setState(107);
				match(T__1);
				setState(108);
				match(WORD);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(REDIR_WORD);
				setState(110);
				match(T__0);
				setState(111);
				match(WORD);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(112);
				match(REDIR_WORD);
				setState(113);
				match(T__1);
				setState(114);
				match(WORD);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(115);
				match(GREATER_GREATER);
				setState(116);
				match(WORD);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(117);
				match(NUMBER);
				setState(118);
				match(GREATER_GREATER);
				setState(119);
				match(WORD);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(120);
				match(REDIR_WORD);
				setState(121);
				match(GREATER_GREATER);
				setState(122);
				match(WORD);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(123);
				match(GREATER_BAR);
				setState(124);
				match(WORD);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(125);
				match(NUMBER);
				setState(126);
				match(GREATER_BAR);
				setState(127);
				match(WORD);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(128);
				match(REDIR_WORD);
				setState(129);
				match(GREATER_BAR);
				setState(130);
				match(WORD);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(131);
				match(LESS_GREATER);
				setState(132);
				match(WORD);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(133);
				match(NUMBER);
				setState(134);
				match(LESS_GREATER);
				setState(135);
				match(WORD);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(136);
				match(REDIR_WORD);
				setState(137);
				match(LESS_GREATER);
				setState(138);
				match(WORD);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(139);
				match(LESS_LESS);
				setState(140);
				match(WORD);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(141);
				match(NUMBER);
				setState(142);
				match(LESS_LESS);
				setState(143);
				match(WORD);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(144);
				match(REDIR_WORD);
				setState(145);
				match(LESS_LESS);
				setState(146);
				match(WORD);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(147);
				match(LESS_LESS_MINUS);
				setState(148);
				match(WORD);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(149);
				match(NUMBER);
				setState(150);
				match(LESS_LESS_MINUS);
				setState(151);
				match(WORD);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(152);
				match(REDIR_WORD);
				setState(153);
				match(LESS_LESS_MINUS);
				setState(154);
				match(WORD);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(155);
				match(LESS_LESS_LESS);
				setState(156);
				match(WORD);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(157);
				match(NUMBER);
				setState(158);
				match(LESS_LESS_LESS);
				setState(159);
				match(WORD);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(160);
				match(REDIR_WORD);
				setState(161);
				match(LESS_LESS_LESS);
				setState(162);
				match(WORD);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(163);
				match(LESS_AND);
				setState(164);
				match(NUMBER);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(165);
				match(NUMBER);
				setState(166);
				match(LESS_AND);
				setState(167);
				match(NUMBER);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(168);
				match(REDIR_WORD);
				setState(169);
				match(LESS_AND);
				setState(170);
				match(NUMBER);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(171);
				match(GREATER_AND);
				setState(172);
				match(NUMBER);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(173);
				match(NUMBER);
				setState(174);
				match(GREATER_AND);
				setState(175);
				match(NUMBER);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(176);
				match(REDIR_WORD);
				setState(177);
				match(GREATER_AND);
				setState(178);
				match(NUMBER);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(179);
				match(LESS_AND);
				setState(180);
				match(WORD);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(181);
				match(NUMBER);
				setState(182);
				match(LESS_AND);
				setState(183);
				match(WORD);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(184);
				match(REDIR_WORD);
				setState(185);
				match(LESS_AND);
				setState(186);
				match(WORD);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(187);
				match(GREATER_AND);
				setState(188);
				match(WORD);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(189);
				match(NUMBER);
				setState(190);
				match(GREATER_AND);
				setState(191);
				match(WORD);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(192);
				match(REDIR_WORD);
				setState(193);
				match(GREATER_AND);
				setState(194);
				match(WORD);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(195);
				match(GREATER_AND);
				setState(196);
				match(T__2);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(197);
				match(NUMBER);
				setState(198);
				match(GREATER_AND);
				setState(199);
				match(T__2);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(200);
				match(REDIR_WORD);
				setState(201);
				match(GREATER_AND);
				setState(202);
				match(T__2);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(203);
				match(LESS_AND);
				setState(204);
				match(T__2);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(205);
				match(NUMBER);
				setState(206);
				match(LESS_AND);
				setState(207);
				match(T__2);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(208);
				match(REDIR_WORD);
				setState(209);
				match(LESS_AND);
				setState(210);
				match(T__2);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(211);
				match(AND_GREATER);
				setState(212);
				match(WORD);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(213);
				match(AND_GREATER_GREATER);
				setState(214);
				match(WORD);
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

	public static class Simple_command_elementContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(BashParser.WORD, 0); }
		public TerminalNode ARITH_CMD() { return getToken(BashParser.ARITH_CMD, 0); }
		public TerminalNode COND_CMD() { return getToken(BashParser.COND_CMD, 0); }
		public TerminalNode ASSIGNMENT_WORD() { return getToken(BashParser.ASSIGNMENT_WORD, 0); }
		public TerminalNode NUMBER() { return getToken(BashParser.NUMBER, 0); }
		public RedirectionContext redirection() {
			return getRuleContext(RedirectionContext.class,0);
		}
		public Simple_command_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_command_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterSimple_command_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitSimple_command_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitSimple_command_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_command_elementContext simple_command_element() throws RecognitionException {
		Simple_command_elementContext _localctx = new Simple_command_elementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simple_command_element);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(ARITH_CMD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(COND_CMD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				match(ASSIGNMENT_WORD);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				match(NUMBER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				redirection();
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

	public static class Redirection_listContext extends ParserRuleContext {
		public RedirectionContext redirection() {
			return getRuleContext(RedirectionContext.class,0);
		}
		public Redirection_listContext redirection_list() {
			return getRuleContext(Redirection_listContext.class,0);
		}
		public Redirection_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redirection_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterRedirection_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitRedirection_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitRedirection_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Redirection_listContext redirection_list() throws RecognitionException {
		return redirection_list(0);
	}

	private Redirection_listContext redirection_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Redirection_listContext _localctx = new Redirection_listContext(_ctx, _parentState);
		Redirection_listContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_redirection_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(226);
			redirection();
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Redirection_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_redirection_list);
					setState(228);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(229);
					redirection();
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Simple_commandContext extends ParserRuleContext {
		public Simple_command_elementContext simple_command_element() {
			return getRuleContext(Simple_command_elementContext.class,0);
		}
		public Simple_commandContext simple_command() {
			return getRuleContext(Simple_commandContext.class,0);
		}
		public Simple_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterSimple_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitSimple_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitSimple_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_commandContext simple_command() throws RecognitionException {
		return simple_command(0);
	}

	private Simple_commandContext simple_command(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Simple_commandContext _localctx = new Simple_commandContext(_ctx, _parentState);
		Simple_commandContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_simple_command, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(236);
			simple_command_element();
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Simple_commandContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simple_command);
					setState(238);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(239);
					simple_command_element();
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class CommandContext extends ParserRuleContext {
		public Simple_commandContext simple_command() {
			return getRuleContext(Simple_commandContext.class,0);
		}
		public Shell_commandContext shell_command() {
			return getRuleContext(Shell_commandContext.class,0);
		}
		public Redirection_listContext redirection_list() {
			return getRuleContext(Redirection_listContext.class,0);
		}
		public Function_defContext function_def() {
			return getRuleContext(Function_defContext.class,0);
		}
		public CoprocContext coproc() {
			return getRuleContext(CoprocContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_command);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				simple_command(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				shell_command();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				shell_command();
				setState(248);
				redirection_list(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				function_def();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				coproc();
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

	public static class Shell_commandContext extends ParserRuleContext {
		public For_commandContext for_command() {
			return getRuleContext(For_commandContext.class,0);
		}
		public Case_commandContext case_command() {
			return getRuleContext(Case_commandContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(BashParser.WHILE, 0); }
		public List<Compound_listContext> compound_list() {
			return getRuleContexts(Compound_listContext.class);
		}
		public Compound_listContext compound_list(int i) {
			return getRuleContext(Compound_listContext.class,i);
		}
		public TerminalNode DO() { return getToken(BashParser.DO, 0); }
		public TerminalNode DONE() { return getToken(BashParser.DONE, 0); }
		public TerminalNode UNTIL() { return getToken(BashParser.UNTIL, 0); }
		public Select_commandContext select_command() {
			return getRuleContext(Select_commandContext.class,0);
		}
		public If_commandContext if_command() {
			return getRuleContext(If_commandContext.class,0);
		}
		public SubshellContext subshell() {
			return getRuleContext(SubshellContext.class,0);
		}
		public Group_commandContext group_command() {
			return getRuleContext(Group_commandContext.class,0);
		}
		public Arith_commandContext arith_command() {
			return getRuleContext(Arith_commandContext.class,0);
		}
		public Cond_commandContext cond_command() {
			return getRuleContext(Cond_commandContext.class,0);
		}
		public Arith_for_commandContext arith_for_command() {
			return getRuleContext(Arith_for_commandContext.class,0);
		}
		public Shell_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shell_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterShell_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitShell_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitShell_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shell_commandContext shell_command() throws RecognitionException {
		Shell_commandContext _localctx = new Shell_commandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_shell_command);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				for_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				case_command();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(WHILE);
				setState(257);
				compound_list();
				setState(258);
				match(DO);
				setState(259);
				compound_list();
				setState(260);
				match(DONE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				match(UNTIL);
				setState(263);
				compound_list();
				setState(264);
				match(DO);
				setState(265);
				compound_list();
				setState(266);
				match(DONE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				select_command();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				if_command();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(270);
				subshell();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(271);
				group_command();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(272);
				arith_command();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(273);
				cond_command();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(274);
				arith_for_command();
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

	public static class For_commandContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(BashParser.FOR, 0); }
		public TerminalNode WORD() { return getToken(BashParser.WORD, 0); }
		public List<Newline_listContext> newline_list() {
			return getRuleContexts(Newline_listContext.class);
		}
		public Newline_listContext newline_list(int i) {
			return getRuleContext(Newline_listContext.class,i);
		}
		public TerminalNode DO() { return getToken(BashParser.DO, 0); }
		public Compound_listContext compound_list() {
			return getRuleContext(Compound_listContext.class,0);
		}
		public TerminalNode DONE() { return getToken(BashParser.DONE, 0); }
		public TerminalNode LCURLY() { return getToken(BashParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(BashParser.RCURLY, 0); }
		public TerminalNode IN() { return getToken(BashParser.IN, 0); }
		public Word_listContext word_list() {
			return getRuleContext(Word_listContext.class,0);
		}
		public List_terminatorContext list_terminator() {
			return getRuleContext(List_terminatorContext.class,0);
		}
		public For_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterFor_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitFor_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitFor_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_commandContext for_command() throws RecognitionException {
		For_commandContext _localctx = new For_commandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_command);
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(FOR);
				setState(278);
				match(WORD);
				setState(279);
				newline_list(0);
				setState(280);
				match(DO);
				setState(281);
				compound_list();
				setState(282);
				match(DONE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(FOR);
				setState(285);
				match(WORD);
				setState(286);
				newline_list(0);
				setState(287);
				match(LCURLY);
				setState(288);
				compound_list();
				setState(289);
				match(RCURLY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				match(FOR);
				setState(292);
				match(WORD);
				setState(293);
				match(T__3);
				setState(294);
				newline_list(0);
				setState(295);
				match(DO);
				setState(296);
				compound_list();
				setState(297);
				match(DONE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				match(FOR);
				setState(300);
				match(WORD);
				setState(301);
				match(T__3);
				setState(302);
				newline_list(0);
				setState(303);
				match(LCURLY);
				setState(304);
				compound_list();
				setState(305);
				match(RCURLY);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(307);
				match(FOR);
				setState(308);
				match(WORD);
				setState(309);
				newline_list(0);
				setState(310);
				match(IN);
				setState(311);
				word_list(0);
				setState(312);
				list_terminator();
				setState(313);
				newline_list(0);
				setState(314);
				match(DO);
				setState(315);
				compound_list();
				setState(316);
				match(DONE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(318);
				match(FOR);
				setState(319);
				match(WORD);
				setState(320);
				newline_list(0);
				setState(321);
				match(IN);
				setState(322);
				word_list(0);
				setState(323);
				list_terminator();
				setState(324);
				newline_list(0);
				setState(325);
				match(LCURLY);
				setState(326);
				compound_list();
				setState(327);
				match(RCURLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(329);
				match(FOR);
				setState(330);
				match(WORD);
				setState(331);
				newline_list(0);
				setState(332);
				match(IN);
				setState(333);
				list_terminator();
				setState(334);
				newline_list(0);
				setState(335);
				match(DO);
				setState(336);
				compound_list();
				setState(337);
				match(DONE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(339);
				match(FOR);
				setState(340);
				match(WORD);
				setState(341);
				newline_list(0);
				setState(342);
				match(IN);
				setState(343);
				list_terminator();
				setState(344);
				newline_list(0);
				setState(345);
				match(LCURLY);
				setState(346);
				compound_list();
				setState(347);
				match(RCURLY);
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

	public static class Arith_for_commandContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(BashParser.FOR, 0); }
		public TerminalNode ARITH_FOR_EXPRS() { return getToken(BashParser.ARITH_FOR_EXPRS, 0); }
		public List_terminatorContext list_terminator() {
			return getRuleContext(List_terminatorContext.class,0);
		}
		public Newline_listContext newline_list() {
			return getRuleContext(Newline_listContext.class,0);
		}
		public TerminalNode DO() { return getToken(BashParser.DO, 0); }
		public Compound_listContext compound_list() {
			return getRuleContext(Compound_listContext.class,0);
		}
		public TerminalNode DONE() { return getToken(BashParser.DONE, 0); }
		public TerminalNode LCURLY() { return getToken(BashParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(BashParser.RCURLY, 0); }
		public Arith_for_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_for_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterArith_for_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitArith_for_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitArith_for_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_for_commandContext arith_for_command() throws RecognitionException {
		Arith_for_commandContext _localctx = new Arith_for_commandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arith_for_command);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(FOR);
				setState(352);
				match(ARITH_FOR_EXPRS);
				setState(353);
				list_terminator();
				setState(354);
				newline_list(0);
				setState(355);
				match(DO);
				setState(356);
				compound_list();
				setState(357);
				match(DONE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(FOR);
				setState(360);
				match(ARITH_FOR_EXPRS);
				setState(361);
				list_terminator();
				setState(362);
				newline_list(0);
				setState(363);
				match(LCURLY);
				setState(364);
				compound_list();
				setState(365);
				match(RCURLY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				match(FOR);
				setState(368);
				match(ARITH_FOR_EXPRS);
				setState(369);
				match(DO);
				setState(370);
				compound_list();
				setState(371);
				match(DONE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				match(FOR);
				setState(374);
				match(ARITH_FOR_EXPRS);
				setState(375);
				match(LCURLY);
				setState(376);
				compound_list();
				setState(377);
				match(RCURLY);
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

	public static class Select_commandContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(BashParser.SELECT, 0); }
		public TerminalNode WORD() { return getToken(BashParser.WORD, 0); }
		public List<Newline_listContext> newline_list() {
			return getRuleContexts(Newline_listContext.class);
		}
		public Newline_listContext newline_list(int i) {
			return getRuleContext(Newline_listContext.class,i);
		}
		public TerminalNode DO() { return getToken(BashParser.DO, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode DONE() { return getToken(BashParser.DONE, 0); }
		public TerminalNode LCURLY() { return getToken(BashParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(BashParser.RCURLY, 0); }
		public TerminalNode IN() { return getToken(BashParser.IN, 0); }
		public Word_listContext word_list() {
			return getRuleContext(Word_listContext.class,0);
		}
		public List_terminatorContext list_terminator() {
			return getRuleContext(List_terminatorContext.class,0);
		}
		public Compound_listContext compound_list() {
			return getRuleContext(Compound_listContext.class,0);
		}
		public Select_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterSelect_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitSelect_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitSelect_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_commandContext select_command() throws RecognitionException {
		Select_commandContext _localctx = new Select_commandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_select_command);
		try {
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(SELECT);
				setState(382);
				match(WORD);
				setState(383);
				newline_list(0);
				setState(384);
				match(DO);
				setState(385);
				list();
				setState(386);
				match(DONE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(SELECT);
				setState(389);
				match(WORD);
				setState(390);
				newline_list(0);
				setState(391);
				match(LCURLY);
				setState(392);
				list();
				setState(393);
				match(RCURLY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				match(SELECT);
				setState(396);
				match(WORD);
				setState(397);
				match(T__3);
				setState(398);
				newline_list(0);
				setState(399);
				match(DO);
				setState(400);
				list();
				setState(401);
				match(DONE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(403);
				match(SELECT);
				setState(404);
				match(WORD);
				setState(405);
				match(T__3);
				setState(406);
				newline_list(0);
				setState(407);
				match(LCURLY);
				setState(408);
				list();
				setState(409);
				match(RCURLY);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(411);
				match(SELECT);
				setState(412);
				match(WORD);
				setState(413);
				newline_list(0);
				setState(414);
				match(IN);
				setState(415);
				word_list(0);
				setState(416);
				list_terminator();
				setState(417);
				newline_list(0);
				setState(418);
				match(DO);
				setState(419);
				list();
				setState(420);
				match(DONE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(422);
				match(SELECT);
				setState(423);
				match(WORD);
				setState(424);
				newline_list(0);
				setState(425);
				match(IN);
				setState(426);
				word_list(0);
				setState(427);
				list_terminator();
				setState(428);
				newline_list(0);
				setState(429);
				match(LCURLY);
				setState(430);
				list();
				setState(431);
				match(RCURLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(433);
				match(SELECT);
				setState(434);
				match(WORD);
				setState(435);
				newline_list(0);
				setState(436);
				match(IN);
				setState(437);
				list_terminator();
				setState(438);
				newline_list(0);
				setState(439);
				match(DO);
				setState(440);
				compound_list();
				setState(441);
				match(DONE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(443);
				match(SELECT);
				setState(444);
				match(WORD);
				setState(445);
				newline_list(0);
				setState(446);
				match(IN);
				setState(447);
				list_terminator();
				setState(448);
				newline_list(0);
				setState(449);
				match(LCURLY);
				setState(450);
				compound_list();
				setState(451);
				match(RCURLY);
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

	public static class Case_commandContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(BashParser.CASE, 0); }
		public TerminalNode WORD() { return getToken(BashParser.WORD, 0); }
		public List<Newline_listContext> newline_list() {
			return getRuleContexts(Newline_listContext.class);
		}
		public Newline_listContext newline_list(int i) {
			return getRuleContext(Newline_listContext.class,i);
		}
		public TerminalNode IN() { return getToken(BashParser.IN, 0); }
		public TerminalNode ESAC() { return getToken(BashParser.ESAC, 0); }
		public Case_clause_sequenceContext case_clause_sequence() {
			return getRuleContext(Case_clause_sequenceContext.class,0);
		}
		public Case_clauseContext case_clause() {
			return getRuleContext(Case_clauseContext.class,0);
		}
		public Case_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterCase_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitCase_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitCase_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_commandContext case_command() throws RecognitionException {
		Case_commandContext _localctx = new Case_commandContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_case_command);
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				match(CASE);
				setState(456);
				match(WORD);
				setState(457);
				newline_list(0);
				setState(458);
				match(IN);
				setState(459);
				newline_list(0);
				setState(460);
				match(ESAC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				match(CASE);
				setState(463);
				match(WORD);
				setState(464);
				newline_list(0);
				setState(465);
				match(IN);
				setState(466);
				case_clause_sequence(0);
				setState(467);
				newline_list(0);
				setState(468);
				match(ESAC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				match(CASE);
				setState(471);
				match(WORD);
				setState(472);
				newline_list(0);
				setState(473);
				match(IN);
				setState(474);
				case_clause();
				setState(475);
				match(ESAC);
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

	public static class Function_defContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(BashParser.WORD, 0); }
		public Newline_listContext newline_list() {
			return getRuleContext(Newline_listContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(BashParser.FUNCTION, 0); }
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitFunction_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitFunction_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_def);
		try {
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				match(WORD);
				setState(480);
				match(T__4);
				setState(481);
				match(T__5);
				setState(482);
				newline_list(0);
				setState(483);
				function_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				match(FUNCTION);
				setState(486);
				match(WORD);
				setState(487);
				match(T__4);
				setState(488);
				match(T__5);
				setState(489);
				newline_list(0);
				setState(490);
				function_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				match(FUNCTION);
				setState(493);
				match(WORD);
				setState(494);
				newline_list(0);
				setState(495);
				function_body();
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

	public static class Function_bodyContext extends ParserRuleContext {
		public Shell_commandContext shell_command() {
			return getRuleContext(Shell_commandContext.class,0);
		}
		public Redirection_listContext redirection_list() {
			return getRuleContext(Redirection_listContext.class,0);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_body);
		try {
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				shell_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				shell_command();
				setState(501);
				redirection_list(0);
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

	public static class SubshellContext extends ParserRuleContext {
		public Compound_listContext compound_list() {
			return getRuleContext(Compound_listContext.class,0);
		}
		public SubshellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subshell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterSubshell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitSubshell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitSubshell(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubshellContext subshell() throws RecognitionException {
		SubshellContext _localctx = new SubshellContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_subshell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(T__4);
			setState(506);
			compound_list();
			setState(507);
			match(T__5);
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

	public static class CoprocContext extends ParserRuleContext {
		public TerminalNode COPROC() { return getToken(BashParser.COPROC, 0); }
		public Shell_commandContext shell_command() {
			return getRuleContext(Shell_commandContext.class,0);
		}
		public Redirection_listContext redirection_list() {
			return getRuleContext(Redirection_listContext.class,0);
		}
		public TerminalNode WORD() { return getToken(BashParser.WORD, 0); }
		public Simple_commandContext simple_command() {
			return getRuleContext(Simple_commandContext.class,0);
		}
		public CoprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterCoproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitCoproc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitCoproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoprocContext coproc() throws RecognitionException {
		CoprocContext _localctx = new CoprocContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_coproc);
		try {
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(COPROC);
				setState(510);
				shell_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				match(COPROC);
				setState(512);
				shell_command();
				setState(513);
				redirection_list(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(515);
				match(COPROC);
				setState(516);
				match(WORD);
				setState(517);
				shell_command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(518);
				match(COPROC);
				setState(519);
				match(WORD);
				setState(520);
				shell_command();
				setState(521);
				redirection_list(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(523);
				match(COPROC);
				setState(524);
				simple_command(0);
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

	public static class If_commandContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BashParser.IF, 0); }
		public List<Compound_listContext> compound_list() {
			return getRuleContexts(Compound_listContext.class);
		}
		public Compound_listContext compound_list(int i) {
			return getRuleContext(Compound_listContext.class,i);
		}
		public TerminalNode THEN() { return getToken(BashParser.THEN, 0); }
		public TerminalNode FI() { return getToken(BashParser.FI, 0); }
		public TerminalNode ELSE() { return getToken(BashParser.ELSE, 0); }
		public Elif_clauseContext elif_clause() {
			return getRuleContext(Elif_clauseContext.class,0);
		}
		public If_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterIf_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitIf_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitIf_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_commandContext if_command() throws RecognitionException {
		If_commandContext _localctx = new If_commandContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_command);
		try {
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				match(IF);
				setState(528);
				compound_list();
				setState(529);
				match(THEN);
				setState(530);
				compound_list();
				setState(531);
				match(FI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				match(IF);
				setState(534);
				compound_list();
				setState(535);
				match(THEN);
				setState(536);
				compound_list();
				setState(537);
				match(ELSE);
				setState(538);
				compound_list();
				setState(539);
				match(FI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				match(IF);
				setState(542);
				compound_list();
				setState(543);
				match(THEN);
				setState(544);
				compound_list();
				setState(545);
				elif_clause();
				setState(546);
				match(FI);
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

	public static class Group_commandContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(BashParser.LCURLY, 0); }
		public Compound_listContext compound_list() {
			return getRuleContext(Compound_listContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(BashParser.RCURLY, 0); }
		public Group_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterGroup_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitGroup_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitGroup_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_commandContext group_command() throws RecognitionException {
		Group_commandContext _localctx = new Group_commandContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_group_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(LCURLY);
			setState(551);
			compound_list();
			setState(552);
			match(RCURLY);
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

	public static class Arith_commandContext extends ParserRuleContext {
		public TerminalNode ARITH_CMD() { return getToken(BashParser.ARITH_CMD, 0); }
		public Arith_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterArith_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitArith_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitArith_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_commandContext arith_command() throws RecognitionException {
		Arith_commandContext _localctx = new Arith_commandContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arith_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(ARITH_CMD);
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

	public static class Cond_commandContext extends ParserRuleContext {
		public TerminalNode COND_CMD() { return getToken(BashParser.COND_CMD, 0); }
		public Cond_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterCond_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitCond_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitCond_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_commandContext cond_command() throws RecognitionException {
		Cond_commandContext _localctx = new Cond_commandContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cond_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(COND_CMD);
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

	public static class Elif_clauseContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(BashParser.ELIF, 0); }
		public List<Compound_listContext> compound_list() {
			return getRuleContexts(Compound_listContext.class);
		}
		public Compound_listContext compound_list(int i) {
			return getRuleContext(Compound_listContext.class,i);
		}
		public TerminalNode THEN() { return getToken(BashParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(BashParser.ELSE, 0); }
		public Elif_clauseContext elif_clause() {
			return getRuleContext(Elif_clauseContext.class,0);
		}
		public Elif_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterElif_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitElif_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitElif_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_clauseContext elif_clause() throws RecognitionException {
		Elif_clauseContext _localctx = new Elif_clauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elif_clause);
		try {
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				match(ELIF);
				setState(559);
				compound_list();
				setState(560);
				match(THEN);
				setState(561);
				compound_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				match(ELIF);
				setState(564);
				compound_list();
				setState(565);
				match(THEN);
				setState(566);
				compound_list();
				setState(567);
				match(ELSE);
				setState(568);
				compound_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				match(ELIF);
				setState(571);
				compound_list();
				setState(572);
				match(THEN);
				setState(573);
				compound_list();
				setState(574);
				elif_clause();
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

	public static class Case_clauseContext extends ParserRuleContext {
		public Pattern_listContext pattern_list() {
			return getRuleContext(Pattern_listContext.class,0);
		}
		public Case_clause_sequenceContext case_clause_sequence() {
			return getRuleContext(Case_clause_sequenceContext.class,0);
		}
		public Case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterCase_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitCase_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitCase_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_clauseContext case_clause() throws RecognitionException {
		Case_clauseContext _localctx = new Case_clauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_case_clause);
		try {
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				pattern_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				case_clause_sequence(0);
				setState(580);
				pattern_list();
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

	public static class Pattern_listContext extends ParserRuleContext {
		public List<Newline_listContext> newline_list() {
			return getRuleContexts(Newline_listContext.class);
		}
		public Newline_listContext newline_list(int i) {
			return getRuleContext(Newline_listContext.class,i);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Compound_listContext compound_list() {
			return getRuleContext(Compound_listContext.class,0);
		}
		public Pattern_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterPattern_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitPattern_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitPattern_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_listContext pattern_list() throws RecognitionException {
		Pattern_listContext _localctx = new Pattern_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pattern_list);
		try {
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				newline_list(0);
				setState(585);
				pattern(0);
				setState(586);
				match(T__5);
				setState(587);
				compound_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				newline_list(0);
				setState(590);
				pattern(0);
				setState(591);
				match(T__5);
				setState(592);
				newline_list(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(594);
				newline_list(0);
				setState(595);
				match(T__4);
				setState(596);
				pattern(0);
				setState(597);
				match(T__5);
				setState(598);
				compound_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(600);
				newline_list(0);
				setState(601);
				match(T__4);
				setState(602);
				pattern(0);
				setState(603);
				match(T__5);
				setState(604);
				newline_list(0);
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

	public static class Case_clause_sequenceContext extends ParserRuleContext {
		public Pattern_listContext pattern_list() {
			return getRuleContext(Pattern_listContext.class,0);
		}
		public TerminalNode SEMI_SEMI() { return getToken(BashParser.SEMI_SEMI, 0); }
		public TerminalNode SEMI_AND() { return getToken(BashParser.SEMI_AND, 0); }
		public TerminalNode SEMI_SEMI_AND() { return getToken(BashParser.SEMI_SEMI_AND, 0); }
		public Case_clause_sequenceContext case_clause_sequence() {
			return getRuleContext(Case_clause_sequenceContext.class,0);
		}
		public Case_clause_sequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_clause_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterCase_clause_sequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitCase_clause_sequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitCase_clause_sequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_clause_sequenceContext case_clause_sequence() throws RecognitionException {
		return case_clause_sequence(0);
	}

	private Case_clause_sequenceContext case_clause_sequence(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Case_clause_sequenceContext _localctx = new Case_clause_sequenceContext(_ctx, _parentState);
		Case_clause_sequenceContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_case_clause_sequence, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(609);
				pattern_list();
				setState(610);
				match(SEMI_SEMI);
				}
				break;
			case 2:
				{
				setState(612);
				pattern_list();
				setState(613);
				match(SEMI_AND);
				}
				break;
			case 3:
				{
				setState(615);
				pattern_list();
				setState(616);
				match(SEMI_SEMI_AND);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(632);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new Case_clause_sequenceContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_case_clause_sequence);
						setState(620);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(621);
						pattern_list();
						setState(622);
						match(SEMI_SEMI);
						}
						break;
					case 2:
						{
						_localctx = new Case_clause_sequenceContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_case_clause_sequence);
						setState(624);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(625);
						pattern_list();
						setState(626);
						match(SEMI_AND);
						}
						break;
					case 3:
						{
						_localctx = new Case_clause_sequenceContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_case_clause_sequence);
						setState(628);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(629);
						pattern_list();
						setState(630);
						match(SEMI_SEMI_AND);
						}
						break;
					}
					} 
				}
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class PatternContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(BashParser.WORD, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		return pattern(0);
	}

	private PatternContext pattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PatternContext _localctx = new PatternContext(_ctx, _parentState);
		PatternContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_pattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(638);
			match(WORD);
			}
			_ctx.stop = _input.LT(-1);
			setState(645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(640);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(641);
					match(T__6);
					setState(642);
					match(WORD);
					}
					} 
				}
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class ListContext extends ParserRuleContext {
		public Newline_listContext newline_list() {
			return getRuleContext(Newline_listContext.class,0);
		}
		public List0Context list0() {
			return getRuleContext(List0Context.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			newline_list(0);
			setState(649);
			list0();
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

	public static class Compound_listContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Newline_listContext newline_list() {
			return getRuleContext(Newline_listContext.class,0);
		}
		public List1Context list1() {
			return getRuleContext(List1Context.class,0);
		}
		public Compound_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterCompound_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitCompound_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitCompound_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_listContext compound_list() throws RecognitionException {
		Compound_listContext _localctx = new Compound_listContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_compound_list);
		try {
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				newline_list(0);
				setState(653);
				list1(0);
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

	public static class List0Context extends ParserRuleContext {
		public List1Context list1() {
			return getRuleContext(List1Context.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(BashParser.NEWLINE, 0); }
		public Newline_listContext newline_list() {
			return getRuleContext(Newline_listContext.class,0);
		}
		public List0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterList0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitList0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitList0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List0Context list0() throws RecognitionException {
		List0Context _localctx = new List0Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_list0);
		try {
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				list1(0);
				setState(658);
				match(NEWLINE);
				setState(659);
				newline_list(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				list1(0);
				setState(662);
				match(T__7);
				setState(663);
				newline_list(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(665);
				list1(0);
				setState(666);
				match(T__3);
				setState(667);
				newline_list(0);
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

	public static class List1Context extends ParserRuleContext {
		public Pipeline_commandContext pipeline_command() {
			return getRuleContext(Pipeline_commandContext.class,0);
		}
		public List<List1Context> list1() {
			return getRuleContexts(List1Context.class);
		}
		public List1Context list1(int i) {
			return getRuleContext(List1Context.class,i);
		}
		public TerminalNode AND_AND() { return getToken(BashParser.AND_AND, 0); }
		public Newline_listContext newline_list() {
			return getRuleContext(Newline_listContext.class,0);
		}
		public TerminalNode OR_OR() { return getToken(BashParser.OR_OR, 0); }
		public TerminalNode NEWLINE() { return getToken(BashParser.NEWLINE, 0); }
		public List1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterList1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitList1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitList1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List1Context list1() throws RecognitionException {
		return list1(0);
	}

	private List1Context list1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		List1Context _localctx = new List1Context(_ctx, _parentState);
		List1Context _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_list1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(672);
			pipeline_command();
			}
			_ctx.stop = _input.LT(-1);
			setState(701);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(699);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new List1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_list1);
						setState(674);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(675);
						match(AND_AND);
						setState(676);
						newline_list(0);
						setState(677);
						list1(7);
						}
						break;
					case 2:
						{
						_localctx = new List1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_list1);
						setState(679);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(680);
						match(OR_OR);
						setState(681);
						newline_list(0);
						setState(682);
						list1(6);
						}
						break;
					case 3:
						{
						_localctx = new List1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_list1);
						setState(684);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(685);
						match(T__7);
						setState(686);
						newline_list(0);
						setState(687);
						list1(5);
						}
						break;
					case 4:
						{
						_localctx = new List1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_list1);
						setState(689);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(690);
						match(T__3);
						setState(691);
						newline_list(0);
						setState(692);
						list1(4);
						}
						break;
					case 5:
						{
						_localctx = new List1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_list1);
						setState(694);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(695);
						match(NEWLINE);
						setState(696);
						newline_list(0);
						setState(697);
						list1(3);
						}
						break;
					}
					} 
				}
				setState(703);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class Simple_list_terminatorContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(BashParser.NEWLINE, 0); }
		public Simple_list_terminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_list_terminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterSimple_list_terminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitSimple_list_terminator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitSimple_list_terminator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_list_terminatorContext simple_list_terminator() throws RecognitionException {
		Simple_list_terminatorContext _localctx = new Simple_list_terminatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_simple_list_terminator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
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

	public static class List_terminatorContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(BashParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(BashParser.EOF, 0); }
		public List_terminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_terminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterList_terminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitList_terminator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitList_terminator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_terminatorContext list_terminator() throws RecognitionException {
		List_terminatorContext _localctx = new List_terminatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_list_terminator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			_la = _input.LA(1);
			if ( !(((((_la - -1)) & ~0x3f) == 0 && ((1L << (_la - -1)) & ((1L << (EOF - -1)) | (1L << (T__3 - -1)) | (1L << (NEWLINE - -1)))) != 0)) ) {
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

	public static class Newline_listContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(BashParser.EOF, 0); }
		public Newline_listContext newline_list() {
			return getRuleContext(Newline_listContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(BashParser.NEWLINE, 0); }
		public Newline_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterNewline_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitNewline_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitNewline_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Newline_listContext newline_list() throws RecognitionException {
		return newline_list(0);
	}

	private Newline_listContext newline_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Newline_listContext _localctx = new Newline_listContext(_ctx, _parentState);
		Newline_listContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_newline_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(709);
				match(EOF);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(716);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Newline_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_newline_list);
					setState(712);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(713);
					match(NEWLINE);
					}
					} 
				}
				setState(718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class Simple_listContext extends ParserRuleContext {
		public Simple_list1Context simple_list1() {
			return getRuleContext(Simple_list1Context.class,0);
		}
		public Simple_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterSimple_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitSimple_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitSimple_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_listContext simple_list() throws RecognitionException {
		Simple_listContext _localctx = new Simple_listContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_simple_list);
		try {
			setState(727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(719);
				simple_list1(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				simple_list1(0);
				setState(721);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(723);
				simple_list1(0);
				setState(724);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class Simple_list1Context extends ParserRuleContext {
		public Pipeline_commandContext pipeline_command() {
			return getRuleContext(Pipeline_commandContext.class,0);
		}
		public List<Simple_list1Context> simple_list1() {
			return getRuleContexts(Simple_list1Context.class);
		}
		public Simple_list1Context simple_list1(int i) {
			return getRuleContext(Simple_list1Context.class,i);
		}
		public TerminalNode AND_AND() { return getToken(BashParser.AND_AND, 0); }
		public Newline_listContext newline_list() {
			return getRuleContext(Newline_listContext.class,0);
		}
		public TerminalNode OR_OR() { return getToken(BashParser.OR_OR, 0); }
		public Simple_list1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_list1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterSimple_list1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitSimple_list1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitSimple_list1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_list1Context simple_list1() throws RecognitionException {
		return simple_list1(0);
	}

	private Simple_list1Context simple_list1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Simple_list1Context _localctx = new Simple_list1Context(_ctx, _parentState);
		Simple_list1Context _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_simple_list1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(730);
			pipeline_command();
			}
			_ctx.stop = _input.LT(-1);
			setState(750);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(748);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new Simple_list1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simple_list1);
						setState(732);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(733);
						match(AND_AND);
						setState(734);
						newline_list(0);
						setState(735);
						simple_list1(6);
						}
						break;
					case 2:
						{
						_localctx = new Simple_list1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simple_list1);
						setState(737);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(738);
						match(OR_OR);
						setState(739);
						newline_list(0);
						setState(740);
						simple_list1(5);
						}
						break;
					case 3:
						{
						_localctx = new Simple_list1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simple_list1);
						setState(742);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(743);
						match(T__7);
						setState(744);
						simple_list1(4);
						}
						break;
					case 4:
						{
						_localctx = new Simple_list1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simple_list1);
						setState(745);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(746);
						match(T__3);
						setState(747);
						simple_list1(3);
						}
						break;
					}
					} 
				}
				setState(752);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class Pipeline_commandContext extends ParserRuleContext {
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public TerminalNode BANG() { return getToken(BashParser.BANG, 0); }
		public Pipeline_commandContext pipeline_command() {
			return getRuleContext(Pipeline_commandContext.class,0);
		}
		public TimespecContext timespec() {
			return getRuleContext(TimespecContext.class,0);
		}
		public List_terminatorContext list_terminator() {
			return getRuleContext(List_terminatorContext.class,0);
		}
		public Pipeline_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeline_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterPipeline_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitPipeline_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitPipeline_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pipeline_commandContext pipeline_command() throws RecognitionException {
		Pipeline_commandContext _localctx = new Pipeline_commandContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_pipeline_command);
		try {
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(753);
				pipeline(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(754);
				match(BANG);
				setState(755);
				pipeline_command();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(756);
				timespec();
				setState(757);
				pipeline_command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(759);
				timespec();
				setState(760);
				list_terminator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(762);
				match(BANG);
				setState(763);
				list_terminator();
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

	public static class PipelineContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public List<PipelineContext> pipeline() {
			return getRuleContexts(PipelineContext.class);
		}
		public PipelineContext pipeline(int i) {
			return getRuleContext(PipelineContext.class,i);
		}
		public Newline_listContext newline_list() {
			return getRuleContext(Newline_listContext.class,0);
		}
		public TerminalNode BAR_AND() { return getToken(BashParser.BAR_AND, 0); }
		public PipelineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterPipeline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitPipeline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitPipeline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipelineContext pipeline() throws RecognitionException {
		return pipeline(0);
	}

	private PipelineContext pipeline(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PipelineContext _localctx = new PipelineContext(_ctx, _parentState);
		PipelineContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_pipeline, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(767);
			command();
			}
			_ctx.stop = _input.LT(-1);
			setState(781);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(779);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new PipelineContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pipeline);
						setState(769);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(770);
						match(T__6);
						setState(771);
						newline_list(0);
						setState(772);
						pipeline(4);
						}
						break;
					case 2:
						{
						_localctx = new PipelineContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pipeline);
						setState(774);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(775);
						match(BAR_AND);
						setState(776);
						newline_list(0);
						setState(777);
						pipeline(3);
						}
						break;
					}
					} 
				}
				setState(783);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class TimespecContext extends ParserRuleContext {
		public TerminalNode TIME() { return getToken(BashParser.TIME, 0); }
		public TimespecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timespec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).enterTimespec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashListener ) ((BashListener)listener).exitTimespec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashVisitor ) return ((BashVisitor<? extends T>)visitor).visitTimespec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimespecContext timespec() throws RecognitionException {
		TimespecContext _localctx = new TimespecContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_timespec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(TIME);
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
		case 1:
			return word_list_sempred((Word_listContext)_localctx, predIndex);
		case 4:
			return redirection_list_sempred((Redirection_listContext)_localctx, predIndex);
		case 5:
			return simple_command_sempred((Simple_commandContext)_localctx, predIndex);
		case 23:
			return case_clause_sequence_sempred((Case_clause_sequenceContext)_localctx, predIndex);
		case 24:
			return pattern_sempred((PatternContext)_localctx, predIndex);
		case 28:
			return list1_sempred((List1Context)_localctx, predIndex);
		case 31:
			return newline_list_sempred((Newline_listContext)_localctx, predIndex);
		case 33:
			return simple_list1_sempred((Simple_list1Context)_localctx, predIndex);
		case 35:
			return pipeline_sempred((PipelineContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean word_list_sempred(Word_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean redirection_list_sempred(Redirection_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean simple_command_sempred(Simple_commandContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean case_clause_sequence_sempred(Case_clause_sequenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pattern_sempred(PatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean list1_sempred(List1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean newline_list_sempred(Newline_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simple_list1_sempred(Simple_list1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 5);
		case 15:
			return precpred(_ctx, 4);
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean pipeline_sempred(PipelineContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 3);
		case 19:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0315\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\7\2Q\n\2\f\2\16\2"+
		"T\13\2\3\2\3\2\3\3\3\3\3\3\5\3[\n\3\3\3\3\3\3\3\3\3\7\3a\n\3\f\3\16\3"+
		"d\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00da\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5\u00e2\n\5\3\6\3\6\3\6\3\6\3\6\7\6\u00e9\n\6\f\6"+
		"\16\6\u00ec\13\6\3\7\3\7\3\7\3\7\3\7\7\7\u00f3\n\7\f\7\16\7\u00f6\13\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ff\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0116\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u0160\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u017e\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01c8\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u01e0\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01f4\n\16\3\17\3\17"+
		"\3\17\3\17\5\17\u01fa\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0210\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0227\n\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0243\n\26\3\27\3\27\3\27"+
		"\3\27\5\27\u0249\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0261"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u026d\n\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u027b"+
		"\n\31\f\31\16\31\u027e\13\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0286"+
		"\n\32\f\32\16\32\u0289\13\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u0292"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u02a0\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\7\36\u02be\n\36\f\36\16\36\u02c1\13\36\3\37\3\37\3 \3 \3!\3"+
		"!\5!\u02c9\n!\3!\3!\7!\u02cd\n!\f!\16!\u02d0\13!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\5\"\u02da\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\7#\u02ef\n#\f#\16#\u02f2\13#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\5$\u02ff\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u030e\n%\f"+
		"%\16%\u0311\13%\3&\3&\3&\2\13\4\n\f\60\62:@DH\'\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\3\4\3\6\6\67\67\2\u0372"+
		"\2L\3\2\2\2\4Z\3\2\2\2\6\u00d9\3\2\2\2\b\u00e1\3\2\2\2\n\u00e3\3\2\2\2"+
		"\f\u00ed\3\2\2\2\16\u00fe\3\2\2\2\20\u0115\3\2\2\2\22\u015f\3\2\2\2\24"+
		"\u017d\3\2\2\2\26\u01c7\3\2\2\2\30\u01df\3\2\2\2\32\u01f3\3\2\2\2\34\u01f9"+
		"\3\2\2\2\36\u01fb\3\2\2\2 \u020f\3\2\2\2\"\u0226\3\2\2\2$\u0228\3\2\2"+
		"\2&\u022c\3\2\2\2(\u022e\3\2\2\2*\u0242\3\2\2\2,\u0248\3\2\2\2.\u0260"+
		"\3\2\2\2\60\u026c\3\2\2\2\62\u027f\3\2\2\2\64\u028a\3\2\2\2\66\u0291\3"+
		"\2\2\28\u029f\3\2\2\2:\u02a1\3\2\2\2<\u02c2\3\2\2\2>\u02c4\3\2\2\2@\u02c8"+
		"\3\2\2\2B\u02d9\3\2\2\2D\u02db\3\2\2\2F\u02fe\3\2\2\2H\u0300\3\2\2\2J"+
		"\u0312\3\2\2\2LR\5B\"\2MN\5<\37\2NO\5B\"\2OQ\3\2\2\2PM\3\2\2\2QT\3\2\2"+
		"\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\2\2\3V\3\3\2\2\2WX\b\3"+
		"\1\2X[\7@\2\2Y[\7=\2\2ZW\3\2\2\2ZY\3\2\2\2[b\3\2\2\2\\]\f\4\2\2]a\7@\2"+
		"\2^_\f\3\2\2_a\7=\2\2`\\\3\2\2\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2"+
		"\2c\5\3\2\2\2db\3\2\2\2ef\7\3\2\2f\u00da\7@\2\2gh\7\4\2\2h\u00da\7@\2"+
		"\2ij\7=\2\2jk\7\3\2\2k\u00da\7@\2\2lm\7=\2\2mn\7\4\2\2n\u00da\7@\2\2o"+
		"p\7>\2\2pq\7\3\2\2q\u00da\7@\2\2rs\7>\2\2st\7\4\2\2t\u00da\7@\2\2uv\7"+
		"\r\2\2v\u00da\7@\2\2wx\7=\2\2xy\7\r\2\2y\u00da\7@\2\2z{\7>\2\2{|\7\r\2"+
		"\2|\u00da\7@\2\2}~\7\16\2\2~\u00da\7@\2\2\177\u0080\7=\2\2\u0080\u0081"+
		"\7\16\2\2\u0081\u00da\7@\2\2\u0082\u0083\7>\2\2\u0083\u0084\7\16\2\2\u0084"+
		"\u00da\7@\2\2\u0085\u0086\7\17\2\2\u0086\u00da\7@\2\2\u0087\u0088\7=\2"+
		"\2\u0088\u0089\7\17\2\2\u0089\u00da\7@\2\2\u008a\u008b\7>\2\2\u008b\u008c"+
		"\7\17\2\2\u008c\u00da\7@\2\2\u008d\u008e\7\20\2\2\u008e\u00da\7@\2\2\u008f"+
		"\u0090\7=\2\2\u0090\u0091\7\20\2\2\u0091\u00da\7@\2\2\u0092\u0093\7>\2"+
		"\2\u0093\u0094\7\20\2\2\u0094\u00da\7@\2\2\u0095\u0096\7\21\2\2\u0096"+
		"\u00da\7@\2\2\u0097\u0098\7=\2\2\u0098\u0099\7\21\2\2\u0099\u00da\7@\2"+
		"\2\u009a\u009b\7>\2\2\u009b\u009c\7\21\2\2\u009c\u00da\7@\2\2\u009d\u009e"+
		"\7\22\2\2\u009e\u00da\7@\2\2\u009f\u00a0\7=\2\2\u00a0\u00a1\7\22\2\2\u00a1"+
		"\u00da\7@\2\2\u00a2\u00a3\7>\2\2\u00a3\u00a4\7\22\2\2\u00a4\u00da\7@\2"+
		"\2\u00a5\u00a6\7\23\2\2\u00a6\u00da\7=\2\2\u00a7\u00a8\7=\2\2\u00a8\u00a9"+
		"\7\23\2\2\u00a9\u00da\7=\2\2\u00aa\u00ab\7>\2\2\u00ab\u00ac\7\23\2\2\u00ac"+
		"\u00da\7=\2\2\u00ad\u00ae\7\24\2\2\u00ae\u00da\7=\2\2\u00af\u00b0\7=\2"+
		"\2\u00b0\u00b1\7\24\2\2\u00b1\u00da\7=\2\2\u00b2\u00b3\7>\2\2\u00b3\u00b4"+
		"\7\24\2\2\u00b4\u00da\7=\2\2\u00b5\u00b6\7\23\2\2\u00b6\u00da\7@\2\2\u00b7"+
		"\u00b8\7=\2\2\u00b8\u00b9\7\23\2\2\u00b9\u00da\7@\2\2\u00ba\u00bb\7>\2"+
		"\2\u00bb\u00bc\7\23\2\2\u00bc\u00da\7@\2\2\u00bd\u00be\7\24\2\2\u00be"+
		"\u00da\7@\2\2\u00bf\u00c0\7=\2\2\u00c0\u00c1\7\24\2\2\u00c1\u00da\7@\2"+
		"\2\u00c2\u00c3\7>\2\2\u00c3\u00c4\7\24\2\2\u00c4\u00da\7@\2\2\u00c5\u00c6"+
		"\7\24\2\2\u00c6\u00da\7\5\2\2\u00c7\u00c8\7=\2\2\u00c8\u00c9\7\24\2\2"+
		"\u00c9\u00da\7\5\2\2\u00ca\u00cb\7>\2\2\u00cb\u00cc\7\24\2\2\u00cc\u00da"+
		"\7\5\2\2\u00cd\u00ce\7\23\2\2\u00ce\u00da\7\5\2\2\u00cf\u00d0\7=\2\2\u00d0"+
		"\u00d1\7\23\2\2\u00d1\u00da\7\5\2\2\u00d2\u00d3\7>\2\2\u00d3\u00d4\7\23"+
		"\2\2\u00d4\u00da\7\5\2\2\u00d5\u00d6\7\25\2\2\u00d6\u00da\7@\2\2\u00d7"+
		"\u00d8\7\26\2\2\u00d8\u00da\7@\2\2\u00d9e\3\2\2\2\u00d9g\3\2\2\2\u00d9"+
		"i\3\2\2\2\u00d9l\3\2\2\2\u00d9o\3\2\2\2\u00d9r\3\2\2\2\u00d9u\3\2\2\2"+
		"\u00d9w\3\2\2\2\u00d9z\3\2\2\2\u00d9}\3\2\2\2\u00d9\177\3\2\2\2\u00d9"+
		"\u0082\3\2\2\2\u00d9\u0085\3\2\2\2\u00d9\u0087\3\2\2\2\u00d9\u008a\3\2"+
		"\2\2\u00d9\u008d\3\2\2\2\u00d9\u008f\3\2\2\2\u00d9\u0092\3\2\2\2\u00d9"+
		"\u0095\3\2\2\2\u00d9\u0097\3\2\2\2\u00d9\u009a\3\2\2\2\u00d9\u009d\3\2"+
		"\2\2\u00d9\u009f\3\2\2\2\u00d9\u00a2\3\2\2\2\u00d9\u00a5\3\2\2\2\u00d9"+
		"\u00a7\3\2\2\2\u00d9\u00aa\3\2\2\2\u00d9\u00ad\3\2\2\2\u00d9\u00af\3\2"+
		"\2\2\u00d9\u00b2\3\2\2\2\u00d9\u00b5\3\2\2\2\u00d9\u00b7\3\2\2\2\u00d9"+
		"\u00ba\3\2\2\2\u00d9\u00bd\3\2\2\2\u00d9\u00bf\3\2\2\2\u00d9\u00c2\3\2"+
		"\2\2\u00d9\u00c5\3\2\2\2\u00d9\u00c7\3\2\2\2\u00d9\u00ca\3\2\2\2\u00d9"+
		"\u00cd\3\2\2\2\u00d9\u00cf\3\2\2\2\u00d9\u00d2\3\2\2\2\u00d9\u00d5\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00da\7\3\2\2\2\u00db\u00e2\7@\2\2\u00dc\u00e2"+
		"\7:\2\2\u00dd\u00e2\7<\2\2\u00de\u00e2\7?\2\2\u00df\u00e2\7=\2\2\u00e0"+
		"\u00e2\5\6\4\2\u00e1\u00db\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e1\u00dd\3\2"+
		"\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\t\3\2\2\2\u00e3\u00e4\b\6\1\2\u00e4\u00e5\5\6\4\2\u00e5\u00ea\3\2\2\2"+
		"\u00e6\u00e7\f\3\2\2\u00e7\u00e9\5\6\4\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\13\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ee\b\7\1\2\u00ee\u00ef\5\b\5\2\u00ef\u00f4\3\2"+
		"\2\2\u00f0\u00f1\f\3\2\2\u00f1\u00f3\5\b\5\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\r\3\2\2\2"+
		"\u00f6\u00f4\3\2\2\2\u00f7\u00ff\5\f\7\2\u00f8\u00ff\5\20\t\2\u00f9\u00fa"+
		"\5\20\t\2\u00fa\u00fb\5\n\6\2\u00fb\u00ff\3\2\2\2\u00fc\u00ff\5\32\16"+
		"\2\u00fd\u00ff\5 \21\2\u00fe\u00f7\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe\u00f9"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\17\3\2\2\2\u0100"+
		"\u0116\5\22\n\2\u0101\u0116\5\30\r\2\u0102\u0103\7\27\2\2\u0103\u0104"+
		"\5\66\34\2\u0104\u0105\7\31\2\2\u0105\u0106\5\66\34\2\u0106\u0107\7\32"+
		"\2\2\u0107\u0116\3\2\2\2\u0108\u0109\7\30\2\2\u0109\u010a\5\66\34\2\u010a"+
		"\u010b\7\31\2\2\u010b\u010c\5\66\34\2\u010c\u010d\7\32\2\2\u010d\u0116"+
		"\3\2\2\2\u010e\u0116\5\26\f\2\u010f\u0116\5\"\22\2\u0110\u0116\5\36\20"+
		"\2\u0111\u0116\5$\23\2\u0112\u0116\5&\24\2\u0113\u0116\5(\25\2\u0114\u0116"+
		"\5\24\13\2\u0115\u0100\3\2\2\2\u0115\u0101\3\2\2\2\u0115\u0102\3\2\2\2"+
		"\u0115\u0108\3\2\2\2\u0115\u010e\3\2\2\2\u0115\u010f\3\2\2\2\u0115\u0110"+
		"\3\2\2\2\u0115\u0111\3\2\2\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0114\3\2\2\2\u0116\21\3\2\2\2\u0117\u0118\7\33\2\2\u0118\u0119\7@\2"+
		"\2\u0119\u011a\5@!\2\u011a\u011b\7\31\2\2\u011b\u011c\5\66\34\2\u011c"+
		"\u011d\7\32\2\2\u011d\u0160\3\2\2\2\u011e\u011f\7\33\2\2\u011f\u0120\7"+
		"@\2\2\u0120\u0121\5@!\2\u0121\u0122\7\13\2\2\u0122\u0123\5\66\34\2\u0123"+
		"\u0124\7\f\2\2\u0124\u0160\3\2\2\2\u0125\u0126\7\33\2\2\u0126\u0127\7"+
		"@\2\2\u0127\u0128\7\6\2\2\u0128\u0129\5@!\2\u0129\u012a\7\31\2\2\u012a"+
		"\u012b\5\66\34\2\u012b\u012c\7\32\2\2\u012c\u0160\3\2\2\2\u012d\u012e"+
		"\7\33\2\2\u012e\u012f\7@\2\2\u012f\u0130\7\6\2\2\u0130\u0131\5@!\2\u0131"+
		"\u0132\7\13\2\2\u0132\u0133\5\66\34\2\u0133\u0134\7\f\2\2\u0134\u0160"+
		"\3\2\2\2\u0135\u0136\7\33\2\2\u0136\u0137\7@\2\2\u0137\u0138\5@!\2\u0138"+
		"\u0139\7\35\2\2\u0139\u013a\5\4\3\2\u013a\u013b\5> \2\u013b\u013c\5@!"+
		"\2\u013c\u013d\7\31\2\2\u013d\u013e\5\66\34\2\u013e\u013f\7\32\2\2\u013f"+
		"\u0160\3\2\2\2\u0140\u0141\7\33\2\2\u0141\u0142\7@\2\2\u0142\u0143\5@"+
		"!\2\u0143\u0144\7\35\2\2\u0144\u0145\5\4\3\2\u0145\u0146\5> \2\u0146\u0147"+
		"\5@!\2\u0147\u0148\7\13\2\2\u0148\u0149\5\66\34\2\u0149\u014a\7\f\2\2"+
		"\u014a\u0160\3\2\2\2\u014b\u014c\7\33\2\2\u014c\u014d\7@\2\2\u014d\u014e"+
		"\5@!\2\u014e\u014f\7\35\2\2\u014f\u0150\5> \2\u0150\u0151\5@!\2\u0151"+
		"\u0152\7\31\2\2\u0152\u0153\5\66\34\2\u0153\u0154\7\32\2\2\u0154\u0160"+
		"\3\2\2\2\u0155\u0156\7\33\2\2\u0156\u0157\7@\2\2\u0157\u0158\5@!\2\u0158"+
		"\u0159\7\35\2\2\u0159\u015a\5> \2\u015a\u015b\5@!\2\u015b\u015c\7\13\2"+
		"\2\u015c\u015d\5\66\34\2\u015d\u015e\7\f\2\2\u015e\u0160\3\2\2\2\u015f"+
		"\u0117\3\2\2\2\u015f\u011e\3\2\2\2\u015f\u0125\3\2\2\2\u015f\u012d\3\2"+
		"\2\2\u015f\u0135\3\2\2\2\u015f\u0140\3\2\2\2\u015f\u014b\3\2\2\2\u015f"+
		"\u0155\3\2\2\2\u0160\23\3\2\2\2\u0161\u0162\7\33\2\2\u0162\u0163\7;\2"+
		"\2\u0163\u0164\5> \2\u0164\u0165\5@!\2\u0165\u0166\7\31\2\2\u0166\u0167"+
		"\5\66\34\2\u0167\u0168\7\32\2\2\u0168\u017e\3\2\2\2\u0169\u016a\7\33\2"+
		"\2\u016a\u016b\7;\2\2\u016b\u016c\5> \2\u016c\u016d\5@!\2\u016d\u016e"+
		"\7\13\2\2\u016e\u016f\5\66\34\2\u016f\u0170\7\f\2\2\u0170\u017e\3\2\2"+
		"\2\u0171\u0172\7\33\2\2\u0172\u0173\7;\2\2\u0173\u0174\7\31\2\2\u0174"+
		"\u0175\5\66\34\2\u0175\u0176\7\32\2\2\u0176\u017e\3\2\2\2\u0177\u0178"+
		"\7\33\2\2\u0178\u0179\7;\2\2\u0179\u017a\7\13\2\2\u017a\u017b\5\66\34"+
		"\2\u017b\u017c\7\f\2\2\u017c\u017e\3\2\2\2\u017d\u0161\3\2\2\2\u017d\u0169"+
		"\3\2\2\2\u017d\u0171\3\2\2\2\u017d\u0177\3\2\2\2\u017e\25\3\2\2\2\u017f"+
		"\u0180\7\34\2\2\u0180\u0181\7@\2\2\u0181\u0182\5@!\2\u0182\u0183\7\31"+
		"\2\2\u0183\u0184\5\64\33\2\u0184\u0185\7\32\2\2\u0185\u01c8\3\2\2\2\u0186"+
		"\u0187\7\34\2\2\u0187\u0188\7@\2\2\u0188\u0189\5@!\2\u0189\u018a\7\13"+
		"\2\2\u018a\u018b\5\64\33\2\u018b\u018c\7\f\2\2\u018c\u01c8\3\2\2\2\u018d"+
		"\u018e\7\34\2\2\u018e\u018f\7@\2\2\u018f\u0190\7\6\2\2\u0190\u0191\5@"+
		"!\2\u0191\u0192\7\31\2\2\u0192\u0193\5\64\33\2\u0193\u0194\7\32\2\2\u0194"+
		"\u01c8\3\2\2\2\u0195\u0196\7\34\2\2\u0196\u0197\7@\2\2\u0197\u0198\7\6"+
		"\2\2\u0198\u0199\5@!\2\u0199\u019a\7\13\2\2\u019a\u019b\5\64\33\2\u019b"+
		"\u019c\7\f\2\2\u019c\u01c8\3\2\2\2\u019d\u019e\7\34\2\2\u019e\u019f\7"+
		"@\2\2\u019f\u01a0\5@!\2\u01a0\u01a1\7\35\2\2\u01a1\u01a2\5\4\3\2\u01a2"+
		"\u01a3\5> \2\u01a3\u01a4\5@!\2\u01a4\u01a5\7\31\2\2\u01a5\u01a6\5\64\33"+
		"\2\u01a6\u01a7\7\32\2\2\u01a7\u01c8\3\2\2\2\u01a8\u01a9\7\34\2\2\u01a9"+
		"\u01aa\7@\2\2\u01aa\u01ab\5@!\2\u01ab\u01ac\7\35\2\2\u01ac\u01ad\5\4\3"+
		"\2\u01ad\u01ae\5> \2\u01ae\u01af\5@!\2\u01af\u01b0\7\13\2\2\u01b0\u01b1"+
		"\5\64\33\2\u01b1\u01b2\7\f\2\2\u01b2\u01c8\3\2\2\2\u01b3\u01b4\7\34\2"+
		"\2\u01b4\u01b5\7@\2\2\u01b5\u01b6\5@!\2\u01b6\u01b7\7\35\2\2\u01b7\u01b8"+
		"\5> \2\u01b8\u01b9\5@!\2\u01b9\u01ba\7\31\2\2\u01ba\u01bb\5\66\34\2\u01bb"+
		"\u01bc\7\32\2\2\u01bc\u01c8\3\2\2\2\u01bd\u01be\7\34\2\2\u01be\u01bf\7"+
		"@\2\2\u01bf\u01c0\5@!\2\u01c0\u01c1\7\35\2\2\u01c1\u01c2\5> \2\u01c2\u01c3"+
		"\5@!\2\u01c3\u01c4\7\13\2\2\u01c4\u01c5\5\66\34\2\u01c5\u01c6\7\f\2\2"+
		"\u01c6\u01c8\3\2\2\2\u01c7\u017f\3\2\2\2\u01c7\u0186\3\2\2\2\u01c7\u018d"+
		"\3\2\2\2\u01c7\u0195\3\2\2\2\u01c7\u019d\3\2\2\2\u01c7\u01a8\3\2\2\2\u01c7"+
		"\u01b3\3\2\2\2\u01c7\u01bd\3\2\2\2\u01c8\27\3\2\2\2\u01c9\u01ca\7\36\2"+
		"\2\u01ca\u01cb\7@\2\2\u01cb\u01cc\5@!\2\u01cc\u01cd\7\35\2\2\u01cd\u01ce"+
		"\5@!\2\u01ce\u01cf\7\37\2\2\u01cf\u01e0\3\2\2\2\u01d0\u01d1\7\36\2\2\u01d1"+
		"\u01d2\7@\2\2\u01d2\u01d3\5@!\2\u01d3\u01d4\7\35\2\2\u01d4\u01d5\5\60"+
		"\31\2\u01d5\u01d6\5@!\2\u01d6\u01d7\7\37\2\2\u01d7\u01e0\3\2\2\2\u01d8"+
		"\u01d9\7\36\2\2\u01d9\u01da\7@\2\2\u01da\u01db\5@!\2\u01db\u01dc\7\35"+
		"\2\2\u01dc\u01dd\5,\27\2\u01dd\u01de\7\37\2\2\u01de\u01e0\3\2\2\2\u01df"+
		"\u01c9\3\2\2\2\u01df\u01d0\3\2\2\2\u01df\u01d8\3\2\2\2\u01e0\31\3\2\2"+
		"\2\u01e1\u01e2\7@\2\2\u01e2\u01e3\7\7\2\2\u01e3\u01e4\7\b\2\2\u01e4\u01e5"+
		"\5@!\2\u01e5\u01e6\5\34\17\2\u01e6\u01f4\3\2\2\2\u01e7\u01e8\7 \2\2\u01e8"+
		"\u01e9\7@\2\2\u01e9\u01ea\7\7\2\2\u01ea\u01eb\7\b\2\2\u01eb\u01ec\5@!"+
		"\2\u01ec\u01ed\5\34\17\2\u01ed\u01f4\3\2\2\2\u01ee\u01ef\7 \2\2\u01ef"+
		"\u01f0\7@\2\2\u01f0\u01f1\5@!\2\u01f1\u01f2\5\34\17\2\u01f2\u01f4\3\2"+
		"\2\2\u01f3\u01e1\3\2\2\2\u01f3\u01e7\3\2\2\2\u01f3\u01ee\3\2\2\2\u01f4"+
		"\33\3\2\2\2\u01f5\u01fa\5\20\t\2\u01f6\u01f7\5\20\t\2\u01f7\u01f8\5\n"+
		"\6\2\u01f8\u01fa\3\2\2\2\u01f9\u01f5\3\2\2\2\u01f9\u01f6\3\2\2\2\u01fa"+
		"\35\3\2\2\2\u01fb\u01fc\7\7\2\2\u01fc\u01fd\5\66\34\2\u01fd\u01fe\7\b"+
		"\2\2\u01fe\37\3\2\2\2\u01ff\u0200\7!\2\2\u0200\u0210\5\20\t\2\u0201\u0202"+
		"\7!\2\2\u0202\u0203\5\20\t\2\u0203\u0204\5\n\6\2\u0204\u0210\3\2\2\2\u0205"+
		"\u0206\7!\2\2\u0206\u0207\7@\2\2\u0207\u0210\5\20\t\2\u0208\u0209\7!\2"+
		"\2\u0209\u020a\7@\2\2\u020a\u020b\5\20\t\2\u020b\u020c\5\n\6\2\u020c\u0210"+
		"\3\2\2\2\u020d\u020e\7!\2\2\u020e\u0210\5\f\7\2\u020f\u01ff\3\2\2\2\u020f"+
		"\u0201\3\2\2\2\u020f\u0205\3\2\2\2\u020f\u0208\3\2\2\2\u020f\u020d\3\2"+
		"\2\2\u0210!\3\2\2\2\u0211\u0212\7\"\2\2\u0212\u0213\5\66\34\2\u0213\u0214"+
		"\7#\2\2\u0214\u0215\5\66\34\2\u0215\u0216\7$\2\2\u0216\u0227\3\2\2\2\u0217"+
		"\u0218\7\"\2\2\u0218\u0219\5\66\34\2\u0219\u021a\7#\2\2\u021a\u021b\5"+
		"\66\34\2\u021b\u021c\7%\2\2\u021c\u021d\5\66\34\2\u021d\u021e\7$\2\2\u021e"+
		"\u0227\3\2\2\2\u021f\u0220\7\"\2\2\u0220\u0221\5\66\34\2\u0221\u0222\7"+
		"#\2\2\u0222\u0223\5\66\34\2\u0223\u0224\5*\26\2\u0224\u0225\7$\2\2\u0225"+
		"\u0227\3\2\2\2\u0226\u0211\3\2\2\2\u0226\u0217\3\2\2\2\u0226\u021f\3\2"+
		"\2\2\u0227#\3\2\2\2\u0228\u0229\7\13\2\2\u0229\u022a\5\66\34\2\u022a\u022b"+
		"\7\f\2\2\u022b%\3\2\2\2\u022c\u022d\7:\2\2\u022d\'\3\2\2\2\u022e\u022f"+
		"\7<\2\2\u022f)\3\2\2\2\u0230\u0231\7&\2\2\u0231\u0232\5\66\34\2\u0232"+
		"\u0233\7#\2\2\u0233\u0234\5\66\34\2\u0234\u0243\3\2\2\2\u0235\u0236\7"+
		"&\2\2\u0236\u0237\5\66\34\2\u0237\u0238\7#\2\2\u0238\u0239\5\66\34\2\u0239"+
		"\u023a\7%\2\2\u023a\u023b\5\66\34\2\u023b\u0243\3\2\2\2\u023c\u023d\7"+
		"&\2\2\u023d\u023e\5\66\34\2\u023e\u023f\7#\2\2\u023f\u0240\5\66\34\2\u0240"+
		"\u0241\5*\26\2\u0241\u0243\3\2\2\2\u0242\u0230\3\2\2\2\u0242\u0235\3\2"+
		"\2\2\u0242\u023c\3\2\2\2\u0243+\3\2\2\2\u0244\u0249\5.\30\2\u0245\u0246"+
		"\5\60\31\2\u0246\u0247\5.\30\2\u0247\u0249\3\2\2\2\u0248\u0244\3\2\2\2"+
		"\u0248\u0245\3\2\2\2\u0249-\3\2\2\2\u024a\u024b\5@!\2\u024b\u024c\5\62"+
		"\32\2\u024c\u024d\7\b\2\2\u024d\u024e\5\66\34\2\u024e\u0261\3\2\2\2\u024f"+
		"\u0250\5@!\2\u0250\u0251\5\62\32\2\u0251\u0252\7\b\2\2\u0252\u0253\5@"+
		"!\2\u0253\u0261\3\2\2\2\u0254\u0255\5@!\2\u0255\u0256\7\7\2\2\u0256\u0257"+
		"\5\62\32\2\u0257\u0258\7\b\2\2\u0258\u0259\5\66\34\2\u0259\u0261\3\2\2"+
		"\2\u025a\u025b\5@!\2\u025b\u025c\7\7\2\2\u025c\u025d\5\62\32\2\u025d\u025e"+
		"\7\b\2\2\u025e\u025f\5@!\2\u025f\u0261\3\2\2\2\u0260\u024a\3\2\2\2\u0260"+
		"\u024f\3\2\2\2\u0260\u0254\3\2\2\2\u0260\u025a\3\2\2\2\u0261/\3\2\2\2"+
		"\u0262\u0263\b\31\1\2\u0263\u0264\5.\30\2\u0264\u0265\7+\2\2\u0265\u026d"+
		"\3\2\2\2\u0266\u0267\5.\30\2\u0267\u0268\7,\2\2\u0268\u026d\3\2\2\2\u0269"+
		"\u026a\5.\30\2\u026a\u026b\7-\2\2\u026b\u026d\3\2\2\2\u026c\u0262\3\2"+
		"\2\2\u026c\u0266\3\2\2\2\u026c\u0269\3\2\2\2\u026d\u027c\3\2\2\2\u026e"+
		"\u026f\f\7\2\2\u026f\u0270\5.\30\2\u0270\u0271\7+\2\2\u0271\u027b\3\2"+
		"\2\2\u0272\u0273\f\5\2\2\u0273\u0274\5.\30\2\u0274\u0275\7,\2\2\u0275"+
		"\u027b\3\2\2\2\u0276\u0277\f\3\2\2\u0277\u0278\5.\30\2\u0278\u0279\7-"+
		"\2\2\u0279\u027b\3\2\2\2\u027a\u026e\3\2\2\2\u027a\u0272\3\2\2\2\u027a"+
		"\u0276\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2"+
		"\2\2\u027d\61\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0280\b\32\1\2\u0280\u0281"+
		"\7@\2\2\u0281\u0287\3\2\2\2\u0282\u0283\f\3\2\2\u0283\u0284\7\t\2\2\u0284"+
		"\u0286\7@\2\2\u0285\u0282\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2"+
		"\2\2\u0287\u0288\3\2\2\2\u0288\63\3\2\2\2\u0289\u0287\3\2\2\2\u028a\u028b"+
		"\5@!\2\u028b\u028c\58\35\2\u028c\65\3\2\2\2\u028d\u0292\5\64\33\2\u028e"+
		"\u028f\5@!\2\u028f\u0290\5:\36\2\u0290\u0292\3\2\2\2\u0291\u028d\3\2\2"+
		"\2\u0291\u028e\3\2\2\2\u0292\67\3\2\2\2\u0293\u0294\5:\36\2\u0294\u0295"+
		"\7\67\2\2\u0295\u0296\5@!\2\u0296\u02a0\3\2\2\2\u0297\u0298\5:\36\2\u0298"+
		"\u0299\7\n\2\2\u0299\u029a\5@!\2\u029a\u02a0\3\2\2\2\u029b\u029c\5:\36"+
		"\2\u029c\u029d\7\6\2\2\u029d\u029e\5@!\2\u029e\u02a0\3\2\2\2\u029f\u0293"+
		"\3\2\2\2\u029f\u0297\3\2\2\2\u029f\u029b\3\2\2\2\u02a09\3\2\2\2\u02a1"+
		"\u02a2\b\36\1\2\u02a2\u02a3\5F$\2\u02a3\u02bf\3\2\2\2\u02a4\u02a5\f\b"+
		"\2\2\u02a5\u02a6\7.\2\2\u02a6\u02a7\5@!\2\u02a7\u02a8\5:\36\t\u02a8\u02be"+
		"\3\2\2\2\u02a9\u02aa\f\7\2\2\u02aa\u02ab\7/\2\2\u02ab\u02ac\5@!\2\u02ac"+
		"\u02ad\5:\36\b\u02ad\u02be\3\2\2\2\u02ae\u02af\f\6\2\2\u02af\u02b0\7\n"+
		"\2\2\u02b0\u02b1\5@!\2\u02b1\u02b2\5:\36\7\u02b2\u02be\3\2\2\2\u02b3\u02b4"+
		"\f\5\2\2\u02b4\u02b5\7\6\2\2\u02b5\u02b6\5@!\2\u02b6\u02b7\5:\36\6\u02b7"+
		"\u02be\3\2\2\2\u02b8\u02b9\f\4\2\2\u02b9\u02ba\7\67\2\2\u02ba\u02bb\5"+
		"@!\2\u02bb\u02bc\5:\36\5\u02bc\u02be\3\2\2\2\u02bd\u02a4\3\2\2\2\u02bd"+
		"\u02a9\3\2\2\2\u02bd\u02ae\3\2\2\2\u02bd\u02b3\3\2\2\2\u02bd\u02b8\3\2"+
		"\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0"+
		";\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c3\7\67\2\2\u02c3=\3\2\2\2\u02c4"+
		"\u02c5\t\2\2\2\u02c5?\3\2\2\2\u02c6\u02c9\b!\1\2\u02c7\u02c9\7\2\2\3\u02c8"+
		"\u02c6\3\2\2\2\u02c8\u02c7\3\2\2\2\u02c9\u02ce\3\2\2\2\u02ca\u02cb\f\4"+
		"\2\2\u02cb\u02cd\7\67\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce"+
		"\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cfA\3\2\2\2\u02d0\u02ce\3\2\2\2"+
		"\u02d1\u02da\5D#\2\u02d2\u02d3\5D#\2\u02d3\u02d4\7\n\2\2\u02d4\u02da\3"+
		"\2\2\2\u02d5\u02d6\5D#\2\u02d6\u02d7\7\6\2\2\u02d7\u02da\3\2\2\2\u02d8"+
		"\u02da\3\2\2\2\u02d9\u02d1\3\2\2\2\u02d9\u02d2\3\2\2\2\u02d9\u02d5\3\2"+
		"\2\2\u02d9\u02d8\3\2\2\2\u02daC\3\2\2\2\u02db\u02dc\b#\1\2\u02dc\u02dd"+
		"\5F$\2\u02dd\u02f0\3\2\2\2\u02de\u02df\f\7\2\2\u02df\u02e0\7.\2\2\u02e0"+
		"\u02e1\5@!\2\u02e1\u02e2\5D#\b\u02e2\u02ef\3\2\2\2\u02e3\u02e4\f\6\2\2"+
		"\u02e4\u02e5\7/\2\2\u02e5\u02e6\5@!\2\u02e6\u02e7\5D#\7\u02e7\u02ef\3"+
		"\2\2\2\u02e8\u02e9\f\5\2\2\u02e9\u02ea\7\n\2\2\u02ea\u02ef\5D#\6\u02eb"+
		"\u02ec\f\4\2\2\u02ec\u02ed\7\6\2\2\u02ed\u02ef\5D#\5\u02ee\u02de\3\2\2"+
		"\2\u02ee\u02e3\3\2\2\2\u02ee\u02e8\3\2\2\2\u02ee\u02eb\3\2\2\2\u02ef\u02f2"+
		"\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1E\3\2\2\2\u02f2"+
		"\u02f0\3\2\2\2\u02f3\u02ff\5H%\2\u02f4\u02f5\7\61\2\2\u02f5\u02ff\5F$"+
		"\2\u02f6\u02f7\5J&\2\u02f7\u02f8\5F$\2\u02f8\u02ff\3\2\2\2\u02f9\u02fa"+
		"\5J&\2\u02fa\u02fb\5> \2\u02fb\u02ff\3\2\2\2\u02fc\u02fd\7\61\2\2\u02fd"+
		"\u02ff\5> \2\u02fe\u02f3\3\2\2\2\u02fe\u02f4\3\2\2\2\u02fe\u02f6\3\2\2"+
		"\2\u02fe\u02f9\3\2\2\2\u02fe\u02fc\3\2\2\2\u02ffG\3\2\2\2\u0300\u0301"+
		"\b%\1\2\u0301\u0302\5\16\b\2\u0302\u030f\3\2\2\2\u0303\u0304\f\5\2\2\u0304"+
		"\u0305\7\t\2\2\u0305\u0306\5@!\2\u0306\u0307\5H%\6\u0307\u030e\3\2\2\2"+
		"\u0308\u0309\f\4\2\2\u0309\u030a\7\60\2\2\u030a\u030b\5@!\2\u030b\u030c"+
		"\5H%\5\u030c\u030e\3\2\2\2\u030d\u0303\3\2\2\2\u030d\u0308\3\2\2\2\u030e"+
		"\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310I\3\2\2\2"+
		"\u0311\u030f\3\2\2\2\u0312\u0313\7\62\2\2\u0313K\3\2\2\2\'RZ`b\u00d9\u00e1"+
		"\u00ea\u00f4\u00fe\u0115\u015f\u017d\u01c7\u01df\u01f3\u01f9\u020f\u0226"+
		"\u0242\u0248\u0260\u026c\u027a\u027c\u0287\u0291\u029f\u02bd\u02bf\u02c8"+
		"\u02ce\u02d9\u02ee\u02f0\u02fe\u030d\u030f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}