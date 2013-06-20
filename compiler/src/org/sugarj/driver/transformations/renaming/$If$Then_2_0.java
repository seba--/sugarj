package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $If$Then_2_0 extends Strategy 
{ 
  public static $If$Then_2_0 instance = new $If$Then_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_14, Strategy n_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IfThen_2_0");
    Fail68:
    { 
      IStrategoTerm n_102 = null;
      IStrategoTerm l_102 = null;
      IStrategoTerm m_102 = null;
      IStrategoTerm o_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consIfThen_2 != ((IStrategoAppl)term).getConstructor())
        break Fail68;
      l_102 = term.getSubterm(0);
      m_102 = term.getSubterm(1);
      IStrategoList annos59 = term.getAnnotations();
      n_102 = annos59;
      term = m_14.invoke(context, l_102);
      if(term == null)
        break Fail68;
      o_102 = term;
      term = n_14.invoke(context, m_102);
      if(term == null)
        break Fail68;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consIfThen_2, new IStrategoTerm[]{o_102, term}), checkListAnnos(termFactory, n_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}