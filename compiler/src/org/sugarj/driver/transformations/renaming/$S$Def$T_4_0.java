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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_13, Strategy g_13, Strategy h_13, Strategy i_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDefT_4_0");
    Fail55:
    { 
      IStrategoTerm m_99 = null;
      IStrategoTerm i_99 = null;
      IStrategoTerm j_99 = null;
      IStrategoTerm k_99 = null;
      IStrategoTerm l_99 = null;
      IStrategoTerm n_99 = null;
      IStrategoTerm o_99 = null;
      IStrategoTerm p_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail55;
      i_99 = term.getSubterm(0);
      j_99 = term.getSubterm(1);
      k_99 = term.getSubterm(2);
      l_99 = term.getSubterm(3);
      IStrategoList annos46 = term.getAnnotations();
      m_99 = annos46;
      term = f_13.invoke(context, i_99);
      if(term == null)
        break Fail55;
      n_99 = term;
      term = g_13.invoke(context, j_99);
      if(term == null)
        break Fail55;
      o_99 = term;
      term = h_13.invoke(context, k_99);
      if(term == null)
        break Fail55;
      p_99 = term;
      term = i_13.invoke(context, l_99);
      if(term == null)
        break Fail55;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSDefT_4, new IStrategoTerm[]{n_99, o_99, p_99, term}), checkListAnnos(termFactory, m_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}