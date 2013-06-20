package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class range_2_0 extends Strategy 
{ 
  public static range_2_0 instance = new range_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_26, Strategy f_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("range_2_0");
    Fail193:
    { 
      IStrategoTerm q_134 = null;
      IStrategoTerm u_133 = null;
      IStrategoTerm x_133 = null;
      IStrategoTerm r_134 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consrange_2 != ((IStrategoAppl)term).getConstructor())
        break Fail193;
      u_133 = term.getSubterm(0);
      x_133 = term.getSubterm(1);
      IStrategoList annos161 = term.getAnnotations();
      q_134 = annos161;
      term = e_26.invoke(context, u_133);
      if(term == null)
        break Fail193;
      r_134 = term;
      term = f_26.invoke(context, x_133);
      if(term == null)
        break Fail193;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consrange_2, new IStrategoTerm[]{r_134, term}), checkListAnnos(termFactory, q_134));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}