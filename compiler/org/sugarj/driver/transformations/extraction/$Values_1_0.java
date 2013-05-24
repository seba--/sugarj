package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Values_1_0 extends Strategy 
{ 
  public static $Values_1_0 instance = new $Values_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_337)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Values_1_0");
    Fail821:
    { 
      IStrategoTerm a_435 = null;
      IStrategoTerm z_434 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consValues_1 != ((IStrategoAppl)term).getConstructor())
        break Fail821;
      z_434 = term.getSubterm(0);
      IStrategoList annos69 = term.getAnnotations();
      a_435 = annos69;
      term = y_337.invoke(context, z_434);
      if(term == null)
        break Fail821;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consValues_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_435));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}