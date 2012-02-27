package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $If_2_0 extends Strategy 
{ 
  public static $If_2_0 instance = new $If_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_21, Strategy d_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("If_2_0");
    Fail92:
    { 
      IStrategoTerm m_116 = null;
      IStrategoTerm k_116 = null;
      IStrategoTerm l_116 = null;
      IStrategoTerm n_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consIf_2 != ((IStrategoAppl)term).getConstructor())
        break Fail92;
      k_116 = term.getSubterm(0);
      l_116 = term.getSubterm(1);
      IStrategoList annos75 = term.getAnnotations();
      m_116 = annos75;
      term = c_21.invoke(context, k_116);
      if(term == null)
        break Fail92;
      n_116 = term;
      term = d_21.invoke(context, l_116);
      if(term == null)
        break Fail92;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consIf_2, new IStrategoTerm[]{n_116, term}), checkListAnnos(termFactory, m_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}