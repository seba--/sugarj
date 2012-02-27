package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Abstract$Method$Dec_6_0 extends Strategy 
{ 
  public static $Abstract$Method$Dec_6_0 instance = new $Abstract$Method$Dec_6_0();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_17, Strategy k_17, Strategy l_17, Strategy m_17, Strategy n_17, Strategy o_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AbstractMethodDec_6_0");
    Fail48:
    { 
      IStrategoTerm p_106 = null;
      IStrategoTerm j_106 = null;
      IStrategoTerm k_106 = null;
      IStrategoTerm l_106 = null;
      IStrategoTerm m_106 = null;
      IStrategoTerm n_106 = null;
      IStrategoTerm o_106 = null;
      IStrategoTerm q_106 = null;
      IStrategoTerm r_106 = null;
      IStrategoTerm s_106 = null;
      IStrategoTerm t_106 = null;
      IStrategoTerm u_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAbstractMethodDec_6 != ((IStrategoAppl)term).getConstructor())
        break Fail48;
      j_106 = term.getSubterm(0);
      k_106 = term.getSubterm(1);
      l_106 = term.getSubterm(2);
      m_106 = term.getSubterm(3);
      n_106 = term.getSubterm(4);
      o_106 = term.getSubterm(5);
      IStrategoList annos34 = term.getAnnotations();
      p_106 = annos34;
      term = j_17.invoke(context, j_106);
      if(term == null)
        break Fail48;
      q_106 = term;
      term = k_17.invoke(context, k_106);
      if(term == null)
        break Fail48;
      r_106 = term;
      term = l_17.invoke(context, l_106);
      if(term == null)
        break Fail48;
      s_106 = term;
      term = m_17.invoke(context, m_106);
      if(term == null)
        break Fail48;
      t_106 = term;
      term = n_17.invoke(context, n_106);
      if(term == null)
        break Fail48;
      u_106 = term;
      term = o_17.invoke(context, o_106);
      if(term == null)
        break Fail48;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAbstractMethodDec_6, new IStrategoTerm[]{q_106, r_106, s_106, t_106, u_106, term}), checkListAnnos(termFactory, p_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }

  @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
  { 
    if(sargs == null || targs == null || sargs.length != 6 || targs.length != 0)
      throw new IllegalArgumentException("Illegal arguments for " + getName());
    return invoke(context, term, sargs[0], sargs[1], sargs[2], sargs[3], sargs[4], sargs[5]);
  }
}