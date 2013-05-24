package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted133 extends Strategy 
{ 
  TermReference c_129;

  TermReference d_129;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1982:
    { 
      IStrategoTerm f_129 = null;
      IStrategoTerm g_129 = null;
      IStrategoTerm r_129 = null;
      IStrategoTerm s_129 = null;
      f_129 = term;
      if(c_129.value == null)
        break Fail1982;
      term = termFactory.makeTuple(c_129.value, extraction.constSortNoArgs94);
      IStrategoTerm term408 = term;
      Success807:
      { 
        Fail1983:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1983;
          if(true)
            break Success807;
        }
        term = term408;
        IStrategoTerm l_129 = null;
        l_129 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, l_129, extraction.const128);
        if(term == null)
          break Fail1982;
        if(true)
          break Fail1982;
      }
      term = f_129;
      g_129 = f_129;
      if(d_129.value == null)
        break Fail1982;
      term = termFactory.makeTuple(d_129.value, extraction.constSortNoArgs115);
      IStrategoTerm term409 = term;
      Success808:
      { 
        Fail1984:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1984;
          if(true)
            break Success808;
        }
        term = term409;
        IStrategoTerm q_129 = null;
        q_129 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_129, extraction.const128);
        if(term == null)
          break Fail1982;
        if(true)
          break Fail1982;
      }
      term = g_129;
      s_129 = g_129;
      r_129 = term;
      term = s_129;
      IStrategoList list91;
      list91 = checkListTail(r_129);
      if(list91 == null)
        break Fail1982;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs117, list91);
      if(true)
        return term;
    }
    return null;
  }
}