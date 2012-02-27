package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $While_2_0 extends Strategy 
{ 
  public static $While_2_0 instance = new $While_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_20, Strategy t_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("While_2_0");
    Fail87:
    { 
      IStrategoTerm m_115 = null;
      IStrategoTerm k_115 = null;
      IStrategoTerm l_115 = null;
      IStrategoTerm n_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consWhile_2 != ((IStrategoAppl)term).getConstructor())
        break Fail87;
      k_115 = term.getSubterm(0);
      l_115 = term.getSubterm(1);
      IStrategoList annos70 = term.getAnnotations();
      m_115 = annos70;
      term = s_20.invoke(context, k_115);
      if(term == null)
        break Fail87;
      n_115 = term;
      term = t_20.invoke(context, l_115);
      if(term == null)
        break Fail87;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consWhile_2, new IStrategoTerm[]{n_115, term}), checkListAnnos(termFactory, m_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}