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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IntCong_1_0");
    Fail99:
    { 
      IStrategoTerm j_118 = null;
      IStrategoTerm i_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consIntCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail99;
      i_118 = term.getSubterm(0);
      IStrategoList annos74 = term.getAnnotations();
      j_118 = annos74;
      term = r_21.invoke(context, i_118);
      if(term == null)
        break Fail99;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consIntCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}