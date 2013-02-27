package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BuildDefaultPT_1_0");
    Fail140:
    { 
      IStrategoTerm x_113 = null;
      IStrategoTerm w_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consBuildDefaultPT_1 != ((IStrategoAppl)term).getConstructor())
        break Fail140;
      w_113 = term.getSubterm(0);
      IStrategoList annos126 = term.getAnnotations();
      x_113 = annos126;
      term = j_18.invoke(context, w_113);
      if(term == null)
        break Fail140;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consBuildDefaultPT_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}