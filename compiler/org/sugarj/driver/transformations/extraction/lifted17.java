package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted17 extends Strategy 
{ 
  TermReference y_53;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2199:
    { 
      IStrategoTerm z_53 = null;
      z_53 = term;
      term = get_analysis_data_annotation_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2199;
      term = hashtable_getlist_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2199;
      if(y_53.value == null)
        y_53.value = term;
      else
        if(y_53.value != term && !y_53.value.match(term))
          break Fail2199;
      term = z_53;
      IStrategoTerm term12 = term;
      Success923:
      { 
        Fail2200:
        { 
          IStrategoTerm a_54 = null;
          a_54 = term;
          if(y_53.value == null)
            break Fail2200;
          term = y_53.value;
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail2200;
          term = a_54;
          { 
            term = rm_analysis_data_annotation_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail2199;
            if(true)
              break Success923;
          }
        }
        term = term12;
        IStrategoTerm c_54 = null;
        c_54 = term;
        if(y_53.value == null)
          break Fail2199;
        term = strip_annos_0_0.instance.invoke(context, y_53.value);
        if(term == null)
          break Fail2199;
        term = put_analysis_data_annotation_0_1.instance.invoke(context, c_54, term);
        if(term == null)
          break Fail2199;
      }
      if(true)
        return term;
    }
    return null;
  }
}