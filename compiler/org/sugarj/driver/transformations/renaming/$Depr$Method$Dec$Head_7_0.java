package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Depr$Method$Dec$Head_7_0 extends Strategy 
{ 
  public static $Depr$Method$Dec$Head_7_0 instance = new $Depr$Method$Dec$Head_7_0();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_32, Strategy o_32, Strategy p_32, Strategy q_32, Strategy r_32, Strategy s_32, Strategy t_32)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DeprMethodDecHead_7_0");
    Fail104:
    { 
      IStrategoTerm x_146 = null;
      IStrategoTerm m_146 = null;
      IStrategoTerm p_146 = null;
      IStrategoTerm q_146 = null;
      IStrategoTerm r_146 = null;
      IStrategoTerm s_146 = null;
      IStrategoTerm t_146 = null;
      IStrategoTerm u_146 = null;
      IStrategoTerm b_147 = null;
      IStrategoTerm c_147 = null;
      IStrategoTerm d_147 = null;
      IStrategoTerm e_147 = null;
      IStrategoTerm f_147 = null;
      IStrategoTerm g_147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDeprMethodDecHead_7 != ((IStrategoAppl)term).getConstructor())
        break Fail104;
      m_146 = term.getSubterm(0);
      p_146 = term.getSubterm(1);
      q_146 = term.getSubterm(2);
      r_146 = term.getSubterm(3);
      s_146 = term.getSubterm(4);
      t_146 = term.getSubterm(5);
      u_146 = term.getSubterm(6);
      IStrategoList annos78 = term.getAnnotations();
      x_146 = annos78;
      term = n_32.invoke(context, m_146);
      if(term == null)
        break Fail104;
      b_147 = term;
      term = o_32.invoke(context, p_146);
      if(term == null)
        break Fail104;
      c_147 = term;
      term = p_32.invoke(context, q_146);
      if(term == null)
        break Fail104;
      d_147 = term;
      term = q_32.invoke(context, r_146);
      if(term == null)
        break Fail104;
      e_147 = term;
      term = r_32.invoke(context, s_146);
      if(term == null)
        break Fail104;
      f_147 = term;
      term = s_32.invoke(context, t_146);
      if(term == null)
        break Fail104;
      g_147 = term;
      term = t_32.invoke(context, u_146);
      if(term == null)
        break Fail104;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDeprMethodDecHead_7, new IStrategoTerm[]{b_147, c_147, d_147, e_147, f_147, g_147, term}), checkListAnnos(termFactory, x_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }

  @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
  { 
    if(sargs == null || targs == null || sargs.length != 7 || targs.length != 0)
      throw new IllegalArgumentException("Illegal arguments for " + getName());
    return invoke(context, term, sargs[0], sargs[1], sargs[2], sargs[3], sargs[4], sargs[5], sargs[6]);
  }
}