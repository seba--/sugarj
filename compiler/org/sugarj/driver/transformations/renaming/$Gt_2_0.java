package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Gt_2_0 extends Strategy 
{ 
  public static $Gt_2_0 instance = new $Gt_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_23, Strategy e_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Gt_2_0");
    Fail125:
    { 
      IStrategoTerm u_122 = null;
      IStrategoTerm s_122 = null;
      IStrategoTerm t_122 = null;
      IStrategoTerm v_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consGt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail125;
      s_122 = term.getSubterm(0);
      t_122 = term.getSubterm(1);
      IStrategoList annos107 = term.getAnnotations();
      u_122 = annos107;
      term = d_23.invoke(context, s_122);
      if(term == null)
        break Fail125;
      v_122 = term;
      term = e_23.invoke(context, t_122);
      if(term == null)
        break Fail125;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consGt_2, new IStrategoTerm[]{v_122, term}), checkListAnnos(termFactory, u_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}