package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method$Dec$Head_6_0 extends Strategy 
{ 
  public static $Method$Dec$Head_6_0 instance = new $Method$Dec$Head_6_0();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_18, Strategy n_18, Strategy o_18, Strategy p_18, Strategy q_18, Strategy r_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodDecHead_6_0");
    Fail64:
    { 
      IStrategoTerm t_110 = null;
      IStrategoTerm n_110 = null;
      IStrategoTerm o_110 = null;
      IStrategoTerm p_110 = null;
      IStrategoTerm q_110 = null;
      IStrategoTerm r_110 = null;
      IStrategoTerm s_110 = null;
      IStrategoTerm u_110 = null;
      IStrategoTerm v_110 = null;
      IStrategoTerm b_111 = null;
      IStrategoTerm d_111 = null;
      IStrategoTerm e_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMethodDecHead_6 != ((IStrategoAppl)term).getConstructor())
        break Fail64;
      n_110 = term.getSubterm(0);
      o_110 = term.getSubterm(1);
      p_110 = term.getSubterm(2);
      q_110 = term.getSubterm(3);
      r_110 = term.getSubterm(4);
      s_110 = term.getSubterm(5);
      IStrategoList annos53 = term.getAnnotations();
      t_110 = annos53;
      term = m_18.invoke(context, n_110);
      if(term == null)
        break Fail64;
      u_110 = term;
      term = n_18.invoke(context, o_110);
      if(term == null)
        break Fail64;
      v_110 = term;
      term = o_18.invoke(context, p_110);
      if(term == null)
        break Fail64;
      b_111 = term;
      term = p_18.invoke(context, q_110);
      if(term == null)
        break Fail64;
      d_111 = term;
      term = q_18.invoke(context, r_110);
      if(term == null)
        break Fail64;
      e_111 = term;
      term = r_18.invoke(context, s_110);
      if(term == null)
        break Fail64;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMethodDecHead_6, new IStrategoTerm[]{u_110, v_110, b_111, d_111, e_111, term}), checkListAnnos(termFactory, t_110));
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