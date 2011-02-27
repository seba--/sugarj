package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Native$Sugar$Body_1_0 extends Strategy 
{ 
  public static $Native$Sugar$Body_1_0 instance = new $Native$Sugar$Body_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NativeSugarBody_1_0");
    Fail270:
    { 
      IStrategoTerm x_149 = null;
      IStrategoTerm w_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consNativeSugarBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail270;
      w_149 = term.getSubterm(0);
      IStrategoList annos225 = term.getAnnotations();
      x_149 = annos225;
      term = a_30.invoke(context, w_149);
      if(term == null)
        break Fail270;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consNativeSugarBody_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}