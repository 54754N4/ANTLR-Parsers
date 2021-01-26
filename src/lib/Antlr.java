package lib;

import java.util.function.Function;
import java.util.function.Supplier;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Antlr {
	// Creates lexer + parser and starts at chosen production rule
	public static <
			CustomLexer extends Lexer, 
			CustomParser extends Parser
		> ParseTree useParser(
				Supplier<CharStream> source, 
				Class<CustomLexer> lclass, 
				Class<CustomParser> pclass, 
				Function<CustomParser, ParseTree> startRule
			) throws Exception {
		CustomLexer lexer = lclass.getConstructor(CharStream.class)
				.newInstance(source.get());
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CustomParser parser = pclass.getConstructor(TokenStream.class)
			.newInstance(tokens);
		return startRule.apply(parser);
	}
	
	// Walks a listener given their lexer + parser + listener classes
	public static <
			CustomLexer extends Lexer, 
			CustomParser extends Parser,
			CustomListener extends ParseTreeListener
		> CustomListener walk(
				Supplier<CharStream> source,
				Class<CustomLexer> lclass,
				Class<CustomParser> pclass,
				Function<CustomParser, ParseTree> startRule,
				Supplier<CustomListener> listenerSource
			) throws Exception {
		ParseTree tree = useParser(source, lclass, pclass, startRule);
		ParseTreeWalker walker = new ParseTreeWalker();
		CustomListener listener = listenerSource.get();
		walker.walk(listener, tree);
		return listener;
	}
	
	public static <
			CustomLexer extends Lexer, 
			CustomParser extends Parser,
			T,
			Visitor extends AbstractParseTreeVisitor<T>
		> T visit(
				Supplier<CharStream> source,
				Class<CustomLexer> lclass,
				Class<CustomParser> pclass,
				Function<CustomParser, ParseTree> startRule,
				Supplier<Visitor> visitorInstantiator
			) throws Exception {
		ParseTree tree = useParser(source, lclass, pclass, startRule);
		Visitor visitor = visitorInstantiator.get();
		T result = visitor.visit(tree);
		return result;
	}
}
