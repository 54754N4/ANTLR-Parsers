package properties;

import java.util.Map;

import org.antlr.v4.misc.OrderedHashMap;
import org.antlr.v4.runtime.CharStreams;

import lib.Antlr;
import properties.generated.PropertyFileBaseVisitor;
import properties.generated.PropertyFileLexer;
import properties.generated.PropertyFileParser;

public class PropertyFileVisitor extends PropertyFileBaseVisitor<Map<String,String>> {
	Map<String,String> props = new OrderedHashMap<String, String>();
	
	// prop : ID '=' STRING '\n' ;
	public Map<String,String> visitProp(PropertyFileParser.PropContext ctx) {
		String id = ctx.ID().getText();
		String value = ctx.STRING().getText();
		props.put(id, value);
		return props;
	}
	
	public static void main(String[] args) throws Exception {
		Map<String,String> props = Antlr.visit(
			() -> CharStreams.fromString("a=\"sadfasdfsa\"\r\nbae 23=\"asdasdas\"\r\n"), 
			PropertyFileLexer.class,
			PropertyFileParser.class,
			PropertyFileParser::file,
			PropertyFileVisitor::new);
		System.out.println(props);
	}
}
