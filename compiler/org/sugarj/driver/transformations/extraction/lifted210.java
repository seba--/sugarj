package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted210 extends Strategy 
{ 
  TermReference e_174;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1818:
    { 
      IStrategoTerm h_174 = null;
      IStrategoTerm o_174 = null;
      IStrategoTerm p_174 = null;
      h_174 = term;
      if(e_174.value == null)
        break Fail1818;
      term = termFactory.makeTuple(e_174.value, extraction.constSort34);
      IStrategoTerm term496 = term;
      Success720:
      { 
        Fail1819:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1819;
          if(true)
            break Success720;
        }
        term = term496;
        IStrategoTerm n_174 = null;
        n_174 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_174, extraction.const81);
        if(term == null)
          break Fail1818;
        if(true)
          break Fail1818;
      }
      term = h_174;
      p_174 = h_174;
      o_174 = term;
      term = p_174;
      IStrategoList list168;
      list168 = checkListTail(o_174);
      if(list168 == null)
        break Fail1818;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs193, list168);
      if(true)
        return term;
    }
    return null;
  }
}