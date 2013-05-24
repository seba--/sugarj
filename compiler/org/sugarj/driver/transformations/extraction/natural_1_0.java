package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class natural_1_0 extends Strategy 
{ 
  public static natural_1_0 instance = new natural_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_351)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("natural_1_0");
    Fail1066:
    { 
      IStrategoTerm e_471 = null;
      IStrategoTerm d_471 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consnatural_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1066;
      d_471 = term.getSubterm(0);
      IStrategoList annos291 = term.getAnnotations();
      e_471 = annos291;
      term = x_351.invoke(context, d_471);
      if(term == null)
        break Fail1066;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consnatural_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_471));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}