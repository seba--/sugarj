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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_14)
  { 
    context.push("filter_children_1_0");
    Fail5:
    { 
      IStrategoTerm r_14 = null;
      IStrategoTerm s_14 = null;
      IStrategoTerm u_14 = null;
      IStrategoTerm v_14 = null;
      IStrategoTerm cons1 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
      r_14 = cons1;
      IStrategoTerm args1 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
      s_14 = args1;
      v_14 = term;
      term = s_14;
      lifted0 lifted00 = new lifted0();
      lifted00.t_14 = t_14;
      term = map_1_0.instance.invoke(context, term, lifted00);
      if(term == null)
        break Fail5;
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5;
      u_14 = term;
      term = v_14;
      IStrategoTerm mkterm0;
      mkterm0 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{r_14, u_14});
      if(mkterm0 == null)
        break Fail5;
      term = mkterm0;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}