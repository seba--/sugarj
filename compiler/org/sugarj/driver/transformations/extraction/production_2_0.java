package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class production_2_0 extends Strategy 
{ 
  public static production_2_0 instance = new production_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_27, Strategy g_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("production_2_0");
    Fail207:
    { 
      IStrategoTerm m_138 = null;
      IStrategoTerm k_138 = null;
      IStrategoTerm l_138 = null;
      IStrategoTerm n_138 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consproduction_2 != ((IStrategoAppl)term).getConstructor())
        break Fail207;
      k_138 = term.getSubterm(0);
      l_138 = term.getSubterm(1);
      IStrategoList annos171 = term.getAnnotations();
      m_138 = annos171;
      term = f_27.invoke(context, k_138);
      if(term == null)
        break Fail207;
      n_138 = term;
      term = g_27.invoke(context, l_138);
      if(term == null)
        break Fail207;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consproduction_2, new IStrategoTerm[]{n_138, term}), checkListAnnos(termFactory, m_138));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}