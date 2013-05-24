package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Strategy$Curly_1_0 extends Strategy 
{ 
  public static $Strategy$Curly_1_0 instance = new $Strategy$Curly_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_343)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StrategyCurly_1_0");
    Fail909:
    { 
      IStrategoTerm k_449 = null;
      IStrategoTerm j_449 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consStrategyCurly_1 != ((IStrategoAppl)term).getConstructor())
        break Fail909;
      j_449 = term.getSubterm(0);
      IStrategoList annos155 = term.getAnnotations();
      k_449 = annos155;
      term = q_343.invoke(context, j_449);
      if(term == null)
        break Fail909;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consStrategyCurly_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_449));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}