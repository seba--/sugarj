package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Dyn$Rule$Assign$Add_0_2 extends Strategy 
{ 
  public static smart_$Dyn$Rule$Assign$Add_0_2 instance = new smart_$Dyn$Rule$Assign$Add_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_m_183, IStrategoTerm ref_n_183)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference m_183 = new TermReference(ref_m_183);
    TermReference n_183 = new TermReference(ref_n_183);
    context.push("smart_DynRuleAssignAdd_0_2");
    Fail478:
    { 
      IStrategoTerm o_183 = null;
      IStrategoTerm y_183 = null;
      IStrategoTerm a_184 = null;
      term = extraction.constNil0;
      lifted226 lifted2260 = new lifted226();
      lifted2260.m_183 = m_183;
      lifted2260.n_183 = n_183;
      term = try_1_0.instance.invoke(context, term, lifted2260);
      if(term == null)
        break Fail478;
      o_183 = term;
      if(m_183.value == null || n_183.value == null)
        break Fail478;
      term = (IStrategoTerm)termFactory.makeListCons(m_183.value, termFactory.makeListCons(n_183.value, (IStrategoList)extraction.constNil0));
      y_183 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", y_183, NO_STRATEGIES, new IStrategoTerm[]{extraction.const447});
      if(term == null)
        break Fail478;
      a_184 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, o_183);
      if(term == null)
        break Fail478;
      term = put_syntax_sort_0_1.instance.invoke(context, a_184, term);
      if(term == null)
        break Fail478;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}