package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class iter_1_0 extends Strategy 
{ 
  public static iter_1_0 instance = new iter_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_350)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("iter_1_0");
    Fail1039:
    { 
      IStrategoTerm f_467 = null;
      IStrategoTerm e_467 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consiter_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1039;
      e_467 = term.getSubterm(0);
      IStrategoList annos266 = term.getAnnotations();
      f_467 = annos266;
      term = k_350.invoke(context, e_467);
      if(term == null)
        break Fail1039;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consiter_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_467));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}