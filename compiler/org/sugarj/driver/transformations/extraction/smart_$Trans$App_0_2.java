package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Trans$App_0_2 extends Strategy 
{ 
  public static smart_$Trans$App_0_2 instance = new smart_$Trans$App_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_x_95, IStrategoTerm ref_y_95)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference x_95 = new TermReference(ref_x_95);
    TermReference y_95 = new TermReference(ref_y_95);
    context.push("smart_TransApp_0_2");
    Fail349:
    { 
      IStrategoTerm z_95 = null;
      IStrategoTerm j_96 = null;
      IStrategoTerm l_96 = null;
      term = extraction.constNil0;
      lifted56 lifted560 = new lifted56();
      lifted560.x_95 = x_95;
      lifted560.y_95 = y_95;
      term = try_1_0.instance.invoke(context, term, lifted560);
      if(term == null)
        break Fail349;
      z_95 = term;
      if(x_95.value == null || y_95.value == null)
        break Fail349;
      term = (IStrategoTerm)termFactory.makeListCons(x_95.value, termFactory.makeListCons(y_95.value, (IStrategoList)extraction.constNil0));
      j_96 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", j_96, NO_STRATEGIES, new IStrategoTerm[]{extraction.const338});
      if(term == null)
        break Fail349;
      l_96 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, z_95);
      if(term == null)
        break Fail349;
      term = put_syntax_sort_0_1.instance.invoke(context, l_96, term);
      if(term == null)
        break Fail349;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}