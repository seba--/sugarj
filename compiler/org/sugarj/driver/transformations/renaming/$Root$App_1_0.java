package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_48)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RootApp_1_0");
    Fail364:
    { 
      IStrategoTerm m_196 = null;
      IStrategoTerm l_196 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRootApp_1 != ((IStrategoAppl)term).getConstructor())
        break Fail364;
      l_196 = term.getSubterm(0);
      IStrategoList annos307 = term.getAnnotations();
      m_196 = annos307;
      term = g_48.invoke(context, l_196);
      if(term == null)
        break Fail364;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRootApp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_196));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}