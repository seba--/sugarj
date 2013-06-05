package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $L$Rule_1_0 extends Strategy 
{ 
  public static $L$Rule_1_0 instance = new $L$Rule_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LRule_1_0");
    Fail99:
    { 
      IStrategoTerm y_116 = null;
      IStrategoTerm x_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consLRule_1 != ((IStrategoAppl)term).getConstructor())
        break Fail99;
      x_116 = term.getSubterm(0);
      IStrategoList annos72 = term.getAnnotations();
      y_116 = annos72;
      term = b_21.invoke(context, x_116);
      if(term == null)
        break Fail99;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consLRule_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}