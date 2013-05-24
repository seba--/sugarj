package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class positive_1_0 extends Strategy 
{ 
  public static positive_1_0 instance = new positive_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_351)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("positive_1_0");
    Fail1067:
    { 
      IStrategoTerm h_471 = null;
      IStrategoTerm g_471 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conspositive_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1067;
      g_471 = term.getSubterm(0);
      IStrategoList annos292 = term.getAnnotations();
      h_471 = annos292;
      term = y_351.invoke(context, g_471);
      if(term == null)
        break Fail1067;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conspositive_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_471));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}