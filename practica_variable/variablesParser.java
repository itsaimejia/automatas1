// Generated from .\variables.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class variablesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, CHAR=2, FLOAT=3, BOOLEAN=4, DOUBLE=5, NOMBRE=6, PC=7, ENTER=8, 
		ESPACIOS=9;
	public static final int
		RULE_variables = 0, RULE_estructura = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"variables", "estructura"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'char'", "'float'", "'boolean'", "'double'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "CHAR", "FLOAT", "BOOLEAN", "DOUBLE", "NOMBRE", "PC", "ENTER", 
			"ESPACIOS"
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
	public String getGrammarFileName() { return "variables.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public variablesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class VariablesContext extends ParserRuleContext {
		public EstructuraContext estructura() {
			return getRuleContext(EstructuraContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof variablesListener ) ((variablesListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof variablesListener ) ((variablesListener)listener).exitVariables(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			estructura();
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

	public static class EstructuraContext extends ParserRuleContext {
		public Token INT;
		public Token NOMBRE;
		public Token FLOAT;
		public Token CHAR;
		public Token BOOLEAN;
		public Token DOUBLE;
		public TerminalNode INT() { return getToken(variablesParser.INT, 0); }
		public TerminalNode NOMBRE() { return getToken(variablesParser.NOMBRE, 0); }
		public TerminalNode FLOAT() { return getToken(variablesParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(variablesParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(variablesParser.BOOLEAN, 0); }
		public TerminalNode DOUBLE() { return getToken(variablesParser.DOUBLE, 0); }
		public EstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof variablesListener ) ((variablesListener)listener).enterEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof variablesListener ) ((variablesListener)listener).exitEstructura(this);
		}
	}

	public final EstructuraContext estructura() throws RecognitionException {
		EstructuraContext _localctx = new EstructuraContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_estructura);
		try {
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				((EstructuraContext)_localctx).INT = match(INT);
				setState(7);
				((EstructuraContext)_localctx).NOMBRE = match(NOMBRE);

				                System.out.println((((EstructuraContext)_localctx).INT!=null?((EstructuraContext)_localctx).INT.getText():null));
				                ValidateVar v = new ValidateVar((((EstructuraContext)_localctx).INT!=null?((EstructuraContext)_localctx).INT.getText():null), (((EstructuraContext)_localctx).NOMBRE!=null?((EstructuraContext)_localctx).NOMBRE.getText():null));
				                v.valid();
				            
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				((EstructuraContext)_localctx).FLOAT = match(FLOAT);
				setState(10);
				((EstructuraContext)_localctx).NOMBRE = match(NOMBRE);

				                ValidateVar v = new ValidateVar((((EstructuraContext)_localctx).FLOAT!=null?((EstructuraContext)_localctx).FLOAT.getText():null), (((EstructuraContext)_localctx).NOMBRE!=null?((EstructuraContext)_localctx).NOMBRE.getText():null));
				                v.valid();
				            
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(12);
				((EstructuraContext)_localctx).CHAR = match(CHAR);
				setState(13);
				((EstructuraContext)_localctx).NOMBRE = match(NOMBRE);

				                ValidateVar v = new ValidateVar((((EstructuraContext)_localctx).CHAR!=null?((EstructuraContext)_localctx).CHAR.getText():null), (((EstructuraContext)_localctx).NOMBRE!=null?((EstructuraContext)_localctx).NOMBRE.getText():null));
				                v.valid();
				            
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(15);
				((EstructuraContext)_localctx).BOOLEAN = match(BOOLEAN);
				setState(16);
				((EstructuraContext)_localctx).NOMBRE = match(NOMBRE);

				                ValidateVar v = new ValidateVar((((EstructuraContext)_localctx).BOOLEAN!=null?((EstructuraContext)_localctx).BOOLEAN.getText():null), (((EstructuraContext)_localctx).NOMBRE!=null?((EstructuraContext)_localctx).NOMBRE.getText():null));
				                v.valid();
				            
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(18);
				((EstructuraContext)_localctx).DOUBLE = match(DOUBLE);
				setState(19);
				((EstructuraContext)_localctx).NOMBRE = match(NOMBRE);

				                ValidateVar v = new ValidateVar((((EstructuraContext)_localctx).DOUBLE!=null?((EstructuraContext)_localctx).DOUBLE.getText():null), (((EstructuraContext)_localctx).NOMBRE!=null?((EstructuraContext)_localctx).NOMBRE.getText():null));
				                v.valid();
				            
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 6);
				{

				                System.out.println("ERROR");
				            
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\33\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\31\n\3\3\3\2\2\4\2\4\2\2\2\35\2\6\3\2\2\2\4\30\3\2\2\2\6\7"+
		"\5\4\3\2\7\3\3\2\2\2\b\t\7\3\2\2\t\n\7\b\2\2\n\31\b\3\1\2\13\f\7\5\2\2"+
		"\f\r\7\b\2\2\r\31\b\3\1\2\16\17\7\4\2\2\17\20\7\b\2\2\20\31\b\3\1\2\21"+
		"\22\7\6\2\2\22\23\7\b\2\2\23\31\b\3\1\2\24\25\7\7\2\2\25\26\7\b\2\2\26"+
		"\31\b\3\1\2\27\31\b\3\1\2\30\b\3\2\2\2\30\13\3\2\2\2\30\16\3\2\2\2\30"+
		"\21\3\2\2\2\30\24\3\2\2\2\30\27\3\2\2\2\31\5\3\2\2\2\3\30";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}