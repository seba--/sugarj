package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Table$Provider_0_1 extends Strategy 
{ 
  public static smart_$Table$Provider_0_1 instance = new smart_$Table$Provider_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_160)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference j_160 = new TermReference(ref_j_160);
    context.push("smart_TableProvider_0_1");
    Fail442:
    { 
      IStrategoTerm k_160 = null;
      IStrategoTerm r_160 = null;
      IStrategoTerm t_160 = null;
      term = extraction.constNil0;
      lifted186 lifted1860 = new lifted186();
      lifted1860.j_160 = j_160;
      term = try_1_0.instance.invoke(context, term, lifted1860);
      if(term == null)
        break Fail442;
      k_160 = term;
      if(j_160.value == null)
        break Fail442;
      term = (IStrategoTerm)termFactory.makeListCons(j_160.value, (IStrategoList)extraction.constNil0);
      r_160 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", r_160, NO_STRATEGIES, new IStrategoTerm[]{extraction.const425});
      if(term == null)
        break Fail442;
      t_160 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_160);
      if(term == null)
        break Fail442;
      term = put_syntax_sort_0_1.instance.invoke(context, t_160, term);
      if(term == null)
        break Fail442;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}