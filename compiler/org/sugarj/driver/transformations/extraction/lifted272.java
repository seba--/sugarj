package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted272 extends Strategy 
{ 
  TermReference n_210;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1629:
    { 
      IStrategoTerm p_210 = null;
      IStrategoTerm s_210 = null;
      IStrategoTerm t_210 = null;
      p_210 = term;
      if(n_210.value == null)
        break Fail1629;
      term = termFactory.makeTuple(n_210.value, extraction.constSortNoArgs0);
      IStrategoTerm term623 = term;
      Success593:
      { 
        Fail1630:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1630;
          if(true)
            break Success593;
        }
        term = term623;
        IStrategoTerm r_210 = null;
        r_210 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, r_210, extraction.const478);
        if(term == null)
          break Fail1629;
        if(true)
          break Fail1629;
      }
      term = p_210;
      t_210 = p_210;
      s_210 = term;
      term = t_210;
      IStrategoList list230;
      list230 = checkListTail(s_210);
      if(list230 == null)
        break Fail1629;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list230);
      if(true)
        return term;
    }
    return null;
  }
}