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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_17, Strategy c_17, Strategy d_17, Strategy e_17, Strategy f_17, Strategy g_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AbstractMethodDec_6_0");
    Fail46:
    { 
      IStrategoTerm h_106 = null;
      IStrategoTerm b_106 = null;
      IStrategoTerm c_106 = null;
      IStrategoTerm d_106 = null;
      IStrategoTerm e_106 = null;
      IStrategoTerm f_106 = null;
      IStrategoTerm g_106 = null;
      IStrategoTerm i_106 = null;
      IStrategoTerm j_106 = null;
      IStrategoTerm k_106 = null;
      IStrategoTerm l_106 = null;
      IStrategoTerm m_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAbstractMethodDec_6 != ((IStrategoAppl)term).getConstructor())
        break Fail46;
      b_106 = term.getSubterm(0);
      c_106 = term.getSubterm(1);
      d_106 = term.getSubterm(2);
      e_106 = term.getSubterm(3);
      f_106 = term.getSubterm(4);
      g_106 = term.getSubterm(5);
      IStrategoList annos34 = term.getAnnotations();
      h_106 = annos34;
      term = b_17.invoke(context, b_106);
      if(term == null)
        break Fail46;
      i_106 = term;
      term = c_17.invoke(context, c_106);
      if(term == null)
        break Fail46;
      j_106 = term;
      term = d_17.invoke(context, d_106);
      if(term == null)
        break Fail46;
      k_106 = term;
      term = e_17.invoke(context, e_106);
      if(term == null)
        break Fail46;
      l_106 = term;
      term = f_17.invoke(context, f_106);
      if(term == null)
        break Fail46;
      m_106 = term;
      term = g_17.invoke(context, g_106);
      if(term == null)
        break Fail46;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAbstractMethodDec_6, new IStrategoTerm[]{i_106, j_106, k_106, l_106, m_106, term}), checkListAnnos(termFactory, h_106));
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