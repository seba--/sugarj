package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Token_0_1 extends Strategy 
{ 
  public static smart_$Token_0_1 instance = new smart_$Token_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_k_136)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference k_136 = new TermReference(ref_k_136);
    context.push("smart_Token_0_1");
    Fail406:
    { 
      IStrategoTerm l_136 = null;
      IStrategoTerm t_136 = null;
      IStrategoTerm v_136 = null;
      term = extraction.constNil0;
      lifted139 lifted1390 = new lifted139();
      lifted1390.k_136 = k_136;
      term = try_1_0.instance.invoke(context, term, lifted1390);
      if(term == null)
        break Fail406;
      l_136 = term;
      if(k_136.value == null)
        break Fail406;
      term = (IStrategoTerm)termFactory.makeListCons(k_136.value, (IStrategoList)extraction.constNil0);
      t_136 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", t_136, NO_STRATEGIES, new IStrategoTerm[]{extraction.const393});
      if(term == null)
        break Fail406;
      v_136 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, l_136);
      if(term == null)
        break Fail406;
      term = put_syntax_sort_0_1.instance.invoke(context, v_136, term);
      if(term == null)
        break Fail406;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}