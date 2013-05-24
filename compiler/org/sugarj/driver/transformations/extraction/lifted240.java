package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted240 extends Strategy 
{ 
  TermReference r_190;

  TermReference s_190;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1735:
    { 
      IStrategoTerm w_190 = null;
      IStrategoTerm x_190 = null;
      IStrategoTerm j_191 = null;
      IStrategoTerm l_191 = null;
      w_190 = term;
      if(r_190.value == null)
        break Fail1735;
      term = termFactory.makeTuple(r_190.value, extraction.constSortNoArgs103);
      IStrategoTerm term548 = term;
      Success667:
      { 
        Fail1736:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1736;
          if(true)
            break Success667;
        }
        term = term548;
        IStrategoTerm f_191 = null;
        f_191 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_191, extraction.const456);
        if(term == null)
          break Fail1735;
        if(true)
          break Fail1735;
      }
      term = w_190;
      x_190 = w_190;
      if(s_190.value == null)
        break Fail1735;
      term = termFactory.makeTuple(s_190.value, extraction.constSortNoArgs0);
      IStrategoTerm term549 = term;
      Success668:
      { 
        Fail1737:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1737;
          if(true)
            break Success668;
        }
        term = term549;
        IStrategoTerm i_191 = null;
        i_191 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_191, extraction.const456);
        if(term == null)
          break Fail1735;
        if(true)
          break Fail1735;
      }
      term = x_190;
      l_191 = x_190;
      j_191 = term;
      term = l_191;
      IStrategoList list198;
      list198 = checkListTail(j_191);
      if(list198 == null)
        break Fail1735;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list198);
      if(true)
        return term;
    }
    return null;
  }
}