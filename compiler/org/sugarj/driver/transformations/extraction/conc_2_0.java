package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class conc_2_0 extends Strategy 
{ 
  public static conc_2_0 instance = new conc_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_26, Strategy c_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("conc_2_0");
    Fail180:
    { 
      IStrategoTerm a_133 = null;
      IStrategoTerm u_132 = null;
      IStrategoTerm x_132 = null;
      IStrategoTerm d_133 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consconc_2 != ((IStrategoAppl)term).getConstructor())
        break Fail180;
      u_132 = term.getSubterm(0);
      x_132 = term.getSubterm(1);
      IStrategoList annos151 = term.getAnnotations();
      a_133 = annos151;
      term = b_26.invoke(context, u_132);
      if(term == null)
        break Fail180;
      d_133 = term;
      term = c_26.invoke(context, x_132);
      if(term == null)
        break Fail180;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consconc_2, new IStrategoTerm[]{d_133, term}), checkListAnnos(termFactory, a_133));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}