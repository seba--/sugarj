package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted126 extends Strategy 
{ 
  TermReference w_124;

  TermReference x_124;

  TermReference a_125;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2003:
    { 
      IStrategoTerm c_125 = null;
      IStrategoTerm d_125 = null;
      IStrategoTerm e_125 = null;
      IStrategoTerm m_125 = null;
      IStrategoTerm n_125 = null;
      c_125 = term;
      if(w_124.value == null)
        break Fail2003;
      term = termFactory.makeTuple(w_124.value, extraction.constSortNoArgs5);
      IStrategoTerm term393 = term;
      Success821:
      { 
        Fail2004:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2004;
          if(true)
            break Success821;
        }
        term = term393;
        IStrategoTerm h_125 = null;
        h_125 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_125, extraction.const385);
        if(term == null)
          break Fail2003;
        if(true)
          break Fail2003;
      }
      term = c_125;
      d_125 = c_125;
      if(x_124.value == null)
        break Fail2003;
      term = termFactory.makeTuple(x_124.value, extraction.constSortNoArgs91);
      IStrategoTerm term394 = term;
      Success822:
      { 
        Fail2005:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2005;
          if(true)
            break Success822;
        }
        term = term394;
        IStrategoTerm j_125 = null;
        j_125 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, j_125, extraction.const385);
        if(term == null)
          break Fail2003;
        if(true)
          break Fail2003;
      }
      term = d_125;
      e_125 = d_125;
      if(a_125.value == null)
        break Fail2003;
      term = termFactory.makeTuple(a_125.value, extraction.constSortNoArgs91);
      IStrategoTerm term395 = term;
      Success823:
      { 
        Fail2006:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2006;
          if(true)
            break Success823;
        }
        term = term395;
        IStrategoTerm l_125 = null;
        l_125 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, l_125, extraction.const385);
        if(term == null)
          break Fail2003;
        if(true)
          break Fail2003;
      }
      term = e_125;
      n_125 = e_125;
      m_125 = term;
      term = n_125;
      IStrategoList list84;
      list84 = checkListTail(m_125);
      if(list84 == null)
        break Fail2003;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs150, list84);
      if(true)
        return term;
    }
    return null;
  }
}