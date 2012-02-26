package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Anno$Dec_2_0 extends Strategy 
{ 
  public static $Anno$Dec_2_0 instance = new $Anno$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_16, Strategy t_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoDec_2_0");
    Fail44:
    { 
      IStrategoTerm h_105 = null;
      IStrategoTerm f_105 = null;
      IStrategoTerm g_105 = null;
      IStrategoTerm i_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAnnoDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail44;
      f_105 = term.getSubterm(0);
      g_105 = term.getSubterm(1);
      IStrategoList annos32 = term.getAnnotations();
      h_105 = annos32;
      term = s_16.invoke(context, f_105);
      if(term == null)
        break Fail44;
      i_105 = term;
      term = t_16.invoke(context, g_105);
      if(term == null)
        break Fail44;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAnnoDec_2, new IStrategoTerm[]{i_105, term}), checkListAnnos(termFactory, h_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}