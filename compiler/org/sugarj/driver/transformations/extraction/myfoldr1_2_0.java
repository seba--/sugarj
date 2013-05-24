package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class myfoldr1_2_0 extends Strategy 
{ 
  public static myfoldr1_2_0 instance = new myfoldr1_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_50, Strategy s_50)
  { 
    context.push("myfoldr1_2_0");
    Fail8:
    { 
      term = myfoldr1_3_0.instance.invoke(context, term, _Fail.instance, r_50, s_50);
      if(term == null)
        break Fail8;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}