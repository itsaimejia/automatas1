// Generated from .\lenguaje.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lenguajeParser}.
 */
public interface lenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#busqueda}.
	 * @param ctx the parse tree
	 */
	void enterBusqueda(lenguajeParser.BusquedaContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#busqueda}.
	 * @param ctx the parse tree
	 */
	void exitBusqueda(lenguajeParser.BusquedaContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#nombre_tabla}.
	 * @param ctx the parse tree
	 */
	void enterNombre_tabla(lenguajeParser.Nombre_tablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#nombre_tabla}.
	 * @param ctx the parse tree
	 */
	void exitNombre_tabla(lenguajeParser.Nombre_tablaContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#nombre_columna}.
	 * @param ctx the parse tree
	 */
	void enterNombre_columna(lenguajeParser.Nombre_columnaContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#nombre_columna}.
	 * @param ctx the parse tree
	 */
	void exitNombre_columna(lenguajeParser.Nombre_columnaContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#nombre_bd}.
	 * @param ctx the parse tree
	 */
	void enterNombre_bd(lenguajeParser.Nombre_bdContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#nombre_bd}.
	 * @param ctx the parse tree
	 */
	void exitNombre_bd(lenguajeParser.Nombre_bdContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#argumento}.
	 * @param ctx the parse tree
	 */
	void enterArgumento(lenguajeParser.ArgumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#argumento}.
	 * @param ctx the parse tree
	 */
	void exitArgumento(lenguajeParser.ArgumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(lenguajeParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(lenguajeParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#sentencia_final}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_final(lenguajeParser.Sentencia_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#sentencia_final}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_final(lenguajeParser.Sentencia_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenguajeParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(lenguajeParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenguajeParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(lenguajeParser.CondicionContext ctx);
}