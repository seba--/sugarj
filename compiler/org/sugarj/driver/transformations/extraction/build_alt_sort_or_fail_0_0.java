package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class build_alt_sort_or_fail_0_0 extends Strategy 
{ 
  public static build_alt_sort_or_fail_0_0 instance = new build_alt_sort_or_fail_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("build_alt_sort_or_fail_0_0");
    Fail339:
    { 
      IStrategoTerm p_473 = null;
      IStrategoTerm q_473 = null;
      term = debug_1_0.instance.invoke(context, term, lifted38.instance);
      if(term == null)
        break Fail339;
      IStrategoTerm term295 = term;
      Success288:
      { 
        Fail340:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail340;
          { 
            if(true)
              break Fail339;
            if(true)
              break Success288;
          }
        }
        term = term295;
      }
      term = nub_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail339;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail339;
      q_473 = ((IStrategoList)term).head();
      p_473 = ((IStrategoList)term).tail();
      term = termFactory.makeTuple(p_473, q_473);
      term = foldl_1_0.instance.invoke(context, term, lifted39.instance);
      if(term == null)
        break Fail339;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}