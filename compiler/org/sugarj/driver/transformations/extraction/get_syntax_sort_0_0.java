package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class get_syntax_sort_0_0 extends Strategy 
{ 
  public static get_syntax_sort_0_0 instance = new get_syntax_sort_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail44:
    { 
      term = context.invokePrimitive("SUGARJ_get_typesmart_sort", term, NO_STRATEGIES, NO_TERMS);
      if(term == null)
        break Fail44;
      if(true)
        return term;
    }
    context.push("get_syntax_sort_0_0");
    context.popOnFailure();
    return null;
  }
}