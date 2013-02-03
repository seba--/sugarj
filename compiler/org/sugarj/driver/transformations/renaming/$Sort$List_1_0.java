package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortList_1_0");
    Fail122:
    { 
      IStrategoTerm r_111 = null;
      IStrategoTerm q_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSortList_1 != ((IStrategoAppl)term).getConstructor())
        break Fail122;
      q_111 = term.getSubterm(0);
      IStrategoList annos110 = term.getAnnotations();
      r_111 = annos110;
      term = r_17.invoke(context, q_111);
      if(term == null)
        break Fail122;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSortList_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}