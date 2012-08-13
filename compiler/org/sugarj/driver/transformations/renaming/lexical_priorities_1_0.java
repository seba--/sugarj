package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_priorities_1_0");
    Fail38:
    { 
      IStrategoTerm y_107 = null;
      IStrategoTerm x_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._conslexical_priorities_1 != ((IStrategoAppl)term).getConstructor())
        break Fail38;
      x_107 = term.getSubterm(0);
      IStrategoList annos20 = term.getAnnotations();
      y_107 = annos20;
      term = q_18.invoke(context, x_107);
      if(term == null)
        break Fail38;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._conslexical_priorities_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}