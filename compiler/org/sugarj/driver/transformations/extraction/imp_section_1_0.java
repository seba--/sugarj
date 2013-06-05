package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class imp_section_1_0 extends Strategy 
{ 
  public static imp_section_1_0 instance = new imp_section_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("imp_section_1_0");
    Fail264:
    { 
      IStrategoTerm k_147 = null;
      IStrategoTerm j_147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consimp_section_1 != ((IStrategoAppl)term).getConstructor())
        break Fail264;
      j_147 = term.getSubterm(0);
      IStrategoList annos216 = term.getAnnotations();
      k_147 = annos216;
      term = d_29.invoke(context, j_147);
      if(term == null)
        break Fail264;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consimp_section_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_147));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}