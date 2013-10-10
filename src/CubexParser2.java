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
		RULE_exprs = 8, RULE_stat = 9, RULE_stats = 10, RULE_funBody = 11, RULE_intf = 12, 
		RULE_cls = 13, RULE_program = 14, RULE_top = 15;
	public static final String[] ruleNames = {
		"vc", "vv", "kindcontext", "typecontext", "paratype", "type", "typescheme", 
		"expr", "exprs", "stat", "stats", "funBody", "intf", "cls", "program", 
		"top"
	};

	@Override
	public String getGrammarFileName() { return "CubexParser2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	  public CubexParser2 (TokenStream input){ 
	    super(input);
	    CuContext ctxt = new CuContext();
	    ctxt.init();
	  }


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
			setState(32); ((VcContext)_localctx).vvv = match(CLSINTF);
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
			setState(35); ((VvContext)_localctx).vvv = match(VAR);
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
			setState(53);
			_la = _input.LA(1);
			if (_la==LANGLE) {
				{
				setState(39); match(LANGLE);
				setState(50);
				_la = _input.LA(1);
				if (_la==TPARA) {
					{
					setState(40); ((KindcontextContext)_localctx).TPARA = match(TPARA);
					 _localctx.kc.add((((KindcontextContext)_localctx).TPARA!=null?((KindcontextContext)_localctx).TPARA.getText():null)); 
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(42); match(COMMA);
						setState(43); ((KindcontextContext)_localctx).TPARA = match(TPARA);
						 _localctx.kc.add((((KindcontextContext)_localctx).TPARA!=null?((KindcontextContext)_localctx).TPARA.getText():null)); 
						}
						}
						setState(49);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(52); match(RANGLE);
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
		public Map<String,CuType> tc;
		public Token VAR;
		public TypeContext t;
		public TerminalNode VAR(int i) {
			return getToken(CubexParser2.VAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CubexParser2.COMMA); }
		public List<TerminalNode> VAR() { return getTokens(CubexParser2.VAR); }
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
			((TypecontextContext)_localctx).tc =  new HashMap<String,CuType>(); 
			setState(56); match(LPAREN);
			setState(72);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(57); ((TypecontextContext)_localctx).VAR = match(VAR);
				setState(58); match(COLON);
				setState(59); ((TypecontextContext)_localctx).t = type(0);
				 _localctx.tc.put((((TypecontextContext)_localctx).VAR!=null?((TypecontextContext)_localctx).VAR.getText():null), ((TypecontextContext)_localctx).t.t); 
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(61); match(COMMA);
					setState(62); ((TypecontextContext)_localctx).VAR = match(VAR);
					setState(63); match(COLON);
					setState(64); ((TypecontextContext)_localctx).t = type(0);
					 _localctx.tc.put((((TypecontextContext)_localctx).VAR!=null?((TypecontextContext)_localctx).VAR.getText():null), ((TypecontextContext)_localctx).t.t); 
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(74); match(RPAREN);
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
			setState(92);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(77); match(LANGLE);
				setState(89);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THING) | (1L << NOTHING) | (1L << CLSINTF) | (1L << TPARA))) != 0)) {
					{
					setState(78); ((ParatypeContext)_localctx).t = type(0);
					_localctx.pt.add(((ParatypeContext)_localctx).t.t);
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(80); match(COMMA);
						setState(81); ((ParatypeContext)_localctx).t = type(0);
						_localctx.pt.add(((ParatypeContext)_localctx).t.t);
						}
						}
						setState(88);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(91); match(RANGLE);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			switch (_input.LA(1)) {
			case TPARA:
				{
				setState(95); ((TypeContext)_localctx).v = match(TPARA);
				((TypeContext)_localctx).t =  new VTypePara((((TypeContext)_localctx).v!=null?((TypeContext)_localctx).v.getText():null));
				}
				break;
			case THING:
				{
				setState(97); match(THING);
				((TypeContext)_localctx).t =  new Top();
				}
				break;
			case NOTHING:
				{
				setState(99); match(NOTHING);
				((TypeContext)_localctx).t =  new Bottom();
				}
				break;
			case CLSINTF:
				{
				setState(101); ((TypeContext)_localctx).CLSINTF = match(CLSINTF);
				setState(102); ((TypeContext)_localctx).p = paratype();
				((TypeContext)_localctx).t =  new VClass((((TypeContext)_localctx).CLSINTF!=null?((TypeContext)_localctx).CLSINTF.getText():null), ((TypeContext)_localctx).p.pt);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
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
					setState(107);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(108); match(AMPERSAND);
					setState(109); ((TypeContext)_localctx).r = type(2);
					((TypeContext)_localctx).t =  new VTypeInter(((TypeContext)_localctx).l.t); _localctx.t.add(((TypeContext)_localctx).r.t);
					}
					} 
				}
				setState(116);
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
			setState(117); ((TypeschemeContext)_localctx).kc = kindcontext();
			setState(118); ((TypeschemeContext)_localctx).tc = typecontext();
			setState(119); match(COLON);
			setState(120); ((TypeschemeContext)_localctx).t = type(0);
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
			setState(163);
			switch (_input.LA(1)) {
			case DASH:
			case BANG:
				{
				setState(124);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DASH || _la==BANG) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(125); ((ExprContext)_localctx).ex = expr(15);
				 ((ExprContext)_localctx).e =  (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == DASH ? new NegativeExpr(((ExprContext)_localctx).ex.e) : new NegateExpr(((ExprContext)_localctx).ex.e); 
				}
				break;
			case LPAREN:
				{
				setState(128); match(LPAREN);
				setState(129); ((ExprContext)_localctx).ex = expr(0);
				setState(130); match(RPAREN);
				((ExprContext)_localctx).e =  ((ExprContext)_localctx).ex.e;
				}
				break;
			case VAR:
				{
				setState(133); ((ExprContext)_localctx).VAR = match(VAR);
				((ExprContext)_localctx).e =  new VvExp((((ExprContext)_localctx).VAR!=null?((ExprContext)_localctx).VAR.getText():null));
				setState(141);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(135); ((ExprContext)_localctx).pt = paratype();
					setState(136); match(LPAREN);
					setState(137); ((ExprContext)_localctx).es = exprs();
					setState(138); match(RPAREN);
					_localctx.e.add(((ExprContext)_localctx).pt.pt, ((ExprContext)_localctx).es.cu);
					}
					break;
				}
				}
				break;
			case CLSINTF:
				{
				setState(143); ((ExprContext)_localctx).CLSINTF = match(CLSINTF);
				setState(144); ((ExprContext)_localctx).pt = paratype();
				setState(145); match(LPAREN);
				setState(146); ((ExprContext)_localctx).es = exprs();
				setState(147); match(RPAREN);
				((ExprContext)_localctx).e =  new VcExp((((ExprContext)_localctx).CLSINTF!=null?((ExprContext)_localctx).CLSINTF.getText():null), ((ExprContext)_localctx).pt.pt, ((ExprContext)_localctx).es.cu);
				}
				break;
			case LBRACKET:
				{
				setState(150); match(LBRACKET);
				setState(151); ((ExprContext)_localctx).es = exprs();
				setState(152); match(RBRACKET);
				((ExprContext)_localctx).e =  new BrkExpr(((ExprContext)_localctx).es.cu);
				}
				break;
			case TRUE:
				{
				setState(155); match(TRUE);
				((ExprContext)_localctx).e =  new CBoolean(true);
				}
				break;
			case FALSE:
				{
				setState(157); match(FALSE);
				((ExprContext)_localctx).e =  new CBoolean(false);
				}
				break;
			case INTEGER:
				{
				setState(159); ((ExprContext)_localctx).INTEGER = match(INTEGER);
				((ExprContext)_localctx).e =  new CInteger((((ExprContext)_localctx).INTEGER!=null?Integer.valueOf(((ExprContext)_localctx).INTEGER.getText()):0));
				}
				break;
			case STRING:
				{
				setState(161); ((ExprContext)_localctx).STRING = match(STRING);
				((ExprContext)_localctx).e =  new CString((((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(217);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(166);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << SLASH) | (1L << PERCENT))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(167); ((ExprContext)_localctx).r = expr(15);
						 ((ExprContext)_localctx).e =  (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == STAR ? new TimesExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e)
						                                    : (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == SLASH ? new DivideExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e)
						                                                        : new ModuloExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e); 
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(171);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==DASH) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(172); ((ExprContext)_localctx).r = expr(14);
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
						setState(175);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(176);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THR) | (1L << LTHR) | (1L << RTHR) | (1L << LRTHR))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(177); ((ExprContext)_localctx).r = expr(13);
						((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == THR) ? new ThroughExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, true, true) 
						                                      : ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == LTHR) 
						                                            ? new ThroughExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, false, true) 
						                                            : ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == RTHR) 
						                                                ? new ThroughExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, true, false)
						                                                : new ThroughExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, false, false);
						}
						break;

					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(181);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANGLE) | (1L << RANGLE) | (1L << LTE) | (1L << GTE))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(182); ((ExprContext)_localctx).r = expr(11);
						((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == LANGLE) 
						                  ? new LessThanExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, true) 
						                  : ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == LTE) 
						                      ? new LessThanExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, false) 
						                      : ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == RANGLE) 
						                          ? new GreaterThanExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, true)
						                          : new GreaterThanExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, false);
						}
						break;

					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(186);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQEQUAL || _la==INEQUAL) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(187); ((ExprContext)_localctx).r = expr(10);
						((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == EQEQUAL) 
						                 ? new EqualExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, true) 
						                 : new EqualExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, false);
						}
						break;

					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(191); match(AMPERSAND);
						setState(192); ((ExprContext)_localctx).r = expr(9);
						 ((ExprContext)_localctx).e =  new AndExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e); 
						}
						break;

					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(196); match(PIPE);
						setState(197); ((ExprContext)_localctx).r = expr(8);
						 ((ExprContext)_localctx).e =  new OrExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e); 
						}
						break;

					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(201); match(APPEND);
						setState(202); ((ExprContext)_localctx).r = expr(6);
						((ExprContext)_localctx).e =  new AppExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e);
						}
						break;

					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.ex = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(205);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(206); match(DOT);
						setState(207); ((ExprContext)_localctx).VAR = match(VAR);
						setState(208); ((ExprContext)_localctx).pt = paratype();
						setState(209); match(LPAREN);
						setState(210); ((ExprContext)_localctx).es = exprs();
						setState(211); match(RPAREN);
						((ExprContext)_localctx).e =  new VarExpr(((ExprContext)_localctx).ex.e, (((ExprContext)_localctx).VAR!=null?((ExprContext)_localctx).VAR.getText():null), ((ExprContext)_localctx).pt.pt, ((ExprContext)_localctx).es.cu);
						}
						break;

					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.ex = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(214);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(215);
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
				setState(221);
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
			setState(234);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << CLSINTF) | (1L << VAR) | (1L << INTEGER) | (1L << LBRACKET) | (1L << LPAREN) | (1L << DASH) | (1L << BANG))) != 0)) {
				{
				setState(223); ((ExprsContext)_localctx).e = expr(0);
				_localctx.cu.add(((ExprsContext)_localctx).e.e);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(225); match(COMMA);
					setState(226); ((ExprsContext)_localctx).e = expr(0);
					_localctx.cu.add(((ExprsContext)_localctx).e.e);
					}
					}
					setState(233);
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
		public VvContext v;
		public ExprContext e;
		public StatContext l;
		public StatContext r;
		public StatContext st;
		public TerminalNode LBRACE() { return getToken(CubexParser2.LBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CubexParser2.SEMICOLON, 0); }
		public VvContext vv() {
			return getRuleContext(VvContext.class,0);
		}
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
			setState(280);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(236); match(LBRACE);
				setState(237); ((StatContext)_localctx).ss = stats();
				setState(238); match(RBRACE);
				((StatContext)_localctx).s =  new Stats(((StatContext)_localctx).ss.cu);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(241); ((StatContext)_localctx).v = vv();
				setState(242); match(ASSIGN);
				setState(243); ((StatContext)_localctx).e = expr(0);
				setState(244); match(SEMICOLON);
				((StatContext)_localctx).s =  new AssignStat(((StatContext)_localctx).v.v, ((StatContext)_localctx).e.e);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(247); match(IF);
				setState(248); match(LPAREN);
				setState(249); ((StatContext)_localctx).e = expr(0);
				setState(250); match(RPAREN);
				setState(251); ((StatContext)_localctx).l = stat();
				((StatContext)_localctx).s =  new IfStat(((StatContext)_localctx).e.e, ((StatContext)_localctx).l.s);
				setState(257);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(253); match(ELSE);
					setState(254); ((StatContext)_localctx).r = stat();
					_localctx.s.add(((StatContext)_localctx).r.s);
					}
					break;
				}
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(259); match(WHILE);
				setState(260); match(LPAREN);
				setState(261); ((StatContext)_localctx).e = expr(0);
				setState(262); match(RPAREN);
				setState(263); ((StatContext)_localctx).st = stat();
				((StatContext)_localctx).s =  new WhileStat(((StatContext)_localctx).e.e, ((StatContext)_localctx).st.s);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(266); match(FOR);
				setState(267); match(LPAREN);
				setState(268); ((StatContext)_localctx).v = vv();
				setState(269); match(IN);
				setState(270); ((StatContext)_localctx).e = expr(0);
				setState(271); match(RPAREN);
				setState(272); ((StatContext)_localctx).st = stat();
				((StatContext)_localctx).s =  new ForStat(((StatContext)_localctx).v.v, ((StatContext)_localctx).e.e, ((StatContext)_localctx).st.s);
				}
				break;
			case RETURN:
			case EQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(275);
				_la = _input.LA(1);
				if ( !(_la==RETURN || _la==EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(276); ((StatContext)_localctx).e = expr(0);
				setState(277); match(SEMICOLON);
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
			setState(293);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(283); ((StatsContext)_localctx).s = stat();
				_localctx.cu.add(((StatsContext)_localctx).s.s);
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(285); ((StatsContext)_localctx).s = stat();
						_localctx.cu.add(((StatsContext)_localctx).s.s);
						}
						} 
					}
					setState(292);
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

	public static class FunBodyContext extends ParserRuleContext {
		public CuStat body;
		public StatContext s;
		public TerminalNode SEMICOLON() { return getToken(CubexParser2.SEMICOLON, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public FunBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funBody; }
	}

	public final FunBodyContext funBody() throws RecognitionException {
		FunBodyContext _localctx = new FunBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funBody);
		try {
			setState(300);
			switch (_input.LA(1)) {
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(295); match(SEMICOLON);
				((FunBodyContext)_localctx).body = new EmptyBody();
				}
				break;
			case IF:
			case WHILE:
			case FOR:
			case RETURN:
			case VAR:
			case EQUAL:
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(297); ((FunBodyContext)_localctx).s = stat();
				((FunBodyContext)_localctx).body = ((FunBodyContext)_localctx).s.s;
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

	public static class IntfContext extends ParserRuleContext {
		public CuClass c;
		public Token CLSINTF;
		public KindcontextContext p;
		public TypeContext t;
		public VvContext v;
		public TypeschemeContext ts;
		public FunBodyContext f;
		public TerminalNode LBRACE() { return getToken(CubexParser2.LBRACE, 0); }
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
		public List<FunBodyContext> funBody() {
			return getRuleContexts(FunBodyContext.class);
		}
		public FunBodyContext funBody(int i) {
			return getRuleContext(FunBodyContext.class,i);
		}
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
		enterRule(_localctx, 24, RULE_intf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302); match(INTERFACE);
			setState(303); ((IntfContext)_localctx).CLSINTF = match(CLSINTF);
			setState(304); ((IntfContext)_localctx).p = kindcontext();
			((IntfContext)_localctx).c =  new Intf((((IntfContext)_localctx).CLSINTF!=null?((IntfContext)_localctx).CLSINTF.getText():null), ((IntfContext)_localctx).p.kc); classList.add(_localctx.c);
			setState(323);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(306); match(EXTENDS);
				setState(307); ((IntfContext)_localctx).t = type(0);
				_localctx.c.add(((IntfContext)_localctx).t.t);
				setState(309); match(LBRACE);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUN) {
					{
					{
					setState(310); match(FUN);
					setState(311); ((IntfContext)_localctx).v = vv();
					setState(312); ((IntfContext)_localctx).ts = typescheme();
					setState(313); ((IntfContext)_localctx).f = funBody();
					_localctx.c.add(((IntfContext)_localctx).v.v, ((IntfContext)_localctx).ts.ts, ((IntfContext)_localctx).f.body); 
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(321); match(RBRACE);
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
		public FunBodyContext f;
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
		public List<FunBodyContext> funBody() {
			return getRuleContexts(FunBodyContext.class);
		}
		public TerminalNode CLASS() { return getToken(CubexParser2.CLASS, 0); }
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public FunBodyContext funBody(int i) {
			return getRuleContext(FunBodyContext.class,i);
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
		enterRule(_localctx, 26, RULE_cls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); match(CLASS);
			setState(326); ((ClsContext)_localctx).v = vc();
			setState(327); ((ClsContext)_localctx).pk = kindcontext();
			setState(328); ((ClsContext)_localctx).pt = typecontext();
			((ClsContext)_localctx).c =  new Cls(((ClsContext)_localctx).v.v, ((ClsContext)_localctx).pk.kc, ((ClsContext)_localctx).pt.tc); classList.add(_localctx.c);
			setState(364);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(330); match(EXTENDS);
				setState(331); ((ClsContext)_localctx).t = type(0);
				_localctx.c.add(((ClsContext)_localctx).t.t);
				setState(333); match(LBRACE);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << VAR) | (1L << EQUAL) | (1L << LBRACE))) != 0)) {
					{
					{
					setState(334); ((ClsContext)_localctx).s = stat();
					_localctx.c.add(((ClsContext)_localctx).s.s);
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(349);
				_la = _input.LA(1);
				if (_la==SUPER) {
					{
					setState(342); match(SUPER);
					setState(343); match(LPAREN);
					setState(344); ((ClsContext)_localctx).es = exprs();
					setState(345); match(RPAREN);
					setState(346); match(SEMICOLON);
					_localctx.c.add(((ClsContext)_localctx).es.cu);
					}
				}

				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUN) {
					{
					{
					setState(351); match(FUN);
					setState(352); ((ClsContext)_localctx).vs = vv();
					setState(353); ((ClsContext)_localctx).ts = typescheme();
					setState(354); ((ClsContext)_localctx).f = funBody();
					_localctx.c.add(((ClsContext)_localctx).vs.v, ((ClsContext)_localctx).ts.ts, ((ClsContext)_localctx).f.body); 
					}
					}
					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(362); match(RBRACE);
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
		public TypeschemeContext tss;
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
		enterRule(_localctx, 28, RULE_program);
		int _la;
		try {
			int _alt;
			setState(401);
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
				setState(366); ((ProgramContext)_localctx).s = stat();
				((ProgramContext)_localctx).p =  new StatPrg(((ProgramContext)_localctx).s.s);
				setState(372);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << INTERFACE) | (1L << FUN) | (1L << CLASS) | (1L << VAR) | (1L << EQUAL) | (1L << LBRACE))) != 0)) {
					{
					setState(368); ((ProgramContext)_localctx).ss = stats();
					setState(369); ((ProgramContext)_localctx).pr = program();
					_localctx.p.add(((ProgramContext)_localctx).ss.cu, ((ProgramContext)_localctx).pr.p);
					}
				}

				}
				break;
			case FUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(374); match(FUN);
				setState(375); ((ProgramContext)_localctx).v = vv();
				setState(376); ((ProgramContext)_localctx).ts = typescheme();
				setState(377); ((ProgramContext)_localctx).s = stat();
				((ProgramContext)_localctx).p =  new FunPrg(((ProgramContext)_localctx).v.v, ((ProgramContext)_localctx).ts.ts, ((ProgramContext)_localctx).s.s); 
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(379); match(FUN);
						setState(380); ((ProgramContext)_localctx).vs = vv();
						setState(381); ((ProgramContext)_localctx).tss = typescheme();
						setState(382); ((ProgramContext)_localctx).ss = stat();
						_localctx.p.add(((ProgramContext)_localctx).vs.v, ((ProgramContext)_localctx).tss.ts, ((ProgramContext)_localctx).ss.s); 
						}
						} 
					}
					setState(389);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(390); ((ProgramContext)_localctx).pr = program();
				_localctx.p.add(((ProgramContext)_localctx).pr.p);
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(393); ((ProgramContext)_localctx).i = intf();
				setState(394); ((ProgramContext)_localctx).pr = program();
				((ProgramContext)_localctx).p =  new ClassPrg(((ProgramContext)_localctx).i.c, ((ProgramContext)_localctx).pr.p);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 4);
				{
				setState(397); ((ProgramContext)_localctx).c = cls();
				setState(398); ((ProgramContext)_localctx).pr = program();
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
		enterRule(_localctx, 30, RULE_top);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403); program();
			setState(404); match(EOF);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3;\u0199\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13\4"+
		"\5\4\65\n\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5F\n\5\f\5\16\5I\13\5\5\5K\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\5\6\\\n\6\3\6\5\6_\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7l\n\7\3\7\3\7\3\7\3\7\3\7\7\7s\n\7\f\7"+
		"\16\7v\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0090\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a6"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\7\t\u00dc\n\t\f\t\16\t\u00df\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00e8"+
		"\n\n\f\n\16\n\u00eb\13\n\5\n\u00ed\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0104\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u011b\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0123\n\f\f\f\16\f\u0126\13\f\5\f\u0128\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\5\r\u012f\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u013f\n\16\f\16\16\16\u0142\13"+
		"\16\3\16\3\16\5\16\u0146\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u0154\n\17\f\17\16\17\u0157\13\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0160\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u0168\n\17\f\17\16\17\u016b\13\17\3\17\3\17\5\17\u016f\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0177\n\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u0184\n\20\f\20\16\20\u0187\13\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0194\n\20\3\21"+
		"\3\21\3\21\3\21\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\n\4\2%"+
		"%((\3\2!#\3\2$%\3\2-\60\4\2&\'\63\64\3\2\65\66\3\2\61\62\4\2\t\t\32\32"+
		"\u01bd\2\"\3\2\2\2\4%\3\2\2\2\6(\3\2\2\2\b9\3\2\2\2\nN\3\2\2\2\fk\3\2"+
		"\2\2\16w\3\2\2\2\20\u00a5\3\2\2\2\22\u00e0\3\2\2\2\24\u011a\3\2\2\2\26"+
		"\u011c\3\2\2\2\30\u012e\3\2\2\2\32\u0130\3\2\2\2\34\u0147\3\2\2\2\36\u0193"+
		"\3\2\2\2 \u0195\3\2\2\2\"#\7\23\2\2#$\b\2\1\2$\3\3\2\2\2%&\7\25\2\2&\'"+
		"\b\3\1\2\'\5\3\2\2\2(\67\b\4\1\2)\64\7&\2\2*+\7\24\2\2+\61\b\4\1\2,-\7"+
		"\35\2\2-.\7\24\2\2.\60\b\4\1\2/,\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61"+
		"\62\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\64*\3\2\2\2\64\65\3\2\2\2\65\66"+
		"\3\2\2\2\668\7\'\2\2\67)\3\2\2\2\678\3\2\2\28\7\3\2\2\29:\b\5\1\2:J\7"+
		"\33\2\2;<\7\25\2\2<=\7\31\2\2=>\5\f\7\2>G\b\5\1\2?@\7\35\2\2@A\7\25\2"+
		"\2AB\7\31\2\2BC\5\f\7\2CD\b\5\1\2DF\3\2\2\2E?\3\2\2\2FI\3\2\2\2GE\3\2"+
		"\2\2GH\3\2\2\2HK\3\2\2\2IG\3\2\2\2J;\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\34"+
		"\2\2M\t\3\2\2\2N^\b\6\1\2O[\7&\2\2PQ\5\f\7\2QX\b\6\1\2RS\7\35\2\2ST\5"+
		"\f\7\2TU\b\6\1\2UW\3\2\2\2VR\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\"+
		"\3\2\2\2ZX\3\2\2\2[P\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]_\7\'\2\2^O\3\2\2\2"+
		"^_\3\2\2\2_\13\3\2\2\2`a\b\7\1\2ab\7\24\2\2bl\b\7\1\2cd\7\17\2\2dl\b\7"+
		"\1\2ef\7\20\2\2fl\b\7\1\2gh\7\23\2\2hi\5\n\6\2ij\b\7\1\2jl\3\2\2\2k`\3"+
		"\2\2\2kc\3\2\2\2ke\3\2\2\2kg\3\2\2\2lt\3\2\2\2mn\6\7\2\3no\7)\2\2op\5"+
		"\f\7\2pq\b\7\1\2qs\3\2\2\2rm\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\r"+
		"\3\2\2\2vt\3\2\2\2wx\5\6\4\2xy\5\b\5\2yz\7\31\2\2z{\5\f\7\2{|\b\b\1\2"+
		"|\17\3\2\2\2}~\b\t\1\2~\177\t\2\2\2\177\u0080\5\20\t\2\u0080\u0081\b\t"+
		"\1\2\u0081\u00a6\3\2\2\2\u0082\u0083\7\33\2\2\u0083\u0084\5\20\t\2\u0084"+
		"\u0085\7\34\2\2\u0085\u0086\b\t\1\2\u0086\u00a6\3\2\2\2\u0087\u0088\7"+
		"\25\2\2\u0088\u008f\b\t\1\2\u0089\u008a\5\n\6\2\u008a\u008b\7\33\2\2\u008b"+
		"\u008c\5\22\n\2\u008c\u008d\7\34\2\2\u008d\u008e\b\t\1\2\u008e\u0090\3"+
		"\2\2\2\u008f\u0089\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u00a6\3\2\2\2\u0091"+
		"\u0092\7\23\2\2\u0092\u0093\5\n\6\2\u0093\u0094\7\33\2\2\u0094\u0095\5"+
		"\22\n\2\u0095\u0096\7\34\2\2\u0096\u0097\b\t\1\2\u0097\u00a6\3\2\2\2\u0098"+
		"\u0099\7\27\2\2\u0099\u009a\5\22\n\2\u009a\u009b\7\30\2\2\u009b\u009c"+
		"\b\t\1\2\u009c\u00a6\3\2\2\2\u009d\u009e\7\21\2\2\u009e\u00a6\b\t\1\2"+
		"\u009f\u00a0\7\22\2\2\u00a0\u00a6\b\t\1\2\u00a1\u00a2\7\26\2\2\u00a2\u00a6"+
		"\b\t\1\2\u00a3\u00a4\7\3\2\2\u00a4\u00a6\b\t\1\2\u00a5}\3\2\2\2\u00a5"+
		"\u0082\3\2\2\2\u00a5\u0087\3\2\2\2\u00a5\u0091\3\2\2\2\u00a5\u0098\3\2"+
		"\2\2\u00a5\u009d\3\2\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00dd\3\2\2\2\u00a7\u00a8\6\t\3\3\u00a8\u00a9\t\3"+
		"\2\2\u00a9\u00aa\5\20\t\2\u00aa\u00ab\b\t\1\2\u00ab\u00dc\3\2\2\2\u00ac"+
		"\u00ad\6\t\4\3\u00ad\u00ae\t\4\2\2\u00ae\u00af\5\20\t\2\u00af\u00b0\b"+
		"\t\1\2\u00b0\u00dc\3\2\2\2\u00b1\u00b2\6\t\5\3\u00b2\u00b3\t\5\2\2\u00b3"+
		"\u00b4\5\20\t\2\u00b4\u00b5\b\t\1\2\u00b5\u00dc\3\2\2\2\u00b6\u00b7\6"+
		"\t\6\3\u00b7\u00b8\t\6\2\2\u00b8\u00b9\5\20\t\2\u00b9\u00ba\b\t\1\2\u00ba"+
		"\u00dc\3\2\2\2\u00bb\u00bc\6\t\7\3\u00bc\u00bd\t\7\2\2\u00bd\u00be\5\20"+
		"\t\2\u00be\u00bf\b\t\1\2\u00bf\u00dc\3\2\2\2\u00c0\u00c1\6\t\b\3\u00c1"+
		"\u00c2\7)\2\2\u00c2\u00c3\5\20\t\2\u00c3\u00c4\b\t\1\2\u00c4\u00dc\3\2"+
		"\2\2\u00c5\u00c6\6\t\t\3\u00c6\u00c7\7*\2\2\u00c7\u00c8\5\20\t\2\u00c8"+
		"\u00c9\b\t\1\2\u00c9\u00dc\3\2\2\2\u00ca\u00cb\6\t\n\3\u00cb\u00cc\7,"+
		"\2\2\u00cc\u00cd\5\20\t\2\u00cd\u00ce\b\t\1\2\u00ce\u00dc\3\2\2\2\u00cf"+
		"\u00d0\6\t\13\3\u00d0\u00d1\7+\2\2\u00d1\u00d2\7\25\2\2\u00d2\u00d3\5"+
		"\n\6\2\u00d3\u00d4\7\33\2\2\u00d4\u00d5\5\22\n\2\u00d5\u00d6\7\34\2\2"+
		"\u00d6\u00d7\b\t\1\2\u00d7\u00dc\3\2\2\2\u00d8\u00d9\6\t\f\3\u00d9\u00da"+
		"\t\b\2\2\u00da\u00dc\b\t\1\2\u00db\u00a7\3\2\2\2\u00db\u00ac\3\2\2\2\u00db"+
		"\u00b1\3\2\2\2\u00db\u00b6\3\2\2\2\u00db\u00bb\3\2\2\2\u00db\u00c0\3\2"+
		"\2\2\u00db\u00c5\3\2\2\2\u00db\u00ca\3\2\2\2\u00db\u00cf\3\2\2\2\u00db"+
		"\u00d8\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\21\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00ec\b\n\1\2\u00e1\u00e2"+
		"\5\20\t\2\u00e2\u00e9\b\n\1\2\u00e3\u00e4\7\35\2\2\u00e4\u00e5\5\20\t"+
		"\2\u00e5\u00e6\b\n\1\2\u00e6\u00e8\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e8\u00eb"+
		"\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00e1\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\23\3\2\2"+
		"\2\u00ee\u00ef\7\37\2\2\u00ef\u00f0\5\26\f\2\u00f0\u00f1\7 \2\2\u00f1"+
		"\u00f2\b\13\1\2\u00f2\u011b\3\2\2\2\u00f3\u00f4\5\4\3\2\u00f4\u00f5\7"+
		"\67\2\2\u00f5\u00f6\5\20\t\2\u00f6\u00f7\7\36\2\2\u00f7\u00f8\b\13\1\2"+
		"\u00f8\u011b\3\2\2\2\u00f9\u00fa\7\4\2\2\u00fa\u00fb\7\33\2\2\u00fb\u00fc"+
		"\5\20\t\2\u00fc\u00fd\7\34\2\2\u00fd\u00fe\5\24\13\2\u00fe\u0103\b\13"+
		"\1\2\u00ff\u0100\7\5\2\2\u0100\u0101\5\24\13\2\u0101\u0102\b\13\1\2\u0102"+
		"\u0104\3\2\2\2\u0103\u00ff\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u011b\3\2"+
		"\2\2\u0105\u0106\7\6\2\2\u0106\u0107\7\33\2\2\u0107\u0108\5\20\t\2\u0108"+
		"\u0109\7\34\2\2\u0109\u010a\5\24\13\2\u010a\u010b\b\13\1\2\u010b\u011b"+
		"\3\2\2\2\u010c\u010d\7\7\2\2\u010d\u010e\7\33\2\2\u010e\u010f\5\4\3\2"+
		"\u010f\u0110\7\b\2\2\u0110\u0111\5\20\t\2\u0111\u0112\7\34\2\2\u0112\u0113"+
		"\5\24\13\2\u0113\u0114\b\13\1\2\u0114\u011b\3\2\2\2\u0115\u0116\t\t\2"+
		"\2\u0116\u0117\5\20\t\2\u0117\u0118\7\36\2\2\u0118\u0119\b\13\1\2\u0119"+
		"\u011b\3\2\2\2\u011a\u00ee\3\2\2\2\u011a\u00f3\3\2\2\2\u011a\u00f9\3\2"+
		"\2\2\u011a\u0105\3\2\2\2\u011a\u010c\3\2\2\2\u011a\u0115\3\2\2\2\u011b"+
		"\25\3\2\2\2\u011c\u0127\b\f\1\2\u011d\u011e\5\24\13\2\u011e\u0124\b\f"+
		"\1\2\u011f\u0120\5\24\13\2\u0120\u0121\b\f\1\2\u0121\u0123\3\2\2\2\u0122"+
		"\u011f\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u011d\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\27\3\2\2\2\u0129\u012a\7\36\2\2\u012a\u012f\b\r\1"+
		"\2\u012b\u012c\5\24\13\2\u012c\u012d\b\r\1\2\u012d\u012f\3\2\2\2\u012e"+
		"\u0129\3\2\2\2\u012e\u012b\3\2\2\2\u012f\31\3\2\2\2\u0130\u0131\7\n\2"+
		"\2\u0131\u0132\7\23\2\2\u0132\u0133\5\6\4\2\u0133\u0145\b\16\1\2\u0134"+
		"\u0135\7\13\2\2\u0135\u0136\5\f\7\2\u0136\u0137\b\16\1\2\u0137\u0140\7"+
		"\37\2\2\u0138\u0139\7\f\2\2\u0139\u013a\5\4\3\2\u013a\u013b\5\16\b\2\u013b"+
		"\u013c\5\30\r\2\u013c\u013d\b\16\1\2\u013d\u013f\3\2\2\2\u013e\u0138\3"+
		"\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7 \2\2\u0144\u0146\3\2"+
		"\2\2\u0145\u0134\3\2\2\2\u0145\u0146\3\2\2\2\u0146\33\3\2\2\2\u0147\u0148"+
		"\7\r\2\2\u0148\u0149\5\2\2\2\u0149\u014a\5\6\4\2\u014a\u014b\5\b\5\2\u014b"+
		"\u016e\b\17\1\2\u014c\u014d\7\13\2\2\u014d\u014e\5\f\7\2\u014e\u014f\b"+
		"\17\1\2\u014f\u0155\7\37\2\2\u0150\u0151\5\24\13\2\u0151\u0152\b\17\1"+
		"\2\u0152\u0154\3\2\2\2\u0153\u0150\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u015f\3\2\2\2\u0157\u0155\3\2\2\2\u0158"+
		"\u0159\7\16\2\2\u0159\u015a\7\33\2\2\u015a\u015b\5\22\n\2\u015b\u015c"+
		"\7\34\2\2\u015c\u015d\7\36\2\2\u015d\u015e\b\17\1\2\u015e\u0160\3\2\2"+
		"\2\u015f\u0158\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0169\3\2\2\2\u0161\u0162"+
		"\7\f\2\2\u0162\u0163\5\4\3\2\u0163\u0164\5\16\b\2\u0164\u0165\5\30\r\2"+
		"\u0165\u0166\b\17\1\2\u0166\u0168\3\2\2\2\u0167\u0161\3\2\2\2\u0168\u016b"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016c\u016d\7 \2\2\u016d\u016f\3\2\2\2\u016e\u014c\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\35\3\2\2\2\u0170\u0171\5\24\13\2\u0171"+
		"\u0176\b\20\1\2\u0172\u0173\5\26\f\2\u0173\u0174\5\36\20\2\u0174\u0175"+
		"\b\20\1\2\u0175\u0177\3\2\2\2\u0176\u0172\3\2\2\2\u0176\u0177\3\2\2\2"+
		"\u0177\u0194\3\2\2\2\u0178\u0179\7\f\2\2\u0179\u017a\5\4\3\2\u017a\u017b"+
		"\5\16\b\2\u017b\u017c\5\24\13\2\u017c\u0185\b\20\1\2\u017d\u017e\7\f\2"+
		"\2\u017e\u017f\5\4\3\2\u017f\u0180\5\16\b\2\u0180\u0181\5\24\13\2\u0181"+
		"\u0182\b\20\1\2\u0182\u0184\3\2\2\2\u0183\u017d\3\2\2\2\u0184\u0187\3"+
		"\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0188\u0189\5\36\20\2\u0189\u018a\b\20\1\2\u018a\u0194"+
		"\3\2\2\2\u018b\u018c\5\32\16\2\u018c\u018d\5\36\20\2\u018d\u018e\b\20"+
		"\1\2\u018e\u0194\3\2\2\2\u018f\u0190\5\34\17\2\u0190\u0191\5\36\20\2\u0191"+
		"\u0192\b\20\1\2\u0192\u0194\3\2\2\2\u0193\u0170\3\2\2\2\u0193\u0178\3"+
		"\2\2\2\u0193\u018b\3\2\2\2\u0193\u018f\3\2\2\2\u0194\37\3\2\2\2\u0195"+
		"\u0196\5\36\20\2\u0196\u0197\7\2\2\3\u0197!\3\2\2\2 \61\64\67GJX[^kt\u008f"+
		"\u00a5\u00db\u00dd\u00e9\u00ec\u0103\u011a\u0124\u0127\u012e\u0140\u0145"+
		"\u0155\u015f\u0169\u016e\u0176\u0185\u0193";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}