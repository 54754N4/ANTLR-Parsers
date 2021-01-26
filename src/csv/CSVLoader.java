package csv;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.CharStreams;

import csv.generated.CSVBaseListener;
import csv.generated.CSVLexer;
import csv.generated.CSVParser;
import lib.Antlr;

public class CSVLoader extends CSVBaseListener {
	public static final String EMPTY = "";
	
	List<String> header;
	List<Map<String,String>> rows;
	List<String> currentRowValues;

	public CSVLoader() {
		rows = new ArrayList<Map<String, String>>();	
	}
	
	public void exitHdr(CSVParser.HdrContext ctx) {
		header = new ArrayList<String>();
		header.addAll(currentRowValues);
	}
	
	public void enterRow(CSVParser.RowContext ctx) {
		currentRowValues = new ArrayList<String>();
	}
	
	public void exitRow(CSVParser.RowContext ctx) {
		// If this is the header row, do nothing
		if (ctx.getParent().getRuleIndex() == CSVParser.RULE_hdr) 
			return;
		Map<String, String> m = new LinkedHashMap<String, String>();
		int i = 0;
		for (String v : currentRowValues)
			m.put(header.get(i++), v);
		rows.add(m);
	}
	
	public void exitString(CSVParser.StringContext ctx) {
		currentRowValues.add(ctx.STRING().getText());
	}
	
	public void exitText(CSVParser.TextContext ctx) {
		currentRowValues.add(ctx.TEXT().getText());
	}
	
	public void exitEmpty(CSVParser.EmptyContext ctx) {
		currentRowValues.add(EMPTY);
	}
	
	public static void main(String[] args) throws Exception {
		CSVLoader loader = Antlr.walk(
			() -> CharStreams.fromString("a,b,c,d\r\n1,2,3,4\r\n5,6,7,8\r\n"),
			CSVLexer.class,
			CSVParser.class,
			CSVParser::file,
			CSVLoader::new);
		System.out.println(loader.rows);
	}
}