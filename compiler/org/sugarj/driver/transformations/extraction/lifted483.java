package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted483 extends Strategy 
{ 
  TermReference a_331;

  TermReference b_331;

  TermReference c_331;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1131:
    { 
      IStrategoTerm e_331 = null;
      IStrategoTerm f_331 = null;
      IStrategoTerm g_331 = null;
      IStrategoTerm o_331 = null;
      IStrategoTerm q_331 = null;
      e_331 = term;
      if(a_331.value == null)
        break Fail1131;
      term = termFactory.makeTuple(a_331.value, extraction.constSort52);
      IStrategoTerm term908 = term;
      Success306:
      { 
        Fail1132:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1132;
          if(true)
            break Success306;
        }
        term = term908;
        IStrategoTerm i_331 = null;
        i_331 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_331, extraction.const648);
        if(term == null)
          break Fail1131;
        if(true)
          break Fail1131;
      }
      term = e_331;
      f_331 = e_331;
      if(b_331.value == null)
        break Fail1131;
      term = termFactory.makeTuple(b_331.value, extraction.constSortNoArgs318);
      IStrategoTerm term909 = term;
      Success307:
      { 
        Fail1133:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1133;
          if(true)
            break Success307;
        }
        term = term909;
        IStrategoTerm k_331 = null;
        k_331 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, k_331, extraction.const648);
        if(term == null)
          break Fail1131;
        if(true)
          break Fail1131;
      }
      term = f_331;
      g_331 = f_331;
      if(c_331.value == null)
        break Fail1131;
      term = termFactory.makeTuple(c_331.value, extraction.constSort53);
      IStrategoTerm term910 = term;
      Success308:
      { 
        Fail1134:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1134;
          if(true)
            break Success308;
        }
        term = term910;
        IStrategoTerm n_331 = null;
        n_331 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_331, extraction.const648);
        if(term == null)
          break Fail1131;
        if(true)
          break Fail1131;
      }
      term = g_331;
      q_331 = g_331;
      o_331 = term;
      term = q_331;
      IStrategoList list441;
      list441 = checkListTail(o_331);
      if(list441 == null)
        break Fail1131;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs314, list441);
      if(true)
        return term;
    }
    return null;
  }
}