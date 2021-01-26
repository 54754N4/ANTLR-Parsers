// Generated from .\MathExpression.g4 by ANTLR 4.9.1

	package calc.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MathExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MathExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MathExpressionParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(MathExpressionParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MathExpressionParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathExpressionParser#assignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentList(MathExpressionParser.AssignmentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathExpressionParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MathExpressionParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathExpressionParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(MathExpressionParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathExpressionParser#arithmeticList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticList(MathExpressionParser.ArithmeticListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Shift}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift(MathExpressionParser.ShiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MathExpressionParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NestedArithmetic}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedArithmetic(MathExpressionParser.NestedArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(MathExpressionParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ternary}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary(MathExpressionParser.TernaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataStructure}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStructure(MathExpressionParser.DataStructureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnyConstant}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyConstant(MathExpressionParser.AnyConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Prefix}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix(MathExpressionParser.PrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Range}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(MathExpressionParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(MathExpressionParser.MultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Function}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(MathExpressionParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Postfix}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix(MathExpressionParser.PostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PureImaginary}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPureImaginary(MathExpressionParser.PureImaginaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modulus}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulus(MathExpressionParser.ModulusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelativeComparison}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeComparison(MathExpressionParser.RelativeComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAndOr}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndOr(MathExpressionParser.LogicalAndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayIndexing}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndexing(MathExpressionParser.ArrayIndexingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitOp}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOp(MathExpressionParser.BitOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(MathExpressionParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityComparison}
	 * labeled alternative in {@link MathExpressionParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityComparison(MathExpressionParser.EqualityComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Set}
	 * labeled alternative in {@link MathExpressionParser#structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(MathExpressionParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Vector}
	 * labeled alternative in {@link MathExpressionParser#structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(MathExpressionParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Matrix}
	 * labeled alternative in {@link MathExpressionParser#structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix(MathExpressionParser.MatrixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code True}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(MathExpressionParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code False}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(MathExpressionParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pi}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPi(MathExpressionParser.PiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(MathExpressionParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(MathExpressionParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(MathExpressionParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(MathExpressionParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Char}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(MathExpressionParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CisComplex}
	 * labeled alternative in {@link MathExpressionParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCisComplex(MathExpressionParser.CisComplexContext ctx);
}