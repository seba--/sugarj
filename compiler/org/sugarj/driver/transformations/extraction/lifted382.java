package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted382 extends Strategy 
{ 
  TermReference t_271;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1350:
    { 
      IStrategoTerm w_271 = null;
      IStrategoTerm d_272 = null;
      IStrategoTerm e_272 = null;
      w_271 = term;
      if(t_271.value == null)
        break Fail1350;
      term = termFactory.makeTuple(t_271.value, extraction.constSort46);
      IStrategoTerm term792 = term;
      Success424:
      { 
        Fail1351:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1351;
          if(true)
            break Success424;
        }
        term = term792;
        IStrategoTerm c_272 = null;
        c_272 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_272, extraction.const558);
        if(term == null)
          break Fail1350;
        if(true)
          break Fail1350;
      }
      term = w_271;
      e_272 = w_271;
      d_272 = term;
      term = e_272;
      IStrategoList list340;
      list340 = checkListTail(d_272);
      if(list340 == null)
        break Fail1350;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs277, list340);
      if(true)
        return term;
    }
    return null;
  }
}