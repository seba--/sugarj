package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class sort_1_0 extends Strategy 
{ 
  public static sort_1_0 instance = new sort_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("sort_1_0");
    Fail217:
    { 
      IStrategoTerm j_140 = null;
      IStrategoTerm i_140 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conssort_1 != ((IStrategoAppl)term).getConstructor())
        break Fail217;
      i_140 = term.getSubterm(0);
      IStrategoList annos178 = term.getAnnotations();
      j_140 = annos178;
      term = q_27.invoke(context, i_140);
      if(term == null)
        break Fail217;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conssort_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_140));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}