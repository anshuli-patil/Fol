// Generated from Fol.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FolParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(FolParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FolParser#complexSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexSentence(FolParser.ComplexSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FolParser#implicationSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicationSentence(FolParser.ImplicationSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FolParser#notSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotSentence(FolParser.NotSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FolParser#andSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndSentence(FolParser.AndSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FolParser#orSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrSentence(FolParser.OrSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FolParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(FolParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FolParser#listPredicates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListPredicates(FolParser.ListPredicatesContext ctx);
}