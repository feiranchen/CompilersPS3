// Generated from CubexLexer2.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CubexLexer2 extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, IF=2, ELSE=3, WHILE=4, FOR=5, IN=6, RETURN=7, INTERFACE=8, EXTENDS=9, 
		FUN=10, CLASS=11, SUPER=12, THING=13, NOTHING=14, TRUE=15, FALSE=16, CLSINTF=17, 
		TPARA=18, VAR=19, INTEGER=20, LBRACKET=21, RBRACKET=22, COLON=23, EQUAL=24, 
		LPAREN=25, RPAREN=26, COMMA=27, SEMICOLON=28, LBRACE=29, RBRACE=30, STAR=31, 
		SLASH=32, PERCENT=33, PLUS=34, DASH=35, LANGLE=36, RANGLE=37, BANG=38, 
		AMPERSAND=39, PIPE=40, DOT=41, APPEND=42, THR=43, LTHR=44, RTHR=45, LRTHR=46, 
		ONW=47, LONW=48, LTE=49, GTE=50, EQEQUAL=51, INEQUAL=52, ASSIGN=53, COMMENTS=54, 
		COMMENTS_POND=55, SPACE=56, ERROR=57;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"STRING", "'if'", "'else'", "'while'", "'for'", "'in'", "'return'", "'interface'", 
		"'extends'", "'fun'", "'class'", "'super'", "'Thing'", "'Nothing'", "'true'", 
		"'false'", "CLSINTF", "TPARA", "VAR", "INTEGER", "'['", "']'", "':'", 
		"'='", "'('", "')'", "','", "';'", "'{'", "'}'", "'*'", "'/'", "'%'", 
		"'+'", "'-'", "'<'", "'>'", "'!'", "'&'", "'|'", "'.'", "'++'", "'..'", 
		"'<.'", "'.<'", "'<<'", "'...'", "'<..'", "'<='", "'>='", "'=='", "'!='", 
		"':='", "COMMENTS", "COMMENTS_POND", "SPACE", "ERROR"
	};
	public static final String[] ruleNames = {
		"STRING", "IF", "ELSE", "WHILE", "FOR", "IN", "RETURN", "INTERFACE", "EXTENDS", 
		"FUN", "CLASS", "SUPER", "THING", "NOTHING", "TRUE", "FALSE", "CLSINTF", 
		"TPARA", "VAR", "INTEGER", "LBRACKET", "RBRACKET", "COLON", "EQUAL", "LPAREN", 
		"RPAREN", "COMMA", "SEMICOLON", "LBRACE", "RBRACE", "STAR", "SLASH", "PERCENT", 
		"PLUS", "DASH", "LANGLE", "RANGLE", "BANG", "AMPERSAND", "PIPE", "DOT", 
		"APPEND", "THR", "LTHR", "RTHR", "LRTHR", "ONW", "LONW", "LTE", "GTE", 
		"EQEQUAL", "INEQUAL", "ASSIGN", "COMMENTS", "COMMENTS_POND", "SPACE", 
		"ERROR"
	};


	public CubexLexer2(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CubexLexer2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 53: COMMENTS_action((RuleContext)_localctx, actionIndex); break;

		case 54: COMMENTS_POND_action((RuleContext)_localctx, actionIndex); break;

		case 55: SPACE_action((RuleContext)_localctx, actionIndex); break;

		case 56: ERROR_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void COMMENTS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void ERROR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: System.out.println("lexer error"); System.exit(-1); break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: skip();  break;
		}
	}
	private void COMMENTS_POND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2;\u015e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\7\2x\n\2\f"+
		"\2\16\2{\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\6\22\u00d8"+
		"\n\22\r\22\16\22\u00d9\3\23\3\23\3\24\3\24\7\24\u00e0\n\24\f\24\16\24"+
		"\u00e3\13\24\3\25\6\25\u00e6\n\25\r\25\16\25\u00e7\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\7\67\u013d\n\67\f\67\16"+
		"\67\u0140\13\67\3\67\3\67\3\67\3\67\38\38\78\u0148\n8\f8\168\u014b\13"+
		"8\38\38\38\38\39\69\u0152\n9\r9\169\u0153\39\39\3:\6:\u0159\n:\r:\16:"+
		"\u015a\3:\3:\5\u013e\u0149\u015a;\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1"+
		"\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!"+
		"\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34"+
		"\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S"+
		"+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\67\1m8"+
		"\3o9\4q:\5s;\2\3\2\t\4\2\13\f\17\17\3\2C\\\6\2\62;C\\aac|\3\2c|\3\2\62"+
		";\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u0166\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\3u\3\2\2\2\5~\3\2\2\2\7\u0081\3\2\2\2\t\u0086\3\2\2\2\13\u008c"+
		"\3\2\2\2\r\u0090\3\2\2\2\17\u0093\3\2\2\2\21\u009a\3\2\2\2\23\u00a4\3"+
		"\2\2\2\25\u00ac\3\2\2\2\27\u00b0\3\2\2\2\31\u00b6\3\2\2\2\33\u00bc\3\2"+
		"\2\2\35\u00c2\3\2\2\2\37\u00ca\3\2\2\2!\u00cf\3\2\2\2#\u00d5\3\2\2\2%"+
		"\u00db\3\2\2\2\'\u00dd\3\2\2\2)\u00e5\3\2\2\2+\u00e9\3\2\2\2-\u00eb\3"+
		"\2\2\2/\u00ed\3\2\2\2\61\u00ef\3\2\2\2\63\u00f1\3\2\2\2\65\u00f3\3\2\2"+
		"\2\67\u00f5\3\2\2\29\u00f7\3\2\2\2;\u00f9\3\2\2\2=\u00fb\3\2\2\2?\u00fd"+
		"\3\2\2\2A\u00ff\3\2\2\2C\u0101\3\2\2\2E\u0103\3\2\2\2G\u0105\3\2\2\2I"+
		"\u0107\3\2\2\2K\u0109\3\2\2\2M\u010b\3\2\2\2O\u010d\3\2\2\2Q\u010f\3\2"+
		"\2\2S\u0111\3\2\2\2U\u0113\3\2\2\2W\u0116\3\2\2\2Y\u0119\3\2\2\2[\u011c"+
		"\3\2\2\2]\u011f\3\2\2\2_\u0122\3\2\2\2a\u0126\3\2\2\2c\u012a\3\2\2\2e"+
		"\u012d\3\2\2\2g\u0130\3\2\2\2i\u0133\3\2\2\2k\u0136\3\2\2\2m\u0139\3\2"+
		"\2\2o\u0145\3\2\2\2q\u0151\3\2\2\2s\u0158\3\2\2\2uy\7$\2\2vx\n\2\2\2w"+
		"v\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7$\2\2}"+
		"\4\3\2\2\2~\177\7k\2\2\177\u0080\7h\2\2\u0080\6\3\2\2\2\u0081\u0082\7"+
		"g\2\2\u0082\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084\u0085\7g\2\2\u0085\b"+
		"\3\2\2\2\u0086\u0087\7y\2\2\u0087\u0088\7j\2\2\u0088\u0089\7k\2\2\u0089"+
		"\u008a\7n\2\2\u008a\u008b\7g\2\2\u008b\n\3\2\2\2\u008c\u008d\7h\2\2\u008d"+
		"\u008e\7q\2\2\u008e\u008f\7t\2\2\u008f\f\3\2\2\2\u0090\u0091\7k\2\2\u0091"+
		"\u0092\7p\2\2\u0092\16\3\2\2\2\u0093\u0094\7t\2\2\u0094\u0095\7g\2\2\u0095"+
		"\u0096\7v\2\2\u0096\u0097\7w\2\2\u0097\u0098\7t\2\2\u0098\u0099\7p\2\2"+
		"\u0099\20\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c\u009d\7"+
		"v\2\2\u009d\u009e\7g\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1"+
		"\7c\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7g\2\2\u00a3\22\3\2\2\2\u00a4\u00a5"+
		"\7g\2\2\u00a5\u00a6\7z\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7g\2\2\u00a8"+
		"\u00a9\7p\2\2\u00a9\u00aa\7f\2\2\u00aa\u00ab\7u\2\2\u00ab\24\3\2\2\2\u00ac"+
		"\u00ad\7h\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7p\2\2\u00af\26\3\2\2\2\u00b0"+
		"\u00b1\7e\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7u\2\2"+
		"\u00b4\u00b5\7u\2\2\u00b5\30\3\2\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7"+
		"w\2\2\u00b8\u00b9\7r\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7t\2\2\u00bb\32"+
		"\3\2\2\2\u00bc\u00bd\7V\2\2\u00bd\u00be\7j\2\2\u00be\u00bf\7k\2\2\u00bf"+
		"\u00c0\7p\2\2\u00c0\u00c1\7i\2\2\u00c1\34\3\2\2\2\u00c2\u00c3\7P\2\2\u00c3"+
		"\u00c4\7q\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7j\2\2\u00c6\u00c7\7k\2\2"+
		"\u00c7\u00c8\7p\2\2\u00c8\u00c9\7i\2\2\u00c9\36\3\2\2\2\u00ca\u00cb\7"+
		"v\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce\7g\2\2\u00ce "+
		"\3\2\2\2\u00cf\u00d0\7h\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7n\2\2\u00d2"+
		"\u00d3\7u\2\2\u00d3\u00d4\7g\2\2\u00d4\"\3\2\2\2\u00d5\u00d7\t\3\2\2\u00d6"+
		"\u00d8\t\4\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da$\3\2\2\2\u00db\u00dc\t\3\2\2\u00dc&\3\2"+
		"\2\2\u00dd\u00e1\t\5\2\2\u00de\u00e0\t\4\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2(\3\2\2\2"+
		"\u00e3\u00e1\3\2\2\2\u00e4\u00e6\t\6\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8*\3\2\2\2\u00e9"+
		"\u00ea\7]\2\2\u00ea,\3\2\2\2\u00eb\u00ec\7_\2\2\u00ec.\3\2\2\2\u00ed\u00ee"+
		"\7<\2\2\u00ee\60\3\2\2\2\u00ef\u00f0\7?\2\2\u00f0\62\3\2\2\2\u00f1\u00f2"+
		"\7*\2\2\u00f2\64\3\2\2\2\u00f3\u00f4\7+\2\2\u00f4\66\3\2\2\2\u00f5\u00f6"+
		"\7.\2\2\u00f68\3\2\2\2\u00f7\u00f8\7=\2\2\u00f8:\3\2\2\2\u00f9\u00fa\7"+
		"}\2\2\u00fa<\3\2\2\2\u00fb\u00fc\7\177\2\2\u00fc>\3\2\2\2\u00fd\u00fe"+
		"\7,\2\2\u00fe@\3\2\2\2\u00ff\u0100\7\61\2\2\u0100B\3\2\2\2\u0101\u0102"+
		"\7\'\2\2\u0102D\3\2\2\2\u0103\u0104\7-\2\2\u0104F\3\2\2\2\u0105\u0106"+
		"\7/\2\2\u0106H\3\2\2\2\u0107\u0108\7>\2\2\u0108J\3\2\2\2\u0109\u010a\7"+
		"@\2\2\u010aL\3\2\2\2\u010b\u010c\7#\2\2\u010cN\3\2\2\2\u010d\u010e\7("+
		"\2\2\u010eP\3\2\2\2\u010f\u0110\7~\2\2\u0110R\3\2\2\2\u0111\u0112\7\60"+
		"\2\2\u0112T\3\2\2\2\u0113\u0114\7-\2\2\u0114\u0115\7-\2\2\u0115V\3\2\2"+
		"\2\u0116\u0117\7\60\2\2\u0117\u0118\7\60\2\2\u0118X\3\2\2\2\u0119\u011a"+
		"\7>\2\2\u011a\u011b\7\60\2\2\u011bZ\3\2\2\2\u011c\u011d\7\60\2\2\u011d"+
		"\u011e\7>\2\2\u011e\\\3\2\2\2\u011f\u0120\7>\2\2\u0120\u0121\7>\2\2\u0121"+
		"^\3\2\2\2\u0122\u0123\7\60\2\2\u0123\u0124\7\60\2\2\u0124\u0125\7\60\2"+
		"\2\u0125`\3\2\2\2\u0126\u0127\7>\2\2\u0127\u0128\7\60\2\2\u0128\u0129"+
		"\7\60\2\2\u0129b\3\2\2\2\u012a\u012b\7>\2\2\u012b\u012c\7?\2\2\u012cd"+
		"\3\2\2\2\u012d\u012e\7@\2\2\u012e\u012f\7?\2\2\u012ff\3\2\2\2\u0130\u0131"+
		"\7?\2\2\u0131\u0132\7?\2\2\u0132h\3\2\2\2\u0133\u0134\7#\2\2\u0134\u0135"+
		"\7?\2\2\u0135j\3\2\2\2\u0136\u0137\7<\2\2\u0137\u0138\7?\2\2\u0138l\3"+
		"\2\2\2\u0139\u013e\7b\2\2\u013a\u013d\5m\67\2\u013b\u013d\13\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141"+
		"\u0142\7)\2\2\u0142\u0143\3\2\2\2\u0143\u0144\b\67\3\2\u0144n\3\2\2\2"+
		"\u0145\u0149\7%\2\2\u0146\u0148\n\7\2\2\u0147\u0146\3\2\2\2\u0148\u014b"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014c\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014c\u014d\t\7\2\2\u014d\u014e\3\2\2\2\u014e\u014f\b8"+
		"\4\2\u014fp\3\2\2\2\u0150\u0152\t\b\2\2\u0151\u0150\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0156\b9\5\2\u0156r\3\2\2\2\u0157\u0159\13\2\2\2\u0158\u0157\3\2\2\2"+
		"\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c"+
		"\3\2\2\2\u015c\u015d\b:\2\2\u015dt\3\2\2\2\f\2y\u00d9\u00e1\u00e7\u013c"+
		"\u013e\u0149\u0153\u015a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}