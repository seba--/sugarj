package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted19 extends Strategy 
{ 
  TermReference d_357;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2196:
    { 
      IStrategoTerm j_54 = null;
      IStrategoTerm m_54 = null;
      IStrategoTerm n_54 = null;
      j_54 = term;
      if(d_357.value == null)
        break Fail2196;
      term = termFactory.makeTuple(d_357.value, extraction.constSortNoArgs0);
      IStrategoTerm term14 = term;
      Success922:
      { 
        Fail2197:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2197;
          if(true)
            break Success922;
        }
        term = term14;
        IStrategoTerm l_54 = null;
        l_54 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, l_54, extraction.const4);
        if(term == null)
          break Fail2196;
        if(true)
          break Fail2196;
      }
      term = j_54;
      n_54 = j_54;
      m_54 = term;
      term = n_54;
      IStrategoList list2;
      list2 = checkListTail(m_54);
      if(list2 == null)
        break Fail2196;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list2);
      if(true)
        return term;
    }
    return null;
  }
}