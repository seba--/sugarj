package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Wildcard$Lower$Bound_1_0 extends Strategy 
{ 
  public static $Wildcard$Lower$Bound_1_0 instance = new $Wildcard$Lower$Bound_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WildcardLowerBound_1_0");
    Fail158:
    { 
      IStrategoTerm y_128 = null;
      IStrategoTerm x_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consWildcardLowerBound_1 != ((IStrategoAppl)term).getConstructor())
        break Fail158;
      x_128 = term.getSubterm(0);
      IStrategoList annos142 = term.getAnnotations();
      y_128 = annos142;
      term = z_24.invoke(context, x_128);
      if(term == null)
        break Fail158;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consWildcardLowerBound_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}