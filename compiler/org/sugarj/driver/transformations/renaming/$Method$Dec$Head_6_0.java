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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_19, Strategy k_19, Strategy l_19, Strategy m_19, Strategy n_19, Strategy o_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodDecHead_6_0");
    Fail69:
    { 
      IStrategoTerm z_111 = null;
      IStrategoTerm t_111 = null;
      IStrategoTerm u_111 = null;
      IStrategoTerm v_111 = null;
      IStrategoTerm w_111 = null;
      IStrategoTerm x_111 = null;
      IStrategoTerm y_111 = null;
      IStrategoTerm a_112 = null;
      IStrategoTerm b_112 = null;
      IStrategoTerm c_112 = null;
      IStrategoTerm d_112 = null;
      IStrategoTerm f_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMethodDecHead_6 != ((IStrategoAppl)term).getConstructor())
        break Fail69;
      t_111 = term.getSubterm(0);
      u_111 = term.getSubterm(1);
      v_111 = term.getSubterm(2);
      w_111 = term.getSubterm(3);
      x_111 = term.getSubterm(4);
      y_111 = term.getSubterm(5);
      IStrategoList annos53 = term.getAnnotations();
      z_111 = annos53;
      term = j_19.invoke(context, t_111);
      if(term == null)
        break Fail69;
      a_112 = term;
      term = k_19.invoke(context, u_111);
      if(term == null)
        break Fail69;
      b_112 = term;
      term = l_19.invoke(context, v_111);
      if(term == null)
        break Fail69;
      c_112 = term;
      term = m_19.invoke(context, w_111);
      if(term == null)
        break Fail69;
      d_112 = term;
      term = n_19.invoke(context, x_111);
      if(term == null)
        break Fail69;
      f_112 = term;
      term = o_19.invoke(context, y_111);
      if(term == null)
        break Fail69;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMethodDecHead_6, new IStrategoTerm[]{a_112, b_112, c_112, d_112, f_112, term}), checkListAnnos(termFactory, z_111));
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