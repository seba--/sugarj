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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_47, Strategy y_47)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortListTl_2_0");
    Fail356:
    { 
      IStrategoTerm o_195 = null;
      IStrategoTerm m_195 = null;
      IStrategoTerm n_195 = null;
      IStrategoTerm p_195 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSortListTl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail356;
      m_195 = term.getSubterm(0);
      n_195 = term.getSubterm(1);
      IStrategoList annos300 = term.getAnnotations();
      o_195 = annos300;
      term = x_47.invoke(context, m_195);
      if(term == null)
        break Fail356;
      p_195 = term;
      term = y_47.invoke(context, n_195);
      if(term == null)
        break Fail356;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSortListTl_2, new IStrategoTerm[]{p_195, term}), checkListAnnos(termFactory, o_195));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}