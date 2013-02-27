package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Dec_2_0 extends Strategy 
{ 
  public static $R$Dec_2_0 instance = new $R$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_10, Strategy b_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDec_2_0");
    Fail12:
    { 
      IStrategoTerm l_89 = null;
      IStrategoTerm j_89 = null;
      IStrategoTerm k_89 = null;
      IStrategoTerm m_89 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail12;
      j_89 = term.getSubterm(0);
      k_89 = term.getSubterm(1);
      IStrategoList annos2 = term.getAnnotations();
      l_89 = annos2;
      term = a_10.invoke(context, j_89);
      if(term == null)
        break Fail12;
      m_89 = term;
      term = b_10.invoke(context, k_89);
      if(term == null)
        break Fail12;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDec_2, new IStrategoTerm[]{m_89, term}), checkListAnnos(termFactory, l_89));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}