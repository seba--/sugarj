package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Build$Default_1_0 extends Strategy 
{ 
  public static $Build$Default_1_0 instance = new $Build$Default_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BuildDefault_1_0");
    Fail148:
    { 
      IStrategoTerm s_126 = null;
      IStrategoTerm r_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consBuildDefault_1 != ((IStrategoAppl)term).getConstructor())
        break Fail148;
      r_126 = term.getSubterm(0);
      IStrategoList annos120 = term.getAnnotations();
      s_126 = annos120;
      term = k_24.invoke(context, r_126);
      if(term == null)
        break Fail148;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consBuildDefault_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}