package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assert$Stm_2_0 extends Strategy 
{ 
  public static $Assert$Stm_2_0 instance = new $Assert$Stm_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_20, Strategy p_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssertStm_2_0");
    Fail87:
    { 
      IStrategoTerm p_115 = null;
      IStrategoTerm m_115 = null;
      IStrategoTerm n_115 = null;
      IStrategoTerm q_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssertStm_2 != ((IStrategoAppl)term).getConstructor())
        break Fail87;
      m_115 = term.getSubterm(0);
      n_115 = term.getSubterm(1);
      IStrategoList annos72 = term.getAnnotations();
      p_115 = annos72;
      term = o_20.invoke(context, m_115);
      if(term == null)
        break Fail87;
      q_115 = term;
      term = p_20.invoke(context, n_115);
      if(term == null)
        break Fail87;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssertStm_2, new IStrategoTerm[]{q_115, term}), checkListAnnos(termFactory, p_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}