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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("kernel_start_symbols_1_0");
    Fail262:
    { 
      IStrategoTerm e_147 = null;
      IStrategoTerm d_147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conskernel_start_symbols_1 != ((IStrategoAppl)term).getConstructor())
        break Fail262;
      d_147 = term.getSubterm(0);
      IStrategoList annos214 = term.getAnnotations();
      e_147 = annos214;
      term = c_29.invoke(context, d_147);
      if(term == null)
        break Fail262;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conskernel_start_symbols_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_147));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}