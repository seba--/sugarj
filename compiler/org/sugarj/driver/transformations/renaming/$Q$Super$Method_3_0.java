package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Q$Super$Method_3_0 extends Strategy 
{ 
  public static $Q$Super$Method_3_0 instance = new $Q$Super$Method_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_20, Strategy n_20, Strategy o_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QSuperMethod_3_0");
    Fail71:
    { 
      IStrategoTerm l_113 = null;
      IStrategoTerm i_113 = null;
      IStrategoTerm j_113 = null;
      IStrategoTerm k_113 = null;
      IStrategoTerm m_113 = null;
      IStrategoTerm n_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consQSuperMethod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail71;
      i_113 = term.getSubterm(0);
      j_113 = term.getSubterm(1);
      k_113 = term.getSubterm(2);
      IStrategoList annos52 = term.getAnnotations();
      l_113 = annos52;
      term = m_20.invoke(context, i_113);
      if(term == null)
        break Fail71;
      m_113 = term;
      term = n_20.invoke(context, j_113);
      if(term == null)
        break Fail71;
      n_113 = term;
      term = o_20.invoke(context, k_113);
      if(term == null)
        break Fail71;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consQSuperMethod_3, new IStrategoTerm[]{m_113, n_113, term}), checkListAnnos(termFactory, l_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}