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
public class battleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, PALAVRA_CHAVE=14, NUM_INT=15, NUM_REAL=16, 
		VAR=17, NOME=18, COMENTARIO=19, ESPACO=20, LINHA=21, DELIMITADOR=22, VIRGULA=23, 
		FIM_INST=24, ERRO=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", 
			"VAR", "NOME", "COMENTARIO", "ESPACO", "LINHA", "DELIMITADOR", "VIRGULA", 
			"FIM_INST", "ERRO"
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


	public battleLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u0117\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d9\n\17"+
		"\3\20\6\20\u00dc\n\20\r\20\16\20\u00dd\3\21\6\21\u00e1\n\21\r\21\16\21"+
		"\u00e2\3\21\3\21\6\21\u00e7\n\21\r\21\16\21\u00e8\3\22\5\22\u00ec\n\22"+
		"\3\22\7\22\u00ef\n\22\f\22\16\22\u00f2\13\22\3\23\3\23\7\23\u00f6\n\23"+
		"\f\23\16\23\u00f9\13\23\3\23\3\23\3\24\3\24\7\24\u00ff\n\24\f\24\16\24"+
		"\u0102\13\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\4\u00f7\u0100\2\33\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\6\5\2C\\aac|\6\2\62;C\\"+
		"aac|\3\2\f\f\5\2\13\13\17\17\"\"\2\u0128\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3"+
		"\65\3\2\2\2\59\3\2\2\2\7A\3\2\2\2\tE\3\2\2\2\13M\3\2\2\2\rS\3\2\2\2\17"+
		"]\3\2\2\2\21c\3\2\2\2\23m\3\2\2\2\25r\3\2\2\2\27y\3\2\2\2\31\177\3\2\2"+
		"\2\33\u0088\3\2\2\2\35\u00d8\3\2\2\2\37\u00db\3\2\2\2!\u00e0\3\2\2\2#"+
		"\u00eb\3\2\2\2%\u00f3\3\2\2\2\'\u00fc\3\2\2\2)\u0107\3\2\2\2+\u010b\3"+
		"\2\2\2-\u010f\3\2\2\2/\u0111\3\2\2\2\61\u0113\3\2\2\2\63\u0115\3\2\2\2"+
		"\65\66\7d\2\2\66\67\7q\2\2\678\7o\2\28\4\3\2\2\29:\7h\2\2:;\7k\2\2;<\7"+
		"o\2\2<=\7a\2\2=>\7d\2\2>?\7q\2\2?@\7o\2\2@\6\3\2\2\2AB\7o\2\2BC\7c\2\2"+
		"CD\7w\2\2D\b\3\2\2\2EF\7h\2\2FG\7k\2\2GH\7o\2\2HI\7a\2\2IJ\7o\2\2JK\7"+
		"c\2\2KL\7w\2\2L\n\3\2\2\2MN\7j\2\2NO\7g\2\2OP\7t\2\2PQ\7q\2\2QR\7k\2\2"+
		"R\f\3\2\2\2ST\7h\2\2TU\7k\2\2UV\7o\2\2VW\7a\2\2WX\7j\2\2XY\7g\2\2YZ\7"+
		"t\2\2Z[\7q\2\2[\\\7k\2\2\\\16\3\2\2\2]^\7x\2\2^_\7k\2\2_`\7n\2\2`a\7c"+
		"\2\2ab\7q\2\2b\20\3\2\2\2cd\7h\2\2de\7k\2\2ef\7o\2\2fg\7a\2\2gh\7x\2\2"+
		"hi\7k\2\2ij\7n\2\2jk\7c\2\2kl\7q\2\2l\22\3\2\2\2mn\7p\2\2no\7q\2\2op\7"+
		"o\2\2pq\7g\2\2q\24\3\2\2\2rs\7e\2\2st\7n\2\2tu\7c\2\2uv\7u\2\2vw\7u\2"+
		"\2wx\7g\2\2x\26\3\2\2\2yz\7p\2\2z{\7k\2\2{|\7x\2\2|}\7g\2\2}~\7n\2\2~"+
		"\30\3\2\2\2\177\u0080\7g\2\2\u0080\u0081\7n\2\2\u0081\u0082\7g\2\2\u0082"+
		"\u0083\7o\2\2\u0083\u0084\7g\2\2\u0084\u0085\7p\2\2\u0085\u0086\7v\2\2"+
		"\u0086\u0087\7q\2\2\u0087\32\3\2\2\2\u0088\u0089\7x\2\2\u0089\u008a\7"+
		"k\2\2\u008a\u008b\7f\2\2\u008b\u008c\7c\2\2\u008c\34\3\2\2\2\u008d\u008e"+
		"\7d\2\2\u008e\u008f\7q\2\2\u008f\u00d9\7o\2\2\u0090\u0091\7j\2\2\u0091"+
		"\u0092\7g\2\2\u0092\u0093\7t\2\2\u0093\u0094\7q\2\2\u0094\u00d9\7k\2\2"+
		"\u0095\u0096\7p\2\2\u0096\u0097\7q\2\2\u0097\u0098\7o\2\2\u0098\u00d9"+
		"\7g\2\2\u0099\u009a\7e\2\2\u009a\u009b\7n\2\2\u009b\u009c\7c\2\2\u009c"+
		"\u009d\7u\2\2\u009d\u009e\7u\2\2\u009e\u00d9\7g\2\2\u009f\u00a0\7p\2\2"+
		"\u00a0\u00a1\7k\2\2\u00a1\u00a2\7x\2\2\u00a2\u00a3\7g\2\2\u00a3\u00d9"+
		"\7n\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7o\2\2\u00a7"+
		"\u00a8\7a\2\2\u00a8\u00a9\7j\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7t\2\2"+
		"\u00ab\u00ac\7q\2\2\u00ac\u00d9\7k\2\2\u00ad\u00ae\7h\2\2\u00ae\u00af"+
		"\7k\2\2\u00af\u00b0\7o\2\2\u00b0\u00b1\7a\2\2\u00b1\u00b2\7d\2\2\u00b2"+
		"\u00b3\7q\2\2\u00b3\u00d9\7o\2\2\u00b4\u00b5\7o\2\2\u00b5\u00b6\7c\2\2"+
		"\u00b6\u00d9\7w\2\2\u00b7\u00b8\7x\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba"+
		"\7n\2\2\u00ba\u00bb\7c\2\2\u00bb\u00d9\7q\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\u00be\7n\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7o\2\2\u00c0\u00c1\7g\2\2"+
		"\u00c1\u00c2\7p\2\2\u00c2\u00c3\7v\2\2\u00c3\u00d9\7q\2\2\u00c4\u00c5"+
		"\7x\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7f\2\2\u00c7\u00d9\7c\2\2\u00c8"+
		"\u00c9\7h\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7o\2\2\u00cb\u00cc\7a\2\2"+
		"\u00cc\u00cd\7x\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0"+
		"\7c\2\2\u00d0\u00d9\7q\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7k\2\2\u00d3"+
		"\u00d4\7o\2\2\u00d4\u00d5\7a\2\2\u00d5\u00d6\7o\2\2\u00d6\u00d7\7c\2\2"+
		"\u00d7\u00d9\7w\2\2\u00d8\u008d\3\2\2\2\u00d8\u0090\3\2\2\2\u00d8\u0095"+
		"\3\2\2\2\u00d8\u0099\3\2\2\2\u00d8\u009f\3\2\2\2\u00d8\u00a4\3\2\2\2\u00d8"+
		"\u00ad\3\2\2\2\u00d8\u00b4\3\2\2\2\u00d8\u00b7\3\2\2\2\u00d8\u00bc\3\2"+
		"\2\2\u00d8\u00c4\3\2\2\2\u00d8\u00c8\3\2\2\2\u00d8\u00d1\3\2\2\2\u00d9"+
		"\36\3\2\2\2\u00da\u00dc\4\62;\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2"+
		"\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de \3\2\2\2\u00df\u00e1"+
		"\4\62;\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\7\60\2\2\u00e5\u00e7\4"+
		"\62;\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\"\3\2\2\2\u00ea\u00ec\t\2\2\2\u00eb\u00ea\3\2\2\2"+
		"\u00ec\u00f0\3\2\2\2\u00ed\u00ef\t\3\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1$\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f7\7$\2\2\u00f4\u00f6\n\4\2\2\u00f5\u00f4\3\2"+
		"\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7$\2\2\u00fb&\3\2\2\2\u00fc"+
		"\u0100\7%\2\2\u00fd\u00ff\n\4\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0104\7%\2\2\u0104\u0105\3\2\2\2\u0105\u0106\b\24"+
		"\2\2\u0106(\3\2\2\2\u0107\u0108\t\5\2\2\u0108\u0109\3\2\2\2\u0109\u010a"+
		"\b\25\2\2\u010a*\3\2\2\2\u010b\u010c\7\f\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\b\26\2\2\u010e,\3\2\2\2\u010f\u0110\7<\2\2\u0110.\3\2\2\2\u0111"+
		"\u0112\7.\2\2\u0112\60\3\2\2\2\u0113\u0114\7\60\2\2\u0114\62\3\2\2\2\u0115"+
		"\u0116\13\2\2\2\u0116\64\3\2\2\2\f\2\u00d8\u00dd\u00e2\u00e8\u00eb\u00ee"+
		"\u00f0\u00f7\u0100\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}