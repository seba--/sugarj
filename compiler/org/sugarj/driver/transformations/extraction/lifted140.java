package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted140 extends Strategy 
{ 
  TermReference w_136;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1960:
    { 
      IStrategoTerm a_137 = null;
      IStrategoTerm d_137 = null;
      IStrategoTerm f_137 = null;
      a_137 = term;
      if(w_136.value == null)
        break Fail1960;
      term = termFactory.makeTuple(w_136.value, extraction.constSortNoArgs8);
      IStrategoTerm term424 = term;
      Success792:
      { 
        Fail1961:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1961;
          if(true)
            break Success792;
        }
        term = term424;
        IStrategoTerm c_137 = null;
        c_137 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_137, extraction.const394);
        if(term == null)
          break Fail1960;
        if(true)
          break Fail1960;
      }
      term = a_137;
      f_137 = a_137;
      d_137 = term;
      term = f_137;
      IStrategoList list98;
      list98 = checkListTail(d_137);
      if(list98 == null)
        break Fail1960;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs94, list98);
      if(true)
        return term;
    }
    return null;
  }
}