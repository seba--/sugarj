package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_renamings_0_1 extends Strategy 
{ 
  public static smart_renamings_0_1 instance = new smart_renamings_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_x_311)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference x_311 = new TermReference(ref_x_311);
    context.push("smart_renamings_0_1");
    Fail664:
    { 
      IStrategoTerm y_311 = null;
      IStrategoTerm f_312 = null;
      IStrategoTerm h_312 = null;
      term = extraction.constNil0;
      lifted445 lifted4450 = new lifted445();
      lifted4450.x_311 = x_311;
      term = try_1_0.instance.invoke(context, term, lifted4450);
      if(term == null)
        break Fail664;
      y_311 = term;
      if(x_311.value == null)
        break Fail664;
      term = (IStrategoTerm)termFactory.makeListCons(x_311.value, (IStrategoList)extraction.constNil0);
      f_312 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_312, NO_STRATEGIES, new IStrategoTerm[]{extraction.const613});
      if(term == null)
        break Fail664;
      h_312 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, y_311);
      if(term == null)
        break Fail664;
      term = put_syntax_sort_0_1.instance.invoke(context, h_312, term);
      if(term == null)
        break Fail664;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}