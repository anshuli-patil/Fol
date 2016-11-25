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
	 * Visit a parse tree produced by {@link FolParser#complex_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_sentence(FolParser.Complex_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FolParser#implication_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplication_sentence(FolParser.Implication_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FolParser#not_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_sentence(FolParser.Not_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FolParser#and_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_sentence(FolParser.And_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FolParser#or_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_sentence(FolParser.Or_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FolParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(FolParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FolParser#list_predicates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_predicates(FolParser.List_predicatesContext ctx);
}