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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_26, Strategy h_26, Strategy i_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("assoc_3_0");
    Fail199:
    { 
      IStrategoTerm f_135 = null;
      IStrategoTerm z_134 = null;
      IStrategoTerm b_135 = null;
      IStrategoTerm d_135 = null;
      IStrategoTerm i_135 = null;
      IStrategoTerm k_135 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consassoc_3 != ((IStrategoAppl)term).getConstructor())
        break Fail199;
      z_134 = term.getSubterm(0);
      b_135 = term.getSubterm(1);
      d_135 = term.getSubterm(2);
      IStrategoList annos163 = term.getAnnotations();
      f_135 = annos163;
      term = g_26.invoke(context, z_134);
      if(term == null)
        break Fail199;
      i_135 = term;
      term = h_26.invoke(context, b_135);
      if(term == null)
        break Fail199;
      k_135 = term;
      term = i_26.invoke(context, d_135);
      if(term == null)
        break Fail199;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consassoc_3, new IStrategoTerm[]{i_135, k_135, term}), checkListAnnos(termFactory, f_135));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}