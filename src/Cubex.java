import java.io.IOException;

import org.antlr.v4.runtime.*;

public class Cubex {
	public static void main (String args[]) throws IOException {
		getParser(args[0]);
	}
	
	protected static void getParser(String fn) throws IOException {
		CubexLexer2 lexer = new CubexLexer2(new ANTLRFileStream(fn));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CubexParser2 parser = new CubexParser2(tokens);
		// altering anltr error messages
		parser.removeErrorListeners();
		parser.addErrorListener(new ParserErrorListener(false)); //prevent printing debugging messages
		
		String coreLang = null;
		CuContext context = new CuContext();
		//if we want to add initial context elements, we should add them here
		//to be consistent, I also used calculateType
		try {
			parser.program().p.calculateType(context);
		} catch (Exception e) {
			System.out.println("rejected");
			System.exit(-2);
		}
		System.out.println("accepted");
	}
}
