package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Remain_2_0 extends Strategy 
{ 
  public static $Remain_2_0 instance = new $Remain_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_23, Strategy a_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Remain_2_0");
    Fail134:
    { 
      IStrategoTerm t_124 = null;
      IStrategoTerm q_124 = null;
      IStrategoTerm s_124 = null;
      IStrategoTerm u_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consRemain_2 != ((IStrategoAppl)term).getConstructor())
        break Fail134;
      q_124 = term.getSubterm(0);
      s_124 = term.getSubterm(1);
      IStrategoList annos114 = term.getAnnotations();
      t_124 = annos114;
      term = z_23.invoke(context, q_124);
      if(term == null)
        break Fail134;
      u_124 = term;
      term = a_24.invoke(context, s_124);
      if(term == null)
        break Fail134;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consRemain_2, new IStrategoTerm[]{u_124, term}), checkListAnnos(termFactory, t_124));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}