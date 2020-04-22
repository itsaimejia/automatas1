// Generated from sintactico_ejemplo.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sintactico_ejemploLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, FLOTANTE=2, ENTERO=3, BOOLEAN=4, CHAR=5, ID=6, COMMENT_LINE=7, 
		COMMENT_BLOCK=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "DIGITO", "FLOTANTE", "ENTERO", "BOOLEAN", "PALABRA", "CHAR", 
			"ID", "COMMENT_LINE", "COMMENT_BLOCK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'name:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "FLOTANTE", "ENTERO", "BOOLEAN", "CHAR", "ID", "COMMENT_LINE", 
			"COMMENT_BLOCK"
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


	public sintactico_ejemploLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sintactico_ejemplo.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\\\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\6\4!\n\4\r\4\16\4\"\3\4\3\4\6"+
		"\4\'\n\4\r\4\16\4(\3\5\6\5,\n\5\r\5\16\5-\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\69\n\6\3\7\3\7\3\b\3\b\3\t\6\t@\n\t\r\t\16\tA\3\n\3\n\3\n\3"+
		"\n\7\nH\n\n\f\n\16\nK\13\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13S\n\13\f\13"+
		"\16\13V\13\13\3\13\3\13\3\13\3\13\3\13\4IT\2\f\3\3\5\2\7\4\t\5\13\6\r"+
		"\2\17\7\21\b\23\t\25\n\3\2\5\3\2\62;\5\2\62;C\\c|\3\2c|\2`\2\3\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\35\3\2\2\2\7 \3\2\2\2\t+\3\2\2\2\13"+
		"8\3\2\2\2\r:\3\2\2\2\17<\3\2\2\2\21?\3\2\2\2\23C\3\2\2\2\25N\3\2\2\2\27"+
		"\30\7p\2\2\30\31\7c\2\2\31\32\7o\2\2\32\33\7g\2\2\33\34\7<\2\2\34\4\3"+
		"\2\2\2\35\36\t\2\2\2\36\6\3\2\2\2\37!\5\5\3\2 \37\3\2\2\2!\"\3\2\2\2\""+
		" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$&\7\60\2\2%\'\5\5\3\2&%\3\2\2\2\'(\3\2"+
		"\2\2(&\3\2\2\2()\3\2\2\2)\b\3\2\2\2*,\5\5\3\2+*\3\2\2\2,-\3\2\2\2-+\3"+
		"\2\2\2-.\3\2\2\2.\n\3\2\2\2/\60\7v\2\2\60\61\7t\2\2\61\62\7w\2\2\629\7"+
		"g\2\2\63\64\7h\2\2\64\65\7c\2\2\65\66\7n\2\2\66\67\7u\2\2\679\7g\2\28"+
		"/\3\2\2\28\63\3\2\2\29\f\3\2\2\2:;\t\3\2\2;\16\3\2\2\2<=\5\r\7\2=\20\3"+
		"\2\2\2>@\t\4\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\22\3\2\2\2C"+
		"D\7\61\2\2DE\7\61\2\2EI\3\2\2\2FH\13\2\2\2GF\3\2\2\2HK\3\2\2\2IJ\3\2\2"+
		"\2IG\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\b\n\2\2M\24\3\2\2\2NO\7\61\2\2OP\7"+
		",\2\2PT\3\2\2\2QS\13\2\2\2RQ\3\2\2\2SV\3\2\2\2TU\3\2\2\2TR\3\2\2\2UW\3"+
		"\2\2\2VT\3\2\2\2WX\7\61\2\2XY\7,\2\2YZ\3\2\2\2Z[\b\13\2\2[\26\3\2\2\2"+
		"\n\2\"(-8AIT\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}