package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class strategy_2_0 extends Strategy 
{ 
  public static strategy_2_0 instance = new strategy_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_27, Strategy t_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("strategy_2_0");
    Fail218:
    { 
      IStrategoTerm w_140 = null;
      IStrategoTerm u_140 = null;
      IStrategoTerm v_140 = null;
      IStrategoTerm x_140 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consstrategy_2 != ((IStrategoAppl)term).getConstructor())
        break Fail218;
      u_140 = term.getSubterm(0);
      v_140 = term.getSubterm(1);
      IStrategoList annos180 = term.getAnnotations();
      w_140 = annos180;
      term = s_27.invoke(context, u_140);
      if(term == null)
        break Fail218;
      x_140 = term;
      term = t_27.invoke(context, v_140);
      if(term == null)
        break Fail218;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consstrategy_2, new IStrategoTerm[]{x_140, term}), checkListAnnos(termFactory, w_140));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}