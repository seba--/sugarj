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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("kernel_start_symbols_1_0");
    Fail261:
    { 
      IStrategoTerm u_146 = null;
      IStrategoTerm t_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conskernel_start_symbols_1 != ((IStrategoAppl)term).getConstructor())
        break Fail261;
      t_146 = term.getSubterm(0);
      IStrategoList annos213 = term.getAnnotations();
      u_146 = annos213;
      term = a_29.invoke(context, t_146);
      if(term == null)
        break Fail261;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conskernel_start_symbols_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}