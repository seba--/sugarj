package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $If_3_0 extends Strategy 
{ 
  public static $If_3_0 instance = new $If_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_20, Strategy d_20, Strategy e_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("If_3_0");
    Fail86:
    { 
      IStrategoTerm h_115 = null;
      IStrategoTerm e_115 = null;
      IStrategoTerm f_115 = null;
      IStrategoTerm g_115 = null;
      IStrategoTerm i_115 = null;
      IStrategoTerm j_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consIf_3 != ((IStrategoAppl)term).getConstructor())
        break Fail86;
      e_115 = term.getSubterm(0);
      f_115 = term.getSubterm(1);
      g_115 = term.getSubterm(2);
      IStrategoList annos74 = term.getAnnotations();
      h_115 = annos74;
      term = c_20.invoke(context, e_115);
      if(term == null)
        break Fail86;
      i_115 = term;
      term = d_20.invoke(context, f_115);
      if(term == null)
        break Fail86;
      j_115 = term;
      term = e_20.invoke(context, g_115);
      if(term == null)
        break Fail86;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consIf_3, new IStrategoTerm[]{i_115, j_115, term}), checkListAnnos(termFactory, h_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}