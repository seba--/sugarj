package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Anno_0_2 extends Strategy 
{ 
  public static smart_$Anno_0_2 instance = new smart_$Anno_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_h_252, IStrategoTerm ref_i_252)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference h_252 = new TermReference(ref_h_252);
    TermReference i_252 = new TermReference(ref_i_252);
    context.push("smart_Anno_0_2");
    Fail579:
    { 
      IStrategoTerm k_252 = null;
      IStrategoTerm u_252 = null;
      IStrategoTerm w_252 = null;
      term = extraction.constNil0;
      lifted347 lifted3470 = new lifted347();
      lifted3470.h_252 = h_252;
      lifted3470.i_252 = i_252;
      term = try_1_0.instance.invoke(context, term, lifted3470);
      if(term == null)
        break Fail579;
      k_252 = term;
      if(h_252.value == null || i_252.value == null)
        break Fail579;
      term = (IStrategoTerm)termFactory.makeListCons(h_252.value, termFactory.makeListCons(i_252.value, (IStrategoList)extraction.constNil0));
      u_252 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", u_252, NO_STRATEGIES, new IStrategoTerm[]{extraction.const533});
      if(term == null)
        break Fail579;
      w_252 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_252);
      if(term == null)
        break Fail579;
      term = put_syntax_sort_0_1.instance.invoke(context, w_252, term);
      if(term == null)
        break Fail579;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}