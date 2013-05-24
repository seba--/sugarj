package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Reference$Hover$Rule_0_3 extends Strategy 
{ 
  public static smart_$Reference$Hover$Rule_0_3 instance = new smart_$Reference$Hover$Rule_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_w_124, IStrategoTerm ref_x_124, IStrategoTerm ref_a_125)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference w_124 = new TermReference(ref_w_124);
    TermReference x_124 = new TermReference(ref_x_124);
    TermReference a_125 = new TermReference(ref_a_125);
    context.push("smart_ReferenceHoverRule_0_3");
    Fail395:
    { 
      IStrategoTerm b_125 = null;
      IStrategoTerm p_125 = null;
      IStrategoTerm r_125 = null;
      term = extraction.constNil0;
      lifted126 lifted1260 = new lifted126();
      lifted1260.w_124 = w_124;
      lifted1260.x_124 = x_124;
      lifted1260.a_125 = a_125;
      term = try_1_0.instance.invoke(context, term, lifted1260);
      if(term == null)
        break Fail395;
      b_125 = term;
      if(w_124.value == null || (x_124.value == null || a_125.value == null))
        break Fail395;
      term = (IStrategoTerm)termFactory.makeListCons(w_124.value, termFactory.makeListCons(x_124.value, termFactory.makeListCons(a_125.value, (IStrategoList)extraction.constNil0)));
      p_125 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", p_125, NO_STRATEGIES, new IStrategoTerm[]{extraction.const385});
      if(term == null)
        break Fail395;
      r_125 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, b_125);
      if(term == null)
        break Fail395;
      term = put_syntax_sort_0_1.instance.invoke(context, r_125, term);
      if(term == null)
        break Fail395;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}