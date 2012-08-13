package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class priorities_1_0 extends Strategy 
{ 
  public static priorities_1_0 instance = new priorities_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("priorities_1_0");
    Fail39:
    { 
      IStrategoTerm b_108 = null;
      IStrategoTerm a_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._conspriorities_1 != ((IStrategoAppl)term).getConstructor())
        break Fail39;
      a_108 = term.getSubterm(0);
      IStrategoList annos21 = term.getAnnotations();
      b_108 = annos21;
      term = r_18.invoke(context, a_108);
      if(term == null)
        break Fail39;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._conspriorities_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}