package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted179 extends Strategy 
{ 
  TermReference e_156;

  TermReference f_156;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1887:
    { 
      IStrategoTerm k_156 = null;
      IStrategoTerm l_156 = null;
      IStrategoTerm s_156 = null;
      IStrategoTerm t_156 = null;
      k_156 = term;
      if(e_156.value == null)
        break Fail1887;
      term = termFactory.makeTuple(e_156.value, extraction.constSortNoArgs14);
      IStrategoTerm term457 = term;
      Success758:
      { 
        Fail1888:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1888;
          if(true)
            break Success758;
        }
        term = term457;
        IStrategoTerm n_156 = null;
        n_156 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_156, extraction.const418);
        if(term == null)
          break Fail1887;
        if(true)
          break Fail1887;
      }
      term = k_156;
      l_156 = k_156;
      if(f_156.value == null)
        break Fail1887;
      term = termFactory.makeTuple(f_156.value, extraction.constSort29);
      IStrategoTerm term458 = term;
      Success759:
      { 
        Fail1889:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1889;
          if(true)
            break Success759;
        }
        term = term458;
        IStrategoTerm r_156 = null;
        r_156 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, r_156, extraction.const418);
        if(term == null)
          break Fail1887;
        if(true)
          break Fail1887;
      }
      term = l_156;
      t_156 = l_156;
      s_156 = term;
      term = t_156;
      IStrategoList list137;
      list137 = checkListTail(s_156);
      if(list137 == null)
        break Fail1887;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs67, list137);
      if(true)
        return term;
    }
    return null;
  }
}