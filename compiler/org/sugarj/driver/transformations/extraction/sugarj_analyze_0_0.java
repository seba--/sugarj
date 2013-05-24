package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class sugarj_analyze_0_0 extends Strategy 
{ 
  public static sugarj_analyze_0_0 instance = new sugarj_analyze_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("sugarj_analyze_0_0");
    Fail27:
    { 
      IStrategoTerm q_52 = null;
      IStrategoTerm r_52 = null;
      IStrategoTerm s_52 = null;
      IStrategoTerm t_52 = null;
      IStrategoTerm w_52 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27;
      s_52 = term.getSubterm(0);
      w_52 = term;
      IStrategoTerm term10 = term;
      Success7:
      { 
        Fail28:
        { 
          term = editor_init_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28;
          term = collect_all_2_0.instance.invoke(context, s_52, constraint_error_0_0.instance, conc_0_0.instance);
          if(term == null)
            break Fail28;
          q_52 = term;
          term = collect_all_2_0.instance.invoke(context, s_52, constraint_warning_0_0.instance, conc_0_0.instance);
          if(term == null)
            break Fail28;
          r_52 = term;
          term = collect_all_2_0.instance.invoke(context, s_52, constraint_note_0_0.instance, conc_0_0.instance);
          if(term == null)
            break Fail28;
          t_52 = term;
          if(true)
            break Success7;
        }
        term = term10;
        IStrategoTerm u_52 = null;
        IStrategoTerm v_52 = null;
        IStrategoTerm y_52 = null;
        u_52 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail27;
        v_52 = term;
        y_52 = u_52;
        term = report_with_failure_0_2.instance.invoke(context, y_52, extraction.const3, v_52);
        if(term == null)
          break Fail27;
      }
      term = w_52;
      if(q_52 == null || (r_52 == null || t_52 == null))
        break Fail27;
      term = termFactory.makeTuple(s_52, q_52, r_52, t_52);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}