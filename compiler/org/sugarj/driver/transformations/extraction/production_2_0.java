package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class production_2_0 extends Strategy 
{ 
  public static production_2_0 instance = new production_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_27, Strategy f_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("production_2_0");
    Fail219:
    { 
      IStrategoTerm p_138 = null;
      IStrategoTerm n_138 = null;
      IStrategoTerm o_138 = null;
      IStrategoTerm q_138 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consproduction_2 != ((IStrategoAppl)term).getConstructor())
        break Fail219;
      n_138 = term.getSubterm(0);
      o_138 = term.getSubterm(1);
      IStrategoList annos179 = term.getAnnotations();
      p_138 = annos179;
      term = e_27.invoke(context, n_138);
      if(term == null)
        break Fail219;
      q_138 = term;
      term = f_27.invoke(context, o_138);
      if(term == null)
        break Fail219;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consproduction_2, new IStrategoTerm[]{q_138, term}), checkListAnnos(termFactory, p_138));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}