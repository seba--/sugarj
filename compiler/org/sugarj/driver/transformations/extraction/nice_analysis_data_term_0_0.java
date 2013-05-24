package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class nice_analysis_data_term_0_0 extends Strategy 
{ 
  public static nice_analysis_data_term_0_0 instance = new nice_analysis_data_term_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("nice_analysis_data_term_0_0");
    Fail38:
    { 
      term = bottomup_1_0.instance.invoke(context, term, lifted16.instance);
      if(term == null)
        break Fail38;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}