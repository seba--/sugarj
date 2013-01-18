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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WildcardLowerBound_1_0");
    Fail199:
    { 
      IStrategoTerm c_170 = null;
      IStrategoTerm b_170 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consWildcardLowerBound_1 != ((IStrategoAppl)term).getConstructor())
        break Fail199;
      b_170 = term.getSubterm(0);
      IStrategoList annos168 = term.getAnnotations();
      c_170 = annos168;
      term = h_39.invoke(context, b_170);
      if(term == null)
        break Fail199;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consWildcardLowerBound_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_170));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}