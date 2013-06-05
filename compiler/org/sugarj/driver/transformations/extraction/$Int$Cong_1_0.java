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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IntCong_1_0");
    Fail110:
    { 
      IStrategoTerm m_118 = null;
      IStrategoTerm l_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consIntCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail110;
      l_118 = term.getSubterm(0);
      IStrategoList annos82 = term.getAnnotations();
      m_118 = annos82;
      term = q_21.invoke(context, l_118);
      if(term == null)
        break Fail110;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consIntCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}