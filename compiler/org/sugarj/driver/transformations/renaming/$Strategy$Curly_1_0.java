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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StrategyCurly_1_0");
    Fail38:
    { 
      IStrategoTerm q_95 = null;
      IStrategoTerm p_95 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consStrategyCurly_1 != ((IStrategoAppl)term).getConstructor())
        break Fail38;
      p_95 = term.getSubterm(0);
      IStrategoList annos28 = term.getAnnotations();
      q_95 = annos28;
      term = x_11.invoke(context, p_95);
      if(term == null)
        break Fail38;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consStrategyCurly_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_95));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}