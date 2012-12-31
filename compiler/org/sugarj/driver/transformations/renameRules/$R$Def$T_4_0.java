package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_11, Strategy j_11, Strategy k_11, Strategy l_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDefT_4_0");
    Fail28:
    { 
      IStrategoTerm f_94 = null;
      IStrategoTerm b_94 = null;
      IStrategoTerm c_94 = null;
      IStrategoTerm d_94 = null;
      IStrategoTerm e_94 = null;
      IStrategoTerm g_94 = null;
      IStrategoTerm h_94 = null;
      IStrategoTerm i_94 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail28;
      b_94 = term.getSubterm(0);
      c_94 = term.getSubterm(1);
      d_94 = term.getSubterm(2);
      e_94 = term.getSubterm(3);
      IStrategoList annos22 = term.getAnnotations();
      f_94 = annos22;
      term = i_11.invoke(context, b_94);
      if(term == null)
        break Fail28;
      g_94 = term;
      term = j_11.invoke(context, c_94);
      if(term == null)
        break Fail28;
      h_94 = term;
      term = k_11.invoke(context, d_94);
      if(term == null)
        break Fail28;
      i_94 = term;
      term = l_11.invoke(context, e_94);
      if(term == null)
        break Fail28;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDefT_4, new IStrategoTerm[]{g_94, h_94, i_94, term}), checkListAnnos(termFactory, f_94));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}