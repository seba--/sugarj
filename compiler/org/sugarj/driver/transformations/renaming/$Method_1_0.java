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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Method_1_0");
    Fail23:
    { 
      IStrategoTerm b_101 = null;
      IStrategoTerm a_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMethod_1 != ((IStrategoAppl)term).getConstructor())
        break Fail23;
      a_101 = term.getSubterm(0);
      IStrategoList annos14 = term.getAnnotations();
      b_101 = annos14;
      term = u_14.invoke(context, a_101);
      if(term == null)
        break Fail23;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMethod_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}