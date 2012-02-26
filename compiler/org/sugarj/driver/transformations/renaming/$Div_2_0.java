package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Div_2_0 extends Strategy 
{ 
  public static $Div_2_0 instance = new $Div_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_23, Strategy u_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Div_2_0");
    Fail133:
    { 
      IStrategoTerm p_124 = null;
      IStrategoTerm n_124 = null;
      IStrategoTerm o_124 = null;
      IStrategoTerm q_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDiv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail133;
      n_124 = term.getSubterm(0);
      o_124 = term.getSubterm(1);
      IStrategoList annos115 = term.getAnnotations();
      p_124 = annos115;
      term = t_23.invoke(context, n_124);
      if(term == null)
        break Fail133;
      q_124 = term;
      term = u_23.invoke(context, o_124);
      if(term == null)
        break Fail133;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDiv_2, new IStrategoTerm[]{q_124, term}), checkListAnnos(termFactory, p_124));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}