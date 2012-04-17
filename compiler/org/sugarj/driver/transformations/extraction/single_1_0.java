package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class single_1_0 extends Strategy 
{ 
  public static single_1_0 instance = new single_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("single_1_0");
    Fail166:
    { 
      IStrategoTerm x_129 = null;
      IStrategoTerm v_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conssingle_1 != ((IStrategoAppl)term).getConstructor())
        break Fail166;
      v_129 = term.getSubterm(0);
      IStrategoList annos138 = term.getAnnotations();
      x_129 = annos138;
      term = k_25.invoke(context, v_129);
      if(term == null)
        break Fail166;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conssingle_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}