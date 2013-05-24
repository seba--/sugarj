package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Choice_2_0 extends Strategy 
{ 
  public static $Choice_2_0 instance = new $Choice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_344, Strategy c_344)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Choice_2_0");
    Fail918:
    { 
      IStrategoTerm p_450 = null;
      IStrategoTerm n_450 = null;
      IStrategoTerm o_450 = null;
      IStrategoTerm q_450 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail918;
      n_450 = term.getSubterm(0);
      o_450 = term.getSubterm(1);
      IStrategoList annos163 = term.getAnnotations();
      p_450 = annos163;
      term = b_344.invoke(context, n_450);
      if(term == null)
        break Fail918;
      q_450 = term;
      term = c_344.invoke(context, o_450);
      if(term == null)
        break Fail918;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consChoice_2, new IStrategoTerm[]{q_450, term}), checkListAnnos(termFactory, p_450));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}