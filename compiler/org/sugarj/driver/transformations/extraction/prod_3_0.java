package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class prod_3_0 extends Strategy 
{ 
  public static prod_3_0 instance = new prod_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_352, Strategy l_352, Strategy m_352)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("prod_3_0");
    Fail1078:
    { 
      IStrategoTerm r_472 = null;
      IStrategoTerm o_472 = null;
      IStrategoTerm p_472 = null;
      IStrategoTerm q_472 = null;
      IStrategoTerm s_472 = null;
      IStrategoTerm t_472 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consprod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail1078;
      o_472 = term.getSubterm(0);
      p_472 = term.getSubterm(1);
      q_472 = term.getSubterm(2);
      IStrategoList annos302 = term.getAnnotations();
      r_472 = annos302;
      term = k_352.invoke(context, o_472);
      if(term == null)
        break Fail1078;
      s_472 = term;
      term = l_352.invoke(context, p_472);
      if(term == null)
        break Fail1078;
      t_472 = term;
      term = m_352.invoke(context, q_472);
      if(term == null)
        break Fail1078;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consprod_3, new IStrategoTerm[]{s_472, t_472, term}), checkListAnnos(termFactory, r_472));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}