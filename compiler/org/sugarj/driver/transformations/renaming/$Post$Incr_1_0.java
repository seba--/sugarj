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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PostIncr_1_0");
    Fail147:
    { 
      IStrategoTerm u_126 = null;
      IStrategoTerm t_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPostIncr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail147;
      t_126 = term.getSubterm(0);
      IStrategoList annos127 = term.getAnnotations();
      u_126 = annos127;
      term = s_24.invoke(context, t_126);
      if(term == null)
        break Fail147;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPostIncr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}