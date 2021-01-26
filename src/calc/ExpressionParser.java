package calc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.TerminalNode;

import calc.generated.MathExpressionBaseVisitor;
import calc.generated.MathExpressionLexer;
import calc.generated.MathExpressionParser;
import calc.generated.MathExpressionParser.ArithmeticContext;
import lib.Antlr;

//@SuppressWarnings("unchecked")
public class ExpressionParser extends MathExpressionBaseVisitor<Object> {
	private static final Object UNINITIALISED = new Object();
	private final Map<String, Object> scope;
	
	public ExpressionParser() {
		scope = new HashMap<>();
	}
	
	/* Constants handlers */
	
	@Override 
	public Object visitTrue(MathExpressionParser.TrueContext ctx) { 
		return true; 
	}
	
	@Override 
	public Object visitFalse(MathExpressionParser.FalseContext ctx) { 
		return false; 
	}
	
	@Override 
	public Object visitPi(MathExpressionParser.PiContext ctx) { 
		return Math.PI; 
	}
	
	@Override 
	public Object visitExp(MathExpressionParser.ExpContext ctx) { 
		return Math.E;	
	}
	
	// UINT | INT
	@Override 
	public Object visitInt(MathExpressionParser.IntContext ctx) {
		TerminalNode node = ctx.INT() != null ? ctx.INT() : ctx.UINT();
		return Integer.parseInt(node.getText()); 
	}
	
	// STRING : QUOTES (ESC|.)*? QUOTES ;
	@Override 
	public Object visitString(MathExpressionParser.StringContext ctx) { 
		return ctx.STRING().getText().replaceAll("\"", ""); 
	}
	
	@Override 
	public Object visitVariable(MathExpressionParser.VariableContext ctx) { 
		return scope.get(ctx.IDENTIFIER().getText()); 
	}
	
	// FLOAT : SUB UFLOAT ;
	@Override 
	public Object visitFloat(MathExpressionParser.FloatContext ctx) {
		String value = ctx.UFLOAT() != null ? 
				ctx.UFLOAT().getText() :
				ctx.FLOAT() .getText();
		return convertToFloat(value);
	}
	
	/* CHAR : QUOTE ALPHANUMERAL+ QUOTE 
			| DIGIT+ 'c'
			;							 */
	@Override 
	public Object visitChar(MathExpressionParser.CharContext ctx) {
		return convertToChar(ctx.CHAR().getText()); 
	}
	
	/* arithmetic I | I arithmetic */
	@Override
	public Object visitPureImaginary(MathExpressionParser.PureImaginaryContext ctx) {
		return new Complex(0, Double.parseDouble(visit(ctx.arithmetic()).toString()));
	}
	
	//  CIS LPAREN arithmetic COMMA arithmetic RPAREN 		# CisComplex 
	@Override
	public Object visitCisComplex(MathExpressionParser.CisComplexContext ctx) {
		return new Complex(
				Double.parseDouble(visit(ctx.arithmetic(0)).toString()), 
				Double.parseDouble(visit(ctx.arithmetic(1)).toString()), 
				true);
	}
	
	/* Data structures */
	
	// arithmeticList : arithmetic (COMMA arithmetic)* ;
	@Override
	public Object visitArithmeticList(MathExpressionParser.ArithmeticListContext ctx) {
		return ctx.arithmetic()
				.stream()
				.map(this::visit)
				.collect(Collectors.toList());
	}
	
	// LBRACKET arithmeticList? RBRACKET 's' ;
	@Override
	public Object visitSet(MathExpressionParser.SetContext ctx) {
		return ctx.arithmeticList() != null ? 
				visit(ctx.arithmeticList()) : 
				new ArrayList<>();
	}
	
	// LBRACKET arithmeticList? RBRACKET
	@Override
	public Object visitVector(MathExpressionParser.VectorContext ctx) {
		Object result = visit(ctx.arithmeticList());
		System.out.println(result);
		System.out.println(result.getClass());
		return ctx.arithmeticList() != null ? 
				result : 
				new ArrayList<>();
	}
	
