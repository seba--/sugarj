package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assert$Stm_2_0 extends Strategy 
{ 
  public static $Assert$Stm_2_0 instance = new $Assert$Stm_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_25, Strategy a_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssertStm_2_0");
    Fail135:
    { 
      IStrategoTerm g_128 = null;
      IStrategoTerm e_128 = null;
      IStrategoTerm f_128 = null;
      IStrategoTerm h_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssertStm_2 != ((IStrategoAppl)term).getConstructor())
        break Fail135;
      e_128 = term.getSubterm(0);
      f_128 = term.getSubterm(1);
      IStrategoList annos113 = term.getAnnotations();
      g_128 = annos113;
      term = z_25.invoke(context, e_128);
      if(term == null)
        break Fail135;
      h_128 = term;
      term = a_26.invoke(context, f_128);
      if(term == null)
        break Fail135;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssertStm_2, new IStrategoTerm[]{h_128, term}), checkListAnnos(termFactory, g_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}