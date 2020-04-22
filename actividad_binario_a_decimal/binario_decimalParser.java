// Generated from .\binario_decimal.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class binario_decimalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BINARIO=1, WS=2;
	public static final int
		RULE_varios = 0, RULE_convertir = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"varios", "convertir"
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
			null, "BINARIO", "WS"
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
	public String getGrammarFileName() { return "binario_decimal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public binario_decimalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class VariosContext extends ParserRuleContext {
		public List<ConvertirContext> convertir() {
			return getRuleContexts(ConvertirContext.class);
		}
		public ConvertirContext convertir(int i) {
			return getRuleContext(ConvertirContext.class,i);
		}
		public VariosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varios; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof binario_decimalListener ) ((binario_decimalListener)listener).enterVarios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof binario_decimalListener ) ((binario_decimalListener)listener).exitVarios(this);
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
				convertir();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BINARIO );
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

	public static class ConvertirContext extends ParserRuleContext {
		public Token n;
		public TerminalNode BINARIO() { return getToken(binario_decimalParser.BINARIO, 0); }
		public ConvertirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convertir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof binario_decimalListener ) ((binario_decimalListener)listener).enterConvertir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof binario_decimalListener ) ((binario_decimalListener)listener).exitConvertir(this);
		}
	}

	public final ConvertirContext convertir() throws RecognitionException {
		ConvertirContext _localctx = new ConvertirContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_convertir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			((ConvertirContext)_localctx).n = match(BINARIO);

			                ToDecimal decimal= new ToDecimal(((ConvertirContext)_localctx).n.getText());
			                System.out.println("El valor de "+((ConvertirContext)_localctx).n.getText()+" en decimal es: "+decimal.decimal());
			            
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\4\17\4\2\t\2\4\3"+
		"\t\3\3\2\6\2\b\n\2\r\2\16\2\t\3\3\3\3\3\3\3\3\2\2\4\2\4\2\2\2\r\2\7\3"+
		"\2\2\2\4\13\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\t\3\2\2\2\t\7\3\2\2\2\t"+
		"\n\3\2\2\2\n\3\3\2\2\2\13\f\7\3\2\2\f\r\b\3\1\2\r\5\3\2\2\2\3\t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}