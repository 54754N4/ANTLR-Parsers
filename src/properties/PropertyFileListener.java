package properties;

import java.util.Map;

import org.antlr.v4.misc.OrderedHashMap;
import org.antlr.v4.runtime.CharStreams;

import lib.Antlr;
import properties.generated.PropertyFileBaseListener;
import properties.generated.PropertyFileLexer;
import properties.generated.PropertyFileParser;

public class PropertyFileListener extends PropertyFileBaseListener {
	Map<String,String> props = new OrderedHashMap<String, String>();
	
	// prop : ID '=' STRING '\n' ;
	public void exitProp(PropertyFileParser.PropContext ctx) {
		String id = ctx.ID().getText();
		String value = ctx.STRING().getText();
		props.put(id, value);
	}
	
	public static void main(String[] args) throws Exception {
		PropertyFileListener loader = Antlr.walk(
			() -> CharStreams.fromString("a=\"sadfasdfsa\"\r\nbae 23=\"asdasdas\"\r\n"), 
			PropertyFileLexer.class,
			PropertyFileParser.class,
			PropertyFileParser::file, 
			PropertyFileListener::new);
		System.out.println(loader.props);
	}
}
