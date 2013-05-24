package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class appl_2_0 extends Strategy 
{ 
  public static appl_2_0 instance = new appl_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_352, Strategy e_352)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("appl_2_0");
    Fail1072:
    { 
      IStrategoTerm x_471 = null;
      IStrategoTerm v_471 = null;
      IStrategoTerm w_471 = null;
      IStrategoTerm y_471 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consappl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1072;
      v_471 = term.getSubterm(0);
      w_471 = term.getSubterm(1);
      IStrategoList annos297 = term.getAnnotations();
      x_471 = annos297;
      term = d_352.invoke(context, v_471);
      if(term == null)
        break Fail1072;
      y_471 = term;
      term = e_352.invoke(context, w_471);
      if(term == null)
        break Fail1072;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consappl_2, new IStrategoTerm[]{y_471, term}), checkListAnnos(termFactory, x_471));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}