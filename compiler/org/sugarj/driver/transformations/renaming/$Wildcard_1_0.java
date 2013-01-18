package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Wildcard_1_0 extends Strategy 
{ 
  public static $Wildcard_1_0 instance = new $Wildcard_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Wildcard_1_0");
    Fail201:
    { 
      IStrategoTerm j_170 = null;
      IStrategoTerm i_170 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consWildcard_1 != ((IStrategoAppl)term).getConstructor())
        break Fail201;
      i_170 = term.getSubterm(0);
      IStrategoList annos170 = term.getAnnotations();
      j_170 = annos170;
      term = j_39.invoke(context, i_170);
      if(term == null)
        break Fail201;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consWildcard_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_170));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}