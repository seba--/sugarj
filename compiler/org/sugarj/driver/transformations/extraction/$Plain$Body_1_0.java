package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Plain$Body_1_0 extends Strategy 
{ 
  public static $Plain$Body_1_0 instance = new $Plain$Body_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_352)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PlainBody_1_0");
    Fail1084:
    { 
      IStrategoTerm l_473 = null;
      IStrategoTerm k_473 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consPlainBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1084;
      k_473 = term.getSubterm(0);
      IStrategoList annos306 = term.getAnnotations();
      l_473 = annos306;
      term = t_352.invoke(context, k_473);
      if(term == null)
        break Fail1084;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consPlainBody_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_473));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}