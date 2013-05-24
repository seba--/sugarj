package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted73 extends Strategy 
{ 
  TermReference h_102;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2124:
    { 
      IStrategoTerm j_102 = null;
      IStrategoTerm n_102 = null;
      IStrategoTerm o_102 = null;
      j_102 = term;
      if(h_102.value == null)
        break Fail2124;
      term = termFactory.makeTuple(h_102.value, extraction.constSortNoArgs247);
      IStrategoTerm term327 = term;
      Success889:
      { 
        Fail2125:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2125;
          if(true)
            break Success889;
        }
        term = term327;
        IStrategoTerm m_102 = null;
        m_102 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_102, extraction.const349);
        if(term == null)
          break Fail2124;
        if(true)
          break Fail2124;
      }
      term = j_102;
      o_102 = j_102;
      n_102 = term;
      term = o_102;
      IStrategoList list31;
      list31 = checkListTail(n_102);
      if(list31 == null)
        break Fail2124;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list31);
      if(true)
        return term;
    }
    return null;
  }
}