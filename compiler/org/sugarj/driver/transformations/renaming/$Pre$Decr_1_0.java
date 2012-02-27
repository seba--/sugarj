package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Pre$Decr_1_0 extends Strategy 
{ 
  public static $Pre$Decr_1_0 instance = new $Pre$Decr_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PreDecr_1_0");
    Fail142:
    { 
      IStrategoTerm f_126 = null;
      IStrategoTerm e_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPreDecr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail142;
      e_126 = term.getSubterm(0);
      IStrategoList annos122 = term.getAnnotations();
      f_126 = annos122;
      term = n_24.invoke(context, e_126);
      if(term == null)
        break Fail142;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPreDecr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}