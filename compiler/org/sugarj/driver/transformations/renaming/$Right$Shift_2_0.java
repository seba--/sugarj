package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Right$Shift_2_0 extends Strategy 
{ 
  public static $Right$Shift_2_0 instance = new $Right$Shift_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_23, Strategy s_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RightShift_2_0");
    Fail130:
    { 
      IStrategoTerm r_123 = null;
      IStrategoTerm p_123 = null;
      IStrategoTerm q_123 = null;
      IStrategoTerm s_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consRightShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail130;
      p_123 = term.getSubterm(0);
      q_123 = term.getSubterm(1);
      IStrategoList annos110 = term.getAnnotations();
      r_123 = annos110;
      term = r_23.invoke(context, p_123);
      if(term == null)
        break Fail130;
      s_123 = term;
      term = s_23.invoke(context, q_123);
      if(term == null)
        break Fail130;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consRightShift_2, new IStrategoTerm[]{s_123, term}), checkListAnnos(termFactory, r_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}