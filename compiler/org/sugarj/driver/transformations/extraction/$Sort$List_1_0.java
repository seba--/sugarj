package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort$List_1_0 extends Strategy 
{ 
  public static $Sort$List_1_0 instance = new $Sort$List_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortList_1_0");
    Fail940:
    { 
      IStrategoTerm g_454 = null;
      IStrategoTerm f_454 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSortList_1 != ((IStrategoAppl)term).getConstructor())
        break Fail940;
      f_454 = term.getSubterm(0);
      IStrategoList annos185 = term.getAnnotations();
      g_454 = annos185;
      term = m_345.invoke(context, f_454);
      if(term == null)
        break Fail940;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSortList_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_454));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}