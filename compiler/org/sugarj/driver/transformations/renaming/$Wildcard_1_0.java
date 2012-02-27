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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Wildcard_1_0");
    Fail165:
    { 
      IStrategoTerm r_130 = null;
      IStrategoTerm o_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consWildcard_1 != ((IStrategoAppl)term).getConstructor())
        break Fail165;
      o_130 = term.getSubterm(0);
      IStrategoList annos144 = term.getAnnotations();
      r_130 = annos144;
      term = y_25.invoke(context, o_130);
      if(term == null)
        break Fail165;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consWildcard_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}