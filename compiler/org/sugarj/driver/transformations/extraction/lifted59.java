package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted59 extends Strategy 
{ 
  TermReference m_97;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2152:
    { 
      IStrategoTerm o_97 = null;
      IStrategoTerm s_97 = null;
      IStrategoTerm t_97 = null;
      o_97 = term;
      if(m_97.value == null)
        break Fail2152;
      term = termFactory.makeTuple(m_97.value, extraction.constSortNoArgs273);
      IStrategoTerm term313 = term;
      Success903:
      { 
        Fail2153:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2153;
          if(true)
            break Success903;
        }
        term = term313;
        IStrategoTerm r_97 = null;
        r_97 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, r_97, extraction.const342);
        if(term == null)
          break Fail2152;
        if(true)
          break Fail2152;
      }
      term = o_97;
      t_97 = o_97;
      s_97 = term;
      term = t_97;
      IStrategoList list17;
      list17 = checkListTail(s_97);
      if(list17 == null)
        break Fail2152;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list17);
      if(true)
        return term;
    }
    return null;
  }
}