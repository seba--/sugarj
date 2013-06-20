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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Strategies_1_0");
    Fail71:
    { 
      IStrategoTerm l_110 = null;
      IStrategoTerm k_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consStrategies_1 != ((IStrategoAppl)term).getConstructor())
        break Fail71;
      k_110 = term.getSubterm(0);
      IStrategoList annos44 = term.getAnnotations();
      l_110 = annos44;
      term = r_18.invoke(context, k_110);
      if(term == null)
        break Fail71;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consStrategies_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}