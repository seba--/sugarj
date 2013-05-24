package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fold$Rule_2_0 extends Strategy 
{ 
  public static $Fold$Rule_2_0 instance = new $Fold$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_337, Strategy o_337)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FoldRule_2_0");
    Fail813:
    { 
      IStrategoTerm y_433 = null;
      IStrategoTerm w_433 = null;
      IStrategoTerm x_433 = null;
      IStrategoTerm z_433 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consFoldRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail813;
      w_433 = term.getSubterm(0);
      x_433 = term.getSubterm(1);
      IStrategoList annos62 = term.getAnnotations();
      y_433 = annos62;
      term = n_337.invoke(context, w_433);
      if(term == null)
        break Fail813;
      z_433 = term;
      term = o_337.invoke(context, x_433);
      if(term == null)
        break Fail813;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consFoldRule_2, new IStrategoTerm[]{z_433, term}), checkListAnnos(termFactory, y_433));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}