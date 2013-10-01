parser grammar CubexParser2;

options { tokenVocab = CubexLexer2; }


vc returns [CuVvc v]
	: vvv = CLSINTF {$v = new Vc($vvv.text);};
	
vv returns [CuVvc v]
	: vvv = VAR {$v = new Vv($vvv.text);};

vvc returns [CuVvc v]

	: vvv = (CLSINTF | VAR) {$v = new Vvc($vvv.text);};



kindcontext returns [List<String> kc]

	: {$kc = new ArrayList<String>();} (LANGLE (TPARA { $kc.add($TPARA.text); } (COMMA TPARA { $kc.add($TPARA.text); })*)? RANGLE)?;

vvt returns [CuVvt cu]

	: VAR COLON t=type { $cu = new Vvt($VAR.text, $t.t); };

typecontext returns [List<CuVvt> tc]

	: { $tc = new ArrayList<CuVvt>(); } LPAREN (v=vvt { $tc.add($v.cu); } (COMMA v=vvt { $tc.add($v.cu); })*)? RPAREN;



paratype returns [List<CuType> pt]

	: {$pt = new ArrayList<CuType>(); } (LANGLE (t=type {$pt.add($t.t);} (COMMA t=type {$pt.add($t.t);})*)? RANGLE)?;	

type returns [CuType t]

	: v = (TPARA | THING | NOTHING) {$t = $v.type== TPARA ? new VTypePara($v.text) : new VTopBot($v.text);}

	| CLSINTF p=paratype {$t = new VClass($CLSINTF.text, $p.pt);}

	| l=type AMPERSAND r=type {$t = new VTypeInter($l.t, $r.t);};

typescheme returns [CuTypeScheme ts]

	: kc=kindcontext tc=typecontext COLON t=type {$ts = new TypeScheme($kc.kc, $tc.tc, $t.t);};

expr returns [CuExpr e]

	: LPAREN ex=expr RPAREN {$e = $ex.e;}

	| VAR {$e = new VvExp($VAR.text);} (pt=paratype LPAREN es=exprs RPAREN {$e.add($pt.pt, $es.cu);})?

	| CLSINTF pt=paratype LPAREN es=exprs RPAREN {$e = new VcExp($CLSINTF.text, $pt.pt, $es.cu);}

	| ex=expr DOT VAR pt=paratype LPAREN es=exprs RPAREN {$e = new VarExpr($ex.e, $VAR.text, $pt.pt, $es.cu);} 

     | op=(DASH | BANG) ex=expr

       { $e = $op.type == DASH ? new NegativeExpr($ex.e) : new NegateExpr($ex.e); }

     | l=expr op=(STAR | SLASH | PERCENT) r=expr

       { $e = $op.type == STAR

               ? new TimesExpr($l.e, $r.e)

               : $op.type == SLASH

               ? new DivideExpr($l.e, $r.e)

               : new ModuloExpr($l.e, $r.e); }

     | l=expr op=(PLUS | DASH) r=expr

       { $e = ($op.type == PLUS)

             ? new PlusExpr($l.e, $r.e)

             : new MinusExpr($l.e, $r.e); }

	| l=expr op=(THR | LTHR | RTHR | LRTHR) r=expr

		{$e = ($op.type == THR) ? new ThroughExpr($l.e, $r.e, true, true) : ($op.type == LTHR) ? new ThroughExpr($l.e, $r.e, false, true) : ($op.type == RTHR) ? new ThroughExpr($l.e, $r.e, true, false) : new ThroughExpr($l.e, $r.e, false, false);}

	| ex=expr op=(ONW | LONW) 

		{$e = ($op.type == ONW) ? new OnwardsExpr($ex.e, true) : new OnwardsExpr($ex.e, false);}

	| l=expr op=(LANGLE | LTE | RANGLE | GTE) r=expr

		{$e = ($op.type == LANGLE) ? new LessThanExpr($l.e, $r.e, true) : ($op.type == LTE) ? new LessThanExpr($l.e, $r.e, false) : ($op.type == RANGLE) ? new GreaterThanExpr($l.e, $r.e, true) : new GreaterThanExpr($l.e, $r.e, false);}

	| l=expr op=(EQEQUAL | INEQUAL) r=expr

		{$e = ($op.type == EQEQUAL) ? new EqualExpr($l.e, $r.e, true) : new EqualExpr($l.e, $r.e, false);}

	

    | l=expr AMPERSAND r=expr { $e = new AndExpr($l.e, $r.e); }

    | l=expr PIPE r=expr  { $e = new OrExpr($l.e, $r.e); }

	

	

	| LBRACKET es=exprs RBRACKET {$e = new BrkExpr($es.cu);} 

	| l=expr APPEND r=expr {$e = new AppExpr($l.e, $r.e);} 

	| TRUE {$e = new CBoolean(true);}

	| FALSE {$e = new CBoolean(false);}

	| INTEGER {$e = new CInteger($INTEGER.int);}

	| STRING {$e = new CString($STRING.text);};

