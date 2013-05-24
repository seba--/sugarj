package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Match_0_1 extends Strategy 
{ 
  public static smart_$Match_0_1 instance = new smart_$Match_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_260)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference j_260 = new TermReference(ref_j_260);
    context.push("smart_Match_0_1");
    Fail591:
    { 
      IStrategoTerm k_260 = null;
      IStrategoTerm w_260 = null;
      IStrategoTerm y_260 = null;
      term = extraction.constNil0;
      lifted359 lifted3590 = new lifted359();
      lifted3590.j_260 = j_260;
      term = try_1_0.instance.invoke(context, term, lifted3590);
      if(term == null)
        break Fail591;
      lifted360 lifted3600 = new lifted360();
      lifted3600.j_260 = j_260;
      term = try_1_0.instance.invoke(context, term, lifted3600);
      if(term == null)
        break Fail591;
      k_260 = term;
      if(j_260.value == null)
        break Fail591;
      term = (IStrategoTerm)termFactory.makeListCons(j_260.value, (IStrategoList)extraction.constNil0);
      w_260 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", w_260, NO_STRATEGIES, new IStrategoTerm[]{extraction.const543});
      if(term == null)
        break Fail591;
      y_260 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_260);
      if(term == null)
        break Fail591;
      term = put_syntax_sort_0_1.instance.invoke(context, y_260, term);
      if(term == null)
        break Fail591;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}