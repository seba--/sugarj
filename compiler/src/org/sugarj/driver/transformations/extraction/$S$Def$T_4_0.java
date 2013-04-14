package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Def$T_4_0 extends Strategy 
{ 
  public static $S$Def$T_4_0 instance = new $S$Def$T_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_19, Strategy m_19, Strategy n_19, Strategy o_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDefT_4_0");
    Fail70:
    { 
      IStrategoTerm q_112 = null;
      IStrategoTerm m_112 = null;
      IStrategoTerm n_112 = null;
      IStrategoTerm o_112 = null;
      IStrategoTerm p_112 = null;
      IStrategoTerm r_112 = null;
      IStrategoTerm s_112 = null;
      IStrategoTerm t_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail70;
      m_112 = term.getSubterm(0);
      n_112 = term.getSubterm(1);
      o_112 = term.getSubterm(2);
      p_112 = term.getSubterm(3);
      IStrategoList annos46 = term.getAnnotations();
      q_112 = annos46;
      term = l_19.invoke(context, m_112);
      if(term == null)
        break Fail70;
      r_112 = term;
      term = m_19.invoke(context, n_112);
      if(term == null)
        break Fail70;
      s_112 = term;
      term = n_19.invoke(context, o_112);
      if(term == null)
        break Fail70;
      t_112 = term;
      term = o_19.invoke(context, p_112);
      if(term == null)
        break Fail70;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSDefT_4, new IStrategoTerm[]{r_112, s_112, t_112, term}), checkListAnnos(termFactory, q_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}