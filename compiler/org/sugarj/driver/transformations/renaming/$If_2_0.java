package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $If_2_0 extends Strategy 
{ 
  public static $If_2_0 instance = new $If_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_20, Strategy g_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("If_2_0");
    Fail87:
    { 
      IStrategoTerm n_115 = null;
      IStrategoTerm l_115 = null;
      IStrategoTerm m_115 = null;
      IStrategoTerm p_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consIf_2 != ((IStrategoAppl)term).getConstructor())
        break Fail87;
      l_115 = term.getSubterm(0);
      m_115 = term.getSubterm(1);
      IStrategoList annos75 = term.getAnnotations();
      n_115 = annos75;
      term = f_20.invoke(context, l_115);
      if(term == null)
        break Fail87;
      p_115 = term;
      term = g_20.invoke(context, m_115);
      if(term == null)
        break Fail87;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consIf_2, new IStrategoTerm[]{p_115, term}), checkListAnnos(termFactory, n_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}