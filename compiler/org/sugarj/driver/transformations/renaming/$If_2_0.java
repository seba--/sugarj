package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $If_2_0 extends Strategy 
{ 
  public static $If_2_0 instance = new $If_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_26, Strategy g_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("If_2_0");
    Fail138:
    { 
      IStrategoTerm x_128 = null;
      IStrategoTerm v_128 = null;
      IStrategoTerm w_128 = null;
      IStrategoTerm y_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consIf_2 != ((IStrategoAppl)term).getConstructor())
        break Fail138;
      v_128 = term.getSubterm(0);
      w_128 = term.getSubterm(1);
      IStrategoList annos116 = term.getAnnotations();
      x_128 = annos116;
      term = f_26.invoke(context, v_128);
      if(term == null)
        break Fail138;
      y_128 = term;
      term = g_26.invoke(context, w_128);
      if(term == null)
        break Fail138;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consIf_2, new IStrategoTerm[]{y_128, term}), checkListAnnos(termFactory, x_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}