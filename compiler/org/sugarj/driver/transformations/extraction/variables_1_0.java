package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class variables_1_0 extends Strategy 
{ 
  public static variables_1_0 instance = new variables_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_334)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("variables_1_0");
    Fail742:
    { 
      IStrategoTerm l_425 = null;
      IStrategoTerm k_425 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consvariables_1 != ((IStrategoAppl)term).getConstructor())
        break Fail742;
      k_425 = term.getSubterm(0);
      IStrategoList annos14 = term.getAnnotations();
      l_425 = annos14;
      term = f_334.invoke(context, k_425);
      if(term == null)
        break Fail742;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consvariables_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_425));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}