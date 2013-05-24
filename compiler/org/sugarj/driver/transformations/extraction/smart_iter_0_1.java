package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_iter_0_1 extends Strategy 
{ 
  public static smart_iter_0_1 instance = new smart_iter_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_307)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference t_307 = new TermReference(ref_t_307);
    context.push("smart_iter_0_1");
    Fail657:
    { 
      IStrategoTerm u_307 = null;
      IStrategoTerm b_308 = null;
      IStrategoTerm d_308 = null;
      term = extraction.constNil0;
      lifted438 lifted4380 = new lifted438();
      lifted4380.t_307 = t_307;
      term = try_1_0.instance.invoke(context, term, lifted4380);
      if(term == null)
        break Fail657;
      u_307 = term;
      if(t_307.value == null)
        break Fail657;
      term = (IStrategoTerm)termFactory.makeListCons(t_307.value, (IStrategoList)extraction.constNil0);
      b_308 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", b_308, NO_STRATEGIES, new IStrategoTerm[]{extraction.const606});
      if(term == null)
        break Fail657;
      d_308 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, u_307);
      if(term == null)
        break Fail657;
      term = put_syntax_sort_0_1.instance.invoke(context, d_308, term);
      if(term == null)
        break Fail657;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}