package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_single_0_1 extends Strategy 
{ 
  public static smart_single_0_1 instance = new smart_single_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_270)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference j_270 = new TermReference(ref_j_270);
    context.push("smart_single_0_1");
    Fail605:
    { 
      IStrategoTerm k_270 = null;
      IStrategoTerm t_270 = null;
      IStrategoTerm v_270 = null;
      term = extraction.constNil0;
      lifted378 lifted3780 = new lifted378();
      lifted3780.j_270 = j_270;
      term = try_1_0.instance.invoke(context, term, lifted3780);
      if(term == null)
        break Fail605;
      k_270 = term;
      if(j_270.value == null)
        break Fail605;
      term = (IStrategoTerm)termFactory.makeListCons(j_270.value, (IStrategoList)extraction.constNil0);
      t_270 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", t_270, NO_STRATEGIES, new IStrategoTerm[]{extraction.const556});
      if(term == null)
        break Fail605;
      v_270 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_270);
      if(term == null)
        break Fail605;
      term = put_syntax_sort_0_1.instance.invoke(context, v_270, term);
      if(term == null)
        break Fail605;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}