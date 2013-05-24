package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class has_subsort_of_0_0 extends Strategy 
{ 
  public static has_subsort_of_0_0 instance = new has_subsort_of_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("has_subsort_of_0_0");
    Fail96:
    { 
      IStrategoTerm term64 = term;
      Success59:
      { 
        Fail97:
        { 
          IStrategoTerm n_473 = null;
          term = _2_0.instance.invoke(context, term, lifted20.instance, _Id.instance);
          if(term == null)
            break Fail97;
          n_473 = term;
          term = nice_analysis_data_term_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail97;
          term = debug_1_0.instance.invoke(context, term, lifted23.instance);
          if(term == null)
            break Fail97;
          term = n_473;
          if(true)
            break Fail97;
          if(true)
            break Success59;
        }
        term = push_subsort_stack_0_0.instance.invoke(context, term64);
        if(term == null)
          break Fail96;
        term = finally_2_0.instance.invoke(context, term, lifted24.instance, pop_subsort_stack_0_0.instance);
        if(term == null)
          break Fail96;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}