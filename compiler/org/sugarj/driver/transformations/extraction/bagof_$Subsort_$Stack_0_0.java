package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bagof_$Subsort_$Stack_0_0 extends Strategy 
{ 
  public static bagof_$Subsort_$Stack_0_0 instance = new bagof_$Subsort_$Stack_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_Subsort_Stack_0_0");
    Fail1108:
    { 
      TermReference m_356 = new TermReference();
      if(m_356.value == null)
        m_356.value = term;
      else
        if(m_356.value != term && !m_356.value.match(term))
          break Fail1108;
      Success303:
      { 
        Fail1109:
        { 
          IStrategoTerm p_356 = null;
          IStrategoTerm r_356 = null;
          IStrategoTerm s_356 = null;
          r_356 = term;
          p_356 = extraction.const47;
          s_356 = r_356;
          term = dr_lookup_rule_0_2.instance.invoke(context, s_356, p_356, extraction.constCons0);
          if(term == null)
            break Fail1109;
          if(true)
            break Success303;
        }
        term = extraction.constNil0;
      }
      lifted503 lifted5030 = new lifted503();
      lifted5030.m_356 = m_356;
      term = filter_1_0.instance.invoke(context, term, lifted5030);
      if(term == null)
        break Fail1108;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}