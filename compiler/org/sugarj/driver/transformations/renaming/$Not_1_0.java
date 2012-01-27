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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Not_1_0");
    Fail135:
    { 
      IStrategoTerm a_125 = null;
      IStrategoTerm x_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNot_1 != ((IStrategoAppl)term).getConstructor())
        break Fail135;
      x_124 = term.getSubterm(0);
      IStrategoList annos120 = term.getAnnotations();
      a_125 = annos120;
      term = o_23.invoke(context, x_124);
      if(term == null)
        break Fail135;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNot_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}