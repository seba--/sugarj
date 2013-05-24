package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Gen$Dyn$Rules_0_1 extends Strategy 
{ 
  public static smart_$Gen$Dyn$Rules_0_1 instance = new smart_$Gen$Dyn$Rules_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_d_179)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference d_179 = new TermReference(ref_d_179);
    context.push("smart_GenDynRules_0_1");
    Fail471:
    { 
      IStrategoTerm e_179 = null;
      IStrategoTerm l_179 = null;
      IStrategoTerm n_179 = null;
      term = extraction.constNil0;
      lifted219 lifted2190 = new lifted219();
      lifted2190.d_179 = d_179;
      term = try_1_0.instance.invoke(context, term, lifted2190);
      if(term == null)
        break Fail471;
      e_179 = term;
      if(d_179.value == null)
        break Fail471;
      term = (IStrategoTerm)termFactory.makeListCons(d_179.value, (IStrategoList)extraction.constNil0);
      l_179 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", l_179, NO_STRATEGIES, new IStrategoTerm[]{extraction.const440});
      if(term == null)
        break Fail471;
      n_179 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, e_179);
      if(term == null)
        break Fail471;
      term = put_syntax_sort_0_1.instance.invoke(context, n_179, term);
      if(term == null)
        break Fail471;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}