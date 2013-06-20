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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_14)
  { 
    context.push("extract_1_0");
    Fail7:
    { 
      IStrategoTerm term0 = term;
      Success0:
      { 
        Fail8:
        { 
          term = w_14.invoke(context, term);
          if(term == null)
            break Fail8;
          if(true)
            break Success0;
        }
        term = term0;
        IStrategoTerm args2 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        term = args2;
        lifted1 lifted14 = new lifted1();
        lifted14.w_14 = w_14;
        term = map_1_0.instance.invoke(context, term, lifted14);
        if(term == null)
          break Fail7;
        term = concat_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail7;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}