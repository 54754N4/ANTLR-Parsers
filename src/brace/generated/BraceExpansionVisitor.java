package brace.generated;
// Generated from .\BraceExpansion.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BraceExpansionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BraceExpansionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BraceExpansionParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(BraceExpansionParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link BraceExpansionParser#expansion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpansion(BraceExpansionParser.ExpansionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CSV}
	 * labeled alternative in {@link BraceExpansionParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCSV(BraceExpansionParser.CSVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Range}
	 * labeled alternative in {@link BraceExpansionParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(BraceExpansionParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BraceExpansionParser#preamble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreamble(BraceExpansionParser.PreambleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BraceExpansionParser#postscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostscript(BraceExpansionParser.PostscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link BraceExpansionParser#any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny(BraceExpansionParser.AnyContext ctx);
}