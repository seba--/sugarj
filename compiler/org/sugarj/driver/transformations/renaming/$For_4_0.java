package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $For_4_0 extends Strategy 
{ 
  public static $For_4_0 instance = new $For_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_25, Strategy q_25, Strategy r_25, Strategy s_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("For_4_0");
    Fail131:
    { 
      IStrategoTerm k_127 = null;
      IStrategoTerm e_127 = null;
      IStrategoTerm g_127 = null;
      IStrategoTerm i_127 = null;
      IStrategoTerm j_127 = null;
      IStrategoTerm l_127 = null;
      IStrategoTerm m_127 = null;
      IStrategoTerm n_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consFor_4 != ((IStrategoAppl)term).getConstructor())
        break Fail131;
      e_127 = term.getSubterm(0);
      g_127 = term.getSubterm(1);
      i_127 = term.getSubterm(2);
      j_127 = term.getSubterm(3);
      IStrategoList annos109 = term.getAnnotations();
      k_127 = annos109;
      term = p_25.invoke(context, e_127);
      if(term == null)
        break Fail131;
      l_127 = term;
      term = q_25.invoke(context, g_127);
      if(term == null)
        break Fail131;
      m_127 = term;
      term = r_25.invoke(context, i_127);
      if(term == null)
        break Fail131;
      n_127 = term;
      term = s_25.invoke(context, j_127);
      if(term == null)
        break Fail131;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consFor_4, new IStrategoTerm[]{l_127, m_127, n_127, term}), checkListAnnos(termFactory, k_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}