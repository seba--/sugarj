package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Op$Decl$Inj_0_1 extends Strategy 
{ 
  public static smart_$Op$Decl$Inj_0_1 instance = new smart_$Op$Decl$Inj_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_q_245)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference q_245 = new TermReference(ref_q_245);
    context.push("smart_OpDeclInj_0_1");
    Fail567:
    { 
      IStrategoTerm r_245 = null;
      IStrategoTerm z_245 = null;
      IStrategoTerm b_246 = null;
      term = extraction.constNil0;
      lifted335 lifted3350 = new lifted335();
      lifted3350.q_245 = q_245;
      term = try_1_0.instance.invoke(context, term, lifted3350);
      if(term == null)
        break Fail567;
      r_245 = term;
      if(q_245.value == null)
        break Fail567;
      term = (IStrategoTerm)termFactory.makeListCons(q_245.value, (IStrategoList)extraction.constNil0);
      z_245 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", z_245, NO_STRATEGIES, new IStrategoTerm[]{extraction.const526});
      if(term == null)
        break Fail567;
      b_246 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, r_245);
      if(term == null)
        break Fail567;
      term = put_syntax_sort_0_1.instance.invoke(context, b_246, term);
      if(term == null)
        break Fail567;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}