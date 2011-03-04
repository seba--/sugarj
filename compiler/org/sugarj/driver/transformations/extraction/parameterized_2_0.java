package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class parameterized_2_0 extends Strategy 
{ 
  public static parameterized_2_0 instance = new parameterized_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_26, Strategy y_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("parameterized_2_0");
    Fail203:
    { 
      IStrategoTerm o_137 = null;
      IStrategoTerm m_137 = null;
      IStrategoTerm n_137 = null;
      IStrategoTerm p_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consparameterized_2 != ((IStrategoAppl)term).getConstructor())
        break Fail203;
      m_137 = term.getSubterm(0);
      n_137 = term.getSubterm(1);
      IStrategoList annos166 = term.getAnnotations();
      o_137 = annos166;
      term = x_26.invoke(context, m_137);
      if(term == null)
        break Fail203;
      p_137 = term;
      term = y_26.invoke(context, n_137);
      if(term == null)
        break Fail203;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consparameterized_2, new IStrategoTerm[]{p_137, term}), checkListAnnos(termFactory, o_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}