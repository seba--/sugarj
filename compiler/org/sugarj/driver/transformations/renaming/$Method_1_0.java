package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method_1_0 extends Strategy 
{ 
  public static $Method_1_0 instance = new $Method_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Method_1_0");
    Fail28:
    { 
      IStrategoTerm b_102 = null;
      IStrategoTerm a_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMethod_1 != ((IStrategoAppl)term).getConstructor())
        break Fail28;
      a_102 = term.getSubterm(0);
      IStrategoList annos14 = term.getAnnotations();
      b_102 = annos14;
      term = r_15.invoke(context, a_102);
      if(term == null)
        break Fail28;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMethod_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}