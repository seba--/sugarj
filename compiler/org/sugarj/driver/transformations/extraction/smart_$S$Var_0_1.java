package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$S$Var_0_1 extends Strategy 
{ 
  public static smart_$S$Var_0_1 instance = new smart_$S$Var_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_x_252)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference x_252 = new TermReference(ref_x_252);
    context.push("smart_SVar_0_1");
    Fail580:
    { 
      IStrategoTerm y_252 = null;
      IStrategoTerm g_253 = null;
      IStrategoTerm i_253 = null;
      term = extraction.constNil0;
      lifted348 lifted3480 = new lifted348();
      lifted3480.x_252 = x_252;
      term = try_1_0.instance.invoke(context, term, lifted3480);
      if(term == null)
        break Fail580;
      y_252 = term;
      if(x_252.value == null)
        break Fail580;
      term = (IStrategoTerm)termFactory.makeListCons(x_252.value, (IStrategoList)extraction.constNil0);
      g_253 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", g_253, NO_STRATEGIES, new IStrategoTerm[]{extraction.const212});
      if(term == null)
        break Fail580;
      i_253 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, y_252);
      if(term == null)
        break Fail580;
      term = put_syntax_sort_0_1.instance.invoke(context, i_253, term);
      if(term == null)
        break Fail580;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}