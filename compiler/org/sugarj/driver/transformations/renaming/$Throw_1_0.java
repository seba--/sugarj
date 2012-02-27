package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Throw_1_0 extends Strategy 
{ 
  public static $Throw_1_0 instance = new $Throw_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Throw_1_0");
    Fail80:
    { 
      IStrategoTerm z_113 = null;
      IStrategoTerm y_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consThrow_1 != ((IStrategoAppl)term).getConstructor())
        break Fail80;
      y_113 = term.getSubterm(0);
      IStrategoList annos63 = term.getAnnotations();
      z_113 = annos63;
      term = f_20.invoke(context, y_113);
      if(term == null)
        break Fail80;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consThrow_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}