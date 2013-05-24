package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Language$Id_0_1 extends Strategy 
{ 
  public static smart_$Language$Id_0_1 instance = new smart_$Language$Id_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_158)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference j_158 = new TermReference(ref_j_158);
    context.push("smart_LanguageId_0_1");
    Fail438:
    { 
      IStrategoTerm k_158 = null;
      IStrategoTerm t_158 = null;
      IStrategoTerm v_158 = null;
      term = extraction.constNil0;
      lifted182 lifted1820 = new lifted182();
      lifted1820.j_158 = j_158;
      term = try_1_0.instance.invoke(context, term, lifted1820);
      if(term == null)
        break Fail438;
      k_158 = term;
      if(j_158.value == null)
        break Fail438;
      term = (IStrategoTerm)termFactory.makeListCons(j_158.value, (IStrategoList)extraction.constNil0);
      t_158 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", t_158, NO_STRATEGIES, new IStrategoTerm[]{extraction.const421});
      if(term == null)
        break Fail438;
      v_158 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_158);
      if(term == null)
        break Fail438;
      term = put_syntax_sort_0_1.instance.invoke(context, v_158, term);
      if(term == null)
        break Fail438;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}