package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Constr$Dec$Head_5_0 extends Strategy 
{ 
  public static $Constr$Dec$Head_5_0 instance = new $Constr$Dec$Head_5_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_17, Strategy q_17, Strategy r_17, Strategy s_17, Strategy t_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstrDecHead_5_0");
    Fail54:
    { 
      IStrategoTerm n_108 = null;
      IStrategoTerm i_108 = null;
      IStrategoTerm j_108 = null;
      IStrategoTerm k_108 = null;
      IStrategoTerm l_108 = null;
      IStrategoTerm m_108 = null;
      IStrategoTerm o_108 = null;
      IStrategoTerm p_108 = null;
      IStrategoTerm q_108 = null;
      IStrategoTerm r_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consConstrDecHead_5 != ((IStrategoAppl)term).getConstructor())
        break Fail54;
      i_108 = term.getSubterm(0);
      j_108 = term.getSubterm(1);
      k_108 = term.getSubterm(2);
      l_108 = term.getSubterm(3);
      m_108 = term.getSubterm(4);
      IStrategoList annos45 = term.getAnnotations();
      n_108 = annos45;
      term = p_17.invoke(context, i_108);
      if(term == null)
        break Fail54;
      o_108 = term;
      term = q_17.invoke(context, j_108);
      if(term == null)
        break Fail54;
      p_108 = term;
      term = r_17.invoke(context, k_108);
      if(term == null)
        break Fail54;
      q_108 = term;
      term = s_17.invoke(context, l_108);
      if(term == null)
        break Fail54;
      r_108 = term;
      term = t_17.invoke(context, m_108);
      if(term == null)
        break Fail54;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consConstrDecHead_5, new IStrategoTerm[]{o_108, p_108, q_108, r_108, term}), checkListAnnos(termFactory, n_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}