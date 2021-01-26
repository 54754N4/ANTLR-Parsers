// Generated from .\Commands.g4 by ANTLR 4.9.1

package commands.generated;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommandsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, PIPE=3, REDIR_IN=4, REDIR_OUT=5, REDIR_APPEND=6, SEMI=7, 
		DASH=8, DBL_DASH=9, EQUAL=10, QUOTES=11, NEWLINE=12, WS=13, STRING=14, 
		NAME=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AND", "OR", "PIPE", "REDIR_IN", "REDIR_OUT", "REDIR_APPEND", "SEMI", 
			"DASH", "DBL_DASH", "EQUAL", "QUOTES", "NEWLINE", "WS", "STRING", "NAME", 
			"SPECIAL", "ESC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&&'", "'||'", "'|'", "'<'", "'>'", "'>>'", "';'", "'-'", "'--'", 
			"'='", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "PIPE", "REDIR_IN", "REDIR_OUT", "REDIR_APPEND", "SEMI", 
			"DASH", "DBL_DASH", "EQUAL", "QUOTES", "NEWLINE", "WS", "STRING", "NAME"
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


	public CommandsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Commands.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21^\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\5\rA\n\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\7\17L\n\17\f\17\16\17O\13\17\3\17\3\17\3\20\3"+
		"\20\3\20\6\20V\n\20\r\20\16\20W\3\21\3\21\3\22\3\22\3\22\3M\2\23\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\2#\2\3\2\6\4\2\13\13\"\"\6\2\60\60\62;C\\c|\7\2%%,,//AB]_\13\2$$,,/"+
		"/AA]_ddppttvv\2`\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3"+
		"%\3\2\2\2\5(\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\61\3\2\2\2\17"+
		"\64\3\2\2\2\21\66\3\2\2\2\238\3\2\2\2\25;\3\2\2\2\27=\3\2\2\2\31@\3\2"+
		"\2\2\33D\3\2\2\2\35H\3\2\2\2\37R\3\2\2\2!Y\3\2\2\2#[\3\2\2\2%&\7(\2\2"+
		"&\'\7(\2\2\'\4\3\2\2\2()\7~\2\2)*\7~\2\2*\6\3\2\2\2+,\7~\2\2,\b\3\2\2"+
		"\2-.\7>\2\2.\n\3\2\2\2/\60\7@\2\2\60\f\3\2\2\2\61\62\7@\2\2\62\63\7@\2"+
		"\2\63\16\3\2\2\2\64\65\7=\2\2\65\20\3\2\2\2\66\67\7/\2\2\67\22\3\2\2\2"+
		"89\7/\2\29:\7/\2\2:\24\3\2\2\2;<\7?\2\2<\26\3\2\2\2=>\7$\2\2>\30\3\2\2"+
		"\2?A\7\17\2\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\f\2\2C\32\3\2\2\2DE\t"+
		"\2\2\2EF\3\2\2\2FG\b\16\2\2G\34\3\2\2\2HM\5\27\f\2IL\5#\22\2JL\13\2\2"+
		"\2KI\3\2\2\2KJ\3\2\2\2LO\3\2\2\2MN\3\2\2\2MK\3\2\2\2NP\3\2\2\2OM\3\2\2"+
		"\2PQ\5\27\f\2Q\36\3\2\2\2RU\t\3\2\2SV\t\3\2\2TV\5!\21\2US\3\2\2\2UT\3"+
		"\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X \3\2\2\2YZ\t\4\2\2Z\"\3\2\2\2[\\"+
		"\7^\2\2\\]\t\5\2\2]$\3\2\2\2\b\2@KMUW\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}