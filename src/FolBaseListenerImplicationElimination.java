
import org.antlr.v4.runtime.TokenStream;
import edu.usc.anshulip.ai.hw3.Constants;

public class FolBaseListenerImplicationElimination extends FolBaseListenerImpl {

	public FolBaseListenerImplicationElimination(TokenStream tokens) {
		super(tokens);
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

}
