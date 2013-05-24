package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Labeled$Dyn$Rule$Id_0_2 extends Strategy 
{ 
  public static smart_$Labeled$Dyn$Rule$Id_0_2 instance = new smart_$Labeled$Dyn$Rule$Id_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_u_184, IStrategoTerm ref_v_184)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference u_184 = new TermReference(ref_u_184);
    TermReference v_184 = new TermReference(ref_v_184);
    context.push("smart_LabeledDynRuleId_0_2");
    Fail480:
    { 
      IStrategoTerm w_184 = null;
      IStrategoTerm g_185 = null;
      IStrategoTerm k_185 = null;
      term = extraction.constNil0;
      lifted228 lifted2280 = new lifted228();
      lifted2280.u_184 = u_184;
      lifted2280.v_184 = v_184;
      term = try_1_0.instance.invoke(context, term, lifted2280);
      if(term == null)
        break Fail480;
      w_184 = term;
      if(u_184.value == null || v_184.value == null)
        break Fail480;
      term = (IStrategoTerm)termFactory.makeListCons(u_184.value, termFactory.makeListCons(v_184.value, (IStrategoList)extraction.constNil0));
      g_185 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", g_185, NO_STRATEGIES, new IStrategoTerm[]{extraction.const449});
      if(term == null)
        break Fail480;
      k_185 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, w_184);
      if(term == null)
        break Fail480;
      term = put_syntax_sort_0_1.instance.invoke(context, k_185, term);
      if(term == null)
        break Fail480;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}