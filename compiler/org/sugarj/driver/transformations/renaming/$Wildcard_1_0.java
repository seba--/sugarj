package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Wildcard_1_0 extends Strategy 
{ 
  public static $Wildcard_1_0 instance = new $Wildcard_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Wildcard_1_0");
    Fail211:
    { 
      IStrategoTerm y_148 = null;
      IStrategoTerm x_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consWildcard_1 != ((IStrategoAppl)term).getConstructor())
        break Fail211;
      x_148 = term.getSubterm(0);
      IStrategoList annos185 = term.getAnnotations();
      y_148 = annos185;
      term = b_31.invoke(context, x_148);
      if(term == null)
        break Fail211;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consWildcard_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}