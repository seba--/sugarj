package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Fold$Rule$All_0_2 extends Strategy 
{ 
  public static smart_$Fold$Rule$All_0_2 instance = new smart_$Fold$Rule$All_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_w_148, IStrategoTerm ref_x_148)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference w_148 = new TermReference(ref_w_148);
    TermReference x_148 = new TermReference(ref_x_148);
    context.push("smart_FoldRuleAll_0_2");
    Fail429:
    { 
      IStrategoTerm y_148 = null;
      IStrategoTerm i_149 = null;
      IStrategoTerm k_149 = null;
      term = extraction.constNil0;
      lifted163 lifted1630 = new lifted163();
      lifted1630.w_148 = w_148;
      lifted1630.x_148 = x_148;
      term = try_1_0.instance.invoke(context, term, lifted1630);
      if(term == null)
        break Fail429;
      y_148 = term;
      if(w_148.value == null || x_148.value == null)
        break Fail429;
      term = (IStrategoTerm)termFactory.makeListCons(w_148.value, termFactory.makeListCons(x_148.value, (IStrategoList)extraction.constNil0));
      i_149 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", i_149, NO_STRATEGIES, new IStrategoTerm[]{extraction.const414});
      if(term == null)
        break Fail429;
      k_149 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, y_148);
      if(term == null)
        break Fail429;
      term = put_syntax_sort_0_1.instance.invoke(context, k_149, term);
      if(term == null)
        break Fail429;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}