package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class apply_renamings_0_1 extends Strategy 
{ 
  public static apply_renamings_0_1 instance = new apply_renamings_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_9)
  { 
    context.push("apply_renamings_0_1");
    Fail1:
    { 
      term = rename_decl_0_1.instance.invoke(context, term, c_9);
      if(term == null)
        break Fail1;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}