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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_332)
  { 
    context.push("filter_children_1_0");
    Fail707:
    { 
      IStrategoTerm o_332 = null;
      IStrategoTerm p_332 = null;
      IStrategoTerm r_332 = null;
      IStrategoTerm s_332 = null;
      IStrategoTerm cons7 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
      o_332 = cons7;
      IStrategoTerm args7 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
      p_332 = args7;
      s_332 = term;
      term = p_332;
      lifted485 lifted4850 = new lifted485();
      lifted4850.q_332 = q_332;
      term = map_1_0.instance.invoke(context, term, lifted4850);
      if(term == null)
        break Fail707;
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail707;
      r_332 = term;
      term = s_332;
      IStrategoTerm mkterm1;
      mkterm1 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{o_332, r_332});
      if(mkterm1 == null)
        break Fail707;
      term = mkterm1;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}