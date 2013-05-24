package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class rm_anno_0_1 extends Strategy 
{ 
  public static rm_anno_0_1 instance = new rm_anno_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_52)
  { 
    context.push("rm_anno_0_1");
    Fail26:
    { 
      IStrategoTerm l_52 = null;
      l_52 = term;
      term = get_analysis_data_annotation_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26;
      term = hashtable_remove_0_1.instance.invoke(context, term, k_52);
      if(term == null)
        break Fail26;
      term = l_52;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}