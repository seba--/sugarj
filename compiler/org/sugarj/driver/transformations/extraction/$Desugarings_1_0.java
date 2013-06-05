package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Desugarings_1_0 extends Strategy 
{ 
  public static $Desugarings_1_0 instance = new $Desugarings_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Desugarings_1_0");
    Fail32:
    { 
      IStrategoTerm y_102 = null;
      IStrategoTerm x_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consDesugarings_1 != ((IStrategoAppl)term).getConstructor())
        break Fail32;
      x_102 = term.getSubterm(0);
      IStrategoList annos5 = term.getAnnotations();
      y_102 = annos5;
      term = y_15.invoke(context, x_102);
      if(term == null)
        break Fail32;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consDesugarings_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}