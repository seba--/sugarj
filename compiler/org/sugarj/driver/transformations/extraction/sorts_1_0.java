package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class sorts_1_0 extends Strategy 
{ 
  public static sorts_1_0 instance = new sorts_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("sorts_1_0");
    Fail262:
    { 
      IStrategoTerm c_147 = null;
      IStrategoTerm b_147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conssorts_1 != ((IStrategoAppl)term).getConstructor())
        break Fail262;
      b_147 = term.getSubterm(0);
      IStrategoList annos214 = term.getAnnotations();
      c_147 = annos214;
      term = b_29.invoke(context, b_147);
      if(term == null)
        break Fail262;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conssorts_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_147));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}