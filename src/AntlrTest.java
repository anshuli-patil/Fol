import java.io.File;
import java.io.FileInputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class AntlrTest {
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream(new File("fol_input.txt"));
		ANTLRInputStream input = new ANTLRInputStream(file);

		FolLexer lexer = new FolLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		FolParser parser = new FolParser(tokens);
		// start parsing as a sentence
		ParseTree tree = parser.sentence();
	
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree

	}
}
