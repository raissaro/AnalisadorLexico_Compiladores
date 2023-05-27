// Generated from MinhaGramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MinhaGramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIPO=1, ATRIB=2, QUAT_PT=3, DOIS_PT=4, END=5, PTV=6, ABRE_P=7, FECHA_P=8, 
		READ=9, WRITE=10, FUNCTION=11, IF=12, ELSE=13, ELSEIF=14, FOR=15, WHILE=16, 
		RETURN=17, ASP=18, DEFINE=19, VIRGULA=20, FALSE=21, TRUE=22, HASHTAG=23, 
		OP_ARIT=24, OP_LOG=25, ID=26, NUM=27, WS=28, COMMENT=29, Error=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TIPO", "ATRIB", "QUAT_PT", "DOIS_PT", "END", "PTV", "ABRE_P", "FECHA_P", 
			"READ", "WRITE", "FUNCTION", "IF", "ELSE", "ELSEIF", "FOR", "WHILE", 
			"RETURN", "ASP", "DEFINE", "VIRGULA", "FALSE", "TRUE", "HASHTAG", "OP_ARIT", 
			"OP_LOG", "ID", "NUM", "LETRA", "DIGITO", "WS", "COMMENT", "Error"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'->'", "'::'", "':'", "'END'", "';'", "'('", "')'", "'READ'", 
			"'WRITE'", "'FUNCTION'", "'IF'", "'ELSE'", "'ELSEIF'", "'FOR'", "'WHILE'", 
			"'RETURN'", "'\"'", "'DEFINE'", "','", "'FALSE'", "'TRUE'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TIPO", "ATRIB", "QUAT_PT", "DOIS_PT", "END", "PTV", "ABRE_P", 
			"FECHA_P", "READ", "WRITE", "FUNCTION", "IF", "ELSE", "ELSEIF", "FOR", 
			"WHILE", "RETURN", "ASP", "DEFINE", "VIRGULA", "FALSE", "TRUE", "HASHTAG", 
			"OP_ARIT", "OP_LOG", "ID", "NUM", "WS", "COMMENT", "Error"
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


	public MinhaGramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MinhaGramatica.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00f3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2W\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u00c2\n\32\3\33\3\33\3\33\7\33\u00c7\n\33\f"+
		"\33\16\33\u00ca\13\33\3\34\6\34\u00cd\n\34\r\34\16\34\u00ce\3\34\3\34"+
		"\6\34\u00d3\n\34\r\34\16\34\u00d4\5\34\u00d7\n\34\3\35\3\35\3\36\3\36"+
		"\3\37\6\37\u00de\n\37\r\37\16\37\u00df\3\37\3\37\3 \3 \3 \3 \7 \u00e8"+
		"\n \f \16 \u00eb\13 \3 \3 \3 \3 \3 \3!\3!\3\u00e9\2\"\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\2;\2=\36?\37A \3\2\7\7"+
		"\2\'\',-//\61\61``\4\2>>@@\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u0100"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\3V\3\2\2\2\5X\3\2\2\2\7[\3\2\2\2\t^\3\2\2\2\13`\3\2"+
		"\2\2\rd\3\2\2\2\17f\3\2\2\2\21h\3\2\2\2\23j\3\2\2\2\25o\3\2\2\2\27u\3"+
		"\2\2\2\31~\3\2\2\2\33\u0081\3\2\2\2\35\u0086\3\2\2\2\37\u008d\3\2\2\2"+
		"!\u0091\3\2\2\2#\u0097\3\2\2\2%\u009e\3\2\2\2\'\u00a0\3\2\2\2)\u00a7\3"+
		"\2\2\2+\u00a9\3\2\2\2-\u00af\3\2\2\2/\u00b4\3\2\2\2\61\u00b6\3\2\2\2\63"+
		"\u00c1\3\2\2\2\65\u00c3\3\2\2\2\67\u00cc\3\2\2\29\u00d8\3\2\2\2;\u00da"+
		"\3\2\2\2=\u00dd\3\2\2\2?\u00e3\3\2\2\2A\u00f1\3\2\2\2CD\7k\2\2DE\7p\2"+
		"\2EW\7v\2\2FG\7h\2\2GH\7n\2\2HI\7q\2\2IJ\7c\2\2JW\7v\2\2KL\7u\2\2LM\7"+
		"v\2\2MW\7t\2\2NO\7d\2\2OP\7q\2\2PQ\7q\2\2QW\7n\2\2RS\7x\2\2ST\7q\2\2T"+
		"U\7k\2\2UW\7f\2\2VC\3\2\2\2VF\3\2\2\2VK\3\2\2\2VN\3\2\2\2VR\3\2\2\2W\4"+
		"\3\2\2\2XY\7/\2\2YZ\7@\2\2Z\6\3\2\2\2[\\\7<\2\2\\]\7<\2\2]\b\3\2\2\2^"+
		"_\7<\2\2_\n\3\2\2\2`a\7G\2\2ab\7P\2\2bc\7F\2\2c\f\3\2\2\2de\7=\2\2e\16"+
		"\3\2\2\2fg\7*\2\2g\20\3\2\2\2hi\7+\2\2i\22\3\2\2\2jk\7T\2\2kl\7G\2\2l"+
		"m\7C\2\2mn\7F\2\2n\24\3\2\2\2op\7Y\2\2pq\7T\2\2qr\7K\2\2rs\7V\2\2st\7"+
		"G\2\2t\26\3\2\2\2uv\7H\2\2vw\7W\2\2wx\7P\2\2xy\7E\2\2yz\7V\2\2z{\7K\2"+
		"\2{|\7Q\2\2|}\7P\2\2}\30\3\2\2\2~\177\7K\2\2\177\u0080\7H\2\2\u0080\32"+
		"\3\2\2\2\u0081\u0082\7G\2\2\u0082\u0083\7N\2\2\u0083\u0084\7U\2\2\u0084"+
		"\u0085\7G\2\2\u0085\34\3\2\2\2\u0086\u0087\7G\2\2\u0087\u0088\7N\2\2\u0088"+
		"\u0089\7U\2\2\u0089\u008a\7G\2\2\u008a\u008b\7K\2\2\u008b\u008c\7H\2\2"+
		"\u008c\36\3\2\2\2\u008d\u008e\7H\2\2\u008e\u008f\7Q\2\2\u008f\u0090\7"+
		"T\2\2\u0090 \3\2\2\2\u0091\u0092\7Y\2\2\u0092\u0093\7J\2\2\u0093\u0094"+
		"\7K\2\2\u0094\u0095\7N\2\2\u0095\u0096\7G\2\2\u0096\"\3\2\2\2\u0097\u0098"+
		"\7T\2\2\u0098\u0099\7G\2\2\u0099\u009a\7V\2\2\u009a\u009b\7W\2\2\u009b"+
		"\u009c\7T\2\2\u009c\u009d\7P\2\2\u009d$\3\2\2\2\u009e\u009f\7$\2\2\u009f"+
		"&\3\2\2\2\u00a0\u00a1\7F\2\2\u00a1\u00a2\7G\2\2\u00a2\u00a3\7H\2\2\u00a3"+
		"\u00a4\7K\2\2\u00a4\u00a5\7P\2\2\u00a5\u00a6\7G\2\2\u00a6(\3\2\2\2\u00a7"+
		"\u00a8\7.\2\2\u00a8*\3\2\2\2\u00a9\u00aa\7H\2\2\u00aa\u00ab\7C\2\2\u00ab"+
		"\u00ac\7N\2\2\u00ac\u00ad\7U\2\2\u00ad\u00ae\7G\2\2\u00ae,\3\2\2\2\u00af"+
		"\u00b0\7V\2\2\u00b0\u00b1\7T\2\2\u00b1\u00b2\7W\2\2\u00b2\u00b3\7G\2\2"+
		"\u00b3.\3\2\2\2\u00b4\u00b5\7%\2\2\u00b5\60\3\2\2\2\u00b6\u00b7\t\2\2"+
		"\2\u00b7\62\3\2\2\2\u00b8\u00c2\t\3\2\2\u00b9\u00ba\7@\2\2\u00ba\u00c2"+
		"\7?\2\2\u00bb\u00bc\7>\2\2\u00bc\u00c2\7?\2\2\u00bd\u00be\7?\2\2\u00be"+
		"\u00c2\7?\2\2\u00bf\u00c0\7#\2\2\u00c0\u00c2\7?\2\2\u00c1\u00b8\3\2\2"+
		"\2\u00c1\u00b9\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c2\64\3\2\2\2\u00c3\u00c8\59\35\2\u00c4\u00c7\5;\36\2\u00c5"+
		"\u00c7\59\35\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\66\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00cb\u00cd\5;\36\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d6\3\2\2\2\u00d0\u00d7\7\60"+
		"\2\2\u00d1\u00d3\5;\36\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d0\3\2"+
		"\2\2\u00d6\u00d2\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d78\3\2\2\2\u00d8\u00d9"+
		"\t\4\2\2\u00d9:\3\2\2\2\u00da\u00db\t\5\2\2\u00db<\3\2\2\2\u00dc\u00de"+
		"\t\6\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b\37\2\2\u00e2>\3\2\2\2"+
		"\u00e3\u00e4\7/\2\2\u00e4\u00e5\7/\2\2\u00e5\u00e9\3\2\2\2\u00e6\u00e8"+
		"\13\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00ea\3\2\2\2"+
		"\u00e9\u00e7\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed"+
		"\7/\2\2\u00ed\u00ee\7/\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\b \2\2\u00f0"+
		"@\3\2\2\2\u00f1\u00f2\13\2\2\2\u00f2B\3\2\2\2\f\2V\u00c1\u00c6\u00c8\u00ce"+
		"\u00d4\u00d6\u00df\u00e9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}