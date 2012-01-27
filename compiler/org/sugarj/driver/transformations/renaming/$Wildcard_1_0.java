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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Wildcard_1_0");
    Fail160:
    { 
      IStrategoTerm e_129 = null;
      IStrategoTerm d_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consWildcard_1 != ((IStrategoAppl)term).getConstructor())
        break Fail160;
      d_129 = term.getSubterm(0);
      IStrategoList annos144 = term.getAnnotations();
      e_129 = annos144;
      term = b_25.invoke(context, d_129);
      if(term == null)
        break Fail160;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consWildcard_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}