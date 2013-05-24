package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted125 extends Strategy 
{ 
  TermReference z_123;

  TermReference b_124;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2007:
    { 
      IStrategoTerm d_124 = null;
      IStrategoTerm e_124 = null;
      IStrategoTerm p_124 = null;
      IStrategoTerm q_124 = null;
      d_124 = term;
      if(z_123.value == null)
        break Fail2007;
      term = termFactory.makeTuple(z_123.value, extraction.constSortNoArgs14);
      IStrategoTerm term391 = term;
      Success824:
      { 
        Fail2008:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2008;
          if(true)
            break Success824;
        }
        term = term391;
        IStrategoTerm j_124 = null;
        j_124 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, j_124, extraction.const384);
        if(term == null)
          break Fail2007;
        if(true)
          break Fail2007;
      }
      term = d_124;
      e_124 = d_124;
      if(b_124.value == null)
        break Fail2007;
      term = termFactory.makeTuple(b_124.value, extraction.constSort25);
      IStrategoTerm term392 = term;
      Success825:
      { 
        Fail2009:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2009;
          if(true)
            break Success825;
        }
        term = term392;
        IStrategoTerm o_124 = null;
        o_124 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_124, extraction.const384);
        if(term == null)
          break Fail2007;
        if(true)
          break Fail2007;
      }
      term = e_124;
      q_124 = e_124;
      p_124 = term;
      term = q_124;
      IStrategoList list83;
      list83 = checkListTail(p_124);
      if(list83 == null)
        break Fail2007;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs67, list83);
      if(true)
        return term;
    }
    return null;
  }
}