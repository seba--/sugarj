package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted248 extends Strategy 
{ 
  TermReference v_195;

  TermReference w_195;

  TermReference x_195;

  TermReference y_195;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1701:
    { 
      IStrategoTerm e_196 = null;
      IStrategoTerm f_196 = null;
      IStrategoTerm g_196 = null;
      IStrategoTerm h_196 = null;
      IStrategoTerm c_197 = null;
      IStrategoTerm d_197 = null;
      e_196 = term;
      if(v_195.value == null)
        break Fail1701;
      term = termFactory.makeTuple(v_195.value, extraction.constSortNoArgs0);
      IStrategoTerm term572 = term;
      Success641:
      { 
        Fail1702:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1702;
          if(true)
            break Success641;
        }
        term = term572;
        IStrategoTerm t_196 = null;
        t_196 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_196, extraction.const460);
        if(term == null)
          break Fail1701;
        if(true)
          break Fail1701;
      }
      term = e_196;
      f_196 = e_196;
      if(w_195.value == null)
        break Fail1701;
      term = termFactory.makeTuple(w_195.value, extraction.constSortNoArgs103);
      IStrategoTerm term573 = term;
      Success642:
      { 
        Fail1703:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1703;
          if(true)
            break Success642;
        }
        term = term573;
        IStrategoTerm x_196 = null;
        x_196 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_196, extraction.const460);
        if(term == null)
          break Fail1701;
        if(true)
          break Fail1701;
      }
      term = f_196;
      g_196 = f_196;
      if(x_195.value == null)
        break Fail1701;
      term = termFactory.makeTuple(x_195.value, extraction.constSortNoArgs103);
      IStrategoTerm term574 = term;
      Success643:
      { 
        Fail1704:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1704;
          if(true)
            break Success643;
        }
        term = term574;
        IStrategoTerm z_196 = null;
        z_196 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_196, extraction.const460);
        if(term == null)
          break Fail1701;
        if(true)
          break Fail1701;
      }
      term = g_196;
      h_196 = g_196;
      if(y_195.value == null)
        break Fail1701;
      term = termFactory.makeTuple(y_195.value, extraction.constSortNoArgs0);
      IStrategoTerm term575 = term;
      Success644:
      { 
        Fail1705:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1705;
          if(true)
            break Success644;
        }
        term = term575;
        IStrategoTerm b_197 = null;
        b_197 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_197, extraction.const460);
        if(term == null)
          break Fail1701;
        if(true)
          break Fail1701;
      }
      term = h_196;
      d_197 = h_196;
      c_197 = term;
      term = d_197;
      IStrategoList list206;
      list206 = checkListTail(c_197);
      if(list206 == null)
        break Fail1701;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list206);
      if(true)
        return term;
    }
    return null;
  }
}