package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class int_1_0 extends Strategy 
{ 
  public static int_1_0 instance = new int_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_352)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("int_1_0");
    Fail1069:
    { 
      IStrategoTerm n_471 = null;
      IStrategoTerm m_471 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consint_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1069;
      m_471 = term.getSubterm(0);
      IStrategoList annos294 = term.getAnnotations();
      n_471 = annos294;
      term = a_352.invoke(context, m_471);
      if(term == null)
        break Fail1069;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consint_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_471));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}