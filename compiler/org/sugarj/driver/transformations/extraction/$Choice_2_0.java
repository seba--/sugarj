package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Choice_2_0 extends Strategy 
{ 
  public static $Choice_2_0 instance = new $Choice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_20, Strategy a_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Choice_2_0");
    Fail85:
    { 
      IStrategoTerm o_116 = null;
      IStrategoTerm m_116 = null;
      IStrategoTerm n_116 = null;
      IStrategoTerm p_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail85;
      m_116 = term.getSubterm(0);
      n_116 = term.getSubterm(1);
      IStrategoList annos62 = term.getAnnotations();
      o_116 = annos62;
      term = z_20.invoke(context, m_116);
      if(term == null)
        break Fail85;
      p_116 = term;
      term = a_21.invoke(context, n_116);
      if(term == null)
        break Fail85;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consChoice_2, new IStrategoTerm[]{p_116, term}), checkListAnnos(termFactory, o_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}