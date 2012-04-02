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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StrategyCurly_1_0");
    Fail52:
    { 
      IStrategoTerm f_109 = null;
      IStrategoTerm e_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consStrategyCurly_1 != ((IStrategoAppl)term).getConstructor())
        break Fail52;
      e_109 = term.getSubterm(0);
      IStrategoList annos28 = term.getAnnotations();
      f_109 = annos28;
      term = j_18.invoke(context, e_109);
      if(term == null)
        break Fail52;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consStrategyCurly_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}