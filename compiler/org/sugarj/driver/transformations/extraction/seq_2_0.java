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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_348, Strategy i_348)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("seq_2_0");
    Fail988:
    { 
      IStrategoTerm o_461 = null;
      IStrategoTerm m_461 = null;
      IStrategoTerm n_461 = null;
      IStrategoTerm p_461 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consseq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail988;
      m_461 = term.getSubterm(0);
      n_461 = term.getSubterm(1);
      IStrategoList annos228 = term.getAnnotations();
      o_461 = annos228;
      term = h_348.invoke(context, m_461);
      if(term == null)
        break Fail988;
      p_461 = term;
      term = i_348.invoke(context, n_461);
      if(term == null)
        break Fail988;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consseq_2, new IStrategoTerm[]{p_461, term}), checkListAnnos(termFactory, o_461));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}