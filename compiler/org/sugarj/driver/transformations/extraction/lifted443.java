package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted443 extends Strategy 
{ 
  TermReference t_310;

  TermReference u_310;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1224:
    { 
      IStrategoTerm w_310 = null;
      IStrategoTerm x_310 = null;
      IStrategoTerm c_311 = null;
      IStrategoTerm d_311 = null;
      w_310 = term;
      if(t_310.value == null)
        break Fail1224;
      term = termFactory.makeTuple(t_310.value, extraction.constSortNoArgs72);
      IStrategoTerm term856 = term;
      Success359:
      { 
        Fail1225:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1225;
          if(true)
            break Success359;
        }
        term = term856;
        IStrategoTerm z_310 = null;
        z_310 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_310, extraction.const611);
        if(term == null)
          break Fail1224;
        if(true)
          break Fail1224;
      }
      term = w_310;
      x_310 = w_310;
      if(u_310.value == null)
        break Fail1224;
      term = termFactory.makeTuple(u_310.value, extraction.constSortNoArgs71);
      IStrategoTerm term857 = term;
      Success360:
      { 
        Fail1226:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1226;
          if(true)
            break Success360;
        }
        term = term857;
        IStrategoTerm b_311 = null;
        b_311 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_311, extraction.const611);
        if(term == null)
          break Fail1224;
        if(true)
          break Fail1224;
      }
      term = x_310;
      d_311 = x_310;
      c_311 = term;
      term = d_311;
      IStrategoList list401;
      list401 = checkListTail(c_311);
      if(list401 == null)
        break Fail1224;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list401);
      if(true)
        return term;
    }
    return null;
  }
}