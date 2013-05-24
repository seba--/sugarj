package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class tuple_2_0 extends Strategy 
{ 
  public static tuple_2_0 instance = new tuple_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_350, Strategy r_350)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("tuple_2_0");
    Fail1043:
    { 
      IStrategoTerm w_467 = null;
      IStrategoTerm u_467 = null;
      IStrategoTerm v_467 = null;
      IStrategoTerm x_467 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._constuple_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1043;
      u_467 = term.getSubterm(0);
      v_467 = term.getSubterm(1);
      IStrategoList annos270 = term.getAnnotations();
      w_467 = annos270;
      term = q_350.invoke(context, u_467);
      if(term == null)
        break Fail1043;
      x_467 = term;
      term = r_350.invoke(context, v_467);
      if(term == null)
        break Fail1043;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._constuple_2, new IStrategoTerm[]{x_467, term}), checkListAnnos(termFactory, w_467));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}