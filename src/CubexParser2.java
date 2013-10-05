// Generated from CubexParser2.g4 by ANTLR 4.1

	import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CubexParser2 extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		APPEND=42, CLASS=11, STAR=31, LRTHR=46, THR=43, WHILE=4, LONW=48, CLSINTF=17, 
		COMMENTS_POND=55, ONW=47, LANGLE=36, GTE=50, LBRACE=29, FOR=5, THING=13, 
		SPACE=56, LTE=49, LPAREN=25, IF=2, LBRACKET=21, RPAREN=26, LTHR=44, SLASH=32, 
		IN=6, COMMENTS=54, COMMA=27, EQUAL=24, RETURN=7, NOTHING=14, PLUS=34, 
		PIPE=40, VAR=19, SUPER=12, RBRACKET=22, RANGLE=37, DOT=41, RTHR=45, INTEGER=20, 
		INEQUAL=52, RBRACE=30, PERCENT=33, DASH=35, ELSE=3, AMPERSAND=39, SEMICOLON=28, 
		BANG=38, ERROR=57, TRUE=15, COLON=23, EQEQUAL=51, ASSIGN=53, INTERFACE=8, 
		TPARA=18, FUN=10, FALSE=16, EXTENDS=9, STRING=1;
	public static final String[] tokenNames = {
		"<INVALID>", "STRING", "'if'", "'else'", "'while'", "'for'", "'in'", "'return'", 
		"'interface'", "'extends'", "'fun'", "'class'", "'super'", "'Thing'", 
		"'Nothing'", "'true'", "'false'", "CLSINTF", "TPARA", "VAR", "INTEGER", 
		"'['", "']'", "':'", "'='", "'('", "')'", "','", "';'", "'{'", "'}'", 
		"'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'>'", "'!'", "'&'", "'|'", 
		"'.'", "'++'", "'..'", "'<.'", "'.<'", "'<<'", "'...'", "'<..'", "'<='", 
		"'>='", "'=='", "'!='", "':='", "COMMENTS", "COMMENTS_POND", "SPACE", 
		"ERROR"
	};
	public static final int
		RULE_vc = 0, RULE_vv = 1, RULE_kindcontext = 2, RULE_typecontext = 3, 
		RULE_paratype = 4, RULE_type = 5, RULE_typescheme = 6, RULE_expr = 7, 
		RULE_exprs = 8, RULE_stat = 9, RULE_stats = 10, RULE_intf = 11, RULE_cls = 12, 
		RULE_program = 13, RULE_top = 14;
	public static final String[] ruleNames = {
		"vc", "vv", "kindcontext", "typecontext", "paratype", "type", "typescheme", 
		"expr", "exprs", "stat", "stats", "intf", "cls", "program", "top"
	};

	@Override
	public String getGrammarFileName() { return "CubexParser2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	  List<CuClass> classList = new ArrayList<CuClass>();
	  FuncTxt functxt = new FuncTxt();
	  Map<CuVvc,CuType> immut = new HashMap<CuVvc,CuType>();
	  Map<CuVvc,CuType> mut = new HashMap<CuVvc,CuType>();

	public CubexParser2(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class VcContext extends ParserRuleContext {
		public CuVvc v;
		public Token vvv;
		public TerminalNode CLSINTF() { return getToken(CubexParser2.CLSINTF, 0); }
		public VcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vc; }
	}

	public final VcContext vc() throws RecognitionException {
		VcContext _localctx = new VcContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_vc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); ((VcContext)_localctx).vvv = match(CLSINTF);
			((VcContext)_localctx).v =  new Vc((((VcContext)_localctx).vvv!=null?((VcContext)_localctx).vvv.getText():null));
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

	public static class VvContext extends ParserRuleContext {
		public CuVvc v;
		public Token vvv;
		public TerminalNode VAR() { return getToken(CubexParser2.VAR, 0); }
		public VvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vv; }
	}

	public final VvContext vv() throws RecognitionException {
		VvContext _localctx = new VvContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); ((VvContext)_localctx).vvv = match(VAR);
			((VvContext)_localctx).v =  new Vv((((VvContext)_localctx).vvv!=null?((VvContext)_localctx).vvv.getText():null));
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

	public static class KindcontextContext extends ParserRuleContext {
		public List<String> kc;
		public Token TPARA;
		public List<TerminalNode> COMMA() { return getTokens(CubexParser2.COMMA); }
		public List<TerminalNode> TPARA() { return getTokens(CubexParser2.TPARA); }
		public TerminalNode LANGLE() { return getToken(CubexParser2.LANGLE, 0); }
		public TerminalNode TPARA(int i) {
			return getToken(CubexParser2.TPARA, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CubexParser2.COMMA, i);
		}
		public TerminalNode RANGLE() { return getToken(CubexParser2.RANGLE, 0); }
		public KindcontextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kindcontext; }
	}

	public final KindcontextContext kindcontext() throws RecognitionException {
		KindcontextContext _localctx = new KindcontextContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_kindcontext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((KindcontextContext)_localctx).kc =  new ArrayList<String>();
			setState(51);
			_la = _input.LA(1);
			if (_la==LANGLE) {
				{
				setState(37); match(LANGLE);
				setState(48);
				_la = _input.LA(1);
				if (_la==TPARA) {
					{
					setState(38); ((KindcontextContext)_localctx).TPARA = match(TPARA);
					 _localctx.kc.add((((KindcontextContext)_localctx).TPARA!=null?((KindcontextContext)_localctx).TPARA.getText():null)); 
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(40); match(COMMA);
						setState(41); ((KindcontextContext)_localctx).TPARA = match(TPARA);
						 _localctx.kc.add((((KindcontextContext)_localctx).TPARA!=null?((KindcontextContext)_localctx).TPARA.getText():null)); 
						}
						}
						setState(47);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(50); match(RANGLE);
				}
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

	public static class TypecontextContext extends ParserRuleContext {
		public Map<CuVvc,CuType> tc;
		public VvContext v;
		public TypeContext t;
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CubexParser2.COMMA); }
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public TerminalNode RPAREN() { return getToken(CubexParser2.RPAREN, 0); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode COLON(int i) {
			return getToken(CubexParser2.COLON, i);
		}
		public TerminalNode LPAREN() { return getToken(CubexParser2.LPAREN, 0); }
		public List<TerminalNode> COLON() { return getTokens(CubexParser2.COLON); }
		public TerminalNode COMMA(int i) {
			return getToken(CubexParser2.COMMA, i);
		}
		public TypecontextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typecontext; }
	}

	public final TypecontextContext typecontext() throws RecognitionException {
		TypecontextContext _localctx = new TypecontextContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typecontext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((TypecontextContext)_localctx).tc =  new HashMap<CuVvc,CuType>(); 
			setState(54); match(LPAREN);
			setState(70);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(55); ((TypecontextContext)_localctx).v = vv();
				setState(56); match(COLON);
				setState(57); ((TypecontextContext)_localctx).t = type(0);
				 _localctx.tc.put(((TypecontextContext)_localctx).v.v, ((TypecontextContext)_localctx).t.t); 
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(59); match(COMMA);
					setState(60); ((TypecontextContext)_localctx).v = vv();
					setState(61); match(COLON);
					setState(62); ((TypecontextContext)_localctx).t = type(0);
					 _localctx.tc.put(((TypecontextContext)_localctx).v.v, ((TypecontextContext)_localctx).t.t); 
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(72); match(RPAREN);
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

	public static class ParatypeContext extends ParserRuleContext {
		public List<CuType> pt;
		public TypeContext t;
		public List<TerminalNode> COMMA() { return getTokens(CubexParser2.COMMA); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode LANGLE() { return getToken(CubexParser2.LANGLE, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(CubexParser2.COMMA, i);
		}
		public TerminalNode RANGLE() { return getToken(CubexParser2.RANGLE, 0); }
		public ParatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paratype; }
	}

	public final ParatypeContext paratype() throws RecognitionException {
		ParatypeContext _localctx = new ParatypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_paratype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ParatypeContext)_localctx).pt =  new ArrayList<CuType>(); 
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(75); match(LANGLE);
				setState(87);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THING) | (1L << NOTHING) | (1L << CLSINTF) | (1L << TPARA))) != 0)) {
					{
					setState(76); ((ParatypeContext)_localctx).t = type(0);
					_localctx.pt.add(((ParatypeContext)_localctx).t.t);
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(78); match(COMMA);
						setState(79); ((ParatypeContext)_localctx).t = type(0);
						_localctx.pt.add(((ParatypeContext)_localctx).t.t);
						}
						}
						setState(86);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(89); match(RANGLE);
				}
				break;
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

	public static class TypeContext extends ParserRuleContext {
		public int _p;
		public CuType t;
		public TypeContext l;
		public Token v;
		public Token CLSINTF;
		public ParatypeContext p;
		public TypeContext r;
		public TerminalNode AMPERSAND() { return getToken(CubexParser2.AMPERSAND, 0); }
		public TerminalNode TPARA() { return getToken(CubexParser2.TPARA, 0); }
		public TerminalNode CLSINTF() { return getToken(CubexParser2.CLSINTF, 0); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode THING() { return getToken(CubexParser2.THING, 0); }
		public ParatypeContext paratype() {
			return getRuleContext(ParatypeContext.class,0);
		}
		public TerminalNode NOTHING() { return getToken(CubexParser2.NOTHING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TypeContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState, _p);
		TypeContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, RULE_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			switch (_input.LA(1)) {
			case THING:
			case NOTHING:
			case TPARA:
				{
				setState(93);
				((TypeContext)_localctx).v = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THING) | (1L << NOTHING) | (1L << TPARA))) != 0)) ) {
					((TypeContext)_localctx).v = (Token)_errHandler.recoverInline(this);
				}
				consume();
				((TypeContext)_localctx).t =  (((TypeContext)_localctx).v!=null?((TypeContext)_localctx).v.getType():0)== TPARA ? new VTypePara((((TypeContext)_localctx).v!=null?((TypeContext)_localctx).v.getText():null)) : new VTopBot((((TypeContext)_localctx).v!=null?((TypeContext)_localctx).v.getText():null));
				}
				break;
			case CLSINTF:
				{
				setState(95); ((TypeContext)_localctx).CLSINTF = match(CLSINTF);
				setState(96); ((TypeContext)_localctx).p = paratype();
				((TypeContext)_localctx).t =  new VClass((((TypeContext)_localctx).CLSINTF!=null?((TypeContext)_localctx).CLSINTF.getText():null), ((TypeContext)_localctx).p.pt);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState, _p);
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(101);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(102); match(AMPERSAND);
					setState(103); ((TypeContext)_localctx).r = type(2);
					((TypeContext)_localctx).t =  new VTypeInter(((TypeContext)_localctx).l.t, ((TypeContext)_localctx).r.t);
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeschemeContext extends ParserRuleContext {
		public CuTypeScheme ts;
		public KindcontextContext kc;
		public TypecontextContext tc;
		public TypeContext t;
		public TypecontextContext typecontext() {
			return getRuleContext(TypecontextContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public KindcontextContext kindcontext() {
			return getRuleContext(KindcontextContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CubexParser2.COLON, 0); }
		public TypeschemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typescheme; }
	}

	public final TypeschemeContext typescheme() throws RecognitionException {
		TypeschemeContext _localctx = new TypeschemeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typescheme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); ((TypeschemeContext)_localctx).kc = kindcontext();
			setState(112); ((TypeschemeContext)_localctx).tc = typecontext();
			setState(113); match(COLON);
			setState(114); ((TypeschemeContext)_localctx).t = type(0);
			((TypeschemeContext)_localctx).ts =  new TypeScheme(((TypeschemeContext)_localctx).kc.kc, ((TypeschemeContext)_localctx).tc.tc, ((TypeschemeContext)_localctx).t.t);
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

	public static class ExprContext extends ParserRuleContext {
		public int _p;
		public CuExpr e;
		public ExprContext ex;
		public ExprContext l;
		public Token op;
		public Token VAR;
		public ParatypeContext pt;
		public ExprsContext es;
		public Token CLSINTF;
		public Token INTEGER;
		public Token STRING;
		public ExprContext r;
		public TerminalNode APPEND() { return getToken(CubexParser2.APPEND, 0); }
		public TerminalNode TRUE() { return getToken(CubexParser2.TRUE, 0); }
		public TerminalNode CLSINTF() { return getToken(CubexParser2.CLSINTF, 0); }
		public TerminalNode STAR() { return getToken(CubexParser2.STAR, 0); }
		public TerminalNode LANGLE() { return getToken(CubexParser2.LANGLE, 0); }
		public TerminalNode RBRACKET() { return getToken(CubexParser2.RBRACKET, 0); }
		public TerminalNode AMPERSAND() { return getToken(CubexParser2.AMPERSAND, 0); }
		public TerminalNode RTHR() { return getToken(CubexParser2.RTHR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode VAR() { return getToken(CubexParser2.VAR, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CubexParser2.PLUS, 0); }
		public TerminalNode LRTHR() { return getToken(CubexParser2.LRTHR, 0); }
		public TerminalNode ONW() { return getToken(CubexParser2.ONW, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(CubexParser2.PIPE, 0); }
		public TerminalNode GTE() { return getToken(CubexParser2.GTE, 0); }
		public TerminalNode PERCENT() { return getToken(CubexParser2.PERCENT, 0); }
		public TerminalNode LTE() { return getToken(CubexParser2.LTE, 0); }
		public TerminalNode BANG() { return getToken(CubexParser2.BANG, 0); }
		public TerminalNode DASH() { return getToken(CubexParser2.DASH, 0); }
		public TerminalNode LBRACKET() { return getToken(CubexParser2.LBRACKET, 0); }
		public TerminalNode LPAREN() { return getToken(CubexParser2.LPAREN, 0); }
		public TerminalNode INEQUAL() { return getToken(CubexParser2.INEQUAL, 0); }
		public TerminalNode EQEQUAL() { return getToken(CubexParser2.EQEQUAL, 0); }
		public TerminalNode RANGLE() { return getToken(CubexParser2.RANGLE, 0); }
		public TerminalNode DOT() { return getToken(CubexParser2.DOT, 0); }
		public TerminalNode LONW() { return getToken(CubexParser2.LONW, 0); }
		public TerminalNode RPAREN() { return getToken(CubexParser2.RPAREN, 0); }
		public TerminalNode LTHR() { return getToken(CubexParser2.LTHR, 0); }
		public ParatypeContext paratype() {
			return getRuleContext(ParatypeContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(CubexParser2.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(CubexParser2.STRING, 0); }
		public TerminalNode SLASH() { return getToken(CubexParser2.SLASH, 0); }
		public TerminalNode FALSE() { return getToken(CubexParser2.FALSE, 0); }
		public TerminalNode THR() { return getToken(CubexParser2.THR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			switch (_input.LA(1)) {
			case DASH:
			case BANG:
				{
				setState(118);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DASH || _la==BANG) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(119); ((ExprContext)_localctx).ex = expr(15);
				 ((ExprContext)_localctx).e =  (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == DASH ? new NegativeExpr(((ExprContext)_localctx).ex.e) : new NegateExpr(((ExprContext)_localctx).ex.e); 
				}
				break;
			case LPAREN:
				{
				setState(122); match(LPAREN);
				setState(123); ((ExprContext)_localctx).ex = expr(0);
				setState(124); match(RPAREN);
				((ExprContext)_localctx).e =  ((ExprContext)_localctx).ex.e;
				}
				break;
			case VAR:
				{
				setState(127); ((ExprContext)_localctx).VAR = match(VAR);
				((ExprContext)_localctx).e =  new VvExp((((ExprContext)_localctx).VAR!=null?((ExprContext)_localctx).VAR.getText():null));
				setState(135);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(129); ((ExprContext)_localctx).pt = paratype();
					setState(130); match(LPAREN);
					setState(131); ((ExprContext)_localctx).es = exprs();
					setState(132); match(RPAREN);
					_localctx.e.add(((ExprContext)_localctx).pt.pt, ((ExprContext)_localctx).es.cu);
					}
					break;
				}
				}
				break;
			case CLSINTF:
				{
				setState(137); ((ExprContext)_localctx).CLSINTF = match(CLSINTF);
				setState(138); ((ExprContext)_localctx).pt = paratype();
				setState(139); match(LPAREN);
				setState(140); ((ExprContext)_localctx).es = exprs();
				setState(141); match(RPAREN);
				((ExprContext)_localctx).e =  new VcExp((((ExprContext)_localctx).CLSINTF!=null?((ExprContext)_localctx).CLSINTF.getText():null), ((ExprContext)_localctx).pt.pt, ((ExprContext)_localctx).es.cu);
				}
				break;
			case LBRACKET:
				{
				setState(144); match(LBRACKET);
				setState(145); ((ExprContext)_localctx).es = exprs();
				setState(146); match(RBRACKET);
				((ExprContext)_localctx).e =  new BrkExpr(((ExprContext)_localctx).es.cu);
				}
				break;
			case TRUE:
				{
				setState(149); match(TRUE);
				((ExprContext)_localctx).e =  new CBoolean(true);
				}
				break;
			case FALSE:
				{
				setState(151); match(FALSE);
				((ExprContext)_localctx).e =  new CBoolean(false);
				}
				break;
			case INTEGER:
				{
				setState(153); ((ExprContext)_localctx).INTEGER = match(INTEGER);
				((ExprContext)_localctx).e =  new CInteger((((ExprContext)_localctx).INTEGER!=null?Integer.valueOf(((ExprContext)_localctx).INTEGER.getText()):0));
				}
				break;
			case STRING:
				{
				setState(155); ((ExprContext)_localctx).STRING = match(STRING);
				((ExprContext)_localctx).e =  new CString((((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(211);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(160);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << SLASH) | (1L << PERCENT))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(161); ((ExprContext)_localctx).r = expr(15);
						 ((ExprContext)_localctx).e =  (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == STAR

						                         ? new TimesExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e)

						                         : (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == SLASH

						                         ? new DivideExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e)

						                         : new ModuloExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e); 
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(165);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==DASH) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(166); ((ExprContext)_localctx).r = expr(14);
						 ((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == PLUS)

						                       ? new PlusExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e)

						                       : new MinusExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e); 
						}
						break;

					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(170);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THR) | (1L << LTHR) | (1L << RTHR) | (1L << LRTHR))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(171); ((ExprContext)_localctx).r = expr(13);
						((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == THR) ? new ThroughExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, true, true) : ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == LTHR) ? new ThroughExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, false, true) : ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == RTHR) ? new ThroughExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, true, false) : new ThroughExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, false, false);
						}
						break;

					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(175);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANGLE) | (1L << RANGLE) | (1L << LTE) | (1L << GTE))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(176); ((ExprContext)_localctx).r = expr(11);
						((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == LANGLE) ? new LessThanExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, true) : ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == LTE) ? new LessThanExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, false) : ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == RANGLE) ? new GreaterThanExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, true) : new GreaterThanExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, false);
						}
						break;

					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(180);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQEQUAL || _la==INEQUAL) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(181); ((ExprContext)_localctx).r = expr(10);
						((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == EQEQUAL) ? new EqualExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, true) : new EqualExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, false);
						}
						break;

					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(185); match(AMPERSAND);
						setState(186); ((ExprContext)_localctx).r = expr(9);
						 ((ExprContext)_localctx).e =  new AndExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e); 
						}
						break;

					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(190); match(PIPE);
						setState(191); ((ExprContext)_localctx).r = expr(8);
						 ((ExprContext)_localctx).e =  new OrExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e); 
						}
						break;

					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(195); match(APPEND);
						setState(196); ((ExprContext)_localctx).r = expr(6);
						((ExprContext)_localctx).e =  new AppExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e);
						}
						break;

					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.ex = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(199);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(200); match(DOT);
						setState(201); ((ExprContext)_localctx).VAR = match(VAR);
						setState(202); ((ExprContext)_localctx).pt = paratype();
						setState(203); match(LPAREN);
						setState(204); ((ExprContext)_localctx).es = exprs();
						setState(205); match(RPAREN);
						((ExprContext)_localctx).e =  new VarExpr(((ExprContext)_localctx).ex.e, (((ExprContext)_localctx).VAR!=null?((ExprContext)_localctx).VAR.getText():null), ((ExprContext)_localctx).pt.pt, ((ExprContext)_localctx).es.cu);
						}
						break;

					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.ex = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(208);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(209);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ONW || _la==LONW) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == ONW) ? new OnwardsExpr(((ExprContext)_localctx).ex.e, true) : new OnwardsExpr(((ExprContext)_localctx).ex.e, false);
						}
						break;
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprsContext extends ParserRuleContext {
		public List<CuExpr> cu;
		public ExprContext e;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(CubexParser2.COMMA); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CubexParser2.COMMA, i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExprsContext)_localctx).cu =  new ArrayList<CuExpr>();
			setState(228);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << CLSINTF) | (1L << VAR) | (1L << INTEGER) | (1L << LBRACKET) | (1L << LPAREN) | (1L << DASH) | (1L << BANG))) != 0)) {
				{
				setState(217); ((ExprsContext)_localctx).e = expr(0);
				_localctx.cu.add(((ExprsContext)_localctx).e.e);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(219); match(COMMA);
					setState(220); ((ExprsContext)_localctx).e = expr(0);
					_localctx.cu.add(((ExprsContext)_localctx).e.e);
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class StatContext extends ParserRuleContext {
		public CuStat s;
		public StatsContext ss;
		public Token VAR;
		public ExprContext e;
		public StatContext l;
		public StatContext r;
		public StatContext st;
		public TerminalNode LBRACE() { return getToken(CubexParser2.LBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CubexParser2.SEMICOLON, 0); }
		public TerminalNode EQUAL() { return getToken(CubexParser2.EQUAL, 0); }
		public TerminalNode RBRACE() { return getToken(CubexParser2.RBRACE, 0); }
		public TerminalNode LPAREN() { return getToken(CubexParser2.LPAREN, 0); }
		public TerminalNode IN() { return getToken(CubexParser2.IN, 0); }
		public TerminalNode WHILE() { return getToken(CubexParser2.WHILE, 0); }
		public TerminalNode IF() { return getToken(CubexParser2.IF, 0); }
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode FOR() { return getToken(CubexParser2.FOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(CubexParser2.ELSE, 0); }
		public TerminalNode ASSIGN() { return getToken(CubexParser2.ASSIGN, 0); }
		public TerminalNode VAR() { return getToken(CubexParser2.VAR, 0); }
		public TerminalNode RPAREN() { return getToken(CubexParser2.RPAREN, 0); }
		public TerminalNode RETURN() { return getToken(CubexParser2.RETURN, 0); }
		public StatsContext stats() {
			return getRuleContext(StatsContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stat);
		int _la;
		try {
			setState(274);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(230); match(LBRACE);
				setState(231); ((StatContext)_localctx).ss = stats();
				setState(232); match(RBRACE);
				((StatContext)_localctx).s =  new Stats(((StatContext)_localctx).ss.cu);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(235); ((StatContext)_localctx).VAR = match(VAR);
				setState(236); match(ASSIGN);
				setState(237); ((StatContext)_localctx).e = expr(0);
				setState(238); match(SEMICOLON);
				((StatContext)_localctx).s =  new AssignStat((((StatContext)_localctx).VAR!=null?((StatContext)_localctx).VAR.getText():null), ((StatContext)_localctx).e.e);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(241); match(IF);
				setState(242); match(LPAREN);
				setState(243); ((StatContext)_localctx).e = expr(0);
				setState(244); match(RPAREN);
				setState(245); ((StatContext)_localctx).l = stat();
				((StatContext)_localctx).s =  new IfStat(((StatContext)_localctx).e.e, ((StatContext)_localctx).l.s);
				setState(251);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(247); match(ELSE);
					setState(248); ((StatContext)_localctx).r = stat();
					_localctx.s.add(((StatContext)_localctx).r.s);
					}
					break;
				}
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(253); match(WHILE);
				setState(254); match(LPAREN);
				setState(255); ((StatContext)_localctx).e = expr(0);
				setState(256); match(RPAREN);
				setState(257); ((StatContext)_localctx).st = stat();
				((StatContext)_localctx).s =  new WhileStat(((StatContext)_localctx).e.e, ((StatContext)_localctx).st.s);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(260); match(FOR);
				setState(261); match(LPAREN);
				setState(262); ((StatContext)_localctx).VAR = match(VAR);
				setState(263); match(IN);
				setState(264); ((StatContext)_localctx).e = expr(0);
				setState(265); match(RPAREN);
				setState(266); ((StatContext)_localctx).st = stat();
				((StatContext)_localctx).s =  new ForStat((((StatContext)_localctx).VAR!=null?((StatContext)_localctx).VAR.getText():null), ((StatContext)_localctx).e.e, ((StatContext)_localctx).st.s);
				}
				break;
			case RETURN:
			case EQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				_la = _input.LA(1);
				if ( !(_la==RETURN || _la==EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(270); ((StatContext)_localctx).e = expr(0);
				setState(271); match(SEMICOLON);
				((StatContext)_localctx).s =  new ReturnStat(((StatContext)_localctx).e.e);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StatsContext extends ParserRuleContext {
		public List<CuStat> cu;
		public StatContext s;
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stats; }
	}

	public final StatsContext stats() throws RecognitionException {
		StatsContext _localctx = new StatsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stats);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((StatsContext)_localctx).cu =  new ArrayList<CuStat>();
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(277); ((StatsContext)_localctx).s = stat();
				_localctx.cu.add(((StatsContext)_localctx).s.s);
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(279); ((StatsContext)_localctx).s = stat();
						_localctx.cu.add(((StatsContext)_localctx).s.s);
						}
						} 
					}
					setState(286);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				break;
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

	public static class IntfContext extends ParserRuleContext {
		public CuClass c;
		public Token CLSINTF;
		public KindcontextContext p;
		public TypeContext t;
		public VvContext v;
		public TypeschemeContext ts;
		public TerminalNode LBRACE() { return getToken(CubexParser2.LBRACE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CubexParser2.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CubexParser2.SEMICOLON, i);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public List<TerminalNode> FUN() { return getTokens(CubexParser2.FUN); }
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public TerminalNode CLSINTF() { return getToken(CubexParser2.CLSINTF, 0); }
		public KindcontextContext kindcontext() {
			return getRuleContext(KindcontextContext.class,0);
		}
		public List<TypeschemeContext> typescheme() {
			return getRuleContexts(TypeschemeContext.class);
		}
		public TerminalNode RBRACE() { return getToken(CubexParser2.RBRACE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeschemeContext typescheme(int i) {
			return getRuleContext(TypeschemeContext.class,i);
		}
		public TerminalNode INTERFACE() { return getToken(CubexParser2.INTERFACE, 0); }
		public TerminalNode FUN(int i) {
			return getToken(CubexParser2.FUN, i);
		}
		public TerminalNode EXTENDS() { return getToken(CubexParser2.EXTENDS, 0); }
		public IntfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intf; }
	}

	public final IntfContext intf() throws RecognitionException {
		IntfContext _localctx = new IntfContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_intf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); match(INTERFACE);
			setState(290); ((IntfContext)_localctx).CLSINTF = match(CLSINTF);
			setState(291); ((IntfContext)_localctx).p = kindcontext();
			((IntfContext)_localctx).c =  new Intf((((IntfContext)_localctx).CLSINTF!=null?((IntfContext)_localctx).CLSINTF.getText():null), ((IntfContext)_localctx).p.kc); classList.add(_localctx.c);
			setState(310);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(293); match(EXTENDS);
				setState(294); ((IntfContext)_localctx).t = type(0);
				_localctx.c.add(((IntfContext)_localctx).t.t);
				setState(296); match(LBRACE);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUN) {
					{
					{
					setState(297); match(FUN);
					setState(298); ((IntfContext)_localctx).v = vv();
					setState(299); ((IntfContext)_localctx).ts = typescheme();
					setState(300); match(SEMICOLON);
					_localctx.c.add(((IntfContext)_localctx).v.v, ((IntfContext)_localctx).ts.ts); functxt.add(((IntfContext)_localctx).v.v, ((IntfContext)_localctx).ts.ts);
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(308); match(RBRACE);
				}
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

	public static class ClsContext extends ParserRuleContext {
		public CuClass c;
		public VcContext v;
		public KindcontextContext pk;
		public TypecontextContext pt;
		public TypeContext t;
		public StatContext s;
		public ExprsContext es;
		public VvContext vs;
		public TypeschemeContext ts;
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CubexParser2.LBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CubexParser2.SEMICOLON, 0); }
		public TerminalNode SUPER() { return getToken(CubexParser2.SUPER, 0); }
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public List<TerminalNode> FUN() { return getTokens(CubexParser2.FUN); }
		public KindcontextContext kindcontext() {
			return getRuleContext(KindcontextContext.class,0);
		}
		public List<TypeschemeContext> typescheme() {
			return getRuleContexts(TypeschemeContext.class);
		}
		public TerminalNode RBRACE() { return getToken(CubexParser2.RBRACE, 0); }
		public TerminalNode LPAREN() { return getToken(CubexParser2.LPAREN, 0); }
		public TerminalNode CLASS() { return getToken(CubexParser2.CLASS, 0); }
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TypecontextContext typecontext() {
			return getRuleContext(TypecontextContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CubexParser2.RPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeschemeContext typescheme(int i) {
			return getRuleContext(TypeschemeContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public VcContext vc() {
			return getRuleContext(VcContext.class,0);
		}
		public TerminalNode FUN(int i) {
			return getToken(CubexParser2.FUN, i);
		}
		public TerminalNode EXTENDS() { return getToken(CubexParser2.EXTENDS, 0); }
		public ClsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cls; }
	}

	public final ClsContext cls() throws RecognitionException {
		ClsContext _localctx = new ClsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312); match(CLASS);
			setState(313); ((ClsContext)_localctx).v = vc();
			setState(314); ((ClsContext)_localctx).pk = kindcontext();
			setState(315); ((ClsContext)_localctx).pt = typecontext();
			((ClsContext)_localctx).c =  new Cls(((ClsContext)_localctx).v.v, ((ClsContext)_localctx).pk.kc, ((ClsContext)_localctx).pt.tc); classList.add(_localctx.c);
			setState(351);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(317); match(EXTENDS);
				setState(318); ((ClsContext)_localctx).t = type(0);
				_localctx.c.add(((ClsContext)_localctx).t.t);
				setState(320); match(LBRACE);
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << VAR) | (1L << EQUAL) | (1L << LBRACE))) != 0)) {
					{
					{
					setState(321); ((ClsContext)_localctx).s = stat();
					_localctx.c.add(((ClsContext)_localctx).s.s);
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(336);
				_la = _input.LA(1);
				if (_la==SUPER) {
					{
					setState(329); match(SUPER);
					setState(330); match(LPAREN);
					setState(331); ((ClsContext)_localctx).es = exprs();
					setState(332); match(RPAREN);
					setState(333); match(SEMICOLON);
					_localctx.c.add(((ClsContext)_localctx).es.cu);
					}
				}

				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUN) {
					{
					{
					setState(338); match(FUN);
					setState(339); ((ClsContext)_localctx).vs = vv();
					setState(340); ((ClsContext)_localctx).ts = typescheme();
					setState(341); ((ClsContext)_localctx).s = stat();
					_localctx.c.add(((ClsContext)_localctx).vs.v, ((ClsContext)_localctx).ts.ts, ((ClsContext)_localctx).s.s); functxt.add(((ClsContext)_localctx).vs.v, ((ClsContext)_localctx).ts.ts);
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(349); match(RBRACE);
				}
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

	public static class ProgramContext extends ParserRuleContext {
		public CuProgr p;
		public StatContext s;
		public StatsContext ss;
		public ProgramContext pr;
		public VvContext v;
		public TypeschemeContext ts;
		public VvContext vs;
		public IntfContext i;
		public ClsContext c;
		public IntfContext intf() {
			return getRuleContext(IntfContext.class,0);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public ClsContext cls() {
			return getRuleContext(ClsContext.class,0);
		}
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public List<TerminalNode> FUN() { return getTokens(CubexParser2.FUN); }
		public TypeschemeContext typescheme(int i) {
			return getRuleContext(TypeschemeContext.class,i);
		}
		public List<TypeschemeContext> typescheme() {
			return getRuleContexts(TypeschemeContext.class);
		}
		public StatsContext stats() {
			return getRuleContext(StatsContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public TerminalNode FUN(int i) {
			return getToken(CubexParser2.FUN, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_program);
		int _la;
		try {
			int _alt;
			setState(388);
			switch (_input.LA(1)) {
			case IF:
			case WHILE:
			case FOR:
			case RETURN:
			case VAR:
			case EQUAL:
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(353); ((ProgramContext)_localctx).s = stat();
				((ProgramContext)_localctx).p =  new StatPrg(((ProgramContext)_localctx).s.s);
				setState(359);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << INTERFACE) | (1L << FUN) | (1L << CLASS) | (1L << VAR) | (1L << EQUAL) | (1L << LBRACE))) != 0)) {
					{
					setState(355); ((ProgramContext)_localctx).ss = stats();
					setState(356); ((ProgramContext)_localctx).pr = program();
					_localctx.p.add(((ProgramContext)_localctx).ss.cu, ((ProgramContext)_localctx).pr.p);
					}
				}

				}
				break;
			case FUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(361); match(FUN);
				setState(362); ((ProgramContext)_localctx).v = vv();
				setState(363); ((ProgramContext)_localctx).ts = typescheme();
				setState(364); ((ProgramContext)_localctx).s = stat();
				((ProgramContext)_localctx).p =  new FunPrg(((ProgramContext)_localctx).v.v, ((ProgramContext)_localctx).ts.ts, ((ProgramContext)_localctx).s.s); functxt.add(((ProgramContext)_localctx).v.v, ((ProgramContext)_localctx).ts.ts);
				setState(374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(366); match(FUN);
						setState(367); ((ProgramContext)_localctx).vs = vv();
						setState(368); ((ProgramContext)_localctx).ts = typescheme();
						setState(369); ((ProgramContext)_localctx).s = stat();
						_localctx.p.add(((ProgramContext)_localctx).vs.v, ((ProgramContext)_localctx).ts.ts, ((ProgramContext)_localctx).s.s); functxt.add(((ProgramContext)_localctx).vs.v, ((ProgramContext)_localctx).ts.ts);
						}
						} 
					}
					setState(376);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(377); ((ProgramContext)_localctx).pr = program();
				_localctx.p.add(((ProgramContext)_localctx).pr.p);
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(380); ((ProgramContext)_localctx).i = intf();
				setState(381); ((ProgramContext)_localctx).pr = program();
				((ProgramContext)_localctx).p =  new ClassPrg(((ProgramContext)_localctx).i.c, ((ProgramContext)_localctx).pr.p);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 4);
				{
				setState(384); ((ProgramContext)_localctx).c = cls();
				setState(385); ((ProgramContext)_localctx).pr = program();
				((ProgramContext)_localctx).p =  new ClassPrg(((ProgramContext)_localctx).c.c, ((ProgramContext)_localctx).pr.p);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TopContext extends ParserRuleContext {
		public CuTop cu;
		public ProgramContext p;
		public TerminalNode EOF() { return getToken(CubexParser2.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top; }
	}

	public final TopContext top() throws RecognitionException {
		TopContext _localctx = new TopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_top);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390); ((TopContext)_localctx).p = program();
			setState(391); match(EOF);
			((TopContext)_localctx).cu =  new Top(((TopContext)_localctx).p.p);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5: return type_sempred((TypeContext)_localctx, predIndex);

		case 7: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 14 >= _localctx._p;

		case 2: return 13 >= _localctx._p;

		case 3: return 12 >= _localctx._p;

		case 4: return 10 >= _localctx._p;

		case 5: return 9 >= _localctx._p;

		case 6: return 8 >= _localctx._p;

		case 7: return 7 >= _localctx._p;

		case 8: return 5 >= _localctx._p;

		case 9: return 16 >= _localctx._p;

		case 10: return 11 >= _localctx._p;
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3;\u018d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4.\n\4\f\4\16\4\61\13\4\5\4\63\n\4"+
		"\3\4\5\4\66\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5D\n"+
		"\5\f\5\16\5G\13\5\5\5I\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"U\n\6\f\6\16\6X\13\6\5\6Z\n\6\3\6\5\6]\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7f\n\7\3\7\3\7\3\7\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u008a\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a0\n\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d6\n\t\f\t\16\t"+
		"\u00d9\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00e2\n\n\f\n\16\n\u00e5\13"+
		"\n\5\n\u00e7\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00fe\n\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0115\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u011d\n\f\f\f\16\f\u0120\13\f\5\f\u0122\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0132\n\r\f\r\16\r\u0135\13\r\3"+
		"\r\3\r\5\r\u0139\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u0147\n\16\f\16\16\16\u014a\13\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0153\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u015b"+
		"\n\16\f\16\16\16\u015e\13\16\3\16\3\16\5\16\u0162\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u016a\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u0177\n\17\f\17\16\17\u017a\13\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0187\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\13\4\2\17\20"+
		"\24\24\4\2%%((\3\2!#\3\2$%\3\2-\60\4\2&\'\63\64\3\2\65\66\3\2\61\62\4"+
		"\2\t\t\32\32\u01af\2 \3\2\2\2\4#\3\2\2\2\6&\3\2\2\2\b\67\3\2\2\2\nL\3"+
		"\2\2\2\fe\3\2\2\2\16q\3\2\2\2\20\u009f\3\2\2\2\22\u00da\3\2\2\2\24\u0114"+
		"\3\2\2\2\26\u0116\3\2\2\2\30\u0123\3\2\2\2\32\u013a\3\2\2\2\34\u0186\3"+
		"\2\2\2\36\u0188\3\2\2\2 !\7\23\2\2!\"\b\2\1\2\"\3\3\2\2\2#$\7\25\2\2$"+
		"%\b\3\1\2%\5\3\2\2\2&\65\b\4\1\2\'\62\7&\2\2()\7\24\2\2)/\b\4\1\2*+\7"+
		"\35\2\2+,\7\24\2\2,.\b\4\1\2-*\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2"+
		"\2\60\63\3\2\2\2\61/\3\2\2\2\62(\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64"+
		"\66\7\'\2\2\65\'\3\2\2\2\65\66\3\2\2\2\66\7\3\2\2\2\678\b\5\1\28H\7\33"+
		"\2\29:\5\4\3\2:;\7\31\2\2;<\5\f\7\2<E\b\5\1\2=>\7\35\2\2>?\5\4\3\2?@\7"+
		"\31\2\2@A\5\f\7\2AB\b\5\1\2BD\3\2\2\2C=\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF"+
		"\3\2\2\2FI\3\2\2\2GE\3\2\2\2H9\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\34\2\2"+
		"K\t\3\2\2\2L\\\b\6\1\2MY\7&\2\2NO\5\f\7\2OV\b\6\1\2PQ\7\35\2\2QR\5\f\7"+
		"\2RS\b\6\1\2SU\3\2\2\2TP\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2"+
		"\2XV\3\2\2\2YN\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[]\7\'\2\2\\M\3\2\2\2\\]\3\2"+
		"\2\2]\13\3\2\2\2^_\b\7\1\2_`\t\2\2\2`f\b\7\1\2ab\7\23\2\2bc\5\n\6\2cd"+
		"\b\7\1\2df\3\2\2\2e^\3\2\2\2ea\3\2\2\2fn\3\2\2\2gh\6\7\2\3hi\7)\2\2ij"+
		"\5\f\7\2jk\b\7\1\2km\3\2\2\2lg\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o"+
		"\r\3\2\2\2pn\3\2\2\2qr\5\6\4\2rs\5\b\5\2st\7\31\2\2tu\5\f\7\2uv\b\b\1"+
		"\2v\17\3\2\2\2wx\b\t\1\2xy\t\3\2\2yz\5\20\t\2z{\b\t\1\2{\u00a0\3\2\2\2"+
		"|}\7\33\2\2}~\5\20\t\2~\177\7\34\2\2\177\u0080\b\t\1\2\u0080\u00a0\3\2"+
		"\2\2\u0081\u0082\7\25\2\2\u0082\u0089\b\t\1\2\u0083\u0084\5\n\6\2\u0084"+
		"\u0085\7\33\2\2\u0085\u0086\5\22\n\2\u0086\u0087\7\34\2\2\u0087\u0088"+
		"\b\t\1\2\u0088\u008a\3\2\2\2\u0089\u0083\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u00a0\3\2\2\2\u008b\u008c\7\23\2\2\u008c\u008d\5\n\6\2\u008d\u008e\7"+
		"\33\2\2\u008e\u008f\5\22\n\2\u008f\u0090\7\34\2\2\u0090\u0091\b\t\1\2"+
		"\u0091\u00a0\3\2\2\2\u0092\u0093\7\27\2\2\u0093\u0094\5\22\n\2\u0094\u0095"+
		"\7\30\2\2\u0095\u0096\b\t\1\2\u0096\u00a0\3\2\2\2\u0097\u0098\7\21\2\2"+
		"\u0098\u00a0\b\t\1\2\u0099\u009a\7\22\2\2\u009a\u00a0\b\t\1\2\u009b\u009c"+
		"\7\26\2\2\u009c\u00a0\b\t\1\2\u009d\u009e\7\3\2\2\u009e\u00a0\b\t\1\2"+
		"\u009fw\3\2\2\2\u009f|\3\2\2\2\u009f\u0081\3\2\2\2\u009f\u008b\3\2\2\2"+
		"\u009f\u0092\3\2\2\2\u009f\u0097\3\2\2\2\u009f\u0099\3\2\2\2\u009f\u009b"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00d7\3\2\2\2\u00a1\u00a2\6\t\3\3\u00a2"+
		"\u00a3\t\4\2\2\u00a3\u00a4\5\20\t\2\u00a4\u00a5\b\t\1\2\u00a5\u00d6\3"+
		"\2\2\2\u00a6\u00a7\6\t\4\3\u00a7\u00a8\t\5\2\2\u00a8\u00a9\5\20\t\2\u00a9"+
		"\u00aa\b\t\1\2\u00aa\u00d6\3\2\2\2\u00ab\u00ac\6\t\5\3\u00ac\u00ad\t\6"+
		"\2\2\u00ad\u00ae\5\20\t\2\u00ae\u00af\b\t\1\2\u00af\u00d6\3\2\2\2\u00b0"+
		"\u00b1\6\t\6\3\u00b1\u00b2\t\7\2\2\u00b2\u00b3\5\20\t\2\u00b3\u00b4\b"+
		"\t\1\2\u00b4\u00d6\3\2\2\2\u00b5\u00b6\6\t\7\3\u00b6\u00b7\t\b\2\2\u00b7"+
		"\u00b8\5\20\t\2\u00b8\u00b9\b\t\1\2\u00b9\u00d6\3\2\2\2\u00ba\u00bb\6"+
		"\t\b\3\u00bb\u00bc\7)\2\2\u00bc\u00bd\5\20\t\2\u00bd\u00be\b\t\1\2\u00be"+
		"\u00d6\3\2\2\2\u00bf\u00c0\6\t\t\3\u00c0\u00c1\7*\2\2\u00c1\u00c2\5\20"+
		"\t\2\u00c2\u00c3\b\t\1\2\u00c3\u00d6\3\2\2\2\u00c4\u00c5\6\t\n\3\u00c5"+
		"\u00c6\7,\2\2\u00c6\u00c7\5\20\t\2\u00c7\u00c8\b\t\1\2\u00c8\u00d6\3\2"+
		"\2\2\u00c9\u00ca\6\t\13\3\u00ca\u00cb\7+\2\2\u00cb\u00cc\7\25\2\2\u00cc"+
		"\u00cd\5\n\6\2\u00cd\u00ce\7\33\2\2\u00ce\u00cf\5\22\n\2\u00cf\u00d0\7"+
		"\34\2\2\u00d0\u00d1\b\t\1\2\u00d1\u00d6\3\2\2\2\u00d2\u00d3\6\t\f\3\u00d3"+
		"\u00d4\t\t\2\2\u00d4\u00d6\b\t\1\2\u00d5\u00a1\3\2\2\2\u00d5\u00a6\3\2"+
		"\2\2\u00d5\u00ab\3\2\2\2\u00d5\u00b0\3\2\2\2\u00d5\u00b5\3\2\2\2\u00d5"+
		"\u00ba\3\2\2\2\u00d5\u00bf\3\2\2\2\u00d5\u00c4\3\2\2\2\u00d5\u00c9\3\2"+
		"\2\2\u00d5\u00d2\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\21\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00e6\b\n\1"+
		"\2\u00db\u00dc\5\20\t\2\u00dc\u00e3\b\n\1\2\u00dd\u00de\7\35\2\2\u00de"+
		"\u00df\5\20\t\2\u00df\u00e0\b\n\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00dd\3"+
		"\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00db\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\23\3\2\2\2\u00e8\u00e9\7\37\2\2\u00e9\u00ea\5\26\f\2\u00ea"+
		"\u00eb\7 \2\2\u00eb\u00ec\b\13\1\2\u00ec\u0115\3\2\2\2\u00ed\u00ee\7\25"+
		"\2\2\u00ee\u00ef\7\67\2\2\u00ef\u00f0\5\20\t\2\u00f0\u00f1\7\36\2\2\u00f1"+
		"\u00f2\b\13\1\2\u00f2\u0115\3\2\2\2\u00f3\u00f4\7\4\2\2\u00f4\u00f5\7"+
		"\33\2\2\u00f5\u00f6\5\20\t\2\u00f6\u00f7\7\34\2\2\u00f7\u00f8\5\24\13"+
		"\2\u00f8\u00fd\b\13\1\2\u00f9\u00fa\7\5\2\2\u00fa\u00fb\5\24\13\2\u00fb"+
		"\u00fc\b\13\1\2\u00fc\u00fe\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fe\3"+
		"\2\2\2\u00fe\u0115\3\2\2\2\u00ff\u0100\7\6\2\2\u0100\u0101\7\33\2\2\u0101"+
		"\u0102\5\20\t\2\u0102\u0103\7\34\2\2\u0103\u0104\5\24\13\2\u0104\u0105"+
		"\b\13\1\2\u0105\u0115\3\2\2\2\u0106\u0107\7\7\2\2\u0107\u0108\7\33\2\2"+
		"\u0108\u0109\7\25\2\2\u0109\u010a\7\b\2\2\u010a\u010b\5\20\t\2\u010b\u010c"+
		"\7\34\2\2\u010c\u010d\5\24\13\2\u010d\u010e\b\13\1\2\u010e\u0115\3\2\2"+
		"\2\u010f\u0110\t\n\2\2\u0110\u0111\5\20\t\2\u0111\u0112\7\36\2\2\u0112"+
		"\u0113\b\13\1\2\u0113\u0115\3\2\2\2\u0114\u00e8\3\2\2\2\u0114\u00ed\3"+
		"\2\2\2\u0114\u00f3\3\2\2\2\u0114\u00ff\3\2\2\2\u0114\u0106\3\2\2\2\u0114"+
		"\u010f\3\2\2\2\u0115\25\3\2\2\2\u0116\u0121\b\f\1\2\u0117\u0118\5\24\13"+
		"\2\u0118\u011e\b\f\1\2\u0119\u011a\5\24\13\2\u011a\u011b\b\f\1\2\u011b"+
		"\u011d\3\2\2\2\u011c\u0119\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0121"+
		"\u0117\3\2\2\2\u0121\u0122\3\2\2\2\u0122\27\3\2\2\2\u0123\u0124\7\n\2"+
		"\2\u0124\u0125\7\23\2\2\u0125\u0126\5\6\4\2\u0126\u0138\b\r\1\2\u0127"+
		"\u0128\7\13\2\2\u0128\u0129\5\f\7\2\u0129\u012a\b\r\1\2\u012a\u0133\7"+
		"\37\2\2\u012b\u012c\7\f\2\2\u012c\u012d\5\4\3\2\u012d\u012e\5\16\b\2\u012e"+
		"\u012f\7\36\2\2\u012f\u0130\b\r\1\2\u0130\u0132\3\2\2\2\u0131\u012b\3"+
		"\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7 \2\2\u0137\u0139\3\2"+
		"\2\2\u0138\u0127\3\2\2\2\u0138\u0139\3\2\2\2\u0139\31\3\2\2\2\u013a\u013b"+
		"\7\r\2\2\u013b\u013c\5\2\2\2\u013c\u013d\5\6\4\2\u013d\u013e\5\b\5\2\u013e"+
		"\u0161\b\16\1\2\u013f\u0140\7\13\2\2\u0140\u0141\5\f\7\2\u0141\u0142\b"+
		"\16\1\2\u0142\u0148\7\37\2\2\u0143\u0144\5\24\13\2\u0144\u0145\b\16\1"+
		"\2\u0145\u0147\3\2\2\2\u0146\u0143\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0152\3\2\2\2\u014a\u0148\3\2\2\2\u014b"+
		"\u014c\7\16\2\2\u014c\u014d\7\33\2\2\u014d\u014e\5\22\n\2\u014e\u014f"+
		"\7\34\2\2\u014f\u0150\7\36\2\2\u0150\u0151\b\16\1\2\u0151\u0153\3\2\2"+
		"\2\u0152\u014b\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u015c\3\2\2\2\u0154\u0155"+
		"\7\f\2\2\u0155\u0156\5\4\3\2\u0156\u0157\5\16\b\2\u0157\u0158\5\24\13"+
		"\2\u0158\u0159\b\16\1\2\u0159\u015b\3\2\2\2\u015a\u0154\3\2\2\2\u015b"+
		"\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2"+
		"\2\2\u015e\u015c\3\2\2\2\u015f\u0160\7 \2\2\u0160\u0162\3\2\2\2\u0161"+
		"\u013f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\33\3\2\2\2\u0163\u0164\5\24\13"+
		"\2\u0164\u0169\b\17\1\2\u0165\u0166\5\26\f\2\u0166\u0167\5\34\17\2\u0167"+
		"\u0168\b\17\1\2\u0168\u016a\3\2\2\2\u0169\u0165\3\2\2\2\u0169\u016a\3"+
		"\2\2\2\u016a\u0187\3\2\2\2\u016b\u016c\7\f\2\2\u016c\u016d\5\4\3\2\u016d"+
		"\u016e\5\16\b\2\u016e\u016f\5\24\13\2\u016f\u0178\b\17\1\2\u0170\u0171"+
		"\7\f\2\2\u0171\u0172\5\4\3\2\u0172\u0173\5\16\b\2\u0173\u0174\5\24\13"+
		"\2\u0174\u0175\b\17\1\2\u0175\u0177\3\2\2\2\u0176\u0170\3\2\2\2\u0177"+
		"\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2"+
		"\2\2\u017a\u0178\3\2\2\2\u017b\u017c\5\34\17\2\u017c\u017d\b\17\1\2\u017d"+
		"\u0187\3\2\2\2\u017e\u017f\5\30\r\2\u017f\u0180\5\34\17\2\u0180\u0181"+
		"\b\17\1\2\u0181\u0187\3\2\2\2\u0182\u0183\5\32\16\2\u0183\u0184\5\34\17"+
		"\2\u0184\u0185\b\17\1\2\u0185\u0187\3\2\2\2\u0186\u0163\3\2\2\2\u0186"+
		"\u016b\3\2\2\2\u0186\u017e\3\2\2\2\u0186\u0182\3\2\2\2\u0187\35\3\2\2"+
		"\2\u0188\u0189\5\34\17\2\u0189\u018a\7\2\2\3\u018a\u018b\b\20\1\2\u018b"+
		"\37\3\2\2\2\37/\62\65EHVY\\en\u0089\u009f\u00d5\u00d7\u00e3\u00e6\u00fd"+
		"\u0114\u011e\u0121\u0133\u0138\u0148\u0152\u015c\u0161\u0169\u0178\u0186";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}