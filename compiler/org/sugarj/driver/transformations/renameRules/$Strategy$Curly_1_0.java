package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StrategyCurly_1_0");
    Fail34:
    { 
      IStrategoTerm s_95 = null;
      IStrategoTerm q_95 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consStrategyCurly_1 != ((IStrategoAppl)term).getConstructor())
        break Fail34;
      q_95 = term.getSubterm(0);
      IStrategoList annos28 = term.getAnnotations();
      s_95 = annos28;
      term = y_11.invoke(context, q_95);
      if(term == null)
        break Fail34;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consStrategyCurly_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_95));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}