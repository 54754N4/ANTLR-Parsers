// Generated from .\Commands.g4 by ANTLR 4.9.1

package commands.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommandsParser}.
 */
public interface CommandsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommandsParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(CommandsParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(CommandsParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Chain}
	 * labeled alternative in {@link CommandsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterChain(CommandsParser.ChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Chain}
	 * labeled alternative in {@link CommandsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitChain(CommandsParser.ChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Redirection}
	 * labeled alternative in {@link CommandsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRedirection(CommandsParser.RedirectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Redirection}
	 * labeled alternative in {@link CommandsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRedirection(CommandsParser.RedirectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericCommand}
	 * labeled alternative in {@link CommandsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterGenericCommand(CommandsParser.GenericCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericCommand}
	 * labeled alternative in {@link CommandsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitGenericCommand(CommandsParser.GenericCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandsParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(CommandsParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(CommandsParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandsParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(CommandsParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(CommandsParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandsParser#namedArg}.
	 * @param ctx the parse tree
	 */
	void enterNamedArg(CommandsParser.NamedArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#namedArg}.
	 * @param ctx the parse tree
	 */
	void exitNamedArg(CommandsParser.NamedArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandsParser#unnamedArg}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedArg(CommandsParser.UnnamedArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandsParser#unnamedArg}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedArg(CommandsParser.UnnamedArgContext ctx);
}