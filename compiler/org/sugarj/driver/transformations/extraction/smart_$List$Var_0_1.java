package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$List$Var_0_1 extends Strategy 
{ 
  public static smart_$List$Var_0_1 instance = new smart_$List$Var_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_m_227)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference m_227 = new TermReference(ref_m_227);
    context.push("smart_ListVar_0_1");
    Fail541:
    { 
      IStrategoTerm n_227 = null;
      IStrategoTerm u_227 = null;
      IStrategoTerm w_227 = null;
      term = extraction.constNil0;
      lifted300 lifted3000 = new lifted300();
      lifted3000.m_227 = m_227;
      term = try_1_0.instance.invoke(context, term, lifted3000);
      if(term == null)
        break Fail541;
      n_227 = term;
      if(m_227.value == null)
        break Fail541;
      term = (IStrategoTerm)termFactory.makeListCons(m_227.value, (IStrategoList)extraction.constNil0);
      u_227 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", u_227, NO_STRATEGIES, new IStrategoTerm[]{extraction.const504});
      if(term == null)
        break Fail541;
      w_227 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, n_227);
      if(term == null)
        break Fail541;
      term = put_syntax_sort_0_1.instance.invoke(context, w_227, term);
      if(term == null)
        break Fail541;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}