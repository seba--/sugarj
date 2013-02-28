package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $B$A_2_0 extends Strategy 
{ 
  public static $B$A_2_0 instance = new $B$A_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_15, Strategy w_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BA_2_0");
    Fail95:
    { 
      IStrategoTerm m_106 = null;
      IStrategoTerm k_106 = null;
      IStrategoTerm l_106 = null;
      IStrategoTerm n_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consBA_2 != ((IStrategoAppl)term).getConstructor())
        break Fail95;
      k_106 = term.getSubterm(0);
      l_106 = term.getSubterm(1);
      IStrategoList annos84 = term.getAnnotations();
      m_106 = annos84;
      term = v_15.invoke(context, k_106);
      if(term == null)
        break Fail95;
      n_106 = term;
      term = w_15.invoke(context, l_106);
      if(term == null)
        break Fail95;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consBA_2, new IStrategoTerm[]{n_106, term}), checkListAnnos(termFactory, m_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}