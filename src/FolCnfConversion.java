import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import edu.usc.anshulip.ai.hw3.FolSentence;

public class FolCnfConversion {

	public List<FolSentence> createKnowledgeBase() {
		List<FolSentence> kb = new ArrayList<FolSentence>();

		// TODO rename file
		try (BufferedReader br = new BufferedReader(new FileReader(new File("fol_input.txt")))) {
			String line;
			while ((line = br.readLine()) != null) {
				kb.add(applyConversionSteps(line));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return kb;
	}

	private FolSentence applyConversionSteps(String line) {
		line = convertLineToCnf(line, FolLexer.IMPLIES);
		line = convertLineToCnf(line, FolLexer.NOT);
		line = convertLineToCnf(line, FolLexer.AND);

		return new FolSentence(line);
	}

	private String convertLineToCnf(String line, int baseListenerType) {
		FolBaseListenerBuilder listenerBuilder = new FolBaseListenerBuilder();

		// TODO make while loop - that runs till no more changes to be done
		for (int i = 0; i < 5; i++) {
			ANTLRInputStream input = new ANTLRInputStream(line);
			FolLexer lexer = new FolLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			FolParser parser = new FolParser(tokens);
			ParseTree tree = parser.sentence();
			ParseTreeWalker walker = new ParseTreeWalker();

			FolBaseListenerImpl folModifier = listenerBuilder.getListener(tokens, baseListenerType);

			walker.walk(folModifier, tree);
			line = folModifier.rewriter.getText();
		}

		return line;
	}
}