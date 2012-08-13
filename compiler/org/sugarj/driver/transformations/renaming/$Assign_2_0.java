package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign_2_0 extends Strategy 
{ 
  public static $Assign_2_0 instance = new $Assign_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_27, Strategy v_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Assign_2_0");
    Fail163:
    { 
      IStrategoTerm p_136 = null;
      IStrategoTerm n_136 = null;
      IStrategoTerm o_136 = null;
      IStrategoTerm q_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail163;
      n_136 = term.getSubterm(0);
      o_136 = term.getSubterm(1);
      IStrategoList annos138 = term.getAnnotations();
      p_136 = annos138;
      term = u_27.invoke(context, n_136);
      if(term == null)
        break Fail163;
      q_136 = term;
      term = v_27.invoke(context, o_136);
      if(term == null)
        break Fail163;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssign_2, new IStrategoTerm[]{q_136, term}), checkListAnnos(termFactory, p_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}