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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_34, Strategy c_34)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DoWhile_2_0");
    Fail122:
    { 
      IStrategoTerm x_150 = null;
      IStrategoTerm v_150 = null;
      IStrategoTerm w_150 = null;
      IStrategoTerm y_150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDoWhile_2 != ((IStrategoAppl)term).getConstructor())
        break Fail122;
      v_150 = term.getSubterm(0);
      w_150 = term.getSubterm(1);
      IStrategoList annos95 = term.getAnnotations();
      x_150 = annos95;
      term = b_34.invoke(context, v_150);
      if(term == null)
        break Fail122;
      y_150 = term;
      term = c_34.invoke(context, w_150);
      if(term == null)
        break Fail122;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDoWhile_2, new IStrategoTerm[]{y_150, term}), checkListAnnos(termFactory, x_150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}