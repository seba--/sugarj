package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted379 extends Strategy 
{ 
  TermReference w_270;

  TermReference x_270;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1357:
    { 
      IStrategoTerm z_270 = null;
      IStrategoTerm a_271 = null;
      IStrategoTerm h_271 = null;
      IStrategoTerm i_271 = null;
      z_270 = term;
      if(w_270.value == null)
        break Fail1357;
      term = termFactory.makeTuple(w_270.value, extraction.constSortNoArgs301);
      IStrategoTerm term787 = term;
      Success428:
      { 
        Fail1358:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1358;
          if(true)
            break Success428;
        }
        term = term787;
        IStrategoTerm e_271 = null;
        e_271 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_271, extraction.const557);
        if(term == null)
          break Fail1357;
        if(true)
          break Fail1357;
      }
      term = z_270;
      a_271 = z_270;
      if(x_270.value == null)
        break Fail1357;
      term = termFactory.makeTuple(x_270.value, extraction.constSortNoArgs301);
      IStrategoTerm term788 = term;
      Success429:
      { 
        Fail1359:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1359;
          if(true)
            break Success429;
        }
        term = term788;
        IStrategoTerm g_271 = null;
        g_271 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_271, extraction.const557);
        if(term == null)
          break Fail1357;
        if(true)
          break Fail1357;
      }
      term = a_271;
      i_271 = a_271;
      h_271 = term;
      term = i_271;
      IStrategoList list337;
      list337 = checkListTail(h_271);
      if(list337 == null)
        break Fail1357;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs301, list337);
      if(true)
        return term;
    }
    return null;
  }
}