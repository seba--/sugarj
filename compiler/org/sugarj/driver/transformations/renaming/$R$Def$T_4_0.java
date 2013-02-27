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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_11, Strategy i_11, Strategy j_11, Strategy k_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDefT_4_0");
    Fail32:
    { 
      IStrategoTerm e_94 = null;
      IStrategoTerm a_94 = null;
      IStrategoTerm b_94 = null;
      IStrategoTerm c_94 = null;
      IStrategoTerm d_94 = null;
      IStrategoTerm f_94 = null;
      IStrategoTerm g_94 = null;
      IStrategoTerm h_94 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail32;
      a_94 = term.getSubterm(0);
      b_94 = term.getSubterm(1);
      c_94 = term.getSubterm(2);
      d_94 = term.getSubterm(3);
      IStrategoList annos22 = term.getAnnotations();
      e_94 = annos22;
      term = h_11.invoke(context, a_94);
      if(term == null)
        break Fail32;
      f_94 = term;
      term = i_11.invoke(context, b_94);
      if(term == null)
        break Fail32;
      g_94 = term;
      term = j_11.invoke(context, c_94);
      if(term == null)
        break Fail32;
      h_94 = term;
      term = k_11.invoke(context, d_94);
      if(term == null)
        break Fail32;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDefT_4, new IStrategoTerm[]{f_94, g_94, h_94, term}), checkListAnnos(termFactory, e_94));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}