// Generated from .\Commands.g4 by ANTLR 4.9.1

package commands.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CommandsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CommandsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CommandsParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(CommandsParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Chain}
	 * labeled alternative in {@link CommandsParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChain(CommandsParser.ChainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Redirection}
	 * labeled alternative in {@link CommandsParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedirection(CommandsParser.RedirectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GenericCommand}
	 * labeled alternative in {@link CommandsParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericCommand(CommandsParser.GenericCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandsParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(CommandsParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandsParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(CommandsParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandsParser#namedArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArg(CommandsParser.NamedArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommandsParser#unnamedArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedArg(CommandsParser.UnnamedArgContext ctx);
}