package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class analyze_main_0_0 extends Strategy 
{ 
  public static analyze_main_0_0 instance = new analyze_main_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("analyze_main_0_0");
    Fail14:
    { 
      term = init_for_analysis_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail14;
      term = repeat_1_0.instance.invoke(context, term, start_analysis_0_0.instance);
      if(term == null)
        break Fail14;
      term = rm_empty_analysis_data_annotations_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail14;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}