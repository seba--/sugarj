package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Rule$Names_0_1 extends Strategy 
{ 
  public static smart_$Rule$Names_0_1 instance = new smart_$Rule$Names_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_189)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference j_189 = new TermReference(ref_j_189);
    context.push("smart_RuleNames_0_1");
    Fail488:
    { 
      IStrategoTerm k_189 = null;
      IStrategoTerm r_189 = null;
      IStrategoTerm t_189 = null;
      term = extraction.constNil0;
      lifted236 lifted2360 = new lifted236();
      lifted2360.j_189 = j_189;
      term = try_1_0.instance.invoke(context, term, lifted2360);
      if(term == null)
        break Fail488;
      k_189 = term;
      if(j_189.value == null)
        break Fail488;
      term = (IStrategoTerm)termFactory.makeListCons(j_189.value, (IStrategoList)extraction.constNil0);
      r_189 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", r_189, NO_STRATEGIES, new IStrategoTerm[]{extraction.const114});
      if(term == null)
        break Fail488;
      t_189 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_189);
      if(term == null)
        break Fail488;
      term = put_syntax_sort_0_1.instance.invoke(context, t_189, term);
      if(term == null)
        break Fail488;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}