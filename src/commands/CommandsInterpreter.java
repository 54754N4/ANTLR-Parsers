package commands;

import java.util.List;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.CharStreams;

import commands.ast.AST;
import commands.ast.Arguments;
import commands.ast.Arguments.Argument;
import commands.ast.Executable;
import commands.generated.CommandsBaseVisitor;
import commands.generated.CommandsLexer;
import commands.generated.CommandsParser;
import commands.generated.CommandsParser.ArgumentContext;
import commands.generated.CommandsParser.ChainContext;
import commands.generated.CommandsParser.CommandContext;
import commands.generated.CommandsParser.NamedArgContext;
import commands.generated.CommandsParser.RedirectionContext;
import commands.generated.CommandsParser.UnnamedArgContext;
import lib.Antlr;

public class CommandsInterpreter extends CommandsBaseVisitor<AST> {

	@Override
	public AST visitChain(ChainContext ctx) {
		// TODO Auto-generated method stub
		return super.visitChain(ctx);
	}

	@Override
	public AST visitRedirection(RedirectionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRedirection(ctx);
	}

	// command : NAME argument* ;
	@Override
	public AST visitCommand(CommandContext ctx) {
		String name = ctx.NAME().getText();
		// Parse arguments
		final Arguments args = new Arguments();
		List<AST> objects = ctx.argument().stream()
				.map(this::visit)
				.collect(Collectors.toList());
		for (AST object : objects) {
			if (Arguments.Input.class.isInstance(object))
				args.getInput().add(Arguments.Input.class.cast(object).getValue());
			else if (Arguments.Unnamed.class.isInstance(object))
				args.getUnnamed().add(Arguments.Unnamed.class.cast(object).getValue());
			else if (Arguments.Named.class.isInstance(object)) {
				Arguments.Named param = Arguments.Named.class.cast(object); 
				args.getNamed().put(param.getName(), param.getValue());
			} else 
				throw new IllegalArgumentException("Unrecognized argument type : "+object+" -> "+object.getClass());
		}
		return new Executable(name, args);
	}
	
	/* Arguments : namedArg 
		| unnamedArg 
		| STRING
		| NAME
		; 					*/
	@Override
	public Argument visitArgument(ArgumentContext ctx) {
		if (ctx.namedArg() != null)
			return (Arguments.Named) visit(ctx.namedArg());
		else if (ctx.unnamedArg() != null)
			return (Arguments.Unnamed) visit(ctx.unnamedArg());
		else if (ctx.STRING() != null)
			return new Arguments.Input(ctx.STRING().getText());
		else if (ctx.NAME() != null)
			return new Arguments.Input(ctx.NAME().getText());
		throw new IllegalArgumentException("Expecting Arguments as [named, unnamed, string, word].");
	}
	
	// namedArg : DBL_DASH NAME (EQUAL (STRING|NAME))? ;
	@Override
	public Arguments.Named visitNamedArg(NamedArgContext ctx) {
		return new Arguments.Named(
				ctx.NAME(0).getText(),
				ctx.EQUAL() == null ? 
					null :
					ctx.STRING() != null ? 
							ctx.STRING().getText() :
							ctx.NAME(1).getText());
	}
	
	// unnamedArg : DASH NAME ;
	@Override
	public Arguments.Unnamed visitUnnamedArg(UnnamedArgContext ctx) {
		return new Arguments.Unnamed(ctx.NAME().getText());
	}
	
	public static void main(String[] args) throws Exception {
		AST result = Antlr.visit(
				() -> CharStreams.fromString("echo -n -p --named=word --named1=\"boobs in a dish\n\" and some extra inputs \"here hehe\" @Jack Babe #text-channel"),
				CommandsLexer.class,
				CommandsParser.class,
				CommandsParser::input,
				CommandsInterpreter::new);
		System.out.println(result);
	}
}