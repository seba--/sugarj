package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Array$Var$Dec$Id_2_0 extends Strategy 
{ 
  public static $Array$Var$Dec$Id_2_0 instance = new $Array$Var$Dec$Id_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_20, Strategy p_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ArrayVarDecId_2_0");
    Fail94:
    { 
      IStrategoTerm l_116 = null;
      IStrategoTerm j_116 = null;
      IStrategoTerm k_116 = null;
      IStrategoTerm m_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consArrayVarDecId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail94;
      j_116 = term.getSubterm(0);
      k_116 = term.getSubterm(1);
      IStrategoList annos80 = term.getAnnotations();
      l_116 = annos80;
      term = o_20.invoke(context, j_116);
      if(term == null)
        break Fail94;
      m_116 = term;
      term = p_20.invoke(context, k_116);
      if(term == null)
        break Fail94;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consArrayVarDecId_2, new IStrategoTerm[]{m_116, term}), checkListAnnos(termFactory, l_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}