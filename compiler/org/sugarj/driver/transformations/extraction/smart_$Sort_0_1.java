package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Sort_0_1 extends Strategy 
{ 
  public static smart_$Sort_0_1 instance = new smart_$Sort_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_169)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference t_169 = new TermReference(ref_t_169);
    context.push("smart_Sort_0_1");
    Fail456:
    { 
      IStrategoTerm u_169 = null;
      IStrategoTerm b_170 = null;
      IStrategoTerm e_170 = null;
      term = extraction.constNil0;
      lifted202 lifted2020 = new lifted202();
      lifted2020.t_169 = t_169;
      term = try_1_0.instance.invoke(context, term, lifted2020);
      if(term == null)
        break Fail456;
      u_169 = term;
      if(t_169.value == null)
        break Fail456;
      term = (IStrategoTerm)termFactory.makeListCons(t_169.value, (IStrategoList)extraction.constNil0);
      b_170 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", b_170, NO_STRATEGIES, new IStrategoTerm[]{extraction.const6});
      if(term == null)
        break Fail456;
      e_170 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, u_169);
      if(term == null)
        break Fail456;
      term = put_syntax_sort_0_1.instance.invoke(context, e_170, term);
      if(term == null)
        break Fail456;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}