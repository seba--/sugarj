package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_label_0_2 extends Strategy 
{ 
  public static smart_label_0_2 instance = new smart_label_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_b_276, IStrategoTerm ref_c_276)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference b_276 = new TermReference(ref_b_276);
    TermReference c_276 = new TermReference(ref_c_276);
    context.push("smart_label_0_2");
    Fail614:
    { 
      IStrategoTerm d_276 = null;
      IStrategoTerm n_276 = null;
      IStrategoTerm p_276 = null;
      term = extraction.constNil0;
      lifted391 lifted3910 = new lifted391();
      lifted3910.b_276 = b_276;
      lifted3910.c_276 = c_276;
      term = try_1_0.instance.invoke(context, term, lifted3910);
      if(term == null)
        break Fail614;
      d_276 = term;
      if(b_276.value == null || c_276.value == null)
        break Fail614;
      term = (IStrategoTerm)termFactory.makeListCons(b_276.value, termFactory.makeListCons(c_276.value, (IStrategoList)extraction.constNil0));
      n_276 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", n_276, NO_STRATEGIES, new IStrategoTerm[]{extraction.const565});
      if(term == null)
        break Fail614;
      p_276 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, d_276);
      if(term == null)
        break Fail614;
      term = put_syntax_sort_0_1.instance.invoke(context, p_276, term);
      if(term == null)
        break Fail614;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}