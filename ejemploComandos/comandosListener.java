// Generated from .\comandos.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link comandosParser}.
 */
public interface comandosListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link comandosParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(comandosParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link comandosParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(comandosParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link comandosParser#consola}.
	 * @param ctx the parse tree
	 */
	void enterConsola(comandosParser.ConsolaContext ctx);
	/**
	 * Exit a parse tree produced by {@link comandosParser#consola}.
	 * @param ctx the parse tree
	 */
	void exitConsola(comandosParser.ConsolaContext ctx);
}