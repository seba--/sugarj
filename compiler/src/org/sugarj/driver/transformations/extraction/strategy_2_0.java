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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_27, Strategy u_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("strategy_2_0");
    Fail231:
    { 
      IStrategoTerm k_141 = null;
      IStrategoTerm f_141 = null;
      IStrategoTerm g_141 = null;
      IStrategoTerm l_141 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consstrategy_2 != ((IStrategoAppl)term).getConstructor())
        break Fail231;
      f_141 = term.getSubterm(0);
      g_141 = term.getSubterm(1);
      IStrategoList annos189 = term.getAnnotations();
      k_141 = annos189;
      term = t_27.invoke(context, f_141);
      if(term == null)
        break Fail231;
      l_141 = term;
      term = u_27.invoke(context, g_141);
      if(term == null)
        break Fail231;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consstrategy_2, new IStrategoTerm[]{l_141, term}), checkListAnnos(termFactory, k_141));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}