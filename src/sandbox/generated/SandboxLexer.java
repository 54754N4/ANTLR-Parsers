// Generated from .\Sandbox.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SandboxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		UFLOAT=1, FLOAT=2, UINT=3, INT=4, UNSIGNED=5, DIGITS=6, CIS=7, SUB=8, 
		DOT=9, WS=10, NEWLINE=11, IDENTIFIER=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "UFLOAT", "FLOAT", "UINT", "INT", "UNSIGNED", "DIGITS", "CIS", 
			"SUB", "DOT", "WS", "NEWLINE", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'cis'", "'-'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "UFLOAT", "FLOAT", "UINT", "INT", "UNSIGNED", "DIGITS", "CIS", 
			"SUB", "DOT", "WS", "NEWLINE", "IDENTIFIER"
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


	public SandboxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sandbox.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16W\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\3\5\3#\n\3\3\3\5\3&\n"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\5\7\62\n\7\3\b\6\b\65\n\b\r"+
		"\b\16\b\66\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\6\fB\n\f\r\f\16\fC\3"+
		"\f\3\f\3\r\5\rI\n\r\3\r\3\r\3\16\6\16N\n\16\r\16\16\16O\3\16\7\16S\n\16"+
		"\f\16\16\16V\13\16\2\2\17\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13"+
		"\27\f\31\r\33\16\3\2\6\3\2\62;\4\2\13\13\"\"\5\2C\\aac|\6\2\62;C\\aac"+
		"|\2]\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7\'\3\2\2\2\t*\3\2\2\2\13"+
		",\3\2\2\2\r\61\3\2\2\2\17\64\3\2\2\2\218\3\2\2\2\23<\3\2\2\2\25>\3\2\2"+
		"\2\27A\3\2\2\2\31H\3\2\2\2\33M\3\2\2\2\35\36\t\2\2\2\36\4\3\2\2\2\37%"+
		"\5\t\5\2 \"\5\25\13\2!#\5\t\5\2\"!\3\2\2\2\"#\3\2\2\2#&\3\2\2\2$&\7h\2"+
		"\2% \3\2\2\2%$\3\2\2\2&\6\3\2\2\2\'(\5\23\n\2()\5\5\3\2)\b\3\2\2\2*+\5"+
		"\17\b\2+\n\3\2\2\2,-\5\23\n\2-.\5\t\5\2.\f\3\2\2\2/\62\5\5\3\2\60\62\5"+
		"\t\5\2\61/\3\2\2\2\61\60\3\2\2\2\62\16\3\2\2\2\63\65\5\3\2\2\64\63\3\2"+
		"\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\20\3\2\2\289\7e\2\2"+
		"9:\7k\2\2:;\7u\2\2;\22\3\2\2\2<=\7/\2\2=\24\3\2\2\2>?\7\60\2\2?\26\3\2"+
		"\2\2@B\t\3\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\b\f"+
		"\2\2F\30\3\2\2\2GI\7\17\2\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\f\2\2K\32"+
		"\3\2\2\2LN\t\4\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PT\3\2\2\2Q"+
		"S\t\5\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\34\3\2\2\2VT\3\2\2"+
		"\2\13\2\"%\61\66CHOT\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}