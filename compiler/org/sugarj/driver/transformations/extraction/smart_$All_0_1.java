package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$All_0_1 extends Strategy 
{ 
  public static smart_$All_0_1 instance = new smart_$All_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_265)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference i_265 = new TermReference(ref_i_265);
    context.push("smart_All_0_1");
    Fail597:
    { 
      IStrategoTerm j_265 = null;
      IStrategoTerm q_265 = null;
      IStrategoTerm s_265 = null;
      term = extraction.constNil0;
      lifted368 lifted3680 = new lifted368();
      lifted3680.i_265 = i_265;
      term = try_1_0.instance.invoke(context, term, lifted3680);
      if(term == null)
        break Fail597;
      j_265 = term;
      if(i_265.value == null)
        break Fail597;
      term = (IStrategoTerm)termFactory.makeListCons(i_265.value, (IStrategoList)extraction.constNil0);
      q_265 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", q_265, NO_STRATEGIES, new IStrategoTerm[]{extraction.const549});
      if(term == null)
        break Fail597;
      s_265 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, j_265);
      if(term == null)
        break Fail597;
      term = put_syntax_sort_0_1.instance.invoke(context, s_265, term);
      if(term == null)
        break Fail597;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}