package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted60 extends Strategy 
{ 
  TermReference m_97;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2150:
    { 
      IStrategoTerm p_97 = null;
      IStrategoTerm c_98 = null;
      IStrategoTerm d_98 = null;
      p_97 = term;
      if(m_97.value == null)
        break Fail2150;
      term = termFactory.makeTuple(m_97.value, extraction.constSortNoArgs72);
      IStrategoTerm term314 = term;
      Success902:
      { 
        Fail2151:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2151;
          if(true)
            break Success902;
        }
        term = term314;
        IStrategoTerm z_97 = null;
        z_97 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_97, extraction.const342);
        if(term == null)
          break Fail2150;
        if(true)
          break Fail2150;
      }
      term = p_97;
      d_98 = p_97;
      c_98 = term;
      term = d_98;
      IStrategoList list18;
      list18 = checkListTail(c_98);
      if(list18 == null)
        break Fail2150;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list18);
      if(true)
        return term;
    }
    return null;
  }
}