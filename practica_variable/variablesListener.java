// Generated from .\variables.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link variablesParser}.
 */
public interface variablesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link variablesParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(variablesParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link variablesParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(variablesParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link variablesParser#estructura}.
	 * @param ctx the parse tree
	 */
	void enterEstructura(variablesParser.EstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link variablesParser#estructura}.
	 * @param ctx the parse tree
	 */
	void exitEstructura(variablesParser.EstructuraContext ctx);
}