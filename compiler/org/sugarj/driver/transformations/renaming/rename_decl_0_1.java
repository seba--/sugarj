package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class rename_decl_0_1 extends Strategy 
{ 
  public static rename_decl_0_1 instance = new rename_decl_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_9)
  { 
    Fail2:
    { 
      if(true)
        break Fail2;
      if(true)
        return term;
    }
    context.push("rename_decl_0_1");
    context.popOnFailure();
    return null;
  }
}