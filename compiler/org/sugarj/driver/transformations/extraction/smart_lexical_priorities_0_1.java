package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_lexical_priorities_0_1 extends Strategy 
{ 
  public static smart_lexical_priorities_0_1 instance = new smart_lexical_priorities_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_h_102)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference h_102 = new TermReference(ref_h_102);
    context.push("smart_lexical_priorities_0_1");
    Fail359:
    { 
      IStrategoTerm i_102 = null;
      IStrategoTerm u_102 = null;
      IStrategoTerm w_102 = null;
      term = extraction.constNil0;
      lifted73 lifted730 = new lifted73();
      lifted730.h_102 = h_102;
      term = try_1_0.instance.invoke(context, term, lifted730);
      if(term == null)
        break Fail359;
      lifted74 lifted740 = new lifted74();
      lifted740.h_102 = h_102;
      term = try_1_0.instance.invoke(context, term, lifted740);
      if(term == null)
        break Fail359;
      i_102 = term;
      if(h_102.value == null)
        break Fail359;
      term = (IStrategoTerm)termFactory.makeListCons(h_102.value, (IStrategoList)extraction.constNil0);
      u_102 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", u_102, NO_STRATEGIES, new IStrategoTerm[]{extraction.const349});
      if(term == null)
        break Fail359;
      w_102 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, i_102);
      if(term == null)
        break Fail359;
      term = put_syntax_sort_0_1.instance.invoke(context, w_102, term);
      if(term == null)
        break Fail359;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}