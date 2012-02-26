package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Case_1_0 extends Strategy 
{ 
  public static $Case_1_0 instance = new $Case_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Case_1_0");
    Fail72:
    { 
      IStrategoTerm l_112 = null;
      IStrategoTerm k_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consCase_1 != ((IStrategoAppl)term).getConstructor())
        break Fail72;
      k_112 = term.getSubterm(0);
      IStrategoList annos57 = term.getAnnotations();
      l_112 = annos57;
      term = l_19.invoke(context, k_112);
      if(term == null)
        break Fail72;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consCase_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}