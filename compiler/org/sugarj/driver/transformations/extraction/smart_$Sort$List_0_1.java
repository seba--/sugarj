package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Sort$List_0_1 extends Strategy 
{ 
  public static smart_$Sort$List_0_1 instance = new smart_$Sort$List_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_239)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference i_239 = new TermReference(ref_i_239);
    context.push("smart_SortList_0_1");
    Fail555:
    { 
      IStrategoTerm j_239 = null;
      IStrategoTerm t_239 = null;
      IStrategoTerm v_239 = null;
      term = extraction.constNil0;
      lifted323 lifted3230 = new lifted323();
      lifted3230.i_239 = i_239;
      term = try_1_0.instance.invoke(context, term, lifted3230);
      if(term == null)
        break Fail555;
      j_239 = term;
      if(i_239.value == null)
        break Fail555;
      term = (IStrategoTerm)termFactory.makeListCons(i_239.value, (IStrategoList)extraction.constNil0);
      t_239 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", t_239, NO_STRATEGIES, new IStrategoTerm[]{extraction.const515});
      if(term == null)
        break Fail555;
      v_239 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, j_239);
      if(term == null)
        break Fail555;
      term = put_syntax_sort_0_1.instance.invoke(context, v_239, term);
      if(term == null)
        break Fail555;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}