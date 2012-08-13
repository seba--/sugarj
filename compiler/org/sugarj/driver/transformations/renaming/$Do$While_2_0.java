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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_25, Strategy u_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DoWhile_2_0");
    Fail132:
    { 
      IStrategoTerm r_127 = null;
      IStrategoTerm p_127 = null;
      IStrategoTerm q_127 = null;
      IStrategoTerm s_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDoWhile_2 != ((IStrategoAppl)term).getConstructor())
        break Fail132;
      p_127 = term.getSubterm(0);
      q_127 = term.getSubterm(1);
      IStrategoList annos110 = term.getAnnotations();
      r_127 = annos110;
      term = t_25.invoke(context, p_127);
      if(term == null)
        break Fail132;
      s_127 = term;
      term = u_25.invoke(context, q_127);
      if(term == null)
        break Fail132;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDoWhile_2, new IStrategoTerm[]{s_127, term}), checkListAnnos(termFactory, r_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}