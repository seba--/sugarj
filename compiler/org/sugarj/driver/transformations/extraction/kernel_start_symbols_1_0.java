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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_349)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("kernel_start_symbols_1_0");
    Fail1003:
    { 
      IStrategoTerm l_463 = null;
      IStrategoTerm k_463 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conskernel_start_symbols_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1003;
      k_463 = term.getSubterm(0);
      IStrategoList annos240 = term.getAnnotations();
      l_463 = annos240;
      term = a_349.invoke(context, k_463);
      if(term == null)
        break Fail1003;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conskernel_start_symbols_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_463));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}