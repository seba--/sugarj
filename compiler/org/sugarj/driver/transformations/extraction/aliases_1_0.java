package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class aliases_1_0 extends Strategy 
{ 
  public static aliases_1_0 instance = new aliases_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_334)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aliases_1_0");
    Fail750:
    { 
      IStrategoTerm j_426 = null;
      IStrategoTerm i_426 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consaliases_1 != ((IStrategoAppl)term).getConstructor())
        break Fail750;
      i_426 = term.getSubterm(0);
      IStrategoList annos22 = term.getAnnotations();
      j_426 = annos22;
      term = n_334.invoke(context, i_426);
      if(term == null)
        break Fail750;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consaliases_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_426));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}