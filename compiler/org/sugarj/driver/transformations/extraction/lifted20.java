package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted20 extends Strategy 
{ 
  public static final lifted20 instance = new lifted20();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2195:
    { 
      term = try_1_0.instance.invoke(context, term, get_syntax_sort_0_0.instance);
      if(term == null)
        break Fail2195;
      if(true)
        return term;
    }
    return null;
  }
}