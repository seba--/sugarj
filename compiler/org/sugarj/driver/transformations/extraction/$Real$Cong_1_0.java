package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Real$Cong_1_0 extends Strategy 
{ 
  public static $Real$Cong_1_0 instance = new $Real$Cong_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RealCong_1_0");
    Fail98:
    { 
      IStrategoTerm g_118 = null;
      IStrategoTerm f_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consRealCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail98;
      f_118 = term.getSubterm(0);
      IStrategoList annos73 = term.getAnnotations();
      g_118 = annos73;
      term = q_21.invoke(context, f_118);
      if(term == null)
        break Fail98;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consRealCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}