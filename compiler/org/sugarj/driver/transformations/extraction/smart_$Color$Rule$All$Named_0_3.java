package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Color$Rule$All$Named_0_3 extends Strategy 
{ 
  public static smart_$Color$Rule$All$Named_0_3 instance = new smart_$Color$Rule$All$Named_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_129, IStrategoTerm ref_a_130, IStrategoTerm ref_c_130)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference z_129 = new TermReference(ref_z_129);
    TermReference a_130 = new TermReference(ref_a_130);
    TermReference c_130 = new TermReference(ref_c_130);
    context.push("smart_ColorRuleAllNamed_0_3");
    Fail402:
    { 
      IStrategoTerm d_130 = null;
      IStrategoTerm s_131 = null;
      IStrategoTerm v_131 = null;
      term = extraction.constNil0;
      lifted134 lifted1340 = new lifted134();
      lifted1340.z_129 = z_129;
      lifted1340.a_130 = a_130;
      lifted1340.c_130 = c_130;
      term = try_1_0.instance.invoke(context, term, lifted1340);
      if(term == null)
        break Fail402;
      lifted135 lifted1350 = new lifted135();
      lifted1350.z_129 = z_129;
      lifted1350.a_130 = a_130;
      lifted1350.c_130 = c_130;
      term = try_1_0.instance.invoke(context, term, lifted1350);
      if(term == null)
        break Fail402;
      d_130 = term;
      if(z_129.value == null || (a_130.value == null || c_130.value == null))
        break Fail402;
      term = (IStrategoTerm)termFactory.makeListCons(z_129.value, termFactory.makeListCons(a_130.value, termFactory.makeListCons(c_130.value, (IStrategoList)extraction.constNil0)));
      s_131 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", s_131, NO_STRATEGIES, new IStrategoTerm[]{extraction.const390});
      if(term == null)
        break Fail402;
      v_131 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, d_130);
      if(term == null)
        break Fail402;
      term = put_syntax_sort_0_1.instance.invoke(context, v_131, term);
      if(term == null)
        break Fail402;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}