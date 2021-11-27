// Generated from br\u005Cufscar\dc\compiladores\battle\simulator\battle.g4 by ANTLR 4.9.2
package br.ufscar.dc.compiladores.battle.simulator;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class battle extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRA_CHAVE=1, NUM_INT=2, NUM_REAL=3, VAR=4, NOME=5, COMENTARIO=6, ESPACO=7, 
		LINHA=8, DELIMITADOR=9, VIRGULA=10, FIM_INST=11, ERRO=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", "VAR", "NOME", "COMENTARIO", 
			"ESPACO", "LINHA", "DELIMITADOR", "VIRGULA", "FIM_INST", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'\n'", "':'", "','", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", "VAR", "NOME", "COMENTARIO", 
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


	public battle(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "battle.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2g\n\2\3\3\6\3j\n\3\r\3"+
		"\16\3k\3\4\6\4o\n\4\r\4\16\4p\3\4\3\4\6\4u\n\4\r\4\16\4v\3\5\5\5z\n\5"+
		"\3\5\7\5}\n\5\f\5\16\5\u0080\13\5\3\6\3\6\7\6\u0084\n\6\f\6\16\6\u0087"+
		"\13\6\3\6\3\6\3\7\3\7\7\7\u008d\n\7\f\7\16\7\u0090\13\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\4"+
		"\u0085\u008e\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\f\f\5\2\13\13\17\17\"\"\2\u00b6"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\3f\3\2\2\2\5i\3\2\2\2\7n\3\2\2\2\ty\3\2\2\2\13\u0081\3\2"+
		"\2\2\r\u008a\3\2\2\2\17\u0095\3\2\2\2\21\u0099\3\2\2\2\23\u009d\3\2\2"+
		"\2\25\u009f\3\2\2\2\27\u00a1\3\2\2\2\31\u00a3\3\2\2\2\33\34\7d\2\2\34"+
		"\35\7q\2\2\35g\7o\2\2\36\37\7j\2\2\37 \7g\2\2 !\7t\2\2!\"\7q\2\2\"g\7"+
		"k\2\2#$\7p\2\2$%\7q\2\2%&\7o\2\2&g\7g\2\2\'(\7e\2\2()\7n\2\2)*\7c\2\2"+
		"*+\7u\2\2+,\7u\2\2,g\7g\2\2-.\7p\2\2./\7k\2\2/\60\7x\2\2\60\61\7g\2\2"+
		"\61g\7n\2\2\62\63\7h\2\2\63\64\7k\2\2\64\65\7o\2\2\65\66\7a\2\2\66\67"+
		"\7j\2\2\678\7g\2\289\7t\2\29:\7q\2\2:g\7k\2\2;<\7h\2\2<=\7k\2\2=>\7o\2"+
		"\2>?\7a\2\2?@\7d\2\2@A\7q\2\2Ag\7o\2\2BC\7o\2\2CD\7c\2\2Dg\7w\2\2EF\7"+
		"x\2\2FG\7k\2\2GH\7n\2\2HI\7c\2\2Ig\7q\2\2JK\7g\2\2KL\7n\2\2LM\7g\2\2M"+
		"N\7o\2\2NO\7g\2\2OP\7p\2\2PQ\7v\2\2Qg\7q\2\2RS\7x\2\2ST\7k\2\2TU\7f\2"+
		"\2Ug\7c\2\2VW\7h\2\2WX\7k\2\2XY\7o\2\2YZ\7a\2\2Z[\7x\2\2[\\\7k\2\2\\]"+
		"\7n\2\2]^\7c\2\2^g\7q\2\2_`\7h\2\2`a\7k\2\2ab\7o\2\2bc\7a\2\2cd\7o\2\2"+
		"de\7c\2\2eg\7w\2\2f\33\3\2\2\2f\36\3\2\2\2f#\3\2\2\2f\'\3\2\2\2f-\3\2"+
		"\2\2f\62\3\2\2\2f;\3\2\2\2fB\3\2\2\2fE\3\2\2\2fJ\3\2\2\2fR\3\2\2\2fV\3"+
		"\2\2\2f_\3\2\2\2g\4\3\2\2\2hj\4\62;\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl"+
		"\3\2\2\2l\6\3\2\2\2mo\4\62;\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2"+
		"qr\3\2\2\2rt\7\60\2\2su\4\62;\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2"+
		"\2w\b\3\2\2\2xz\t\2\2\2yx\3\2\2\2z~\3\2\2\2{}\t\3\2\2|{\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\n\3\2\2\2\u0080~\3\2\2\2\u0081\u0085"+
		"\7$\2\2\u0082\u0084\n\4\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088\u0089\7$\2\2\u0089\f\3\2\2\2\u008a\u008e\7%\2\2\u008b\u008d"+
		"\n\4\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008f\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7%"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\7\2\2\u0094\16\3\2\2\2\u0095\u0096"+
		"\t\5\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\b\2\2\u0098\20\3\2\2\2\u0099"+
		"\u009a\7\f\2\2\u009a\u009b\3\2\2\2\u009b\u009c\b\t\2\2\u009c\22\3\2\2"+
		"\2\u009d\u009e\7<\2\2\u009e\24\3\2\2\2\u009f\u00a0\7.\2\2\u00a0\26\3\2"+
		"\2\2\u00a1\u00a2\7\60\2\2\u00a2\30\3\2\2\2\u00a3\u00a4\13\2\2\2\u00a4"+
		"\32\3\2\2\2\f\2fkpvy|~\u0085\u008e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}