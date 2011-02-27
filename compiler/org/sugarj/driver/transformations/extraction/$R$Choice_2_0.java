package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Choice_2_0 extends Strategy 
{ 
  public static $R$Choice_2_0 instance = new $R$Choice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_20, Strategy y_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RChoice_2_0");
    Fail84:
    { 
      IStrategoTerm j_116 = null;
      IStrategoTerm h_116 = null;
      IStrategoTerm i_116 = null;
      IStrategoTerm k_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consRChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail84;
      h_116 = term.getSubterm(0);
      i_116 = term.getSubterm(1);
      IStrategoList annos61 = term.getAnnotations();
      j_116 = annos61;
      term = x_20.invoke(context, h_116);
      if(term == null)
        break Fail84;
      k_116 = term;
      term = y_20.invoke(context, i_116);
      if(term == null)
        break Fail84;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consRChoice_2, new IStrategoTerm[]{k_116, term}), checkListAnnos(termFactory, j_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}