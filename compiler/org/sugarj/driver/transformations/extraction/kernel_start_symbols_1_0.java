package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class kernel_start_symbols_1_0 extends Strategy 
{ 
  public static kernel_start_symbols_1_0 instance = new kernel_start_symbols_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("kernel_start_symbols_1_0");
    Fail250:
    { 
      IStrategoTerm r_146 = null;
      IStrategoTerm q_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conskernel_start_symbols_1 != ((IStrategoAppl)term).getConstructor())
        break Fail250;
      q_146 = term.getSubterm(0);
      IStrategoList annos205 = term.getAnnotations();
      r_146 = annos205;
      term = b_29.invoke(context, q_146);
      if(term == null)
        break Fail250;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conskernel_start_symbols_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}