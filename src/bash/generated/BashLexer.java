// Generated from .\Bash.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BashLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, LINE_COMMENT=9, 
		MULTILINE_COMMENT=10, LCURLY=11, RCURLY=12, GREATER_GREATER=13, GREATER_BAR=14, 
		LESS_GREATER=15, LESS_LESS=16, LESS_LESS_MINUS=17, LESS_LESS_LESS=18, 
		LESS_AND=19, GREATER_AND=20, AND_GREATER=21, AND_GREATER_GREATER=22, WHILE=23, 
		UNTIL=24, DO=25, DONE=26, FOR=27, SELECT=28, IN=29, CASE=30, ESAC=31, 
		FUNCTION=32, COPROC=33, IF=34, THEN=35, FI=36, ELSE=37, ELIF=38, ARITH_START=39, 
		ARITH_END=40, COND_START=41, COND_END=42, SEMI_SEMI=43, SEMI_AND=44, SEMI_SEMI_AND=45, 
		AND_AND=46, OR_OR=47, BAR_AND=48, BANG=49, TIME=50, ASSIGN=51, QUOTES=52, 
		WS=53, NEWLINE=54, ARITH_CMD=55, ARITH_FOR_EXPRS=56, COND_CMD=57, NUMBER=58, 
		REDIR_WORD=59, ASSIGNMENT_WORD=60, WORD=61;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "LCURLY", "RCURLY", "GREATER_GREATER", "GREATER_BAR", 
			"LESS_GREATER", "LESS_LESS", "LESS_LESS_MINUS", "LESS_LESS_LESS", "LESS_AND", 
			"GREATER_AND", "AND_GREATER", "AND_GREATER_GREATER", "WHILE", "UNTIL", 
			"DO", "DONE", "FOR", "SELECT", "IN", "CASE", "ESAC", "FUNCTION", "COPROC", 
			"IF", "THEN", "FI", "ELSE", "ELIF", "ARITH_START", "ARITH_END", "COND_START", 
			"COND_END", "SEMI_SEMI", "SEMI_AND", "SEMI_SEMI_AND", "AND_AND", "OR_OR", 
			"BAR_AND", "BANG", "TIME", "ASSIGN", "QUOTES", "WS", "NEWLINE", "ARITH_CMD", 
			"ARITH_FOR_EXPRS", "COND_CMD", "NUMBER", "REDIR_WORD", "ASSIGNMENT_WORD", 
			"ESC", "STRING", "DIGIT", "CHAR", "EXPANSION", "WORD", "BRACE_EXPANSION", 
			"PREAMBLE", "RANGE", "CSV", "POSTSCRIPT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>'", "'<'", "'-'", "';'", "'('", "')'", "'|'", "'&'", null, null, 
			"'{'", "'}'", "'>>'", "'>|'", "'<>'", "'<<'", "'<<-'", "'<<<'", "'<&'", 
			"'>&'", "'&>'", "'&>>'", "'while'", "'until'", "'do'", "'done'", "'for'", 
			"'select'", "'in'", "'case'", "'esac'", "'function'", "'coproc'", "'if'", 
			"'then'", "'fi'", "'else'", "'elif'", "'(('", "'))'", "'['", "']'", "';;'", 
			"';&'", "';;&'", "'&&'", "'||'", "'|&'", "'!'", "'time'", "'='", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "LINE_COMMENT", 
			"MULTILINE_COMMENT", "LCURLY", "RCURLY", "GREATER_GREATER", "GREATER_BAR", 
			"LESS_GREATER", "LESS_LESS", "LESS_LESS_MINUS", "LESS_LESS_LESS", "LESS_AND", 
			"GREATER_AND", "AND_GREATER", "AND_GREATER_GREATER", "WHILE", "UNTIL", 
			"DO", "DONE", "FOR", "SELECT", "IN", "CASE", "ESAC", "FUNCTION", "COPROC", 
			"IF", "THEN", "FI", "ELSE", "ELIF", "ARITH_START", "ARITH_END", "COND_START", 
			"COND_END", "SEMI_SEMI", "SEMI_AND", "SEMI_SEMI_AND", "AND_AND", "OR_OR", 
			"BAR_AND", "BANG", "TIME", "ASSIGN", "QUOTES", "WS", "NEWLINE", "ARITH_CMD", 
			"ARITH_FOR_EXPRS", "COND_CMD", "NUMBER", "REDIR_WORD", "ASSIGNMENT_WORD", 
			"WORD"
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


	public BashLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bash.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u0231\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\7"+
		"\n\u00a4\n\n\f\n\16\n\u00a7\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\7\13\u00b3\n\13\f\13\16\13\u00b6\13\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3,"+
		"\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\6\66\u015c\n\66\r\66"+
		"\16\66\u015d\3\66\3\66\3\67\5\67\u0163\n\67\3\67\3\67\38\58\u0168\n8\3"+
		"8\38\68\u016c\n8\r8\168\u016d\38\38\39\39\79\u0174\n9\f9\169\u0177\13"+
		"9\39\39\79\u017b\n9\f9\169\u017e\139\39\39\79\u0182\n9\f9\169\u0185\13"+
		"9\39\39\3:\3:\3:\7:\u018c\n:\f:\16:\u018f\13:\3:\3:\3:\3:\3:\7:\u0196"+
		"\n:\f:\16:\u0199\13:\3:\3:\5:\u019d\n:\3;\6;\u01a0\n;\r;\16;\u01a1\3<"+
		"\6<\u01a5\n<\r<\16<\u01a6\3=\3=\6=\u01ab\n=\r=\16=\u01ac\3=\3=\3=\3>\3"+
		">\3>\3?\3?\3?\7?\u01b8\n?\f?\16?\u01bb\13?\3?\3?\3@\3@\3A\3A\3B\3B\3B"+
		"\3B\3B\3B\7B\u01c9\nB\fB\16B\u01cc\13B\3B\3B\3B\3B\3B\3B\7B\u01d4\nB\f"+
		"B\16B\u01d7\13B\3B\3B\3B\7B\u01dc\nB\fB\16B\u01df\13B\3B\3B\7B\u01e3\n"+
		"B\fB\16B\u01e6\13B\5B\u01e8\nB\3C\3C\3C\3C\3C\3C\3C\6C\u01f1\nC\rC\16"+
		"C\u01f2\5C\u01f5\nC\3D\5D\u01f8\nD\3D\3D\3D\5D\u01fd\nD\3D\3D\5D\u0201"+
		"\nD\3E\3E\3E\6E\u0206\nE\rE\16E\u0207\3F\3F\3F\5F\u020d\nF\3F\3F\3F\3"+
		"F\3F\3F\5F\u0215\nF\3F\3F\3F\3F\3F\5F\u021c\nF\5F\u021e\nF\3G\3G\3G\6"+
		"G\u0223\nG\rG\16G\u0224\3G\5G\u0228\nG\3H\3H\6H\u022c\nH\rH\16H\u022d"+
		"\5H\u0230\nH\5\u00b4\u0197\u01b9\2I\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{\2}\2\177\2\u0081\2\u0083"+
		"\2\u0085?\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\3\2\17\4\2\f\f\17\17"+
		"\4\2\13\13\"\"\4\2++==\3\2++\3\2__\5\2/;C\\c|\b\2\13\f\17\17\"\"$$*+="+
		"=\b\2$$^^ddppttvv\3\2\62;\4\2C\\c|\3\2*+\b\2\13\f\17\17\"\"$$++==\7\2"+
		"\f\f\17\17..}}\177\177\2\u0255\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3"+
		"\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2\u0085\3\2\2\2\3\u0091\3\2\2\2\5\u0093\3"+
		"\2\2\2\7\u0095\3\2\2\2\t\u0097\3\2\2\2\13\u0099\3\2\2\2\r\u009b\3\2\2"+
		"\2\17\u009d\3\2\2\2\21\u009f\3\2\2\2\23\u00a1\3\2\2\2\25\u00ac\3\2\2\2"+
		"\27\u00bc\3\2\2\2\31\u00be\3\2\2\2\33\u00c0\3\2\2\2\35\u00c3\3\2\2\2\37"+
		"\u00c6\3\2\2\2!\u00c9\3\2\2\2#\u00cc\3\2\2\2%\u00d0\3\2\2\2\'\u00d4\3"+
		"\2\2\2)\u00d7\3\2\2\2+\u00da\3\2\2\2-\u00dd\3\2\2\2/\u00e1\3\2\2\2\61"+
		"\u00e7\3\2\2\2\63\u00ed\3\2\2\2\65\u00f0\3\2\2\2\67\u00f5\3\2\2\29\u00f9"+
		"\3\2\2\2;\u0100\3\2\2\2=\u0103\3\2\2\2?\u0108\3\2\2\2A\u010d\3\2\2\2C"+
		"\u0116\3\2\2\2E\u011d\3\2\2\2G\u0120\3\2\2\2I\u0125\3\2\2\2K\u0128\3\2"+
		"\2\2M\u012d\3\2\2\2O\u0132\3\2\2\2Q\u0135\3\2\2\2S\u0138\3\2\2\2U\u013a"+
		"\3\2\2\2W\u013c\3\2\2\2Y\u013f\3\2\2\2[\u0142\3\2\2\2]\u0146\3\2\2\2_"+
		"\u0149\3\2\2\2a\u014c\3\2\2\2c\u014f\3\2\2\2e\u0151\3\2\2\2g\u0156\3\2"+
		"\2\2i\u0158\3\2\2\2k\u015b\3\2\2\2m\u0162\3\2\2\2o\u0167\3\2\2\2q\u0171"+
		"\3\2\2\2s\u019c\3\2\2\2u\u019f\3\2\2\2w\u01a4\3\2\2\2y\u01a8\3\2\2\2{"+
		"\u01b1\3\2\2\2}\u01b4\3\2\2\2\177\u01be\3\2\2\2\u0081\u01c0\3\2\2\2\u0083"+
		"\u01e7\3\2\2\2\u0085\u01f4\3\2\2\2\u0087\u01f7\3\2\2\2\u0089\u0205\3\2"+
		"\2\2\u008b\u020c\3\2\2\2\u008d\u0227\3\2\2\2\u008f\u022f\3\2\2\2\u0091"+
		"\u0092\7@\2\2\u0092\4\3\2\2\2\u0093\u0094\7>\2\2\u0094\6\3\2\2\2\u0095"+
		"\u0096\7/\2\2\u0096\b\3\2\2\2\u0097\u0098\7=\2\2\u0098\n\3\2\2\2\u0099"+
		"\u009a\7*\2\2\u009a\f\3\2\2\2\u009b\u009c\7+\2\2\u009c\16\3\2\2\2\u009d"+
		"\u009e\7~\2\2\u009e\20\3\2\2\2\u009f\u00a0\7(\2\2\u00a0\22\3\2\2\2\u00a1"+
		"\u00a5\7%\2\2\u00a2\u00a4\n\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\u00a9\5m\67\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\n"+
		"\2\2\u00ab\24\3\2\2\2\u00ac\u00ad\7<\2\2\u00ad\u00ae\7\"\2\2\u00ae\u00af"+
		"\7)\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b4\5m\67\2\u00b1\u00b3\13\2\2\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7)\2\2\u00b8"+
		"\u00b9\5m\67\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\b\13\2\2\u00bb\26\3\2\2"+
		"\2\u00bc\u00bd\7}\2\2\u00bd\30\3\2\2\2\u00be\u00bf\7\177\2\2\u00bf\32"+
		"\3\2\2\2\u00c0\u00c1\7@\2\2\u00c1\u00c2\7@\2\2\u00c2\34\3\2\2\2\u00c3"+
		"\u00c4\7@\2\2\u00c4\u00c5\7~\2\2\u00c5\36\3\2\2\2\u00c6\u00c7\7>\2\2\u00c7"+
		"\u00c8\7@\2\2\u00c8 \3\2\2\2\u00c9\u00ca\7>\2\2\u00ca\u00cb\7>\2\2\u00cb"+
		"\"\3\2\2\2\u00cc\u00cd\7>\2\2\u00cd\u00ce\7>\2\2\u00ce\u00cf\7/\2\2\u00cf"+
		"$\3\2\2\2\u00d0\u00d1\7>\2\2\u00d1\u00d2\7>\2\2\u00d2\u00d3\7>\2\2\u00d3"+
		"&\3\2\2\2\u00d4\u00d5\7>\2\2\u00d5\u00d6\7(\2\2\u00d6(\3\2\2\2\u00d7\u00d8"+
		"\7@\2\2\u00d8\u00d9\7(\2\2\u00d9*\3\2\2\2\u00da\u00db\7(\2\2\u00db\u00dc"+
		"\7@\2\2\u00dc,\3\2\2\2\u00dd\u00de\7(\2\2\u00de\u00df\7@\2\2\u00df\u00e0"+
		"\7@\2\2\u00e0.\3\2\2\2\u00e1\u00e2\7y\2\2\u00e2\u00e3\7j\2\2\u00e3\u00e4"+
		"\7k\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7g\2\2\u00e6\60\3\2\2\2\u00e7\u00e8"+
		"\7w\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7k\2\2\u00eb"+
		"\u00ec\7n\2\2\u00ec\62\3\2\2\2\u00ed\u00ee\7f\2\2\u00ee\u00ef\7q\2\2\u00ef"+
		"\64\3\2\2\2\u00f0\u00f1\7f\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7p\2\2\u00f3"+
		"\u00f4\7g\2\2\u00f4\66\3\2\2\2\u00f5\u00f6\7h\2\2\u00f6\u00f7\7q\2\2\u00f7"+
		"\u00f8\7t\2\2\u00f88\3\2\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7g\2\2\u00fb"+
		"\u00fc\7n\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7e\2\2\u00fe\u00ff\7v\2\2"+
		"\u00ff:\3\2\2\2\u0100\u0101\7k\2\2\u0101\u0102\7p\2\2\u0102<\3\2\2\2\u0103"+
		"\u0104\7e\2\2\u0104\u0105\7c\2\2\u0105\u0106\7u\2\2\u0106\u0107\7g\2\2"+
		"\u0107>\3\2\2\2\u0108\u0109\7g\2\2\u0109\u010a\7u\2\2\u010a\u010b\7c\2"+
		"\2\u010b\u010c\7e\2\2\u010c@\3\2\2\2\u010d\u010e\7h\2\2\u010e\u010f\7"+
		"w\2\2\u010f\u0110\7p\2\2\u0110\u0111\7e\2\2\u0111\u0112\7v\2\2\u0112\u0113"+
		"\7k\2\2\u0113\u0114\7q\2\2\u0114\u0115\7p\2\2\u0115B\3\2\2\2\u0116\u0117"+
		"\7e\2\2\u0117\u0118\7q\2\2\u0118\u0119\7r\2\2\u0119\u011a\7t\2\2\u011a"+
		"\u011b\7q\2\2\u011b\u011c\7e\2\2\u011cD\3\2\2\2\u011d\u011e\7k\2\2\u011e"+
		"\u011f\7h\2\2\u011fF\3\2\2\2\u0120\u0121\7v\2\2\u0121\u0122\7j\2\2\u0122"+
		"\u0123\7g\2\2\u0123\u0124\7p\2\2\u0124H\3\2\2\2\u0125\u0126\7h\2\2\u0126"+
		"\u0127\7k\2\2\u0127J\3\2\2\2\u0128\u0129\7g\2\2\u0129\u012a\7n\2\2\u012a"+
		"\u012b\7u\2\2\u012b\u012c\7g\2\2\u012cL\3\2\2\2\u012d\u012e\7g\2\2\u012e"+
		"\u012f\7n\2\2\u012f\u0130\7k\2\2\u0130\u0131\7h\2\2\u0131N\3\2\2\2\u0132"+
		"\u0133\7*\2\2\u0133\u0134\7*\2\2\u0134P\3\2\2\2\u0135\u0136\7+\2\2\u0136"+
		"\u0137\7+\2\2\u0137R\3\2\2\2\u0138\u0139\7]\2\2\u0139T\3\2\2\2\u013a\u013b"+
		"\7_\2\2\u013bV\3\2\2\2\u013c\u013d\7=\2\2\u013d\u013e\7=\2\2\u013eX\3"+
		"\2\2\2\u013f\u0140\7=\2\2\u0140\u0141\7(\2\2\u0141Z\3\2\2\2\u0142\u0143"+
		"\7=\2\2\u0143\u0144\7=\2\2\u0144\u0145\7(\2\2\u0145\\\3\2\2\2\u0146\u0147"+
		"\7(\2\2\u0147\u0148\7(\2\2\u0148^\3\2\2\2\u0149\u014a\7~\2\2\u014a\u014b"+
		"\7~\2\2\u014b`\3\2\2\2\u014c\u014d\7~\2\2\u014d\u014e\7(\2\2\u014eb\3"+
		"\2\2\2\u014f\u0150\7#\2\2\u0150d\3\2\2\2\u0151\u0152\7v\2\2\u0152\u0153"+
		"\7k\2\2\u0153\u0154\7o\2\2\u0154\u0155\7g\2\2\u0155f\3\2\2\2\u0156\u0157"+
		"\7?\2\2\u0157h\3\2\2\2\u0158\u0159\7$\2\2\u0159j\3\2\2\2\u015a\u015c\t"+
		"\3\2\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\b\66\2\2\u0160l\3\2\2\2"+
		"\u0161\u0163\7\17\2\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164"+
		"\3\2\2\2\u0164\u0165\7\f\2\2\u0165n\3\2\2\2\u0166\u0168\7&\2\2\u0167\u0166"+
		"\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\5O(\2\u016a"+
		"\u016c\n\4\2\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\5Q)\2\u0170p"+
		"\3\2\2\2\u0171\u0175\5O(\2\u0172\u0174\n\4\2\2\u0173\u0172\3\2\2\2\u0174"+
		"\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2"+
		"\2\2\u0177\u0175\3\2\2\2\u0178\u017c\7=\2\2\u0179\u017b\n\4\2\2\u017a"+
		"\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0183\7=\2\2\u0180"+
		"\u0182\n\5\2\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186"+
		"\u0187\5Q)\2\u0187r\3\2\2\2\u0188\u0189\5S*\2\u0189\u018d\5S*\2\u018a"+
		"\u018c\n\6\2\2\u018b\u018a\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190"+
		"\u0191\5U+\2\u0191\u0192\5U+\2\u0192\u019d\3\2\2\2\u0193\u0197\5S*\2\u0194"+
		"\u0196\13\2\2\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0198\3"+
		"\2\2\2\u0197\u0195\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a"+
		"\u019b\5U+\2\u019b\u019d\3\2\2\2\u019c\u0188\3\2\2\2\u019c\u0193\3\2\2"+
		"\2\u019dt\3\2\2\2\u019e\u01a0\5\177@\2\u019f\u019e\3\2\2\2\u01a0\u01a1"+
		"\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2v\3\2\2\2\u01a3"+
		"\u01a5\5\177@\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4\3"+
		"\2\2\2\u01a6\u01a7\3\2\2\2\u01a7x\3\2\2\2\u01a8\u01aa\t\7\2\2\u01a9\u01ab"+
		"\n\b\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\5g\64\2\u01af\u01b0\5\u0085"+
		"C\2\u01b0z\3\2\2\2\u01b1\u01b2\7^\2\2\u01b2\u01b3\t\t\2\2\u01b3|\3\2\2"+
		"\2\u01b4\u01b9\5i\65\2\u01b5\u01b8\5{>\2\u01b6\u01b8\13\2\2\2\u01b7\u01b5"+
		"\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01ba\3\2\2\2\u01b9"+
		"\u01b7\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\5i"+
		"\65\2\u01bd~\3\2\2\2\u01be\u01bf\t\n\2\2\u01bf\u0080\3\2\2\2\u01c0\u01c1"+
		"\t\13\2\2\u01c1\u0082\3\2\2\2\u01c2\u01e8\3\2\2\2\u01c3\u01c4\7&\2\2\u01c4"+
		"\u01c5\7*\2\2\u01c5\u01c6\7*\2\2\u01c6\u01ca\3\2\2\2\u01c7\u01c9\n\5\2"+
		"\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb"+
		"\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01ce\7+\2\2\u01ce"+
		"\u01e8\7+\2\2\u01cf\u01d0\7&\2\2\u01d0\u01d1\7*\2\2\u01d1\u01d5\3\2\2"+
		"\2\u01d2\u01d4\n\f\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3"+
		"\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8"+
		"\u01e8\7+\2\2\u01d9\u01dd\7&\2\2\u01da\u01dc\n\b\2\2\u01db\u01da\3\2\2"+
		"\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e8"+
		"\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e4\7,\2\2\u01e1\u01e3\n\r\2\2\u01e2"+
		"\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2"+
		"\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01c2\3\2\2\2\u01e7"+
		"\u01c3\3\2\2\2\u01e7\u01cf\3\2\2\2\u01e7\u01d9\3\2\2\2\u01e7\u01e0\3\2"+
		"\2\2\u01e8\u0084\3\2\2\2\u01e9\u01f5\5\177@\2\u01ea\u01f5\5\u0081A\2\u01eb"+
		"\u01f5\5}?\2\u01ec\u01f5\5\u0083B\2\u01ed\u01f5\5\u0087D\2\u01ee\u01f0"+
		"\t\7\2\2\u01ef\u01f1\n\b\2\2\u01f0\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01e9\3\2"+
		"\2\2\u01f4\u01ea\3\2\2\2\u01f4\u01eb\3\2\2\2\u01f4\u01ec\3\2\2\2\u01f4"+
		"\u01ed\3\2\2\2\u01f4\u01ee\3\2\2\2\u01f5\u0086\3\2\2\2\u01f6\u01f8\5\u0089"+
		"E\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fc\5\27\f\2\u01fa\u01fd\5\u008bF\2\u01fb\u01fd\5\u008dG\2\u01fc\u01fa"+
		"\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\5\31\r\2"+
		"\u01ff\u0201\5\u008fH\2\u0200\u01ff\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"\u0088\3\2\2\2\u0202\u0206\5{>\2\u0203\u0206\5\u0081A\2\u0204\u0206\5"+
		"\177@\2\u0205\u0202\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0204\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u008a\3\2"+
		"\2\2\u0209\u020d\5u;\2\u020a\u020d\5\177@\2\u020b\u020d\5\u0081A\2\u020c"+
		"\u0209\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\u020f\7\60\2\2\u020f\u0210\7\60\2\2\u0210\u0214\3\2\2\2\u0211"+
		"\u0215\5u;\2\u0212\u0215\5\177@\2\u0213\u0215\5\u0081A\2\u0214\u0211\3"+
		"\2\2\2\u0214\u0212\3\2\2\2\u0214\u0213\3\2\2\2\u0215\u021d\3\2\2\2\u0216"+
		"\u0217\7\60\2\2\u0217\u0218\7\60\2\2\u0218\u021b\3\2\2\2\u0219\u021c\5"+
		"u;\2\u021a\u021c\5\177@\2\u021b\u0219\3\2\2\2\u021b\u021a\3\2\2\2\u021c"+
		"\u021e\3\2\2\2\u021d\u0216\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u008c\3\2"+
		"\2\2\u021f\u0222\5\u0089E\2\u0220\u0221\7.\2\2\u0221\u0223\5\u008dG\2"+
		"\u0222\u0220\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225"+
		"\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0228\5\u008fH\2\u0227\u021f\3\2\2"+
		"\2\u0227\u0226\3\2\2\2\u0228\u008e\3\2\2\2\u0229\u0230\5\u0087D\2\u022a"+
		"\u022c\n\16\2\2\u022b\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022b\3"+
		"\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230\3\2\2\2\u022f\u0229\3\2\2\2\u022f"+
		"\u022b\3\2\2\2\u0230\u0090\3\2\2\2(\2\u00a5\u00b4\u015d\u0162\u0167\u016d"+
		"\u0175\u017c\u0183\u018d\u0197\u019c\u01a1\u01a6\u01ac\u01b7\u01b9\u01ca"+
		"\u01d5\u01dd\u01e4\u01e7\u01f2\u01f4\u01f7\u01fc\u0200\u0205\u0207\u020c"+
		"\u0214\u021b\u021d\u0224\u0227\u022d\u022f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}