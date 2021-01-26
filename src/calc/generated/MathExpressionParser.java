// Generated from .\MathExpression.g4 by ANTLR 4.9.1

	package calc.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MathExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, I=4, CIS=5, PI=6, EXP=7, TRUE=8, FALSE=9, STRING=10, 
		CHAR=11, UFLOAT=12, FLOAT=13, UINT=14, INT=15, SEMI=16, VAR=17, VAL=18, 
		LPAREN=19, RPAREN=20, LBRACKET=21, RBRACKET=22, LCURLY=23, RCURLY=24, 
		COMMA=25, DOT=26, QUOTES=27, QUOTE=28, ASSIGN=29, GT=30, LT=31, NOT=32, 
		TILDE=33, QUESTION=34, COLON=35, LE=36, GE=37, EQUAL=38, NOT_EQUAL=39, 
		AND_AND=40, OR_OR=41, INC=42, DEC=43, ADD=44, SUB=45, MUL=46, DIV_INT=47, 
		DIV=48, POW=49, AND=50, OR=51, XOR=52, MOD=53, LSHIFT=54, RSHIFT=55, URSHIFT=56, 
		ASSIGN_ADD=57, ASSIGN_SUB=58, ASSIGN_MUL=59, ASSIGN_DIV=60, ASSIGN_AND=61, 
		ASSIGN_OR=62, ASSIGN_XOR=63, ASSIGN_MOD=64, ASSIGN_LSHIFT=65, ASSIGN_RSHIFT=66, 
		ASSIGN_URSHIFT=67, NEWLINE=68, WS=69, IDENTIFIER=70;
	public static final int
		RULE_input = 0, RULE_expression = 1, RULE_assignmentList = 2, RULE_assignment = 3, 
		RULE_assignmentOperator = 4, RULE_arithmeticList = 5, RULE_arithmetic = 6, 
		RULE_structure = 7, RULE_constant = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"input", "expression", "assignmentList", "assignment", "assignmentOperator", 
			"arithmeticList", "arithmetic", "structure", "constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'s'", "'r'", "'c'", "'i'", "'cis'", null, null, null, null, null, 
			null, null, null, null, null, "';'", "'var'", "'val'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "','", "'.'", "'\"'", "'''", "'='", "'>'", 
			"'<'", "'!'", "'~'", "'?'", "':'", "'<='", "'>='", "'=='", "'!='", "'&&'", 
			"'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'//'", "'/'", "'**'", "'&'", 
			"'|'", "'^'", "'%'", "'<<'", "'>>'", "'>>>'", "'+='", "'-='", "'*='", 
			"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "I", "CIS", "PI", "EXP", "TRUE", "FALSE", "STRING", 
			"CHAR", "UFLOAT", "FLOAT", "UINT", "INT", "SEMI", "VAR", "VAL", "LPAREN", 
			"RPAREN", "LBRACKET", "RBRACKET", "LCURLY", "RCURLY", "COMMA", "DOT", 
			"QUOTES", "QUOTE", "ASSIGN", "GT", "LT", "NOT", "TILDE", "QUESTION", 
			"COLON", "LE", "GE", "EQUAL", "NOT_EQUAL", "AND_AND", "OR_OR", "INC", 
			"DEC", "ADD", "SUB", "MUL", "DIV_INT", "DIV", "POW", "AND", "OR", "XOR", 
			"MOD", "LSHIFT", "RSHIFT", "URSHIFT", "ASSIGN_ADD", "ASSIGN_SUB", "ASSIGN_MUL", 
			"ASSIGN_DIV", "ASSIGN_AND", "ASSIGN_OR", "ASSIGN_XOR", "ASSIGN_MOD", 
			"ASSIGN_LSHIFT", "ASSIGN_RSHIFT", "ASSIGN_URSHIFT", "NEWLINE", "WS", 
			"IDENTIFIER"
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
	public String getGrammarFileName() { return "MathExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MathExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InputContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public ArithmeticListContext arithmeticList() {
			return getRuleContext(ArithmeticListContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MathExpressionParser.NEWLINE, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				assignmentList();
				}
				break;
			case I:
			case CIS:
			case PI:
			case EXP:
			case TRUE:
			case FALSE:
			case STRING:
			case CHAR:
			case UFLOAT:
			case FLOAT:
			case UINT:
			case INT:
			case LPAREN:
			case LBRACKET:
			case NOT:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				arithmeticList();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				match(NEWLINE);
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

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MathExpressionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MathExpressionParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MathExpressionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MathExpressionParser.COMMA, i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			assignment();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==NEWLINE) {
				{
				{
				setState(26);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(27);
				assignment();
				}
				}
				setState(32);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MathExpressionParser.IDENTIFIER, 0); }
		public TerminalNode VAL() { return getToken(MathExpressionParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(MathExpressionParser.VAR, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==VAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(34);
			match(IDENTIFIER);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (ASSIGN - 29)) | (1L << (ASSIGN_ADD - 29)) | (1L << (ASSIGN_SUB - 29)) | (1L << (ASSIGN_MUL - 29)) | (1L << (ASSIGN_DIV - 29)) | (1L << (ASSIGN_AND - 29)) | (1L << (ASSIGN_OR - 29)) | (1L << (ASSIGN_XOR - 29)) | (1L << (ASSIGN_MOD - 29)) | (1L << (ASSIGN_LSHIFT - 29)) | (1L << (ASSIGN_RSHIFT - 29)) | (1L << (ASSIGN_URSHIFT - 29)))) != 0)) {
				{
				setState(35);
				assignmentOperator();
				setState(36);
				assignment();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(MathExpressionParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_ADD() { return getToken(MathExpressionParser.ASSIGN_ADD, 0); }
		public TerminalNode ASSIGN_SUB() { return getToken(MathExpressionParser.ASSIGN_SUB, 0); }
		public TerminalNode ASSIGN_MUL() { return getToken(MathExpressionParser.ASSIGN_MUL, 0); }
		public TerminalNode ASSIGN_DIV() { return getToken(MathExpressionParser.ASSIGN_DIV, 0); }
		public TerminalNode ASSIGN_AND() { return getToken(MathExpressionParser.ASSIGN_AND, 0); }
		public TerminalNode ASSIGN_OR() { return getToken(MathExpressionParser.ASSIGN_OR, 0); }
		public TerminalNode ASSIGN_XOR() { return getToken(MathExpressionParser.ASSIGN_XOR, 0); }
		public TerminalNode ASSIGN_MOD() { return getToken(MathExpressionParser.ASSIGN_MOD, 0); }
		public TerminalNode ASSIGN_LSHIFT() { return getToken(MathExpressionParser.ASSIGN_LSHIFT, 0); }
		public TerminalNode ASSIGN_RSHIFT() { return getToken(MathExpressionParser.ASSIGN_RSHIFT, 0); }
		public TerminalNode ASSIGN_URSHIFT() { return getToken(MathExpressionParser.ASSIGN_URSHIFT, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !(((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (ASSIGN - 29)) | (1L << (ASSIGN_ADD - 29)) | (1L << (ASSIGN_SUB - 29)) | (1L << (ASSIGN_MUL - 29)) | (1L << (ASSIGN_DIV - 29)) | (1L << (ASSIGN_AND - 29)) | (1L << (ASSIGN_OR - 29)) | (1L << (ASSIGN_XOR - 29)) | (1L << (ASSIGN_MOD - 29)) | (1L << (ASSIGN_LSHIFT - 29)) | (1L << (ASSIGN_RSHIFT - 29)) | (1L << (ASSIGN_URSHIFT - 29)))) != 0)) ) {
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

	public static class ArithmeticListContext extends ParserRuleContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MathExpressionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MathExpressionParser.COMMA, i);
		}
		public ArithmeticListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterArithmeticList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitArithmeticList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitArithmeticList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticListContext arithmeticList() throws RecognitionException {
		ArithmeticListContext _localctx = new ArithmeticListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arithmeticList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			arithmetic(0);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(43);
				match(COMMA);
				setState(44);
				arithmetic(0);
				}
				}
				setState(49);
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

	public static class ArithmeticContext extends ParserRuleContext {
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
	 
		public ArithmeticContext() { }
		public void copyFrom(ArithmeticContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShiftContext extends ArithmeticContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode LSHIFT() { return getToken(MathExpressionParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(MathExpressionParser.RSHIFT, 0); }
		public TerminalNode URSHIFT() { return getToken(MathExpressionParser.URSHIFT, 0); }
		public ShiftContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitShift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitShift(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ArithmeticContext {
		public TerminalNode IDENTIFIER() { return getToken(MathExpressionParser.IDENTIFIER, 0); }
		public VariableContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NestedArithmeticContext extends ArithmeticContext {
		public TerminalNode LPAREN() { return getToken(MathExpressionParser.LPAREN, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MathExpressionParser.RPAREN, 0); }
		public NestedArithmeticContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterNestedArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitNestedArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitNestedArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ArithmeticContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode ADD() { return getToken(MathExpressionParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MathExpressionParser.SUB, 0); }
		public AddSubContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryContext extends ArithmeticContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(MathExpressionParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(MathExpressionParser.COLON, 0); }
		public TernaryContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitTernary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitTernary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataStructureContext extends ArithmeticContext {
		public StructureContext structure() {
			return getRuleContext(StructureContext.class,0);
		}
		public DataStructureContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterDataStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitDataStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitDataStructure(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnyConstantContext extends ArithmeticContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public AnyConstantContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterAnyConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitAnyConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitAnyConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrefixContext extends ArithmeticContext {
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MathExpressionParser.NOT, 0); }
		public TerminalNode TILDE() { return getToken(MathExpressionParser.TILDE, 0); }
		public TerminalNode ADD() { return getToken(MathExpressionParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MathExpressionParser.SUB, 0); }
		public TerminalNode INC() { return getToken(MathExpressionParser.INC, 0); }
		public TerminalNode DEC() { return getToken(MathExpressionParser.DEC, 0); }
		public PrefixContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RangeContext extends ArithmeticContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(MathExpressionParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MathExpressionParser.COLON, i);
		}
		public RangeContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultDivContext extends ArithmeticContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode MUL() { return getToken(MathExpressionParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MathExpressionParser.DIV, 0); }
		public TerminalNode DIV_INT() { return getToken(MathExpressionParser.DIV_INT, 0); }
		public MultDivContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionContext extends ArithmeticContext {
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MathExpressionParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MathExpressionParser.RPAREN, 0); }
		public ArithmeticListContext arithmeticList() {
			return getRuleContext(ArithmeticListContext.class,0);
		}
		public FunctionContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostfixContext extends ArithmeticContext {
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public TerminalNode INC() { return getToken(MathExpressionParser.INC, 0); }
		public TerminalNode DEC() { return getToken(MathExpressionParser.DEC, 0); }
		public PostfixContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PureImaginaryContext extends ArithmeticContext {
		public TerminalNode I() { return getToken(MathExpressionParser.I, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public PureImaginaryContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterPureImaginary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitPureImaginary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitPureImaginary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModulusContext extends ArithmeticContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode MOD() { return getToken(MathExpressionParser.MOD, 0); }
		public ModulusContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterModulus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitModulus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitModulus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelativeComparisonContext extends ArithmeticContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode LT() { return getToken(MathExpressionParser.LT, 0); }
		public TerminalNode LE() { return getToken(MathExpressionParser.LE, 0); }
		public TerminalNode GT() { return getToken(MathExpressionParser.GT, 0); }
		public TerminalNode GE() { return getToken(MathExpressionParser.GE, 0); }
		public RelativeComparisonContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterRelativeComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitRelativeComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitRelativeComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalAndOrContext extends ArithmeticContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode AND_AND() { return getToken(MathExpressionParser.AND_AND, 0); }
		public TerminalNode OR_OR() { return getToken(MathExpressionParser.OR_OR, 0); }
		public LogicalAndOrContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterLogicalAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitLogicalAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitLogicalAndOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayIndexingContext extends ArithmeticContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(MathExpressionParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(MathExpressionParser.RBRACKET, 0); }
		public ArrayIndexingContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterArrayIndexing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitArrayIndexing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitArrayIndexing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitOpContext extends ArithmeticContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode OR() { return getToken(MathExpressionParser.OR, 0); }
		public TerminalNode XOR() { return getToken(MathExpressionParser.XOR, 0); }
		public TerminalNode AND() { return getToken(MathExpressionParser.AND, 0); }
		public BitOpContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterBitOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitBitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitBitOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerContext extends ArithmeticContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode POW() { return getToken(MathExpressionParser.POW, 0); }
		public PowerContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityComparisonContext extends ArithmeticContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(MathExpressionParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(MathExpressionParser.NOT_EQUAL, 0); }
		public EqualityComparisonContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterEqualityComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitEqualityComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitEqualityComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		return arithmetic(0);
	}

	private ArithmeticContext arithmetic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, _parentState);
		ArithmeticContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_arithmetic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CIS:
			case PI:
			case EXP:
			case TRUE:
			case FALSE:
			case STRING:
			case CHAR:
			case UFLOAT:
			case FLOAT:
			case UINT:
			case INT:
				{
				_localctx = new AnyConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51);
				constant();
				}
				break;
			case LBRACKET:
				{
				_localctx = new DataStructureContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				structure();
				}
				break;
			case NOT:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
				{
				_localctx = new PrefixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(54);
				arithmetic(16);
				}
				break;
			case LPAREN:
				{
				_localctx = new NestedArithmeticContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(LPAREN);
				setState(56);
				arithmetic(0);
				setState(57);
				match(RPAREN);
				}
				break;
			case I:
				{
				_localctx = new PureImaginaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(I);
				setState(60);
				arithmetic(3);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new RangeContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(64);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(65);
						match(COLON);
						setState(66);
						arithmetic(0);
						setState(67);
						match(COLON);
						setState(68);
						arithmetic(18);
						}
						break;
					case 2:
						{
						_localctx = new PowerContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(70);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(71);
						match(POW);
						setState(72);
						arithmetic(14);
						}
						break;
					case 3:
						{
						_localctx = new MultDivContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(73);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(74);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV_INT) | (1L << DIV))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(75);
						arithmetic(14);
						}
						break;
					case 4:
						{
						_localctx = new AddSubContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(76);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(77);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(78);
						arithmetic(13);
						}
						break;
					case 5:
						{
						_localctx = new BitOpContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(79);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(80);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(81);
						arithmetic(12);
						}
						break;
					case 6:
						{
						_localctx = new ModulusContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(82);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(83);
						match(MOD);
						setState(84);
						arithmetic(10);
						}
						break;
					case 7:
						{
						_localctx = new LogicalAndOrContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(85);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(86);
						_la = _input.LA(1);
						if ( !(_la==AND_AND || _la==OR_OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(87);
						arithmetic(10);
						}
						break;
					case 8:
						{
						_localctx = new RelativeComparisonContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(88);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(89);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(90);
						arithmetic(9);
						}
						break;
					case 9:
						{
						_localctx = new EqualityComparisonContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(91);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(92);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(93);
						arithmetic(8);
						}
						break;
					case 10:
						{
						_localctx = new ShiftContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(94);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(95);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LSHIFT) | (1L << RSHIFT) | (1L << URSHIFT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(96);
						arithmetic(6);
						}
						break;
					case 11:
						{
						_localctx = new TernaryContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(97);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(98);
						match(QUESTION);
						setState(99);
						arithmetic(0);
						setState(100);
						match(COLON);
						setState(101);
						arithmetic(4);
						}
						break;
					case 12:
						{
						_localctx = new FunctionContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(103);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(104);
						match(LPAREN);
						setState(106);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << I) | (1L << CIS) | (1L << PI) | (1L << EXP) | (1L << TRUE) | (1L << FALSE) | (1L << STRING) | (1L << CHAR) | (1L << UFLOAT) | (1L << FLOAT) | (1L << UINT) | (1L << INT) | (1L << LPAREN) | (1L << LBRACKET) | (1L << NOT) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
							{
							setState(105);
							arithmeticList();
							}
						}

						setState(108);
						match(RPAREN);
						}
						break;
					case 13:
						{
						_localctx = new ArrayIndexingContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(109);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(110);
						match(LBRACKET);
						setState(111);
						arithmetic(0);
						setState(112);
						match(RBRACKET);
						}
						break;
					case 14:
						{
						_localctx = new PostfixContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(114);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(115);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 15:
						{
						_localctx = new PureImaginaryContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(116);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(117);
						match(I);
						}
						break;
					}
					} 
				}
				setState(122);
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

	public static class StructureContext extends ParserRuleContext {
		public StructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure; }
	 
		public StructureContext() { }
		public void copyFrom(StructureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetContext extends StructureContext {
		public TerminalNode LBRACKET() { return getToken(MathExpressionParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(MathExpressionParser.RBRACKET, 0); }
		public ArithmeticListContext arithmeticList() {
			return getRuleContext(ArithmeticListContext.class,0);
		}
		public SetContext(StructureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MatrixContext extends StructureContext {
		public List<TerminalNode> LBRACKET() { return getTokens(MathExpressionParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(MathExpressionParser.LBRACKET, i);
		}
		public List<TerminalNode> UINT() { return getTokens(MathExpressionParser.UINT); }
		public TerminalNode UINT(int i) {
			return getToken(MathExpressionParser.UINT, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(MathExpressionParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(MathExpressionParser.RBRACKET, i);
		}
		public TerminalNode LCURLY() { return getToken(MathExpressionParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(MathExpressionParser.RCURLY, 0); }
		public ArithmeticListContext arithmeticList() {
			return getRuleContext(ArithmeticListContext.class,0);
		}
		public MatrixContext(StructureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitMatrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitMatrix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VectorContext extends StructureContext {
		public TerminalNode LBRACKET() { return getToken(MathExpressionParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(MathExpressionParser.RBRACKET, 0); }
		public ArithmeticListContext arithmeticList() {
			return getRuleContext(ArithmeticListContext.class,0);
		}
		public VectorContext(StructureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureContext structure() throws RecognitionException {
		StructureContext _localctx = new StructureContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_structure);
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new SetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(LBRACKET);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << I) | (1L << CIS) | (1L << PI) | (1L << EXP) | (1L << TRUE) | (1L << FALSE) | (1L << STRING) | (1L << CHAR) | (1L << UFLOAT) | (1L << FLOAT) | (1L << UINT) | (1L << INT) | (1L << LPAREN) | (1L << LBRACKET) | (1L << NOT) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
					{
					setState(124);
					arithmeticList();
					}
				}

				setState(127);
				match(RBRACKET);
				setState(128);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new VectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(LBRACKET);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << I) | (1L << CIS) | (1L << PI) | (1L << EXP) | (1L << TRUE) | (1L << FALSE) | (1L << STRING) | (1L << CHAR) | (1L << UFLOAT) | (1L << FLOAT) | (1L << UINT) | (1L << INT) | (1L << LPAREN) | (1L << LBRACKET) | (1L << NOT) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
					{
					setState(130);
					arithmeticList();
					}
				}

				setState(133);
				match(RBRACKET);
				}
				break;
			case 3:
				_localctx = new MatrixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(LBRACKET);
				setState(135);
				match(UINT);
				setState(136);
				match(RBRACKET);
				setState(137);
				match(LBRACKET);
				setState(138);
				match(UINT);
				setState(139);
				match(RBRACKET);
				setState(140);
				match(LCURLY);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << I) | (1L << CIS) | (1L << PI) | (1L << EXP) | (1L << TRUE) | (1L << FALSE) | (1L << STRING) | (1L << CHAR) | (1L << UFLOAT) | (1L << FLOAT) | (1L << UINT) | (1L << INT) | (1L << LPAREN) | (1L << LBRACKET) | (1L << NOT) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
					{
					setState(141);
					arithmeticList();
					}
				}

				setState(144);
				match(RCURLY);
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(145);
					_la = _input.LA(1);
					if ( !(_la==T__1 || _la==T__2) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
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

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatContext extends ConstantContext {
		public TerminalNode UFLOAT() { return getToken(MathExpressionParser.UFLOAT, 0); }
		public TerminalNode FLOAT() { return getToken(MathExpressionParser.FLOAT, 0); }
		public FloatContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CisComplexContext extends ConstantContext {
		public TerminalNode CIS() { return getToken(MathExpressionParser.CIS, 0); }
		public TerminalNode LPAREN() { return getToken(MathExpressionParser.LPAREN, 0); }
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(MathExpressionParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(MathExpressionParser.RPAREN, 0); }
		public CisComplexContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterCisComplex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitCisComplex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitCisComplex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharContext extends ConstantContext {
		public TerminalNode CHAR() { return getToken(MathExpressionParser.CHAR, 0); }
		public CharContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends ConstantContext {
		public TerminalNode TRUE() { return getToken(MathExpressionParser.TRUE, 0); }
		public TrueContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PiContext extends ConstantContext {
		public TerminalNode PI() { return getToken(MathExpressionParser.PI, 0); }
		public PiContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterPi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitPi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitPi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends ConstantContext {
		public TerminalNode FALSE() { return getToken(MathExpressionParser.FALSE, 0); }
		public FalseContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ConstantContext {
		public TerminalNode STRING() { return getToken(MathExpressionParser.STRING, 0); }
		public StringContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpContext extends ConstantContext {
		public TerminalNode EXP() { return getToken(MathExpressionParser.EXP, 0); }
		public ExpContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ConstantContext {
		public TerminalNode UINT() { return getToken(MathExpressionParser.UINT, 0); }
		public TerminalNode INT() { return getToken(MathExpressionParser.INT, 0); }
		public IntContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathExpressionListener ) ((MathExpressionListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathExpressionVisitor ) return ((MathExpressionVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constant);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(FALSE);
				}
				break;
			case PI:
				_localctx = new PiContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(PI);
				}
				break;
			case EXP:
				_localctx = new ExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(EXP);
				}
				break;
			case UFLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				match(UFLOAT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(155);
				match(FLOAT);
				}
				break;
			case UINT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(156);
				match(UINT);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(157);
				match(INT);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(158);
				match(STRING);
				}
				break;
			case CHAR:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(159);
				match(CHAR);
				}
				break;
			case CIS:
				_localctx = new CisComplexContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(160);
				match(CIS);
				setState(161);
				match(LPAREN);
				setState(162);
				arithmetic(0);
				setState(163);
				match(COMMA);
				setState(164);
				arithmetic(0);
				setState(165);
				match(RPAREN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return arithmetic_sempred((ArithmeticContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmetic_sempred(ArithmeticContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 19);
		case 12:
			return precpred(_ctx, 18);
		case 13:
			return precpred(_ctx, 15);
		case 14:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u00ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\3\5\3\32\n\3\3\4\3\4\3\4\7\4\37\n\4\f\4\16\4\"\13\4\3\5\3\5"+
		"\3\5\3\5\3\5\5\5)\n\5\3\6\3\6\3\7\3\7\3\7\7\7\60\n\7\f\7\16\7\63\13\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bA\n\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\bm\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"y\n\b\f\b\16\b|\13\b\3\t\3\t\5\t\u0080\n\t\3\t\3\t\3\t\3\t\5\t\u0086\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0091\n\t\3\t\3\t\5\t\u0095"+
		"\n\t\5\t\u0097\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u00aa\n\n\3\n\2\3\16\13\2\4\6\b\n\f\16\20\22\2\17"+
		"\4\2\33\33FF\3\2\23\24\4\2\37\37;E\4\2\"#,/\3\2\60\62\3\2./\3\2\64\66"+
		"\3\2*+\4\2 !&\'\3\2()\3\28:\3\2,-\3\2\4\5\2\u00cc\2\24\3\2\2\2\4\31\3"+
		"\2\2\2\6\33\3\2\2\2\b#\3\2\2\2\n*\3\2\2\2\f,\3\2\2\2\16@\3\2\2\2\20\u0096"+
		"\3\2\2\2\22\u00a9\3\2\2\2\24\25\5\4\3\2\25\3\3\2\2\2\26\32\5\6\4\2\27"+
		"\32\5\f\7\2\30\32\7F\2\2\31\26\3\2\2\2\31\27\3\2\2\2\31\30\3\2\2\2\32"+
		"\5\3\2\2\2\33 \5\b\5\2\34\35\t\2\2\2\35\37\5\b\5\2\36\34\3\2\2\2\37\""+
		"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\7\3\2\2\2\" \3\2\2\2#$\t\3\2\2$(\7H\2"+
		"\2%&\5\n\6\2&\'\5\b\5\2\')\3\2\2\2(%\3\2\2\2()\3\2\2\2)\t\3\2\2\2*+\t"+
		"\4\2\2+\13\3\2\2\2,\61\5\16\b\2-.\7\33\2\2.\60\5\16\b\2/-\3\2\2\2\60\63"+
		"\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\r\3\2\2\2\63\61\3\2\2\2\64\65\b"+
		"\b\1\2\65A\5\22\n\2\66A\5\20\t\2\678\t\5\2\28A\5\16\b\229:\7\25\2\2:;"+
		"\5\16\b\2;<\7\26\2\2<A\3\2\2\2=>\7\6\2\2>A\5\16\b\5?A\7H\2\2@\64\3\2\2"+
		"\2@\66\3\2\2\2@\67\3\2\2\2@9\3\2\2\2@=\3\2\2\2@?\3\2\2\2Az\3\2\2\2BC\f"+
		"\23\2\2CD\7%\2\2DE\5\16\b\2EF\7%\2\2FG\5\16\b\24Gy\3\2\2\2HI\f\20\2\2"+
		"IJ\7\63\2\2Jy\5\16\b\20KL\f\17\2\2LM\t\6\2\2My\5\16\b\20NO\f\16\2\2OP"+
		"\t\7\2\2Py\5\16\b\17QR\f\r\2\2RS\t\b\2\2Sy\5\16\b\16TU\f\f\2\2UV\7\67"+
		"\2\2Vy\5\16\b\fWX\f\13\2\2XY\t\t\2\2Yy\5\16\b\fZ[\f\n\2\2[\\\t\n\2\2\\"+
		"y\5\16\b\13]^\f\t\2\2^_\t\13\2\2_y\5\16\b\n`a\f\b\2\2ab\t\f\2\2by\5\16"+
		"\b\bcd\f\6\2\2de\7$\2\2ef\5\16\b\2fg\7%\2\2gh\5\16\b\6hy\3\2\2\2ij\f\25"+
		"\2\2jl\7\25\2\2km\5\f\7\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2ny\7\26\2\2op\f"+
		"\24\2\2pq\7\27\2\2qr\5\16\b\2rs\7\30\2\2sy\3\2\2\2tu\f\21\2\2uy\t\r\2"+
		"\2vw\f\4\2\2wy\7\6\2\2xB\3\2\2\2xH\3\2\2\2xK\3\2\2\2xN\3\2\2\2xQ\3\2\2"+
		"\2xT\3\2\2\2xW\3\2\2\2xZ\3\2\2\2x]\3\2\2\2x`\3\2\2\2xc\3\2\2\2xi\3\2\2"+
		"\2xo\3\2\2\2xt\3\2\2\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\17\3\2"+
		"\2\2|z\3\2\2\2}\177\7\27\2\2~\u0080\5\f\7\2\177~\3\2\2\2\177\u0080\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\30\2\2\u0082\u0097\7\3\2\2\u0083"+
		"\u0085\7\27\2\2\u0084\u0086\5\f\7\2\u0085\u0084\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0097\7\30\2\2\u0088\u0089\7\27\2\2\u0089"+
		"\u008a\7\20\2\2\u008a\u008b\7\30\2\2\u008b\u008c\7\27\2\2\u008c\u008d"+
		"\7\20\2\2\u008d\u008e\7\30\2\2\u008e\u0090\7\31\2\2\u008f\u0091\5\f\7"+
		"\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094"+
		"\7\32\2\2\u0093\u0095\t\16\2\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2"+
		"\u0095\u0097\3\2\2\2\u0096}\3\2\2\2\u0096\u0083\3\2\2\2\u0096\u0088\3"+
		"\2\2\2\u0097\21\3\2\2\2\u0098\u00aa\7\n\2\2\u0099\u00aa\7\13\2\2\u009a"+
		"\u00aa\7\b\2\2\u009b\u00aa\7\t\2\2\u009c\u00aa\7\16\2\2\u009d\u00aa\7"+
		"\17\2\2\u009e\u00aa\7\20\2\2\u009f\u00aa\7\21\2\2\u00a0\u00aa\7\f\2\2"+
		"\u00a1\u00aa\7\r\2\2\u00a2\u00a3\7\7\2\2\u00a3\u00a4\7\25\2\2\u00a4\u00a5"+
		"\5\16\b\2\u00a5\u00a6\7\33\2\2\u00a6\u00a7\5\16\b\2\u00a7\u00a8\7\26\2"+
		"\2\u00a8\u00aa\3\2\2\2\u00a9\u0098\3\2\2\2\u00a9\u0099\3\2\2\2\u00a9\u009a"+
		"\3\2\2\2\u00a9\u009b\3\2\2\2\u00a9\u009c\3\2\2\2\u00a9\u009d\3\2\2\2\u00a9"+
		"\u009e\3\2\2\2\u00a9\u009f\3\2\2\2\u00a9\u00a0\3\2\2\2\u00a9\u00a1\3\2"+
		"\2\2\u00a9\u00a2\3\2\2\2\u00aa\23\3\2\2\2\20\31 (\61@lxz\177\u0085\u0090"+
		"\u0094\u0096\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}