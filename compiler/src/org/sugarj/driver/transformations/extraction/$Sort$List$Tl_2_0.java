package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort$List$Tl_2_0 extends Strategy 
{ 
  public static $Sort$List$Tl_2_0 instance = new $Sort$List$Tl_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_23, Strategy x_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortListTl_2_0");
    Fail148:
    { 
      IStrategoTerm m_125 = null;
      IStrategoTerm k_125 = null;
      IStrategoTerm l_125 = null;
      IStrategoTerm n_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consSortListTl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail148;
      k_125 = term.getSubterm(0);
      l_125 = term.getSubterm(1);
      IStrategoList annos118 = term.getAnnotations();
      m_125 = annos118;
      term = w_23.invoke(context, k_125);
      if(term == null)
        break Fail148;
      n_125 = term;
      term = x_23.invoke(context, l_125);
      if(term == null)
        break Fail148;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consSortListTl_2, new IStrategoTerm[]{n_125, term}), checkListAnnos(termFactory, m_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}