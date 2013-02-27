package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort_2_0 extends Strategy 
{ 
  public static $Sort_2_0 instance = new $Sort_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_17, Strategy n_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Sort_2_0");
    Fail124:
    { 
      IStrategoTerm p_111 = null;
      IStrategoTerm l_111 = null;
      IStrategoTerm m_111 = null;
      IStrategoTerm q_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSort_2 != ((IStrategoAppl)term).getConstructor())
        break Fail124;
      l_111 = term.getSubterm(0);
      m_111 = term.getSubterm(1);
      IStrategoList annos111 = term.getAnnotations();
      p_111 = annos111;
      term = m_17.invoke(context, l_111);
      if(term == null)
        break Fail124;
      q_111 = term;
      term = n_17.invoke(context, m_111);
      if(term == null)
        break Fail124;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSort_2, new IStrategoTerm[]{q_111, term}), checkListAnnos(termFactory, p_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}