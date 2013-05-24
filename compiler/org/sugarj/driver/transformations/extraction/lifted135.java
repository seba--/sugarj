package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted135 extends Strategy 
{ 
  TermReference z_129;

  TermReference a_130;

  TermReference c_130;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1974:
    { 
      IStrategoTerm i_130 = null;
      IStrategoTerm j_130 = null;
      IStrategoTerm k_130 = null;
      IStrategoTerm j_131 = null;
      IStrategoTerm l_131 = null;
      i_130 = term;
      if(z_129.value == null)
        break Fail1974;
      term = termFactory.makeTuple(z_129.value, extraction.constSortNoArgs94);
      IStrategoTerm term413 = term;
      Success801:
      { 
        Fail1975:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1975;
          if(true)
            break Success801;
        }
        term = term413;
        IStrategoTerm a_131 = null;
        a_131 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_131, extraction.const390);
        if(term == null)
          break Fail1974;
        if(true)
          break Fail1974;
      }
      term = i_130;
      j_130 = i_130;
      if(a_130.value == null)
        break Fail1974;
      term = termFactory.makeTuple(a_130.value, extraction.constSortNoArgs18);
      IStrategoTerm term414 = term;
      Success802:
      { 
        Fail1976:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1976;
          if(true)
            break Success802;
        }
        term = term414;
        IStrategoTerm e_131 = null;
        e_131 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_131, extraction.const390);
        if(term == null)
          break Fail1974;
        if(true)
          break Fail1974;
      }
      term = j_130;
      k_130 = j_130;
      if(c_130.value == null)
        break Fail1974;
      term = termFactory.makeTuple(c_130.value, extraction.constSortNoArgs115);
      IStrategoTerm term415 = term;
      Success803:
      { 
        Fail1977:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1977;
          if(true)
            break Success803;
        }
        term = term415;
        IStrategoTerm i_131 = null;
        i_131 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_131, extraction.const390);
        if(term == null)
          break Fail1974;
        if(true)
          break Fail1974;
      }
      term = k_130;
      l_131 = k_130;
      j_131 = term;
      term = l_131;
      IStrategoList list93;
      list93 = checkListTail(j_131);
      if(list93 == null)
        break Fail1974;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs117, list93);
      if(true)
        return term;
    }
    return null;
  }
}