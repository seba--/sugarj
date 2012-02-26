package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lt_2_0 extends Strategy 
{ 
  public static $Lt_2_0 instance = new $Lt_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_23, Strategy g_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Lt_2_0");
    Fail126:
    { 
      IStrategoTerm z_122 = null;
      IStrategoTerm x_122 = null;
      IStrategoTerm y_122 = null;
      IStrategoTerm a_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail126;
      x_122 = term.getSubterm(0);
      y_122 = term.getSubterm(1);
      IStrategoList annos108 = term.getAnnotations();
      z_122 = annos108;
      term = f_23.invoke(context, x_122);
      if(term == null)
        break Fail126;
      a_123 = term;
      term = g_23.invoke(context, y_122);
      if(term == null)
        break Fail126;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLt_2, new IStrategoTerm[]{a_123, term}), checkListAnnos(termFactory, z_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}