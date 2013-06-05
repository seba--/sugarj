package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class char_class_1_0 extends Strategy 
{ 
  public static char_class_1_0 instance = new char_class_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("char_class_1_0");
    Fail179:
    { 
      IStrategoTerm k_130 = null;
      IStrategoTerm j_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conschar_class_1 != ((IStrategoAppl)term).getConstructor())
        break Fail179;
      j_130 = term.getSubterm(0);
      IStrategoList annos148 = term.getAnnotations();
      k_130 = annos148;
      term = m_25.invoke(context, j_130);
      if(term == null)
        break Fail179;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conschar_class_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}