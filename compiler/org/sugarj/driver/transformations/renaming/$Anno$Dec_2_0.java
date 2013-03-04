package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Anno$Dec_2_0 extends Strategy 
{ 
  public static $Anno$Dec_2_0 instance = new $Anno$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_30, Strategy m_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoDec_2_0");
    Fail82:
    { 
      IStrategoTerm m_138 = null;
      IStrategoTerm k_138 = null;
      IStrategoTerm l_138 = null;
      IStrategoTerm n_138 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAnnoDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail82;
      k_138 = term.getSubterm(0);
      l_138 = term.getSubterm(1);
      IStrategoList annos58 = term.getAnnotations();
      m_138 = annos58;
      term = l_30.invoke(context, k_138);
      if(term == null)
        break Fail82;
      n_138 = term;
      term = m_30.invoke(context, l_138);
      if(term == null)
        break Fail82;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAnnoDec_2, new IStrategoTerm[]{n_138, term}), checkListAnnos(termFactory, m_138));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}