package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Eq_2_0 extends Strategy 
{ 
  public static $Eq_2_0 instance = new $Eq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_22, Strategy y_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Eq_2_0");
    Fail122:
    { 
      IStrategoTerm c_122 = null;
      IStrategoTerm a_122 = null;
      IStrategoTerm b_122 = null;
      IStrategoTerm d_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail122;
      a_122 = term.getSubterm(0);
      b_122 = term.getSubterm(1);
      IStrategoList annos104 = term.getAnnotations();
      c_122 = annos104;
      term = x_22.invoke(context, a_122);
      if(term == null)
        break Fail122;
      d_122 = term;
      term = y_22.invoke(context, b_122);
      if(term == null)
        break Fail122;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEq_2, new IStrategoTerm[]{d_122, term}), checkListAnnos(termFactory, c_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}