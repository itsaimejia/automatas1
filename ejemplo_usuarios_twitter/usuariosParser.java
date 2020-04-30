// Generated from .\u005Cusuarios.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class usuariosParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARROBA=1, USERNAME=2, ENTER=3, WS=4;
	public static final int
		RULE_nombre_usuario = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"nombre_usuario"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ARROBA", "USERNAME", "ENTER", "WS"
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
	public String getGrammarFileName() { return "usuarios.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public usuariosParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Nombre_usuarioContext extends ParserRuleContext {
		public Token u;
		public TerminalNode ARROBA() { return getToken(usuariosParser.ARROBA, 0); }
		public TerminalNode ENTER() { return getToken(usuariosParser.ENTER, 0); }
		public TerminalNode USERNAME() { return getToken(usuariosParser.USERNAME, 0); }
		public Nombre_usuarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_usuario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof usuariosListener ) ((usuariosListener)listener).enterNombre_usuario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof usuariosListener ) ((usuariosListener)listener).exitNombre_usuario(this);
		}
	}

	public final Nombre_usuarioContext nombre_usuario() throws RecognitionException {
		Nombre_usuarioContext _localctx = new Nombre_usuarioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_nombre_usuario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(ARROBA);
			setState(3);
			((Nombre_usuarioContext)_localctx).u = match(USERNAME);
			setState(4);
			match(ENTER);

			                    VerifyUser user= new VerifyUser((((Nombre_usuarioContext)_localctx).u!=null?((Nombre_usuarioContext)_localctx).u.getText():null));
			                    user.valid();
			                
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6\n\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\2\2\3\2\2\2\2\b\2\4\3\2\2\2\4\5\7\3\2\2\5\6\7\4\2\2"+
		"\6\7\7\5\2\2\7\b\b\2\1\2\b\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}