// Generated from .\BraceExpansion.g4 by ANTLR 4.9.1

package brace.generated;

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
		RULE_input = 0, RULE_expansion = 1, RULE_csv = 2, RULE_range = 3, RULE_postscript = 4, 
		RULE_preamble = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"input", "expansion", "csv", "range", "postscript", "preamble"
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
		public TerminalNode RCURLY() { return getToken(BraceExpansionParser.RCURLY, 0); }
		public PostscriptContext postscript() {
			return getRuleContext(PostscriptContext.class,0);
		}
		public CsvContext csv() {
			return getRuleContext(CsvContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
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
			setState(18);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(16);
				csv();
				}
				break;
			case 2:
				{
				setState(17);
				range();
				}
				break;
			}
			setState(20);
			match(RCURLY);
			setState(21);
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

	public static class CsvContext extends ParserRuleContext {
		public List<PostscriptContext> postscript() {
			return getRuleContexts(PostscriptContext.class);
		}
		public PostscriptContext postscript(int i) {
			return getRuleContext(PostscriptContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BraceExpansionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BraceExpansionParser.COMMA, i);
		}
		public CsvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BraceExpansionListener ) ((BraceExpansionListener)listener).enterCsv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BraceExpansionListener ) ((BraceExpansionListener)listener).exitCsv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BraceExpansionVisitor ) return ((BraceExpansionVisitor<? extends T>)visitor).visitCsv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CsvContext csv() throws RecognitionException {
		CsvContext _localctx = new CsvContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_csv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			postscript();
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				match(COMMA);
				setState(25);
				postscript();
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
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

	public static class RangeContext extends ParserRuleContext {
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
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
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

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			setState(31);
			match(RANGE);
			setState(32);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==CHAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGE) {
				{
				setState(33);
				match(RANGE);
				setState(34);
				match(INT);
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

	public static class PostscriptContext extends ParserRuleContext {
		public ExpansionContext expansion() {
			return getRuleContext(ExpansionContext.class,0);
		}
		public PreambleContext preamble() {
			return getRuleContext(PreambleContext.class,0);
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
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				expansion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				preamble();
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
		enterRule(_localctx, 10, RULE_preamble);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(WORD);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(INT);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(CHAR);
				}
				break;
			case EOF:
			case LCURLY:
			case RCURLY:
			case COMMA:
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t\62\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\3\3\5\3\25\n"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\6\4\35\n\4\r\4\16\4\36\3\5\3\5\3\5\3\5\3\5"+
		"\5\5&\n\5\3\6\3\6\5\6*\n\6\3\7\3\7\3\7\3\7\5\7\60\n\7\3\7\2\2\b\2\4\6"+
		"\b\n\f\2\3\3\2\7\b\2\62\2\16\3\2\2\2\4\20\3\2\2\2\6\31\3\2\2\2\b \3\2"+
		"\2\2\n)\3\2\2\2\f/\3\2\2\2\16\17\5\4\3\2\17\3\3\2\2\2\20\21\5\f\7\2\21"+
		"\24\7\3\2\2\22\25\5\6\4\2\23\25\5\b\5\2\24\22\3\2\2\2\24\23\3\2\2\2\25"+
		"\26\3\2\2\2\26\27\7\4\2\2\27\30\5\n\6\2\30\5\3\2\2\2\31\34\5\n\6\2\32"+
		"\33\7\6\2\2\33\35\5\n\6\2\34\32\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36"+
		"\37\3\2\2\2\37\7\3\2\2\2 !\t\2\2\2!\"\7\5\2\2\"%\t\2\2\2#$\7\5\2\2$&\7"+
		"\7\2\2%#\3\2\2\2%&\3\2\2\2&\t\3\2\2\2\'*\5\4\3\2(*\5\f\7\2)\'\3\2\2\2"+
		")(\3\2\2\2*\13\3\2\2\2+\60\7\t\2\2,\60\7\7\2\2-\60\7\b\2\2.\60\3\2\2\2"+
		"/+\3\2\2\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\r\3\2\2\2\7\24\36%)/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}