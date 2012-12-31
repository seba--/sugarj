package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Real_1_0 extends Strategy 
{ 
  public static $Real_1_0 instance = new $Real_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_49)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Real_1_0");
    Fail378:
    { 
      IStrategoTerm x_198 = null;
      IStrategoTerm w_198 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consReal_1 != ((IStrategoAppl)term).getConstructor())
        break Fail378;
      w_198 = term.getSubterm(0);
      IStrategoList annos321 = term.getAnnotations();
      x_198 = annos321;
      term = b_49.invoke(context, w_198);
      if(term == null)
        break Fail378;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consReal_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_198));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}