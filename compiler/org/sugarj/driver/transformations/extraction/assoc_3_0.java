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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_26, Strategy i_26, Strategy j_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("assoc_3_0");
    Fail188:
    { 
      IStrategoTerm b_135 = null;
      IStrategoTerm r_134 = null;
      IStrategoTerm x_134 = null;
      IStrategoTerm z_134 = null;
      IStrategoTerm d_135 = null;
      IStrategoTerm g_135 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consassoc_3 != ((IStrategoAppl)term).getConstructor())
        break Fail188;
      r_134 = term.getSubterm(0);
      x_134 = term.getSubterm(1);
      z_134 = term.getSubterm(2);
      IStrategoList annos155 = term.getAnnotations();
      b_135 = annos155;
      term = h_26.invoke(context, r_134);
      if(term == null)
        break Fail188;
      d_135 = term;
      term = i_26.invoke(context, x_134);
      if(term == null)
        break Fail188;
      g_135 = term;
      term = j_26.invoke(context, z_134);
      if(term == null)
        break Fail188;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consassoc_3, new IStrategoTerm[]{d_135, g_135, term}), checkListAnnos(termFactory, b_135));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}