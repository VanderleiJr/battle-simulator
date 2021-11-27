// Generated from br\u005Cufscar\dc\compiladores\battle\simulator\battle.g4 by ANTLR 4.9.2
package br.ufscar.dc.compiladores.battle.simulator;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class battleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, PALAVRA_CHAVE=14, NUM_INT=15, NUM_REAL=16, 
		VAR=17, NOME=18, COMENTARIO=19, ESPACO=20, LINHA=21, DELIMITADOR=22, VIRGULA=23, 
		FIM_INST=24, ERRO=25;
	public static final int
		RULE_programa = 0, RULE_bons = 1, RULE_maus = 2, RULE_herois = 3, RULE_viloes = 4, 
		RULE_corpo_heroi = 5, RULE_corpo_vilao = 6, RULE_classes = 7, RULE_elementos = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "bons", "maus", "herois", "viloes", "corpo_heroi", "corpo_vilao", 
			"classes", "elementos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bom'", "'fim_bom'", "'mau'", "'fim_mau'", "'heroi'", "'fim_heroi'", 
			"'vilao'", "'fim_vilao'", "'nome'", "'classe'", "'nivel'", "'elemento'", 
			"'vida'", null, null, null, null, null, null, null, "'\n'", "':'", "','", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", "VAR", "NOME", "COMENTARIO", 
			"ESPACO", "LINHA", "DELIMITADOR", "VIRGULA", "FIM_INST", "ERRO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "battle.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public battleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(battleParser.EOF, 0); }
		public BonsContext bons() {
			return getRuleContext(BonsContext.class,0);
		}
		public MausContext maus() {
			return getRuleContext(MausContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof battleListener ) ((battleListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof battleListener ) ((battleListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof battleVisitor ) return ((battleVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(18);
				bons();
				}
			}

			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(21);
				maus();
				}
			}

			setState(24);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BonsContext extends ParserRuleContext {
		public TerminalNode DELIMITADOR() { return getToken(battleParser.DELIMITADOR, 0); }
		public TerminalNode FIM_INST() { return getToken(battleParser.FIM_INST, 0); }
		public List<HeroisContext> herois() {
			return getRuleContexts(HeroisContext.class);
		}
		public HeroisContext herois(int i) {
			return getRuleContext(HeroisContext.class,i);
		}
		public BonsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof battleListener ) ((battleListener)listener).enterBons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof battleListener ) ((battleListener)listener).exitBons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof battleVisitor ) return ((battleVisitor<? extends T>)visitor).visitBons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BonsContext bons() throws RecognitionException {
		BonsContext _localctx = new BonsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bons);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			match(DELIMITADOR);
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				herois();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			setState(33);
			match(T__1);
			setState(34);
			match(FIM_INST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MausContext extends ParserRuleContext {
		public TerminalNode DELIMITADOR() { return getToken(battleParser.DELIMITADOR, 0); }
		public TerminalNode FIM_INST() { return getToken(battleParser.FIM_INST, 0); }
		public List<ViloesContext> viloes() {
			return getRuleContexts(ViloesContext.class);
		}
		public ViloesContext viloes(int i) {
			return getRuleContext(ViloesContext.class,i);
		}
		public MausContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof battleListener ) ((battleListener)listener).enterMaus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof battleListener ) ((battleListener)listener).exitMaus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof battleVisitor ) return ((battleVisitor<? extends T>)visitor).visitMaus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MausContext maus() throws RecognitionException {
		MausContext _localctx = new MausContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_maus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__2);
			setState(37);
			match(DELIMITADOR);
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				viloes();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(43);
			match(T__3);
			setState(44);
			match(FIM_INST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeroisContext extends ParserRuleContext {
		public TerminalNode DELIMITADOR() { return getToken(battleParser.DELIMITADOR, 0); }
		public Corpo_heroiContext corpo_heroi() {
			return getRuleContext(Corpo_heroiContext.class,0);
		}
		public TerminalNode FIM_INST() { return getToken(battleParser.FIM_INST, 0); }
		public HeroisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_herois; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof battleListener ) ((battleListener)listener).enterHerois(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof battleListener ) ((battleListener)listener).exitHerois(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof battleVisitor ) return ((battleVisitor<? extends T>)visitor).visitHerois(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeroisContext herois() throws RecognitionException {
		HeroisContext _localctx = new HeroisContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_herois);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__4);
			setState(47);
			match(DELIMITADOR);
			setState(48);
			corpo_heroi();
			setState(49);
			match(T__5);
			setState(50);
			match(FIM_INST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ViloesContext extends ParserRuleContext {
		public TerminalNode DELIMITADOR() { return getToken(battleParser.DELIMITADOR, 0); }
		public Corpo_vilaoContext corpo_vilao() {
			return getRuleContext(Corpo_vilaoContext.class,0);
		}
		public TerminalNode FIM_INST() { return getToken(battleParser.FIM_INST, 0); }
		public ViloesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viloes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof battleListener ) ((battleListener)listener).enterViloes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof battleListener ) ((battleListener)listener).exitViloes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof battleVisitor ) return ((battleVisitor<? extends T>)visitor).visitViloes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViloesContext viloes() throws RecognitionException {
		ViloesContext _localctx = new ViloesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_viloes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__6);
			setState(53);
			match(DELIMITADOR);
			setState(54);
			corpo_vilao();
			setState(55);
			match(T__7);
			setState(56);
			match(FIM_INST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Corpo_heroiContext extends ParserRuleContext {
		public List<TerminalNode> DELIMITADOR() { return getTokens(battleParser.DELIMITADOR); }
		public TerminalNode DELIMITADOR(int i) {
			return getToken(battleParser.DELIMITADOR, i);
		}
		public TerminalNode NOME() { return getToken(battleParser.NOME, 0); }
		public ClassesContext classes() {
			return getRuleContext(ClassesContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(battleParser.NUM_INT, 0); }
		public Corpo_heroiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo_heroi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof battleListener ) ((battleListener)listener).enterCorpo_heroi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof battleListener ) ((battleListener)listener).exitCorpo_heroi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof battleVisitor ) return ((battleVisitor<? extends T>)visitor).visitCorpo_heroi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Corpo_heroiContext corpo_heroi() throws RecognitionException {
		Corpo_heroiContext _localctx = new Corpo_heroiContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_corpo_heroi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__8);
			setState(59);
			match(DELIMITADOR);
			setState(60);
			match(NOME);
			setState(61);
			match(T__9);
			setState(62);
			match(DELIMITADOR);
			setState(63);
			classes();
			setState(64);
			match(T__10);
			setState(65);
			match(DELIMITADOR);
			setState(66);
			match(NUM_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Corpo_vilaoContext extends ParserRuleContext {
		public List<TerminalNode> DELIMITADOR() { return getTokens(battleParser.DELIMITADOR); }
		public TerminalNode DELIMITADOR(int i) {
			return getToken(battleParser.DELIMITADOR, i);
		}
		public TerminalNode NOME() { return getToken(battleParser.NOME, 0); }
		public ElementosContext elementos() {
			return getRuleContext(ElementosContext.class,0);
		}
		public TerminalNode NUM_REAL() { return getToken(battleParser.NUM_REAL, 0); }
		public Corpo_vilaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo_vilao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof battleListener ) ((battleListener)listener).enterCorpo_vilao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof battleListener ) ((battleListener)listener).exitCorpo_vilao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof battleVisitor ) return ((battleVisitor<? extends T>)visitor).visitCorpo_vilao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Corpo_vilaoContext corpo_vilao() throws RecognitionException {
		Corpo_vilaoContext _localctx = new Corpo_vilaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_corpo_vilao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__8);
			setState(69);
			match(DELIMITADOR);
			setState(70);
			match(NOME);
			setState(71);
			match(T__11);
			setState(72);
			match(DELIMITADOR);
			setState(73);
			elementos();
			setState(74);
			match(T__12);
			setState(75);
			match(DELIMITADOR);
			setState(76);
			match(NUM_REAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassesContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(battleParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(battleParser.VAR, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(battleParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(battleParser.VIRGULA, i);
		}
		public ClassesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof battleListener ) ((battleListener)listener).enterClasses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof battleListener ) ((battleListener)listener).exitClasses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof battleVisitor ) return ((battleVisitor<? extends T>)visitor).visitClasses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassesContext classes() throws RecognitionException {
		ClassesContext _localctx = new ClassesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(VAR);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(79);
				match(VIRGULA);
				setState(80);
				match(VAR);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementosContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(battleParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(battleParser.VAR, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(battleParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(battleParser.VIRGULA, i);
		}
		public ElementosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof battleListener ) ((battleListener)listener).enterElementos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof battleListener ) ((battleListener)listener).exitElementos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof battleVisitor ) return ((battleVisitor<? extends T>)visitor).visitElementos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementosContext elementos() throws RecognitionException {
		ElementosContext _localctx = new ElementosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elementos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(VAR);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(87);
				match(VIRGULA);
				setState(88);
				match(VAR);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\5\2\26"+
		"\n\2\3\2\5\2\31\n\2\3\2\3\2\3\3\3\3\3\3\6\3 \n\3\r\3\16\3!\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\6\4*\n\4\r\4\16\4+\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\tT\n\t\f\t\16\tW\13\t\3"+
		"\n\3\n\3\n\7\n\\\n\n\f\n\16\n_\13\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2"+
		"\2\2]\2\25\3\2\2\2\4\34\3\2\2\2\6&\3\2\2\2\b\60\3\2\2\2\n\66\3\2\2\2\f"+
		"<\3\2\2\2\16F\3\2\2\2\20P\3\2\2\2\22X\3\2\2\2\24\26\5\4\3\2\25\24\3\2"+
		"\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\31\5\6\4\2\30\27\3\2\2\2\30\31\3\2"+
		"\2\2\31\32\3\2\2\2\32\33\7\2\2\3\33\3\3\2\2\2\34\35\7\3\2\2\35\37\7\30"+
		"\2\2\36 \5\b\5\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"#\3\2"+
		"\2\2#$\7\4\2\2$%\7\32\2\2%\5\3\2\2\2&\'\7\5\2\2\')\7\30\2\2(*\5\n\6\2"+
		")(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7\6\2\2./\7\32\2"+
		"\2/\7\3\2\2\2\60\61\7\7\2\2\61\62\7\30\2\2\62\63\5\f\7\2\63\64\7\b\2\2"+
		"\64\65\7\32\2\2\65\t\3\2\2\2\66\67\7\t\2\2\678\7\30\2\289\5\16\b\29:\7"+
		"\n\2\2:;\7\32\2\2;\13\3\2\2\2<=\7\13\2\2=>\7\30\2\2>?\7\24\2\2?@\7\f\2"+
		"\2@A\7\30\2\2AB\5\20\t\2BC\7\r\2\2CD\7\30\2\2DE\7\21\2\2E\r\3\2\2\2FG"+
		"\7\13\2\2GH\7\30\2\2HI\7\24\2\2IJ\7\16\2\2JK\7\30\2\2KL\5\22\n\2LM\7\17"+
		"\2\2MN\7\30\2\2NO\7\22\2\2O\17\3\2\2\2PU\7\23\2\2QR\7\31\2\2RT\7\23\2"+
		"\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\21\3\2\2\2WU\3\2\2\2X]\7\23"+
		"\2\2YZ\7\31\2\2Z\\\7\23\2\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^"+
		"\23\3\2\2\2_]\3\2\2\2\b\25\30!+U]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}