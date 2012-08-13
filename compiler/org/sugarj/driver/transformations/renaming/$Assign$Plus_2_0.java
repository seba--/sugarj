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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_27, Strategy n_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignPlus_2_0");
    Fail159:
    { 
      IStrategoTerm b_135 = null;
      IStrategoTerm t_134 = null;
      IStrategoTerm z_134 = null;
      IStrategoTerm d_135 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignPlus_2 != ((IStrategoAppl)term).getConstructor())
        break Fail159;
      t_134 = term.getSubterm(0);
      z_134 = term.getSubterm(1);
      IStrategoList annos134 = term.getAnnotations();
      b_135 = annos134;
      term = m_27.invoke(context, t_134);
      if(term == null)
        break Fail159;
      d_135 = term;
      term = n_27.invoke(context, z_134);
      if(term == null)
        break Fail159;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignPlus_2, new IStrategoTerm[]{d_135, term}), checkListAnnos(termFactory, b_135));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}