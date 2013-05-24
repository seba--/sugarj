package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Anno$Cong_2_0 extends Strategy 
{ 
  public static $Anno$Cong_2_0 instance = new $Anno$Cong_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_343, Strategy p_343)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoCong_2_0");
    Fail908:
    { 
      IStrategoTerm g_449 = null;
      IStrategoTerm e_449 = null;
      IStrategoTerm f_449 = null;
      IStrategoTerm h_449 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consAnnoCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail908;
      e_449 = term.getSubterm(0);
      f_449 = term.getSubterm(1);
      IStrategoList annos154 = term.getAnnotations();
      g_449 = annos154;
      term = o_343.invoke(context, e_449);
      if(term == null)
        break Fail908;
      h_449 = term;
      term = p_343.invoke(context, f_449);
      if(term == null)
        break Fail908;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consAnnoCong_2, new IStrategoTerm[]{h_449, term}), checkListAnnos(termFactory, g_449));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}