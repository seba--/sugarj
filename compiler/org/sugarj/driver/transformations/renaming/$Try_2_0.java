package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Try_2_0 extends Strategy 
{ 
  public static $Try_2_0 instance = new $Try_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_33, Strategy n_33)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Try_2_0");
    Fail114:
    { 
      IStrategoTerm l_149 = null;
      IStrategoTerm j_149 = null;
      IStrategoTerm k_149 = null;
      IStrategoTerm m_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTry_2 != ((IStrategoAppl)term).getConstructor())
        break Fail114;
      j_149 = term.getSubterm(0);
      k_149 = term.getSubterm(1);
      IStrategoList annos87 = term.getAnnotations();
      l_149 = annos87;
      term = m_33.invoke(context, j_149);
      if(term == null)
        break Fail114;
      m_149 = term;
      term = n_33.invoke(context, k_149);
      if(term == null)
        break Fail114;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTry_2, new IStrategoTerm[]{m_149, term}), checkListAnnos(termFactory, l_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}