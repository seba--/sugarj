package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Do$While_2_0 extends Strategy 
{ 
  public static $Do$While_2_0 instance = new $Do$While_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_20, Strategy r_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DoWhile_2_0");
    Fail86:
    { 
      IStrategoTerm h_115 = null;
      IStrategoTerm f_115 = null;
      IStrategoTerm g_115 = null;
      IStrategoTerm i_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDoWhile_2 != ((IStrategoAppl)term).getConstructor())
        break Fail86;
      f_115 = term.getSubterm(0);
      g_115 = term.getSubterm(1);
      IStrategoList annos69 = term.getAnnotations();
      h_115 = annos69;
      term = q_20.invoke(context, f_115);
      if(term == null)
        break Fail86;
      i_115 = term;
      term = r_20.invoke(context, g_115);
      if(term == null)
        break Fail86;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDoWhile_2, new IStrategoTerm[]{i_115, term}), checkListAnnos(termFactory, h_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}