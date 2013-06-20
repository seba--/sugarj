package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class assoc_3_0 extends Strategy 
{ 
  public static assoc_3_0 instance = new assoc_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_26, Strategy j_26, Strategy k_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("assoc_3_0");
    Fail200:
    { 
      IStrategoTerm r_135 = null;
      IStrategoTerm k_135 = null;
      IStrategoTerm m_135 = null;
      IStrategoTerm o_135 = null;
      IStrategoTerm u_135 = null;
      IStrategoTerm y_135 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consassoc_3 != ((IStrategoAppl)term).getConstructor())
        break Fail200;
      k_135 = term.getSubterm(0);
      m_135 = term.getSubterm(1);
      o_135 = term.getSubterm(2);
      IStrategoList annos164 = term.getAnnotations();
      r_135 = annos164;
      term = i_26.invoke(context, k_135);
      if(term == null)
        break Fail200;
      u_135 = term;
      term = j_26.invoke(context, m_135);
      if(term == null)
        break Fail200;
      y_135 = term;
      term = k_26.invoke(context, o_135);
      if(term == null)
        break Fail200;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consassoc_3, new IStrategoTerm[]{u_135, y_135, term}), checkListAnnos(termFactory, r_135));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}