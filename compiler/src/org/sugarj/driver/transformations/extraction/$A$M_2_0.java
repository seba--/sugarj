package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $A$M_2_0 extends Strategy 
{ 
  public static $A$M_2_0 instance = new $A$M_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_20, Strategy n_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AM_2_0");
    Fail92:
    { 
      IStrategoTerm n_115 = null;
      IStrategoTerm l_115 = null;
      IStrategoTerm m_115 = null;
      IStrategoTerm p_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consAM_2 != ((IStrategoAppl)term).getConstructor())
        break Fail92;
      l_115 = term.getSubterm(0);
      m_115 = term.getSubterm(1);
      IStrategoList annos65 = term.getAnnotations();
      n_115 = annos65;
      term = m_20.invoke(context, l_115);
      if(term == null)
        break Fail92;
      p_115 = term;
      term = n_20.invoke(context, m_115);
      if(term == null)
        break Fail92;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consAM_2, new IStrategoTerm[]{p_115, term}), checkListAnnos(termFactory, n_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}