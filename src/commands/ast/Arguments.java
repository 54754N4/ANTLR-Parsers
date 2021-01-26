package commands.ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Arguments {
	private final List<String> unnamed, input;
	private final Map<String, String> named;
	
	public Arguments() {
		unnamed = new ArrayList<>();
		input = new ArrayList<>();
		named = new HashMap<>();
	}

	public List<String> getInput() {
		return input;
	}

	public List<String> getUnnamed() {
		return unnamed;
	}

	public Map<String, String> getNamed() {
		return named;
	}

	@Override
	public String toString() {
		return String.format("Unnamed:%s%nNamed:%s%nInput:%s", 
				Arrays.toString(unnamed.toArray()),
				named.toString(),
				Arrays.toString(input.toArray())
		);
	}
	
	public static abstract class Argument implements AST {
		private final String value;
		
		public Argument(String name) {
			this.value = name;
		}
		
		public String getValue() {
			return value;
		}
	}

	public static class Named extends Argument {
		private final String name;
		
		public Named(String name, String value) {
			super(value);
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
	}
	
	public static class Unnamed extends Argument {
		public Unnamed(String name) {
			super(name);
		}
	}
	
	public static class Input extends Argument {
		public Input(String param) {
			super(param);
		}
	}
}
