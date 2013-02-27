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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_17, Strategy n_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortListTl_2_0");
    Fail122:
    { 
      IStrategoTerm i_111 = null;
      IStrategoTerm g_111 = null;
      IStrategoTerm h_111 = null;
      IStrategoTerm j_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSortListTl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail122;
      g_111 = term.getSubterm(0);
      h_111 = term.getSubterm(1);
      IStrategoList annos109 = term.getAnnotations();
      i_111 = annos109;
      term = m_17.invoke(context, g_111);
      if(term == null)
        break Fail122;
      j_111 = term;
      term = n_17.invoke(context, h_111);
      if(term == null)
        break Fail122;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSortListTl_2, new IStrategoTerm[]{j_111, term}), checkListAnnos(termFactory, i_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}