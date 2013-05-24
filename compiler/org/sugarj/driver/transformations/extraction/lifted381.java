package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted381 extends Strategy 
{ 
  TermReference t_271;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1352:
    { 
      IStrategoTerm v_271 = null;
      IStrategoTerm z_271 = null;
      IStrategoTerm a_272 = null;
      v_271 = term;
      if(t_271.value == null)
        break Fail1352;
      term = termFactory.makeTuple(t_271.value, extraction.constSort45);
      IStrategoTerm term791 = term;
      Success425:
      { 
        Fail1353:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1353;
          if(true)
            break Success425;
        }
        term = term791;
        IStrategoTerm y_271 = null;
        y_271 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_271, extraction.const558);
        if(term == null)
          break Fail1352;
        if(true)
          break Fail1352;
      }
      term = v_271;
      a_272 = v_271;
      z_271 = term;
      term = a_272;
      IStrategoList list339;
      list339 = checkListTail(z_271);
      if(list339 == null)
        break Fail1352;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs301, list339);
      if(true)
        return term;
    }
    return null;
  }
}