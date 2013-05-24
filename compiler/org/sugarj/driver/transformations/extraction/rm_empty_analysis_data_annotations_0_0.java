package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class rm_empty_analysis_data_annotations_0_0 extends Strategy 
{ 
  public static rm_empty_analysis_data_annotations_0_0 instance = new rm_empty_analysis_data_annotations_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail23:
    { 
      if(true)
        return term;
    }
    context.push("rm_empty_analysis_data_annotations_0_0");
    context.popOnFailure();
    return null;
  }
}