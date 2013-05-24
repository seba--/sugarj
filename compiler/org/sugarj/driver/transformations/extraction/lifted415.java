package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted415 extends Strategy 
{ 
  TermReference h_288;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1285:
    { 
      IStrategoTerm j_288 = null;
      IStrategoTerm u_297 = null;
      IStrategoTerm v_297 = null;
      j_288 = term;
      if(h_288.value == null)
        break Fail1285;
      term = termFactory.makeTuple(h_288.value, extraction.constSortNoArgs299);
      IStrategoTerm term824 = term;
      Success392:
      { 
        Fail1286:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1286;
          if(true)
            break Success392;
        }
        term = term824;
        IStrategoTerm l_288 = null;
        l_288 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, l_288, extraction.const587);
        if(term == null)
          break Fail1285;
        if(true)
          break Fail1285;
      }
      term = j_288;
      v_297 = j_288;
      u_297 = term;
      term = v_297;
      IStrategoList list373;
      list373 = checkListTail(u_297);
      if(list373 == null)
        break Fail1285;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs299, list373);
      if(true)
        return term;
    }
    return null;
  }
}