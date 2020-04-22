// Generated from .\telefono.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link telefonoParser}.
 */
public interface telefonoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link telefonoParser#varios}.
	 * @param ctx the parse tree
	 */
	void enterVarios(telefonoParser.VariosContext ctx);
	/**
	 * Exit a parse tree produced by {@link telefonoParser#varios}.
	 * @param ctx the parse tree
	 */
	void exitVarios(telefonoParser.VariosContext ctx);
	/**
	 * Enter a parse tree produced by {@link telefonoParser#numero_telefonico}.
	 * @param ctx the parse tree
	 */
	void enterNumero_telefonico(telefonoParser.Numero_telefonicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link telefonoParser#numero_telefonico}.
	 * @param ctx the parse tree
	 */
	void exitNumero_telefonico(telefonoParser.Numero_telefonicoContext ctx);
}