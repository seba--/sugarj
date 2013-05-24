package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted377 extends Strategy 
{ 
  TermReference h_269;

  TermReference i_269;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1362:
    { 
      IStrategoTerm o_269 = null;
      IStrategoTerm p_269 = null;
      IStrategoTerm c_270 = null;
      IStrategoTerm d_270 = null;
      o_269 = term;
      if(h_269.value == null)
        break Fail1362;
      term = termFactory.makeTuple(h_269.value, extraction.constSortNoArgs71);
      IStrategoTerm term784 = term;
      Success431:
      { 
        Fail1363:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1363;
          if(true)
            break Success431;
        }
        term = term784;
        IStrategoTerm z_269 = null;
        z_269 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_269, extraction.const555);
        if(term == null)
          break Fail1362;
        if(true)
          break Fail1362;
      }
      term = o_269;
      p_269 = o_269;
      if(i_269.value == null)
        break Fail1362;
      term = termFactory.makeTuple(i_269.value, extraction.constSort6);
      IStrategoTerm term785 = term;
      Success432:
      { 
        Fail1364:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1364;
          if(true)
            break Success432;
        }
        term = term785;
        IStrategoTerm b_270 = null;
        b_270 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_270, extraction.const555);
        if(term == null)
          break Fail1362;
        if(true)
          break Fail1362;
      }
      term = p_269;
      d_270 = p_269;
      c_270 = term;
      term = d_270;
      IStrategoList list335;
      list335 = checkListTail(c_270);
      if(list335 == null)
        break Fail1362;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list335);
      if(true)
        return term;
    }
    return null;
  }
}