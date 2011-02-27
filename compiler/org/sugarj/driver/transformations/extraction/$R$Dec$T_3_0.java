package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Dec$T_3_0 extends Strategy 
{ 
  public static $R$Dec$T_3_0 instance = new $R$Dec$T_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_16, Strategy h_16, Strategy i_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDecT_3_0");
    Fail24:
    { 
      IStrategoTerm p_103 = null;
      IStrategoTerm m_103 = null;
      IStrategoTerm n_103 = null;
      IStrategoTerm o_103 = null;
      IStrategoTerm q_103 = null;
      IStrategoTerm r_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consRDecT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail24;
      m_103 = term.getSubterm(0);
      n_103 = term.getSubterm(1);
      o_103 = term.getSubterm(2);
      IStrategoList annos1 = term.getAnnotations();
      p_103 = annos1;
      term = g_16.invoke(context, m_103);
      if(term == null)
        break Fail24;
      q_103 = term;
      term = h_16.invoke(context, n_103);
      if(term == null)
        break Fail24;
      r_103 = term;
      term = i_16.invoke(context, o_103);
      if(term == null)
        break Fail24;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consRDecT_3, new IStrategoTerm[]{q_103, r_103, term}), checkListAnnos(termFactory, p_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}