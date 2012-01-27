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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_24, Strategy n_24, Strategy o_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Member_3_0");
    Fail151:
    { 
      IStrategoTerm r_127 = null;
      IStrategoTerm o_127 = null;
      IStrategoTerm p_127 = null;
      IStrategoTerm q_127 = null;
      IStrategoTerm s_127 = null;
      IStrategoTerm t_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMember_3 != ((IStrategoAppl)term).getConstructor())
        break Fail151;
      o_127 = term.getSubterm(0);
      p_127 = term.getSubterm(1);
      q_127 = term.getSubterm(2);
      IStrategoList annos135 = term.getAnnotations();
      r_127 = annos135;
      term = m_24.invoke(context, o_127);
      if(term == null)
        break Fail151;
      s_127 = term;
      term = n_24.invoke(context, p_127);
      if(term == null)
        break Fail151;
      t_127 = term;
      term = o_24.invoke(context, q_127);
      if(term == null)
        break Fail151;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMember_3, new IStrategoTerm[]{s_127, t_127, term}), checkListAnnos(termFactory, r_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}