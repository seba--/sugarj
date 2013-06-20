package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Int$Cong_1_0 extends Strategy 
{ 
  public static $Int$Cong_1_0 instance = new $Int$Cong_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IntCong_1_0");
    Fail111:
    { 
      IStrategoTerm r_118 = null;
      IStrategoTerm q_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consIntCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail111;
      q_118 = term.getSubterm(0);
      IStrategoList annos83 = term.getAnnotations();
      r_118 = annos83;
      term = s_21.invoke(context, q_118);
      if(term == null)
        break Fail111;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consIntCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}