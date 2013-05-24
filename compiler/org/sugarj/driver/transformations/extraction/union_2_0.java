package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class union_2_0 extends Strategy 
{ 
  public static union_2_0 instance = new union_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_349, Strategy u_349)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("union_2_0");
    Fail1022:
    { 
      IStrategoTerm m_465 = null;
      IStrategoTerm k_465 = null;
      IStrategoTerm l_465 = null;
      IStrategoTerm n_465 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consunion_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1022;
      k_465 = term.getSubterm(0);
      l_465 = term.getSubterm(1);
      IStrategoList annos254 = term.getAnnotations();
      m_465 = annos254;
      term = t_349.invoke(context, k_465);
      if(term == null)
        break Fail1022;
      n_465 = term;
      term = u_349.invoke(context, l_465);
      if(term == null)
        break Fail1022;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consunion_2, new IStrategoTerm[]{n_465, term}), checkListAnnos(termFactory, m_465));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}