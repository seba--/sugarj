package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Def$T_4_0 extends Strategy 
{ 
  public static $S$Def$T_4_0 instance = new $S$Def$T_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_13, Strategy d_13, Strategy e_13, Strategy f_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDefT_4_0");
    Fail56:
    { 
      IStrategoTerm j_99 = null;
      IStrategoTerm f_99 = null;
      IStrategoTerm g_99 = null;
      IStrategoTerm h_99 = null;
      IStrategoTerm i_99 = null;
      IStrategoTerm k_99 = null;
      IStrategoTerm l_99 = null;
      IStrategoTerm m_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail56;
      f_99 = term.getSubterm(0);
      g_99 = term.getSubterm(1);
      h_99 = term.getSubterm(2);
      i_99 = term.getSubterm(3);
      IStrategoList annos46 = term.getAnnotations();
      j_99 = annos46;
      term = c_13.invoke(context, f_99);
      if(term == null)
        break Fail56;
      k_99 = term;
      term = d_13.invoke(context, g_99);
      if(term == null)
        break Fail56;
      l_99 = term;
      term = e_13.invoke(context, h_99);
      if(term == null)
        break Fail56;
      m_99 = term;
      term = f_13.invoke(context, i_99);
      if(term == null)
        break Fail56;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSDefT_4, new IStrategoTerm[]{k_99, l_99, m_99, term}), checkListAnnos(termFactory, j_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}