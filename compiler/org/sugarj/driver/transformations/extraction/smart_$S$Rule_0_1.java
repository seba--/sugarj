package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$S$Rule_0_1 extends Strategy 
{ 
  public static smart_$S$Rule_0_1 instance = new smart_$S$Rule_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_p_221)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference p_221 = new TermReference(ref_p_221);
    context.push("smart_SRule_0_1");
    Fail532:
    { 
      IStrategoTerm q_221 = null;
      IStrategoTerm z_221 = null;
      IStrategoTerm b_222 = null;
      term = extraction.constNil0;
      lifted291 lifted2910 = new lifted291();
      lifted2910.p_221 = p_221;
      term = try_1_0.instance.invoke(context, term, lifted2910);
      if(term == null)
        break Fail532;
      q_221 = term;
      if(p_221.value == null)
        break Fail532;
      term = (IStrategoTerm)termFactory.makeListCons(p_221.value, (IStrategoList)extraction.constNil0);
      z_221 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", z_221, NO_STRATEGIES, new IStrategoTerm[]{extraction.const496});
      if(term == null)
        break Fail532;
      b_222 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, q_221);
      if(term == null)
        break Fail532;
      term = put_syntax_sort_0_1.instance.invoke(context, b_222, term);
      if(term == null)
        break Fail532;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}