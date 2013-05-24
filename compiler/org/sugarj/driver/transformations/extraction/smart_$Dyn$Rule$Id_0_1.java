package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Dyn$Rule$Id_0_1 extends Strategy 
{ 
  public static smart_$Dyn$Rule$Id_0_1 instance = new smart_$Dyn$Rule$Id_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_c_186)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference c_186 = new TermReference(ref_c_186);
    context.push("smart_DynRuleId_0_1");
    Fail482:
    { 
      IStrategoTerm d_186 = null;
      IStrategoTerm k_186 = null;
      IStrategoTerm m_186 = null;
      term = extraction.constNil0;
      lifted230 lifted2300 = new lifted230();
      lifted2300.c_186 = c_186;
      term = try_1_0.instance.invoke(context, term, lifted2300);
      if(term == null)
        break Fail482;
      d_186 = term;
      if(c_186.value == null)
        break Fail482;
      term = (IStrategoTerm)termFactory.makeListCons(c_186.value, (IStrategoList)extraction.constNil0);
      k_186 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", k_186, NO_STRATEGIES, new IStrategoTerm[]{extraction.const183});
      if(term == null)
        break Fail482;
      m_186 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, d_186);
      if(term == null)
        break Fail482;
      term = put_syntax_sort_0_1.instance.invoke(context, m_186, term);
      if(term == null)
        break Fail482;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}