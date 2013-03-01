package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_48)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Tuple_1_0");
    Fail372:
    { 
      IStrategoTerm x_197 = null;
      IStrategoTerm w_197 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTuple_1 != ((IStrategoAppl)term).getConstructor())
        break Fail372;
      w_197 = term.getSubterm(0);
      IStrategoList annos315 = term.getAnnotations();
      x_197 = annos315;
      term = s_48.invoke(context, w_197);
      if(term == null)
        break Fail372;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTuple_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_197));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}