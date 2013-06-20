package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class conc_grammars_2_0 extends Strategy 
{ 
  public static conc_grammars_2_0 instance = new conc_grammars_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_29, Strategy m_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("conc_grammars_2_0");
    Fail271:
    { 
      IStrategoTerm p_148 = null;
      IStrategoTerm n_148 = null;
      IStrategoTerm o_148 = null;
      IStrategoTerm q_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consconc_grammars_2 != ((IStrategoAppl)term).getConstructor())
        break Fail271;
      n_148 = term.getSubterm(0);
      o_148 = term.getSubterm(1);
      IStrategoList annos223 = term.getAnnotations();
      p_148 = annos223;
      term = l_29.invoke(context, n_148);
      if(term == null)
        break Fail271;
      q_148 = term;
      term = m_29.invoke(context, o_148);
      if(term == null)
        break Fail271;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consconc_grammars_2, new IStrategoTerm[]{q_148, term}), checkListAnnos(termFactory, p_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}