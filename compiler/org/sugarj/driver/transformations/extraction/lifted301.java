package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted301 extends Strategy 
{ 
  TermReference x_227;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1556:
    { 
      IStrategoTerm z_227 = null;
      IStrategoTerm d_228 = null;
      IStrategoTerm e_228 = null;
      z_227 = term;
      if(x_227.value == null)
        break Fail1556;
      term = termFactory.makeTuple(x_227.value, extraction.constSortNoArgs43);
      IStrategoTerm term667 = term;
      Success549:
      { 
        Fail1557:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1557;
          if(true)
            break Success549;
        }
        term = term667;
        IStrategoTerm c_228 = null;
        c_228 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_228, extraction.const60);
        if(term == null)
          break Fail1556;
        if(true)
          break Fail1556;
      }
      term = z_227;
      e_228 = z_227;
      d_228 = term;
      term = e_228;
      IStrategoList list259;
      list259 = checkListTail(d_228);
      if(list259 == null)
        break Fail1556;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs50, list259);
      if(true)
        return term;
    }
    return null;
  }
}