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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortTuple_1_0");
    Fail942:
    { 
      IStrategoTerm o_454 = null;
      IStrategoTerm n_454 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSortTuple_1 != ((IStrategoAppl)term).getConstructor())
        break Fail942;
      n_454 = term.getSubterm(0);
      IStrategoList annos187 = term.getAnnotations();
      o_454 = annos187;
      term = p_345.invoke(context, n_454);
      if(term == null)
        break Fail942;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSortTuple_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_454));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}