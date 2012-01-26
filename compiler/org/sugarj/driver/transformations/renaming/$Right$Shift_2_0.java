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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_22, Strategy v_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RightShift_2_0");
    Fail125:
    { 
      IStrategoTerm t_122 = null;
      IStrategoTerm r_122 = null;
      IStrategoTerm s_122 = null;
      IStrategoTerm u_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consRightShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail125;
      r_122 = term.getSubterm(0);
      s_122 = term.getSubterm(1);
      IStrategoList annos110 = term.getAnnotations();
      t_122 = annos110;
      term = u_22.invoke(context, r_122);
      if(term == null)
        break Fail125;
      u_122 = term;
      term = v_22.invoke(context, s_122);
      if(term == null)
        break Fail125;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consRightShift_2, new IStrategoTerm[]{u_122, term}), checkListAnnos(termFactory, t_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}