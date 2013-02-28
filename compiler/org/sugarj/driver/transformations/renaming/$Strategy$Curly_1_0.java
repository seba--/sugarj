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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StrategyCurly_1_0");
    Fail38:
    { 
      IStrategoTerm v_95 = null;
      IStrategoTerm u_95 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consStrategyCurly_1 != ((IStrategoAppl)term).getConstructor())
        break Fail38;
      u_95 = term.getSubterm(0);
      IStrategoList annos28 = term.getAnnotations();
      v_95 = annos28;
      term = a_12.invoke(context, u_95);
      if(term == null)
        break Fail38;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consStrategyCurly_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_95));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}