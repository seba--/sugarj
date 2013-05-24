package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted136 extends Strategy 
{ 
  TermReference x_131;

  TermReference y_131;

  TermReference z_131;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1970:
    { 
      IStrategoTerm c_132 = null;
      IStrategoTerm d_132 = null;
      IStrategoTerm e_132 = null;
      IStrategoTerm o_132 = null;
      IStrategoTerm q_132 = null;
      c_132 = term;
      if(x_131.value == null)
        break Fail1970;
      term = termFactory.makeTuple(x_131.value, extraction.constSortNoArgs94);
      IStrategoTerm term416 = term;
      Success798:
      { 
        Fail1971:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1971;
          if(true)
            break Success798;
        }
        term = term416;
        IStrategoTerm g_132 = null;
        g_132 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_132, extraction.const391);
        if(term == null)
          break Fail1970;
        if(true)
          break Fail1970;
      }
      term = c_132;
      d_132 = c_132;
      if(y_131.value == null)
        break Fail1970;
      term = termFactory.makeTuple(y_131.value, extraction.constSortNoArgs18);
      IStrategoTerm term417 = term;
      Success799:
      { 
        Fail1972:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1972;
          if(true)
            break Success799;
        }
        term = term417;
        IStrategoTerm i_132 = null;
        i_132 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_132, extraction.const391);
        if(term == null)
          break Fail1970;
        if(true)
          break Fail1970;
      }
      term = d_132;
      e_132 = d_132;
      if(z_131.value == null)
        break Fail1970;
      term = termFactory.makeTuple(z_131.value, extraction.constSortNoArgs115);
      IStrategoTerm term418 = term;
      Success800:
      { 
        Fail1973:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1973;
          if(true)
            break Success800;
        }
        term = term418;
        IStrategoTerm m_132 = null;
        m_132 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_132, extraction.const391);
        if(term == null)
          break Fail1970;
        if(true)
          break Fail1970;
      }
      term = e_132;
      q_132 = e_132;
      o_132 = term;
      term = q_132;
      IStrategoList list94;
      list94 = checkListTail(o_132);
      if(list94 == null)
        break Fail1970;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs117, list94);
      if(true)
        return term;
    }
    return null;
  }
}