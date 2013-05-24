package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Color$Rule$All_0_2 extends Strategy 
{ 
  public static smart_$Color$Rule$All_0_2 instance = new smart_$Color$Rule$All_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_d_128, IStrategoTerm ref_e_128)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference d_128 = new TermReference(ref_d_128);
    TermReference e_128 = new TermReference(ref_e_128);
    context.push("smart_ColorRuleAll_0_2");
    Fail400:
    { 
      IStrategoTerm f_128 = null;
      IStrategoTerm z_128 = null;
      IStrategoTerm b_129 = null;
      term = extraction.constNil0;
      lifted131 lifted1310 = new lifted131();
      lifted1310.d_128 = d_128;
      lifted1310.e_128 = e_128;
      term = try_1_0.instance.invoke(context, term, lifted1310);
      if(term == null)
        break Fail400;
      lifted132 lifted1320 = new lifted132();
      lifted1320.d_128 = d_128;
      lifted1320.e_128 = e_128;
      term = try_1_0.instance.invoke(context, term, lifted1320);
      if(term == null)
        break Fail400;
      f_128 = term;
      if(d_128.value == null || e_128.value == null)
        break Fail400;
      term = (IStrategoTerm)termFactory.makeListCons(d_128.value, termFactory.makeListCons(e_128.value, (IStrategoList)extraction.constNil0));
      z_128 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", z_128, NO_STRATEGIES, new IStrategoTerm[]{extraction.const389});
      if(term == null)
        break Fail400;
      b_129 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, f_128);
      if(term == null)
        break Fail400;
      term = put_syntax_sort_0_1.instance.invoke(context, b_129, term);
      if(term == null)
        break Fail400;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}