package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort$List$Tl_2_0 extends Strategy 
{ 
  public static $Sort$List$Tl_2_0 instance = new $Sort$List$Tl_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_17, Strategy q_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortListTl_2_0");
    Fail121:
    { 
      IStrategoTerm l_111 = null;
      IStrategoTerm j_111 = null;
      IStrategoTerm k_111 = null;
      IStrategoTerm m_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSortListTl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail121;
      j_111 = term.getSubterm(0);
      k_111 = term.getSubterm(1);
      IStrategoList annos109 = term.getAnnotations();
      l_111 = annos109;
      term = p_17.invoke(context, j_111);
      if(term == null)
        break Fail121;
      m_111 = term;
      term = q_17.invoke(context, k_111);
      if(term == null)
        break Fail121;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSortListTl_2, new IStrategoTerm[]{m_111, term}), checkListAnnos(termFactory, l_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}