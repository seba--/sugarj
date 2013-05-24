package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Completion$Trigger_2_0 extends Strategy 
{ 
  public static $Completion$Trigger_2_0 instance = new $Completion$Trigger_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_335, Strategy y_335)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CompletionTrigger_2_0");
    Fail775:
    { 
      IStrategoTerm x_429 = null;
      IStrategoTerm v_429 = null;
      IStrategoTerm w_429 = null;
      IStrategoTerm y_429 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consCompletionTrigger_2 != ((IStrategoAppl)term).getConstructor())
        break Fail775;
      v_429 = term.getSubterm(0);
      w_429 = term.getSubterm(1);
      IStrategoList annos41 = term.getAnnotations();
      x_429 = annos41;
      term = x_335.invoke(context, v_429);
      if(term == null)
        break Fail775;
      y_429 = term;
      term = y_335.invoke(context, w_429);
      if(term == null)
        break Fail775;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consCompletionTrigger_2, new IStrategoTerm[]{y_429, term}), checkListAnnos(termFactory, x_429));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}