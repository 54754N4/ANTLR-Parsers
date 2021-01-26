// Generated from .\Bash.g4 by ANTLR 4.9.1

package bash.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BashParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BashVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BashParser#inputunit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputunit(BashParser.InputunitContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#word_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord_list(BashParser.Word_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#redirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedirection(BashParser.RedirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#simple_command_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_command_element(BashParser.Simple_command_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#redirection_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedirection_list(BashParser.Redirection_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#simple_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_command(BashParser.Simple_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(BashParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#shell_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShell_command(BashParser.Shell_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#for_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_command(BashParser.For_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#arith_for_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_for_command(BashParser.Arith_for_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#select_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_command(BashParser.Select_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#case_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_command(BashParser.Case_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def(BashParser.Function_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(BashParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#subshell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubshell(BashParser.SubshellContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#coproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoproc(BashParser.CoprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#if_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_command(BashParser.If_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#group_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_command(BashParser.Group_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#arith_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_command(BashParser.Arith_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#cond_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_command(BashParser.Cond_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#elif_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_clause(BashParser.Elif_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#case_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_clause(BashParser.Case_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#pattern_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_list(BashParser.Pattern_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#case_clause_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_clause_sequence(BashParser.Case_clause_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(BashParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(BashParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#compound_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_list(BashParser.Compound_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#list0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList0(BashParser.List0Context ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#list1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList1(BashParser.List1Context ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#simple_list_terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_list_terminator(BashParser.Simple_list_terminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#list_terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_terminator(BashParser.List_terminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#newline_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline_list(BashParser.Newline_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#simple_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_list(BashParser.Simple_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#simple_list1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_list1(BashParser.Simple_list1Context ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#pipeline_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeline_command(BashParser.Pipeline_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#pipeline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeline(BashParser.PipelineContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashParser#timespec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimespec(BashParser.TimespecContext ctx);
}