package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Explode_2_0 extends Strategy 
{ 
  public static $Explode_2_0 instance = new $Explode_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_345, Strategy j_345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Explode_2_0");
    Fail938:
    { 
      IStrategoTerm x_453 = null;
      IStrategoTerm v_453 = null;
      IStrategoTerm w_453 = null;
      IStrategoTerm y_453 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consExplode_2 != ((IStrategoAppl)term).getConstructor())
        break Fail938;
      v_453 = term.getSubterm(0);
      w_453 = term.getSubterm(1);
      IStrategoList annos183 = term.getAnnotations();
      x_453 = annos183;
      term = i_345.invoke(context, v_453);
      if(term == null)
        break Fail938;
      y_453 = term;
      term = j_345.invoke(context, w_453);
      if(term == null)
        break Fail938;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consExplode_2, new IStrategoTerm[]{y_453, term}), checkListAnnos(termFactory, x_453));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}