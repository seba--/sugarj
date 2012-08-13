package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Remain_2_0 extends Strategy 
{ 
  public static $Remain_2_0 instance = new $Remain_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_29, Strategy d_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Remain_2_0");
    Fail180:
    { 
      IStrategoTerm k_141 = null;
      IStrategoTerm f_141 = null;
      IStrategoTerm g_141 = null;
      IStrategoTerm l_141 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consRemain_2 != ((IStrategoAppl)term).getConstructor())
        break Fail180;
      f_141 = term.getSubterm(0);
      g_141 = term.getSubterm(1);
      IStrategoList annos155 = term.getAnnotations();
      k_141 = annos155;
      term = c_29.invoke(context, f_141);
      if(term == null)
        break Fail180;
      l_141 = term;
      term = d_29.invoke(context, g_141);
      if(term == null)
        break Fail180;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consRemain_2, new IStrategoTerm[]{l_141, term}), checkListAnnos(termFactory, k_141));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}