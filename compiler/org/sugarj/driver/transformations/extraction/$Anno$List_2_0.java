package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Anno$List_2_0 extends Strategy 
{ 
  public static $Anno$List_2_0 instance = new $Anno$List_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_24, Strategy j_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoList_2_0");
    Fail146:
    { 
      IStrategoTerm o_126 = null;
      IStrategoTerm m_126 = null;
      IStrategoTerm n_126 = null;
      IStrategoTerm p_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consAnnoList_2 != ((IStrategoAppl)term).getConstructor())
        break Fail146;
      m_126 = term.getSubterm(0);
      n_126 = term.getSubterm(1);
      IStrategoList annos119 = term.getAnnotations();
      o_126 = annos119;
      term = i_24.invoke(context, m_126);
      if(term == null)
        break Fail146;
      p_126 = term;
      term = j_24.invoke(context, n_126);
      if(term == null)
        break Fail146;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consAnnoList_2, new IStrategoTerm[]{p_126, term}), checkListAnnos(termFactory, o_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}