package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Continue_1_0 extends Strategy 
{ 
  public static $Continue_1_0 instance = new $Continue_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Continue_1_0");
    Fail80:
    { 
      IStrategoTerm x_113 = null;
      IStrategoTerm w_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consContinue_1 != ((IStrategoAppl)term).getConstructor())
        break Fail80;
      w_113 = term.getSubterm(0);
      IStrategoList annos65 = term.getAnnotations();
      x_113 = annos65;
      term = z_19.invoke(context, w_113);
      if(term == null)
        break Fail80;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consContinue_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}