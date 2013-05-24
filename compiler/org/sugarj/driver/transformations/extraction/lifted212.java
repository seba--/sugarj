package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted212 extends Strategy 
{ 
  TermReference c_175;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1815:
    { 
      IStrategoTerm e_175 = null;
      IStrategoTerm i_175 = null;
      IStrategoTerm j_175 = null;
      e_175 = term;
      if(c_175.value == null)
        break Fail1815;
      term = termFactory.makeTuple(c_175.value, extraction.constSortNoArgs16);
      IStrategoTerm term497 = term;
      Success719:
      { 
        Fail1816:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1816;
          if(true)
            break Success719;
        }
        term = term497;
        IStrategoTerm h_175 = null;
        h_175 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_175, extraction.const80);
        if(term == null)
          break Fail1815;
        if(true)
          break Fail1815;
      }
      term = e_175;
      j_175 = e_175;
      i_175 = term;
      term = j_175;
      IStrategoList list170;
      list170 = checkListTail(i_175);
      if(list170 == null)
        break Fail1815;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs69, list170);
      if(true)
        return term;
    }
    return null;
  }
}