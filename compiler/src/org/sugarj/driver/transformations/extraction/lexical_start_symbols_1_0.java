package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lexical_start_symbols_1_0 extends Strategy 
{ 
  public static lexical_start_symbols_1_0 instance = new lexical_start_symbols_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_start_symbols_1_0");
    Fail261:
    { 
      IStrategoTerm b_147 = null;
      IStrategoTerm x_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conslexical_start_symbols_1 != ((IStrategoAppl)term).getConstructor())
        break Fail261;
      x_146 = term.getSubterm(0);
      IStrategoList annos213 = term.getAnnotations();
      b_147 = annos213;
      term = b_29.invoke(context, x_146);
      if(term == null)
        break Fail261;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conslexical_start_symbols_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_147));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}