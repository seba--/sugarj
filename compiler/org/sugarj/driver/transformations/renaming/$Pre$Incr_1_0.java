package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Pre$Incr_1_0 extends Strategy 
{ 
  public static $Pre$Incr_1_0 instance = new $Pre$Incr_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PreIncr_1_0");
    Fail138:
    { 
      IStrategoTerm k_125 = null;
      IStrategoTerm j_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPreIncr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail138;
      j_125 = term.getSubterm(0);
      IStrategoList annos123 = term.getAnnotations();
      k_125 = annos123;
      term = r_23.invoke(context, j_125);
      if(term == null)
        break Fail138;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPreIncr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}