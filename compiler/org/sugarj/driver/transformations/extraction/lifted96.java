package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted96 extends Strategy 
{ 
  TermReference q_112;

  TermReference r_112;

  TermReference s_112;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2067:
    { 
      IStrategoTerm u_112 = null;
      IStrategoTerm v_112 = null;
      IStrategoTerm w_112 = null;
      IStrategoTerm d_113 = null;
      IStrategoTerm e_113 = null;
      u_112 = term;
      if(q_112.value == null)
        break Fail2067;
      term = termFactory.makeTuple(q_112.value, extraction.constSortNoArgs18);
      IStrategoTerm term359 = term;
      Success855:
      { 
        Fail2068:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2068;
          if(true)
            break Success855;
        }
        term = term359;
        IStrategoTerm y_112 = null;
        y_112 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_112, extraction.const366);
        if(term == null)
          break Fail2067;
        if(true)
          break Fail2067;
      }
      term = u_112;
      v_112 = u_112;
      if(r_112.value == null)
        break Fail2067;
      term = termFactory.makeTuple(r_112.value, extraction.constSortNoArgs91);
      IStrategoTerm term360 = term;
      Success856:
      { 
        Fail2069:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2069;
          if(true)
            break Success856;
        }
        term = term360;
        IStrategoTerm a_113 = null;
        a_113 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_113, extraction.const366);
        if(term == null)
          break Fail2067;
        if(true)
          break Fail2067;
      }
      term = v_112;
      w_112 = v_112;
      if(s_112.value == null)
        break Fail2067;
      term = termFactory.makeTuple(s_112.value, extraction.constSort21);
      IStrategoTerm term361 = term;
      Success857:
      { 
        Fail2070:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2070;
          if(true)
            break Success857;
        }
        term = term361;
        IStrategoTerm c_113 = null;
        c_113 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_113, extraction.const366);
        if(term == null)
          break Fail2067;
        if(true)
          break Fail2067;
      }
      term = w_112;
      e_113 = w_112;
      d_113 = term;
      term = e_113;
      IStrategoList list54;
      list54 = checkListTail(d_113);
      if(list54 == null)
        break Fail2067;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs146, list54);
      if(true)
        return term;
    }
    return null;
  }
}