package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_definition_0_1 extends Strategy 
{ 
  public static smart_definition_0_1 instance = new smart_definition_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_r_329)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference r_329 = new TermReference(ref_r_329);
    context.push("smart_definition_0_1");
    Fail699:
    { 
      IStrategoTerm s_329 = null;
      IStrategoTerm z_329 = null;
      IStrategoTerm b_330 = null;
      term = extraction.constNil0;
      lifted480 lifted4800 = new lifted480();
      lifted4800.r_329 = r_329;
      term = try_1_0.instance.invoke(context, term, lifted4800);
      if(term == null)
        break Fail699;
      s_329 = term;
      if(r_329.value == null)
        break Fail699;
      term = (IStrategoTerm)termFactory.makeListCons(r_329.value, (IStrategoList)extraction.constNil0);
      z_329 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", z_329, NO_STRATEGIES, new IStrategoTerm[]{extraction.const647});
      if(term == null)
        break Fail699;
      b_330 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, s_329);
      if(term == null)
        break Fail699;
      term = put_syntax_sort_0_1.instance.invoke(context, b_330, term);
      if(term == null)
        break Fail699;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}