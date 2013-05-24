package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Dyn$Rule$Union$Fix_0_2 extends Strategy 
{ 
  public static smart_$Dyn$Rule$Union$Fix_0_2 instance = new smart_$Dyn$Rule$Union$Fix_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_r_190, IStrategoTerm ref_s_190)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference r_190 = new TermReference(ref_r_190);
    TermReference s_190 = new TermReference(ref_s_190);
    context.push("smart_DynRuleUnionFix_0_2");
    Fail490:
    { 
      IStrategoTerm t_190 = null;
      IStrategoTerm n_191 = null;
      IStrategoTerm p_191 = null;
      term = extraction.constNil0;
      lifted239 lifted2390 = new lifted239();
      lifted2390.r_190 = r_190;
      lifted2390.s_190 = s_190;
      term = try_1_0.instance.invoke(context, term, lifted2390);
      if(term == null)
        break Fail490;
      lifted240 lifted2400 = new lifted240();
      lifted2400.r_190 = r_190;
      lifted2400.s_190 = s_190;
      term = try_1_0.instance.invoke(context, term, lifted2400);
      if(term == null)
        break Fail490;
      t_190 = term;
      if(r_190.value == null || s_190.value == null)
        break Fail490;
      term = (IStrategoTerm)termFactory.makeListCons(r_190.value, termFactory.makeListCons(s_190.value, (IStrategoList)extraction.constNil0));
      n_191 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", n_191, NO_STRATEGIES, new IStrategoTerm[]{extraction.const456});
      if(term == null)
        break Fail490;
      p_191 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, t_190);
      if(term == null)
        break Fail490;
      term = put_syntax_sort_0_1.instance.invoke(context, p_191, term);
      if(term == null)
        break Fail490;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}