package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Constructors_0_1 extends Strategy 
{ 
  public static smart_$Constructors_0_1 instance = new smart_$Constructors_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_242)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference j_242 = new TermReference(ref_j_242);
    context.push("smart_Constructors_0_1");
    Fail561:
    { 
      IStrategoTerm k_242 = null;
      IStrategoTerm r_242 = null;
      IStrategoTerm t_242 = null;
      term = extraction.constNil0;
      lifted329 lifted3290 = new lifted329();
      lifted3290.j_242 = j_242;
      term = try_1_0.instance.invoke(context, term, lifted3290);
      if(term == null)
        break Fail561;
      k_242 = term;
      if(j_242.value == null)
        break Fail561;
      term = (IStrategoTerm)termFactory.makeListCons(j_242.value, (IStrategoList)extraction.constNil0);
      r_242 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", r_242, NO_STRATEGIES, new IStrategoTerm[]{extraction.const521});
      if(term == null)
        break Fail561;
      t_242 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_242);
      if(term == null)
        break Fail561;
      term = put_syntax_sort_0_1.instance.invoke(context, t_242, term);
      if(term == null)
        break Fail561;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}