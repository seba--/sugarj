package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted5 extends Strategy 
{ 
  public static final lifted5 instance = new lifted5();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2201:
    { 
      IStrategoTerm term9 = term;
      Success924:
      { 
        Fail2202:
        { 
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail2202;
          IStrategoTerm arg12 = term.getSubterm(0);
          if(arg12.getTermType() != IStrategoTerm.STRING || !"analysis-data".equals(((IStrategoString)arg12).stringValue()))
            break Fail2202;
          { 
            if(true)
              break Fail2201;
            if(true)
              break Success924;
          }
        }
        term = term9;
      }
      if(true)
        return term;
    }
    return null;
  }
}