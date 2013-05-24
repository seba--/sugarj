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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_347)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("One_1_0");
    Fail980:
    { 
      IStrategoTerm l_460 = null;
      IStrategoTerm k_460 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consOne_1 != ((IStrategoAppl)term).getConstructor())
        break Fail980;
      k_460 = term.getSubterm(0);
      IStrategoList annos220 = term.getAnnotations();
      l_460 = annos220;
      term = x_347.invoke(context, k_460);
      if(term == null)
        break Fail980;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consOne_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_460));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}