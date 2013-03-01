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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_42)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StrategyCurly_1_0");
    Fail275:
    { 
      IStrategoTerm l_180 = null;
      IStrategoTerm k_180 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consStrategyCurly_1 != ((IStrategoAppl)term).getConstructor())
        break Fail275;
      k_180 = term.getSubterm(0);
      IStrategoList annos222 = term.getAnnotations();
      l_180 = annos222;
      term = q_42.invoke(context, k_180);
      if(term == null)
        break Fail275;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consStrategyCurly_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_180));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}