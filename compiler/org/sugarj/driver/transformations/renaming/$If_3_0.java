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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_20, Strategy a_21, Strategy b_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("If_3_0");
    Fail91:
    { 
      IStrategoTerm g_116 = null;
      IStrategoTerm d_116 = null;
      IStrategoTerm e_116 = null;
      IStrategoTerm f_116 = null;
      IStrategoTerm h_116 = null;
      IStrategoTerm i_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consIf_3 != ((IStrategoAppl)term).getConstructor())
        break Fail91;
      d_116 = term.getSubterm(0);
      e_116 = term.getSubterm(1);
      f_116 = term.getSubterm(2);
      IStrategoList annos74 = term.getAnnotations();
      g_116 = annos74;
      term = z_20.invoke(context, d_116);
      if(term == null)
        break Fail91;
      h_116 = term;
      term = a_21.invoke(context, e_116);
      if(term == null)
        break Fail91;
      i_116 = term;
      term = b_21.invoke(context, f_116);
      if(term == null)
        break Fail91;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consIf_3, new IStrategoTerm[]{h_116, i_116, term}), checkListAnnos(termFactory, g_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}