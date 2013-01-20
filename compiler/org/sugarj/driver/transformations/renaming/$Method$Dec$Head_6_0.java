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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_32, Strategy v_32, Strategy w_32, Strategy x_32, Strategy y_32, Strategy z_32)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodDecHead_6_0");
    Fail105:
    { 
      IStrategoTerm u_147 = null;
      IStrategoTerm k_147 = null;
      IStrategoTerm l_147 = null;
      IStrategoTerm m_147 = null;
      IStrategoTerm n_147 = null;
      IStrategoTerm o_147 = null;
      IStrategoTerm t_147 = null;
      IStrategoTerm y_147 = null;
      IStrategoTerm z_147 = null;
      IStrategoTerm a_148 = null;
      IStrategoTerm b_148 = null;
      IStrategoTerm c_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consMethodDecHead_6 != ((IStrategoAppl)term).getConstructor())
        break Fail105;
      k_147 = term.getSubterm(0);
      l_147 = term.getSubterm(1);
      m_147 = term.getSubterm(2);
      n_147 = term.getSubterm(3);
      o_147 = term.getSubterm(4);
      t_147 = term.getSubterm(5);
      IStrategoList annos79 = term.getAnnotations();
      u_147 = annos79;
      term = u_32.invoke(context, k_147);
      if(term == null)
        break Fail105;
      y_147 = term;
      term = v_32.invoke(context, l_147);
      if(term == null)
        break Fail105;
      z_147 = term;
      term = w_32.invoke(context, m_147);
      if(term == null)
        break Fail105;
      a_148 = term;
      term = x_32.invoke(context, n_147);
      if(term == null)
        break Fail105;
      b_148 = term;
      term = y_32.invoke(context, o_147);
      if(term == null)
        break Fail105;
      c_148 = term;
      term = z_32.invoke(context, t_147);
      if(term == null)
        break Fail105;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consMethodDecHead_6, new IStrategoTerm[]{y_147, z_147, a_148, b_148, c_148, term}), checkListAnnos(termFactory, u_147));
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