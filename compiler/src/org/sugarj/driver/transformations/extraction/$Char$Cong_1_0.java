package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Char$Cong_1_0 extends Strategy 
{ 
  public static $Char$Cong_1_0 instance = new $Char$Cong_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CharCong_1_0");
    Fail109:
    { 
      IStrategoTerm l_118 = null;
      IStrategoTerm k_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consCharCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail109;
      k_118 = term.getSubterm(0);
      IStrategoList annos81 = term.getAnnotations();
      l_118 = annos81;
      term = q_21.invoke(context, k_118);
      if(term == null)
        break Fail109;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consCharCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}