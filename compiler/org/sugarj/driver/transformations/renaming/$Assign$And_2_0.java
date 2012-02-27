package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$And_2_0 extends Strategy 
{ 
  public static $Assign$And_2_0 instance = new $Assign$And_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_21, Strategy a_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignAnd_2_0");
    Fail108:
    { 
      IStrategoTerm t_118 = null;
      IStrategoTerm r_118 = null;
      IStrategoTerm s_118 = null;
      IStrategoTerm u_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignAnd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail108;
      r_118 = term.getSubterm(0);
      s_118 = term.getSubterm(1);
      IStrategoList annos88 = term.getAnnotations();
      t_118 = annos88;
      term = z_21.invoke(context, r_118);
      if(term == null)
        break Fail108;
      u_118 = term;
      term = a_22.invoke(context, s_118);
      if(term == null)
        break Fail108;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignAnd_2, new IStrategoTerm[]{u_118, term}), checkListAnnos(termFactory, t_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}