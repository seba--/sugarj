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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_350, Strategy v_350)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("strategy_2_0");
    Fail1045:
    { 
      IStrategoTerm g_468 = null;
      IStrategoTerm e_468 = null;
      IStrategoTerm f_468 = null;
      IStrategoTerm h_468 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consstrategy_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1045;
      e_468 = term.getSubterm(0);
      f_468 = term.getSubterm(1);
      IStrategoList annos272 = term.getAnnotations();
      g_468 = annos272;
      term = u_350.invoke(context, e_468);
      if(term == null)
        break Fail1045;
      h_468 = term;
      term = v_350.invoke(context, f_468);
      if(term == null)
        break Fail1045;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consstrategy_2, new IStrategoTerm[]{h_468, term}), checkListAnnos(termFactory, g_468));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}