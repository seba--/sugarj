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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Case_1_0");
    Fail74:
    { 
      IStrategoTerm t_112 = null;
      IStrategoTerm s_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consCase_1 != ((IStrategoAppl)term).getConstructor())
        break Fail74;
      s_112 = term.getSubterm(0);
      IStrategoList annos57 = term.getAnnotations();
      t_112 = annos57;
      term = t_19.invoke(context, s_112);
      if(term == null)
        break Fail74;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consCase_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}