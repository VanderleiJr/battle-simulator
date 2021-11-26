// Generated from br\u005Cufscar\dc\compiladores\battle\simulator\battle.g4 by ANTLR 4.9.2
package br.ufscar.dc.compiladores.battle.simulator;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link battleParser}.
 */
public interface battleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link battleParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(battleParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link battleParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(battleParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link battleParser#bons}.
	 * @param ctx the parse tree
	 */
	void enterBons(battleParser.BonsContext ctx);
	/**
	 * Exit a parse tree produced by {@link battleParser#bons}.
	 * @param ctx the parse tree
	 */
	void exitBons(battleParser.BonsContext ctx);
	/**
	 * Enter a parse tree produced by {@link battleParser#maus}.
	 * @param ctx the parse tree
	 */
	void enterMaus(battleParser.MausContext ctx);
	/**
	 * Exit a parse tree produced by {@link battleParser#maus}.
	 * @param ctx the parse tree
	 */
	void exitMaus(battleParser.MausContext ctx);
	/**
	 * Enter a parse tree produced by {@link battleParser#herois}.
	 * @param ctx the parse tree
	 */
	void enterHerois(battleParser.HeroisContext ctx);
	/**
	 * Exit a parse tree produced by {@link battleParser#herois}.
	 * @param ctx the parse tree
	 */
	void exitHerois(battleParser.HeroisContext ctx);
	/**
	 * Enter a parse tree produced by {@link battleParser#viloes}.
	 * @param ctx the parse tree
	 */
	void enterViloes(battleParser.ViloesContext ctx);
	/**
	 * Exit a parse tree produced by {@link battleParser#viloes}.
	 * @param ctx the parse tree
	 */
	void exitViloes(battleParser.ViloesContext ctx);
	/**
	 * Enter a parse tree produced by {@link battleParser#corpo_heroi}.
	 * @param ctx the parse tree
	 */
	void enterCorpo_heroi(battleParser.Corpo_heroiContext ctx);
	/**
	 * Exit a parse tree produced by {@link battleParser#corpo_heroi}.
	 * @param ctx the parse tree
	 */
	void exitCorpo_heroi(battleParser.Corpo_heroiContext ctx);
	/**
	 * Enter a parse tree produced by {@link battleParser#corpo_vilao}.
	 * @param ctx the parse tree
	 */
	void enterCorpo_vilao(battleParser.Corpo_vilaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link battleParser#corpo_vilao}.
	 * @param ctx the parse tree
	 */
	void exitCorpo_vilao(battleParser.Corpo_vilaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link battleParser#classes}.
	 * @param ctx the parse tree
	 */
	void enterClasses(battleParser.ClassesContext ctx);
	/**
	 * Exit a parse tree produced by {@link battleParser#classes}.
	 * @param ctx the parse tree
	 */
	void exitClasses(battleParser.ClassesContext ctx);
	/**
	 * Enter a parse tree produced by {@link battleParser#elementos}.
	 * @param ctx the parse tree
	 */
	void enterElementos(battleParser.ElementosContext ctx);
	/**
	 * Exit a parse tree produced by {@link battleParser#elementos}.
	 * @param ctx the parse tree
	 */
	void exitElementos(battleParser.ElementosContext ctx);
}