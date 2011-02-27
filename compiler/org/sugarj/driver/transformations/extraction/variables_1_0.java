package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class variables_1_0 extends Strategy 
{ 
  public static variables_1_0 instance = new variables_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("variables_1_0");
    Fail254:
    { 
      IStrategoTerm r_147 = null;
      IStrategoTerm m_147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consvariables_1 != ((IStrategoAppl)term).getConstructor())
        break Fail254;
      m_147 = term.getSubterm(0);
      IStrategoList annos210 = term.getAnnotations();
      r_147 = annos210;
      term = g_29.invoke(context, m_147);
      if(term == null)
        break Fail254;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consvariables_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_147));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}