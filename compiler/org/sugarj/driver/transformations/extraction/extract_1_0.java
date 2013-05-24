package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class extract_1_0 extends Strategy 
{ 
  public static extract_1_0 instance = new extract_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_332)
  { 
    context.push("extract_1_0");
    Fail709:
    { 
      IStrategoTerm term912 = term;
      Success290:
      { 
        Fail710:
        { 
          term = t_332.invoke(context, term);
          if(term == null)
            break Fail710;
          if(true)
            break Success290;
        }
        term = term912;
        IStrategoTerm args8 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        term = args8;
        lifted486 lifted4860 = new lifted486();
        lifted4860.t_332 = t_332;
        term = map_1_0.instance.invoke(context, term, lifted4860);
        if(term == null)
          break Fail709;
        term = concat_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail709;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}