package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class priorities_1_0 extends Strategy 
{ 
  public static priorities_1_0 instance = new priorities_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_334)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("priorities_1_0");
    Fail744:
    { 
      IStrategoTerm r_425 = null;
      IStrategoTerm q_425 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conspriorities_1 != ((IStrategoAppl)term).getConstructor())
        break Fail744;
      q_425 = term.getSubterm(0);
      IStrategoList annos16 = term.getAnnotations();
      r_425 = annos16;
      term = h_334.invoke(context, q_425);
      if(term == null)
        break Fail744;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conspriorities_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_425));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}