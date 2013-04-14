package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class filter_tree_1_0 extends Strategy 
{ 
  public static filter_tree_1_0 instance = new filter_tree_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("filter_tree_1_0");
    Fail8:
    { 
      Success1:
      { 
        Fail9:
        { 
          IStrategoTerm k_15 = null;
          k_15 = term;
          term = l_15.invoke(context, term);
          if(term == null)
            break Fail9;
          term = k_15;
          { 
            term = filter_children_1_0.instance.invoke(context, term, l_15);
            if(term == null)
              break Fail8;
            term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)extraction.constNil0);
            if(true)
              break Success1;
          }
        }
        term = extraction.constNil0;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}