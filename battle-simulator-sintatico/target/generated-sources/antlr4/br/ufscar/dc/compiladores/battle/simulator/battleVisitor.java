// Generated from br\u005Cufscar\dc\compiladores\battle\simulator\battle.g4 by ANTLR 4.9.2
package br.ufscar.dc.compiladores.battle.simulator;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link battleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface battleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link battleParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(battleParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link battleParser#bons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBons(battleParser.BonsContext ctx);
	/**
	 * Visit a parse tree produced by {@link battleParser#maus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaus(battleParser.MausContext ctx);
	/**
	 * Visit a parse tree produced by {@link battleParser#herois}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHerois(battleParser.HeroisContext ctx);
	/**
	 * Visit a parse tree produced by {@link battleParser#viloes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViloes(battleParser.ViloesContext ctx);
	/**
	 * Visit a parse tree produced by {@link battleParser#corpo_heroi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo_heroi(battleParser.Corpo_heroiContext ctx);
	/**
	 * Visit a parse tree produced by {@link battleParser#corpo_vilao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo_vilao(battleParser.Corpo_vilaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link battleParser#classes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasses(battleParser.ClassesContext ctx);
	/**
	 * Visit a parse tree produced by {@link battleParser#elementos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementos(battleParser.ElementosContext ctx);
}