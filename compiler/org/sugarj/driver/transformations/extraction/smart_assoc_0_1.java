package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_assoc_0_1 extends Strategy 
{ 
  public static smart_assoc_0_1 instance = new smart_assoc_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_301)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference j_301 = new TermReference(ref_j_301);
    context.push("smart_assoc_0_1");
    Fail645:
    { 
      IStrategoTerm k_301 = null;
      IStrategoTerm r_301 = null;
      IStrategoTerm t_301 = null;
      term = extraction.constNil0;
      lifted424 lifted4240 = new lifted424();
      lifted4240.j_301 = j_301;
      term = try_1_0.instance.invoke(context, term, lifted4240);
      if(term == null)
        break Fail645;
      k_301 = term;
      if(j_301.value == null)
        break Fail645;
      term = (IStrategoTerm)termFactory.makeListCons(j_301.value, (IStrategoList)extraction.constNil0);
      r_301 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", r_301, NO_STRATEGIES, new IStrategoTerm[]{extraction.const594});
      if(term == null)
        break Fail645;
      t_301 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_301);
      if(term == null)
        break Fail645;
      term = put_syntax_sort_0_1.instance.invoke(context, t_301, term);
      if(term == null)
        break Fail645;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}