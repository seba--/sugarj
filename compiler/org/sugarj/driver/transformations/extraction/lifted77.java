package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted77 extends Strategy 
{ 
  TermReference n_103;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2116:
    { 
      IStrategoTerm p_103 = null;
      IStrategoTerm t_103 = null;
      IStrategoTerm u_103 = null;
      p_103 = term;
      if(n_103.value == null)
        break Fail2116;
      term = termFactory.makeTuple(n_103.value, extraction.constSortNoArgs233);
      IStrategoTerm term331 = term;
      Success885:
      { 
        Fail2117:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2117;
          if(true)
            break Success885;
        }
        term = term331;
        IStrategoTerm s_103 = null;
        s_103 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_103, extraction.const351);
        if(term == null)
          break Fail2116;
        if(true)
          break Fail2116;
      }
      term = p_103;
      u_103 = p_103;
      t_103 = term;
      term = u_103;
      IStrategoList list35;
      list35 = checkListTail(t_103);
      if(list35 == null)
        break Fail2116;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list35);
      if(true)
        return term;
    }
    return null;
  }
}