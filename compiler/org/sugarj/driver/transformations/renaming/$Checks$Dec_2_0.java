package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Checks$Dec_2_0 extends Strategy 
{ 
  public static $Checks$Dec_2_0 instance = new $Checks$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_27, Strategy k_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ChecksDec_2_0");
    Fail38:
    { 
      IStrategoTerm n_126 = null;
      IStrategoTerm l_126 = null;
      IStrategoTerm m_126 = null;
      IStrategoTerm o_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consChecksDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail38;
      l_126 = term.getSubterm(0);
      m_126 = term.getSubterm(1);
      IStrategoList annos15 = term.getAnnotations();
      n_126 = annos15;
      term = j_27.invoke(context, l_126);
      if(term == null)
        break Fail38;
      o_126 = term;
      term = k_27.invoke(context, m_126);
      if(term == null)
        break Fail38;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consChecksDec_2, new IStrategoTerm[]{o_126, term}), checkListAnnos(termFactory, n_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}