package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Labeled$Dyn$Rule$Scope$Id_0_2 extends Strategy 
{ 
  public static smart_$Labeled$Dyn$Rule$Scope$Id_0_2 instance = new smart_$Labeled$Dyn$Rule$Scope$Id_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_n_186, IStrategoTerm ref_o_186)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference n_186 = new TermReference(ref_n_186);
    TermReference o_186 = new TermReference(ref_o_186);
    context.push("smart_LabeledDynRuleScopeId_0_2");
    Fail483:
    { 
      IStrategoTerm p_186 = null;
      IStrategoTerm b_187 = null;
      IStrategoTerm d_187 = null;
      term = extraction.constNil0;
      lifted231 lifted2310 = new lifted231();
      lifted2310.n_186 = n_186;
      lifted2310.o_186 = o_186;
      term = try_1_0.instance.invoke(context, term, lifted2310);
      if(term == null)
        break Fail483;
      p_186 = term;
      if(n_186.value == null || o_186.value == null)
        break Fail483;
      term = (IStrategoTerm)termFactory.makeListCons(n_186.value, termFactory.makeListCons(o_186.value, (IStrategoList)extraction.constNil0));
      b_187 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", b_187, NO_STRATEGIES, new IStrategoTerm[]{extraction.const451});
      if(term == null)
        break Fail483;
      d_187 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, p_186);
      if(term == null)
        break Fail483;
      term = put_syntax_sort_0_1.instance.invoke(context, d_187, term);
      if(term == null)
        break Fail483;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}