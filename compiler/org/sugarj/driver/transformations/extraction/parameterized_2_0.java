package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class parameterized_2_0 extends Strategy 
{ 
  public static parameterized_2_0 instance = new parameterized_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_26, Strategy x_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("parameterized_2_0");
    Fail214:
    { 
      IStrategoTerm r_137 = null;
      IStrategoTerm p_137 = null;
      IStrategoTerm q_137 = null;
      IStrategoTerm s_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consparameterized_2 != ((IStrategoAppl)term).getConstructor())
        break Fail214;
      p_137 = term.getSubterm(0);
      q_137 = term.getSubterm(1);
      IStrategoList annos174 = term.getAnnotations();
      r_137 = annos174;
      term = w_26.invoke(context, p_137);
      if(term == null)
        break Fail214;
      s_137 = term;
      term = x_26.invoke(context, q_137);
      if(term == null)
        break Fail214;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consparameterized_2, new IStrategoTerm[]{s_137, term}), checkListAnnos(termFactory, r_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}