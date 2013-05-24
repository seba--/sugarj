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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_351, Strategy i_351)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("parameterized_2_0");
    Fail1053:
    { 
      IStrategoTerm o_469 = null;
      IStrategoTerm m_469 = null;
      IStrategoTerm n_469 = null;
      IStrategoTerm p_469 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consparameterized_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1053;
      m_469 = term.getSubterm(0);
      n_469 = term.getSubterm(1);
      IStrategoList annos280 = term.getAnnotations();
      o_469 = annos280;
      term = h_351.invoke(context, m_469);
      if(term == null)
        break Fail1053;
      p_469 = term;
      term = i_351.invoke(context, n_469);
      if(term == null)
        break Fail1053;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consparameterized_2, new IStrategoTerm[]{p_469, term}), checkListAnnos(termFactory, o_469));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}