// Generated from Fol.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FolParser}.
 */
public interface FolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FolParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(FolParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FolParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(FolParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FolParser#complex_sentence}.
	 * @param ctx the parse tree
	 */
	void enterComplex_sentence(FolParser.Complex_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FolParser#complex_sentence}.
	 * @param ctx the parse tree
	 */
	void exitComplex_sentence(FolParser.Complex_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FolParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(FolParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FolParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(FolParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FolParser#list_predicates}.
	 * @param ctx the parse tree
	 */
	void enterList_predicates(FolParser.List_predicatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FolParser#list_predicates}.
	 * @param ctx the parse tree
	 */
	void exitList_predicates(FolParser.List_predicatesContext ctx);
}