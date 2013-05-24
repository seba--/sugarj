package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted304 extends Strategy 
{ 
  TermReference a_229;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1550:
    { 
      IStrategoTerm c_229 = null;
      IStrategoTerm i_229 = null;
      IStrategoTerm j_229 = null;
      c_229 = term;
      if(a_229.value == null)
        break Fail1550;
      term = termFactory.makeTuple(a_229.value, extraction.constSortNoArgs41);
      IStrategoTerm term670 = term;
      Success546:
      { 
        Fail1551:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1551;
          if(true)
            break Success546;
        }
        term = term670;
        IStrategoTerm h_229 = null;
        h_229 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_229, extraction.const506);
        if(term == null)
          break Fail1550;
        if(true)
          break Fail1550;
      }
      term = c_229;
      j_229 = c_229;
      i_229 = term;
      term = j_229;
      IStrategoList list262;
      list262 = checkListTail(i_229);
      if(list262 == null)
        break Fail1550;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs41, list262);
      if(true)
        return term;
    }
    return null;
  }
}