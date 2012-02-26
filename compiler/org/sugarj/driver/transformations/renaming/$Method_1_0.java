package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method_1_0 extends Strategy 
{ 
  public static $Method_1_0 instance = new $Method_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Method_1_0");
    Fail26:
    { 
      IStrategoTerm t_101 = null;
      IStrategoTerm s_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMethod_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26;
      s_101 = term.getSubterm(0);
      IStrategoList annos14 = term.getAnnotations();
      t_101 = annos14;
      term = j_15.invoke(context, s_101);
      if(term == null)
        break Fail26;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMethod_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}