package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class get_anno_0_1 extends Strategy 
{ 
  public static get_anno_0_1 instance = new get_anno_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_52)
  { 
    context.push("get_anno_0_1");
    Fail24:
    { 
      term = get_analysis_data_annotation_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24;
      term = hashtable_get_0_1.instance.invoke(context, term, d_52);
      if(term == null)
        break Fail24;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}