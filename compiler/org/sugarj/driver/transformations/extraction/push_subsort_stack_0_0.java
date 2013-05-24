package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class push_subsort_stack_0_0 extends Strategy 
{ 
  public static push_subsort_stack_0_0 instance = new push_subsort_stack_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("push_subsort_stack_0_0");
    Fail100:
    { 
      IStrategoTerm h_60 = null;
      IStrategoTerm i_60 = null;
      IStrategoTerm k_60 = null;
      IStrategoTerm o_60 = null;
      IStrategoTerm p_60 = null;
      IStrategoTerm q_60 = null;
      IStrategoTerm r_60 = null;
      IStrategoTerm t_60 = null;
      IStrategoTerm u_60 = null;
      IStrategoTerm v_60 = null;
      i_60 = term;
      term = strip_annos_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail100;
      h_60 = term;
      IStrategoTerm term68 = term;
      Success61:
      { 
        Fail101:
        { 
          term = $Subsort_$Stack_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail101;
          term = termFactory.makeTuple(h_60, term);
          IStrategoTerm term69 = term;
          Success62:
          { 
            Fail102:
            { 
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail102;
              { 
                if(true)
                  break Fail101;
                if(true)
                  break Success62;
              }
            }
            term = term69;
          }
          if(true)
            break Success61;
        }
        term = debug_1_0.instance.invoke(context, term68, lifted26.instance);
        if(term == null)
          break Fail100;
        if(true)
          break Fail100;
      }
      p_60 = term;
      term = $Subsort_$Stack_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail100;
      o_60 = term;
      term = p_60;
      IStrategoList list3;
      list3 = checkListTail(o_60);
      if(list3 == null)
        break Fail100;
      term = (IStrategoTerm)termFactory.makeListCons(h_60, list3);
      k_60 = term;
      t_60 = term;
      q_60 = extraction.const47;
      u_60 = t_60;
      r_60 = extraction.constCons0;
      v_60 = u_60;
      term = termFactory.makeTuple(extraction.const48, k_60);
      term = dr_set_rule_0_3.instance.invoke(context, v_60, q_60, r_60, term);
      if(term == null)
        break Fail100;
      term = i_60;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}