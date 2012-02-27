package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Post$Decr_1_0 extends Strategy 
{ 
  public static $Post$Decr_1_0 instance = new $Post$Decr_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PostDecr_1_0");
    Fail146:
    { 
      IStrategoTerm r_126 = null;
      IStrategoTerm q_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPostDecr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail146;
      q_126 = term.getSubterm(0);
      IStrategoList annos126 = term.getAnnotations();
      r_126 = annos126;
      term = r_24.invoke(context, q_126);
      if(term == null)
        break Fail146;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPostDecr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}