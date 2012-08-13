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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Not_1_0");
    Fail186:
    { 
      IStrategoTerm l_143 = null;
      IStrategoTerm k_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNot_1 != ((IStrategoAppl)term).getConstructor())
        break Fail186;
      k_143 = term.getSubterm(0);
      IStrategoList annos161 = term.getAnnotations();
      l_143 = annos161;
      term = o_29.invoke(context, k_143);
      if(term == null)
        break Fail186;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNot_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}