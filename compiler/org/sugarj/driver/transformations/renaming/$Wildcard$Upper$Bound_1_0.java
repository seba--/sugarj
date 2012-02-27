package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Wildcard$Upper$Bound_1_0 extends Strategy 
{ 
  public static $Wildcard$Upper$Bound_1_0 instance = new $Wildcard$Upper$Bound_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WildcardUpperBound_1_0");
    Fail164:
    { 
      IStrategoTerm k_130 = null;
      IStrategoTerm i_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consWildcardUpperBound_1 != ((IStrategoAppl)term).getConstructor())
        break Fail164;
      i_130 = term.getSubterm(0);
      IStrategoList annos143 = term.getAnnotations();
      k_130 = annos143;
      term = x_25.invoke(context, i_130);
      if(term == null)
        break Fail164;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consWildcardUpperBound_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}