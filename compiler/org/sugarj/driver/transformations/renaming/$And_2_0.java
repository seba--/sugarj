package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $And_2_0 extends Strategy 
{ 
  public static $And_2_0 instance = new $And_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_22, Strategy b_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("And_2_0");
    Fail115:
    { 
      IStrategoTerm m_120 = null;
      IStrategoTerm k_120 = null;
      IStrategoTerm l_120 = null;
      IStrategoTerm n_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAnd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail115;
      k_120 = term.getSubterm(0);
      l_120 = term.getSubterm(1);
      IStrategoList annos100 = term.getAnnotations();
      m_120 = annos100;
      term = a_22.invoke(context, k_120);
      if(term == null)
        break Fail115;
      n_120 = term;
      term = b_22.invoke(context, l_120);
      if(term == null)
        break Fail115;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAnd_2, new IStrategoTerm[]{n_120, term}), checkListAnnos(termFactory, m_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}