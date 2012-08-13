package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lit_1_0 extends Strategy 
{ 
  public static $Lit_1_0 instance = new $Lit_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Lit_1_0");
    Fail199:
    { 
      IStrategoTerm m_146 = null;
      IStrategoTerm k_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail199;
      k_146 = term.getSubterm(0);
      IStrategoList annos173 = term.getAnnotations();
      m_146 = annos173;
      term = j_30.invoke(context, k_146);
      if(term == null)
        break Fail199;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}