package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Choice_2_0 extends Strategy 
{ 
  public static $R$Choice_2_0 instance = new $R$Choice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_20, Strategy x_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RChoice_2_0");
    Fail96:
    { 
      IStrategoTerm m_116 = null;
      IStrategoTerm k_116 = null;
      IStrategoTerm l_116 = null;
      IStrategoTerm n_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consRChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail96;
      k_116 = term.getSubterm(0);
      l_116 = term.getSubterm(1);
      IStrategoList annos69 = term.getAnnotations();
      m_116 = annos69;
      term = w_20.invoke(context, k_116);
      if(term == null)
        break Fail96;
      n_116 = term;
      term = x_20.invoke(context, l_116);
      if(term == null)
        break Fail96;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consRChoice_2, new IStrategoTerm[]{n_116, term}), checkListAnnos(termFactory, m_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}