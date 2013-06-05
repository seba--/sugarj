package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class hiddens_1_0 extends Strategy 
{ 
  public static hiddens_1_0 instance = new hiddens_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("hiddens_1_0");
    Fail216:
    { 
      IStrategoTerm y_137 = null;
      IStrategoTerm x_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conshiddens_1 != ((IStrategoAppl)term).getConstructor())
        break Fail216;
      x_137 = term.getSubterm(0);
      IStrategoList annos176 = term.getAnnotations();
      y_137 = annos176;
      term = z_26.invoke(context, x_137);
      if(term == null)
        break Fail216;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conshiddens_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}