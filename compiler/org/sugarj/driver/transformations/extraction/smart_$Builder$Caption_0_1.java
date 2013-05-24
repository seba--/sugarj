package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Builder$Caption_0_1 extends Strategy 
{ 
  public static smart_$Builder$Caption_0_1 instance = new smart_$Builder$Caption_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_k_113)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference k_113 = new TermReference(ref_k_113);
    context.push("smart_BuilderCaption_0_1");
    Fail376:
    { 
      IStrategoTerm l_113 = null;
      IStrategoTerm t_113 = null;
      IStrategoTerm v_113 = null;
      term = extraction.constNil0;
      lifted97 lifted970 = new lifted97();
      lifted970.k_113 = k_113;
      term = try_1_0.instance.invoke(context, term, lifted970);
      if(term == null)
        break Fail376;
      l_113 = term;
      if(k_113.value == null)
        break Fail376;
      term = (IStrategoTerm)termFactory.makeListCons(k_113.value, (IStrategoList)extraction.constNil0);
      t_113 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", t_113, NO_STRATEGIES, new IStrategoTerm[]{extraction.const367});
      if(term == null)
        break Fail376;
      v_113 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, l_113);
      if(term == null)
        break Fail376;
      term = put_syntax_sort_0_1.instance.invoke(context, v_113, term);
      if(term == null)
        break Fail376;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}