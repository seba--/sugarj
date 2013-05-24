package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted300 extends Strategy 
{ 
  TermReference m_227;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1558:
    { 
      IStrategoTerm o_227 = null;
      IStrategoTerm r_227 = null;
      IStrategoTerm s_227 = null;
      o_227 = term;
      if(m_227.value == null)
        break Fail1558;
      term = termFactory.makeTuple(m_227.value, extraction.constSortNoArgs24);
      IStrategoTerm term666 = term;
      Success550:
      { 
        Fail1559:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1559;
          if(true)
            break Success550;
        }
        term = term666;
        IStrategoTerm q_227 = null;
        q_227 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_227, extraction.const504);
        if(term == null)
          break Fail1558;
        if(true)
          break Fail1558;
      }
      term = o_227;
      s_227 = o_227;
      r_227 = term;
      term = s_227;
      IStrategoList list258;
      list258 = checkListTail(r_227);
      if(list258 == null)
        break Fail1558;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs43, list258);
      if(true)
        return term;
    }
    return null;
  }
}