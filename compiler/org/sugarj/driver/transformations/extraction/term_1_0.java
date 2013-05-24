package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class term_1_0 extends Strategy 
{ 
  public static term_1_0 instance = new term_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_352)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("term_1_0");
    Fail1075:
    { 
      IStrategoTerm j_472 = null;
      IStrategoTerm i_472 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consterm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1075;
      i_472 = term.getSubterm(0);
      IStrategoList annos300 = term.getAnnotations();
      j_472 = annos300;
      term = i_352.invoke(context, i_472);
      if(term == null)
        break Fail1075;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consterm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_472));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}