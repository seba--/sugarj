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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PreIncr_1_0");
    Fail143:
    { 
      IStrategoTerm i_126 = null;
      IStrategoTerm h_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPreIncr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail143;
      h_126 = term.getSubterm(0);
      IStrategoList annos123 = term.getAnnotations();
      i_126 = annos123;
      term = o_24.invoke(context, h_126);
      if(term == null)
        break Fail143;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPreIncr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}