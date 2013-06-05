package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Real$Cong_1_0 extends Strategy 
{ 
  public static $Real$Cong_1_0 instance = new $Real$Cong_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RealCong_1_0");
    Fail109:
    { 
      IStrategoTerm j_118 = null;
      IStrategoTerm i_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consRealCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail109;
      i_118 = term.getSubterm(0);
      IStrategoList annos81 = term.getAnnotations();
      j_118 = annos81;
      term = p_21.invoke(context, i_118);
      if(term == null)
        break Fail109;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consRealCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}