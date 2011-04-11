package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $A$M_2_0 extends Strategy 
{ 
  public static $A$M_2_0 instance = new $A$M_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_20, Strategy m_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AM_2_0");
    Fail80:
    { 
      IStrategoTerm f_115 = null;
      IStrategoTerm d_115 = null;
      IStrategoTerm e_115 = null;
      IStrategoTerm g_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consAM_2 != ((IStrategoAppl)term).getConstructor())
        break Fail80;
      d_115 = term.getSubterm(0);
      e_115 = term.getSubterm(1);
      IStrategoList annos56 = term.getAnnotations();
      f_115 = annos56;
      term = l_20.invoke(context, d_115);
      if(term == null)
        break Fail80;
      g_115 = term;
      term = m_20.invoke(context, e_115);
      if(term == null)
        break Fail80;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consAM_2, new IStrategoTerm[]{g_115, term}), checkListAnnos(termFactory, f_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}