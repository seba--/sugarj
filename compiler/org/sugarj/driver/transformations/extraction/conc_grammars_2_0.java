package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class conc_grammars_2_0 extends Strategy 
{ 
  public static conc_grammars_2_0 instance = new conc_grammars_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_351, Strategy t_351)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("conc_grammars_2_0");
    Fail1064:
    { 
      IStrategoTerm t_470 = null;
      IStrategoTerm r_470 = null;
      IStrategoTerm s_470 = null;
      IStrategoTerm u_470 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consconc_grammars_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1064;
      r_470 = term.getSubterm(0);
      s_470 = term.getSubterm(1);
      IStrategoList annos289 = term.getAnnotations();
      t_470 = annos289;
      term = s_351.invoke(context, r_470);
      if(term == null)
        break Fail1064;
      u_470 = term;
      term = t_351.invoke(context, s_470);
      if(term == null)
        break Fail1064;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consconc_grammars_2, new IStrategoTerm[]{u_470, term}), checkListAnnos(termFactory, t_470));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}