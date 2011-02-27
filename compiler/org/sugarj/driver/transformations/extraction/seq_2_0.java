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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_25, Strategy m_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("seq_2_0");
    Fail166:
    { 
      IStrategoTerm d_130 = null;
      IStrategoTerm a_130 = null;
      IStrategoTerm b_130 = null;
      IStrategoTerm e_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consseq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail166;
      a_130 = term.getSubterm(0);
      b_130 = term.getSubterm(1);
      IStrategoList annos139 = term.getAnnotations();
      d_130 = annos139;
      term = l_25.invoke(context, a_130);
      if(term == null)
        break Fail166;
      e_130 = term;
      term = m_25.invoke(context, b_130);
      if(term == null)
        break Fail166;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consseq_2, new IStrategoTerm[]{e_130, term}), checkListAnnos(termFactory, d_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}