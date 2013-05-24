package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted273 extends Strategy 
{ 
  TermReference z_210;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1627:
    { 
      IStrategoTerm b_211 = null;
      IStrategoTerm e_211 = null;
      IStrategoTerm f_211 = null;
      b_211 = term;
      if(z_210.value == null)
        break Fail1627;
      term = termFactory.makeTuple(z_210.value, extraction.constSortNoArgs0);
      IStrategoTerm term624 = term;
      Success592:
      { 
        Fail1628:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1628;
          if(true)
            break Success592;
        }
        term = term624;
        IStrategoTerm d_211 = null;
        d_211 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_211, extraction.const479);
        if(term == null)
          break Fail1627;
        if(true)
          break Fail1627;
      }
      term = b_211;
      f_211 = b_211;
      e_211 = term;
      term = f_211;
      IStrategoList list231;
      list231 = checkListTail(e_211);
      if(list231 == null)
        break Fail1627;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list231);
      if(true)
        return term;
    }
    return null;
  }
}