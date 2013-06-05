package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class assoc_group_2_0 extends Strategy 
{ 
  public static assoc_group_2_0 instance = new assoc_group_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_26, Strategy l_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("assoc_group_2_0");
    Fail201:
    { 
      IStrategoTerm d_136 = null;
      IStrategoTerm y_135 = null;
      IStrategoTerm b_136 = null;
      IStrategoTerm f_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consassoc_group_2 != ((IStrategoAppl)term).getConstructor())
        break Fail201;
      y_135 = term.getSubterm(0);
      b_136 = term.getSubterm(1);
      IStrategoList annos165 = term.getAnnotations();
      d_136 = annos165;
      term = k_26.invoke(context, y_135);
      if(term == null)
        break Fail201;
      f_136 = term;
      term = l_26.invoke(context, b_136);
      if(term == null)
        break Fail201;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consassoc_group_2, new IStrategoTerm[]{f_136, term}), checkListAnnos(termFactory, d_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}