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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PostDecr_1_0");
    Fail192:
    { 
      IStrategoTerm g_144 = null;
      IStrategoTerm f_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPostDecr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail192;
      f_144 = term.getSubterm(0);
      IStrategoList annos167 = term.getAnnotations();
      g_144 = annos167;
      term = u_29.invoke(context, f_144);
      if(term == null)
        break Fail192;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPostDecr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_144));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}