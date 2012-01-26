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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_16, Strategy n_16, Strategy o_16, Strategy p_16, Strategy q_16, Strategy r_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AbstractMethodDec_6_0");
    Fail43:
    { 
      IStrategoTerm p_105 = null;
      IStrategoTerm j_105 = null;
      IStrategoTerm k_105 = null;
      IStrategoTerm l_105 = null;
      IStrategoTerm m_105 = null;
      IStrategoTerm n_105 = null;
      IStrategoTerm o_105 = null;
      IStrategoTerm r_105 = null;
      IStrategoTerm s_105 = null;
      IStrategoTerm t_105 = null;
      IStrategoTerm u_105 = null;
      IStrategoTerm v_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAbstractMethodDec_6 != ((IStrategoAppl)term).getConstructor())
        break Fail43;
      j_105 = term.getSubterm(0);
      k_105 = term.getSubterm(1);
      l_105 = term.getSubterm(2);
      m_105 = term.getSubterm(3);
      n_105 = term.getSubterm(4);
      o_105 = term.getSubterm(5);
      IStrategoList annos34 = term.getAnnotations();
      p_105 = annos34;
      term = m_16.invoke(context, j_105);
      if(term == null)
        break Fail43;
      r_105 = term;
      term = n_16.invoke(context, k_105);
      if(term == null)
        break Fail43;
      s_105 = term;
      term = o_16.invoke(context, l_105);
      if(term == null)
        break Fail43;
      t_105 = term;
      term = p_16.invoke(context, m_105);
      if(term == null)
        break Fail43;
      u_105 = term;
      term = q_16.invoke(context, n_105);
      if(term == null)
        break Fail43;
      v_105 = term;
      term = r_16.invoke(context, o_105);
      if(term == null)
        break Fail43;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAbstractMethodDec_6, new IStrategoTerm[]{r_105, s_105, t_105, u_105, v_105, term}), checkListAnnos(termFactory, p_105));
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