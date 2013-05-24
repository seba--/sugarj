package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_variables_0_1 extends Strategy 
{ 
  public static smart_variables_0_1 instance = new smart_variables_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_100)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference j_100 = new TermReference(ref_j_100);
    context.push("smart_variables_0_1");
    Fail356:
    { 
      IStrategoTerm k_100 = null;
      IStrategoTerm w_100 = null;
      IStrategoTerm y_100 = null;
      term = extraction.constNil0;
      lifted67 lifted670 = new lifted67();
      lifted670.j_100 = j_100;
      term = try_1_0.instance.invoke(context, term, lifted670);
      if(term == null)
        break Fail356;
      lifted68 lifted680 = new lifted68();
      lifted680.j_100 = j_100;
      term = try_1_0.instance.invoke(context, term, lifted680);
      if(term == null)
        break Fail356;
      k_100 = term;
      if(j_100.value == null)
        break Fail356;
      term = (IStrategoTerm)termFactory.makeListCons(j_100.value, (IStrategoList)extraction.constNil0);
      w_100 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", w_100, NO_STRATEGIES, new IStrategoTerm[]{extraction.const346});
      if(term == null)
        break Fail356;
      y_100 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_100);
      if(term == null)
        break Fail356;
      term = put_syntax_sort_0_1.instance.invoke(context, y_100, term);
      if(term == null)
        break Fail356;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}