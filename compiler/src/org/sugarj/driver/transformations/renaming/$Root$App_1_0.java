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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RootApp_1_0");
    Fail129:
    { 
      IStrategoTerm m_112 = null;
      IStrategoTerm l_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRootApp_1 != ((IStrategoAppl)term).getConstructor())
        break Fail129;
      l_112 = term.getSubterm(0);
      IStrategoList annos116 = term.getAnnotations();
      m_112 = annos116;
      term = y_17.invoke(context, l_112);
      if(term == null)
        break Fail129;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRootApp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}