package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted184 extends Strategy 
{ 
  TermReference n_159;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1877:
    { 
      IStrategoTerm p_159 = null;
      IStrategoTerm s_159 = null;
      IStrategoTerm t_159 = null;
      p_159 = term;
      if(n_159.value == null)
        break Fail1877;
      term = termFactory.makeTuple(n_159.value, extraction.constSortNoArgs6);
      IStrategoTerm term463 = term;
      Success753:
      { 
        Fail1878:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1878;
          if(true)
            break Success753;
        }
        term = term463;
        IStrategoTerm r_159 = null;
        r_159 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, r_159, extraction.const423);
        if(term == null)
          break Fail1877;
        if(true)
          break Fail1877;
      }
      term = p_159;
      t_159 = p_159;
      s_159 = term;
      term = t_159;
      IStrategoList list142;
      list142 = checkListTail(s_159);
      if(list142 == null)
        break Fail1877;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs133, list142);
      if(true)
        return term;
    }
    return null;
  }
}