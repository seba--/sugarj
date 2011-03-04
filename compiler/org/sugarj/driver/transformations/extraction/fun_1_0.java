package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class fun_1_0 extends Strategy 
{ 
  public static fun_1_0 instance = new fun_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fun_1_0");
    Fail264:
    { 
      IStrategoTerm y_148 = null;
      IStrategoTerm x_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consfun_1 != ((IStrategoAppl)term).getConstructor())
        break Fail264;
      x_148 = term.getSubterm(0);
      IStrategoList annos218 = term.getAnnotations();
      y_148 = annos218;
      term = r_29.invoke(context, x_148);
      if(term == null)
        break Fail264;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consfun_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}