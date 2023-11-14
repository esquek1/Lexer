// Generated from C:/Users/esquek1/IdeaProjects/Lexer/src/QuorumLexer.g4 by ANTLR 4.13.1
package QuorumLexer;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link QuorumLexerVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
@SuppressWarnings("CheckReturnValue")
public class QuorumLexerBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements QuorumLexerVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStart(QuorumLexerParser.StartContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpression(QuorumLexerParser.ExpressionContext ctx) { return visitChildren(ctx); }
}