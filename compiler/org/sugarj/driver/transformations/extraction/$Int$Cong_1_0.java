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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_343)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IntCong_1_0");
    Fail904:
    { 
      IStrategoTerm r_448 = null;
      IStrategoTerm q_448 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consIntCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail904;
      q_448 = term.getSubterm(0);
      IStrategoList annos150 = term.getAnnotations();
      r_448 = annos150;
      term = j_343.invoke(context, q_448);
      if(term == null)
        break Fail904;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consIntCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_448));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}