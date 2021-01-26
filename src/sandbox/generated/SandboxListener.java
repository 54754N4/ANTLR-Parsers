// Generated from .\Sandbox.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SandboxParser}.
 */
public interface SandboxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SandboxParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(SandboxParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link SandboxParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(SandboxParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link SandboxParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SandboxParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SandboxParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SandboxParser.NumberContext ctx);
}