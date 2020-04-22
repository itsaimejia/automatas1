// Generated from .\telefono.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class telefonoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, DIGITO=4, ESPACIOS=5;
	public static final int
		RULE_varios = 0, RULE_numero_telefonico = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"varios", "numero_telefonico"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "DIGITO", "ESPACIOS"
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
	public String getGrammarFileName() { return "telefono.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public telefonoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class VariosContext extends ParserRuleContext {
		public List<Numero_telefonicoContext> numero_telefonico() {
			return getRuleContexts(Numero_telefonicoContext.class);
		}
		public Numero_telefonicoContext numero_telefonico(int i) {
			return getRuleContext(Numero_telefonicoContext.class,i);
		}
		public VariosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varios; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof telefonoListener ) ((telefonoListener)listener).enterVarios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof telefonoListener ) ((telefonoListener)listener).exitVarios(this);
		}
	}

	public final VariosContext varios() throws RecognitionException {
		VariosContext _localctx = new VariosContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_varios);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				numero_telefonico();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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

	public static class Numero_telefonicoContext extends ParserRuleContext {
		public List<TerminalNode> DIGITO() { return getTokens(telefonoParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(telefonoParser.DIGITO, i);
		}
		public Numero_telefonicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_telefonico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof telefonoListener ) ((telefonoListener)listener).enterNumero_telefonico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof telefonoListener ) ((telefonoListener)listener).exitNumero_telefonico(this);
		}
	}

	public final Numero_telefonicoContext numero_telefonico() throws RecognitionException {
		Numero_telefonicoContext _localctx = new Numero_telefonicoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_numero_telefonico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			match(T__0);
			setState(10);
			match(DIGITO);
			setState(11);
			match(DIGITO);
			setState(12);
			match(DIGITO);
			setState(13);
			match(T__1);
			setState(14);
			match(T__2);
			setState(15);
			match(T__0);
			setState(16);
			match(DIGITO);
			setState(17);
			match(DIGITO);
			setState(18);
			match(DIGITO);
			setState(19);
			match(DIGITO);
			setState(20);
			match(DIGITO);
			setState(21);
			match(DIGITO);
			setState(22);
			match(T__1);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7\33\4\2\t\2\4\3"+
		"\t\3\3\2\6\2\b\n\2\r\2\16\2\t\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\2\2\4\2\4\2\2\2\31\2\7\3\2\2\2\4\13\3\2\2\2\6"+
		"\b\5\4\3\2\7\6\3\2\2\2\b\t\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2\2\n\3\3\2\2\2"+
		"\13\f\7\3\2\2\f\r\7\6\2\2\r\16\7\6\2\2\16\17\7\6\2\2\17\20\7\4\2\2\20"+
		"\21\7\5\2\2\21\22\7\3\2\2\22\23\7\6\2\2\23\24\7\6\2\2\24\25\7\6\2\2\25"+
		"\26\7\6\2\2\26\27\7\6\2\2\27\30\7\6\2\2\30\31\7\4\2\2\31\5\3\2\2\2\3\t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}