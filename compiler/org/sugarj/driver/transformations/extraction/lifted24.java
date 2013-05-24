package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted24 extends Strategy 
{ 
  public static final lifted24 instance = new lifted24();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2191:
    { 
      IStrategoTerm term65 = term;
      Success920:
      { 
        Fail2192:
        { 
          term = has_subsort_of_refl_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2192;
          if(true)
            break Success920;
        }
        term = term65;
        IStrategoTerm term66 = term;
        Success921:
        { 
          Fail2193:
          { 
            term = has_subsort_unrename_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail2193;
            if(true)
              break Success921;
          }
          term = has_subsort_of_trans_0_0.instance.invoke(context, term66);
          if(term == null)
            break Fail2191;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}