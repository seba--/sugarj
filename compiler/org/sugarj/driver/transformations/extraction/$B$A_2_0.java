package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_341, Strategy t_341)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BA_2_0");
    Fail880:
    { 
      IStrategoTerm m_444 = null;
      IStrategoTerm k_444 = null;
      IStrategoTerm l_444 = null;
      IStrategoTerm n_444 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consBA_2 != ((IStrategoAppl)term).getConstructor())
        break Fail880;
      k_444 = term.getSubterm(0);
      l_444 = term.getSubterm(1);
      IStrategoList annos126 = term.getAnnotations();
      m_444 = annos126;
      term = s_341.invoke(context, k_444);
      if(term == null)
        break Fail880;
      n_444 = term;
      term = t_341.invoke(context, l_444);
      if(term == null)
        break Fail880;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consBA_2, new IStrategoTerm[]{n_444, term}), checkListAnnos(termFactory, m_444));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}