package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Remain_2_0 extends Strategy 
{ 
  public static $Assign$Remain_2_0 instance = new $Assign$Remain_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_22, Strategy e_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignRemain_2_0");
    Fail112:
    { 
      IStrategoTerm p_119 = null;
      IStrategoTerm n_119 = null;
      IStrategoTerm o_119 = null;
      IStrategoTerm q_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignRemain_2 != ((IStrategoAppl)term).getConstructor())
        break Fail112;
      n_119 = term.getSubterm(0);
      o_119 = term.getSubterm(1);
      IStrategoList annos94 = term.getAnnotations();
      p_119 = annos94;
      term = d_22.invoke(context, n_119);
      if(term == null)
        break Fail112;
      q_119 = term;
      term = e_22.invoke(context, o_119);
      if(term == null)
        break Fail112;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignRemain_2, new IStrategoTerm[]{q_119, term}), checkListAnnos(termFactory, p_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}