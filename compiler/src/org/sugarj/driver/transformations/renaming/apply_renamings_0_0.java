package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class apply_renamings_0_0 extends Strategy 
{ 
  public static apply_renamings_0_0 instance = new apply_renamings_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("apply_renamings_0_0");
    Fail0:
    { 
      TermReference a_9 = new TermReference();
      IStrategoTerm b_9 = null;
      b_9 = term;
      term = context.invokePrimitive("SUGARJ_current_renamings", term, NO_STRATEGIES, NO_TERMS);
      if(term == null)
        break Fail0;
      if(a_9.value == null)
        a_9.value = term;
      else
        if(a_9.value != term && !a_9.value.match(term))
          break Fail0;
      term = b_9;
      lifted0 lifted00 = new lifted0();
      lifted00.a_9 = a_9;
      term = try_1_0.instance.invoke(context, term, lifted00);
      if(term == null)
        break Fail0;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}