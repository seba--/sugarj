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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_37)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PreIncr_1_0");
    Fail179:
    { 
      IStrategoTerm r_166 = null;
      IStrategoTerm q_166 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPreIncr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail179;
      q_166 = term.getSubterm(0);
      IStrategoList annos149 = term.getAnnotations();
      r_166 = annos149;
      term = z_37.invoke(context, q_166);
      if(term == null)
        break Fail179;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPreIncr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_166));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}