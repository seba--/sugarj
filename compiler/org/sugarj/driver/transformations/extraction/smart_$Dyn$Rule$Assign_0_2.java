package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Dyn$Rule$Assign_0_2 extends Strategy 
{ 
  public static smart_$Dyn$Rule$Assign_0_2 instance = new smart_$Dyn$Rule$Assign_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_u_182, IStrategoTerm ref_v_182)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference u_182 = new TermReference(ref_u_182);
    TermReference v_182 = new TermReference(ref_v_182);
    context.push("smart_DynRuleAssign_0_2");
    Fail477:
    { 
      IStrategoTerm w_182 = null;
      IStrategoTerm j_183 = null;
      IStrategoTerm l_183 = null;
      term = extraction.constNil0;
      lifted225 lifted2250 = new lifted225();
      lifted2250.u_182 = u_182;
      lifted2250.v_182 = v_182;
      term = try_1_0.instance.invoke(context, term, lifted2250);
      if(term == null)
        break Fail477;
      w_182 = term;
      if(u_182.value == null || v_182.value == null)
        break Fail477;
      term = (IStrategoTerm)termFactory.makeListCons(u_182.value, termFactory.makeListCons(v_182.value, (IStrategoList)extraction.constNil0));
      j_183 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", j_183, NO_STRATEGIES, new IStrategoTerm[]{extraction.const446});
      if(term == null)
        break Fail477;
      l_183 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, w_182);
      if(term == null)
        break Fail477;
      term = put_syntax_sort_0_1.instance.invoke(context, l_183, term);
      if(term == null)
        break Fail477;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}