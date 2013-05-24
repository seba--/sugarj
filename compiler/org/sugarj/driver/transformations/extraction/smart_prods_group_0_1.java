package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_prods_group_0_1 extends Strategy 
{ 
  public static smart_prods_group_0_1 instance = new smart_prods_group_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_k_304)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference k_304 = new TermReference(ref_k_304);
    context.push("smart_prods_group_0_1");
    Fail650:
    { 
      IStrategoTerm l_304 = null;
      IStrategoTerm t_304 = null;
      IStrategoTerm v_304 = null;
      term = extraction.constNil0;
      lifted431 lifted4310 = new lifted431();
      lifted4310.k_304 = k_304;
      term = try_1_0.instance.invoke(context, term, lifted4310);
      if(term == null)
        break Fail650;
      l_304 = term;
      if(k_304.value == null)
        break Fail650;
      term = (IStrategoTerm)termFactory.makeListCons(k_304.value, (IStrategoList)extraction.constNil0);
      t_304 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", t_304, NO_STRATEGIES, new IStrategoTerm[]{extraction.const600});
      if(term == null)
        break Fail650;
      v_304 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, l_304);
      if(term == null)
        break Fail650;
      term = put_syntax_sort_0_1.instance.invoke(context, v_304, term);
      if(term == null)
        break Fail650;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}