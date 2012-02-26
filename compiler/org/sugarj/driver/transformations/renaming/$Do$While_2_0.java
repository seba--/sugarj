package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Do$While_2_0 extends Strategy 
{ 
  public static $Do$While_2_0 instance = new $Do$While_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_20, Strategy j_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DoWhile_2_0");
    Fail84:
    { 
      IStrategoTerm x_114 = null;
      IStrategoTerm v_114 = null;
      IStrategoTerm w_114 = null;
      IStrategoTerm y_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDoWhile_2 != ((IStrategoAppl)term).getConstructor())
        break Fail84;
      v_114 = term.getSubterm(0);
      w_114 = term.getSubterm(1);
      IStrategoList annos69 = term.getAnnotations();
      x_114 = annos69;
      term = i_20.invoke(context, v_114);
      if(term == null)
        break Fail84;
      y_114 = term;
      term = j_20.invoke(context, w_114);
      if(term == null)
        break Fail84;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDoWhile_2, new IStrategoTerm[]{y_114, term}), checkListAnnos(termFactory, x_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}