// Generated from .\MathExpression.g4 by ANTLR 4.9.1

	package calc.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MathExpressionParser}.
 */
public interface MathExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MathExpressionParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(MathExpressionParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathExpressionParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(MathExpressionParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MathExpressionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MathExpressionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathExpressionParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(MathExpressionParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathExpressionParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(MathExpressionParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathExpressionParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MathExpressionParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathExpressionParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MathExpressionParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathExpressionParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(MathExpressionParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathExpressionParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(MathExpressionParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathExpressionParser#arithmeticList}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticList(MathExpressionParser.ArithmeticListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathExpressionParser#arithmeticList}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticList(MathExpressionParser.ArithmeticListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Shift}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterShift(MathExpressionParser.ShiftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Shift}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitShift(MathExpressionParser.ShiftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MathExpressionParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MathExpressionParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NestedArithmetic}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterNestedArithmetic(MathExpressionParser.NestedArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NestedArithmetic}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitNestedArithmetic(MathExpressionParser.NestedArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(MathExpressionParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(MathExpressionParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ternary}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterTernary(MathExpressionParser.TernaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ternary}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitTernary(MathExpressionParser.TernaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DataStructure}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterDataStructure(MathExpressionParser.DataStructureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DataStructure}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitDataStructure(MathExpressionParser.DataStructureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyConstant}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterAnyConstant(MathExpressionParser.AnyConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyConstant}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitAnyConstant(MathExpressionParser.AnyConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Prefix}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(MathExpressionParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Prefix}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(MathExpressionParser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Range}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterRange(MathExpressionParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Range}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitRange(MathExpressionParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterMultDiv(MathExpressionParser.MultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitMultDiv(MathExpressionParser.MultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Function}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MathExpressionParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Function}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MathExpressionParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Postfix}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterPostfix(MathExpressionParser.PostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Postfix}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitPostfix(MathExpressionParser.PostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PureImaginary}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterPureImaginary(MathExpressionParser.PureImaginaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PureImaginary}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitPureImaginary(MathExpressionParser.PureImaginaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Modulus}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterModulus(MathExpressionParser.ModulusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Modulus}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitModulus(MathExpressionParser.ModulusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelativeComparison}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterRelativeComparison(MathExpressionParser.RelativeComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelativeComparison}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitRelativeComparison(MathExpressionParser.RelativeComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndOr}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndOr(MathExpressionParser.LogicalAndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndOr}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndOr(MathExpressionParser.LogicalAndOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayIndexing}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndexing(MathExpressionParser.ArrayIndexingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayIndexing}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndexing(MathExpressionParser.ArrayIndexingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitOp}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterBitOp(MathExpressionParser.BitOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitOp}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitBitOp(MathExpressionParser.BitOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Power}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterPower(MathExpressionParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitPower(MathExpressionParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityComparison}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterEqualityComparison(MathExpressionParser.EqualityComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityComparison}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitEqualityComparison(MathExpressionParser.EqualityComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Set}
	 * labeled alternative in {@link MathExpressionParser#structure}.
	 * @param ctx the parse tree
	 */
	void enterSet(MathExpressionParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Set}
	 * labeled alternative in {@link MathExpressionParser#structure}.
	 * @param ctx the parse tree
	 */
	void exitSet(MathExpressionParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Vector}
	 * labeled alternative in {@link MathExpressionParser#structure}.
	 * @param ctx the parse tree
	 */
	void enterVector(MathExpressionParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Vector}
	 * labeled alternative in {@link MathExpressionParser#structure}.
	 * @param ctx the parse tree
	 */
	void exitVector(MathExpressionParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Matrix}
	 * labeled alternative in {@link MathExpressionParser#structure}.
	 * @param ctx the parse tree
	 */
	void enterMatrix(MathExpressionParser.MatrixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Matrix}
	 * labeled alternative in {@link MathExpressionParser#structure}.
	 * @param ctx the parse tree
	 */
	void exitMatrix(MathExpressionParser.MatrixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code True}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTrue(MathExpressionParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code True}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTrue(MathExpressionParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code False}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterFalse(MathExpressionParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code False}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitFalse(MathExpressionParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pi}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterPi(MathExpressionParser.PiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pi}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitPi(MathExpressionParser.PiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterExp(MathExpressionParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitExp(MathExpressionParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Float}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterFloat(MathExpressionParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitFloat(MathExpressionParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterInt(MathExpressionParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitInt(MathExpressionParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterString(MathExpressionParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitString(MathExpressionParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Char}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterChar(MathExpressionParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Char}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitChar(MathExpressionParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CisComplex}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterCisComplex(MathExpressionParser.CisComplexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CisComplex}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitCisComplex(MathExpressionParser.CisComplexContext ctx);
}