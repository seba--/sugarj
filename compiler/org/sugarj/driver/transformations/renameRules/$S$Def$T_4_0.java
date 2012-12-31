package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_13, Strategy b_13, Strategy c_13, Strategy d_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDefT_4_0");
    Fail52:
    { 
      IStrategoTerm h_99 = null;
      IStrategoTerm d_99 = null;
      IStrategoTerm e_99 = null;
      IStrategoTerm f_99 = null;
      IStrategoTerm g_99 = null;
      IStrategoTerm i_99 = null;
      IStrategoTerm j_99 = null;
      IStrategoTerm k_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail52;
      d_99 = term.getSubterm(0);
      e_99 = term.getSubterm(1);
      f_99 = term.getSubterm(2);
      g_99 = term.getSubterm(3);
      IStrategoList annos46 = term.getAnnotations();
      h_99 = annos46;
      term = a_13.invoke(context, d_99);
      if(term == null)
        break Fail52;
      i_99 = term;
      term = b_13.invoke(context, e_99);
      if(term == null)
        break Fail52;
      j_99 = term;
      term = c_13.invoke(context, f_99);
      if(term == null)
        break Fail52;
      k_99 = term;
      term = d_13.invoke(context, g_99);
      if(term == null)
        break Fail52;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSDefT_4, new IStrategoTerm[]{i_99, j_99, k_99, term}), checkListAnnos(termFactory, h_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}