// Generated from lexico_ejemplo.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lexico_ejemplo extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FLOTANTE=1, ENTERO=2, BOOLEAN=3, CHAR=4, ID=5, COMMENT_LINE=6, COMMENT_BLOCK=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGITO", "FLOTANTE", "ENTERO", "BOOLEAN", "PALABRA", "CHAR", "ID", "COMMENT_LINE", 
			"COMMENT_BLOCK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FLOTANTE", "ENTERO", "BOOLEAN", "CHAR", "ID", "COMMENT_LINE", 
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


	public lexico_ejemplo(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lexico_ejemplo.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tT\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\6\3\31\n\3\r\3\16\3\32\3\3\3\3\6\3\37\n\3\r\3\16\3 \3\4\6\4$\n\4"+
		"\r\4\16\4%\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\61\n\5\3\6\3\6\3\7"+
		"\3\7\3\b\6\b8\n\b\r\b\16\b9\3\t\3\t\3\t\3\t\7\t@\n\t\f\t\16\tC\13\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\7\nK\n\n\f\n\16\nN\13\n\3\n\3\n\3\n\3\n\3\n\4A"+
		"L\2\13\3\2\5\3\7\4\t\5\13\2\r\6\17\7\21\b\23\t\3\2\5\3\2\62;\5\2\62;C"+
		"\\c|\3\2c|\2X\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\30\3\2\2\2\7#\3\2\2\2\t"+
		"\60\3\2\2\2\13\62\3\2\2\2\r\64\3\2\2\2\17\67\3\2\2\2\21;\3\2\2\2\23F\3"+
		"\2\2\2\25\26\t\2\2\2\26\4\3\2\2\2\27\31\5\3\2\2\30\27\3\2\2\2\31\32\3"+
		"\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\36\7\60\2\2\35\37"+
		"\5\3\2\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\6\3\2\2\2\""+
		"$\5\3\2\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\b\3\2\2\2\'(\7v\2"+
		"\2()\7t\2\2)*\7w\2\2*\61\7g\2\2+,\7h\2\2,-\7c\2\2-.\7n\2\2./\7u\2\2/\61"+
		"\7g\2\2\60\'\3\2\2\2\60+\3\2\2\2\61\n\3\2\2\2\62\63\t\3\2\2\63\f\3\2\2"+
		"\2\64\65\5\13\6\2\65\16\3\2\2\2\668\t\4\2\2\67\66\3\2\2\289\3\2\2\29\67"+
		"\3\2\2\29:\3\2\2\2:\20\3\2\2\2;<\7\61\2\2<=\7\61\2\2=A\3\2\2\2>@\13\2"+
		"\2\2?>\3\2\2\2@C\3\2\2\2AB\3\2\2\2A?\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\b\t"+
		"\2\2E\22\3\2\2\2FG\7\61\2\2GH\7,\2\2HL\3\2\2\2IK\13\2\2\2JI\3\2\2\2KN"+
		"\3\2\2\2LM\3\2\2\2LJ\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\61\2\2PQ\7,\2\2Q"+
		"R\3\2\2\2RS\b\n\2\2S\24\3\2\2\2\n\2\32 %\609AL\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}