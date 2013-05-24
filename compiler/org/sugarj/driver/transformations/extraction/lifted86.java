package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted86 extends Strategy 
{ 
  TermReference p_106;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2098:
    { 
      IStrategoTerm r_106 = null;
      IStrategoTerm u_106 = null;
      IStrategoTerm v_106 = null;
      r_106 = term;
      if(p_106.value == null)
        break Fail2098;
      term = termFactory.makeTuple(p_106.value, extraction.constSort18);
      IStrategoTerm term340 = term;
      Success876:
      { 
        Fail2099:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2099;
          if(true)
            break Success876;
        }
        term = term340;
        IStrategoTerm t_106 = null;
        t_106 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_106, extraction.const357);
        if(term == null)
          break Fail2098;
        if(true)
          break Fail2098;
      }
      term = r_106;
      v_106 = r_106;
      u_106 = term;
      term = v_106;
      IStrategoList list44;
      list44 = checkListTail(u_106);
      if(list44 == null)
        break Fail2098;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs87, list44);
      if(true)
        return term;
    }
    return null;
  }
}