// Generated from .\Sandbox.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SandboxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SandboxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SandboxParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(SandboxParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link SandboxParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(SandboxParser.NumberContext ctx);
}