package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Member_3_0 extends Strategy 
{ 
  public static $Member_3_0 instance = new $Member_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_25, Strategy k_25, Strategy l_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Member_3_0");
    Fail156:
    { 
      IStrategoTerm r_128 = null;
      IStrategoTerm m_128 = null;
      IStrategoTerm p_128 = null;
      IStrategoTerm q_128 = null;
      IStrategoTerm s_128 = null;
      IStrategoTerm t_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMember_3 != ((IStrategoAppl)term).getConstructor())
        break Fail156;
      m_128 = term.getSubterm(0);
      p_128 = term.getSubterm(1);
      q_128 = term.getSubterm(2);
      IStrategoList annos135 = term.getAnnotations();
      r_128 = annos135;
      term = j_25.invoke(context, m_128);
      if(term == null)
        break Fail156;
      s_128 = term;
      term = k_25.invoke(context, p_128);
      if(term == null)
        break Fail156;
      t_128 = term;
      term = l_25.invoke(context, q_128);
      if(term == null)
        break Fail156;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMember_3, new IStrategoTerm[]{s_128, t_128, term}), checkListAnnos(termFactory, r_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}