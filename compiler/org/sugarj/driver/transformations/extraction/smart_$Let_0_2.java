package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Let_0_2 extends Strategy 
{ 
  public static smart_$Let_0_2 instance = new smart_$Let_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_253, IStrategoTerm ref_k_253)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference j_253 = new TermReference(ref_j_253);
    TermReference k_253 = new TermReference(ref_k_253);
    context.push("smart_Let_0_2");
    Fail581:
    { 
      IStrategoTerm n_253 = null;
      IStrategoTerm x_253 = null;
      IStrategoTerm z_253 = null;
      term = extraction.constNil0;
      lifted349 lifted3490 = new lifted349();
      lifted3490.j_253 = j_253;
      lifted3490.k_253 = k_253;
      term = try_1_0.instance.invoke(context, term, lifted3490);
      if(term == null)
        break Fail581;
      n_253 = term;
      if(j_253.value == null || k_253.value == null)
        break Fail581;
      term = (IStrategoTerm)termFactory.makeListCons(j_253.value, termFactory.makeListCons(k_253.value, (IStrategoList)extraction.constNil0));
      x_253 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", x_253, NO_STRATEGIES, new IStrategoTerm[]{extraction.const534});
      if(term == null)
        break Fail581;
      z_253 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, n_253);
      if(term == null)
        break Fail581;
      term = put_syntax_sort_0_1.instance.invoke(context, z_253, term);
      if(term == null)
        break Fail581;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}