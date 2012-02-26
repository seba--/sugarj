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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WildcardUpperBound_1_0");
    Fail162:
    { 
      IStrategoTerm a_130 = null;
      IStrategoTerm y_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consWildcardUpperBound_1 != ((IStrategoAppl)term).getConstructor())
        break Fail162;
      y_129 = term.getSubterm(0);
      IStrategoList annos143 = term.getAnnotations();
      a_130 = annos143;
      term = p_25.invoke(context, y_129);
      if(term == null)
        break Fail162;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consWildcardUpperBound_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}