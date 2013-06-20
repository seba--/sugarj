package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class assoc_1_0 extends Strategy 
{ 
  public static assoc_1_0 instance = new assoc_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("assoc_1_0");
    Fail250:
    { 
      IStrategoTerm x_144 = null;
      IStrategoTerm w_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consassoc_1 != ((IStrategoAppl)term).getConstructor())
        break Fail250;
      w_144 = term.getSubterm(0);
      IStrategoList annos203 = term.getAnnotations();
      x_144 = annos203;
      term = r_28.invoke(context, w_144);
      if(term == null)
        break Fail250;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consassoc_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_144));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}