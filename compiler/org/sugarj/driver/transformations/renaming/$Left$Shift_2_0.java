package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Left$Shift_2_0 extends Strategy 
{ 
  public static $Left$Shift_2_0 instance = new $Left$Shift_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_22, Strategy x_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LeftShift_2_0");
    Fail126:
    { 
      IStrategoTerm y_122 = null;
      IStrategoTerm w_122 = null;
      IStrategoTerm x_122 = null;
      IStrategoTerm z_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLeftShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail126;
      w_122 = term.getSubterm(0);
      x_122 = term.getSubterm(1);
      IStrategoList annos111 = term.getAnnotations();
      y_122 = annos111;
      term = w_22.invoke(context, w_122);
      if(term == null)
        break Fail126;
      z_122 = term;
      term = x_22.invoke(context, x_122);
      if(term == null)
        break Fail126;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLeftShift_2, new IStrategoTerm[]{z_122, term}), checkListAnnos(termFactory, y_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}