	// matrix : LBRACKET DIGITS RBRACKET LBRACKET DIGITS RBRACKET LCURLY (primitive (COMMA primitive)*)? RCURLY ('r'|'c')? ;
	@Override
	public Object visitMatrix(MathExpressionParser.MatrixContext ctx) {
		throw new RuntimeException("Not implemented yet");
	}
	
	/* Unary operations */
	
	// (NOT|TILDE|ADD|SUB|INC|DEC) arithmetic 						# Prefix
	@Override
	public Object visitPrefix(MathExpressionParser.PrefixContext ctx) {
		Object o = visit(ctx.arithmetic());
		if (ctx.NOT() != null)
			return !convertToBoolean(o);
		throw new RuntimeException("Not implemented yet");
	}
	
	@Override
	public Object visitPostfix(MathExpressionParser.PostfixContext ctx) {
		throw new RuntimeException("Not implemented yet");
	}
	
	/* Binary operations */
	
	@Override
	public Object visitAddSub(MathExpressionParser.AddSubContext ctx) {
		throw new RuntimeException("Not implemented yet");
	}
	
	@Override
	public Object visitMultDiv(MathExpressionParser.MultDivContext ctx) {
		throw new RuntimeException("Not implemented yet");
	}
	
	@Override
	public Object visitPower(MathExpressionParser.PowerContext ctx) {
		throw new RuntimeException("Not implemented yet");
	}
	
	@Override
	public Object visitBitOp(MathExpressionParser.BitOpContext ctx) {
		throw new RuntimeException("Not implemented yet");
	}
	
	@Override
	public Object visitModulus(MathExpressionParser.ModulusContext ctx) {
		throw new RuntimeException("Not implemented yet");
	}
	
	@Override
	public Object visitShift(MathExpressionParser.ShiftContext ctx) {
		throw new RuntimeException("Not implemented yet");
	}
	
	/* Ternary operation */
	
	// <assoc=right> arithmetic QUESTION arithmetic COLON arithmetic 	# Ternary
	@Override
	public Object visitTernary(MathExpressionParser.TernaryContext ctx) {
		return convertToBoolean(visit(ctx.arithmetic(0))) ?
				visit(ctx.arithmetic(1)) :
				visit(ctx.arithmetic(2));
	}
	
	/* Boolean algebra */
	
	// <assoc=right> arithmetic (AND_AND|OR_OR) arithmetic			# LogicalAndOr
	@Override
	public Object visitLogicalAndOr(MathExpressionParser.LogicalAndOrContext ctx) {
		boolean left = convertToBoolean(visit(ctx.arithmetic(0))), 
				and = ctx.AND_AND() != null;
		if (!left && and)	// short-circuit on AND_AND if false
			return false;
		else if (left && !and) // short-circuit on OR_OR if true
			return true;
		boolean right = convertToBoolean(visit(ctx.arithmetic(1)));
		return and ?
				left & right :
				left | right;
	}
	
	@Override
	public Object visitRelativeComparison(MathExpressionParser.RelativeComparisonContext ctx) {
		throw new RuntimeException("Not implemented yet");
	}
	
	// arithmetic (EQUAL|NOT_EQUAL) arithmetic						# EqualityComparison
	@Override
	public Object visitEqualityComparison(MathExpressionParser.EqualityComparisonContext ctx) {
		Object left = visit(ctx.arithmetic(0)),
			right = visit(ctx.arithmetic(1));
		return ctx.EQUAL() != null ? 
				left.equals(right) :
				!left.equals(right) ;
	}
	
	/* Special */
	
	@Override
	public Object visitFunction(MathExpressionParser.FunctionContext ctx) {
		String name = visit(ctx.arithmetic()).toString();
		int argc = 0;
		if (ctx.arithmeticList() != null) {
			List<ArithmeticContext> args = ctx.arithmeticList().arithmetic();
			argc = args.size();
			List<Object> arguments = args.stream().map(this::visit)
					.collect(Collectors.toList());
			for (int i=0, index=0; i<arguments.size(); i++, index++) 
				System.out.printf("%d: %s%n", index, arguments.get(i));
		}
		System.out.println("Function name : "+name);					// TODO
		System.out.println("ARGC="+argc);
		throw new RuntimeException("Not implemented yet");
	}
	
