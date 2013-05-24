package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted209 extends Strategy 
{ 
  TermReference e_174;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1820:
    { 
      IStrategoTerm g_174 = null;
      IStrategoTerm k_174 = null;
      IStrategoTerm l_174 = null;
      g_174 = term;
      if(e_174.value == null)
        break Fail1820;
      term = termFactory.makeTuple(e_174.value, extraction.constSort5);
      IStrategoTerm term495 = term;
      Success721:
      { 
        Fail1821:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1821;
          if(true)
            break Success721;
        }
        term = term495;
        IStrategoTerm j_174 = null;
        j_174 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, j_174, extraction.const81);
        if(term == null)
          break Fail1820;
        if(true)
          break Fail1820;
      }
      term = g_174;
      l_174 = g_174;
      k_174 = term;
      term = l_174;
      IStrategoList list167;
      list167 = checkListTail(k_174);
      if(list167 == null)
        break Fail1820;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs70, list167);
      if(true)
        return term;
    }
    return null;
  }
}