package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class restore_analysis_data_0_0 extends Strategy 
{ 
  public static restore_analysis_data_0_0 instance = new restore_analysis_data_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("restore_analysis_data_0_0");
    Fail36:
    { 
      IStrategoTerm n_53 = null;
      IStrategoTerm o_53 = null;
      IStrategoTerm p_53 = null;
      IStrategoTerm q_53 = null;
      IStrategoTerm s_53 = null;
      IStrategoTerm t_53 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail36;
      o_53 = term.getSubterm(0);
      n_53 = term.getSubterm(1);
      s_53 = term;
      term = get_analysis_data_annotation_0_0.instance.invoke(context, n_53);
      if(term == null)
        break Fail36;
      p_53 = term;
      t_53 = s_53;
      term = get_analysis_data_annotation_0_0.instance.invoke(context, o_53);
      if(term == null)
        break Fail36;
      term = hashtable_clear_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail36;
      term = hashtable_putlist_0_1.instance.invoke(context, term, p_53);
      if(term == null)
        break Fail36;
      term = t_53;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail36;
      IStrategoTerm arg14 = term.getSubterm(0);
      IStrategoTerm args1 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{arg14});
      q_53 = args1;
      IStrategoTerm arg15 = term.getSubterm(1);
      IStrategoTerm args2 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{arg15});
      term = termFactory.makeTuple(q_53, args2);
      term = zip_1_0.instance.invoke(context, term, restore_analysis_data_0_0.instance);
      if(term == null)
        break Fail36;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}