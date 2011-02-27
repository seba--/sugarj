package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class alt_2_0 extends Strategy 
{ 
  public static alt_2_0 instance = new alt_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_25, Strategy j_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("alt_2_0");
    Fail164:
    { 
      IStrategoTerm r_129 = null;
      IStrategoTerm p_129 = null;
      IStrategoTerm q_129 = null;
      IStrategoTerm t_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consalt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail164;
      p_129 = term.getSubterm(0);
      q_129 = term.getSubterm(1);
      IStrategoList annos137 = term.getAnnotations();
      r_129 = annos137;
      term = i_25.invoke(context, p_129);
      if(term == null)
        break Fail164;
      t_129 = term;
      term = j_25.invoke(context, q_129);
      if(term == null)
        break Fail164;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consalt_2, new IStrategoTerm[]{t_129, term}), checkListAnnos(termFactory, r_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}