package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class natural_1_0 extends Strategy 
{ 
  public static natural_1_0 instance = new natural_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("natural_1_0");
    Fail281:
    { 
      IStrategoTerm x_149 = null;
      IStrategoTerm w_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consnatural_1 != ((IStrategoAppl)term).getConstructor())
        break Fail281;
      w_149 = term.getSubterm(0);
      IStrategoList annos232 = term.getAnnotations();
      x_149 = annos232;
      term = y_29.invoke(context, w_149);
      if(term == null)
        break Fail281;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consnatural_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}