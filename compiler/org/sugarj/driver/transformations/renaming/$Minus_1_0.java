package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Minus_1_0 extends Strategy 
{ 
  public static $Minus_1_0 instance = new $Minus_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Minus_1_0");
    Fail139:
    { 
      IStrategoTerm n_125 = null;
      IStrategoTerm m_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMinus_1 != ((IStrategoAppl)term).getConstructor())
        break Fail139;
      m_125 = term.getSubterm(0);
      IStrategoList annos124 = term.getAnnotations();
      n_125 = annos124;
      term = s_23.invoke(context, m_125);
      if(term == null)
        break Fail139;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMinus_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}