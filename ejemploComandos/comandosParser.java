// Generated from .\comandos.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class comandosParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CD=1, DIR=2, TREE=3, CLS=4, EXIT=5, RUTA=6, ENTER=7, ESPACIOS=8;
	public static final int
		RULE_comandos = 0, RULE_consola = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"comandos", "consola"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'cd'", "'dir'", "'tree'", "'cls'", "'exit'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CD", "DIR", "TREE", "CLS", "EXIT", "RUTA", "ENTER", "ESPACIOS"
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
	public String getGrammarFileName() { return "comandos.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public comandosParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ComandosContext extends ParserRuleContext {
		public ConsolaContext consola() {
			return getRuleContext(ConsolaContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comandosListener ) ((comandosListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comandosListener ) ((comandosListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_comandos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			consola();
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

	public static class ConsolaContext extends ParserRuleContext {
		public Token CD;
		public Token RUTA;
		public Token DIR;
		public Token TREE;
		public Token CLS;
		public Token EXIT;
		public TerminalNode CD() { return getToken(comandosParser.CD, 0); }
		public TerminalNode RUTA() { return getToken(comandosParser.RUTA, 0); }
		public TerminalNode ENTER() { return getToken(comandosParser.ENTER, 0); }
		public TerminalNode DIR() { return getToken(comandosParser.DIR, 0); }
		public TerminalNode TREE() { return getToken(comandosParser.TREE, 0); }
		public TerminalNode CLS() { return getToken(comandosParser.CLS, 0); }
		public TerminalNode EXIT() { return getToken(comandosParser.EXIT, 0); }
		public ConsolaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consola; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof comandosListener ) ((comandosListener)listener).enterConsola(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof comandosListener ) ((comandosListener)listener).exitConsola(this);
		}
	}

	public final ConsolaContext consola() throws RecognitionException {
		ConsolaContext _localctx = new ConsolaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_consola);
		int _la;
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CD:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				((ConsolaContext)_localctx).CD = match(CD);
				setState(7);
				((ConsolaContext)_localctx).RUTA = match(RUTA);
				setState(8);
				match(ENTER);

				            System.out.println((((ConsolaContext)_localctx).CD!=null?((ConsolaContext)_localctx).CD.getText():null));
				            System.out.println("El comando cd se utiliza para acceder a directorios dentro de los SO");
				            System.out.println("El comando que usted ingreso es: "+(((ConsolaContext)_localctx).CD!=null?((ConsolaContext)_localctx).CD.getText():null)+" "+(((ConsolaContext)_localctx).RUTA!=null?((ConsolaContext)_localctx).RUTA.getText():null));
				            System.out.println((((ConsolaContext)_localctx).CD!=null?((ConsolaContext)_localctx).CD.getText():null) +" "+ (((ConsolaContext)_localctx).RUTA!=null?((ConsolaContext)_localctx).RUTA.getText():null));
				        
				}
				break;
			case DIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(10);
				((ConsolaContext)_localctx).DIR = match(DIR);
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RUTA) {
					{
					setState(11);
					((ConsolaContext)_localctx).RUTA = match(RUTA);
					}
				}

				setState(14);
				match(ENTER);

				            System.out.println("El comando lista el contenido del directorio o carpeta donde te encuentras, mostrando todas las subcarpetas o archivos que tiene. Con este comando podrás saber si el archivo que buscas está ahí o a qué subcarpeta navegar.");
				            System.out.println("El comando que usted ingreso es: "+(((ConsolaContext)_localctx).DIR!=null?((ConsolaContext)_localctx).DIR.getText():null));
				            System.out.println((((ConsolaContext)_localctx).DIR!=null?((ConsolaContext)_localctx).DIR.getText():null)+" "+(((ConsolaContext)_localctx).RUTA!=null?((ConsolaContext)_localctx).RUTA.getText():null));
				        
				}
				break;
			case TREE:
				enterOuterAlt(_localctx, 3);
				{
				setState(16);
				((ConsolaContext)_localctx).TREE = match(TREE);
				setState(17);
				((ConsolaContext)_localctx).RUTA = match(RUTA);
				setState(18);
				match(ENTER);

				            System.out.println("Te muestra el árbol de directorios de una carpeta concreta que le digas");
				            System.out.println("El comando que usted ingreso es: "+(((ConsolaContext)_localctx).TREE!=null?((ConsolaContext)_localctx).TREE.getText():null));
				            System.out.println((((ConsolaContext)_localctx).TREE!=null?((ConsolaContext)_localctx).TREE.getText():null) +" "+ (((ConsolaContext)_localctx).RUTA!=null?((ConsolaContext)_localctx).RUTA.getText():null));
				        
				}
				break;
			case CLS:
				enterOuterAlt(_localctx, 4);
				{
				setState(20);
				((ConsolaContext)_localctx).CLS = match(CLS);

				            System.out.println("Limpia la ventana de la consola de Windows, borrando todo lo que se ha escrito en ella, tanto tus comandos como las respuestas de la propia consola. Se quedará todo como si la acabases de abrir de nuevo.");
				            System.out.println("El comando que usted ingreso es: "+(((ConsolaContext)_localctx).CLS!=null?((ConsolaContext)_localctx).CLS.getText():null));
				            System.out.println((((ConsolaContext)_localctx).CLS!=null?((ConsolaContext)_localctx).CLS.getText():null));
				        
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(22);
				((ConsolaContext)_localctx).EXIT = match(EXIT);

				            System.out.println("Cierra la ventana de la consola de Windows.");
				            System.out.println("El comando que usted ingreso es: "+(((ConsolaContext)_localctx).EXIT!=null?((ConsolaContext)_localctx).EXIT.getText():null));
				            System.out.println((((ConsolaContext)_localctx).EXIT!=null?((ConsolaContext)_localctx).EXIT.getText():null));
				        
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 6);
				{

				            System.out.println("No hay comando disponible");
				        
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\36\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\17\n\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\3\2\2\4\2\4\2\2\2!\2\6\3\2\2\2\4\33"+
		"\3\2\2\2\6\7\5\4\3\2\7\3\3\2\2\2\b\t\7\3\2\2\t\n\7\b\2\2\n\13\7\t\2\2"+
		"\13\34\b\3\1\2\f\16\7\4\2\2\r\17\7\b\2\2\16\r\3\2\2\2\16\17\3\2\2\2\17"+
		"\20\3\2\2\2\20\21\7\t\2\2\21\34\b\3\1\2\22\23\7\5\2\2\23\24\7\b\2\2\24"+
		"\25\7\t\2\2\25\34\b\3\1\2\26\27\7\6\2\2\27\34\b\3\1\2\30\31\7\7\2\2\31"+
		"\34\b\3\1\2\32\34\b\3\1\2\33\b\3\2\2\2\33\f\3\2\2\2\33\22\3\2\2\2\33\26"+
		"\3\2\2\2\33\30\3\2\2\2\33\32\3\2\2\2\34\5\3\2\2\2\4\16\33";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}