package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted4 extends Strategy 
{ 
  public static final lifted4 instance = new lifted4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2203:
    { 
      IStrategoTerm term8 = term;
      Success925:
      { 
        Fail2204:
        { 
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail2204;
          IStrategoTerm arg10 = term.getSubterm(0);
          if(arg10.getTermType() != IStrategoTerm.STRING || !"analysis-data".equals(((IStrategoString)arg10).stringValue()))
            break Fail2204;
          { 
            if(true)
              break Fail2203;
            if(true)
              break Success925;
          }
        }
        term = term8;
      }
      if(true)
        return term;
    }
    return null;
  }
}