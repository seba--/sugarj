package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bigbagof_$Subsort_$Stack_0_0 extends Strategy 
{ 
  public static bigbagof_$Subsort_$Stack_0_0 instance = new bigbagof_$Subsort_$Stack_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_Subsort_Stack_0_0");
    Fail1103:
    { 
      TermReference m_355 = new TermReference();
      if(m_355.value == null)
        m_355.value = term;
      else
        if(m_355.value != term && !m_355.value.match(term))
          break Fail1103;
      Success301:
      { 
        Fail1104:
        { 
          IStrategoTerm p_355 = null;
          IStrategoTerm r_355 = null;
          IStrategoTerm s_355 = null;
          r_355 = term;
          p_355 = extraction.const47;
          s_355 = r_355;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, s_355, p_355, extraction.constCons0);
          if(term == null)
            break Fail1104;
          if(true)
            break Success301;
        }
        term = extraction.constNil0;
      }
      lifted500 lifted5000 = new lifted500();
      lifted5000.m_355 = m_355;
      term = filter_1_0.instance.invoke(context, term, lifted5000);
      if(term == null)
        break Fail1103;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}