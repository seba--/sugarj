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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Throw_1_0");
    Fail78:
    { 
      IStrategoTerm r_113 = null;
      IStrategoTerm q_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consThrow_1 != ((IStrategoAppl)term).getConstructor())
        break Fail78;
      q_113 = term.getSubterm(0);
      IStrategoList annos63 = term.getAnnotations();
      r_113 = annos63;
      term = x_19.invoke(context, q_113);
      if(term == null)
        break Fail78;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consThrow_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}