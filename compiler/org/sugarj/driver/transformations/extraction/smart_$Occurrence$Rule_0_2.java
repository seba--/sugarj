package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Occurrence$Rule_0_2 extends Strategy 
{ 
  public static smart_$Occurrence$Rule_0_2 instance = new smart_$Occurrence$Rule_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_w_126, IStrategoTerm ref_x_126)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference w_126 = new TermReference(ref_w_126);
    TermReference x_126 = new TermReference(ref_x_126);
    context.push("smart_OccurrenceRule_0_2");
    Fail398:
    { 
      IStrategoTerm y_126 = null;
      IStrategoTerm l_127 = null;
      IStrategoTerm n_127 = null;
      term = extraction.constNil0;
      lifted129 lifted1290 = new lifted129();
      lifted1290.w_126 = w_126;
      lifted1290.x_126 = x_126;
      term = try_1_0.instance.invoke(context, term, lifted1290);
      if(term == null)
        break Fail398;
      y_126 = term;
      if(w_126.value == null || x_126.value == null)
        break Fail398;
      term = (IStrategoTerm)termFactory.makeListCons(w_126.value, termFactory.makeListCons(x_126.value, (IStrategoList)extraction.constNil0));
      l_127 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", l_127, NO_STRATEGIES, new IStrategoTerm[]{extraction.const387});
      if(term == null)
        break Fail398;
      n_127 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, y_126);
      if(term == null)
        break Fail398;
      term = put_syntax_sort_0_1.instance.invoke(context, n_127, term);
      if(term == null)
        break Fail398;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}