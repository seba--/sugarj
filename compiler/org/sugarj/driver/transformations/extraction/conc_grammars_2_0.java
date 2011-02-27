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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_29, Strategy l_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("conc_grammars_2_0");
    Fail258:
    { 
      IStrategoTerm h_148 = null;
      IStrategoTerm f_148 = null;
      IStrategoTerm g_148 = null;
      IStrategoTerm i_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consconc_grammars_2 != ((IStrategoAppl)term).getConstructor())
        break Fail258;
      f_148 = term.getSubterm(0);
      g_148 = term.getSubterm(1);
      IStrategoList annos214 = term.getAnnotations();
      h_148 = annos214;
      term = k_29.invoke(context, f_148);
      if(term == null)
        break Fail258;
      i_148 = term;
      term = l_29.invoke(context, g_148);
      if(term == null)
        break Fail258;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consconc_grammars_2, new IStrategoTerm[]{i_148, term}), checkListAnnos(termFactory, h_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}