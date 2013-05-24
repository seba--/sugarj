package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class rm_analysis_data_annotation_0_0 extends Strategy 
{ 
  public static rm_analysis_data_annotation_0_0 instance = new rm_analysis_data_annotation_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("rm_analysis_data_annotation_0_0");
    Fail22:
    { 
      IStrategoTerm z_51 = null;
      IStrategoTerm a_52 = null;
      a_52 = term;
      term = get_annotations_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22;
      term = filter_1_0.instance.invoke(context, term, lifted5.instance);
      if(term == null)
        break Fail22;
      z_51 = term;
      term = a_52;
      term = termFactory.makeTuple(term, z_51);
      term = set_annotations_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}