// Generated from .\corchetes.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link corchetesParser}.
 */
public interface corchetesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link corchetesParser#multi}.
	 * @param ctx the parse tree
	 */
	void enterMulti(corchetesParser.MultiContext ctx);
	/**
	 * Exit a parse tree produced by {@link corchetesParser#multi}.
	 * @param ctx the parse tree
	 */
	void exitMulti(corchetesParser.MultiContext ctx);
	/**
	 * Enter a parse tree produced by {@link corchetesParser#ciclobase}.
	 * @param ctx the parse tree
	 */
	void enterCiclobase(corchetesParser.CiclobaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link corchetesParser#ciclobase}.
	 * @param ctx the parse tree
	 */
	void exitCiclobase(corchetesParser.CiclobaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link corchetesParser#base}.
	 * @param ctx the parse tree
	 */
	void enterBase(corchetesParser.BaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link corchetesParser#base}.
	 * @param ctx the parse tree
	 */
	void exitBase(corchetesParser.BaseContext ctx);
}