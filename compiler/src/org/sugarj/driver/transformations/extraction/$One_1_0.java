package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $One_1_0 extends Strategy 
{ 
  public static $One_1_0 instance = new $One_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("One_1_0");
    Fail114:
    { 
      IStrategoTerm x_120 = null;
      IStrategoTerm v_120 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consOne_1 != ((IStrategoAppl)term).getConstructor())
        break Fail114;
      v_120 = term.getSubterm(0);
      IStrategoList annos89 = term.getAnnotations();
      x_120 = annos89;
      term = l_22.invoke(context, v_120);
      if(term == null)
        break Fail114;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consOne_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_120));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}