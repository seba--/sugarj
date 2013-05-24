package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted166 extends Strategy 
{ 
  TermReference s_149;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1918:
    { 
      IStrategoTerm v_149 = null;
      IStrategoTerm i_150 = null;
      IStrategoTerm j_150 = null;
      v_149 = term;
      if(s_149.value == null)
        break Fail1918;
      term = termFactory.makeTuple(s_149.value, extraction.constSortNoArgs6);
      IStrategoTerm term440 = term;
      Success776:
      { 
        Fail1919:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1919;
          if(true)
            break Success776;
        }
        term = term440;
        IStrategoTerm h_150 = null;
        h_150 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_150, extraction.const416);
        if(term == null)
          break Fail1918;
        if(true)
          break Fail1918;
      }
      term = v_149;
      j_150 = v_149;
      i_150 = term;
      term = j_150;
      IStrategoList list124;
      list124 = checkListTail(i_150);
      if(list124 == null)
        break Fail1918;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs144, list124);
      if(true)
        return term;
    }
    return null;
  }
}