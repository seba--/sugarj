package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Not_1_0 extends Strategy 
{ 
  public static $Not_1_0 instance = new $Not_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Not_1_0");
    Fail140:
    { 
      IStrategoTerm z_125 = null;
      IStrategoTerm y_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNot_1 != ((IStrategoAppl)term).getConstructor())
        break Fail140;
      y_125 = term.getSubterm(0);
      IStrategoList annos120 = term.getAnnotations();
      z_125 = annos120;
      term = l_24.invoke(context, y_125);
      if(term == null)
        break Fail140;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNot_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}