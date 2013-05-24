package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class init_analysis_data_annotation_0_0 extends Strategy 
{ 
  public static init_analysis_data_annotation_0_0 instance = new init_analysis_data_annotation_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("init_analysis_data_annotation_0_0");
    Fail19:
    { 
      IStrategoTerm o_51 = null;
      o_51 = term;
      term = new_hashtable_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail19;
      term = put_analysis_data_annotation_0_1.instance.invoke(context, o_51, term);
      if(term == null)
        break Fail19;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}