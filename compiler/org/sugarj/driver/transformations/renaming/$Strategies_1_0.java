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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_42)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Strategies_1_0");
    Fail282:
    { 
      IStrategoTerm p_181 = null;
      IStrategoTerm o_181 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consStrategies_1 != ((IStrategoAppl)term).getConstructor())
        break Fail282;
      o_181 = term.getSubterm(0);
      IStrategoList annos229 = term.getAnnotations();
      p_181 = annos229;
      term = x_42.invoke(context, o_181);
      if(term == null)
        break Fail282;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consStrategies_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_181));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}