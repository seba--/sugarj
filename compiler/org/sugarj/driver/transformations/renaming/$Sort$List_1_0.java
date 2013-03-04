package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_47)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortList_1_0");
    Fail357:
    { 
      IStrategoTerm s_195 = null;
      IStrategoTerm r_195 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSortList_1 != ((IStrategoAppl)term).getConstructor())
        break Fail357;
      r_195 = term.getSubterm(0);
      IStrategoList annos301 = term.getAnnotations();
      s_195 = annos301;
      term = z_47.invoke(context, r_195);
      if(term == null)
        break Fail357;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSortList_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_195));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}