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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("present_1_0");
    Fail178:
    { 
      IStrategoTerm o_132 = null;
      IStrategoTerm m_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conspresent_1 != ((IStrategoAppl)term).getConstructor())
        break Fail178;
      m_132 = term.getSubterm(0);
      IStrategoList annos150 = term.getAnnotations();
      o_132 = annos150;
      term = a_26.invoke(context, m_132);
      if(term == null)
        break Fail178;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conspresent_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}