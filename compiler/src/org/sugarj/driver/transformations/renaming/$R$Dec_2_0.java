package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Dec_2_0 extends Strategy 
{ 
  public static $R$Dec_2_0 instance = new $R$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_10, Strategy e_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDec_2_0");
    Fail11:
    { 
      IStrategoTerm o_89 = null;
      IStrategoTerm m_89 = null;
      IStrategoTerm n_89 = null;
      IStrategoTerm p_89 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail11;
      m_89 = term.getSubterm(0);
      n_89 = term.getSubterm(1);
      IStrategoList annos2 = term.getAnnotations();
      o_89 = annos2;
      term = d_10.invoke(context, m_89);
      if(term == null)
        break Fail11;
      p_89 = term;
      term = e_10.invoke(context, n_89);
      if(term == null)
        break Fail11;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDec_2, new IStrategoTerm[]{p_89, term}), checkListAnnos(termFactory, o_89));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}