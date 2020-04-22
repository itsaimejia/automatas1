// Generated from .\password.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link passwordParser}.
 */
public interface passwordListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link passwordParser#password}.
	 * @param ctx the parse tree
	 */
	void enterPassword(passwordParser.PasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link passwordParser#password}.
	 * @param ctx the parse tree
	 */
	void exitPassword(passwordParser.PasswordContext ctx);
}