package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_context_free_priorities_0_1 extends Strategy 
{ 
  public static smart_context_free_priorities_0_1 instance = new smart_context_free_priorities_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_x_102)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference x_102 = new TermReference(ref_x_102);
    context.push("smart_context_free_priorities_0_1");
    Fail360:
    { 
      IStrategoTerm y_102 = null;
      IStrategoTerm k_103 = null;
      IStrategoTerm m_103 = null;
      term = extraction.constNil0;
      lifted75 lifted750 = new lifted75();
      lifted750.x_102 = x_102;
      term = try_1_0.instance.invoke(context, term, lifted750);
      if(term == null)
        break Fail360;
      lifted76 lifted760 = new lifted76();
      lifted760.x_102 = x_102;
      term = try_1_0.instance.invoke(context, term, lifted760);
      if(term == null)
        break Fail360;
      y_102 = term;
      if(x_102.value == null)
        break Fail360;
      term = (IStrategoTerm)termFactory.makeListCons(x_102.value, (IStrategoList)extraction.constNil0);
      k_103 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", k_103, NO_STRATEGIES, new IStrategoTerm[]{extraction.const350});
      if(term == null)
        break Fail360;
      m_103 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, y_102);
      if(term == null)
        break Fail360;
      term = put_syntax_sort_0_1.instance.invoke(context, m_103, term);
      if(term == null)
        break Fail360;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}