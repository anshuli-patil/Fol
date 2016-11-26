
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import edu.usc.anshulip.ai.hw3.Constants;

public class FolBaseListenerImpl extends FolBaseListener {

	TokenStreamRewriter rewriter;

	public FolBaseListenerImpl(TokenStream tokens) {
		rewriter = new TokenStreamRewriter(tokens);
	}

	@Override
	public void enterImplicationSentence(FolParser.ImplicationSentenceContext ctx) {
		// System.out.println("In method exitImplication_sentence");
		// result = Constants.NOT + visit(ctx.sentence(0)) + Constants.OR +
		// visit(ctx.sentence(1));

		@SuppressWarnings("unused")
		String replacementFirst = Constants.OPENING_BRACE + "" + Constants.NOT + ctx.sentence(0).getText() + ""
				+ Constants.CLOSING_BRACE + "" + Constants.OR + ctx.sentence(1).getText();

		String replacement = String.format("%c%c%c%s%c%c%s%c", Constants.OPENING_BRACE, Constants.OPENING_BRACE,
				Constants.NOT, ctx.sentence(0).getText(), Constants.CLOSING_BRACE, Constants.OR,
				ctx.sentence(1).getText(), Constants.CLOSING_BRACE);
		// System.out.println(result);

		rewriter.insertAfter(ctx.stop, replacement);
		rewriter.delete(ctx.start, ctx.stop);
		// rewriter.replace(ctx.start, ctx.stop, replacement);
	}

}
