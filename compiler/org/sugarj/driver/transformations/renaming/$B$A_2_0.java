package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $B$A_2_0 extends Strategy 
{ 
  public static $B$A_2_0 instance = new $B$A_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_46, Strategy h_46)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BA_2_0");
    Fail329:
    { 
      IStrategoTerm m_190 = null;
      IStrategoTerm k_190 = null;
      IStrategoTerm l_190 = null;
      IStrategoTerm n_190 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consBA_2 != ((IStrategoAppl)term).getConstructor())
        break Fail329;
      k_190 = term.getSubterm(0);
      l_190 = term.getSubterm(1);
      IStrategoList annos275 = term.getAnnotations();
      m_190 = annos275;
      term = g_46.invoke(context, k_190);
      if(term == null)
        break Fail329;
      n_190 = term;
      term = h_46.invoke(context, l_190);
      if(term == null)
        break Fail329;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consBA_2, new IStrategoTerm[]{n_190, term}), checkListAnnos(termFactory, m_190));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}