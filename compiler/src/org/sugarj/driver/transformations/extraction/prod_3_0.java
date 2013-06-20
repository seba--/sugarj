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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_28, Strategy o_28, Strategy p_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("prod_3_0");
    Fail244:
    { 
      IStrategoTerm p_144 = null;
      IStrategoTerm k_144 = null;
      IStrategoTerm l_144 = null;
      IStrategoTerm m_144 = null;
      IStrategoTerm q_144 = null;
      IStrategoTerm r_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consprod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail244;
      k_144 = term.getSubterm(0);
      l_144 = term.getSubterm(1);
      m_144 = term.getSubterm(2);
      IStrategoList annos201 = term.getAnnotations();
      p_144 = annos201;
      term = n_28.invoke(context, k_144);
      if(term == null)
        break Fail244;
      q_144 = term;
      term = o_28.invoke(context, l_144);
      if(term == null)
        break Fail244;
      r_144 = term;
      term = p_28.invoke(context, m_144);
      if(term == null)
        break Fail244;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consprod_3, new IStrategoTerm[]{q_144, r_144, term}), checkListAnnos(termFactory, p_144));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}