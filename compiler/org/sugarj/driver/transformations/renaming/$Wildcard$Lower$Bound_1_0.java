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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WildcardLowerBound_1_0");
    Fail163:
    { 
      IStrategoTerm g_130 = null;
      IStrategoTerm f_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consWildcardLowerBound_1 != ((IStrategoAppl)term).getConstructor())
        break Fail163;
      f_130 = term.getSubterm(0);
      IStrategoList annos142 = term.getAnnotations();
      g_130 = annos142;
      term = w_25.invoke(context, f_130);
      if(term == null)
        break Fail163;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consWildcardLowerBound_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}