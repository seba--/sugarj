package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Q$New$Instance_6_0 extends Strategy 
{ 
  public static $Q$New$Instance_6_0 instance = new $Q$New$Instance_6_0();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_24, Strategy w_24, Strategy x_24, Strategy y_24, Strategy z_24, Strategy a_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QNewInstance_6_0");
    Fail149:
    { 
      IStrategoTerm k_127 = null;
      IStrategoTerm c_127 = null;
      IStrategoTerm e_127 = null;
      IStrategoTerm g_127 = null;
      IStrategoTerm h_127 = null;
      IStrategoTerm i_127 = null;
      IStrategoTerm j_127 = null;
      IStrategoTerm l_127 = null;
      IStrategoTerm m_127 = null;
      IStrategoTerm n_127 = null;
      IStrategoTerm o_127 = null;
      IStrategoTerm p_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consQNewInstance_6 != ((IStrategoAppl)term).getConstructor())
        break Fail149;
      c_127 = term.getSubterm(0);
      e_127 = term.getSubterm(1);
      g_127 = term.getSubterm(2);
      h_127 = term.getSubterm(3);
      i_127 = term.getSubterm(4);
      j_127 = term.getSubterm(5);
      IStrategoList annos129 = term.getAnnotations();
      k_127 = annos129;
      term = v_24.invoke(context, c_127);
      if(term == null)
        break Fail149;
      l_127 = term;
      term = w_24.invoke(context, e_127);
      if(term == null)
        break Fail149;
      m_127 = term;
      term = x_24.invoke(context, g_127);
      if(term == null)
        break Fail149;
      n_127 = term;
      term = y_24.invoke(context, h_127);
      if(term == null)
        break Fail149;
      o_127 = term;
      term = z_24.invoke(context, i_127);
      if(term == null)
        break Fail149;
      p_127 = term;
      term = a_25.invoke(context, j_127);
      if(term == null)
        break Fail149;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consQNewInstance_6, new IStrategoTerm[]{l_127, m_127, n_127, o_127, p_127, term}), checkListAnnos(termFactory, k_127));
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