package commands.ast;

public class Executable implements AST {
	private final String name;
	private final Arguments args;
	
	public Executable(String name, final Arguments args) {
		this.name = name;
		this.args = args;
	}

	public String getName() {
		return name;
	}

	public Arguments getArgs() {
		return args;
	}
	
	@Override
	public String toString() {
		return String.format("> %s%n%s", name, args.toString());
	}
}
