package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Const$Type_0_1 extends Strategy 
{ 
  public static smart_$Const$Type_0_1 instance = new smart_$Const$Type_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_y_247)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference y_247 = new TermReference(ref_y_247);
    context.push("smart_ConstType_0_1");
    Fail571:
    { 
      IStrategoTerm b_248 = null;
      IStrategoTerm i_248 = null;
      IStrategoTerm k_248 = null;
      term = extraction.constNil0;
      lifted339 lifted3390 = new lifted339();
      lifted3390.y_247 = y_247;
      term = try_1_0.instance.invoke(context, term, lifted3390);
      if(term == null)
        break Fail571;
      b_248 = term;
      if(y_247.value == null)
        break Fail571;
      term = (IStrategoTerm)termFactory.makeListCons(y_247.value, (IStrategoList)extraction.constNil0);
      i_248 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", i_248, NO_STRATEGIES, new IStrategoTerm[]{extraction.const57});
      if(term == null)
        break Fail571;
      k_248 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, b_248);
      if(term == null)
        break Fail571;
      term = put_syntax_sort_0_1.instance.invoke(context, k_248, term);
      if(term == null)
        break Fail571;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}