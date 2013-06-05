package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class imports_1_0 extends Strategy 
{ 
  public static imports_1_0 instance = new imports_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("imports_1_0");
    Fail213:
    { 
      IStrategoTerm n_137 = null;
      IStrategoTerm m_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consimports_1 != ((IStrategoAppl)term).getConstructor())
        break Fail213;
      m_137 = term.getSubterm(0);
      IStrategoList annos173 = term.getAnnotations();
      n_137 = annos173;
      term = v_26.invoke(context, m_137);
      if(term == null)
        break Fail213;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consimports_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}