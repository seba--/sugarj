package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted66 extends Strategy 
{ 
  TermReference t_99;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2138:
    { 
      IStrategoTerm w_99 = null;
      IStrategoTerm d_100 = null;
      IStrategoTerm e_100 = null;
      w_99 = term;
      if(t_99.value == null)
        break Fail2138;
      term = termFactory.makeTuple(t_99.value, extraction.constSortNoArgs74);
      IStrategoTerm term320 = term;
      Success896:
      { 
        Fail2139:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2139;
          if(true)
            break Success896;
        }
        term = term320;
        IStrategoTerm c_100 = null;
        c_100 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_100, extraction.const345);
        if(term == null)
          break Fail2138;
        if(true)
          break Fail2138;
      }
      term = w_99;
      e_100 = w_99;
      d_100 = term;
      term = e_100;
      IStrategoList list24;
      list24 = checkListTail(d_100);
      if(list24 == null)
        break Fail2138;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list24);
      if(true)
        return term;
    }
    return null;
  }
}