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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("filter_tree_1_0");
    Fail9:
    { 
      Success1:
      { 
        Fail10:
        { 
          IStrategoTerm x_14 = null;
          x_14 = term;
          term = y_14.invoke(context, term);
          if(term == null)
            break Fail10;
          term = x_14;
          { 
            term = filter_children_1_0.instance.invoke(context, term, y_14);
            if(term == null)
              break Fail9;
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