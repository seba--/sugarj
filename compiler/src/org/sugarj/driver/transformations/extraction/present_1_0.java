package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class present_1_0 extends Strategy 
{ 
  public static present_1_0 instance = new present_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("present_1_0");
    Fail190:
    { 
      IStrategoTerm j_133 = null;
      IStrategoTerm f_133 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conspresent_1 != ((IStrategoAppl)term).getConstructor())
        break Fail190;
      f_133 = term.getSubterm(0);
      IStrategoList annos159 = term.getAnnotations();
      j_133 = annos159;
      term = b_26.invoke(context, f_133);
      if(term == null)
        break Fail190;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conspresent_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_133));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}