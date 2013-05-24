package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_context_free_start_symbols_0_1 extends Strategy 
{ 
  public static smart_context_free_start_symbols_0_1 instance = new smart_context_free_start_symbols_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_280)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference z_280 = new TermReference(ref_z_280);
    context.push("smart_context_free_start_symbols_0_1");
    Fail622:
    { 
      IStrategoTerm a_281 = null;
      IStrategoTerm h_281 = null;
      IStrategoTerm j_281 = null;
      term = extraction.constNil0;
      lifted399 lifted3990 = new lifted399();
      lifted3990.z_280 = z_280;
      term = try_1_0.instance.invoke(context, term, lifted3990);
      if(term == null)
        break Fail622;
      a_281 = term;
      if(z_280.value == null)
        break Fail622;
      term = (IStrategoTerm)termFactory.makeListCons(z_280.value, (IStrategoList)extraction.constNil0);
      h_281 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", h_281, NO_STRATEGIES, new IStrategoTerm[]{extraction.const573});
      if(term == null)
        break Fail622;
      j_281 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, a_281);
      if(term == null)
        break Fail622;
      term = put_syntax_sort_0_1.instance.invoke(context, j_281, term);
      if(term == null)
        break Fail622;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}