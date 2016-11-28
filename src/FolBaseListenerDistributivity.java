
import org.antlr.v4.runtime.TokenStream;

import edu.usc.anshulip.ai.hw3.Constants;

public class FolBaseListenerDistributivity extends FolBaseListenerImpl {

	public FolBaseListenerDistributivity(TokenStream tokens) {
		super(tokens);
	}

	/**
	 * Handles distributivity property implementation for conjunction of
	 * disjunction
	 */
	@Override
	public void exitAndOrSentence(FolParser.AndOrSentenceContext ctx) {
		String replacement = null;
		if (ctx.andOrSentence().size() != 0 && isOrOperator(ctx)) {
			String[] parts = extractPartsOfSentence(ctx);

			if (parts != null) {
				String leftSentence1 = parts[0];
				String leftSentence2 = parts[1];
				String rightSentence = parts[2];

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

		// swap out the two parts, so that and operator for second part can be
		// used, if possible
		if (ctx.andOrSentence(1).literal().size() < 2) {
			replace(ctx, String.format("%c%s%s%s%c", Constants.OPENING_BRACE, ctx.andOrSentence(1).getText(),
					ctx.operator().getText(), ctx.andOrSentence(0).getText(), Constants.CLOSING_BRACE));
		}
		return null;
	}

}
