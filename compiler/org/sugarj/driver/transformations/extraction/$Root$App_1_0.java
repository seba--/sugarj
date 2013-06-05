package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RootApp_1_0");
    Fail155:
    { 
      IStrategoTerm f_126 = null;
      IStrategoTerm e_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consRootApp_1 != ((IStrategoAppl)term).getConstructor())
        break Fail155;
      e_126 = term.getSubterm(0);
      IStrategoList annos124 = term.getAnnotations();
      f_126 = annos124;
      term = d_24.invoke(context, e_126);
      if(term == null)
        break Fail155;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consRootApp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}