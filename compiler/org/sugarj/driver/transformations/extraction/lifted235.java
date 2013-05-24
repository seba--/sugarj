package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted235 extends Strategy 
{ 
  TermReference p_188;

  TermReference q_188;

  TermReference r_188;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1749:
    { 
      IStrategoTerm t_188 = null;
      IStrategoTerm u_188 = null;
      IStrategoTerm v_188 = null;
      IStrategoTerm c_189 = null;
      IStrategoTerm d_189 = null;
      t_188 = term;
      if(p_188.value == null)
        break Fail1749;
      term = termFactory.makeTuple(p_188.value, extraction.constSortNoArgs8);
      IStrategoTerm term538 = term;
      Success676:
      { 
        Fail1750:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1750;
          if(true)
            break Success676;
        }
        term = term538;
        IStrategoTerm x_188 = null;
        x_188 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_188, extraction.const454);
        if(term == null)
          break Fail1749;
        if(true)
          break Fail1749;
      }
      term = t_188;
      u_188 = t_188;
      if(q_188.value == null)
        break Fail1749;
      term = termFactory.makeTuple(q_188.value, extraction.constSort36);
      IStrategoTerm term539 = term;
      Success677:
      { 
        Fail1751:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1751;
          if(true)
            break Success677;
        }
        term = term539;
        IStrategoTerm z_188 = null;
        z_188 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_188, extraction.const454);
        if(term == null)
          break Fail1749;
        if(true)
          break Fail1749;
      }
      term = u_188;
      v_188 = u_188;
      if(r_188.value == null)
        break Fail1749;
      term = termFactory.makeTuple(r_188.value, extraction.constSort36);
      IStrategoTerm term540 = term;
      Success678:
      { 
        Fail1752:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1752;
          if(true)
            break Success678;
        }
        term = term540;
        IStrategoTerm b_189 = null;
        b_189 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_189, extraction.const454);
        if(term == null)
          break Fail1749;
        if(true)
          break Fail1749;
      }
      term = v_188;
      d_189 = v_188;
      c_189 = term;
      term = d_189;
      IStrategoList list193;
      list193 = checkListTail(c_189);
      if(list193 == null)
        break Fail1749;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs169, list193);
      if(true)
        return term;
    }
    return null;
  }
}