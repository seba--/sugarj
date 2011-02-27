package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class filter_children_1_0 extends Strategy 
{ 
  public static filter_children_1_0 instance = new filter_children_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_15)
  { 
    context.push("filter_children_1_0");
    Fail4:
    { 
      IStrategoTerm e_15 = null;
      IStrategoTerm f_15 = null;
      IStrategoTerm h_15 = null;
      IStrategoTerm i_15 = null;
      IStrategoTerm cons1 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
      e_15 = cons1;
      IStrategoTerm args1 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
      f_15 = args1;
      i_15 = term;
      term = f_15;
      lifted6 lifted65 = new lifted6();
      lifted65.g_15 = g_15;
      term = map_1_0.instance.invoke(context, term, lifted65);
      if(term == null)
        break Fail4;
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4;
      h_15 = term;
      term = i_15;
      IStrategoTerm mkterm0;
      mkterm0 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{e_15, h_15});
      if(mkterm0 == null)
        break Fail4;
      term = mkterm0;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}