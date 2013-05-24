package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $On$Save_2_0 extends Strategy 
{ 
  public static $On$Save_2_0 instance = new $On$Save_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_337, Strategy t_337)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OnSave_2_0");
    Fail817:
    { 
      IStrategoTerm l_434 = null;
      IStrategoTerm j_434 = null;
      IStrategoTerm k_434 = null;
      IStrategoTerm m_434 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consOnSave_2 != ((IStrategoAppl)term).getConstructor())
        break Fail817;
      j_434 = term.getSubterm(0);
      k_434 = term.getSubterm(1);
      IStrategoList annos65 = term.getAnnotations();
      l_434 = annos65;
      term = s_337.invoke(context, j_434);
      if(term == null)
        break Fail817;
      m_434 = term;
      term = t_337.invoke(context, k_434);
      if(term == null)
        break Fail817;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consOnSave_2, new IStrategoTerm[]{m_434, term}), checkListAnnos(termFactory, l_434));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}