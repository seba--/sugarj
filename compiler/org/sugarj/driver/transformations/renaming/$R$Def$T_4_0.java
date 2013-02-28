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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_11, Strategy l_11, Strategy m_11, Strategy n_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDefT_4_0");
    Fail32:
    { 
      IStrategoTerm h_94 = null;
      IStrategoTerm d_94 = null;
      IStrategoTerm e_94 = null;
      IStrategoTerm f_94 = null;
      IStrategoTerm g_94 = null;
      IStrategoTerm i_94 = null;
      IStrategoTerm j_94 = null;
      IStrategoTerm k_94 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail32;
      d_94 = term.getSubterm(0);
      e_94 = term.getSubterm(1);
      f_94 = term.getSubterm(2);
      g_94 = term.getSubterm(3);
      IStrategoList annos22 = term.getAnnotations();
      h_94 = annos22;
      term = k_11.invoke(context, d_94);
      if(term == null)
        break Fail32;
      i_94 = term;
      term = l_11.invoke(context, e_94);
      if(term == null)
        break Fail32;
      j_94 = term;
      term = m_11.invoke(context, f_94);
      if(term == null)
        break Fail32;
      k_94 = term;
      term = n_11.invoke(context, g_94);
      if(term == null)
        break Fail32;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDefT_4, new IStrategoTerm[]{i_94, j_94, k_94, term}), checkListAnnos(termFactory, h_94));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}