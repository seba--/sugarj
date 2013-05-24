package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Rule_1_0 extends Strategy 
{ 
  public static $S$Rule_1_0 instance = new $S$Rule_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_344)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SRule_1_0");
    Fail917:
    { 
      IStrategoTerm l_450 = null;
      IStrategoTerm k_450 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSRule_1 != ((IStrategoAppl)term).getConstructor())
        break Fail917;
      k_450 = term.getSubterm(0);
      IStrategoList annos162 = term.getAnnotations();
      l_450 = annos162;
      term = a_344.invoke(context, k_450);
      if(term == null)
        break Fail917;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSRule_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_450));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}