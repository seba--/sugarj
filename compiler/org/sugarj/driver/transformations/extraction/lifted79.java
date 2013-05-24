package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted79 extends Strategy 
{ 
  TermReference f_104;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2112:
    { 
      IStrategoTerm i_104 = null;
      IStrategoTerm m_104 = null;
      IStrategoTerm n_104 = null;
      i_104 = term;
      if(f_104.value == null)
        break Fail2112;
      term = termFactory.makeTuple(f_104.value, extraction.constSortNoArgs233);
      IStrategoTerm term333 = term;
      Success883:
      { 
        Fail2113:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2113;
          if(true)
            break Success883;
        }
        term = term333;
        IStrategoTerm l_104 = null;
        l_104 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, l_104, extraction.const352);
        if(term == null)
          break Fail2112;
        if(true)
          break Fail2112;
      }
      term = i_104;
      n_104 = i_104;
      m_104 = term;
      term = n_104;
      IStrategoList list37;
      list37 = checkListTail(m_104);
      if(list37 == null)
        break Fail2112;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list37);
      if(true)
        return term;
    }
    return null;
  }
}