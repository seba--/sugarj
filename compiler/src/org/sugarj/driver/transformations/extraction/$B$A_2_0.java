package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $B$A_2_0 extends Strategy 
{ 
  public static $B$A_2_0 instance = new $B$A_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_22, Strategy g_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BA_2_0");
    Fail121:
    { 
      IStrategoTerm l_120 = null;
      IStrategoTerm j_120 = null;
      IStrategoTerm k_120 = null;
      IStrategoTerm m_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consBA_2 != ((IStrategoAppl)term).getConstructor())
        break Fail121;
      j_120 = term.getSubterm(0);
      k_120 = term.getSubterm(1);
      IStrategoList annos93 = term.getAnnotations();
      l_120 = annos93;
      term = f_22.invoke(context, j_120);
      if(term == null)
        break Fail121;
      m_120 = term;
      term = g_22.invoke(context, k_120);
      if(term == null)
        break Fail121;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consBA_2, new IStrategoTerm[]{m_120, term}), checkListAnnos(termFactory, l_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}