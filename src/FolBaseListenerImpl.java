
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import edu.usc.anshulip.ai.hw3.Constants;

public class FolBaseListenerImpl extends FolBaseListener {

	TokenStreamRewriter rewriter;

	public FolBaseListenerImpl(TokenStream tokens) {
		rewriter = new TokenStreamRewriter(tokens);
	}

	void replace(ParserRuleContext ctx, String replacement) {
		rewriter.insertAfter(ctx.stop, replacement);
		rewriter.delete(ctx.start, ctx.stop);
	}

	char getReverseOperator(String text) {
		if (text.equals(String.format("%c", Constants.AND))) {
			return Constants.OR;
		} else {
			return Constants.AND;
		}
	}

	boolean isOrOperator(FolParser.AndOrSentenceContext ctx) {
		if (ctx.operator().getText().equals(String.format("%c", Constants.OR))) {
			return true;
		} else {
			return false;
		}
	}

}
