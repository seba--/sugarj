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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Not_1_0");
    Fail138:
    { 
      IStrategoTerm r_125 = null;
      IStrategoTerm q_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNot_1 != ((IStrategoAppl)term).getConstructor())
        break Fail138;
      q_125 = term.getSubterm(0);
      IStrategoList annos120 = term.getAnnotations();
      r_125 = annos120;
      term = d_24.invoke(context, q_125);
      if(term == null)
        break Fail138;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNot_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}