package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$List$Tail_0_2 extends Strategy 
{ 
  public static smart_$List$Tail_0_2 instance = new smart_$List$Tail_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_235, IStrategoTerm ref_u_235)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference t_235 = new TermReference(ref_t_235);
    TermReference u_235 = new TermReference(ref_u_235);
    context.push("smart_ListTail_0_2");
    Fail552:
    { 
      IStrategoTerm v_235 = null;
      IStrategoTerm f_236 = null;
      IStrategoTerm h_236 = null;
      term = extraction.constNil0;
      lifted315 lifted3150 = new lifted315();
      lifted3150.t_235 = t_235;
      lifted3150.u_235 = u_235;
      term = try_1_0.instance.invoke(context, term, lifted3150);
      if(term == null)
        break Fail552;
      v_235 = term;
      if(t_235.value == null || u_235.value == null)
        break Fail552;
      term = (IStrategoTerm)termFactory.makeListCons(t_235.value, termFactory.makeListCons(u_235.value, (IStrategoList)extraction.constNil0));
      f_236 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_236, NO_STRATEGIES, new IStrategoTerm[]{extraction.const512});
      if(term == null)
        break Fail552;
      h_236 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, v_235);
      if(term == null)
        break Fail552;
      term = put_syntax_sort_0_1.instance.invoke(context, h_236, term);
      if(term == null)
        break Fail552;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}