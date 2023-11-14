// Generated from C:/Users/esquek1/IdeaProjects/Lexer/src/QuorumLexer.g4 by ANTLR 4.13.1
package QuorumLexer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QuorumLexerParser}.
 */
public interface QuorumLexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QuorumLexerParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(QuorumLexerParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuorumLexerParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(QuorumLexerParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuorumLexerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(QuorumLexerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuorumLexerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(QuorumLexerParser.ExpressionContext ctx);
}