// Generated from .\corchetes.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class corchetesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VNUMBERSC=1, OPEN=2, CLOSE=3, NUMBER=4, COMA=5, WS=6;
	public static final int
		RULE_multi = 0, RULE_ciclobase = 1, RULE_base = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"multi", "ciclobase", "base"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VNUMBERSC", "OPEN", "CLOSE", "NUMBER", "COMA", "WS"
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
	public String getGrammarFileName() { return "corchetes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public corchetesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MultiContext extends ParserRuleContext {
		public List<CiclobaseContext> ciclobase() {
			return getRuleContexts(CiclobaseContext.class);
		}
		public CiclobaseContext ciclobase(int i) {
			return getRuleContext(CiclobaseContext.class,i);
		}
		public MultiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof corchetesListener ) ((corchetesListener)listener).enterMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof corchetesListener ) ((corchetesListener)listener).exitMulti(this);
		}
	}

	public final MultiContext multi() throws RecognitionException {
		MultiContext _localctx = new MultiContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_multi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				ciclobase();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN );
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

	public static class CiclobaseContext extends ParserRuleContext {
		public List<BaseContext> base() {
			return getRuleContexts(BaseContext.class);
		}
		public BaseContext base(int i) {
			return getRuleContext(BaseContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(corchetesParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(corchetesParser.COMA, i);
		}
		public CiclobaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclobase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof corchetesListener ) ((corchetesListener)listener).enterCiclobase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof corchetesListener ) ((corchetesListener)listener).exitCiclobase(this);
		}
	}

	public final CiclobaseContext ciclobase() throws RecognitionException {
		CiclobaseContext _localctx = new CiclobaseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ciclobase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(12); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(11);
					base();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(14); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(16);
				match(COMA);
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class BaseContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(corchetesParser.OPEN, 0); }
		public List<TerminalNode> VNUMBERSC() { return getTokens(corchetesParser.VNUMBERSC); }
		public TerminalNode VNUMBERSC(int i) {
			return getToken(corchetesParser.VNUMBERSC, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(corchetesParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(corchetesParser.CLOSE, i);
		}
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof corchetesListener ) ((corchetesListener)listener).enterBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof corchetesListener ) ((corchetesListener)listener).exitBase(this);
		}
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_base);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(OPEN);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VNUMBERSC) {
				{
				{
				setState(23);
				match(VNUMBERSC);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLOSE) {
				{
				{
				setState(29);
				match(CLOSE);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b&\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\3\6\3\17\n\3\r\3\16\3\20\3\3\7"+
		"\3\24\n\3\f\3\16\3\27\13\3\3\4\3\4\7\4\33\n\4\f\4\16\4\36\13\4\3\4\7\4"+
		"!\n\4\f\4\16\4$\13\4\3\4\2\2\5\2\4\6\2\2\2\'\2\t\3\2\2\2\4\16\3\2\2\2"+
		"\6\30\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3"+
		"\2\2\2\f\3\3\2\2\2\r\17\5\6\4\2\16\r\3\2\2\2\17\20\3\2\2\2\20\16\3\2\2"+
		"\2\20\21\3\2\2\2\21\25\3\2\2\2\22\24\7\7\2\2\23\22\3\2\2\2\24\27\3\2\2"+
		"\2\25\23\3\2\2\2\25\26\3\2\2\2\26\5\3\2\2\2\27\25\3\2\2\2\30\34\7\4\2"+
		"\2\31\33\7\3\2\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2"+
		"\2\35\"\3\2\2\2\36\34\3\2\2\2\37!\7\5\2\2 \37\3\2\2\2!$\3\2\2\2\" \3\2"+
		"\2\2\"#\3\2\2\2#\7\3\2\2\2$\"\3\2\2\2\7\13\20\25\34\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}