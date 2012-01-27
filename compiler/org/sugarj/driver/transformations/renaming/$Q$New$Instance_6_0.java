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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_23, Strategy z_23, Strategy a_24, Strategy b_24, Strategy c_24, Strategy d_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QNewInstance_6_0");
    Fail144:
    { 
      IStrategoTerm j_126 = null;
      IStrategoTerm d_126 = null;
      IStrategoTerm e_126 = null;
      IStrategoTerm f_126 = null;
      IStrategoTerm g_126 = null;
      IStrategoTerm h_126 = null;
      IStrategoTerm i_126 = null;
      IStrategoTerm k_126 = null;
      IStrategoTerm l_126 = null;
      IStrategoTerm m_126 = null;
      IStrategoTerm n_126 = null;
      IStrategoTerm o_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consQNewInstance_6 != ((IStrategoAppl)term).getConstructor())
        break Fail144;
      d_126 = term.getSubterm(0);
      e_126 = term.getSubterm(1);
      f_126 = term.getSubterm(2);
      g_126 = term.getSubterm(3);
      h_126 = term.getSubterm(4);
      i_126 = term.getSubterm(5);
      IStrategoList annos129 = term.getAnnotations();
      j_126 = annos129;
      term = y_23.invoke(context, d_126);
      if(term == null)
        break Fail144;
      k_126 = term;
      term = z_23.invoke(context, e_126);
      if(term == null)
        break Fail144;
      l_126 = term;
      term = a_24.invoke(context, f_126);
      if(term == null)
        break Fail144;
      m_126 = term;
      term = b_24.invoke(context, g_126);
      if(term == null)
        break Fail144;
      n_126 = term;
      term = c_24.invoke(context, h_126);
      if(term == null)
        break Fail144;
      o_126 = term;
      term = d_24.invoke(context, i_126);
      if(term == null)
        break Fail144;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consQNewInstance_6, new IStrategoTerm[]{k_126, l_126, m_126, n_126, o_126, term}), checkListAnnos(termFactory, j_126));
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