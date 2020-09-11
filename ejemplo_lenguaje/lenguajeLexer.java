// Generated from .\lenguaje.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lenguajeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SELECT=4, UPDATE=5, DELETE=6, INSERT=7, CREATE=8, 
		FROM=9, WHERE=10, SET=11, INTO=12, VALUES=13, DATABASE=14, ASTERISCO=15, 
		SEMI=16, ID=17, CANTIDAD=18, ESPACION=19, ENTER=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "SELECT", "UPDATE", "DELETE", "INSERT", "CREATE", 
			"FROM", "WHERE", "SET", "INTO", "VALUES", "DATABASE", "ASTERISCO", "SEMI", 
			"LETRA", "CONTENIDO", "ID", "CANTIDAD", "ESPACION", "ENTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", null, null, null, null, null, null, null, 
			null, null, null, null, "'*'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "SELECT", "UPDATE", "DELETE", "INSERT", "CREATE", 
			"FROM", "WHERE", "SET", "INTO", "VALUES", "DATABASE", "ASTERISCO", "SEMI", 
			"ID", "CANTIDAD", "ESPACION", "ENTER"
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


	public lenguajeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lenguaje.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00e6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5B\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6P\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7^\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\bl\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\tz\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0084\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0090\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u0098\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a2"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00b0\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00c2\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\6\23\u00cb\n\23\r\23\16\23\u00cc\3\24\3\24\3\24\3\25\6\25\u00d3\n\25"+
		"\r\25\16\25\u00d4\3\25\3\25\6\25\u00d9\n\25\r\25\16\25\u00da\5\25\u00dd"+
		"\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\2%\2\'\23"+
		")\24+\25-\26\3\2\b\5\2C\\aac|\7\2\"\"\62;C\\aac|\3\2\62;\4\2\60\60^^\3"+
		"\2\"\"\4\2\f\f\17\17\2\u00f2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3"+
		"\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\tA\3\2\2\2\13O\3\2\2\2\r]\3\2\2\2\17"+
		"k\3\2\2\2\21y\3\2\2\2\23\u0083\3\2\2\2\25\u008f\3\2\2\2\27\u0097\3\2\2"+
		"\2\31\u00a1\3\2\2\2\33\u00af\3\2\2\2\35\u00c1\3\2\2\2\37\u00c3\3\2\2\2"+
		"!\u00c5\3\2\2\2#\u00c7\3\2\2\2%\u00ca\3\2\2\2\'\u00ce\3\2\2\2)\u00d2\3"+
		"\2\2\2+\u00de\3\2\2\2-\u00e2\3\2\2\2/\60\7?\2\2\60\4\3\2\2\2\61\62\7*"+
		"\2\2\62\6\3\2\2\2\63\64\7+\2\2\64\b\3\2\2\2\65\66\7U\2\2\66\67\7G\2\2"+
		"\678\7N\2\289\7G\2\29:\7E\2\2:B\7V\2\2;<\7u\2\2<=\7g\2\2=>\7n\2\2>?\7"+
		"g\2\2?@\7e\2\2@B\7v\2\2A\65\3\2\2\2A;\3\2\2\2B\n\3\2\2\2CD\7W\2\2DE\7"+
		"R\2\2EF\7F\2\2FG\7C\2\2GH\7V\2\2HP\7G\2\2IJ\7w\2\2JK\7r\2\2KL\7f\2\2L"+
		"M\7c\2\2MN\7v\2\2NP\7g\2\2OC\3\2\2\2OI\3\2\2\2P\f\3\2\2\2QR\7F\2\2RS\7"+
		"G\2\2ST\7N\2\2TU\7G\2\2UV\7V\2\2V^\7G\2\2WX\7f\2\2XY\7g\2\2YZ\7n\2\2Z"+
		"[\7g\2\2[\\\7v\2\2\\^\7g\2\2]Q\3\2\2\2]W\3\2\2\2^\16\3\2\2\2_`\7K\2\2"+
		"`a\7P\2\2ab\7U\2\2bc\7G\2\2cd\7T\2\2dl\7V\2\2ef\7k\2\2fg\7p\2\2gh\7u\2"+
		"\2hi\7g\2\2ij\7t\2\2jl\7v\2\2k_\3\2\2\2ke\3\2\2\2l\20\3\2\2\2mn\7E\2\2"+
		"no\7T\2\2op\7G\2\2pq\7C\2\2qr\7V\2\2rz\7G\2\2st\7e\2\2tu\7t\2\2uv\7g\2"+
		"\2vw\7c\2\2wx\7v\2\2xz\7g\2\2ym\3\2\2\2ys\3\2\2\2z\22\3\2\2\2{|\7H\2\2"+
		"|}\7T\2\2}~\7Q\2\2~\u0084\7O\2\2\177\u0080\7h\2\2\u0080\u0081\7t\2\2\u0081"+
		"\u0082\7q\2\2\u0082\u0084\7o\2\2\u0083{\3\2\2\2\u0083\177\3\2\2\2\u0084"+
		"\24\3\2\2\2\u0085\u0086\7Y\2\2\u0086\u0087\7J\2\2\u0087\u0088\7G\2\2\u0088"+
		"\u0089\7T\2\2\u0089\u0090\7G\2\2\u008a\u008b\7y\2\2\u008b\u008c\7j\2\2"+
		"\u008c\u008d\7g\2\2\u008d\u008e\7t\2\2\u008e\u0090\7g\2\2\u008f\u0085"+
		"\3\2\2\2\u008f\u008a\3\2\2\2\u0090\26\3\2\2\2\u0091\u0092\7U\2\2\u0092"+
		"\u0093\7G\2\2\u0093\u0098\7V\2\2\u0094\u0095\7u\2\2\u0095\u0096\7g\2\2"+
		"\u0096\u0098\7v\2\2\u0097\u0091\3\2\2\2\u0097\u0094\3\2\2\2\u0098\30\3"+
		"\2\2\2\u0099\u009a\7K\2\2\u009a\u009b\7P\2\2\u009b\u009c\7V\2\2\u009c"+
		"\u00a2\7Q\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7v\2\2"+
		"\u00a0\u00a2\7q\2\2\u00a1\u0099\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2\32\3"+
		"\2\2\2\u00a3\u00a4\7X\2\2\u00a4\u00a5\7C\2\2\u00a5\u00a6\7N\2\2\u00a6"+
		"\u00a7\7W\2\2\u00a7\u00a8\7G\2\2\u00a8\u00b0\7U\2\2\u00a9\u00aa\7x\2\2"+
		"\u00aa\u00ab\7c\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae"+
		"\7g\2\2\u00ae\u00b0\7u\2\2\u00af\u00a3\3\2\2\2\u00af\u00a9\3\2\2\2\u00b0"+
		"\34\3\2\2\2\u00b1\u00b2\7F\2\2\u00b2\u00b3\7C\2\2\u00b3\u00b4\7V\2\2\u00b4"+
		"\u00b5\7C\2\2\u00b5\u00b6\7D\2\2\u00b6\u00b7\7C\2\2\u00b7\u00b8\7U\2\2"+
		"\u00b8\u00c2\7G\2\2\u00b9\u00ba\7f\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc"+
		"\7v\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7d\2\2\u00be\u00bf\7c\2\2\u00bf"+
		"\u00c0\7u\2\2\u00c0\u00c2\7g\2\2\u00c1\u00b1\3\2\2\2\u00c1\u00b9\3\2\2"+
		"\2\u00c2\36\3\2\2\2\u00c3\u00c4\7,\2\2\u00c4 \3\2\2\2\u00c5\u00c6\7=\2"+
		"\2\u00c6\"\3\2\2\2\u00c7\u00c8\t\2\2\2\u00c8$\3\2\2\2\u00c9\u00cb\t\3"+
		"\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd&\3\2\2\2\u00ce\u00cf\5#\22\2\u00cf\u00d0\5%\23\2"+
		"\u00d0(\3\2\2\2\u00d1\u00d3\t\4\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3"+
		"\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00dc\3\2\2\2\u00d6"+
		"\u00d8\t\5\2\2\u00d7\u00d9\t\4\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00d6\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd*\3\2\2\2\u00de\u00df\t\6\2\2"+
		"\u00df\u00e0\3\2\2\2\u00e0\u00e1\b\26\2\2\u00e1,\3\2\2\2\u00e2\u00e3\t"+
		"\7\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\b\27\2\2\u00e5.\3\2\2\2\22\2AO"+
		"]ky\u0083\u008f\u0097\u00a1\u00af\u00c1\u00cc\u00d4\u00da\u00dc\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}