package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_lexical_syntax_0_1 extends Strategy 
{ 
  public static smart_lexical_syntax_0_1 instance = new smart_lexical_syntax_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_d_99)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference d_99 = new TermReference(ref_d_99);
    context.push("smart_lexical_syntax_0_1");
    Fail354:
    { 
      IStrategoTerm e_99 = null;
      IStrategoTerm q_99 = null;
      IStrategoTerm s_99 = null;
      term = extraction.constNil0;
      lifted63 lifted630 = new lifted63();
      lifted630.d_99 = d_99;
      term = try_1_0.instance.invoke(context, term, lifted630);
      if(term == null)
        break Fail354;
      lifted64 lifted640 = new lifted64();
      lifted640.d_99 = d_99;
      term = try_1_0.instance.invoke(context, term, lifted640);
      if(term == null)
        break Fail354;
      e_99 = term;
      if(d_99.value == null)
        break Fail354;
      term = (IStrategoTerm)termFactory.makeListCons(d_99.value, (IStrategoList)extraction.constNil0);
      q_99 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", q_99, NO_STRATEGIES, new IStrategoTerm[]{extraction.const344});
      if(term == null)
        break Fail354;
      s_99 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, e_99);
      if(term == null)
        break Fail354;
      term = put_syntax_sort_0_1.instance.invoke(context, s_99, term);
      if(term == null)
        break Fail354;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}