package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$With$Clause_0_1 extends Strategy 
{ 
  public static smart_$With$Clause_0_1 instance = new smart_$With$Clause_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_205)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference j_205 = new TermReference(ref_j_205);
    context.push("smart_WithClause_0_1");
    Fail504:
    { 
      IStrategoTerm k_205 = null;
      IStrategoTerm r_205 = null;
      IStrategoTerm t_205 = null;
      term = extraction.constNil0;
      lifted263 lifted2630 = new lifted263();
      lifted2630.j_205 = j_205;
      term = try_1_0.instance.invoke(context, term, lifted2630);
      if(term == null)
        break Fail504;
      k_205 = term;
      if(j_205.value == null)
        break Fail504;
      term = (IStrategoTerm)termFactory.makeListCons(j_205.value, (IStrategoList)extraction.constNil0);
      r_205 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", r_205, NO_STRATEGIES, new IStrategoTerm[]{extraction.const469});
      if(term == null)
        break Fail504;
      t_205 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_205);
      if(term == null)
        break Fail504;
      term = put_syntax_sort_0_1.instance.invoke(context, t_205, term);
      if(term == null)
        break Fail504;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}