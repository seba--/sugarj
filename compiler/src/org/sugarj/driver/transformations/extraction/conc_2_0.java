package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class conc_2_0 extends Strategy 
{ 
  public static conc_2_0 instance = new conc_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_26, Strategy d_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("conc_2_0");
    Fail192:
    { 
      IStrategoTerm o_133 = null;
      IStrategoTerm m_133 = null;
      IStrategoTerm n_133 = null;
      IStrategoTerm p_133 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consconc_2 != ((IStrategoAppl)term).getConstructor())
        break Fail192;
      m_133 = term.getSubterm(0);
      n_133 = term.getSubterm(1);
      IStrategoList annos160 = term.getAnnotations();
      o_133 = annos160;
      term = c_26.invoke(context, m_133);
      if(term == null)
        break Fail192;
      p_133 = term;
      term = d_26.invoke(context, n_133);
      if(term == null)
        break Fail192;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consconc_2, new IStrategoTerm[]{p_133, term}), checkListAnnos(termFactory, o_133));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}