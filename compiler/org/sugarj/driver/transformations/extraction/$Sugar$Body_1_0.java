package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sugar$Body_1_0 extends Strategy 
{ 
  public static $Sugar$Body_1_0 instance = new $Sugar$Body_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SugarBody_1_0");
    Fail271:
    { 
      IStrategoTerm a_150 = null;
      IStrategoTerm z_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSugarBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail271;
      z_149 = term.getSubterm(0);
      IStrategoList annos226 = term.getAnnotations();
      a_150 = annos226;
      term = b_30.invoke(context, z_149);
      if(term == null)
        break Fail271;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSugarBody_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}