// Generated from .\BraceExpansion.g4 by ANTLR 4.9.1

package brace.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BraceExpansionParser}.
 */
public interface BraceExpansionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BraceExpansionParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(BraceExpansionParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link BraceExpansionParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(BraceExpansionParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link BraceExpansionParser#expansion}.
	 * @param ctx the parse tree
	 */
	void enterExpansion(BraceExpansionParser.ExpansionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BraceExpansionParser#expansion}.
	 * @param ctx the parse tree
	 */
	void exitExpansion(BraceExpansionParser.ExpansionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BraceExpansionParser#csv}.
	 * @param ctx the parse tree
	 */
	void enterCsv(BraceExpansionParser.CsvContext ctx);
	/**
	 * Exit a parse tree produced by {@link BraceExpansionParser#csv}.
	 * @param ctx the parse tree
	 */
	void exitCsv(BraceExpansionParser.CsvContext ctx);
	/**
	 * Enter a parse tree produced by {@link BraceExpansionParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(BraceExpansionParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BraceExpansionParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(BraceExpansionParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BraceExpansionParser#postscript}.
	 * @param ctx the parse tree
	 */
	void enterPostscript(BraceExpansionParser.PostscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link BraceExpansionParser#postscript}.
	 * @param ctx the parse tree
	 */
	void exitPostscript(BraceExpansionParser.PostscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link BraceExpansionParser#preamble}.
	 * @param ctx the parse tree
	 */
	void enterPreamble(BraceExpansionParser.PreambleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BraceExpansionParser#preamble}.
	 * @param ctx the parse tree
	 */
	void exitPreamble(BraceExpansionParser.PreambleContext ctx);
}