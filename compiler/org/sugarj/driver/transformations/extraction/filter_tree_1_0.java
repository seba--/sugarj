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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_332)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("filter_tree_1_0");
    Fail711:
    { 
      Success291:
      { 
        Fail712:
        { 
          IStrategoTerm u_332 = null;
          u_332 = term;
          term = v_332.invoke(context, term);
          if(term == null)
            break Fail712;
          term = u_332;
          { 
            term = filter_children_1_0.instance.invoke(context, term, v_332);
            if(term == null)
              break Fail711;
            term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)extraction.constNil0);
            if(true)
              break Success291;
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