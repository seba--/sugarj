package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Reference$Hover$Rule_3_0 extends Strategy 
{ 
  public static $Reference$Hover$Rule_3_0 instance = new $Reference$Hover$Rule_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_336, Strategy d_336, Strategy e_336)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ReferenceHoverRule_3_0");
    Fail780:
    { 
      IStrategoTerm l_430 = null;
      IStrategoTerm i_430 = null;
      IStrategoTerm j_430 = null;
      IStrategoTerm k_430 = null;
      IStrategoTerm m_430 = null;
      IStrategoTerm n_430 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consReferenceHoverRule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail780;
      i_430 = term.getSubterm(0);
      j_430 = term.getSubterm(1);
      k_430 = term.getSubterm(2);
      IStrategoList annos44 = term.getAnnotations();
      l_430 = annos44;
      term = c_336.invoke(context, i_430);
      if(term == null)
        break Fail780;
      m_430 = term;
      term = d_336.invoke(context, j_430);
      if(term == null)
        break Fail780;
      n_430 = term;
      term = e_336.invoke(context, k_430);
      if(term == null)
        break Fail780;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consReferenceHoverRule_3, new IStrategoTerm[]{m_430, n_430, term}), checkListAnnos(termFactory, l_430));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}