package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Call$Dynamic_0_3 extends Strategy 
{ 
  public static smart_$Call$Dynamic_0_3 instance = new smart_$Call$Dynamic_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_v_254, IStrategoTerm ref_x_254, IStrategoTerm ref_y_254)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference v_254 = new TermReference(ref_v_254);
    TermReference x_254 = new TermReference(ref_x_254);
    TermReference y_254 = new TermReference(ref_y_254);
    context.push("smart_CallDynamic_0_3");
    Fail583:
    { 
      IStrategoTerm a_255 = null;
      IStrategoTerm o_255 = null;
      IStrategoTerm q_255 = null;
      term = extraction.constNil0;
      lifted351 lifted3510 = new lifted351();
      lifted3510.v_254 = v_254;
      lifted3510.x_254 = x_254;
      lifted3510.y_254 = y_254;
      term = try_1_0.instance.invoke(context, term, lifted3510);
      if(term == null)
        break Fail583;
      a_255 = term;
      if(v_254.value == null || (x_254.value == null || y_254.value == null))
        break Fail583;
      term = (IStrategoTerm)termFactory.makeListCons(v_254.value, termFactory.makeListCons(x_254.value, termFactory.makeListCons(y_254.value, (IStrategoList)extraction.constNil0)));
      o_255 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", o_255, NO_STRATEGIES, new IStrategoTerm[]{extraction.const536});
      if(term == null)
        break Fail583;
      q_255 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, a_255);
      if(term == null)
        break Fail583;
      term = put_syntax_sort_0_1.instance.invoke(context, q_255, term);
      if(term == null)
        break Fail583;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}