package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort$Tuple_1_0 extends Strategy 
{ 
  public static $Sort$Tuple_1_0 instance = new $Sort$Tuple_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortTuple_1_0");
    Fail135:
    { 
      IStrategoTerm x_124 = null;
      IStrategoTerm w_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSortTuple_1 != ((IStrategoAppl)term).getConstructor())
        break Fail135;
      w_124 = term.getSubterm(0);
      IStrategoList annos108 = term.getAnnotations();
      x_124 = annos108;
      term = u_23.invoke(context, w_124);
      if(term == null)
        break Fail135;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSortTuple_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_124));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}