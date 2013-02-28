package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class replace_name_0_2 extends Strategy 
{ 
  public static replace_name_0_2 instance = new replace_name_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_9, IStrategoTerm r_9)
  { 
    context.push("replace_name_0_2");
    Fail9:
    { 
      IStrategoTerm s_9 = null;
      IStrategoTerm v_9 = null;
      s_9 = term;
      v_9 = term;
      term = strip_annos_0_0.instance.invoke(context, s_9);
      if(term == null)
        break Fail9;
      term = equal_0_2.instance.invoke(context, v_9, term, q_9);
      if(term == null)
        break Fail9;
      term = r_9;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}