	/* arithmetic COLON arithmetic (COLON arithmetic)? */
	@Override
	public Object visitRange(MathExpressionParser.RangeContext ctx) {
		Object o1 = visit(ctx.arithmetic(0)),
			o2 = visit(ctx.arithmetic(1));
		int start = Integer.parseInt(o1.toString()),
			end = Integer.parseInt(o2.toString()),
			increment = ctx.COLON(1) != null ? 
			Integer.parseInt(visit(ctx.arithmetic(2)).toString()) :
			1;
		boolean normal = end-start > 0;
		if (!normal && increment > 0)
			increment *= -1;
		List<Integer> result = new ArrayList<>();
		for (int i=start; normal ? i < end : i > end; i += increment)
			result.add(i);
		return result;
	}
	
	/* assignment : IDENTIFIER (assignmentOperator assignment)? 
		| arithmeticList
		;														*/
	@Override
	public Object visitAssignment(MathExpressionParser.AssignmentContext ctx) {
		if (ctx.IDENTIFIER() != null) {
			String variable = ctx.IDENTIFIER().getText();
			Object result = UNINITIALISED;
			if (ctx.assignmentOperator() != null) {									// TODO
				String operator = ctx.assignmentOperator().getText();
				result = visit(ctx.assignment());
				System.out.println("Operator to use : "+operator);
			}
			scope.put(variable, result);
			return result;
		}
		return visit(ctx.arithmeticList());
	}
	
	/* Helper methods */
	
	private static boolean convertToBoolean(Object o) {
		Class<?>[] classes = {
				Boolean.class, Integer.class, Double.class, 
				Complex.class, String.class, HashSet.class,
				ArrayList.class, Matrix.class
		};
		if (Type.isNotAny(o, classes))
			throw new RuntimeException("Condition type has to be one of "
					+ Arrays.toString(classes) +" for the ternary operator.");
		boolean condition = false;
		if (Type.is(o, Boolean.class))
			condition = Type.convert(o, Boolean.class);
		else if(Type.is(o, Integer.class))
			condition = Type.convert(o, Integer.class) != 0;
		else if(Type.is(o, Double.class))
			condition = Type.convert(o, Double.class) != 0d;
		else if(Type.is(o, Complex.class))
			condition = !Type.convert(o, Complex.class).equals(Complex.ZERO);
		else if(Type.is(o, String.class))
			condition = !Type.convert(o, String.class).equals("");
		else if(Type.is(o, HashSet.class))
			condition = Type.convert(o, HashSet.class).size() != 0;
		else if(Type.is(o, ArrayList.class))
			condition = Type.convert(o, ArrayList.class).size() != 0;
		return condition;
	}
	
	private static char convertToChar(String value) {
		return value.endsWith("c") ? 
			(char) Integer.parseInt(value.substring(0, value.length()-1)) :
			value.replaceAll("'", "").charAt(0);
	}
	
	private static double convertToFloat(String str) {
		String value = str.endsWith("f") ?
				str.substring(0, str.length()-1) : 
				str;
		return Double.parseDouble(value);
	}
	
//	private static double convertToComplexImaginary(String imaginary) {
//		String i = "i", str = imaginary;
//		// consume float specifier 'f'
//		str = str.endsWith("f") ? str.substring(0, str.length()-1) : str;
//		// consume i
//		str = str.startsWith(i) ? 
//				str.substring(1) : 
//				str.endsWith(i) ? 
//						str.substring(0, str.length()-1) : 
//						str;
//		return Double.parseDouble(str);
//	}
	
	public static void main(String[] args) throws Exception {
		// var a = 2\na=cosine(a,2,3)\n		
		// 1 + 1 == 2   
		// !!true ? [1,2,3,4] : 'Z'
		Object result = Antlr.visit(
			() -> CharStreams.fromString("[1,2,3,4]"),
			MathExpressionLexer.class,
			MathExpressionParser.class,
			MathExpressionParser::input,
			ExpressionParser::new);
		System.out.println(result);
	}
}
