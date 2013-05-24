package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class analysis_data_as_list_0_0 extends Strategy 
{ 
  public static analysis_data_as_list_0_0 instance = new analysis_data_as_list_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("analysis_data_as_list_0_0");
    Fail35:
    { 
      IStrategoTerm h_53 = null;
      IStrategoTerm i_53 = null;
      IStrategoTerm j_53 = null;
      IStrategoTerm k_53 = null;
      IStrategoTerm l_53 = null;
      IStrategoTerm m_53 = null;
      i_53 = term;
      term = get_analysis_data_annotation_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail35;
      term = hashtable_getlist_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail35;
      h_53 = term;
      term = i_53;
      IStrategoTerm cons0 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
      j_53 = cons0;
      IStrategoTerm args0 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
      k_53 = args0;
      m_53 = term;
      term = map_1_0.instance.invoke(context, k_53, analysis_data_as_list_0_0.instance);
      if(term == null)
        break Fail35;
      l_53 = term;
      term = m_53;
      IStrategoTerm mkterm0;
      mkterm0 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{j_53, l_53});
      if(mkterm0 == null)
        break Fail35;
      term = put_analysis_data_annotation_0_1.instance.invoke(context, mkterm0, h_53);
      if(term == null)
        break Fail35;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}