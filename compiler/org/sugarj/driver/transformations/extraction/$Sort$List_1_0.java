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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortList_1_0");
    Fail136:
    { 
      IStrategoTerm i_125 = null;
      IStrategoTerm h_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSortList_1 != ((IStrategoAppl)term).getConstructor())
        break Fail136;
      h_125 = term.getSubterm(0);
      IStrategoList annos110 = term.getAnnotations();
      i_125 = annos110;
      term = x_23.invoke(context, h_125);
      if(term == null)
        break Fail136;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSortList_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}