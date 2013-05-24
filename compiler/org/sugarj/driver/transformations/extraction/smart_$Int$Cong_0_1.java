package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Int$Cong_0_1 extends Strategy 
{ 
  public static smart_$Int$Cong_0_1 instance = new smart_$Int$Cong_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_213)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference i_213 = new TermReference(ref_i_213);
    context.push("smart_IntCong_0_1");
    Fail519:
    { 
      IStrategoTerm j_213 = null;
      IStrategoTerm q_213 = null;
      IStrategoTerm s_213 = null;
      term = extraction.constNil0;
      lifted278 lifted2780 = new lifted278();
      lifted2780.i_213 = i_213;
      term = try_1_0.instance.invoke(context, term, lifted2780);
      if(term == null)
        break Fail519;
      j_213 = term;
      if(i_213.value == null)
        break Fail519;
      term = (IStrategoTerm)termFactory.makeListCons(i_213.value, (IStrategoList)extraction.constNil0);
      q_213 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", q_213, NO_STRATEGIES, new IStrategoTerm[]{extraction.const484});
      if(term == null)
        break Fail519;
      s_213 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, j_213);
      if(term == null)
        break Fail519;
      term = put_syntax_sort_0_1.instance.invoke(context, s_213, term);
      if(term == null)
        break Fail519;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}