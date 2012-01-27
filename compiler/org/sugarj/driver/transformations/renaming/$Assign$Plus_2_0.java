package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Plus_2_0 extends Strategy 
{ 
  public static $Assign$Plus_2_0 instance = new $Assign$Plus_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_21, Strategy n_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignPlus_2_0");
    Fail108:
    { 
      IStrategoTerm u_118 = null;
      IStrategoTerm s_118 = null;
      IStrategoTerm t_118 = null;
      IStrategoTerm v_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignPlus_2 != ((IStrategoAppl)term).getConstructor())
        break Fail108;
      s_118 = term.getSubterm(0);
      t_118 = term.getSubterm(1);
      IStrategoList annos93 = term.getAnnotations();
      u_118 = annos93;
      term = m_21.invoke(context, s_118);
      if(term == null)
        break Fail108;
      v_118 = term;
      term = n_21.invoke(context, t_118);
      if(term == null)
        break Fail108;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignPlus_2, new IStrategoTerm[]{v_118, term}), checkListAnnos(termFactory, u_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}