package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$S$Def_0_3 extends Strategy 
{ 
  public static smart_$S$Def_0_3 instance = new smart_$S$Def_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_m_206, IStrategoTerm ref_n_206, IStrategoTerm ref_o_206)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference m_206 = new TermReference(ref_m_206);
    TermReference n_206 = new TermReference(ref_n_206);
    TermReference o_206 = new TermReference(ref_o_206);
    context.push("smart_SDef_0_3");
    Fail506:
    { 
      IStrategoTerm p_206 = null;
      IStrategoTerm f_207 = null;
      IStrategoTerm h_207 = null;
      term = extraction.constNil0;
      lifted265 lifted2650 = new lifted265();
      lifted2650.m_206 = m_206;
      lifted2650.n_206 = n_206;
      lifted2650.o_206 = o_206;
      term = try_1_0.instance.invoke(context, term, lifted2650);
      if(term == null)
        break Fail506;
      p_206 = term;
      if(m_206.value == null || (n_206.value == null || o_206.value == null))
        break Fail506;
      term = (IStrategoTerm)termFactory.makeListCons(m_206.value, termFactory.makeListCons(n_206.value, termFactory.makeListCons(o_206.value, (IStrategoList)extraction.constNil0)));
      f_207 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_207, NO_STRATEGIES, new IStrategoTerm[]{extraction.const471});
      if(term == null)
        break Fail506;
      h_207 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, p_206);
      if(term == null)
        break Fail506;
      term = put_syntax_sort_0_1.instance.invoke(context, h_207, term);
      if(term == null)
        break Fail506;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}