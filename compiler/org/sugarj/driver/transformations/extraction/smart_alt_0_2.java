package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_alt_0_2 extends Strategy 
{ 
  public static smart_alt_0_2 instance = new smart_alt_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_w_270, IStrategoTerm ref_x_270)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference w_270 = new TermReference(ref_w_270);
    TermReference x_270 = new TermReference(ref_x_270);
    context.push("smart_alt_0_2");
    Fail606:
    { 
      IStrategoTerm y_270 = null;
      IStrategoTerm q_271 = null;
      IStrategoTerm s_271 = null;
      term = extraction.constNil0;
      lifted379 lifted3790 = new lifted379();
      lifted3790.w_270 = w_270;
      lifted3790.x_270 = x_270;
      term = try_1_0.instance.invoke(context, term, lifted3790);
      if(term == null)
        break Fail606;
      lifted380 lifted3800 = new lifted380();
      lifted3800.w_270 = w_270;
      lifted3800.x_270 = x_270;
      term = try_1_0.instance.invoke(context, term, lifted3800);
      if(term == null)
        break Fail606;
      y_270 = term;
      if(w_270.value == null || x_270.value == null)
        break Fail606;
      term = (IStrategoTerm)termFactory.makeListCons(w_270.value, termFactory.makeListCons(x_270.value, (IStrategoList)extraction.constNil0));
      q_271 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", q_271, NO_STRATEGIES, new IStrategoTerm[]{extraction.const557});
      if(term == null)
        break Fail606;
      s_271 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, y_270);
      if(term == null)
        break Fail606;
      term = put_syntax_sort_0_1.instance.invoke(context, s_271, term);
      if(term == null)
        break Fail606;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}