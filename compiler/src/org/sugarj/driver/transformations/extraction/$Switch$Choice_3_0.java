package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch$Choice_3_0 extends Strategy 
{ 
  public static $Switch$Choice_3_0 instance = new $Switch$Choice_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_20, Strategy o_20, Strategy p_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchChoice_3_0");
    Fail81:
    { 
      IStrategoTerm l_115 = null;
      IStrategoTerm i_115 = null;
      IStrategoTerm j_115 = null;
      IStrategoTerm k_115 = null;
      IStrategoTerm m_115 = null;
      IStrategoTerm n_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSwitchChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail81;
      i_115 = term.getSubterm(0);
      j_115 = term.getSubterm(1);
      k_115 = term.getSubterm(2);
      IStrategoList annos57 = term.getAnnotations();
      l_115 = annos57;
      term = n_20.invoke(context, i_115);
      if(term == null)
        break Fail81;
      m_115 = term;
      term = o_20.invoke(context, j_115);
      if(term == null)
        break Fail81;
      n_115 = term;
      term = p_20.invoke(context, k_115);
      if(term == null)
        break Fail81;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSwitchChoice_3, new IStrategoTerm[]{m_115, n_115, term}), checkListAnnos(termFactory, l_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}