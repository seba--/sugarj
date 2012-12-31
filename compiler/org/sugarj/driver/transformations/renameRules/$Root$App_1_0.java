package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Root$App_1_0 extends Strategy 
{ 
  public static $Root$App_1_0 instance = new $Root$App_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RootApp_1_0");
    Fail126:
    { 
      IStrategoTerm h_112 = null;
      IStrategoTerm g_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRootApp_1 != ((IStrategoAppl)term).getConstructor())
        break Fail126;
      g_112 = term.getSubterm(0);
      IStrategoList annos116 = term.getAnnotations();
      h_112 = annos116;
      term = t_17.invoke(context, g_112);
      if(term == null)
        break Fail126;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRootApp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}