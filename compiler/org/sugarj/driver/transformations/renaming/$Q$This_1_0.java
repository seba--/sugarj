package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Q$This_1_0 extends Strategy 
{ 
  public static $Q$This_1_0 instance = new $Q$This_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QThis_1_0");
    Fail151:
    { 
      IStrategoTerm b_128 = null;
      IStrategoTerm a_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consQThis_1 != ((IStrategoAppl)term).getConstructor())
        break Fail151;
      a_128 = term.getSubterm(0);
      IStrategoList annos131 = term.getAnnotations();
      b_128 = annos131;
      term = f_25.invoke(context, a_128);
      if(term == null)
        break Fail151;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consQThis_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}