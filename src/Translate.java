
// import ANTLR's runtime libraries
import java.io.File;
import java.io.FileInputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Translate {
	public static void main(String[] args) throws Exception {
		// create a CharStream that reads from file
		FileInputStream file = new FileInputStream(new File("fol_input.txt"));
		ANTLRInputStream input = new ANTLRInputStream(file);
		// create a lexer that feeds off of input CharStream
		FolLexer lexer = new FolLexer(input);
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create a parser that feeds off the tokens buffer
		FolParser parser = new FolParser(tokens);
		ParseTree tree = parser.sentence(); // begin parsing at sentence rule
		// Create a generic parse tree walker that can trigger callbacks
		ParseTreeWalker walker = new ParseTreeWalker();
		// Walk the tree created during the parse, trigger callbacks
		
		FolBaseListenerImpl folModifier = new FolBaseListenerImpl(tokens);
		walker.walk(folModifier, tree);
		System.out.println(folModifier.rewriter.getText());
	}
}