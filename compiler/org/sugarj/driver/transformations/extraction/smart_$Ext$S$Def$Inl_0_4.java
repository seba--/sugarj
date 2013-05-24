package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Ext$S$Def$Inl_0_4 extends Strategy 
{ 
  public static smart_$Ext$S$Def$Inl_0_4 instance = new smart_$Ext$S$Def$Inl_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_r_256, IStrategoTerm ref_s_256, IStrategoTerm ref_u_256, IStrategoTerm ref_v_256)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference r_256 = new TermReference(ref_r_256);
    TermReference s_256 = new TermReference(ref_s_256);
    TermReference u_256 = new TermReference(ref_u_256);
    TermReference v_256 = new TermReference(ref_v_256);
    context.push("smart_ExtSDefInl_0_4");
    Fail585:
    { 
      IStrategoTerm w_256 = null;
      IStrategoTerm p_257 = null;
      IStrategoTerm r_257 = null;
      term = extraction.constNil0;
      lifted353 lifted3530 = new lifted353();
      lifted3530.r_256 = r_256;
      lifted3530.s_256 = s_256;
      lifted3530.u_256 = u_256;
      lifted3530.v_256 = v_256;
      term = try_1_0.instance.invoke(context, term, lifted3530);
      if(term == null)
        break Fail585;
      w_256 = term;
      if(r_256.value == null || (s_256.value == null || (u_256.value == null || v_256.value == null)))
        break Fail585;
      term = (IStrategoTerm)termFactory.makeListCons(r_256.value, termFactory.makeListCons(s_256.value, termFactory.makeListCons(u_256.value, termFactory.makeListCons(v_256.value, (IStrategoList)extraction.constNil0))));
      p_257 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", p_257, NO_STRATEGIES, new IStrategoTerm[]{extraction.const538});
      if(term == null)
        break Fail585;
      r_257 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, w_256);
      if(term == null)
        break Fail585;
      term = put_syntax_sort_0_1.instance.invoke(context, r_257, term);
      if(term == null)
        break Fail585;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}