package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Constructor$Only_0_1 extends Strategy 
{ 
  public static smart_$Constructor$Only_0_1 instance = new smart_$Constructor$Only_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_171)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference j_171 = new TermReference(ref_j_171);
    context.push("smart_ConstructorOnly_0_1");
    Fail459:
    { 
      IStrategoTerm k_171 = null;
      IStrategoTerm u_171 = null;
      IStrategoTerm w_171 = null;
      term = extraction.constNil0;
      lifted205 lifted2050 = new lifted205();
      lifted2050.j_171 = j_171;
      term = try_1_0.instance.invoke(context, term, lifted2050);
      if(term == null)
        break Fail459;
      k_171 = term;
      if(j_171.value == null)
        break Fail459;
      term = (IStrategoTerm)termFactory.makeListCons(j_171.value, (IStrategoList)extraction.constNil0);
      u_171 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", u_171, NO_STRATEGIES, new IStrategoTerm[]{extraction.const434});
      if(term == null)
        break Fail459;
      w_171 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_171);
      if(term == null)
        break Fail459;
      term = put_syntax_sort_0_1.instance.invoke(context, w_171, term);
      if(term == null)
        break Fail459;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}