package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_transformation_elem_0_1 extends Strategy 
{ 
  public static smart_transformation_elem_0_1 instance = new smart_transformation_elem_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_x_96)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference x_96 = new TermReference(ref_x_96);
    context.push("smart_transformation_elem_0_1");
    Fail351:
    { 
      IStrategoTerm y_96 = null;
      IStrategoTerm h_97 = null;
      IStrategoTerm l_97 = null;
      term = extraction.constNil0;
      lifted58 lifted580 = new lifted58();
      lifted580.x_96 = x_96;
      term = try_1_0.instance.invoke(context, term, lifted580);
      if(term == null)
        break Fail351;
      y_96 = term;
      if(x_96.value == null)
        break Fail351;
      term = (IStrategoTerm)termFactory.makeListCons(x_96.value, (IStrategoList)extraction.constNil0);
      h_97 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", h_97, NO_STRATEGIES, new IStrategoTerm[]{extraction.const341});
      if(term == null)
        break Fail351;
      l_97 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, y_96);
      if(term == null)
        break Fail351;
      term = put_syntax_sort_0_1.instance.invoke(context, l_97, term);
      if(term == null)
        break Fail351;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}