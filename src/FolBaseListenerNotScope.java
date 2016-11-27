
import org.antlr.v4.runtime.TokenStream;
import edu.usc.anshulip.ai.hw3.Constants;

public class FolBaseListenerNotScope extends FolBaseListenerImpl {

	public FolBaseListenerNotScope(TokenStream tokens) {
		super(tokens);
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
}
