package bash;

import org.antlr.v4.runtime.CharStreams;

import bash.generated.BashBaseVisitor;
import bash.generated.BashLexer;
import bash.generated.BashParser;
import lib.Antlr;

public class BashInterpreter extends BashBaseVisitor<Void> {

	public static void main(String[] args) throws Exception {
		Void result = Antlr.visit(
				() -> CharStreams.fromString("echo -n -p --named=word --named1=\"boobs in a dish\n\" and some extra inputs \"here hehe\" @Jack Babe #text-channel"),
				BashLexer.class,
				BashParser.class,
				BashParser::inputunit,
				BashInterpreter::new);
		System.out.println(result);
	}
}
