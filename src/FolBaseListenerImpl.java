
import org.antlr.v4.runtime.ParserRuleContext;
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

		String replacement = String.format("%c%c%c%s%c%c%s%c", Constants.OPENING_BRACE, Constants.OPENING_BRACE,
				Constants.NOT, ctx.sentence(0).getText(), Constants.CLOSING_BRACE, Constants.OR,
				ctx.sentence(1).getText(), Constants.CLOSING_BRACE);

		replace(ctx, replacement);
	}

	private void replace(ParserRuleContext ctx, String replacement) {
		rewriter.insertAfter(ctx.stop, replacement);
		rewriter.delete(ctx.start, ctx.stop);
	}

	/**
	 * Handles reducing scope of negation to minimal
	 */
	@Override
	public void exitNotSentence(FolParser.NotSentenceContext ctx) {
		String replacement = null;
		if (ctx.andOrSentence() != null) {
			String leftSentence = ctx.andOrSentence().andOrSentence(0).getText();
			String rightSentence = ctx.andOrSentence().andOrSentence(1).getText();

			char reverseOperator = getReverseOperator(ctx.andOrSentence().operator().getText());
			replacement = String.format("%c%c%c%s%c%c%c%c%s%c%c", Constants.OPENING_BRACE, Constants.OPENING_BRACE,
					Constants.NOT, leftSentence, Constants.CLOSING_BRACE, reverseOperator, Constants.OPENING_BRACE,
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

		replace(ctx, replacement);
	}

	private char getReverseOperator(String text) {
		if (text.equals(String.format("%c", Constants.AND))) {
			return Constants.OR;
		} else {
			return Constants.AND;
		}
	}

	/**
	 * Handles distributivity property implementation for conjunction of
	 * disjunction
	 */
	@Override
	public void exitAndOrSentence(FolParser.AndOrSentenceContext ctx) {
		// TODO
		String replacement = null;
		if (ctx.andOrSentence() != null && isOrOperator(ctx)) {
			String[] parts = extractPartsOfSentence(ctx);
			String leftSentence1 = parts[0];
			String leftSentence2 = parts[1];
			String rightSentence = parts[2];
			if (parts != null) {
				replacement = String.format("%c%c%s%c%s%c%c%c%s%c%s%c%c", Constants.OPENING_BRACE,
						Constants.OPENING_BRACE, leftSentence1, Constants.OR, rightSentence, Constants.CLOSING_BRACE,
						Constants.AND, Constants.OPENING_BRACE, leftSentence2, Constants.OR, rightSentence,
						Constants.CLOSING_BRACE, Constants.CLOSING_BRACE);
				replace(ctx, replacement);
			}
		} else {
			// both literals or And-Operator : Do nothing.
		}

	}

	private String[] extractPartsOfSentence(FolParser.AndOrSentenceContext ctx) {
		String leftSentence1 = null, leftSentence2 = null;
		String rightSentence = null; // literal or an andOSrentence
		
		// check AND op between Left1 and Left2
		if (!isOrOperator(ctx.andOrSentence(0))) { // has to be AND operator
			if (ctx.andOrSentence(0).literal().size() == 0) {
				leftSentence1 = ctx.andOrSentence(0).andOrSentence(0).getText();
				leftSentence2 = ctx.andOrSentence(0).andOrSentence(1).getText();

			} else if (ctx.andOrSentence(0).andOrSentence().size() == 0) {
				leftSentence1 = ctx.andOrSentence(0).literal(0).getText();
				leftSentence2 = ctx.andOrSentence(0).literal(1).getText();
			} else {
				leftSentence1 = ctx.andOrSentence(0).literal(0).getText();
				leftSentence2 = ctx.andOrSentence(0).andOrSentence(0).getText();
			}
		} 
		if (ctx.literal().size() != 0) {
			rightSentence = ctx.literal(0).getText();
		} else {
			// both parts are andOrSentences
			rightSentence = ctx.andOrSentence(1).getText();
		}

		if (leftSentence1 != null && leftSentence2 != null && rightSentence != null) {
			String[] parts = { leftSentence1, leftSentence2, rightSentence };
			return parts;
		}
		
		// swap out the two parts, so that and operator for second part can be used, if possible
		// TODO
		
		return null;
	}

	private boolean isOrOperator(FolParser.AndOrSentenceContext ctx) {
		if (ctx.operator().getText().equals(String.format("%c", Constants.OR))) {
			return true;
		} else {
			return false;
		}
	}

}
