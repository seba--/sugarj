package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Placeholder_1_0 extends Strategy 
{ 
  public static $Placeholder_1_0 instance = new $Placeholder_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_335)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Placeholder_1_0");
    Fail776:
    { 
      IStrategoTerm b_430 = null;
      IStrategoTerm a_430 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consPlaceholder_1 != ((IStrategoAppl)term).getConstructor())
        break Fail776;
      a_430 = term.getSubterm(0);
      IStrategoList annos42 = term.getAnnotations();
      b_430 = annos42;
      term = z_335.invoke(context, a_430);
      if(term == null)
        break Fail776;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consPlaceholder_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_430));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}