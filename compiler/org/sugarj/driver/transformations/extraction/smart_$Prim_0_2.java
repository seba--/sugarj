package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Prim_0_2 extends Strategy 
{ 
  public static smart_$Prim_0_2 instance = new smart_$Prim_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_g_212, IStrategoTerm ref_h_212)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference g_212 = new TermReference(ref_g_212);
    TermReference h_212 = new TermReference(ref_h_212);
    context.push("smart_Prim_0_2");
    Fail517:
    { 
      IStrategoTerm i_212 = null;
      IStrategoTerm u_212 = null;
      IStrategoTerm w_212 = null;
      term = extraction.constNil0;
      lifted276 lifted2760 = new lifted276();
      lifted2760.g_212 = g_212;
      lifted2760.h_212 = h_212;
      term = try_1_0.instance.invoke(context, term, lifted2760);
      if(term == null)
        break Fail517;
      i_212 = term;
      if(g_212.value == null || h_212.value == null)
        break Fail517;
      term = (IStrategoTerm)termFactory.makeListCons(g_212.value, termFactory.makeListCons(h_212.value, (IStrategoList)extraction.constNil0));
      u_212 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", u_212, NO_STRATEGIES, new IStrategoTerm[]{extraction.const482});
      if(term == null)
        break Fail517;
      w_212 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, i_212);
      if(term == null)
        break Fail517;
      term = put_syntax_sort_0_1.instance.invoke(context, w_212, term);
      if(term == null)
        break Fail517;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}