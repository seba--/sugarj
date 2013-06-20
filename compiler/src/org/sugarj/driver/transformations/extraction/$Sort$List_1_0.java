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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortList_1_0");
    Fail149:
    { 
      IStrategoTerm q_125 = null;
      IStrategoTerm p_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consSortList_1 != ((IStrategoAppl)term).getConstructor())
        break Fail149;
      p_125 = term.getSubterm(0);
      IStrategoList annos119 = term.getAnnotations();
      q_125 = annos119;
      term = y_23.invoke(context, p_125);
      if(term == null)
        break Fail149;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consSortList_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}