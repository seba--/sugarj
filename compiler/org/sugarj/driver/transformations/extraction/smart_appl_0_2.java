package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_appl_0_2 extends Strategy 
{ 
  public static smart_appl_0_2 instance = new smart_appl_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_325, IStrategoTerm ref_j_325)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference i_325 = new TermReference(ref_i_325);
    TermReference j_325 = new TermReference(ref_j_325);
    context.push("smart_appl_0_2");
    Fail690:
    { 
      IStrategoTerm k_325 = null;
      IStrategoTerm u_325 = null;
      IStrategoTerm w_325 = null;
      term = extraction.constNil0;
      lifted471 lifted4711 = new lifted471();
      lifted4711.i_325 = i_325;
      lifted4711.j_325 = j_325;
      term = try_1_0.instance.invoke(context, term, lifted4711);
      if(term == null)
        break Fail690;
      k_325 = term;
      if(i_325.value == null || j_325.value == null)
        break Fail690;
      term = (IStrategoTerm)termFactory.makeListCons(i_325.value, termFactory.makeListCons(j_325.value, (IStrategoList)extraction.constNil0));
      u_325 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", u_325, NO_STRATEGIES, new IStrategoTerm[]{extraction.const638});
      if(term == null)
        break Fail690;
      w_325 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_325);
      if(term == null)
        break Fail690;
      term = put_syntax_sort_0_1.instance.invoke(context, w_325, term);
      if(term == null)
        break Fail690;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}