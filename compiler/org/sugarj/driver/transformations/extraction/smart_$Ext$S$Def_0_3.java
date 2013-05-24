package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Ext$S$Def_0_3 extends Strategy 
{ 
  public static smart_$Ext$S$Def_0_3 instance = new smart_$Ext$S$Def_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_s_257, IStrategoTerm ref_t_257, IStrategoTerm ref_u_257)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference s_257 = new TermReference(ref_s_257);
    TermReference t_257 = new TermReference(ref_t_257);
    TermReference u_257 = new TermReference(ref_u_257);
    context.push("smart_ExtSDef_0_3");
    Fail586:
    { 
      IStrategoTerm v_257 = null;
      IStrategoTerm j_258 = null;
      IStrategoTerm l_258 = null;
      term = extraction.constNil0;
      lifted354 lifted3540 = new lifted354();
      lifted3540.s_257 = s_257;
      lifted3540.t_257 = t_257;
      lifted3540.u_257 = u_257;
      term = try_1_0.instance.invoke(context, term, lifted3540);
      if(term == null)
        break Fail586;
      v_257 = term;
      if(s_257.value == null || (t_257.value == null || u_257.value == null))
        break Fail586;
      term = (IStrategoTerm)termFactory.makeListCons(s_257.value, termFactory.makeListCons(t_257.value, termFactory.makeListCons(u_257.value, (IStrategoList)extraction.constNil0)));
      j_258 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", j_258, NO_STRATEGIES, new IStrategoTerm[]{extraction.const539});
      if(term == null)
        break Fail586;
      l_258 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, v_257);
      if(term == null)
        break Fail586;
      term = put_syntax_sort_0_1.instance.invoke(context, l_258, term);
      if(term == null)
        break Fail586;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}