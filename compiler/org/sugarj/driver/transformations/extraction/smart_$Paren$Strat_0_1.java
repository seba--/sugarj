package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Paren$Strat_0_1 extends Strategy 
{ 
  public static smart_$Paren$Strat_0_1 instance = new smart_$Paren$Strat_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_f_259)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference f_259 = new TermReference(ref_f_259);
    context.push("smart_ParenStrat_0_1");
    Fail588:
    { 
      IStrategoTerm g_259 = null;
      IStrategoTerm o_259 = null;
      IStrategoTerm r_259 = null;
      term = extraction.constNil0;
      lifted356 lifted3560 = new lifted356();
      lifted3560.f_259 = f_259;
      term = try_1_0.instance.invoke(context, term, lifted3560);
      if(term == null)
        break Fail588;
      g_259 = term;
      if(f_259.value == null)
        break Fail588;
      term = (IStrategoTerm)termFactory.makeListCons(f_259.value, (IStrategoList)extraction.constNil0);
      o_259 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", o_259, NO_STRATEGIES, new IStrategoTerm[]{extraction.const541});
      if(term == null)
        break Fail588;
      r_259 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, g_259);
      if(term == null)
        break Fail588;
      term = put_syntax_sort_0_1.instance.invoke(context, r_259, term);
      if(term == null)
        break Fail588;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}