package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Real_1_0 extends Strategy 
{ 
  public static $Real_1_0 instance = new $Real_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Real_1_0");
    Fail171:
    { 
      IStrategoTerm w_128 = null;
      IStrategoTerm v_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consReal_1 != ((IStrategoAppl)term).getConstructor())
        break Fail171;
      v_128 = term.getSubterm(0);
      IStrategoList annos140 = term.getAnnotations();
      w_128 = annos140;
      term = b_25.invoke(context, v_128);
      if(term == null)
        break Fail171;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consReal_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}