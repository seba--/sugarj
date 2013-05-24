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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RootApp_1_0");
    Fail934:
    { 
      IStrategoTerm i_453 = null;
      IStrategoTerm h_453 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consRootApp_1 != ((IStrategoAppl)term).getConstructor())
        break Fail934;
      h_453 = term.getSubterm(0);
      IStrategoList annos179 = term.getAnnotations();
      i_453 = annos179;
      term = d_345.invoke(context, h_453);
      if(term == null)
        break Fail934;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consRootApp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_453));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}