package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class union_2_0 extends Strategy 
{ 
  public static union_2_0 instance = new union_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_25, Strategy t_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("union_2_0");
    Fail173:
    { 
      IStrategoTerm h_131 = null;
      IStrategoTerm e_131 = null;
      IStrategoTerm g_131 = null;
      IStrategoTerm j_131 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consunion_2 != ((IStrategoAppl)term).getConstructor())
        break Fail173;
      e_131 = term.getSubterm(0);
      g_131 = term.getSubterm(1);
      IStrategoList annos145 = term.getAnnotations();
      h_131 = annos145;
      term = s_25.invoke(context, e_131);
      if(term == null)
        break Fail173;
      j_131 = term;
      term = t_25.invoke(context, g_131);
      if(term == null)
        break Fail173;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consunion_2, new IStrategoTerm[]{j_131, term}), checkListAnnos(termFactory, h_131));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}