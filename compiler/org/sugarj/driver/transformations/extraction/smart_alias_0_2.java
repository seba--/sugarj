package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_alias_0_2 extends Strategy 
{ 
  public static smart_alias_0_2 instance = new smart_alias_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_v_267, IStrategoTerm ref_w_267)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference v_267 = new TermReference(ref_v_267);
    TermReference w_267 = new TermReference(ref_w_267);
    context.push("smart_alias_0_2");
    Fail602:
    { 
      IStrategoTerm x_267 = null;
      IStrategoTerm j_268 = null;
      IStrategoTerm l_268 = null;
      term = extraction.constNil0;
      lifted373 lifted3730 = new lifted373();
      lifted3730.v_267 = v_267;
      lifted3730.w_267 = w_267;
      term = try_1_0.instance.invoke(context, term, lifted3730);
      if(term == null)
        break Fail602;
      x_267 = term;
      if(v_267.value == null || w_267.value == null)
        break Fail602;
      term = (IStrategoTerm)termFactory.makeListCons(v_267.value, termFactory.makeListCons(w_267.value, (IStrategoList)extraction.constNil0));
      j_268 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", j_268, NO_STRATEGIES, new IStrategoTerm[]{extraction.const553});
      if(term == null)
        break Fail602;
      l_268 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, x_267);
      if(term == null)
        break Fail602;
      term = put_syntax_sort_0_1.instance.invoke(context, l_268, term);
      if(term == null)
        break Fail602;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}