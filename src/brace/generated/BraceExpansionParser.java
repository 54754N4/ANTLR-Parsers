package brace.generated;
// Generated from .\BraceExpansion.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BraceExpansionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LCURLY=1, RCURLY=2, RANGE=3, COMMA=4, INT=5, CHAR=6, WORD=7;
	public static final int
		RULE_input = 0, RULE_expansion = 1, RULE_statement = 2, RULE_preamble = 3, 
		RULE_postscript = 4, RULE_any = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"input", "expansion", "statement", "preamble", "postscript", "any"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'..'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LCURLY", "RCURLY", "RANGE", "COMMA", "INT", "CHAR", "WORD"
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
	public String getGrammarFileName() { return "BraceExpansion.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BraceExpansionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InputContext extends ParserRuleContext {
		public ExpansionContext expansion() {
			return getRuleContext(ExpansionContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BraceExpansionListener ) ((BraceExpansionListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BraceExpansionListener ) ((BraceExpansionListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BraceExpansionVisitor ) return ((BraceExpansionVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			expansion();
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

	public static class ExpansionContext extends ParserRuleContext {
		public PreambleContext preamble() {
			return getRuleContext(PreambleContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(BraceExpansionParser.LCURLY, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(BraceExpansionParser.RCURLY, 0); }
		public PostscriptContext postscript() {
			return getRuleContext(PostscriptContext.class,0);
		}
		public ExpansionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expansion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BraceExpansionListener ) ((BraceExpansionListener)listener).enterExpansion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BraceExpansionListener ) ((BraceExpansionListener)listener).exitExpansion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BraceExpansionVisitor ) return ((BraceExpansionVisitor<? extends T>)visitor).visitExpansion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpansionContext expansion() throws RecognitionException {
		ExpansionContext _localctx = new ExpansionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expansion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			preamble();
			setState(15);
			match(LCURLY);
			setState(16);
			statement();
			setState(17);
			match(RCURLY);
			setState(18);
			postscript();
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CSVContext extends StatementContext {
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BraceExpansionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BraceExpansionParser.COMMA, i);
		}
		public CSVContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BraceExpansionListener ) ((BraceExpansionListener)listener).enterCSV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BraceExpansionListener ) ((BraceExpansionListener)listener).exitCSV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BraceExpansionVisitor ) return ((BraceExpansionVisitor<? extends T>)visitor).visitCSV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RangeContext extends StatementContext {
		public List<TerminalNode> RANGE() { return getTokens(BraceExpansionParser.RANGE); }
		public TerminalNode RANGE(int i) {
			return getToken(BraceExpansionParser.RANGE, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(BraceExpansionParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(BraceExpansionParser.CHAR, i);
		}
		public List<TerminalNode> INT() { return getTokens(BraceExpansionParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(BraceExpansionParser.INT, i);
		}
		public RangeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BraceExpansionListener ) ((BraceExpansionListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BraceExpansionListener ) ((BraceExpansionListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BraceExpansionVisitor ) return ((BraceExpansionVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new CSVContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				any();
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(21);
					match(COMMA);
					setState(22);
					any();
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new RangeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(29);
				match(RANGE);
				setState(30);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE) {
					{
					setState(31);
					match(RANGE);
					setState(32);
					match(INT);
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

	public static class PreambleContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(BraceExpansionParser.WORD, 0); }
		public TerminalNode INT() { return getToken(BraceExpansionParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(BraceExpansionParser.CHAR, 0); }
		public PreambleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preamble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BraceExpansionListener ) ((BraceExpansionListener)listener).enterPreamble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BraceExpansionListener ) ((BraceExpansionListener)listener).exitPreamble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BraceExpansionVisitor ) return ((BraceExpansionVisitor<? extends T>)visitor).visitPreamble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreambleContext preamble() throws RecognitionException {
		PreambleContext _localctx = new PreambleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_preamble);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(WORD);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(INT);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				match(CHAR);
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class PostscriptContext extends ParserRuleContext {
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public PostscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BraceExpansionListener ) ((BraceExpansionListener)listener).enterPostscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BraceExpansionListener ) ((BraceExpansionListener)listener).exitPostscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BraceExpansionVisitor ) return ((BraceExpansionVisitor<? extends T>)visitor).visitPostscript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostscriptContext postscript() throws RecognitionException {
		PostscriptContext _localctx = new PostscriptContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_postscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			any();
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

	public static class AnyContext extends ParserRuleContext {
		public ExpansionContext expansion() {
			return getRuleContext(ExpansionContext.class,0);
		}
		public TerminalNode WORD() { return getToken(BraceExpansionParser.WORD, 0); }
		public TerminalNode INT() { return getToken(BraceExpansionParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(BraceExpansionParser.CHAR, 0); }
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BraceExpansionListener ) ((BraceExpansionListener)listener).enterAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BraceExpansionListener ) ((BraceExpansionListener)listener).exitAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BraceExpansionVisitor ) return ((BraceExpansionVisitor<? extends T>)visitor).visitAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_any);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				expansion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(WORD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				match(CHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t\67\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\7\4\32\n\4\f\4\16\4\35\13\4\3\4\3\4\3\4\3\4\3\4\5\4$\n\4\5"+
		"\4&\n\4\3\5\3\5\3\5\3\5\5\5,\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\65\n"+
		"\7\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2\7\b\2:\2\16\3\2\2\2\4\20\3\2\2\2\6%\3"+
		"\2\2\2\b+\3\2\2\2\n-\3\2\2\2\f\64\3\2\2\2\16\17\5\4\3\2\17\3\3\2\2\2\20"+
		"\21\5\b\5\2\21\22\7\3\2\2\22\23\5\6\4\2\23\24\7\4\2\2\24\25\5\n\6\2\25"+
		"\5\3\2\2\2\26\33\5\f\7\2\27\30\7\6\2\2\30\32\5\f\7\2\31\27\3\2\2\2\32"+
		"\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34&\3\2\2\2\35\33\3\2\2\2\36\37"+
		"\t\2\2\2\37 \7\5\2\2 #\t\2\2\2!\"\7\5\2\2\"$\7\7\2\2#!\3\2\2\2#$\3\2\2"+
		"\2$&\3\2\2\2%\26\3\2\2\2%\36\3\2\2\2&\7\3\2\2\2\',\7\t\2\2(,\7\7\2\2)"+
		",\7\b\2\2*,\3\2\2\2+\'\3\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\t\3\2\2"+
		"\2-.\5\f\7\2.\13\3\2\2\2/\65\5\4\3\2\60\65\7\t\2\2\61\65\7\7\2\2\62\65"+
		"\7\b\2\2\63\65\3\2\2\2\64/\3\2\2\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3"+
		"\2\2\2\64\63\3\2\2\2\65\r\3\2\2\2\7\33#%+\64";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}