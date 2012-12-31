package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BuildDefaultPT_1_0");
    Fail136:
    { 
      IStrategoTerm v_113 = null;
      IStrategoTerm u_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consBuildDefaultPT_1 != ((IStrategoAppl)term).getConstructor())
        break Fail136;
      u_113 = term.getSubterm(0);
      IStrategoList annos126 = term.getAnnotations();
      v_113 = annos126;
      term = h_18.invoke(context, u_113);
      if(term == null)
        break Fail136;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consBuildDefaultPT_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}