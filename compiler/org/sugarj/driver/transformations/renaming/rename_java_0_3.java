package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class rename_java_0_3 extends Strategy 
{ 
  public static rename_java_0_3 instance = new rename_java_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_23, IStrategoTerm v_23, IStrategoTerm w_23)
  { 
    context.push("rename_java_0_3");
    Fail7:
    { 
      term = do_rename_java_0_3.instance.invoke(context, term, u_23, v_23, w_23);
      if(term == null)
        break Fail7;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}