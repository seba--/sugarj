package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted431 extends Strategy 
{ 
  TermReference k_304;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1254:
    { 
      IStrategoTerm m_304 = null;
      IStrategoTerm p_304 = null;
      IStrategoTerm q_304 = null;
      m_304 = term;
      if(k_304.value == null)
        break Fail1254;
      term = termFactory.makeTuple(k_304.value, extraction.constSortNoArgs74);
      IStrategoTerm term839 = term;
      Success377:
      { 
        Fail1255:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1255;
          if(true)
            break Success377;
        }
        term = term839;
        IStrategoTerm o_304 = null;
        o_304 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_304, extraction.const600);
        if(term == null)
          break Fail1254;
        if(true)
          break Fail1254;
      }
      term = m_304;
      q_304 = m_304;
      p_304 = term;
      term = q_304;
      IStrategoList list389;
      list389 = checkListTail(p_304);
      if(list389 == null)
        break Fail1254;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs296, list389);
      if(true)
        return term;
    }
    return null;
  }
}