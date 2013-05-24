package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted466 extends Strategy 
{ 
  TermReference v_322;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1170:
    { 
      IStrategoTerm z_322 = null;
      IStrategoTerm d_323 = null;
      IStrategoTerm h_323 = null;
      z_322 = term;
      if(v_322.value == null)
        break Fail1170;
      term = termFactory.makeTuple(v_322.value, extraction.constSortNoArgs38);
      IStrategoTerm term888 = term;
      Success328:
      { 
        Fail1171:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1171;
          if(true)
            break Success328;
        }
        term = term888;
        IStrategoTerm c_323 = null;
        c_323 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_323, extraction.const633);
        if(term == null)
          break Fail1170;
        if(true)
          break Fail1170;
      }
      term = z_322;
      h_323 = z_322;
      d_323 = term;
      term = h_323;
      IStrategoList list424;
      list424 = checkListTail(d_323);
      if(list424 == null)
        break Fail1170;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs288, list424);
      if(true)
        return term;
    }
    return null;
  }
}