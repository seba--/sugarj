package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted262 extends Strategy 
{ 
  TermReference v_204;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1655:
    { 
      IStrategoTerm z_204 = null;
      IStrategoTerm c_205 = null;
      IStrategoTerm e_205 = null;
      z_204 = term;
      if(v_204.value == null)
        break Fail1655;
      term = termFactory.makeTuple(v_204.value, extraction.constSortNoArgs0);
      IStrategoTerm term607 = term;
      Success609:
      { 
        Fail1656:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1656;
          if(true)
            break Success609;
        }
        term = term607;
        IStrategoTerm b_205 = null;
        b_205 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_205, extraction.const468);
        if(term == null)
          break Fail1655;
        if(true)
          break Fail1655;
      }
      term = z_204;
      e_205 = z_204;
      c_205 = term;
      term = e_205;
      IStrategoList list220;
      list220 = checkListTail(c_205);
      if(list220 == null)
        break Fail1655;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs177, list220);
      if(true)
        return term;
    }
    return null;
  }
}