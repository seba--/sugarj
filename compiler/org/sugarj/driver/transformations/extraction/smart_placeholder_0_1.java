package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_placeholder_0_1 extends Strategy 
{ 
  public static smart_placeholder_0_1 instance = new smart_placeholder_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_x_325)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference x_325 = new TermReference(ref_x_325);
    context.push("smart_placeholder_0_1");
    Fail691:
    { 
      IStrategoTerm y_325 = null;
      IStrategoTerm f_326 = null;
      IStrategoTerm h_326 = null;
      term = extraction.constNil0;
      lifted472 lifted4720 = new lifted472();
      lifted4720.x_325 = x_325;
      term = try_1_0.instance.invoke(context, term, lifted4720);
      if(term == null)
        break Fail691;
      y_325 = term;
      if(x_325.value == null)
        break Fail691;
      term = (IStrategoTerm)termFactory.makeListCons(x_325.value, (IStrategoList)extraction.constNil0);
      f_326 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_326, NO_STRATEGIES, new IStrategoTerm[]{extraction.const639});
      if(term == null)
        break Fail691;
      h_326 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, y_325);
      if(term == null)
        break Fail691;
      term = put_syntax_sort_0_1.instance.invoke(context, h_326, term);
      if(term == null)
        break Fail691;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}