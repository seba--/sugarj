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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RootApp_1_0");
    Fail144:
    { 
      IStrategoTerm c_126 = null;
      IStrategoTerm b_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consRootApp_1 != ((IStrategoAppl)term).getConstructor())
        break Fail144;
      b_126 = term.getSubterm(0);
      IStrategoList annos116 = term.getAnnotations();
      c_126 = annos116;
      term = e_24.invoke(context, b_126);
      if(term == null)
        break Fail144;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consRootApp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}