package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Dyn$Rule$Scope_0_2 extends Strategy 
{ 
  public static smart_$Dyn$Rule$Scope_0_2 instance = new smart_$Dyn$Rule$Scope_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_y_177, IStrategoTerm ref_z_177)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference y_177 = new TermReference(ref_y_177);
    TermReference z_177 = new TermReference(ref_z_177);
    context.push("smart_DynRuleScope_0_2");
    Fail469:
    { 
      IStrategoTerm a_178 = null;
      IStrategoTerm k_178 = null;
      IStrategoTerm m_178 = null;
      term = extraction.constNil0;
      lifted217 lifted2170 = new lifted217();
      lifted2170.y_177 = y_177;
      lifted2170.z_177 = z_177;
      term = try_1_0.instance.invoke(context, term, lifted2170);
      if(term == null)
        break Fail469;
      a_178 = term;
      if(y_177.value == null || z_177.value == null)
        break Fail469;
      term = (IStrategoTerm)termFactory.makeListCons(y_177.value, termFactory.makeListCons(z_177.value, (IStrategoList)extraction.constNil0));
      k_178 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", k_178, NO_STRATEGIES, new IStrategoTerm[]{extraction.const439});
      if(term == null)
        break Fail469;
      m_178 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, a_178);
      if(term == null)
        break Fail469;
      term = put_syntax_sort_0_1.instance.invoke(context, m_178, term);
      if(term == null)
        break Fail469;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}