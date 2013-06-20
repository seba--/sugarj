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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RootApp_1_0");
    Fail156:
    { 
      IStrategoTerm k_126 = null;
      IStrategoTerm j_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consRootApp_1 != ((IStrategoAppl)term).getConstructor())
        break Fail156;
      j_126 = term.getSubterm(0);
      IStrategoList annos125 = term.getAnnotations();
      k_126 = annos125;
      term = f_24.invoke(context, j_126);
      if(term == null)
        break Fail156;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consRootApp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}