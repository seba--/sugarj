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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_24, Strategy n_24, Strategy o_24, Strategy p_24, Strategy q_24, Strategy r_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodDecHead_6_0");
    Fail115:
    { 
      IStrategoTerm e_124 = null;
      IStrategoTerm x_123 = null;
      IStrategoTerm y_123 = null;
      IStrategoTerm z_123 = null;
      IStrategoTerm b_124 = null;
      IStrategoTerm c_124 = null;
      IStrategoTerm d_124 = null;
      IStrategoTerm g_124 = null;
      IStrategoTerm j_124 = null;
      IStrategoTerm n_124 = null;
      IStrategoTerm o_124 = null;
      IStrategoTerm p_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMethodDecHead_6 != ((IStrategoAppl)term).getConstructor())
        break Fail115;
      x_123 = term.getSubterm(0);
      y_123 = term.getSubterm(1);
      z_123 = term.getSubterm(2);
      b_124 = term.getSubterm(3);
      c_124 = term.getSubterm(4);
      d_124 = term.getSubterm(5);
      IStrategoList annos94 = term.getAnnotations();
      e_124 = annos94;
      term = m_24.invoke(context, x_123);
      if(term == null)
        break Fail115;
      g_124 = term;
      term = n_24.invoke(context, y_123);
      if(term == null)
        break Fail115;
      j_124 = term;
      term = o_24.invoke(context, z_123);
      if(term == null)
        break Fail115;
      n_124 = term;
      term = p_24.invoke(context, b_124);
      if(term == null)
        break Fail115;
      o_124 = term;
      term = q_24.invoke(context, c_124);
      if(term == null)
        break Fail115;
      p_124 = term;
      term = r_24.invoke(context, d_124);
      if(term == null)
        break Fail115;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMethodDecHead_6, new IStrategoTerm[]{g_124, j_124, n_124, o_124, p_124, term}), checkListAnnos(termFactory, e_124));
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