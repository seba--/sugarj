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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("term_1_0");
    Fail252:
    { 
      IStrategoTerm y_144 = null;
      IStrategoTerm x_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consterm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail252;
      x_144 = term.getSubterm(0);
      IStrategoList annos204 = term.getAnnotations();
      y_144 = annos204;
      term = r_28.invoke(context, x_144);
      if(term == null)
        break Fail252;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consterm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_144));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}