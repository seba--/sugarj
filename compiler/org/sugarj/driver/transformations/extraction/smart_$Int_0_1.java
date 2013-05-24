package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Int_0_1 extends Strategy 
{ 
  public static smart_$Int_0_1 instance = new smart_$Int_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_o_249)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference o_249 = new TermReference(ref_o_249);
    context.push("smart_Int_0_1");
    Fail574:
    { 
      IStrategoTerm p_249 = null;
      IStrategoTerm w_249 = null;
      IStrategoTerm y_249 = null;
      term = extraction.constNil0;
      lifted342 lifted3420 = new lifted342();
      lifted3420.o_249 = o_249;
      term = try_1_0.instance.invoke(context, term, lifted3420);
      if(term == null)
        break Fail574;
      p_249 = term;
      if(o_249.value == null)
        break Fail574;
      term = (IStrategoTerm)termFactory.makeListCons(o_249.value, (IStrategoList)extraction.constNil0);
      w_249 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", w_249, NO_STRATEGIES, new IStrategoTerm[]{extraction.const17});
      if(term == null)
        break Fail574;
      y_249 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, p_249);
      if(term == null)
        break Fail574;
      term = put_syntax_sort_0_1.instance.invoke(context, y_249, term);
      if(term == null)
        break Fail574;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}