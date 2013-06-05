package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort_2_0 extends Strategy 
{ 
  public static $Sort_2_0 instance = new $Sort_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_23, Strategy y_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Sort_2_0");
    Fail149:
    { 
      IStrategoTerm p_125 = null;
      IStrategoTerm n_125 = null;
      IStrategoTerm o_125 = null;
      IStrategoTerm q_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consSort_2 != ((IStrategoAppl)term).getConstructor())
        break Fail149;
      n_125 = term.getSubterm(0);
      o_125 = term.getSubterm(1);
      IStrategoList annos119 = term.getAnnotations();
      p_125 = annos119;
      term = x_23.invoke(context, n_125);
      if(term == null)
        break Fail149;
      q_125 = term;
      term = y_23.invoke(context, o_125);
      if(term == null)
        break Fail149;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consSort_2, new IStrategoTerm[]{q_125, term}), checkListAnnos(termFactory, p_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}