// Generated from sintactico_ejemplo.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sintactico_ejemploParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, FLOTANTE=2, ENTERO=3, BOOLEAN=4, CHAR=5, ID=6, COMMENT_LINE=7, 
		COMMENT_BLOCK=8;
	public static final int
		RULE_verificar_nombre = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"verificar_nombre"
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

	@Override
	public String getGrammarFileName() { return "sintactico_ejemplo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sintactico_ejemploParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Verificar_nombreContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(sintactico_ejemploParser.ID, 0); }
		public Verificar_nombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verificar_nombre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintactico_ejemploListener ) ((sintactico_ejemploListener)listener).enterVerificar_nombre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintactico_ejemploListener ) ((sintactico_ejemploListener)listener).exitVerificar_nombre(this);
		}
	}

	public final Verificar_nombreContext verificar_nombre() throws RecognitionException {
		Verificar_nombreContext _localctx = new Verificar_nombreContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_verificar_nombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(T__0);
			setState(3);
			match(ID);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\b\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\2\2\3\2\2\2\2\6\2\4\3\2\2\2\4\5\7\3\2\2\5\6\7\b\2\2\6\3\3\2"+
		"\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}