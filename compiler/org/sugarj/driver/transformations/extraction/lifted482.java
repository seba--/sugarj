package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted482 extends Strategy 
{ 
  TermReference c_330;

  TermReference d_330;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1135:
    { 
      IStrategoTerm h_330 = null;
      IStrategoTerm i_330 = null;
      IStrategoTerm u_330 = null;
      IStrategoTerm v_330 = null;
      h_330 = term;
      if(c_330.value == null)
        break Fail1135;
      term = termFactory.makeTuple(c_330.value, extraction.constSortNoArgs78);
      IStrategoTerm term906 = term;
      Success309:
      { 
        Fail1136:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1136;
          if(true)
            break Success309;
        }
        term = term906;
        IStrategoTerm q_330 = null;
        q_330 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_330, extraction.const649);
        if(term == null)
          break Fail1135;
        if(true)
          break Fail1135;
      }
      term = h_330;
      i_330 = h_330;
      if(d_330.value == null)
        break Fail1135;
      term = termFactory.makeTuple(d_330.value, extraction.constSortNoArgs78);
      IStrategoTerm term907 = term;
      Success310:
      { 
        Fail1137:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1137;
          if(true)
            break Success310;
        }
        term = term907;
        IStrategoTerm t_330 = null;
        t_330 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_330, extraction.const649);
        if(term == null)
          break Fail1135;
        if(true)
          break Fail1135;
      }
      term = i_330;
      v_330 = i_330;
      u_330 = term;
      term = v_330;
      IStrategoList list440;
      list440 = checkListTail(u_330);
      if(list440 == null)
        break Fail1135;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs316, list440);
      if(true)
        return term;
    }
    return null;
  }
}