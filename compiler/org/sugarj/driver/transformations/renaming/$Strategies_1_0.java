package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Strategies_1_0");
    Fail45:
    { 
      IStrategoTerm q_96 = null;
      IStrategoTerm p_96 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consStrategies_1 != ((IStrategoAppl)term).getConstructor())
        break Fail45;
      p_96 = term.getSubterm(0);
      IStrategoList annos35 = term.getAnnotations();
      q_96 = annos35;
      term = h_12.invoke(context, p_96);
      if(term == null)
        break Fail45;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consStrategies_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_96));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}