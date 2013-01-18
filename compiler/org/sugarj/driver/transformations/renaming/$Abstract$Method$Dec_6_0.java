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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_30, Strategy v_30, Strategy w_30, Strategy x_30, Strategy y_30, Strategy z_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AbstractMethodDec_6_0");
    Fail84:
    { 
      IStrategoTerm z_139 = null;
      IStrategoTerm h_139 = null;
      IStrategoTerm i_139 = null;
      IStrategoTerm j_139 = null;
      IStrategoTerm k_139 = null;
      IStrategoTerm l_139 = null;
      IStrategoTerm m_139 = null;
      IStrategoTerm a_140 = null;
      IStrategoTerm e_140 = null;
      IStrategoTerm f_140 = null;
      IStrategoTerm j_140 = null;
      IStrategoTerm k_140 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAbstractMethodDec_6 != ((IStrategoAppl)term).getConstructor())
        break Fail84;
      h_139 = term.getSubterm(0);
      i_139 = term.getSubterm(1);
      j_139 = term.getSubterm(2);
      k_139 = term.getSubterm(3);
      l_139 = term.getSubterm(4);
      m_139 = term.getSubterm(5);
      IStrategoList annos60 = term.getAnnotations();
      z_139 = annos60;
      term = u_30.invoke(context, h_139);
      if(term == null)
        break Fail84;
      a_140 = term;
      term = v_30.invoke(context, i_139);
      if(term == null)
        break Fail84;
      e_140 = term;
      term = w_30.invoke(context, j_139);
      if(term == null)
        break Fail84;
      f_140 = term;
      term = x_30.invoke(context, k_139);
      if(term == null)
        break Fail84;
      j_140 = term;
      term = y_30.invoke(context, l_139);
      if(term == null)
        break Fail84;
      k_140 = term;
      term = z_30.invoke(context, m_139);
      if(term == null)
        break Fail84;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAbstractMethodDec_6, new IStrategoTerm[]{a_140, e_140, f_140, j_140, k_140, term}), checkListAnnos(termFactory, z_139));
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