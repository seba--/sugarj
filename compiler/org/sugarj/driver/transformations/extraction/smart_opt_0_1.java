package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_opt_0_1 extends Strategy 
{ 
  public static smart_opt_0_1 instance = new smart_opt_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_307)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference i_307 = new TermReference(ref_i_307);
    context.push("smart_opt_0_1");
    Fail656:
    { 
      IStrategoTerm j_307 = null;
      IStrategoTerm q_307 = null;
      IStrategoTerm s_307 = null;
      term = extraction.constNil0;
      lifted437 lifted4370 = new lifted437();
      lifted4370.i_307 = i_307;
      term = try_1_0.instance.invoke(context, term, lifted4370);
      if(term == null)
        break Fail656;
      j_307 = term;
      if(i_307.value == null)
        break Fail656;
      term = (IStrategoTerm)termFactory.makeListCons(i_307.value, (IStrategoList)extraction.constNil0);
      q_307 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", q_307, NO_STRATEGIES, new IStrategoTerm[]{extraction.const605});
      if(term == null)
        break Fail656;
      s_307 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, j_307);
      if(term == null)
        break Fail656;
      term = put_syntax_sort_0_1.instance.invoke(context, s_307, term);
      if(term == null)
        break Fail656;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}