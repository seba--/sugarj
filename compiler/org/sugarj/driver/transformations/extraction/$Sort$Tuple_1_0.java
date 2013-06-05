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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortTuple_1_0");
    Fail146:
    { 
      IStrategoTerm c_125 = null;
      IStrategoTerm b_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consSortTuple_1 != ((IStrategoAppl)term).getConstructor())
        break Fail146;
      b_125 = term.getSubterm(0);
      IStrategoList annos116 = term.getAnnotations();
      c_125 = annos116;
      term = t_23.invoke(context, b_125);
      if(term == null)
        break Fail146;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consSortTuple_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}