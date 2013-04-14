package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Build$Default$P$T_1_0 extends Strategy 
{ 
  public static $Build$Default$P$T_1_0 instance = new $Build$Default$P$T_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BuildDefaultPT_1_0");
    Fail154:
    { 
      IStrategoTerm r_127 = null;
      IStrategoTerm q_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consBuildDefaultPT_1 != ((IStrategoAppl)term).getConstructor())
        break Fail154;
      q_127 = term.getSubterm(0);
      IStrategoList annos126 = term.getAnnotations();
      r_127 = annos126;
      term = s_24.invoke(context, q_127);
      if(term == null)
        break Fail154;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consBuildDefaultPT_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}