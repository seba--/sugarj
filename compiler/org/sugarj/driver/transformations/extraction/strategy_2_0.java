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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_27, Strategy s_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("strategy_2_0");
    Fail230:
    { 
      IStrategoTerm z_140 = null;
      IStrategoTerm x_140 = null;
      IStrategoTerm y_140 = null;
      IStrategoTerm d_141 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consstrategy_2 != ((IStrategoAppl)term).getConstructor())
        break Fail230;
      x_140 = term.getSubterm(0);
      y_140 = term.getSubterm(1);
      IStrategoList annos188 = term.getAnnotations();
      z_140 = annos188;
      term = r_27.invoke(context, x_140);
      if(term == null)
        break Fail230;
      d_141 = term;
      term = s_27.invoke(context, y_140);
      if(term == null)
        break Fail230;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consstrategy_2, new IStrategoTerm[]{d_141, term}), checkListAnnos(termFactory, z_140));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}