package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted259 extends Strategy 
{ 
  TermReference z_202;

  TermReference a_203;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1665:
    { 
      IStrategoTerm c_203 = null;
      IStrategoTerm d_203 = null;
      IStrategoTerm i_203 = null;
      IStrategoTerm j_203 = null;
      c_203 = term;
      if(z_202.value == null)
        break Fail1665;
      term = termFactory.makeTuple(z_202.value, extraction.constSortNoArgs41);
      IStrategoTerm term599 = term;
      Success616:
      { 
        Fail1666:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1666;
          if(true)
            break Success616;
        }
        term = term599;
        IStrategoTerm f_203 = null;
        f_203 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_203, extraction.const467);
        if(term == null)
          break Fail1665;
        if(true)
          break Fail1665;
      }
      term = c_203;
      d_203 = c_203;
      if(a_203.value == null)
        break Fail1665;
      term = termFactory.makeTuple(a_203.value, extraction.constSortNoArgs41);
      IStrategoTerm term600 = term;
      Success617:
      { 
        Fail1667:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1667;
          if(true)
            break Success617;
        }
        term = term600;
        IStrategoTerm h_203 = null;
        h_203 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_203, extraction.const467);
        if(term == null)
          break Fail1665;
        if(true)
          break Fail1665;
      }
      term = d_203;
      j_203 = d_203;
      i_203 = term;
      term = j_203;
      IStrategoList list217;
      list217 = checkListTail(i_203);
      if(list217 == null)
        break Fail1665;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs179, list217);
      if(true)
        return term;
    }
    return null;
  }
}