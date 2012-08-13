package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Post$Incr_1_0 extends Strategy 
{ 
  public static $Post$Incr_1_0 instance = new $Post$Incr_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PostIncr_1_0");
    Fail193:
    { 
      IStrategoTerm k_144 = null;
      IStrategoTerm j_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPostIncr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail193;
      j_144 = term.getSubterm(0);
      IStrategoList annos168 = term.getAnnotations();
      k_144 = annos168;
      term = v_29.invoke(context, j_144);
      if(term == null)
        break Fail193;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPostIncr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_144));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}