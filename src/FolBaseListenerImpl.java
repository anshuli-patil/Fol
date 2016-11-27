
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import edu.usc.anshulip.ai.hw3.Constants;

public class FolBaseListenerImpl extends FolBaseListener {

	TokenStreamRewriter rewriter;

	public FolBaseListenerImpl(TokenStream tokens) {
		rewriter = new TokenStreamRewriter(tokens);
	}

	
	/**
	 * Handles implication elimination
	 */
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

	/**
	 * Handles reducing scope of negation to minimal
	 */
	@Override
	public void exitNotSentence(FolParser.NotSentenceContext ctx) {
		String replacement = null;
		if (ctx.orSentence() != null) {
			String leftSentence = ctx.orSentence().sentence(0).getText();
			String rightSentence = ctx.orSentence().sentence(1).getText();
			replacement = String.format("%c%c%c%s%c%c%c%c%s%c%c", Constants.OPENING_BRACE, Constants.OPENING_BRACE,
					Constants.NOT, leftSentence, Constants.CLOSING_BRACE, Constants.AND, Constants.OPENING_BRACE,
					Constants.NOT, rightSentence, Constants.CLOSING_BRACE, Constants.CLOSING_BRACE);

		} else if (ctx.andSentence() != null) {
			String leftSentence = ctx.andSentence().sentence(0).getText();
			String rightSentence = ctx.andSentence().sentence(1).getText();
			replacement = String.format("%c%c%c%s%c%c%c%c%s%c%c", Constants.OPENING_BRACE, Constants.OPENING_BRACE,
					Constants.NOT, leftSentence, Constants.CLOSING_BRACE, Constants.OR, Constants.OPENING_BRACE,
					Constants.NOT, rightSentence, Constants.CLOSING_BRACE, Constants.CLOSING_BRACE);

		} else if (ctx.notSentence() != null) {
			int length = ctx.notSentence().getText().length();
			replacement = ctx.notSentence().getText().substring(2, length - 1);
		} else {
			if (ctx.literal().getText().startsWith(String.format("%c", Constants.NOT))) {
				int length = ctx.literal().getText().length();
				replacement = ctx.literal().getText().substring(2, length - 1);
			} else {
				String literal = ctx.literal().getText();
				replacement = String.format("%c%c%s%c", Constants.OPENING_BRACE, Constants.NOT, literal,
						Constants.CLOSING_BRACE);
			}
		}

		rewriter.insertAfter(ctx.stop, replacement);
		rewriter.delete(ctx.start, ctx.stop);
	}
	
	
	/**
	 * Handles distributivity property implementation for conjunction of disjunction
	 */
	@Override
	public void exitAndSentence(FolParser.AndSentenceContext ctx) {
		//TODO
		
		
	}

}
