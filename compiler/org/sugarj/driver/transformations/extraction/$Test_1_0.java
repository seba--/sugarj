package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Test_1_0 extends Strategy 
{ 
  public static $Test_1_0 instance = new $Test_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Test_1_0");
    Fail103:
    { 
      IStrategoTerm x_118 = null;
      IStrategoTerm w_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consTest_1 != ((IStrategoAppl)term).getConstructor())
        break Fail103;
      w_118 = term.getSubterm(0);
      IStrategoList annos78 = term.getAnnotations();
      x_118 = annos78;
      term = w_21.invoke(context, w_118);
      if(term == null)
        break Fail103;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consTest_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}