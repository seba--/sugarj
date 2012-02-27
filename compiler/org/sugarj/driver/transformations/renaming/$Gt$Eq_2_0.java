package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Gt$Eq_2_0 extends Strategy 
{ 
  public static $Gt$Eq_2_0 instance = new $Gt$Eq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_23, Strategy i_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GtEq_2_0");
    Fail125:
    { 
      IStrategoTerm s_122 = null;
      IStrategoTerm q_122 = null;
      IStrategoTerm r_122 = null;
      IStrategoTerm t_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consGtEq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail125;
      q_122 = term.getSubterm(0);
      r_122 = term.getSubterm(1);
      IStrategoList annos105 = term.getAnnotations();
      s_122 = annos105;
      term = h_23.invoke(context, q_122);
      if(term == null)
        break Fail125;
      t_122 = term;
      term = i_23.invoke(context, r_122);
      if(term == null)
        break Fail125;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consGtEq_2, new IStrategoTerm[]{t_122, term}), checkListAnnos(termFactory, s_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}