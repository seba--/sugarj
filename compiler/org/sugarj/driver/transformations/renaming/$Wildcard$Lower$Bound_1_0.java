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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WildcardLowerBound_1_0");
    Fail161:
    { 
      IStrategoTerm v_129 = null;
      IStrategoTerm u_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consWildcardLowerBound_1 != ((IStrategoAppl)term).getConstructor())
        break Fail161;
      u_129 = term.getSubterm(0);
      IStrategoList annos142 = term.getAnnotations();
      v_129 = annos142;
      term = o_25.invoke(context, u_129);
      if(term == null)
        break Fail161;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consWildcardLowerBound_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}