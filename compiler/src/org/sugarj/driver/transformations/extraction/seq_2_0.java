package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class seq_2_0 extends Strategy 
{ 
  public static seq_2_0 instance = new seq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_25, Strategy n_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("seq_2_0");
    Fail179:
    { 
      IStrategoTerm m_130 = null;
      IStrategoTerm j_130 = null;
      IStrategoTerm k_130 = null;
      IStrategoTerm o_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consseq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail179;
      j_130 = term.getSubterm(0);
      k_130 = term.getSubterm(1);
      IStrategoList annos148 = term.getAnnotations();
      m_130 = annos148;
      term = m_25.invoke(context, j_130);
      if(term == null)
        break Fail179;
      o_130 = term;
      term = n_25.invoke(context, k_130);
      if(term == null)
        break Fail179;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consseq_2, new IStrategoTerm[]{o_130, term}), checkListAnnos(termFactory, m_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}