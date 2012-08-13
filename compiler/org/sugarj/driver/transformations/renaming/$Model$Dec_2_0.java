package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Model$Dec_2_0 extends Strategy 
{ 
  public static $Model$Dec_2_0 instance = new $Model$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_19, Strategy n_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ModelDec_2_0");
    Fail55:
    { 
      IStrategoTerm l_110 = null;
      IStrategoTerm j_110 = null;
      IStrategoTerm k_110 = null;
      IStrategoTerm m_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consModelDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail55;
      j_110 = term.getSubterm(0);
      k_110 = term.getSubterm(1);
      IStrategoList annos37 = term.getAnnotations();
      l_110 = annos37;
      term = m_19.invoke(context, j_110);
      if(term == null)
        break Fail55;
      m_110 = term;
      term = n_19.invoke(context, k_110);
      if(term == null)
        break Fail55;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consModelDec_2, new IStrategoTerm[]{m_110, term}), checkListAnnos(termFactory, l_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}