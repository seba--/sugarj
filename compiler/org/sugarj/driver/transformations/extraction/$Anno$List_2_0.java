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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_24, Strategy i_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoList_2_0");
    Fail158:
    { 
      IStrategoTerm r_126 = null;
      IStrategoTerm p_126 = null;
      IStrategoTerm q_126 = null;
      IStrategoTerm s_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consAnnoList_2 != ((IStrategoAppl)term).getConstructor())
        break Fail158;
      p_126 = term.getSubterm(0);
      q_126 = term.getSubterm(1);
      IStrategoList annos127 = term.getAnnotations();
      r_126 = annos127;
      term = h_24.invoke(context, p_126);
      if(term == null)
        break Fail158;
      s_126 = term;
      term = i_24.invoke(context, q_126);
      if(term == null)
        break Fail158;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consAnnoList_2, new IStrategoTerm[]{s_126, term}), checkListAnnos(termFactory, r_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}