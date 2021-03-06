// Generated from .\MathExpression.g4 by ANTLR 4.9.1

	package calc.generated;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MathExpressionLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "I", "CIS", "PI", "EXP", "TRUE", "FALSE", "STRING", 
			"CHAR", "UFLOAT", "FLOAT", "UINT", "INT", "SEMI", "VAR", "VAL", "LPAREN", 
			"RPAREN", "LBRACKET", "RBRACKET", "LCURLY", "RCURLY", "COMMA", "DOT", 
			"QUOTES", "QUOTE", "ASSIGN", "GT", "LT", "NOT", "TILDE", "QUESTION", 
			"COLON", "LE", "GE", "EQUAL", "NOT_EQUAL", "AND_AND", "OR_OR", "INC", 
			"DEC", "ADD", "SUB", "MUL", "DIV_INT", "DIV", "POW", "AND", "OR", "XOR", 
			"MOD", "LSHIFT", "RSHIFT", "URSHIFT", "ASSIGN_ADD", "ASSIGN_SUB", "ASSIGN_MUL", 
			"ASSIGN_DIV", "ASSIGN_AND", "ASSIGN_OR", "ASSIGN_XOR", "ASSIGN_MOD", 
			"ASSIGN_LSHIFT", "ASSIGN_RSHIFT", "ASSIGN_URSHIFT", "ALPHANUMERAL", "DIGITS", 
			"DIGIT", "HEX_DIGIT", "ESC", "NEWLINE", "WS", "IDENTIFIER"
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


	public MathExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MathExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2H\u018e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\7\13\u00b9\n\13\f\13\16\13\u00bc\13\13\3\13\3\13\3\f\3\f\6"+
		"\f\u00c2\n\f\r\f\16\f\u00c3\3\f\3\f\3\f\3\f\3\f\5\f\u00cb\n\f\3\r\3\r"+
		"\3\r\5\r\u00d0\n\r\3\r\5\r\u00d3\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\6\17\u00dc\n\17\r\17\16\17\u00dd\5\17\u00e0\n\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&"+
		"\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-"+
		"\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3"+
		"\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\39\3:\3:\3:\3"+
		";\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3"+
		"B\3B\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3F\6F\u0171\nF\rF\16F\u0172\3G\3"+
		"G\3H\3H\3I\3I\3I\3J\5J\u017d\nJ\3J\3J\3K\6K\u0182\nK\rK\16K\u0183\3K\3"+
		"K\3L\3L\7L\u018a\nL\fL\16L\u018d\13L\3\u00ba\2M\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093F"+
		"\u0095G\u0097H\3\2\24\4\2RRrr\4\2KKkk\4\2GGgg\4\2VVvv\4\2TTtt\4\2WWww"+
		"\4\2HHhh\4\2CCcc\4\2NNnn\4\2UUuu\4\2ZZzz\5\2\62;C\\c|\3\2\62;\5\2\62;"+
		"CHch\b\2$$^^ddppttvv\4\2\13\13\"\"\5\2C\\aac|\6\2\62;C\\aac|\2\u0194\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\3\u0099\3\2\2\2\5\u009b\3\2\2\2\7\u009d\3\2\2\2\t\u009f\3\2\2\2\13"+
		"\u00a1\3\2\2\2\r\u00a5\3\2\2\2\17\u00a8\3\2\2\2\21\u00aa\3\2\2\2\23\u00af"+
		"\3\2\2\2\25\u00b5\3\2\2\2\27\u00ca\3\2\2\2\31\u00cc\3\2\2\2\33\u00d4\3"+
		"\2\2\2\35\u00df\3\2\2\2\37\u00e1\3\2\2\2!\u00e4\3\2\2\2#\u00e6\3\2\2\2"+
		"%\u00ea\3\2\2\2\'\u00ee\3\2\2\2)\u00f0\3\2\2\2+\u00f2\3\2\2\2-\u00f4\3"+
		"\2\2\2/\u00f6\3\2\2\2\61\u00f8\3\2\2\2\63\u00fa\3\2\2\2\65\u00fc\3\2\2"+
		"\2\67\u00fe\3\2\2\29\u0100\3\2\2\2;\u0102\3\2\2\2=\u0104\3\2\2\2?\u0106"+
		"\3\2\2\2A\u0108\3\2\2\2C\u010a\3\2\2\2E\u010c\3\2\2\2G\u010e\3\2\2\2I"+
		"\u0110\3\2\2\2K\u0113\3\2\2\2M\u0116\3\2\2\2O\u0119\3\2\2\2Q\u011c\3\2"+
		"\2\2S\u011f\3\2\2\2U\u0122\3\2\2\2W\u0125\3\2\2\2Y\u0128\3\2\2\2[\u012a"+
		"\3\2\2\2]\u012c\3\2\2\2_\u012e\3\2\2\2a\u0131\3\2\2\2c\u0133\3\2\2\2e"+
		"\u0136\3\2\2\2g\u0138\3\2\2\2i\u013a\3\2\2\2k\u013c\3\2\2\2m\u013e\3\2"+
		"\2\2o\u0141\3\2\2\2q\u0144\3\2\2\2s\u0148\3\2\2\2u\u014b\3\2\2\2w\u014e"+
		"\3\2\2\2y\u0151\3\2\2\2{\u0154\3\2\2\2}\u0157\3\2\2\2\177\u015a\3\2\2"+
		"\2\u0081\u015d\3\2\2\2\u0083\u0160\3\2\2\2\u0085\u0164\3\2\2\2\u0087\u0168"+
		"\3\2\2\2\u0089\u016d\3\2\2\2\u008b\u0170\3\2\2\2\u008d\u0174\3\2\2\2\u008f"+
		"\u0176\3\2\2\2\u0091\u0178\3\2\2\2\u0093\u017c\3\2\2\2\u0095\u0181\3\2"+
		"\2\2\u0097\u0187\3\2\2\2\u0099\u009a\7u\2\2\u009a\4\3\2\2\2\u009b\u009c"+
		"\7t\2\2\u009c\6\3\2\2\2\u009d\u009e\7e\2\2\u009e\b\3\2\2\2\u009f\u00a0"+
		"\7k\2\2\u00a0\n\3\2\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4"+
		"\7u\2\2\u00a4\f\3\2\2\2\u00a5\u00a6\t\2\2\2\u00a6\u00a7\t\3\2\2\u00a7"+
		"\16\3\2\2\2\u00a8\u00a9\t\4\2\2\u00a9\20\3\2\2\2\u00aa\u00ab\t\5\2\2\u00ab"+
		"\u00ac\t\6\2\2\u00ac\u00ad\t\7\2\2\u00ad\u00ae\t\4\2\2\u00ae\22\3\2\2"+
		"\2\u00af\u00b0\t\b\2\2\u00b0\u00b1\t\t\2\2\u00b1\u00b2\t\n\2\2\u00b2\u00b3"+
		"\t\13\2\2\u00b3\u00b4\t\4\2\2\u00b4\24\3\2\2\2\u00b5\u00ba\5\67\34\2\u00b6"+
		"\u00b9\5\u0091I\2\u00b7\u00b9\13\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\5\67\34\2\u00be\26\3\2"+
		"\2\2\u00bf\u00c1\59\35\2\u00c0\u00c2\5\u0089E\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c6\59\35\2\u00c6\u00cb\3\2\2\2\u00c7\u00c8\5\u008bF\2\u00c8"+
		"\u00c9\7e\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00bf\3\2\2\2\u00ca\u00c7\3\2"+
		"\2\2\u00cb\30\3\2\2\2\u00cc\u00d2\5\35\17\2\u00cd\u00cf\5\65\33\2\u00ce"+
		"\u00d0\5\35\17\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3"+
		"\2\2\2\u00d1\u00d3\7h\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\32\3\2\2\2\u00d4\u00d5\5[.\2\u00d5\u00d6\5\31\r\2\u00d6\34\3\2\2\2\u00d7"+
		"\u00e0\5\u008bF\2\u00d8\u00d9\7\62\2\2\u00d9\u00db\t\f\2\2\u00da\u00dc"+
		"\5\u008fH\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2"+
		"\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00d7\3\2\2\2\u00df\u00d8"+
		"\3\2\2\2\u00e0\36\3\2\2\2\u00e1\u00e2\5[.\2\u00e2\u00e3\5\35\17\2\u00e3"+
		" \3\2\2\2\u00e4\u00e5\7=\2\2\u00e5\"\3\2\2\2\u00e6\u00e7\7x\2\2\u00e7"+
		"\u00e8\7c\2\2\u00e8\u00e9\7t\2\2\u00e9$\3\2\2\2\u00ea\u00eb\7x\2\2\u00eb"+
		"\u00ec\7c\2\2\u00ec\u00ed\7n\2\2\u00ed&\3\2\2\2\u00ee\u00ef\7*\2\2\u00ef"+
		"(\3\2\2\2\u00f0\u00f1\7+\2\2\u00f1*\3\2\2\2\u00f2\u00f3\7]\2\2\u00f3,"+
		"\3\2\2\2\u00f4\u00f5\7_\2\2\u00f5.\3\2\2\2\u00f6\u00f7\7}\2\2\u00f7\60"+
		"\3\2\2\2\u00f8\u00f9\7\177\2\2\u00f9\62\3\2\2\2\u00fa\u00fb\7.\2\2\u00fb"+
		"\64\3\2\2\2\u00fc\u00fd\7\60\2\2\u00fd\66\3\2\2\2\u00fe\u00ff\7$\2\2\u00ff"+
		"8\3\2\2\2\u0100\u0101\7)\2\2\u0101:\3\2\2\2\u0102\u0103\7?\2\2\u0103<"+
		"\3\2\2\2\u0104\u0105\7@\2\2\u0105>\3\2\2\2\u0106\u0107\7>\2\2\u0107@\3"+
		"\2\2\2\u0108\u0109\7#\2\2\u0109B\3\2\2\2\u010a\u010b\7\u0080\2\2\u010b"+
		"D\3\2\2\2\u010c\u010d\7A\2\2\u010dF\3\2\2\2\u010e\u010f\7<\2\2\u010fH"+
		"\3\2\2\2\u0110\u0111\7>\2\2\u0111\u0112\7?\2\2\u0112J\3\2\2\2\u0113\u0114"+
		"\7@\2\2\u0114\u0115\7?\2\2\u0115L\3\2\2\2\u0116\u0117\7?\2\2\u0117\u0118"+
		"\7?\2\2\u0118N\3\2\2\2\u0119\u011a\7#\2\2\u011a\u011b\7?\2\2\u011bP\3"+
		"\2\2\2\u011c\u011d\7(\2\2\u011d\u011e\7(\2\2\u011eR\3\2\2\2\u011f\u0120"+
		"\7~\2\2\u0120\u0121\7~\2\2\u0121T\3\2\2\2\u0122\u0123\7-\2\2\u0123\u0124"+
		"\7-\2\2\u0124V\3\2\2\2\u0125\u0126\7/\2\2\u0126\u0127\7/\2\2\u0127X\3"+
		"\2\2\2\u0128\u0129\7-\2\2\u0129Z\3\2\2\2\u012a\u012b\7/\2\2\u012b\\\3"+
		"\2\2\2\u012c\u012d\7,\2\2\u012d^\3\2\2\2\u012e\u012f\7\61\2\2\u012f\u0130"+
		"\7\61\2\2\u0130`\3\2\2\2\u0131\u0132\7\61\2\2\u0132b\3\2\2\2\u0133\u0134"+
		"\7,\2\2\u0134\u0135\7,\2\2\u0135d\3\2\2\2\u0136\u0137\7(\2\2\u0137f\3"+
		"\2\2\2\u0138\u0139\7~\2\2\u0139h\3\2\2\2\u013a\u013b\7`\2\2\u013bj\3\2"+
		"\2\2\u013c\u013d\7\'\2\2\u013dl\3\2\2\2\u013e\u013f\7>\2\2\u013f\u0140"+
		"\7>\2\2\u0140n\3\2\2\2\u0141\u0142\7@\2\2\u0142\u0143\7@\2\2\u0143p\3"+
		"\2\2\2\u0144\u0145\7@\2\2\u0145\u0146\7@\2\2\u0146\u0147\7@\2\2\u0147"+
		"r\3\2\2\2\u0148\u0149\7-\2\2\u0149\u014a\7?\2\2\u014at\3\2\2\2\u014b\u014c"+
		"\7/\2\2\u014c\u014d\7?\2\2\u014dv\3\2\2\2\u014e\u014f\7,\2\2\u014f\u0150"+
		"\7?\2\2\u0150x\3\2\2\2\u0151\u0152\7\61\2\2\u0152\u0153\7?\2\2\u0153z"+
		"\3\2\2\2\u0154\u0155\7(\2\2\u0155\u0156\7?\2\2\u0156|\3\2\2\2\u0157\u0158"+
		"\7~\2\2\u0158\u0159\7?\2\2\u0159~\3\2\2\2\u015a\u015b\7`\2\2\u015b\u015c"+
		"\7?\2\2\u015c\u0080\3\2\2\2\u015d\u015e\7\'\2\2\u015e\u015f\7?\2\2\u015f"+
		"\u0082\3\2\2\2\u0160\u0161\7>\2\2\u0161\u0162\7>\2\2\u0162\u0163\7?\2"+
		"\2\u0163\u0084\3\2\2\2\u0164\u0165\7@\2\2\u0165\u0166\7@\2\2\u0166\u0167"+
		"\7?\2\2\u0167\u0086\3\2\2\2\u0168\u0169\7@\2\2\u0169\u016a\7@\2\2\u016a"+
		"\u016b\7@\2\2\u016b\u016c\7?\2\2\u016c\u0088\3\2\2\2\u016d\u016e\t\r\2"+
		"\2\u016e\u008a\3\2\2\2\u016f\u0171\5\u008dG\2\u0170\u016f\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u008c\3\2"+
		"\2\2\u0174\u0175\t\16\2\2\u0175\u008e\3\2\2\2\u0176\u0177\t\17\2\2\u0177"+
		"\u0090\3\2\2\2\u0178\u0179\7^\2\2\u0179\u017a\t\20\2\2\u017a\u0092\3\2"+
		"\2\2\u017b\u017d\7\17\2\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u017f\7\f\2\2\u017f\u0094\3\2\2\2\u0180\u0182\t\21"+
		"\2\2\u0181\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0181\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\bK\2\2\u0186\u0096\3\2"+
		"\2\2\u0187\u018b\t\22\2\2\u0188\u018a\t\23\2\2\u0189\u0188\3\2\2\2\u018a"+
		"\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u0098\3\2"+
		"\2\2\u018d\u018b\3\2\2\2\17\2\u00b8\u00ba\u00c3\u00ca\u00cf\u00d2\u00dd"+
		"\u00df\u0172\u017c\u0183\u018b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}