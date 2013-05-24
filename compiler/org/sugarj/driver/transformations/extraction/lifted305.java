package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted305 extends Strategy 
{ 
  TermReference o_229;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1548:
    { 
      IStrategoTerm q_229 = null;
      IStrategoTerm e_230 = null;
      IStrategoTerm f_230 = null;
      q_229 = term;
      if(o_229.value == null)
        break Fail1548;
      term = termFactory.makeTuple(o_229.value, extraction.constSortNoArgs20);
      IStrategoTerm term671 = term;
      Success545:
      { 
        Fail1549:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1549;
          if(true)
            break Success545;
        }
        term = term671;
        IStrategoTerm d_230 = null;
        d_230 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_230, extraction.const27);
        if(term == null)
          break Fail1548;
        if(true)
          break Fail1548;
      }
      term = q_229;
      f_230 = q_229;
      e_230 = term;
      term = f_230;
      IStrategoList list263;
      list263 = checkListTail(e_230);
      if(list263 == null)
        break Fail1548;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs51, list263);
      if(true)
        return term;
    }
    return null;
  }
}