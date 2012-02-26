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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_18, Strategy v_18, Strategy w_18, Strategy x_18, Strategy y_18, Strategy z_18, Strategy a_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DeprMethodDecHead_7_0");
    Fail66:
    { 
      IStrategoTerm v_110 = null;
      IStrategoTerm o_110 = null;
      IStrategoTerm p_110 = null;
      IStrategoTerm q_110 = null;
      IStrategoTerm r_110 = null;
      IStrategoTerm s_110 = null;
      IStrategoTerm t_110 = null;
      IStrategoTerm u_110 = null;
      IStrategoTerm b_111 = null;
      IStrategoTerm d_111 = null;
      IStrategoTerm e_111 = null;
      IStrategoTerm f_111 = null;
      IStrategoTerm g_111 = null;
      IStrategoTerm h_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDeprMethodDecHead_7 != ((IStrategoAppl)term).getConstructor())
        break Fail66;
      o_110 = term.getSubterm(0);
      p_110 = term.getSubterm(1);
      q_110 = term.getSubterm(2);
      r_110 = term.getSubterm(3);
      s_110 = term.getSubterm(4);
      t_110 = term.getSubterm(5);
      u_110 = term.getSubterm(6);
      IStrategoList annos52 = term.getAnnotations();
      v_110 = annos52;
      term = u_18.invoke(context, o_110);
      if(term == null)
        break Fail66;
      b_111 = term;
      term = v_18.invoke(context, p_110);
      if(term == null)
        break Fail66;
      d_111 = term;
      term = w_18.invoke(context, q_110);
      if(term == null)
        break Fail66;
      e_111 = term;
      term = x_18.invoke(context, r_110);
      if(term == null)
        break Fail66;
      f_111 = term;
      term = y_18.invoke(context, s_110);
      if(term == null)
        break Fail66;
      g_111 = term;
      term = z_18.invoke(context, t_110);
      if(term == null)
        break Fail66;
      h_111 = term;
      term = a_19.invoke(context, u_110);
      if(term == null)
        break Fail66;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDeprMethodDecHead_7, new IStrategoTerm[]{b_111, d_111, e_111, f_111, g_111, h_111, term}), checkListAnnos(termFactory, v_110));
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