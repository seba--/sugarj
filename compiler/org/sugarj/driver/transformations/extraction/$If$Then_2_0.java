package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $If$Then_2_0 extends Strategy 
{ 
  public static $If$Then_2_0 instance = new $If$Then_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_20, Strategy t_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IfThen_2_0");
    Fail82:
    { 
      IStrategoTerm x_115 = null;
      IStrategoTerm v_115 = null;
      IStrategoTerm w_115 = null;
      IStrategoTerm y_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consIfThen_2 != ((IStrategoAppl)term).getConstructor())
        break Fail82;
      v_115 = term.getSubterm(0);
      w_115 = term.getSubterm(1);
      IStrategoList annos59 = term.getAnnotations();
      x_115 = annos59;
      term = s_20.invoke(context, v_115);
      if(term == null)
        break Fail82;
      y_115 = term;
      term = t_20.invoke(context, w_115);
      if(term == null)
        break Fail82;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consIfThen_2, new IStrategoTerm[]{y_115, term}), checkListAnnos(termFactory, x_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}