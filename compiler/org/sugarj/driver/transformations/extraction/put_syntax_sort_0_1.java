package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class put_syntax_sort_0_1 extends Strategy 
{ 
  public static put_syntax_sort_0_1 instance = new put_syntax_sort_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_55)
  { 
    Fail43:
    { 
      term = context.invokePrimitive("SUGARJ_put_typesmart_sort", term, NO_STRATEGIES, new IStrategoTerm[]{e_55});
      if(term == null)
        break Fail43;
      if(true)
        return term;
    }
    context.push("put_syntax_sort_0_1");
    context.popOnFailure();
    return null;
  }
}