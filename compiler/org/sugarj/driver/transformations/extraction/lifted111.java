package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted111 extends Strategy 
{ 
  TermReference c_118;

  TermReference d_118;

  TermReference e_118;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2037:
    { 
      IStrategoTerm j_118 = null;
      IStrategoTerm k_118 = null;
      IStrategoTerm l_118 = null;
      IStrategoTerm d_119 = null;
      IStrategoTerm e_119 = null;
      j_118 = term;
      if(c_118.value == null)
        break Fail2037;
      term = termFactory.makeTuple(c_118.value, extraction.constSortNoArgs8);
      IStrategoTerm term374 = term;
      Success840:
      { 
        Fail2038:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2038;
          if(true)
            break Success840;
        }
        term = term374;
        IStrategoTerm y_118 = null;
        y_118 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_118, extraction.const378);
        if(term == null)
          break Fail2037;
        if(true)
          break Fail2037;
      }
      term = j_118;
      k_118 = j_118;
      if(d_118.value == null)
        break Fail2037;
      term = termFactory.makeTuple(d_118.value, extraction.constSort24);
      IStrategoTerm term375 = term;
      Success841:
      { 
        Fail2039:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2039;
          if(true)
            break Success841;
        }
        term = term375;
        IStrategoTerm a_119 = null;
        a_119 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_119, extraction.const378);
        if(term == null)
          break Fail2037;
        if(true)
          break Fail2037;
      }
      term = k_118;
      l_118 = k_118;
      if(e_118.value == null)
        break Fail2037;
      term = termFactory.makeTuple(e_118.value, extraction.constSortNoArgs309);
      IStrategoTerm term376 = term;
      Success842:
      { 
        Fail2040:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2040;
          if(true)
            break Success842;
        }
        term = term376;
        IStrategoTerm c_119 = null;
        c_119 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_119, extraction.const378);
        if(term == null)
          break Fail2037;
        if(true)
          break Fail2037;
      }
      term = l_118;
      e_119 = l_118;
      d_119 = term;
      term = e_119;
      IStrategoList list69;
      list69 = checkListTail(d_119);
      if(list69 == null)
        break Fail2037;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs148, list69);
      if(true)
        return term;
    }
    return null;
  }
}