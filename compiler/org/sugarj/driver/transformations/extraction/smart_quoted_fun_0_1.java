package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_quoted_fun_0_1 extends Strategy 
{ 
  public static smart_quoted_fun_0_1 instance = new smart_quoted_fun_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_b_277)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference b_277 = new TermReference(ref_b_277);
    context.push("smart_quoted_fun_0_1");
    Fail616:
    { 
      IStrategoTerm c_277 = null;
      IStrategoTerm j_277 = null;
      IStrategoTerm l_277 = null;
      term = extraction.constNil0;
      lifted393 lifted3930 = new lifted393();
      lifted3930.b_277 = b_277;
      term = try_1_0.instance.invoke(context, term, lifted3930);
      if(term == null)
        break Fail616;
      c_277 = term;
      if(b_277.value == null)
        break Fail616;
      term = (IStrategoTerm)termFactory.makeListCons(b_277.value, (IStrategoList)extraction.constNil0);
      j_277 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", j_277, NO_STRATEGIES, new IStrategoTerm[]{extraction.const567});
      if(term == null)
        break Fail616;
      l_277 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, c_277);
      if(term == null)
        break Fail616;
      term = put_syntax_sort_0_1.instance.invoke(context, l_277, term);
      if(term == null)
        break Fail616;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}