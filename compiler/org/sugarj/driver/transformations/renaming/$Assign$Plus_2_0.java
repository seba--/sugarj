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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_35, Strategy v_35)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignPlus_2_0");
    Fail149:
    { 
      IStrategoTerm k_158 = null;
      IStrategoTerm i_158 = null;
      IStrategoTerm j_158 = null;
      IStrategoTerm l_158 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAssignPlus_2 != ((IStrategoAppl)term).getConstructor())
        break Fail149;
      i_158 = term.getSubterm(0);
      j_158 = term.getSubterm(1);
      IStrategoList annos119 = term.getAnnotations();
      k_158 = annos119;
      term = u_35.invoke(context, i_158);
      if(term == null)
        break Fail149;
      l_158 = term;
      term = v_35.invoke(context, j_158);
      if(term == null)
        break Fail149;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAssignPlus_2, new IStrategoTerm[]{l_158, term}), checkListAnnos(termFactory, k_158));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}