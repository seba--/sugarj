package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sorts_1_0 extends Strategy 
{ 
  public static $Sorts_1_0 instance = new $Sorts_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Sorts_1_0");
    Fail153:
    { 
      IStrategoTerm c_126 = null;
      IStrategoTerm b_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consSorts_1 != ((IStrategoAppl)term).getConstructor())
        break Fail153;
      b_126 = term.getSubterm(0);
      IStrategoList annos123 = term.getAnnotations();
      c_126 = annos123;
      term = c_24.invoke(context, b_126);
      if(term == null)
        break Fail153;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consSorts_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}