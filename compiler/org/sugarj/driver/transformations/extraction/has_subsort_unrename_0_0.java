package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class has_subsort_unrename_0_0 extends Strategy 
{ 
  public static has_subsort_unrename_0_0 instance = new has_subsort_unrename_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("has_subsort_unrename_0_0");
    Fail112:
    { 
      term = _2_0.instance.invoke(context, term, _Id.instance, unrename_sort_0_0.instance);
      if(term == null)
        break Fail112;
      term = has_subsort_of_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail112;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}