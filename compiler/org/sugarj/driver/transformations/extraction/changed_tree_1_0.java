package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class changed_tree_1_0 extends Strategy 
{ 
  public static changed_tree_1_0 instance = new changed_tree_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_50)
  { 
    context.push("changed_tree_1_0");
    Fail0:
    { 
      IStrategoTerm f_50 = null;
      f_50 = term;
      term = g_50.invoke(context, term);
      if(term == null)
        break Fail0;
      IStrategoTerm term0 = term;
      Success0:
      { 
        Fail1:
        { 
          term = equal_0_1.instance.invoke(context, term, f_50);
          if(term == null)
            break Fail1;
          { 
            if(true)
              break Fail0;
            if(true)
              break Success0;
          }
        }
        term = term0;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}