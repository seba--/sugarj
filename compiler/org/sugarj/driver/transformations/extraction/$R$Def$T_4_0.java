package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_342, Strategy e_342, Strategy f_342, Strategy g_342)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDefT_4_0");
    Fail885:
    { 
      IStrategoTerm p_445 = null;
      IStrategoTerm l_445 = null;
      IStrategoTerm m_445 = null;
      IStrategoTerm n_445 = null;
      IStrategoTerm o_445 = null;
      IStrategoTerm q_445 = null;
      IStrategoTerm r_445 = null;
      IStrategoTerm s_445 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consRDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail885;
      l_445 = term.getSubterm(0);
      m_445 = term.getSubterm(1);
      n_445 = term.getSubterm(2);
      o_445 = term.getSubterm(3);
      IStrategoList annos131 = term.getAnnotations();
      p_445 = annos131;
      term = d_342.invoke(context, l_445);
      if(term == null)
        break Fail885;
      q_445 = term;
      term = e_342.invoke(context, m_445);
      if(term == null)
        break Fail885;
      r_445 = term;
      term = f_342.invoke(context, n_445);
      if(term == null)
        break Fail885;
      s_445 = term;
      term = g_342.invoke(context, o_445);
      if(term == null)
        break Fail885;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consRDefT_4, new IStrategoTerm[]{q_445, r_445, s_445, term}), checkListAnnos(termFactory, p_445));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}