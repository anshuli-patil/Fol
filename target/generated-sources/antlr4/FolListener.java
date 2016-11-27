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
	 * Enter a parse tree produced by {@link FolParser#complexSentence}.
	 * @param ctx the parse tree
	 */
	void enterComplexSentence(FolParser.ComplexSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FolParser#complexSentence}.
	 * @param ctx the parse tree
	 */
	void exitComplexSentence(FolParser.ComplexSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FolParser#implicationSentence}.
	 * @param ctx the parse tree
	 */
	void enterImplicationSentence(FolParser.ImplicationSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FolParser#implicationSentence}.
	 * @param ctx the parse tree
	 */
	void exitImplicationSentence(FolParser.ImplicationSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FolParser#notSentence}.
	 * @param ctx the parse tree
	 */
	void enterNotSentence(FolParser.NotSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FolParser#notSentence}.
	 * @param ctx the parse tree
	 */
	void exitNotSentence(FolParser.NotSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FolParser#andOrSentence}.
	 * @param ctx the parse tree
	 */
	void enterAndOrSentence(FolParser.AndOrSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FolParser#andOrSentence}.
	 * @param ctx the parse tree
	 */
	void exitAndOrSentence(FolParser.AndOrSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FolParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(FolParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FolParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(FolParser.OperatorContext ctx);
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
	 * Enter a parse tree produced by {@link FolParser#listPredicates}.
	 * @param ctx the parse tree
	 */
	void enterListPredicates(FolParser.ListPredicatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FolParser#listPredicates}.
	 * @param ctx the parse tree
	 */
	void exitListPredicates(FolParser.ListPredicatesContext ctx);
}