package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Scope$Default_0_1 extends Strategy 
{ 
  public static smart_$Scope$Default_0_1 instance = new smart_$Scope$Default_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_l_208)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference l_208 = new TermReference(ref_l_208);
    context.push("smart_ScopeDefault_0_1");
    Fail509:
    { 
      IStrategoTerm m_208 = null;
      IStrategoTerm t_208 = null;
      IStrategoTerm v_208 = null;
      term = extraction.constNil0;
      lifted268 lifted2680 = new lifted268();
      lifted2680.l_208 = l_208;
      term = try_1_0.instance.invoke(context, term, lifted2680);
      if(term == null)
        break Fail509;
      m_208 = term;
      if(l_208.value == null)
        break Fail509;
      term = (IStrategoTerm)termFactory.makeListCons(l_208.value, (IStrategoList)extraction.constNil0);
      t_208 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", t_208, NO_STRATEGIES, new IStrategoTerm[]{extraction.const474});
      if(term == null)
        break Fail509;
      v_208 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, m_208);
      if(term == null)
        break Fail509;
      term = put_syntax_sort_0_1.instance.invoke(context, v_208, term);
      if(term == null)
        break Fail509;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}