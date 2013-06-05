package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort$List_1_0 extends Strategy 
{ 
  public static $Sort$List_1_0 instance = new $Sort$List_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortList_1_0");
    Fail148:
    { 
      IStrategoTerm l_125 = null;
      IStrategoTerm k_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consSortList_1 != ((IStrategoAppl)term).getConstructor())
        break Fail148;
      k_125 = term.getSubterm(0);
      IStrategoList annos118 = term.getAnnotations();
      l_125 = annos118;
      term = w_23.invoke(context, k_125);
      if(term == null)
        break Fail148;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consSortList_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}