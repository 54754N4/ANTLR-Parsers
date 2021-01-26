// Generated from .\Bash.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BashParser}.
 */
public interface BashListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BashParser#inputunit}.
	 * @param ctx the parse tree
	 */
	void enterInputunit(BashParser.InputunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#inputunit}.
	 * @param ctx the parse tree
	 */
	void exitInputunit(BashParser.InputunitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#word_list}.
	 * @param ctx the parse tree
	 */
	void enterWord_list(BashParser.Word_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#word_list}.
	 * @param ctx the parse tree
	 */
	void exitWord_list(BashParser.Word_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#redirection}.
	 * @param ctx the parse tree
	 */
	void enterRedirection(BashParser.RedirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#redirection}.
	 * @param ctx the parse tree
	 */
	void exitRedirection(BashParser.RedirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#simple_command_element}.
	 * @param ctx the parse tree
	 */
	void enterSimple_command_element(BashParser.Simple_command_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#simple_command_element}.
	 * @param ctx the parse tree
	 */
	void exitSimple_command_element(BashParser.Simple_command_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#redirection_list}.
	 * @param ctx the parse tree
	 */
	void enterRedirection_list(BashParser.Redirection_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#redirection_list}.
	 * @param ctx the parse tree
	 */
	void exitRedirection_list(BashParser.Redirection_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#simple_command}.
	 * @param ctx the parse tree
	 */
	void enterSimple_command(BashParser.Simple_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#simple_command}.
	 * @param ctx the parse tree
	 */
	void exitSimple_command(BashParser.Simple_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(BashParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(BashParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#shell_command}.
	 * @param ctx the parse tree
	 */
	void enterShell_command(BashParser.Shell_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#shell_command}.
	 * @param ctx the parse tree
	 */
	void exitShell_command(BashParser.Shell_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#for_command}.
	 * @param ctx the parse tree
	 */
	void enterFor_command(BashParser.For_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#for_command}.
	 * @param ctx the parse tree
	 */
	void exitFor_command(BashParser.For_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#arith_for_command}.
	 * @param ctx the parse tree
	 */
	void enterArith_for_command(BashParser.Arith_for_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#arith_for_command}.
	 * @param ctx the parse tree
	 */
	void exitArith_for_command(BashParser.Arith_for_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#select_command}.
	 * @param ctx the parse tree
	 */
	void enterSelect_command(BashParser.Select_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#select_command}.
	 * @param ctx the parse tree
	 */
	void exitSelect_command(BashParser.Select_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#case_command}.
	 * @param ctx the parse tree
	 */
	void enterCase_command(BashParser.Case_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#case_command}.
	 * @param ctx the parse tree
	 */
	void exitCase_command(BashParser.Case_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(BashParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(BashParser.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(BashParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(BashParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#subshell}.
	 * @param ctx the parse tree
	 */
	void enterSubshell(BashParser.SubshellContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#subshell}.
	 * @param ctx the parse tree
	 */
	void exitSubshell(BashParser.SubshellContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#coproc}.
	 * @param ctx the parse tree
	 */
	void enterCoproc(BashParser.CoprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#coproc}.
	 * @param ctx the parse tree
	 */
	void exitCoproc(BashParser.CoprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#if_command}.
	 * @param ctx the parse tree
	 */
	void enterIf_command(BashParser.If_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#if_command}.
	 * @param ctx the parse tree
	 */
	void exitIf_command(BashParser.If_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#group_command}.
	 * @param ctx the parse tree
	 */
	void enterGroup_command(BashParser.Group_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#group_command}.
	 * @param ctx the parse tree
	 */
	void exitGroup_command(BashParser.Group_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#arith_command}.
	 * @param ctx the parse tree
	 */
	void enterArith_command(BashParser.Arith_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#arith_command}.
	 * @param ctx the parse tree
	 */
	void exitArith_command(BashParser.Arith_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#cond_command}.
	 * @param ctx the parse tree
	 */
	void enterCond_command(BashParser.Cond_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#cond_command}.
	 * @param ctx the parse tree
	 */
	void exitCond_command(BashParser.Cond_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#elif_clause}.
	 * @param ctx the parse tree
	 */
	void enterElif_clause(BashParser.Elif_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#elif_clause}.
	 * @param ctx the parse tree
	 */
	void exitElif_clause(BashParser.Elif_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#case_clause}.
	 * @param ctx the parse tree
	 */
	void enterCase_clause(BashParser.Case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#case_clause}.
	 * @param ctx the parse tree
	 */
	void exitCase_clause(BashParser.Case_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#pattern_list}.
	 * @param ctx the parse tree
	 */
	void enterPattern_list(BashParser.Pattern_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#pattern_list}.
	 * @param ctx the parse tree
	 */
	void exitPattern_list(BashParser.Pattern_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#case_clause_sequence}.
	 * @param ctx the parse tree
	 */
	void enterCase_clause_sequence(BashParser.Case_clause_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#case_clause_sequence}.
	 * @param ctx the parse tree
	 */
	void exitCase_clause_sequence(BashParser.Case_clause_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(BashParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(BashParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(BashParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(BashParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#compound_list}.
	 * @param ctx the parse tree
	 */
	void enterCompound_list(BashParser.Compound_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#compound_list}.
	 * @param ctx the parse tree
	 */
	void exitCompound_list(BashParser.Compound_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#list0}.
	 * @param ctx the parse tree
	 */
	void enterList0(BashParser.List0Context ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#list0}.
	 * @param ctx the parse tree
	 */
	void exitList0(BashParser.List0Context ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#list1}.
	 * @param ctx the parse tree
	 */
	void enterList1(BashParser.List1Context ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#list1}.
	 * @param ctx the parse tree
	 */
	void exitList1(BashParser.List1Context ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#simple_list_terminator}.
	 * @param ctx the parse tree
	 */
	void enterSimple_list_terminator(BashParser.Simple_list_terminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#simple_list_terminator}.
	 * @param ctx the parse tree
	 */
	void exitSimple_list_terminator(BashParser.Simple_list_terminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#list_terminator}.
	 * @param ctx the parse tree
	 */
	void enterList_terminator(BashParser.List_terminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#list_terminator}.
	 * @param ctx the parse tree
	 */
	void exitList_terminator(BashParser.List_terminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#newline_list}.
	 * @param ctx the parse tree
	 */
	void enterNewline_list(BashParser.Newline_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#newline_list}.
	 * @param ctx the parse tree
	 */
	void exitNewline_list(BashParser.Newline_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#simple_list}.
	 * @param ctx the parse tree
	 */
	void enterSimple_list(BashParser.Simple_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#simple_list}.
	 * @param ctx the parse tree
	 */
	void exitSimple_list(BashParser.Simple_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#simple_list1}.
	 * @param ctx the parse tree
	 */
	void enterSimple_list1(BashParser.Simple_list1Context ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#simple_list1}.
	 * @param ctx the parse tree
	 */
	void exitSimple_list1(BashParser.Simple_list1Context ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#pipeline_command}.
	 * @param ctx the parse tree
	 */
	void enterPipeline_command(BashParser.Pipeline_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#pipeline_command}.
	 * @param ctx the parse tree
	 */
	void exitPipeline_command(BashParser.Pipeline_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#pipeline}.
	 * @param ctx the parse tree
	 */
	void enterPipeline(BashParser.PipelineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#pipeline}.
	 * @param ctx the parse tree
	 */
	void exitPipeline(BashParser.PipelineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashParser#timespec}.
	 * @param ctx the parse tree
	 */
	void enterTimespec(BashParser.TimespecContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashParser#timespec}.
	 * @param ctx the parse tree
	 */
	void exitTimespec(BashParser.TimespecContext ctx);
}