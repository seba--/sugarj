package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Tuple_1_0 extends Strategy 
{ 
  public static $Tuple_1_0 instance = new $Tuple_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Tuple_1_0");
    Fail935:
    { 
      IStrategoTerm l_453 = null;
      IStrategoTerm k_453 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consTuple_1 != ((IStrategoAppl)term).getConstructor())
        break Fail935;
      k_453 = term.getSubterm(0);
      IStrategoList annos180 = term.getAnnotations();
      l_453 = annos180;
      term = e_345.invoke(context, k_453);
      if(term == null)
        break Fail935;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consTuple_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_453));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}