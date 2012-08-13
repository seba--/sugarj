package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Not$Eq_2_0 extends Strategy 
{ 
  public static $Not$Eq_2_0 instance = new $Not$Eq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_28, Strategy h_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NotEq_2_0");
    Fail169:
    { 
      IStrategoTerm x_137 = null;
      IStrategoTerm v_137 = null;
      IStrategoTerm w_137 = null;
      IStrategoTerm y_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNotEq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail169;
      v_137 = term.getSubterm(0);
      w_137 = term.getSubterm(1);
      IStrategoList annos144 = term.getAnnotations();
      x_137 = annos144;
      term = g_28.invoke(context, v_137);
      if(term == null)
        break Fail169;
      y_137 = term;
      term = h_28.invoke(context, w_137);
      if(term == null)
        break Fail169;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNotEq_2, new IStrategoTerm[]{y_137, term}), checkListAnnos(termFactory, x_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}