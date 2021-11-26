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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u00a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2h\n\2\3\3\6\3k\n\3"+
		"\r\3\16\3l\3\4\6\4p\n\4\r\4\16\4q\3\4\3\4\6\4v\n\4\r\4\16\4w\3\5\5\5{"+
		"\n\5\3\5\7\5~\n\5\f\5\16\5\u0081\13\5\3\6\3\6\7\6\u0085\n\6\f\6\16\6\u0088"+
		"\13\6\3\6\3\6\3\7\3\7\7\7\u008e\n\7\f\7\16\7\u0091\13\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\4"+
		"\u0086\u008f\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\f\f\5\2\13\13\17\17\"\"\2\u00b6"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\3g\3\2\2\2\5j\3\2\2\2\7o\3\2\2\2\tz\3\2\2\2\13\u0082\3\2"+
		"\2\2\r\u008b\3\2\2\2\17\u0096\3\2\2\2\21\u009a\3\2\2\2\23\u009e\3\2\2"+
		"\2\25\u00a0\3\2\2\2\27\u00a2\3\2\2\2\31\u00a4\3\2\2\2\33\34\7d\2\2\34"+
		"\35\7q\2\2\35h\7o\2\2\36\37\7j\2\2\37 \7g\2\2 !\7t\2\2!\"\7q\2\2\"h\7"+
		"k\2\2#$\7p\2\2$%\7q\2\2%&\7o\2\2&h\7g\2\2\'(\7e\2\2()\7n\2\2)*\7c\2\2"+
		"*+\7u\2\2+,\7u\2\2,h\7g\2\2-.\7p\2\2./\7k\2\2/\60\7x\2\2\60\61\7g\2\2"+
		"\61h\7n\2\2\62\63\7h\2\2\63\64\7k\2\2\64\65\7o\2\2\65\66\7a\2\2\66\67"+
		"\7j\2\2\678\7g\2\289\7t\2\29:\7q\2\2:h\7k\2\2;<\7h\2\2<=\7k\2\2=>\7o\2"+
		"\2>?\7a\2\2?@\7d\2\2@A\7q\2\2AB\7o\2\2BC\3\2\2\2CD\7o\2\2DE\7c\2\2Eh\7"+
		"w\2\2FG\7x\2\2GH\7k\2\2HI\7n\2\2IJ\7c\2\2Jh\7q\2\2KL\7g\2\2LM\7n\2\2M"+
		"N\7g\2\2NO\7o\2\2OP\7g\2\2PQ\7p\2\2QR\7v\2\2Rh\7q\2\2ST\7x\2\2TU\7k\2"+
		"\2UV\7f\2\2Vh\7c\2\2WX\7h\2\2XY\7k\2\2YZ\7o\2\2Z[\7a\2\2[\\\7x\2\2\\]"+
		"\7k\2\2]^\7n\2\2^_\7c\2\2_h\7q\2\2`a\7h\2\2ab\7k\2\2bc\7o\2\2cd\7a\2\2"+
		"de\7o\2\2ef\7c\2\2fh\7w\2\2g\33\3\2\2\2g\36\3\2\2\2g#\3\2\2\2g\'\3\2\2"+
		"\2g-\3\2\2\2g\62\3\2\2\2g;\3\2\2\2gF\3\2\2\2gK\3\2\2\2gS\3\2\2\2gW\3\2"+
		"\2\2g`\3\2\2\2h\4\3\2\2\2ik\4\62;\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3"+
		"\2\2\2m\6\3\2\2\2np\4\62;\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs"+
		"\3\2\2\2su\7\60\2\2tv\4\62;\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2"+
		"x\b\3\2\2\2y{\t\2\2\2zy\3\2\2\2{\177\3\2\2\2|~\t\3\2\2}|\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\n\3\2\2\2\u0081\177\3\2"+
		"\2\2\u0082\u0086\7$\2\2\u0083\u0085\n\4\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7$\2\2\u008a\f\3\2\2\2\u008b\u008f"+
		"\7%\2\2\u008c\u008e\n\4\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0092\u0093\7%\2\2\u0093\u0094\3\2\2\2\u0094\u0095\b\7\2\2\u0095"+
		"\16\3\2\2\2\u0096\u0097\t\5\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\b\2"+
		"\2\u0099\20\3\2\2\2\u009a\u009b\7\f\2\2\u009b\u009c\3\2\2\2\u009c\u009d"+
		"\b\t\2\2\u009d\22\3\2\2\2\u009e\u009f\7<\2\2\u009f\24\3\2\2\2\u00a0\u00a1"+
		"\7.\2\2\u00a1\26\3\2\2\2\u00a2\u00a3\7\60\2\2\u00a3\30\3\2\2\2\u00a4\u00a5"+
		"\13\2\2\2\u00a5\32\3\2\2\2\f\2glqwz}\177\u0086\u008f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}