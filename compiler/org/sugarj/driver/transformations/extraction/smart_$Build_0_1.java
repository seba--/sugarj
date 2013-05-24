package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Build_0_1 extends Strategy 
{ 
  public static smart_$Build_0_1 instance = new smart_$Build_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_260)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference z_260 = new TermReference(ref_z_260);
    context.push("smart_Build_0_1");
    Fail592:
    { 
      IStrategoTerm a_261 = null;
      IStrategoTerm n_261 = null;
      IStrategoTerm q_261 = null;
      term = extraction.constNil0;
      lifted361 lifted3610 = new lifted361();
      lifted3610.z_260 = z_260;
      term = try_1_0.instance.invoke(context, term, lifted3610);
      if(term == null)
        break Fail592;
      lifted362 lifted3620 = new lifted362();
      lifted3620.z_260 = z_260;
      term = try_1_0.instance.invoke(context, term, lifted3620);
      if(term == null)
        break Fail592;
      a_261 = term;
      if(z_260.value == null)
        break Fail592;
      term = (IStrategoTerm)termFactory.makeListCons(z_260.value, (IStrategoList)extraction.constNil0);
      n_261 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", n_261, NO_STRATEGIES, new IStrategoTerm[]{extraction.const544});
      if(term == null)
        break Fail592;
      q_261 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, a_261);
      if(term == null)
        break Fail592;
      term = put_syntax_sort_0_1.instance.invoke(context, q_261, term);
      if(term == null)
        break Fail592;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}