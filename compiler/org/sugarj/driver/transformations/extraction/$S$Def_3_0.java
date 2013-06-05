package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Def_3_0 extends Strategy 
{ 
  public static $S$Def_3_0 instance = new $S$Def_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_18, Strategy z_18, Strategy a_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDef_3_0");
    Fail77:
    { 
      IStrategoTerm p_111 = null;
      IStrategoTerm k_111 = null;
      IStrategoTerm l_111 = null;
      IStrategoTerm m_111 = null;
      IStrategoTerm q_111 = null;
      IStrategoTerm r_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consSDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail77;
      k_111 = term.getSubterm(0);
      l_111 = term.getSubterm(1);
      m_111 = term.getSubterm(2);
      IStrategoList annos50 = term.getAnnotations();
      p_111 = annos50;
      term = y_18.invoke(context, k_111);
      if(term == null)
        break Fail77;
      q_111 = term;
      term = z_18.invoke(context, l_111);
      if(term == null)
        break Fail77;
      r_111 = term;
      term = a_19.invoke(context, m_111);
      if(term == null)
        break Fail77;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consSDef_3, new IStrategoTerm[]{q_111, r_111, term}), checkListAnnos(termFactory, p_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}