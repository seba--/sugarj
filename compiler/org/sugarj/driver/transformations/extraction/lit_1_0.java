package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lit_1_0 extends Strategy 
{ 
  public static lit_1_0 instance = new lit_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_348)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lit_1_0");
    Fail1000:
    { 
      IStrategoTerm w_462 = null;
      IStrategoTerm v_462 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conslit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1000;
      v_462 = term.getSubterm(0);
      IStrategoList annos237 = term.getAnnotations();
      w_462 = annos237;
      term = u_348.invoke(context, v_462);
      if(term == null)
        break Fail1000;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conslit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_462));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}