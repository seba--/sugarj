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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_19, Strategy l_19, Strategy m_19, Strategy n_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDefT_4_0");
    Fail81:
    { 
      IStrategoTerm t_112 = null;
      IStrategoTerm p_112 = null;
      IStrategoTerm q_112 = null;
      IStrategoTerm r_112 = null;
      IStrategoTerm s_112 = null;
      IStrategoTerm u_112 = null;
      IStrategoTerm v_112 = null;
      IStrategoTerm w_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail81;
      p_112 = term.getSubterm(0);
      q_112 = term.getSubterm(1);
      r_112 = term.getSubterm(2);
      s_112 = term.getSubterm(3);
      IStrategoList annos54 = term.getAnnotations();
      t_112 = annos54;
      term = k_19.invoke(context, p_112);
      if(term == null)
        break Fail81;
      u_112 = term;
      term = l_19.invoke(context, q_112);
      if(term == null)
        break Fail81;
      v_112 = term;
      term = m_19.invoke(context, r_112);
      if(term == null)
        break Fail81;
      w_112 = term;
      term = n_19.invoke(context, s_112);
      if(term == null)
        break Fail81;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consSDefT_4, new IStrategoTerm[]{u_112, v_112, w_112, term}), checkListAnnos(termFactory, t_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}