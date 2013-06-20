package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class priorities_1_0 extends Strategy 
{ 
  public static priorities_1_0 instance = new priorities_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("priorities_1_0");
    Fail264:
    { 
      IStrategoTerm m_147 = null;
      IStrategoTerm l_147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conspriorities_1 != ((IStrategoAppl)term).getConstructor())
        break Fail264;
      l_147 = term.getSubterm(0);
      IStrategoList annos216 = term.getAnnotations();
      m_147 = annos216;
      term = e_29.invoke(context, l_147);
      if(term == null)
        break Fail264;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conspriorities_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_147));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}