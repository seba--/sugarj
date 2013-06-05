package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $No$Anno$List_1_0 extends Strategy 
{ 
  public static $No$Anno$List_1_0 instance = new $No$Anno$List_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NoAnnoList_1_0");
    Fail157:
    { 
      IStrategoTerm n_126 = null;
      IStrategoTerm m_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consNoAnnoList_1 != ((IStrategoAppl)term).getConstructor())
        break Fail157;
      m_126 = term.getSubterm(0);
      IStrategoList annos126 = term.getAnnotations();
      n_126 = annos126;
      term = g_24.invoke(context, m_126);
      if(term == null)
        break Fail157;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consNoAnnoList_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}