exprs returns [List<CuExpr> cu] 

	: {$cu = new ArrayList<CuExpr>();} (e=expr {$cu.add($e.e);} (COMMA e=expr {$cu.add($e.e);})*)?;

stat returns [CuStat s]

	: LBRACE ss=stats RBRACE {$s = new Stats($ss.cu);}

	| VAR ASSIGN e=expr SEMICOLON {$s = new AssignStat($VAR.text, $e.e);} 

	| IF LPAREN e=expr RPAREN l=stat {$s = new IfStat($e.e, $l.s);} (ELSE r=stat {$s.add($r.s);})? 

	| WHILE LPAREN e=expr RPAREN st=stat {$s = new WhileStat($e.e, $st.s);}

	| FOR LPAREN VAR IN e=expr RPAREN st=stat {$s = new ForStat($VAR.text, $e.e, $st.s);}

	| (RETURN | EQUAL) e=expr SEMICOLON {$s = new ReturnStat($e.e);};

stats returns [List<CuStat> cu] 

	: {$cu = new ArrayList<CuStat>();} (s=stat {$cu.add($s.s);} (s=stat {$cu.add($s.s);})*)?;

intf returns [CuInterface i]

	: INTERFACE CLSINTF p=kindcontext {$i = new Intf($CLSINTF.text, $p.kc);} (EXTENDS t=type {$i.add($t.t);} LBRACE (FUN VAR ts=typescheme SEMICOLON {$i.add($VAR.text, $ts.ts);})* RBRACE)?;

cls returns [CuClass c]

	: CLASS CLSINTF pk=kindcontext pt=typecontext {$c = new Cls($CLSINTF.text, $pk.kc, $pt.tc);} (EXTENDS t=type {$c.add($t.t);} LBRACE (s=stat {$c.add($s.s);})* (SUPER LPAREN es=exprs RPAREN SEMICOLON {$c.add($es.cu);})? (FUN v=vv ts=typescheme s=stat {$c.add($v.v, $ts.ts, $s.s);})* RBRACE)?;

program returns [CuProgr p]

	: s=stat {$p = new StatPrg($s.s);} (ss=stats pr=program {$p.add($ss.cu, $pr.p);})?

	| FUN VAR ts=typescheme s=stat {$p = new FunPrg($VAR.text, $ts.ts, $s.s);} (FUN VAR ts=typescheme s=stat {$p.add($VAR.text, $ts.ts, $s.s);})* pr=program {$p.add($pr.p);}

	| i=intf pr=program {$p = new IntfPrg($i.i, $pr.p);}

	| c=cls pr=program {$p = new ClassPrg($c.c, $pr.p);};

top returns [CuTop cu]: p=program EOF {$cu = new Top($p.p);};

functxt returns [CuFunC f]

	: {$f = new FuncTxt();} (COMMA v=vvc ts=typescheme {$f.add($v.v, $ts.ts);})*;

clsctxt returns [CuClassC c]

	: {$c = new ClassCtxt();} (COMMA k=(INTERFACE | CLASS) CLSINTF p=kindcontext {$c.add($k.text, $CLSINTF.text, $p.kc);} (EXTENDS t=type {$c.add($t.t);} LBRACE (vvv=vv ts=typescheme SEMICOLON {$c.add($vvv.v, $ts.ts);})* RBRACE)? {$c.finish($k.text);})*;
