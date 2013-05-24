package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class has_sort_0_0 extends Strategy 
{ 
  public static has_sort_0_0 instance = new has_sort_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("has_sort_0_0");
    Fail45:
    { 
      term = try_init_subsort_stack_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail45;
      term = has_subsort_of_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail45;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}