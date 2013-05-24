package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class parameterized_sort_2_0 extends Strategy 
{ 
  public static parameterized_sort_2_0 instance = new parameterized_sort_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_349, Strategy f_349)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("parameterized_sort_2_0");
    Fail1007:
    { 
      IStrategoTerm y_463 = null;
      IStrategoTerm w_463 = null;
      IStrategoTerm x_463 = null;
      IStrategoTerm z_463 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consparameterized_sort_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1007;
      w_463 = term.getSubterm(0);
      x_463 = term.getSubterm(1);
      IStrategoList annos244 = term.getAnnotations();
      y_463 = annos244;
      term = e_349.invoke(context, w_463);
      if(term == null)
        break Fail1007;
      z_463 = term;
      term = f_349.invoke(context, x_463);
      if(term == null)
        break Fail1007;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consparameterized_sort_2, new IStrategoTerm[]{z_463, term}), checkListAnnos(termFactory, y_463));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}