// Generated from .\lenguaje.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lenguajeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SELECT=4, UPDATE=5, DELETE=6, INSERT=7, CREATE=8, 
		FROM=9, WHERE=10, SET=11, INTO=12, VALUES=13, DATABASE=14, ASTERISCO=15, 
		SEMI=16, ID=17, CANTIDAD=18, ESPACION=19, ENTER=20;
	public static final int
		RULE_busqueda = 0, RULE_nombre_tabla = 1, RULE_nombre_columna = 2, RULE_nombre_bd = 3, 
		RULE_argumento = 4, RULE_operacion = 5, RULE_sentencia_final = 6, RULE_condicion = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"busqueda", "nombre_tabla", "nombre_columna", "nombre_bd", "argumento", 
			"operacion", "sentencia_final", "condicion"
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

	@Override
	public String getGrammarFileName() { return "lenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BusquedaContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(lenguajeParser.SELECT, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode FROM() { return getToken(lenguajeParser.FROM, 0); }
		public Nombre_tablaContext nombre_tabla() {
			return getRuleContext(Nombre_tablaContext.class,0);
		}
		public Sentencia_finalContext sentencia_final() {
			return getRuleContext(Sentencia_finalContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(lenguajeParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(lenguajeParser.SET, 0); }
		public Nombre_columnaContext nombre_columna() {
			return getRuleContext(Nombre_columnaContext.class,0);
		}
		public ArgumentoContext argumento() {
			return getRuleContext(ArgumentoContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(lenguajeParser.WHERE, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(lenguajeParser.DELETE, 0); }
		public TerminalNode INSERT() { return getToken(lenguajeParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(lenguajeParser.INTO, 0); }
		public TerminalNode VALUES() { return getToken(lenguajeParser.VALUES, 0); }
		public TerminalNode CREATE() { return getToken(lenguajeParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(lenguajeParser.DATABASE, 0); }
		public Nombre_bdContext nombre_bd() {
			return getRuleContext(Nombre_bdContext.class,0);
		}
		public BusquedaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_busqueda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterBusqueda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitBusqueda(this);
		}
	}

	public final BusquedaContext busqueda() throws RecognitionException {
		BusquedaContext _localctx = new BusquedaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_busqueda);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(SELECT);
				setState(17);
				operacion();
				setState(18);
				match(FROM);
				setState(19);
				nombre_tabla();
				setState(20);
				sentencia_final();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				match(UPDATE);
				setState(23);
				nombre_tabla();
				setState(24);
				match(SET);
				setState(25);
				nombre_columna();
				setState(26);
				match(T__0);
				setState(27);
				argumento();
				setState(28);
				match(WHERE);
				setState(29);
				condicion();
				setState(30);
				sentencia_final();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(DELETE);
				setState(33);
				match(FROM);
				setState(34);
				nombre_tabla();
				setState(35);
				match(WHERE);
				setState(36);
				condicion();
				setState(37);
				sentencia_final();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				match(INSERT);
				setState(40);
				match(INTO);
				setState(41);
				nombre_tabla();
				setState(42);
				match(VALUES);
				setState(43);
				match(T__1);
				setState(44);
				argumento();
				setState(45);
				match(T__2);
				setState(46);
				sentencia_final();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				match(CREATE);
				setState(49);
				match(DATABASE);
				setState(50);
				nombre_bd();
				setState(51);
				sentencia_final();
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

	public static class Nombre_tablaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public Nombre_tablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_tabla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterNombre_tabla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitNombre_tabla(this);
		}
	}

	public final Nombre_tablaContext nombre_tabla() throws RecognitionException {
		Nombre_tablaContext _localctx = new Nombre_tablaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nombre_tabla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
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

	public static class Nombre_columnaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public Nombre_columnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_columna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterNombre_columna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitNombre_columna(this);
		}
	}

	public final Nombre_columnaContext nombre_columna() throws RecognitionException {
		Nombre_columnaContext _localctx = new Nombre_columnaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nombre_columna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
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

	public static class Nombre_bdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public Nombre_bdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_bd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterNombre_bd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitNombre_bd(this);
		}
	}

	public final Nombre_bdContext nombre_bd() throws RecognitionException {
		Nombre_bdContext _localctx = new Nombre_bdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nombre_bd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
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

	public static class ArgumentoContext extends ParserRuleContext {
		public TerminalNode CANTIDAD() { return getToken(lenguajeParser.CANTIDAD, 0); }
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterArgumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitArgumento(this);
		}
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argumento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==CANTIDAD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OperacionContext extends ParserRuleContext {
		public TerminalNode ASTERISCO() { return getToken(lenguajeParser.ASTERISCO, 0); }
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitOperacion(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !(_la==ASTERISCO || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Sentencia_finalContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(lenguajeParser.SEMI, 0); }
		public Sentencia_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterSentencia_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitSentencia_final(this);
		}
	}

	public final Sentencia_finalContext sentencia_final() throws RecognitionException {
		Sentencia_finalContext _localctx = new Sentencia_finalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentencia_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(65);
				match(SEMI);
				}
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

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public ArgumentoContext argumento() {
			return getRuleContext(ArgumentoContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ID);
			setState(69);
			match(T__0);
			setState(70);
			argumento();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26K\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\28\n\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\5\bE\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\2\2\n\2\4\6\b\n\f\16\20\2\4\3\2\23\24\4\2\21\21\23\23\2G\2\67\3\2\2"+
		"\2\49\3\2\2\2\6;\3\2\2\2\b=\3\2\2\2\n?\3\2\2\2\fA\3\2\2\2\16D\3\2\2\2"+
		"\20F\3\2\2\2\22\23\7\6\2\2\23\24\5\f\7\2\24\25\7\13\2\2\25\26\5\4\3\2"+
		"\26\27\5\16\b\2\278\3\2\2\2\30\31\7\7\2\2\31\32\5\4\3\2\32\33\7\r\2\2"+
		"\33\34\5\6\4\2\34\35\7\3\2\2\35\36\5\n\6\2\36\37\7\f\2\2\37 \5\20\t\2"+
		" !\5\16\b\2!8\3\2\2\2\"#\7\b\2\2#$\7\13\2\2$%\5\4\3\2%&\7\f\2\2&\'\5\20"+
		"\t\2\'(\5\16\b\2(8\3\2\2\2)*\7\t\2\2*+\7\16\2\2+,\5\4\3\2,-\7\17\2\2-"+
		".\7\4\2\2./\5\n\6\2/\60\7\5\2\2\60\61\5\16\b\2\618\3\2\2\2\62\63\7\n\2"+
		"\2\63\64\7\20\2\2\64\65\5\b\5\2\65\66\5\16\b\2\668\3\2\2\2\67\22\3\2\2"+
		"\2\67\30\3\2\2\2\67\"\3\2\2\2\67)\3\2\2\2\67\62\3\2\2\28\3\3\2\2\29:\7"+
		"\23\2\2:\5\3\2\2\2;<\7\23\2\2<\7\3\2\2\2=>\7\23\2\2>\t\3\2\2\2?@\t\2\2"+
		"\2@\13\3\2\2\2AB\t\3\2\2B\r\3\2\2\2CE\7\22\2\2DC\3\2\2\2DE\3\2\2\2E\17"+
		"\3\2\2\2FG\7\23\2\2GH\7\3\2\2HI\5\n\6\2I\21\3\2\2\2\4\67D";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}