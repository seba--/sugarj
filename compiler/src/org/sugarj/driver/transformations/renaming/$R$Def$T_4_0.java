package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Def$T_4_0 extends Strategy 
{ 
  public static $R$Def$T_4_0 instance = new $R$Def$T_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_11, Strategy o_11, Strategy p_11, Strategy q_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDefT_4_0");
    Fail31:
    { 
      IStrategoTerm k_94 = null;
      IStrategoTerm g_94 = null;
      IStrategoTerm h_94 = null;
      IStrategoTerm i_94 = null;
      IStrategoTerm j_94 = null;
      IStrategoTerm l_94 = null;
      IStrategoTerm m_94 = null;
      IStrategoTerm n_94 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail31;
      g_94 = term.getSubterm(0);
      h_94 = term.getSubterm(1);
      i_94 = term.getSubterm(2);
      j_94 = term.getSubterm(3);
      IStrategoList annos22 = term.getAnnotations();
      k_94 = annos22;
      term = n_11.invoke(context, g_94);
      if(term == null)
        break Fail31;
      l_94 = term;
      term = o_11.invoke(context, h_94);
      if(term == null)
        break Fail31;
      m_94 = term;
      term = p_11.invoke(context, i_94);
      if(term == null)
        break Fail31;
      n_94 = term;
      term = q_11.invoke(context, j_94);
      if(term == null)
        break Fail31;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDefT_4, new IStrategoTerm[]{l_94, m_94, n_94, term}), checkListAnnos(termFactory, k_94));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}