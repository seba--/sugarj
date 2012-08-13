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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WildcardLowerBound_1_0");
    Fail209:
    { 
      IStrategoTerm s_148 = null;
      IStrategoTerm r_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consWildcardLowerBound_1 != ((IStrategoAppl)term).getConstructor())
        break Fail209;
      r_148 = term.getSubterm(0);
      IStrategoList annos183 = term.getAnnotations();
      s_148 = annos183;
      term = z_30.invoke(context, r_148);
      if(term == null)
        break Fail209;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consWildcardLowerBound_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}