package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class present_1_0 extends Strategy 
{ 
  public static present_1_0 instance = new present_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_349)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("present_1_0");
    Fail1017:
    { 
      IStrategoTerm s_464 = null;
      IStrategoTerm r_464 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conspresent_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1017;
      r_464 = term.getSubterm(0);
      IStrategoList annos249 = term.getAnnotations();
      s_464 = annos249;
      term = m_349.invoke(context, r_464);
      if(term == null)
        break Fail1017;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conspresent_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_464));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}