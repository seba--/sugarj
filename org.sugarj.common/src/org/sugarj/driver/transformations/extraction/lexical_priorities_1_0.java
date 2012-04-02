package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lexical_priorities_1_0 extends Strategy 
{ 
  public static lexical_priorities_1_0 instance = new lexical_priorities_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_priorities_1_0");
    Fail245:
    { 
      IStrategoTerm y_145 = null;
      IStrategoTerm x_145 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conslexical_priorities_1 != ((IStrategoAppl)term).getConstructor())
        break Fail245;
      x_145 = term.getSubterm(0);
      IStrategoList annos200 = term.getAnnotations();
      y_145 = annos200;
      term = w_28.invoke(context, x_145);
      if(term == null)
        break Fail245;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conslexical_priorities_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_145));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}