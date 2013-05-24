package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted285 extends Strategy 
{ 
  TermReference a_217;

  TermReference e_217;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1600:
    { 
      IStrategoTerm i_217 = null;
      IStrategoTerm j_217 = null;
      IStrategoTerm u_217 = null;
      IStrategoTerm v_217 = null;
      i_217 = term;
      if(a_217.value == null)
        break Fail1600;
      term = termFactory.makeTuple(a_217.value, extraction.constSortNoArgs0);
      IStrategoTerm term638 = term;
      Success577:
      { 
        Fail1601:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1601;
          if(true)
            break Success577;
        }
        term = term638;
        IStrategoTerm o_217 = null;
        o_217 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_217, extraction.const490);
        if(term == null)
          break Fail1600;
        if(true)
          break Fail1600;
      }
      term = i_217;
      j_217 = i_217;
      if(e_217.value == null)
        break Fail1600;
      term = termFactory.makeTuple(e_217.value, extraction.constSort38);
      IStrategoTerm term639 = term;
      Success578:
      { 
        Fail1602:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1602;
          if(true)
            break Success578;
        }
        term = term639;
        IStrategoTerm t_217 = null;
        t_217 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_217, extraction.const490);
        if(term == null)
          break Fail1600;
        if(true)
          break Fail1600;
      }
      term = j_217;
      v_217 = j_217;
      u_217 = term;
      term = v_217;
      IStrategoList list243;
      list243 = checkListTail(u_217);
      if(list243 == null)
        break Fail1600;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list243);
      if(true)
        return term;
    }
    return null;
  }
}