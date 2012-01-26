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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PostDecr_1_0");
    Fail141:
    { 
      IStrategoTerm t_125 = null;
      IStrategoTerm s_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPostDecr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail141;
      s_125 = term.getSubterm(0);
      IStrategoList annos126 = term.getAnnotations();
      t_125 = annos126;
      term = u_23.invoke(context, s_125);
      if(term == null)
        break Fail141;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPostDecr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}