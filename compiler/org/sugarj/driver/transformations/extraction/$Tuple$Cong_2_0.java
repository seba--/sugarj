package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Tuple$Cong_2_0 extends Strategy 
{ 
  public static $Tuple$Cong_2_0 instance = new $Tuple$Cong_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_343, Strategy s_343)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TupleCong_2_0");
    Fail911:
    { 
      IStrategoTerm o_449 = null;
      IStrategoTerm m_449 = null;
      IStrategoTerm n_449 = null;
      IStrategoTerm p_449 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consTupleCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail911;
      m_449 = term.getSubterm(0);
      n_449 = term.getSubterm(1);
      IStrategoList annos156 = term.getAnnotations();
      o_449 = annos156;
      term = r_343.invoke(context, m_449);
      if(term == null)
        break Fail911;
      p_449 = term;
      term = s_343.invoke(context, n_449);
      if(term == null)
        break Fail911;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consTupleCong_2, new IStrategoTerm[]{p_449, term}), checkListAnnos(termFactory, o_449));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}