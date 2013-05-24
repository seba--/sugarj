package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class has_subsort_of_inject_0_2 extends Strategy 
{ 
  public static has_subsort_of_inject_0_2 instance = new has_subsort_of_inject_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_89, IStrategoTerm w_89)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("has_subsort_of_inject_0_2");
    Fail329:
    { 
      IStrategoTerm x_89 = null;
      IStrategoTerm z_89 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail329;
      z_89 = term.getSubterm(0);
      x_89 = term.getSubterm(1);
      term = termFactory.makeTuple(x_89, w_89);
      term = sort_match_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail329;
      term = repeat_1_0.instance.invoke(context, u_89, unrename_sort_0_0.instance);
      if(term == null)
        break Fail329;
      term = termFactory.makeTuple(z_89, term);
      term = has_subsort_of_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail329;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}