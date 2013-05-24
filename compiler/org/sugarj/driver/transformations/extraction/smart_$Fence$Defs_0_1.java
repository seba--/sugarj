package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Fence$Defs_0_1 extends Strategy 
{ 
  public static smart_$Fence$Defs_0_1 instance = new smart_$Fence$Defs_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_k_166)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference k_166 = new TermReference(ref_k_166);
    context.push("smart_FenceDefs_0_1");
    Fail450:
    { 
      IStrategoTerm l_166 = null;
      IStrategoTerm s_166 = null;
      IStrategoTerm u_166 = null;
      term = extraction.constNil0;
      lifted195 lifted1950 = new lifted195();
      lifted1950.k_166 = k_166;
      term = try_1_0.instance.invoke(context, term, lifted1950);
      if(term == null)
        break Fail450;
      l_166 = term;
      if(k_166.value == null)
        break Fail450;
      term = (IStrategoTerm)termFactory.makeListCons(k_166.value, (IStrategoList)extraction.constNil0);
      s_166 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", s_166, NO_STRATEGIES, new IStrategoTerm[]{extraction.const431});
      if(term == null)
        break Fail450;
      u_166 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, l_166);
      if(term == null)
        break Fail450;
      term = put_syntax_sort_0_1.instance.invoke(context, u_166, term);
      if(term == null)
        break Fail450;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}