package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class log_mismatching_sort_error_0_1 extends Strategy 
{ 
  public static log_mismatching_sort_error_0_1 instance = new log_mismatching_sort_error_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_e_357)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference e_357 = new TermReference(ref_e_357);
    context.push("log_mismatching_sort_error_0_1");
    Fail341:
    { 
      IStrategoTerm term296 = term;
      Success289:
      { 
        Fail342:
        { 
          term = _2_0.instance.invoke(context, term, lifted40.instance, _Id.instance);
          if(term == null)
            break Fail342;
          term = $Swap_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail342;
          lifted42 lifted4210 = new lifted42();
          lifted4210.e_357 = e_357;
          term = debug_1_0.instance.invoke(context, term, lifted4210);
          if(term == null)
            break Fail342;
          if(true)
            break Success289;
        }
        term = term296;
        IStrategoTerm i_91 = null;
        IStrategoTerm k_91 = null;
        TermReference l_91 = new TermReference();
        IStrategoTerm o_91 = null;
        IStrategoTerm r_91 = null;
        IStrategoTerm q_91 = null;
        IStrategoTerm s_91 = null;
        term = _2_0.instance.invoke(context, term, get_syntax_sort_0_0.instance, _Id.instance);
        if(term == null)
          break Fail341;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail341;
        i_91 = term.getSubterm(0);
        k_91 = term.getSubterm(1);
        r_91 = term;
        term = write_to_string_0_0.instance.invoke(context, i_91);
        if(term == null)
          break Fail341;
        o_91 = term;
        s_91 = r_91;
        term = write_to_string_0_0.instance.invoke(context, k_91);
        if(term == null)
          break Fail341;
        q_91 = term;
        term = s_91;
        if(e_357.value == null)
          break Fail341;
        term = termFactory.makeTuple(extraction.const326, e_357.value, extraction.const327, extraction.const328, o_91, extraction.const329, extraction.const330, q_91);
        term = conc_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail341;
        if(l_91.value == null)
          l_91.value = term;
        else
          if(l_91.value != term && !l_91.value.match(term))
            break Fail341;
        term = extraction.const331;
        lifted45 lifted4510 = new lifted45();
        lifted4510.l_91 = l_91;
        term = debug_1_0.instance.invoke(context, term, lifted4510);
        if(term == null)
          break Fail341;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}