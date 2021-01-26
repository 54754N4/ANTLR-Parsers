package brace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.CharStreams;

import brace.generated.BraceExpansionBaseVisitor;
import brace.generated.BraceExpansionLexer;
import brace.generated.BraceExpansionParser;
import brace.generated.BraceExpansionParser.AnyContext;
import brace.generated.BraceExpansionParser.CSVContext;
import brace.generated.BraceExpansionParser.ExpansionContext;
import brace.generated.BraceExpansionParser.PostscriptContext;
import brace.generated.BraceExpansionParser.PreambleContext;
import brace.generated.BraceExpansionParser.RangeContext;
import lib.Antlr;

public class BraceExpansion extends BraceExpansionBaseVisitor<List<String>> {

	// expansion : preamble '{' statement '}' postscript ;
	@Override
	public List<String> visitExpansion(ExpansionContext ctx) {
		List<String> preamble = visit(ctx.preamble()),	// by design, preamble returns a list of 1 element or 0
				statement = visit(ctx.statement()),
				postscript = visit(ctx.postscript()),
				results = new ArrayList<>();
		String prefix = preamble.size() > 0 ? preamble.get(0) : "";
		postscript = postscript.size() == 0 ? Arrays.asList("") : postscript;	// make sure loop runs once
		for (String postfix : postscript) 
			for (String current : statement) 
				results.add(prefix+current+postfix);
		return results;
	}

	// any (COMMA any)* 					 # CSV
	@Override 
	public List<String> visitCSV(CSVContext ctx) { 
		return ctx.any()
				.stream()
				.map(this::visit)
				.flatMap(Collection::stream)
				.collect(Collectors.toList());
	}

	// (CHAR|INT) RANGE (CHAR|INT) (RANGE INT)?   # Range
	@Override 
	public List<String> visitRange(RangeContext ctx) {
		if (ctx.CHAR(0) != null) {
			char start = ctx.CHAR(0).getText().charAt(0),
				end = ctx.CHAR(1).getText().charAt(0);
			int increment = ctx.INT(0) != null ? 
				Integer.parseInt(ctx.INT(0).getText()) :
				1;
			return charRange(start, end, increment);
		}
		String start = ctx.INT(0).getText(),
			end = ctx.INT(1).getText();
		int increment = ctx.INT(2) != null ? 
			Integer.parseInt(ctx.INT(2).getText()) :
			1;
		return intRange(
				Integer.parseInt(start),					// xi 
				Integer.parseInt(end), 						// xf
				increment, 									// dx
				Math.max(start.length(), end.length()),		// size (including padding)
				start.startsWith("0"));						// if to use padding
	}
	
	
	/* preamble : WORD
		| INT
		| CHAR
		|
		;				 */
	@Override
	public List<String> visitPreamble(PreambleContext ctx) {
		if (ctx.WORD() != null)
			return Arrays.asList(ctx.WORD().getText());
		else if (ctx.INT() != null)
			return Arrays.asList(ctx.INT().getText());
		else if (ctx.CHAR() != null)
			return Arrays.asList(ctx.CHAR().getText());
		else // empty list == nothing
			return new ArrayList<>();
	}
	
	/* postscript : any ; */
	@Override
	public List<String> visitPostscript(PostscriptContext ctx) {
		return visit(ctx.any());
	}

	/* any : expansion
		| WORD
		| INT
		| CHAR
		|
		;				*/
	@Override
	public List<String> visitAny(AnyContext ctx) {
		if (ctx.expansion() != null)
			return visit(ctx.expansion());
		else if (ctx.WORD() != null)
			return Arrays.asList(ctx.WORD().getText());
		else if (ctx.INT() != null)
			return Arrays.asList(ctx.INT().getText());
		else if (ctx.CHAR() != null)
			return Arrays.asList(ctx.CHAR().getText());
		else // empty list == nothing
			return new ArrayList<>();
	}
	
	public static List<String> charRange(char xi, char xf) {
		return charRange(xi, xf, xf-xi > 0 ? 1 : -1);
	}
	
	public static List<String> charRange(char xi, char xf, int dx) {
		boolean normal = xf-xi > 0;
		if (!normal && dx > 0)
			dx *= -1;
		List<String> result = new ArrayList<>();
		for (char c = xi; normal ? c <= xf : c >= xf ; c += dx) 
			result.add(""+c);
		return result;
	}
	
	public static List<String> intRange(int xi, int xf, int dx, int size, boolean pad) {	 // size includes padding
		boolean normal = xf-xi > 0;
		if (!normal && dx > 0)
			dx *= -1;
		List<String> result = new ArrayList<>();
		for (int i = xi; normal ? i <= xf : i >= xf ; i += dx)
			result.add(pad ? pad(""+i, size) : ""+i);
		return result;
	}
	
	public static String pad(String string, int size) {
		int distance = size - string.length();
		while (distance-- > 0)
			string = "0" + string;
		return string;
	}
	
	public static void main(String[] args) throws Exception {
//		System.out.println(Arrays.toString(charRange('a', 'z').toArray()));
//		System.out.println(pad("01", -1));
//		System.out.println(Arrays.toString(intRange(10,0,1,4,true).toArray()));
		List<String> result = Antlr.visit(
				() -> CharStreams.fromString("1{{A..Z},{a..z}}2"),  // {A..Z}{0..9}   // {01..10}
				BraceExpansionLexer.class,
				BraceExpansionParser.class,
				BraceExpansionParser::input,
				BraceExpansion::new);
		System.out.println(Arrays.toString(result.toArray()));
	}
}
