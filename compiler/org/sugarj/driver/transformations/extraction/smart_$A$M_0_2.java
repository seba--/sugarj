package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$A$M_0_2 extends Strategy 
{ 
  public static smart_$A$M_0_2 instance = new smart_$A$M_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_198, IStrategoTerm ref_k_198)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference j_198 = new TermReference(ref_j_198);
    TermReference k_198 = new TermReference(ref_k_198);
    context.push("smart_AM_0_2");
    Fail496:
    { 
      IStrategoTerm l_198 = null;
      IStrategoTerm e_199 = null;
      IStrategoTerm g_199 = null;
      term = extraction.constNil0;
      lifted251 lifted2510 = new lifted251();
      lifted2510.j_198 = j_198;
      lifted2510.k_198 = k_198;
      term = try_1_0.instance.invoke(context, term, lifted2510);
      if(term == null)
        break Fail496;
      lifted252 lifted2520 = new lifted252();
      lifted2520.j_198 = j_198;
      lifted2520.k_198 = k_198;
      term = try_1_0.instance.invoke(context, term, lifted2520);
      if(term == null)
        break Fail496;
      l_198 = term;
      if(j_198.value == null || k_198.value == null)
        break Fail496;
      term = (IStrategoTerm)termFactory.makeListCons(j_198.value, termFactory.makeListCons(k_198.value, (IStrategoList)extraction.constNil0));
      e_199 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", e_199, NO_STRATEGIES, new IStrategoTerm[]{extraction.const462});
      if(term == null)
        break Fail496;
      g_199 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, l_198);
      if(term == null)
        break Fail496;
      term = put_syntax_sort_0_1.instance.invoke(context, g_199, term);
      if(term == null)
        break Fail496;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}