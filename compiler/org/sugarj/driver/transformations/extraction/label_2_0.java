package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class label_2_0 extends Strategy 
{ 
  public static label_2_0 instance = new label_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_348, Strategy r_348)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("label_2_0");
    Fail997:
    { 
      IStrategoTerm m_462 = null;
      IStrategoTerm k_462 = null;
      IStrategoTerm l_462 = null;
      IStrategoTerm n_462 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conslabel_2 != ((IStrategoAppl)term).getConstructor())
        break Fail997;
      k_462 = term.getSubterm(0);
      l_462 = term.getSubterm(1);
      IStrategoList annos234 = term.getAnnotations();
      m_462 = annos234;
      term = q_348.invoke(context, k_462);
      if(term == null)
        break Fail997;
      n_462 = term;
      term = r_348.invoke(context, l_462);
      if(term == null)
        break Fail997;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conslabel_2, new IStrategoTerm[]{n_462, term}), checkListAnnos(termFactory, m_462));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}