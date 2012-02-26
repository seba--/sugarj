package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Pre$Decr_1_0 extends Strategy 
{ 
  public static $Pre$Decr_1_0 instance = new $Pre$Decr_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PreDecr_1_0");
    Fail140:
    { 
      IStrategoTerm x_125 = null;
      IStrategoTerm w_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPreDecr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail140;
      w_125 = term.getSubterm(0);
      IStrategoList annos122 = term.getAnnotations();
      x_125 = annos122;
      term = f_24.invoke(context, w_125);
      if(term == null)
        break Fail140;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPreDecr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}