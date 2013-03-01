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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_35, Strategy x_35)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignRemain_2_0");
    Fail150:
    { 
      IStrategoTerm q_158 = null;
      IStrategoTerm o_158 = null;
      IStrategoTerm p_158 = null;
      IStrategoTerm s_158 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAssignRemain_2 != ((IStrategoAppl)term).getConstructor())
        break Fail150;
      o_158 = term.getSubterm(0);
      p_158 = term.getSubterm(1);
      IStrategoList annos120 = term.getAnnotations();
      q_158 = annos120;
      term = w_35.invoke(context, o_158);
      if(term == null)
        break Fail150;
      s_158 = term;
      term = x_35.invoke(context, p_158);
      if(term == null)
        break Fail150;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAssignRemain_2, new IStrategoTerm[]{s_158, term}), checkListAnnos(termFactory, q_158));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}