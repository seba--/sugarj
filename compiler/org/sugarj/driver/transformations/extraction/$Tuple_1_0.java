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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Tuple_1_0");
    Fail151:
    { 
      IStrategoTerm l_127 = null;
      IStrategoTerm k_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consTuple_1 != ((IStrategoAppl)term).getConstructor())
        break Fail151;
      k_127 = term.getSubterm(0);
      IStrategoList annos124 = term.getAnnotations();
      l_127 = annos124;
      term = q_24.invoke(context, k_127);
      if(term == null)
        break Fail151;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consTuple_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}