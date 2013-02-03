package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StrategyCurly_1_0");
    Fail37:
    { 
      IStrategoTerm y_95 = null;
      IStrategoTerm x_95 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consStrategyCurly_1 != ((IStrategoAppl)term).getConstructor())
        break Fail37;
      x_95 = term.getSubterm(0);
      IStrategoList annos28 = term.getAnnotations();
      y_95 = annos28;
      term = d_12.invoke(context, x_95);
      if(term == null)
        break Fail37;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consStrategyCurly_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_95));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}