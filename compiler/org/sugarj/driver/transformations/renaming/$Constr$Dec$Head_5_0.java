package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Constr$Dec$Head_5_0 extends Strategy 
{ 
  public static $Constr$Dec$Head_5_0 instance = new $Constr$Dec$Head_5_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_31, Strategy y_31, Strategy z_31, Strategy a_32, Strategy b_32)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConstrDecHead_5_0");
    Fail95:
    { 
      IStrategoTerm j_144 = null;
      IStrategoTerm d_144 = null;
      IStrategoTerm e_144 = null;
      IStrategoTerm f_144 = null;
      IStrategoTerm g_144 = null;
      IStrategoTerm i_144 = null;
      IStrategoTerm k_144 = null;
      IStrategoTerm l_144 = null;
      IStrategoTerm m_144 = null;
      IStrategoTerm p_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consConstrDecHead_5 != ((IStrategoAppl)term).getConstructor())
        break Fail95;
      d_144 = term.getSubterm(0);
      e_144 = term.getSubterm(1);
      f_144 = term.getSubterm(2);
      g_144 = term.getSubterm(3);
      i_144 = term.getSubterm(4);
      IStrategoList annos71 = term.getAnnotations();
      j_144 = annos71;
      term = x_31.invoke(context, d_144);
      if(term == null)
        break Fail95;
      k_144 = term;
      term = y_31.invoke(context, e_144);
      if(term == null)
        break Fail95;
      l_144 = term;
      term = z_31.invoke(context, f_144);
      if(term == null)
        break Fail95;
      m_144 = term;
      term = a_32.invoke(context, g_144);
      if(term == null)
        break Fail95;
      p_144 = term;
      term = b_32.invoke(context, i_144);
      if(term == null)
        break Fail95;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consConstrDecHead_5, new IStrategoTerm[]{k_144, l_144, m_144, p_144, term}), checkListAnnos(termFactory, j_144));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}