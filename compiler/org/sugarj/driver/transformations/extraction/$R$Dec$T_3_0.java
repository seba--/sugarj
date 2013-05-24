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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_340, Strategy y_340, Strategy z_340)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDecT_3_0");
    Fail872:
    { 
      IStrategoTerm p_442 = null;
      IStrategoTerm m_442 = null;
      IStrategoTerm n_442 = null;
      IStrategoTerm o_442 = null;
      IStrategoTerm q_442 = null;
      IStrategoTerm r_442 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consRDecT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail872;
      m_442 = term.getSubterm(0);
      n_442 = term.getSubterm(1);
      o_442 = term.getSubterm(2);
      IStrategoList annos118 = term.getAnnotations();
      p_442 = annos118;
      term = x_340.invoke(context, m_442);
      if(term == null)
        break Fail872;
      q_442 = term;
      term = y_340.invoke(context, n_442);
      if(term == null)
        break Fail872;
      r_442 = term;
      term = z_340.invoke(context, o_442);
      if(term == null)
        break Fail872;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consRDecT_3, new IStrategoTerm[]{q_442, r_442, term}), checkListAnnos(termFactory, p_442));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}