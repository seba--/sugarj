package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Pure$Desugaring_1_0 extends Strategy 
{ 
  public static $Pure$Desugaring_1_0 instance = new $Pure$Desugaring_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PureDesugaring_1_0");
    Fail280:
    { 
      IStrategoTerm y_151 = null;
      IStrategoTerm x_151 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consPureDesugaring_1 != ((IStrategoAppl)term).getConstructor())
        break Fail280;
      x_151 = term.getSubterm(0);
      IStrategoList annos234 = term.getAnnotations();
      y_151 = annos234;
      term = s_30.invoke(context, x_151);
      if(term == null)
        break Fail280;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consPureDesugaring_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_151));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}