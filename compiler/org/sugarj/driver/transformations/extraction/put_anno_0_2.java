package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class put_anno_0_2 extends Strategy 
{ 
  public static put_anno_0_2 instance = new put_anno_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_52, IStrategoTerm f_52)
  { 
    context.push("put_anno_0_2");
    Fail25:
    { 
      IStrategoTerm g_52 = null;
      g_52 = term;
      term = get_analysis_data_annotation_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25;
      term = hashtable_put_0_2.instance.invoke(context, term, e_52, f_52);
      if(term == null)
        break Fail25;
      term = g_52;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}