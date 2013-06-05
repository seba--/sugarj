package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Strategies_1_0 extends Strategy 
{ 
  public static $Strategies_1_0 instance = new $Strategies_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Strategies_1_0");
    Fail70:
    { 
      IStrategoTerm g_110 = null;
      IStrategoTerm f_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consStrategies_1 != ((IStrategoAppl)term).getConstructor())
        break Fail70;
      f_110 = term.getSubterm(0);
      IStrategoList annos43 = term.getAnnotations();
      g_110 = annos43;
      term = p_18.invoke(context, f_110);
      if(term == null)
        break Fail70;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consStrategies_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}