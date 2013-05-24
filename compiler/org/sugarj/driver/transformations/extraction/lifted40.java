package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted40 extends Strategy 
{ 
  public static final lifted40 instance = new lifted40();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2183:
    { 
      IStrategoTerm term297 = term;
      Success919:
      { 
        Fail2184:
        { 
          term = get_syntax_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2184;
          { 
            if(true)
              break Fail2183;
            if(true)
              break Success919;
          }
        }
        term = term297;
      }
      if(true)
        return term;
    }
    return null;
  }
}