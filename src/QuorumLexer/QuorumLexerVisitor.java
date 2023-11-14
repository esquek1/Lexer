// Generated from C:/Users/esquek1/IdeaProjects/Lexer/src/QuorumLexer.g4 by ANTLR 4.13.1
package QuorumLexer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QuorumLexerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QuorumLexerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QuorumLexerParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(QuorumLexerParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuorumLexerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(QuorumLexerParser.ExpressionContext ctx);
}