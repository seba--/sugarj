package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class get_analysis_data_annotation_0_0 extends Strategy 
{ 
  public static get_analysis_data_annotation_0_0 instance = new get_analysis_data_annotation_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_analysis_data_annotation_0_0");
    Fail18:
    { 
      term = get_annotations_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail18;
      term = termFactory.makeTuple(extraction.const2, term);
      term = lookup_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail18;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}