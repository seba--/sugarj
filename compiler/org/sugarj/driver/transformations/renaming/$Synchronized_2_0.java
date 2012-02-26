package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Synchronized_2_0 extends Strategy 
{ 
  public static $Synchronized_2_0 instance = new $Synchronized_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_19, Strategy w_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Synchronized_2_0");
    Fail77:
    { 
      IStrategoTerm m_113 = null;
      IStrategoTerm k_113 = null;
      IStrategoTerm l_113 = null;
      IStrategoTerm n_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSynchronized_2 != ((IStrategoAppl)term).getConstructor())
        break Fail77;
      k_113 = term.getSubterm(0);
      l_113 = term.getSubterm(1);
      IStrategoList annos62 = term.getAnnotations();
      m_113 = annos62;
      term = v_19.invoke(context, k_113);
      if(term == null)
        break Fail77;
      n_113 = term;
      term = w_19.invoke(context, l_113);
      if(term == null)
        break Fail77;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSynchronized_2, new IStrategoTerm[]{n_113, term}), checkListAnnos(termFactory, m_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}