package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_17, Strategy o_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Sort_2_0");
    Fail120:
    { 
      IStrategoTerm q_111 = null;
      IStrategoTerm m_111 = null;
      IStrategoTerm p_111 = null;
      IStrategoTerm r_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSort_2 != ((IStrategoAppl)term).getConstructor())
        break Fail120;
      m_111 = term.getSubterm(0);
      p_111 = term.getSubterm(1);
      IStrategoList annos111 = term.getAnnotations();
      q_111 = annos111;
      term = n_17.invoke(context, m_111);
      if(term == null)
        break Fail120;
      r_111 = term;
      term = o_17.invoke(context, p_111);
      if(term == null)
        break Fail120;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSort_2, new IStrategoTerm[]{r_111, term}), checkListAnnos(termFactory, q_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}