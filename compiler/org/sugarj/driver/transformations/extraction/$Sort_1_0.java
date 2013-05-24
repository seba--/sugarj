package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort_1_0 extends Strategy 
{ 
  public static $Sort_1_0 instance = new $Sort_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_338)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Sort_1_0");
    Fail841:
    { 
      IStrategoTerm l_437 = null;
      IStrategoTerm k_437 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSort_1 != ((IStrategoAppl)term).getConstructor())
        break Fail841;
      k_437 = term.getSubterm(0);
      IStrategoList annos88 = term.getAnnotations();
      l_437 = annos88;
      term = y_338.invoke(context, k_437);
      if(term == null)
        break Fail841;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSort_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_437));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}