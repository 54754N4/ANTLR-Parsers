package brace.generated;
// Generated from .\BraceExpansion.g4 by ANTLR 4.9.1
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
	 * Enter a parse tree produced by the {@code CSV}
	 * labeled alternative in {@link BraceExpansionParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCSV(BraceExpansionParser.CSVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSV}
	 * labeled alternative in {@link BraceExpansionParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCSV(BraceExpansionParser.CSVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Range}
	 * labeled alternative in {@link BraceExpansionParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRange(BraceExpansionParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Range}
	 * labeled alternative in {@link BraceExpansionParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRange(BraceExpansionParser.RangeContext ctx);
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
	 * Enter a parse tree produced by {@link BraceExpansionParser#any}.
	 * @param ctx the parse tree
	 */
	void enterAny(BraceExpansionParser.AnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BraceExpansionParser#any}.
	 * @param ctx the parse tree
	 */
	void exitAny(BraceExpansionParser.AnyContext ctx);
}