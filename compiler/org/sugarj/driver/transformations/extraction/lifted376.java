package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted376 extends Strategy 
{ 
  TermReference h_269;

  TermReference i_269;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1365:
    { 
      IStrategoTerm k_269 = null;
      IStrategoTerm n_269 = null;
      IStrategoTerm u_269 = null;
      IStrategoTerm v_269 = null;
      k_269 = term;
      if(h_269.value == null)
        break Fail1365;
      term = termFactory.makeTuple(h_269.value, extraction.constSortNoArgs299);
      IStrategoTerm term782 = term;
      Success433:
      { 
        Fail1366:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1366;
          if(true)
            break Success433;
        }
        term = term782;
        IStrategoTerm r_269 = null;
        r_269 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, r_269, extraction.const555);
        if(term == null)
          break Fail1365;
        if(true)
          break Fail1365;
      }
      term = k_269;
      n_269 = k_269;
      if(i_269.value == null)
        break Fail1365;
      term = termFactory.makeTuple(i_269.value, extraction.constSortNoArgs301);
      IStrategoTerm term783 = term;
      Success434:
      { 
        Fail1367:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1367;
          if(true)
            break Success434;
        }
        term = term783;
        IStrategoTerm t_269 = null;
        t_269 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_269, extraction.const555);
        if(term == null)
          break Fail1365;
        if(true)
          break Fail1365;
      }
      term = n_269;
      v_269 = n_269;
      u_269 = term;
      term = v_269;
      IStrategoList list334;
      list334 = checkListTail(u_269);
      if(list334 == null)
        break Fail1365;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs291, list334);
      if(true)
        return term;
    }
    return null;
  }
}