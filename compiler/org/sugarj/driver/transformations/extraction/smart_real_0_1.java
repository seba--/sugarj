package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_real_0_1 extends Strategy 
{ 
  public static smart_real_0_1 instance = new smart_real_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_m_324)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference m_324 = new TermReference(ref_m_324);
    context.push("smart_real_0_1");
    Fail688:
    { 
      IStrategoTerm n_324 = null;
      IStrategoTerm u_324 = null;
      IStrategoTerm w_324 = null;
      term = extraction.constNil0;
      lifted469 lifted4690 = new lifted469();
      lifted4690.m_324 = m_324;
      term = try_1_0.instance.invoke(context, term, lifted4690);
      if(term == null)
        break Fail688;
      n_324 = term;
      if(m_324.value == null)
        break Fail688;
      term = (IStrategoTerm)termFactory.makeListCons(m_324.value, (IStrategoList)extraction.constNil0);
      u_324 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", u_324, NO_STRATEGIES, new IStrategoTerm[]{extraction.const636});
      if(term == null)
        break Fail688;
      w_324 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, n_324);
      if(term == null)
        break Fail688;
      term = put_syntax_sort_0_1.instance.invoke(context, w_324, term);
      if(term == null)
        break Fail688;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}