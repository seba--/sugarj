package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted239 extends Strategy 
{ 
  TermReference r_190;

  TermReference s_190;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1738:
    { 
      IStrategoTerm u_190 = null;
      IStrategoTerm v_190 = null;
      IStrategoTerm c_191 = null;
      IStrategoTerm d_191 = null;
      u_190 = term;
      if(r_190.value == null)
        break Fail1738;
      term = termFactory.makeTuple(r_190.value, extraction.constSortNoArgs103);
      IStrategoTerm term546 = term;
      Success669:
      { 
        Fail1739:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1739;
          if(true)
            break Success669;
        }
        term = term546;
        IStrategoTerm z_190 = null;
        z_190 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_190, extraction.const456);
        if(term == null)
          break Fail1738;
        if(true)
          break Fail1738;
      }
      term = u_190;
      v_190 = u_190;
      if(s_190.value == null)
        break Fail1738;
      term = termFactory.makeTuple(s_190.value, extraction.constSortNoArgs0);
      IStrategoTerm term547 = term;
      Success670:
      { 
        Fail1740:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1740;
          if(true)
            break Success670;
        }
        term = term547;
        IStrategoTerm b_191 = null;
        b_191 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_191, extraction.const456);
        if(term == null)
          break Fail1738;
        if(true)
          break Fail1738;
      }
      term = v_190;
      d_191 = v_190;
      c_191 = term;
      term = d_191;
      IStrategoList list197;
      list197 = checkListTail(c_191);
      if(list197 == null)
        break Fail1738;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list197);
      if(true)
        return term;
    }
    return null;
  }
}