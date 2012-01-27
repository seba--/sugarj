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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_19, Strategy u_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DoWhile_2_0");
    Fail81:
    { 
      IStrategoTerm e_114 = null;
      IStrategoTerm c_114 = null;
      IStrategoTerm d_114 = null;
      IStrategoTerm f_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDoWhile_2 != ((IStrategoAppl)term).getConstructor())
        break Fail81;
      c_114 = term.getSubterm(0);
      d_114 = term.getSubterm(1);
      IStrategoList annos69 = term.getAnnotations();
      e_114 = annos69;
      term = t_19.invoke(context, c_114);
      if(term == null)
        break Fail81;
      f_114 = term;
      term = u_19.invoke(context, d_114);
      if(term == null)
        break Fail81;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDoWhile_2, new IStrategoTerm[]{f_114, term}), checkListAnnos(termFactory, e_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}