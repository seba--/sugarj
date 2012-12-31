package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_17, Strategy l_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortListTl_2_0");
    Fail118:
    { 
      IStrategoTerm g_111 = null;
      IStrategoTerm e_111 = null;
      IStrategoTerm f_111 = null;
      IStrategoTerm h_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSortListTl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail118;
      e_111 = term.getSubterm(0);
      f_111 = term.getSubterm(1);
      IStrategoList annos109 = term.getAnnotations();
      g_111 = annos109;
      term = k_17.invoke(context, e_111);
      if(term == null)
        break Fail118;
      h_111 = term;
      term = l_17.invoke(context, f_111);
      if(term == null)
        break Fail118;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSortListTl_2, new IStrategoTerm[]{h_111, term}), checkListAnnos(termFactory, g_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}