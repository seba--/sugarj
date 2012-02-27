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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_22, Strategy k_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignPlus_2_0");
    Fail113:
    { 
      IStrategoTerm t_119 = null;
      IStrategoTerm q_119 = null;
      IStrategoTerm r_119 = null;
      IStrategoTerm u_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignPlus_2 != ((IStrategoAppl)term).getConstructor())
        break Fail113;
      q_119 = term.getSubterm(0);
      r_119 = term.getSubterm(1);
      IStrategoList annos93 = term.getAnnotations();
      t_119 = annos93;
      term = j_22.invoke(context, q_119);
      if(term == null)
        break Fail113;
      u_119 = term;
      term = k_22.invoke(context, r_119);
      if(term == null)
        break Fail113;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignPlus_2, new IStrategoTerm[]{u_119, term}), checkListAnnos(termFactory, t_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}